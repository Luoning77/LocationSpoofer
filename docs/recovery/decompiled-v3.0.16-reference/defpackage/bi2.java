package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bi2 {
    public boolean a;
    public boolean b;
    public final p90 c;
    public final li2 d;
    public final List e;
    public final p40 f;
    public final t23 g;
    public s23 h;

    public bi2(p90 p90Var, li2 li2Var, t5 t5Var) {
        int i;
        p40 s40Var;
        ei2 ei2Var = p90Var.g;
        c30 c30Var = p90Var.c;
        al2 al2Var = p90Var.t;
        String str = p90Var.b;
        this.c = p90Var;
        this.d = li2Var;
        List list = p90Var.e;
        this.e = list == null ? uj0.e : list;
        wt0 wt0Var = null;
        if (al2Var != null) {
            this.g = null;
            if (al2Var.k()) {
                s40Var = new f62(new d31(this, al2Var), str == null ? ":memory:" : str, t5Var);
            } else if (str == null) {
                s40Var = new s40(new d31(this, al2Var));
            } else {
                d31 d31Var = new d31(this, al2Var);
                int iOrdinal = ei2Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        fo.m(ei2Var, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = ei2Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    fo.m(ei2Var, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                s40Var = new s40(d31Var, str, i);
            }
            this.f = s40Var;
        } else {
            if (c30Var == null) {
                fo.i("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            wt0Var = new wt0(p90Var.a, str, new x8(this, li2Var.getVersion()));
            this.g = wt0Var;
            this.f = new f62(new us1(wt0Var), str == null ? ":memory:" : str, t5Var);
        }
        boolean z = ei2Var == ei2.f;
        if (wt0Var != null) {
            wt0Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(zk2 zk2Var) throws Exception {
        bl2 bl2VarA0 = zk2Var.a0("PRAGMA busy_timeout");
        try {
            bl2VarA0.R();
            long j = bl2VarA0.getLong(0);
            am1.j(bl2VarA0, null);
            if (j < 3000) {
                mh0.D("PRAGMA busy_timeout = 3000", zk2Var);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final void b(zk2 zk2Var) throws Exception {
        Object wg2Var;
        a(zk2Var);
        p90 p90Var = this.c;
        ei2 ei2Var = p90Var.g;
        ei2 ei2Var2 = ei2.f;
        if (ei2Var == ei2Var2) {
            mh0.D("PRAGMA journal_mode = WAL", zk2Var);
        } else {
            mh0.D("PRAGMA journal_mode = TRUNCATE", zk2Var);
        }
        if (p90Var.g == ei2Var2) {
            mh0.D("PRAGMA synchronous = NORMAL", zk2Var);
        } else {
            mh0.D("PRAGMA synchronous = FULL", zk2Var);
        }
        bl2 bl2VarA0 = zk2Var.a0("PRAGMA user_version");
        try {
            bl2VarA0.R();
            int i = (int) bl2VarA0.getLong(0);
            am1.j(bl2VarA0, null);
            li2 li2Var = this.d;
            if (i != li2Var.getVersion()) {
                mh0.D("BEGIN EXCLUSIVE TRANSACTION", zk2Var);
                try {
                    if (i == 0) {
                        c(zk2Var);
                    } else {
                        d(zk2Var, i, li2Var.getVersion());
                    }
                    mh0.D("PRAGMA user_version = " + li2Var.getVersion(), zk2Var);
                    wg2Var = mf3.a;
                } catch (Throwable th) {
                    wg2Var = new wg2(th);
                }
                if (!(wg2Var instanceof wg2)) {
                    mh0.D("END TRANSACTION", zk2Var);
                }
                Throwable thA = xg2.a(wg2Var);
                if (thA != null) {
                    mh0.D("ROLLBACK TRANSACTION", zk2Var);
                    throw thA;
                }
            }
            e(zk2Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                am1.j(bl2VarA0, th2);
                throw th3;
            }
        }
    }

    public final void c(zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (bl2VarA0.R() && bl2VarA0.getLong(0) == 0) {
                z = true;
            }
            am1.j(bl2VarA0, null);
            li2 li2Var = this.d;
            li2Var.createAllTables(zk2Var);
            if (!z) {
                ki2 ki2VarOnValidateSchema = li2Var.onValidateSchema(zk2Var);
                if (!ki2VarOnValidateSchema.a) {
                    b81.v(ki2VarOnValidateSchema.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            f(zk2Var);
            li2Var.onCreate(zk2Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((ai2) it.next()).getClass();
                if (zk2Var instanceof r23) {
                    ((r23) zk2Var).e.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[LOOP:4: B:9:0x001b->B:130:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public final void d(zk2 zk2Var, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        i52 i52Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        zk2Var.getClass();
        p90 p90Var = this.c;
        nk1 nk1Var = p90Var.d;
        if (i == i2) {
            iterable = uj0.e;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        linkedHashMap = nk1Var.a;
                        if (z2) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                i52Var = null;
                            } else {
                                i52Var = new i52(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                i52Var = null;
                            } else {
                                i52Var = new i52(treeMap, treeMap.keySet());
                            }
                        }
                        if (i52Var == null) {
                            Map map = (Map) i52Var.e;
                            it = ((Iterable) i52Var.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = nk1Var.a;
                    if (z2) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            i52Var = null;
                        } else {
                            i52Var = new i52(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            i52Var = null;
                        } else {
                            i52Var = new i52(treeMap, treeMap.keySet());
                        }
                    }
                    if (i52Var == null) {
                        Map map2 = (Map) i52Var.e;
                        it = ((Iterable) i52Var.f).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        li2 li2Var = this.d;
        if (iterable != null) {
            li2Var.onPreMigrate(zk2Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((xt1) it2.next()).migrate(zk2Var);
            }
            ki2 ki2VarOnValidateSchema = li2Var.onValidateSchema(zk2Var);
            if (!ki2VarOnValidateSchema.a) {
                b81.v(ki2VarOnValidateSchema.b, "Migration didn't properly handle: ");
                return;
            } else {
                li2Var.onPostMigrate(zk2Var);
                f(zk2Var);
                return;
            }
        }
        if (i <= i2 || !p90Var.l) {
            Set set = p90Var.m;
            if (p90Var.k && (set == null || !set.contains(Integer.valueOf(i)))) {
                throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        if (p90Var.s) {
            bl2 bl2VarA0 = zk2Var.a0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                mg1 mg1VarN = am1.n();
                while (bl2VarA0.R()) {
                    String strM = bl2VarA0.m(0);
                    if (!s13.Z(strM, "sqlite_", false) && !strM.equals("android_metadata")) {
                        mg1VarN.add(new i52(strM, Boolean.valueOf(o51.f(bl2VarA0.m(1), "view"))));
                    }
                }
                mg1 mg1VarF = am1.f(mg1VarN);
                am1.j(bl2VarA0, null);
                ListIterator listIterator = mg1VarF.listIterator(0);
                while (true) {
                    xx0 xx0Var = (xx0) listIterator;
                    if (!xx0Var.hasNext()) {
                        break;
                    }
                    i52 i52Var2 = (i52) xx0Var.next();
                    String str = (String) i52Var2.e;
                    if (((Boolean) i52Var2.f).booleanValue()) {
                        mh0.D("DROP VIEW IF EXISTS `" + str + '`', zk2Var);
                    } else {
                        mh0.D("DROP TABLE IF EXISTS `" + str + '`', zk2Var);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    am1.j(bl2VarA0, th);
                    throw th2;
                }
            }
        } else {
            li2Var.dropAllTables(zk2Var);
        }
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            ((ai2) it3.next()).getClass();
            if (zk2Var instanceof r23) {
                ((r23) zk2Var).e.getClass();
            }
        }
        li2Var.createAllTables(zk2Var);
    }

    public final void e(zk2 zk2Var) throws Exception {
        Object wg2Var;
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = bl2VarA0.R() && bl2VarA0.getLong(0) != 0;
            am1.j(bl2VarA0, null);
            li2 li2Var = this.d;
            if (z) {
                bl2 bl2VarA1 = zk2Var.a0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strM = bl2VarA1.R() ? bl2VarA1.m(0) : null;
                    am1.j(bl2VarA1, null);
                    if (!o51.f(li2Var.getIdentityHash(), strM) && !o51.f(li2Var.getLegacyIdentityHash(), strM)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + li2Var.getIdentityHash() + ", found: " + strM).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        am1.j(bl2VarA1, th);
                        throw th2;
                    }
                }
            } else {
                mh0.D("BEGIN EXCLUSIVE TRANSACTION", zk2Var);
                try {
                    ki2 ki2VarOnValidateSchema = li2Var.onValidateSchema(zk2Var);
                    if (!ki2VarOnValidateSchema.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ki2VarOnValidateSchema.b).toString());
                    }
                    li2Var.onPostMigrate(zk2Var);
                    f(zk2Var);
                    wg2Var = mf3.a;
                    if (!(wg2Var instanceof wg2)) {
                        mh0.D("END TRANSACTION", zk2Var);
                    }
                    Throwable thA = xg2.a(wg2Var);
                    if (thA != null) {
                        mh0.D("ROLLBACK TRANSACTION", zk2Var);
                        throw thA;
                    }
                } catch (Throwable th3) {
                    wg2Var = new wg2(th3);
                }
            }
            li2Var.onOpen(zk2Var);
            for (ai2 ai2Var : this.e) {
                ai2Var.getClass();
                if (zk2Var instanceof r23) {
                    s23 s23Var = ((r23) zk2Var).e;
                    s23Var.getClass();
                    ai2Var.a.invoke(s23Var);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                am1.j(bl2VarA0, th4);
                throw th5;
            }
        }
    }

    public final void f(zk2 zk2Var) throws Exception {
        mh0.D("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", zk2Var);
        String identityHash = this.d.getIdentityHash();
        identityHash.getClass();
        mh0.D("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + identityHash + "')", zk2Var);
    }

    public bi2(p90 p90Var, ge2 ge2Var, t5 t5Var) {
        ei2 ei2Var = p90Var.g;
        this.c = p90Var;
        this.d = new zh2(-1, "", "");
        List list = p90Var.e;
        uj0 uj0Var = uj0.e;
        this.e = list == null ? uj0Var : list;
        ArrayList arrayListW0 = zy.w0(list == null ? uj0Var : list, new ai2(new ge2(this, 3)));
        Context context = p90Var.a;
        String str = p90Var.b;
        c30 c30Var = p90Var.c;
        nk1 nk1Var = p90Var.d;
        boolean z = p90Var.f;
        Executor executor = p90Var.h;
        Executor executor2 = p90Var.i;
        Intent intent = p90Var.j;
        boolean z2 = p90Var.k;
        boolean z3 = p90Var.l;
        Set set = p90Var.m;
        String str2 = p90Var.n;
        File file = p90Var.o;
        Callable callable = p90Var.p;
        List list2 = p90Var.q;
        List list3 = p90Var.r;
        boolean z4 = p90Var.s;
        al2 al2Var = p90Var.t;
        y70 y70Var = p90Var.u;
        executor.getClass();
        executor2.getClass();
        t23 t23Var = (t23) ge2Var.invoke(new p90(context, str, c30Var, nk1Var, arrayListW0, z, ei2Var, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, al2Var, y70Var));
        this.g = t23Var;
        us1 us1Var = new us1(t23Var);
        String str3 = p90Var.b;
        this.f = new f62(us1Var, str3 == null ? ":memory:" : str3, t5Var);
        boolean z5 = ei2Var == ei2.f;
        if (t23Var != null) {
            t23Var.setWriteAheadLoggingEnabled(z5);
        }
    }
}
