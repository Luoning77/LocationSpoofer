package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vt0 extends SQLiteOpenHelper {
    public static final /* synthetic */ int k = 0;
    public final Context e;
    public final t1 f;
    public final x8 g;
    public boolean h;
    public final hc2 i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(Context context, String str, final t1 t1Var, final x8 x8Var) {
        String string;
        super(context, str, null, x8Var.b, new DatabaseErrorHandler() { // from class: st0
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = vt0.k;
                sQLiteDatabase.getClass();
                t1 t1Var2 = t1Var;
                rt0 rt0Var = (rt0) t1Var2.f;
                if (rt0Var == null || !rt0Var.e.equals(sQLiteDatabase)) {
                    rt0Var = new rt0(sQLiteDatabase);
                    t1Var2.f = rt0Var;
                }
                SQLiteDatabase sQLiteDatabase2 = rt0Var.e;
                x8Var.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + rt0Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        x8.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                x8.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                x8.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    rt0Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        x8Var.getClass();
        this.e = context;
        this.f = t1Var;
        this.g = x8Var;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.i = new hc2(string, context.getCacheDir(), false);
    }

    public final s23 A(boolean z) {
        hc2 hc2Var = this.i;
        try {
            hc2Var.a((this.j || getDatabaseName() == null) ? false : true);
            this.h = false;
            SQLiteDatabase sQLiteDatabaseO = O(z);
            if (!this.h) {
                return F(sQLiteDatabaseO);
            }
            close();
            return A(z);
        } finally {
            hc2Var.b();
        }
    }

    public final rt0 F(SQLiteDatabase sQLiteDatabase) {
        t1 t1Var = this.f;
        rt0 rt0Var = (rt0) t1Var.f;
        if (rt0Var != null && rt0Var.e.equals(sQLiteDatabase)) {
            return rt0Var;
        }
        rt0 rt0Var2 = new rt0(sQLiteDatabase);
        t1Var.f = rt0Var2;
        return rt0Var2;
    }

    public final SQLiteDatabase O(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.j;
        if (databaseName != null && !z2 && (parentFile = this.e.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof tt0) {
                    tt0 tt0Var = (tt0) th;
                    int iOrdinal = tt0Var.e.ordinal();
                    th = tt0Var.f;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        b81.d();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        hc2 hc2Var = this.i;
        try {
            hc2Var.a(hc2Var.a);
            super.close();
            this.f.f = null;
            this.j = false;
        } finally {
            hc2Var.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.h;
        x8 x8Var = this.g;
        if (!z && x8Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            F(sQLiteDatabase);
            x8Var.getClass();
        } catch (Throwable th) {
            throw new tt0(ut0.e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((bi2) this.g.c).c(new r23(F(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new tt0(ut0.f, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.h = true;
        try {
            this.g.h(F(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new tt0(ut0.h, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.h) {
            try {
                x8 x8Var = this.g;
                rt0 rt0VarF = F(sQLiteDatabase);
                bi2 bi2Var = (bi2) x8Var.c;
                bi2Var.e(new r23(rt0VarF));
                bi2Var.h = rt0VarF;
            } catch (Throwable th) {
                throw new tt0(ut0.i, th);
            }
        }
        this.j = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.h = true;
        try {
            this.g.h(F(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new tt0(ut0.g, th);
        }
    }
}
