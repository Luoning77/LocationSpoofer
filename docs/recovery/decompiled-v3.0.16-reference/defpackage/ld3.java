package defpackage;

import com.vincenthzr.locationspoofer.data.db.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ld3 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final AppDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final l e;
    public final String[] g;
    public final x02 h;
    public final us1 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public au0 k = new qe0(1);
    public final LinkedHashMap f = new LinkedHashMap();

    public ld3(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, l lVar) {
        String lowerCase;
        this.a = appDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = lVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, jq1.L(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new x02(this.g.length);
        this.i = new us1(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(na2 na2Var, r60 r60Var) {
        dd3 dd3Var;
        if (r60Var instanceof dd3) {
            dd3Var = (dd3) r60Var;
            int i = dd3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dd3Var.h = i - Integer.MIN_VALUE;
            } else {
                dd3Var = new dd3(this, r60Var);
            }
        } else {
            dd3Var = new dd3(this, r60Var);
        }
        Object objD = dd3Var.f;
        int i2 = dd3Var.h;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(objD);
            i73 i73Var = new i73(10);
            dd3Var.e = na2Var;
            dd3Var.h = 1;
            objD = na2Var.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", i73Var, dd3Var);
            if (objD != z70Var) {
            }
            return z70Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) dd3Var.e;
            ee0.J(objD);
            return set;
        }
        na2Var = (na2) dd3Var.e;
        ee0.J(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            dd3Var.e = set2;
            dd3Var.h = 2;
            if (v63.a(na2Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", dd3Var) == z70Var) {
                return z70Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(r60 r60Var) throws Throwable {
        fd3 fd3Var;
        cy cyVar;
        Object value;
        int[] iArr;
        if (r60Var instanceof fd3) {
            fd3Var = (fd3) r60Var;
            int i = fd3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fd3Var.h = i - Integer.MIN_VALUE;
            } else {
                fd3Var = new fd3(this, r60Var);
            }
        } else {
            fd3Var = new fd3(this, r60Var);
        }
        Object objUseConnection = fd3Var.f;
        int i2 = fd3Var.h;
        q60 q60Var = null;
        int i3 = 1;
        if (i2 == 0) {
            ee0.J(objUseConnection);
            AppDatabase_Impl appDatabase_Impl = this.a;
            cy closeBarrier$room_runtime = appDatabase_Impl.getCloseBarrier$room_runtime();
            boolean zA = closeBarrier$room_runtime.a();
            zj0 zj0Var = zj0.e;
            if (!zA) {
                return zj0Var;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    closeBarrier$room_runtime.b();
                    return zj0Var;
                }
                if (!((Boolean) this.k.invoke()).booleanValue()) {
                    closeBarrier$room_runtime.b();
                    return zj0Var;
                }
                gd3 gd3Var = new gd3(this, q60Var, i3);
                fd3Var.e = closeBarrier$room_runtime;
                fd3Var.h = 1;
                objUseConnection = appDatabase_Impl.useConnection(false, gd3Var, fd3Var);
                z70 z70Var = z70.e;
                if (objUseConnection == z70Var) {
                    return z70Var;
                }
                cyVar = closeBarrier$room_runtime;
            } catch (Throwable th) {
                th = th;
                cyVar = closeBarrier$room_runtime;
                cyVar.b();
                throw th;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cyVar = fd3Var.e;
            try {
                ee0.J(objUseConnection);
            } catch (Throwable th2) {
                th = th2;
                cyVar.b();
                throw th;
            }
        }
        Set set = (Set) objUseConnection;
        if (!set.isEmpty()) {
            us1 us1Var = this.i;
            set.getClass();
            if (!set.isEmpty()) {
                MutableStateFlow mutableStateFlow = (MutableStateFlow) us1Var.f;
                do {
                    value = mutableStateFlow.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                } while (!mutableStateFlow.compareAndSet(value, iArr));
            }
            this.e.invoke(set);
        }
        cyVar.b();
        return set;
    }

    public final void c(au0 au0Var, au0 au0Var2) {
        au0Var.getClass();
        au0Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            au0Var.invoke();
            BuildersKt__Builders_commonKt.launch$default(this.a.getCoroutineScope(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new wr1(this, au0Var2, null, 16), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (defpackage.v63.a(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (defpackage.v63.a(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00db -> B:28:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.xb3 r18, int r19, defpackage.r60 r20) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld3.d(xb3, int, r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:19:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.xb3 r8, int r9, defpackage.r60 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.id3
            if (r0 == 0) goto L13
            r0 = r10
            id3 r0 = (defpackage.id3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            id3 r0 = new id3
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.i
            int r8 = r0.h
            java.lang.String[] r9 = r0.g
            java.lang.String r1 = r0.f
            na2 r3 = r0.e
            defpackage.ee0.J(r10)
            r10 = r9
            r9 = r3
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            r7 = 0
            return r7
        L38:
            defpackage.ee0.J(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.ld3.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L83
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.p91.p(r4, r3, r5)
            r0.e = r9
            r0.f = r1
            r0.g = r10
            r0.h = r8
            r0.i = r7
            r0.l = r2
            java.lang.Object r3 = defpackage.v63.a(r9, r3, r0)
            z70 r4 = defpackage.z70.e
            if (r3 != r4) goto L81
            return r4
        L81:
            int r8 = r8 + r2
            goto L4a
        L83:
            mf3 r7 = defpackage.mf3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld3.e(xb3, int, r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(r60 r60Var) {
        jd3 jd3Var;
        cy cyVar;
        if (r60Var instanceof jd3) {
            jd3Var = (jd3) r60Var;
            int i = jd3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jd3Var.h = i - Integer.MIN_VALUE;
            } else {
                jd3Var = new jd3(this, r60Var);
            }
        } else {
            jd3Var = new jd3(this, r60Var);
        }
        Object obj = jd3Var.f;
        int i2 = jd3Var.h;
        if (i2 == 0) {
            ee0.J(obj);
            AppDatabase_Impl appDatabase_Impl = this.a;
            cy closeBarrier$room_runtime = appDatabase_Impl.getCloseBarrier$room_runtime();
            if (closeBarrier$room_runtime.a()) {
                try {
                    n63 n63Var = new n63(this, null);
                    jd3Var.e = closeBarrier$room_runtime;
                    jd3Var.h = 1;
                    Object objUseConnection = appDatabase_Impl.useConnection(false, n63Var, jd3Var);
                    z70 z70Var = z70.e;
                    if (objUseConnection == z70Var) {
                        return z70Var;
                    }
                    cyVar = closeBarrier$room_runtime;
                    cyVar.b();
                } catch (Throwable th) {
                    th = th;
                    cyVar = closeBarrier$room_runtime;
                    cyVar.b();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cyVar = jd3Var.e;
            try {
                ee0.J(obj);
                cyVar.b();
            } catch (Throwable th2) {
                th = th2;
                cyVar.b();
                throw th;
            }
        }
        return mf3.a;
    }

    public final i52 g(String[] strArr) {
        lt2 lt2Var = new lt2();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                lt2Var.addAll(set);
            } else {
                lt2Var.add(str);
            }
        }
        String[] strArr2 = (String[]) mc0.l(lt2Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                fo.i("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new i52(strArr2, iArr);
    }
}
