package defpackage;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class g53 {
    public static final rf0 a = new rf0(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.p33 r5, boolean r6, defpackage.q92 r7, defpackage.oq r8) {
        /*
            boolean r0 = r8 instanceof defpackage.w43
            if (r0 == 0) goto L13
            r0 = r8
            w43 r0 = (defpackage.w43) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            w43 r0 = new w43
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.g
            q92 r6 = r0.f
            p33 r7 = r0.e
            defpackage.ee0.J(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ee0.J(r8)
        L39:
            r0.e = r5
            r0.f = r7
            r0.g = r6
            r0.i = r2
            java.lang.Object r8 = r5.c(r7, r0)
            z70 r1 = defpackage.z70.e
            if (r8 != r1) goto L4a
            return r1
        L4a:
            p92 r8 = (defpackage.p92) r8
            r1 = 0
            boolean r3 = f(r8, r6, r1)
            if (r3 == 0) goto L39
            java.util.List r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g53.a(p33, boolean, q92, oq):java.lang.Object");
    }

    public static /* synthetic */ Object b(p33 p33Var, oq oqVar, int i) {
        return a(p33Var, (i & 1) != 0, q92.f, oqVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.p33 r5, defpackage.q92 r6, defpackage.oq r7) {
        /*
            boolean r0 = r7 instanceof defpackage.x43
            if (r0 == 0) goto L13
            r0 = r7
            x43 r0 = (defpackage.x43) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            x43 r0 = new x43
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            q92 r5 = r0.f
            p33 r6 = r0.e
            defpackage.ee0.J(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r5)
            r5 = 0
            return r5
        L33:
            defpackage.ee0.J(r7)
        L36:
            r0.e = r5
            r0.f = r6
            r0.h = r2
            java.lang.Object r7 = r5.c(r6, r0)
            z70 r1 = defpackage.z70.e
            if (r7 != r1) goto L45
            return r1
        L45:
            p92 r7 = (defpackage.p92) r7
            r1 = 0
            boolean r3 = f(r7, r1, r2)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g53.c(p33, q92, oq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.p33 r7, defpackage.r60 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.y43
            if (r0 == 0) goto L13
            r0 = r8
            y43 r0 = (defpackage.y43) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            y43 r0 = new y43
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p33 r7 = r0.e
            defpackage.ee0.J(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.ee0.J(r8)
        L31:
            r0.e = r7
            r0.g = r2
            q92 r8 = defpackage.q92.f
            java.lang.Object r8 = r7.c(r8, r0)
            z70 r1 = defpackage.z70.e
            if (r8 != r1) goto L40
            return r1
        L40:
            p92 r8 = (defpackage.p92) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            x92 r6 = (defpackage.x92) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            x92 r3 = (defpackage.x92) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            mf3 r7 = defpackage.mf3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g53.d(p33, r60):java.lang.Object");
    }

    public static Object e(ca2 ca2Var, cx2 cx2Var, lu0 lu0Var, q60 q60Var, int i) {
        Object obj = cx2Var;
        if ((i & 4) != 0) {
            obj = a;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ph(ca2Var, (Object) null, (Object) null, obj, lu0Var, (q60) null, 4), q60Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }

    public static final boolean f(p92 p92Var, boolean z, boolean z2) {
        if (z2) {
            List list = p92Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    if ((p92Var.d & 33) != 0) {
                        break;
                    }
                    return false;
                }
                if (((x92) list.get(i)).i != 2) {
                    break;
                }
                i++;
            }
        }
        List list2 = p92Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            x92 x92Var = (x92) list2.get(i2);
            if (!(z ? mh0.o(x92Var) : mh0.p(x92Var))) {
                return false;
            }
        }
        return true;
    }

    public static Job g(CoroutineScope coroutineScope, Job job, pu0 pu0Var) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new m(job, pu0Var, null, 29), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:103:0x0403  */
    /* JADX WARN: Code duplicated, block: B:105:0x040e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0413  */
    /* JADX WARN: Code duplicated, block: B:26:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x01be  */
    /* JADX WARN: Code duplicated, block: B:29:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x01de  */
    /* JADX WARN: Code duplicated, block: B:34:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0213  */
    /* JADX WARN: Code duplicated, block: B:40:0x022a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0252  */
    /* JADX WARN: Code duplicated, block: B:46:0x025e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0262  */
    /* JADX WARN: Code duplicated, block: B:49:0x0267  */
    /* JADX WARN: Code duplicated, block: B:51:0x026b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0274  */
    /* JADX WARN: Code duplicated, block: B:55:0x0284  */
    /* JADX WARN: Code duplicated, block: B:57:0x0298 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x029c  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x0315  */
    /* JADX WARN: Code duplicated, block: B:73:0x0331  */
    /* JADX WARN: Code duplicated, block: B:75:0x0336  */
    /* JADX WARN: Code duplicated, block: B:78:0x0353  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x035e  */
    /* JADX WARN: Code duplicated, block: B:83:0x037a  */
    /* JADX WARN: Code duplicated, block: B:86:0x038f  */
    /* JADX WARN: Code duplicated, block: B:89:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x03e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [q60] */
    /* JADX WARN: Type inference failed for: r6v21, types: [q60] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, lu0] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [q60] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r9v23, types: [x92] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v28 */
    public static final Object h(p33 p33Var, CoroutineScope coroutineScope, tb2 tb2Var, lu0 lu0Var, lu0 lu0Var2, qu0 qu0Var, lu0 lu0Var3, oq oqVar) throws Throwable {
        c53 c53Var;
        tb2 tb2Var2;
        lu0 lu0Var4;
        lu0 lu0Var5;
        qu0 qu0Var2;
        p33 p33Var2;
        lu0 lu0Var6;
        CoroutineScope coroutineScope2;
        x92 x92Var;
        CoroutineScope coroutineScope3;
        q60 q60Var;
        Job jobLaunch$default;
        tb2 tb2Var3;
        x92 x92Var2;
        Object objI;
        lu0 lu0Var7;
        Job job;
        lu0 lu0Var8;
        lu0 lu0Var9;
        qu0 qu0Var3;
        tb2 tb2Var4;
        CoroutineScope coroutineScope4;
        p33 p33Var3;
        Object objJ;
        lu0 lu0Var10;
        lu0 lu0Var11;
        qu0 qu0Var4;
        CoroutineScope coroutineScope5;
        x92 x92Var3;
        CoroutineScope coroutineScope6;
        tb2 tb2Var5;
        Job jobG;
        qu0 qu0Var5;
        CoroutineScope coroutineScope7;
        Job job2;
        Object objX;
        lu0 lu0Var12;
        p33 p33Var4;
        CoroutineScope coroutineScope8;
        x92 x92Var4;
        lu0 lu0Var13;
        lu0 lu0Var14;
        qu0 qu0Var6;
        Job job3;
        sj1 sj1Var;
        q60 q60Var2;
        tb2 tb2Var6;
        CoroutineScope coroutineScope9;
        x92 x92Var5;
        ?? r6;
        Job jobLaunch$default2;
        CoroutineScope coroutineScope10;
        x92 x92Var6;
        tb2 tb2Var7;
        Object objI2;
        Job job4;
        x92 x92Var7;
        lu0 lu0Var15;
        lu0 lu0Var16;
        p33 p33Var5;
        x92 x92Var8;
        tb2 tb2Var8;
        Job job5;
        x92 x92Var9;
        lu0 lu0Var17;
        lu0 lu0Var18;
        CoroutineScope coroutineScope11;
        boolean z;
        ?? r9;
        ?? r7;
        sj1 sj1Var2;
        Job job6;
        CoroutineScope coroutineScope12;
        ?? r8;
        if (oqVar instanceof c53) {
            c53Var = (c53) oqVar;
            int i = c53Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c53Var.o = i - Integer.MIN_VALUE;
            } else {
                c53Var = new c53(oqVar);
            }
        } else {
            c53Var = new c53(oqVar);
        }
        Object objJ2 = c53Var.n;
        int i2 = c53Var.o;
        q92 q92Var = q92.f;
        rj1 rj1Var = rj1.a;
        rf0 rf0Var = a;
        mf3 mf3Var = mf3.a;
        int i3 = 1;
        z70 z70Var = z70.e;
        switch (i2) {
            case 0:
                ee0.J(objJ2);
                c53Var.e = p33Var;
                c53Var.f = coroutineScope;
                tb2Var2 = tb2Var;
                c53Var.g = tb2Var2;
                lu0Var4 = lu0Var;
                c53Var.h = lu0Var4;
                lu0Var5 = lu0Var2;
                c53Var.i = lu0Var5;
                qu0Var2 = qu0Var;
                c53Var.j = qu0Var2;
                c53Var.k = lu0Var3;
                c53Var.o = 1;
                Object objB = b(p33Var, c53Var, 3);
                if (objB != z70Var) {
                    p33Var2 = p33Var;
                    lu0Var6 = lu0Var3;
                    coroutineScope2 = coroutineScope;
                    objJ2 = objB;
                    x92Var = (x92) objJ2;
                    x92Var.a();
                    coroutineScope3 = coroutineScope2;
                    q60Var = null;
                    jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, CoroutineStart.UNDISPATCHED, new a53(tb2Var2, q60Var, i3), 1, null);
                    if (qu0Var2 != rf0Var) {
                        tb2 tb2Var9 = tb2Var2;
                        d53 d53Var = new d53(qu0Var2, tb2Var9, x92Var, q60Var, 0);
                        tb2Var3 = tb2Var9;
                        x92Var2 = x92Var;
                        g(coroutineScope3, jobLaunch$default, d53Var);
                    } else {
                        tb2Var3 = tb2Var2;
                        x92Var2 = x92Var;
                    }
                    if (lu0Var5 == null) {
                        c53Var.e = p33Var2;
                        c53Var.f = coroutineScope3;
                        c53Var.g = tb2Var3;
                        c53Var.h = lu0Var4;
                        c53Var.i = lu0Var5;
                        c53Var.j = qu0Var2;
                        c53Var.k = lu0Var6;
                        c53Var.l = jobLaunch$default;
                        c53Var.o = 2;
                        objJ = j(p33Var2, q92Var, c53Var);
                        if (objJ != z70Var) {
                            lu0Var10 = lu0Var6;
                            job = jobLaunch$default;
                            objJ2 = objJ;
                            qu0 qu0Var7 = qu0Var2;
                            lu0Var11 = lu0Var4;
                            qu0Var4 = qu0Var7;
                            p33Var3 = p33Var2;
                            coroutineScope5 = coroutineScope3;
                            x92Var3 = (x92) objJ2;
                            CoroutineScope coroutineScope13 = coroutineScope5;
                            lu0Var9 = lu0Var5;
                            coroutineScope6 = coroutineScope13;
                            tb2Var5 = tb2Var3;
                            if (x92Var3 == null) {
                                jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 3));
                            } else {
                                x92Var3.a();
                                jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 4));
                            }
                            if (x92Var3 != null) {
                                if (lu0Var11 == null) {
                                    c53Var.e = p33Var3;
                                    c53Var.f = coroutineScope6;
                                    c53Var.g = tb2Var5;
                                    c53Var.h = lu0Var11;
                                    c53Var.i = lu0Var9;
                                    c53Var.j = qu0Var4;
                                    c53Var.k = lu0Var10;
                                    c53Var.l = x92Var3;
                                    c53Var.m = jobG;
                                    c53Var.o = 5;
                                    qu0Var5 = qu0Var4;
                                    coroutineScope7 = coroutineScope6;
                                    job2 = jobG;
                                    objX = p33Var3.x(p33Var3.s().b(), new pq2(x92Var3, null), c53Var);
                                    if (objX != z70Var) {
                                        lu0Var12 = lu0Var10;
                                        p33Var4 = p33Var3;
                                        coroutineScope8 = coroutineScope7;
                                        x92Var4 = x92Var3;
                                        lu0Var13 = lu0Var9;
                                        objJ2 = objX;
                                        lu0Var14 = lu0Var11;
                                        qu0Var6 = qu0Var5;
                                        job3 = job2;
                                        x92Var5 = (x92) objJ2;
                                        if (x92Var5 != null) {
                                            CoroutineScope coroutineScope14 = coroutineScope8;
                                            r6 = 0;
                                            z = false;
                                            jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope14, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                                            coroutineScope10 = coroutineScope14;
                                            if (qu0Var6 != rf0Var) {
                                                qu0 qu0Var8 = qu0Var6;
                                                tb2 tb2Var10 = tb2Var5;
                                                tb2Var7 = tb2Var10;
                                                g(coroutineScope10, jobLaunch$default2, new d53(qu0Var8, tb2Var10, x92Var5, r6, 1));
                                            } else {
                                                tb2Var7 = tb2Var5;
                                            }
                                            if (lu0Var13 == null) {
                                                x92Var6 = x92Var5;
                                                c53Var.e = coroutineScope10;
                                                c53Var.f = tb2Var7;
                                                c53Var.g = lu0Var14;
                                                c53Var.h = lu0Var12;
                                                c53Var.i = jobLaunch$default2;
                                                c53Var.j = x92Var4;
                                                c53Var.k = null;
                                                c53Var.l = null;
                                                c53Var.m = null;
                                                c53Var.o = 6;
                                                objJ2 = j(p33Var4, q92Var, c53Var);
                                                if (objJ2 != z70Var) {
                                                    x92Var6 = x92Var5;
                                                    x92 x92Var10 = x92Var4;
                                                    job5 = jobLaunch$default2;
                                                    x92Var9 = x92Var10;
                                                    lu0Var17 = lu0Var12;
                                                    lu0Var18 = lu0Var14;
                                                    coroutineScope11 = coroutineScope10;
                                                    r7 = z;
                                                    r9 = (x92) objJ2;
                                                    if (r9 != 0) {
                                                        r7 = r6;
                                                        r7 = r6;
                                                        r9.a();
                                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                        lu0Var18.invoke(new c12(r9.c));
                                                        return mf3Var;
                                                    }
                                                    r7 = r6;
                                                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                    if (lu0Var17 != null) {
                                                        r7 = r6;
                                                        lu0Var17.invoke(new c12(x92Var9.c));
                                                        return mf3Var;
                                                    }
                                                }
                                            } else {
                                                x92Var6 = x92Var5;
                                                c53Var.e = p33Var4;
                                                c53Var.f = coroutineScope10;
                                                c53Var.g = tb2Var7;
                                                c53Var.h = lu0Var14;
                                                c53Var.i = lu0Var13;
                                                c53Var.j = lu0Var12;
                                                c53Var.k = jobLaunch$default2;
                                                c53Var.l = x92Var4;
                                                c53Var.m = x92Var6;
                                                c53Var.o = 7;
                                                objI2 = i(p33Var4, q92Var, c53Var);
                                                if (objI2 != z70Var) {
                                                    x92Var6 = x92Var5;
                                                    tb2 tb2Var11 = tb2Var7;
                                                    job4 = jobLaunch$default2;
                                                    x92Var7 = x92Var6;
                                                    objJ2 = objI2;
                                                    lu0Var15 = lu0Var14;
                                                    lu0Var16 = lu0Var12;
                                                    p33Var5 = p33Var4;
                                                    x92Var8 = x92Var4;
                                                    tb2Var8 = tb2Var11;
                                                    sj1Var2 = (sj1) objJ2;
                                                    if (o51.f(sj1Var2, rj1Var)) {
                                                        lu0Var13.invoke(new c12(x92Var7.c));
                                                        c53Var.e = coroutineScope10;
                                                        c53Var.f = tb2Var8;
                                                        c53Var.g = job4;
                                                        c53Var.h = r6;
                                                        c53Var.i = r6;
                                                        c53Var.j = r6;
                                                        c53Var.k = r6;
                                                        c53Var.l = r6;
                                                        c53Var.m = r6;
                                                        c53Var.o = 8;
                                                        if (d(p33Var5, c53Var) != z70Var) {
                                                            job6 = job4;
                                                            coroutineScope12 = coroutineScope10;
                                                            r8 = r6;
                                                            g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                                            return mf3Var;
                                                        }
                                                    } else {
                                                        if (sj1Var2 instanceof qj1) {
                                                            Job job7 = job4;
                                                            tb2Var7 = tb2Var8;
                                                            job5 = job7;
                                                            lu0Var17 = lu0Var16;
                                                            coroutineScope11 = coroutineScope10;
                                                            r9 = ((qj1) sj1Var2).a;
                                                            x92Var9 = x92Var8;
                                                            lu0Var18 = lu0Var15;
                                                        } else {
                                                            if (sj1Var2 instanceof pj1) {
                                                                b81.d();
                                                                return null;
                                                            }
                                                            Job job8 = job4;
                                                            tb2Var7 = tb2Var8;
                                                            job5 = job8;
                                                            x92Var9 = x92Var8;
                                                            lu0Var17 = lu0Var16;
                                                            lu0Var18 = lu0Var15;
                                                            coroutineScope11 = coroutineScope10;
                                                            r9 = r6;
                                                        }
                                                        if (r9 != 0) {
                                                            r7 = r6;
                                                            r7 = r6;
                                                            r9.a();
                                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                            lu0Var18.invoke(new c12(r9.c));
                                                            return mf3Var;
                                                        }
                                                        r7 = r6;
                                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                        if (lu0Var17 != null) {
                                                            r7 = r6;
                                                            lu0Var17.invoke(new c12(x92Var9.c));
                                                            return mf3Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (lu0Var12 != null) {
                                            lu0Var12.invoke(new c12(x92Var4.c));
                                            return mf3Var;
                                        }
                                    }
                                } else if (lu0Var10 != null) {
                                    lu0Var10.invoke(new c12(x92Var3.c));
                                    return mf3Var;
                                }
                            }
                            r7 = r6;
                            return mf3Var;
                        }
                    } else {
                        c53Var.e = p33Var2;
                        c53Var.f = coroutineScope3;
                        c53Var.g = tb2Var3;
                        c53Var.h = lu0Var4;
                        c53Var.i = lu0Var5;
                        c53Var.j = qu0Var2;
                        c53Var.k = lu0Var6;
                        c53Var.l = x92Var2;
                        c53Var.m = jobLaunch$default;
                        c53Var.o = 3;
                        objI = i(p33Var2, q92Var, c53Var);
                        if (objI != z70Var) {
                            lu0 lu0Var19 = lu0Var4;
                            lu0Var7 = lu0Var6;
                            job = jobLaunch$default;
                            objJ2 = objI;
                            lu0Var8 = lu0Var19;
                            p33 p33Var6 = p33Var2;
                            lu0Var9 = lu0Var5;
                            qu0Var3 = qu0Var2;
                            tb2Var4 = tb2Var3;
                            coroutineScope4 = coroutineScope3;
                            p33Var3 = p33Var6;
                            sj1Var = (sj1) objJ2;
                            if (!o51.f(sj1Var, rj1Var)) {
                                if (sj1Var instanceof qj1) {
                                    x92Var3 = ((qj1) sj1Var).a;
                                } else {
                                    if (!(sj1Var instanceof pj1)) {
                                        b81.d();
                                        return null;
                                    }
                                    x92Var3 = null;
                                }
                                lu0 lu0Var20 = lu0Var8;
                                tb2Var5 = tb2Var4;
                                lu0Var11 = lu0Var20;
                                lu0Var10 = lu0Var7;
                                qu0Var4 = qu0Var3;
                                coroutineScope6 = coroutineScope4;
                                if (x92Var3 == null) {
                                    jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 3));
                                } else {
                                    x92Var3.a();
                                    jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 4));
                                }
                                if (x92Var3 != null) {
                                    if (lu0Var11 == null) {
                                        c53Var.e = p33Var3;
                                        c53Var.f = coroutineScope6;
                                        c53Var.g = tb2Var5;
                                        c53Var.h = lu0Var11;
                                        c53Var.i = lu0Var9;
                                        c53Var.j = qu0Var4;
                                        c53Var.k = lu0Var10;
                                        c53Var.l = x92Var3;
                                        c53Var.m = jobG;
                                        c53Var.o = 5;
                                        qu0Var5 = qu0Var4;
                                        coroutineScope7 = coroutineScope6;
                                        job2 = jobG;
                                        objX = p33Var3.x(p33Var3.s().b(), new pq2(x92Var3, null), c53Var);
                                        if (objX != z70Var) {
                                            lu0Var12 = lu0Var10;
                                            p33Var4 = p33Var3;
                                            coroutineScope8 = coroutineScope7;
                                            x92Var4 = x92Var3;
                                            lu0Var13 = lu0Var9;
                                            objJ2 = objX;
                                            lu0Var14 = lu0Var11;
                                            qu0Var6 = qu0Var5;
                                            job3 = job2;
                                            x92Var5 = (x92) objJ2;
                                            if (x92Var5 != null) {
                                                CoroutineScope coroutineScope15 = coroutineScope8;
                                                r6 = 0;
                                                z = false;
                                                jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope15, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                                                coroutineScope10 = coroutineScope15;
                                                if (qu0Var6 != rf0Var) {
                                                    qu0 qu0Var9 = qu0Var6;
                                                    tb2 tb2Var12 = tb2Var5;
                                                    tb2Var7 = tb2Var12;
                                                    g(coroutineScope10, jobLaunch$default2, new d53(qu0Var9, tb2Var12, x92Var5, r6, 1));
                                                } else {
                                                    tb2Var7 = tb2Var5;
                                                }
                                                if (lu0Var13 == null) {
                                                    x92Var6 = x92Var5;
                                                    c53Var.e = coroutineScope10;
                                                    c53Var.f = tb2Var7;
                                                    c53Var.g = lu0Var14;
                                                    c53Var.h = lu0Var12;
                                                    c53Var.i = jobLaunch$default2;
                                                    c53Var.j = x92Var4;
                                                    c53Var.k = null;
                                                    c53Var.l = null;
                                                    c53Var.m = null;
                                                    c53Var.o = 6;
                                                    objJ2 = j(p33Var4, q92Var, c53Var);
                                                    if (objJ2 != z70Var) {
                                                        x92Var6 = x92Var5;
                                                        x92 x92Var11 = x92Var4;
                                                        job5 = jobLaunch$default2;
                                                        x92Var9 = x92Var11;
                                                        lu0Var17 = lu0Var12;
                                                        lu0Var18 = lu0Var14;
                                                        coroutineScope11 = coroutineScope10;
                                                        r7 = z;
                                                        r9 = (x92) objJ2;
                                                        if (r9 != 0) {
                                                            r7 = r6;
                                                            r7 = r6;
                                                            r9.a();
                                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                            lu0Var18.invoke(new c12(r9.c));
                                                            return mf3Var;
                                                        }
                                                        r7 = r6;
                                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                        if (lu0Var17 != null) {
                                                            r7 = r6;
                                                            lu0Var17.invoke(new c12(x92Var9.c));
                                                            return mf3Var;
                                                        }
                                                    }
                                                } else {
                                                    x92Var6 = x92Var5;
                                                    c53Var.e = p33Var4;
                                                    c53Var.f = coroutineScope10;
                                                    c53Var.g = tb2Var7;
                                                    c53Var.h = lu0Var14;
                                                    c53Var.i = lu0Var13;
                                                    c53Var.j = lu0Var12;
                                                    c53Var.k = jobLaunch$default2;
                                                    c53Var.l = x92Var4;
                                                    c53Var.m = x92Var6;
                                                    c53Var.o = 7;
                                                    objI2 = i(p33Var4, q92Var, c53Var);
                                                    if (objI2 != z70Var) {
                                                        x92Var6 = x92Var5;
                                                        tb2 tb2Var13 = tb2Var7;
                                                        job4 = jobLaunch$default2;
                                                        x92Var7 = x92Var6;
                                                        objJ2 = objI2;
                                                        lu0Var15 = lu0Var14;
                                                        lu0Var16 = lu0Var12;
                                                        p33Var5 = p33Var4;
                                                        x92Var8 = x92Var4;
                                                        tb2Var8 = tb2Var13;
                                                        sj1Var2 = (sj1) objJ2;
                                                        if (o51.f(sj1Var2, rj1Var)) {
                                                            lu0Var13.invoke(new c12(x92Var7.c));
                                                            c53Var.e = coroutineScope10;
                                                            c53Var.f = tb2Var8;
                                                            c53Var.g = job4;
                                                            c53Var.h = r6;
                                                            c53Var.i = r6;
                                                            c53Var.j = r6;
                                                            c53Var.k = r6;
                                                            c53Var.l = r6;
                                                            c53Var.m = r6;
                                                            c53Var.o = 8;
                                                            if (d(p33Var5, c53Var) != z70Var) {
                                                                job6 = job4;
                                                                coroutineScope12 = coroutineScope10;
                                                                r8 = r6;
                                                                g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                                                return mf3Var;
                                                            }
                                                        } else {
                                                            if (sj1Var2 instanceof qj1) {
                                                                Job job9 = job4;
                                                                tb2Var7 = tb2Var8;
                                                                job5 = job9;
                                                                lu0Var17 = lu0Var16;
                                                                coroutineScope11 = coroutineScope10;
                                                                r9 = ((qj1) sj1Var2).a;
                                                                x92Var9 = x92Var8;
                                                                lu0Var18 = lu0Var15;
                                                            } else {
                                                                if (sj1Var2 instanceof pj1) {
                                                                    b81.d();
                                                                    return null;
                                                                }
                                                                Job job10 = job4;
                                                                tb2Var7 = tb2Var8;
                                                                job5 = job10;
                                                                x92Var9 = x92Var8;
                                                                lu0Var17 = lu0Var16;
                                                                lu0Var18 = lu0Var15;
                                                                coroutineScope11 = coroutineScope10;
                                                                r9 = r6;
                                                            }
                                                            if (r9 != 0) {
                                                                r7 = r6;
                                                                r7 = r6;
                                                                r9.a();
                                                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                                lu0Var18.invoke(new c12(r9.c));
                                                                return mf3Var;
                                                            }
                                                            r7 = r6;
                                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                            if (lu0Var17 != null) {
                                                                r7 = r6;
                                                                lu0Var17.invoke(new c12(x92Var9.c));
                                                                return mf3Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (lu0Var12 != null) {
                                                lu0Var12.invoke(new c12(x92Var4.c));
                                                return mf3Var;
                                            }
                                        }
                                    } else if (lu0Var10 != null) {
                                        lu0Var10.invoke(new c12(x92Var3.c));
                                        return mf3Var;
                                    }
                                }
                                r7 = r6;
                                return mf3Var;
                            }
                            lu0Var9.invoke(new c12(x92Var2.c));
                            c53Var.e = coroutineScope4;
                            c53Var.f = tb2Var4;
                            c53Var.g = job;
                            q60Var2 = null;
                            c53Var.h = null;
                            c53Var.i = null;
                            c53Var.j = null;
                            c53Var.k = null;
                            c53Var.l = null;
                            c53Var.m = null;
                            c53Var.o = 4;
                            if (d(p33Var3, c53Var) != z70Var) {
                                tb2Var6 = tb2Var4;
                                coroutineScope9 = coroutineScope4;
                                g(coroutineScope9, job, new z43(tb2Var6, q60Var2, 2));
                                return mf3Var;
                            }
                        }
                    }
                }
                x92Var6 = x92Var5;
                x92Var6 = x92Var5;
                return z70Var;
            case 1:
                lu0Var6 = (lu0) c53Var.k;
                qu0 qu0Var10 = (qu0) c53Var.j;
                lu0 lu0Var21 = (lu0) c53Var.i;
                lu0 lu0Var22 = c53Var.h;
                tb2 tb2Var14 = (tb2) c53Var.g;
                coroutineScope2 = (CoroutineScope) c53Var.f;
                p33Var2 = (p33) c53Var.e;
                ee0.J(objJ2);
                qu0Var2 = qu0Var10;
                tb2Var2 = tb2Var14;
                lu0Var5 = lu0Var21;
                lu0Var4 = lu0Var22;
                x92Var = (x92) objJ2;
                x92Var.a();
                coroutineScope3 = coroutineScope2;
                q60Var = null;
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, CoroutineStart.UNDISPATCHED, new a53(tb2Var2, q60Var, i3), 1, null);
                if (qu0Var2 != rf0Var) {
                    tb2 tb2Var15 = tb2Var2;
                    d53 d53Var2 = new d53(qu0Var2, tb2Var15, x92Var, q60Var, 0);
                    tb2Var3 = tb2Var15;
                    x92Var2 = x92Var;
                    g(coroutineScope3, jobLaunch$default, d53Var2);
                } else {
                    tb2Var3 = tb2Var2;
                    x92Var2 = x92Var;
                }
                if (lu0Var5 == null) {
                    c53Var.e = p33Var2;
                    c53Var.f = coroutineScope3;
                    c53Var.g = tb2Var3;
                    c53Var.h = lu0Var4;
                    c53Var.i = lu0Var5;
                    c53Var.j = qu0Var2;
                    c53Var.k = lu0Var6;
                    c53Var.l = jobLaunch$default;
                    c53Var.o = 2;
                    objJ = j(p33Var2, q92Var, c53Var);
                    if (objJ != z70Var) {
                        lu0Var10 = lu0Var6;
                        job = jobLaunch$default;
                        objJ2 = objJ;
                        qu0 qu0Var11 = qu0Var2;
                        lu0Var11 = lu0Var4;
                        qu0Var4 = qu0Var11;
                        p33Var3 = p33Var2;
                        coroutineScope5 = coroutineScope3;
                        x92Var3 = (x92) objJ2;
                        CoroutineScope coroutineScope16 = coroutineScope5;
                        lu0Var9 = lu0Var5;
                        coroutineScope6 = coroutineScope16;
                        tb2Var5 = tb2Var3;
                        if (x92Var3 == null) {
                            jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 3));
                        } else {
                            x92Var3.a();
                            jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 4));
                        }
                        if (x92Var3 != null) {
                            if (lu0Var11 == null) {
                                c53Var.e = p33Var3;
                                c53Var.f = coroutineScope6;
                                c53Var.g = tb2Var5;
                                c53Var.h = lu0Var11;
                                c53Var.i = lu0Var9;
                                c53Var.j = qu0Var4;
                                c53Var.k = lu0Var10;
                                c53Var.l = x92Var3;
                                c53Var.m = jobG;
                                c53Var.o = 5;
                                qu0Var5 = qu0Var4;
                                coroutineScope7 = coroutineScope6;
                                job2 = jobG;
                                objX = p33Var3.x(p33Var3.s().b(), new pq2(x92Var3, null), c53Var);
                                if (objX != z70Var) {
                                    lu0Var12 = lu0Var10;
                                    p33Var4 = p33Var3;
                                    coroutineScope8 = coroutineScope7;
                                    x92Var4 = x92Var3;
                                    lu0Var13 = lu0Var9;
                                    objJ2 = objX;
                                    lu0Var14 = lu0Var11;
                                    qu0Var6 = qu0Var5;
                                    job3 = job2;
                                    x92Var5 = (x92) objJ2;
                                    if (x92Var5 != null) {
                                        CoroutineScope coroutineScope17 = coroutineScope8;
                                        r6 = 0;
                                        z = false;
                                        jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope17, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                                        coroutineScope10 = coroutineScope17;
                                        if (qu0Var6 != rf0Var) {
                                            qu0 qu0Var12 = qu0Var6;
                                            tb2 tb2Var16 = tb2Var5;
                                            tb2Var7 = tb2Var16;
                                            g(coroutineScope10, jobLaunch$default2, new d53(qu0Var12, tb2Var16, x92Var5, r6, 1));
                                        } else {
                                            tb2Var7 = tb2Var5;
                                        }
                                        if (lu0Var13 == null) {
                                            x92Var6 = x92Var5;
                                            c53Var.e = coroutineScope10;
                                            c53Var.f = tb2Var7;
                                            c53Var.g = lu0Var14;
                                            c53Var.h = lu0Var12;
                                            c53Var.i = jobLaunch$default2;
                                            c53Var.j = x92Var4;
                                            c53Var.k = null;
                                            c53Var.l = null;
                                            c53Var.m = null;
                                            c53Var.o = 6;
                                            objJ2 = j(p33Var4, q92Var, c53Var);
                                            if (objJ2 != z70Var) {
                                                x92Var6 = x92Var5;
                                                x92 x92Var12 = x92Var4;
                                                job5 = jobLaunch$default2;
                                                x92Var9 = x92Var12;
                                                lu0Var17 = lu0Var12;
                                                lu0Var18 = lu0Var14;
                                                coroutineScope11 = coroutineScope10;
                                                r7 = z;
                                                r9 = (x92) objJ2;
                                                if (r9 != 0) {
                                                    r7 = r6;
                                                    r7 = r6;
                                                    r9.a();
                                                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                    lu0Var18.invoke(new c12(r9.c));
                                                    return mf3Var;
                                                }
                                                r7 = r6;
                                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                if (lu0Var17 != null) {
                                                    r7 = r6;
                                                    lu0Var17.invoke(new c12(x92Var9.c));
                                                    return mf3Var;
                                                }
                                            }
                                        } else {
                                            x92Var6 = x92Var5;
                                            c53Var.e = p33Var4;
                                            c53Var.f = coroutineScope10;
                                            c53Var.g = tb2Var7;
                                            c53Var.h = lu0Var14;
                                            c53Var.i = lu0Var13;
                                            c53Var.j = lu0Var12;
                                            c53Var.k = jobLaunch$default2;
                                            c53Var.l = x92Var4;
                                            c53Var.m = x92Var6;
                                            c53Var.o = 7;
                                            objI2 = i(p33Var4, q92Var, c53Var);
                                            if (objI2 != z70Var) {
                                                x92Var6 = x92Var5;
                                                tb2 tb2Var17 = tb2Var7;
                                                job4 = jobLaunch$default2;
                                                x92Var7 = x92Var6;
                                                objJ2 = objI2;
                                                lu0Var15 = lu0Var14;
                                                lu0Var16 = lu0Var12;
                                                p33Var5 = p33Var4;
                                                x92Var8 = x92Var4;
                                                tb2Var8 = tb2Var17;
                                                sj1Var2 = (sj1) objJ2;
                                                if (o51.f(sj1Var2, rj1Var)) {
                                                    lu0Var13.invoke(new c12(x92Var7.c));
                                                    c53Var.e = coroutineScope10;
                                                    c53Var.f = tb2Var8;
                                                    c53Var.g = job4;
                                                    c53Var.h = r6;
                                                    c53Var.i = r6;
                                                    c53Var.j = r6;
                                                    c53Var.k = r6;
                                                    c53Var.l = r6;
                                                    c53Var.m = r6;
                                                    c53Var.o = 8;
                                                    if (d(p33Var5, c53Var) != z70Var) {
                                                        job6 = job4;
                                                        coroutineScope12 = coroutineScope10;
                                                        r8 = r6;
                                                        g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                                        return mf3Var;
                                                    }
                                                } else {
                                                    if (sj1Var2 instanceof qj1) {
                                                        Job job11 = job4;
                                                        tb2Var7 = tb2Var8;
                                                        job5 = job11;
                                                        lu0Var17 = lu0Var16;
                                                        coroutineScope11 = coroutineScope10;
                                                        r9 = ((qj1) sj1Var2).a;
                                                        x92Var9 = x92Var8;
                                                        lu0Var18 = lu0Var15;
                                                    } else {
                                                        if (sj1Var2 instanceof pj1) {
                                                            b81.d();
                                                            return null;
                                                        }
                                                        Job job12 = job4;
                                                        tb2Var7 = tb2Var8;
                                                        job5 = job12;
                                                        x92Var9 = x92Var8;
                                                        lu0Var17 = lu0Var16;
                                                        lu0Var18 = lu0Var15;
                                                        coroutineScope11 = coroutineScope10;
                                                        r9 = r6;
                                                    }
                                                    if (r9 != 0) {
                                                        r7 = r6;
                                                        r7 = r6;
                                                        r9.a();
                                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                        lu0Var18.invoke(new c12(r9.c));
                                                        return mf3Var;
                                                    }
                                                    r7 = r6;
                                                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                    if (lu0Var17 != null) {
                                                        r7 = r6;
                                                        lu0Var17.invoke(new c12(x92Var9.c));
                                                        return mf3Var;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (lu0Var12 != null) {
                                        lu0Var12.invoke(new c12(x92Var4.c));
                                        return mf3Var;
                                    }
                                }
                            } else if (lu0Var10 != null) {
                                lu0Var10.invoke(new c12(x92Var3.c));
                                return mf3Var;
                            }
                        }
                        r7 = r6;
                        return mf3Var;
                    }
                } else {
                    c53Var.e = p33Var2;
                    c53Var.f = coroutineScope3;
                    c53Var.g = tb2Var3;
                    c53Var.h = lu0Var4;
                    c53Var.i = lu0Var5;
                    c53Var.j = qu0Var2;
                    c53Var.k = lu0Var6;
                    c53Var.l = x92Var2;
                    c53Var.m = jobLaunch$default;
                    c53Var.o = 3;
                    objI = i(p33Var2, q92Var, c53Var);
                    if (objI != z70Var) {
                        lu0 lu0Var110 = lu0Var4;
                        lu0Var7 = lu0Var6;
                        job = jobLaunch$default;
                        objJ2 = objI;
                        lu0Var8 = lu0Var110;
                        p33 p33Var7 = p33Var2;
                        lu0Var9 = lu0Var5;
                        qu0Var3 = qu0Var2;
                        tb2Var4 = tb2Var3;
                        coroutineScope4 = coroutineScope3;
                        p33Var3 = p33Var7;
                        sj1Var = (sj1) objJ2;
                        if (!o51.f(sj1Var, rj1Var)) {
                            if (sj1Var instanceof qj1) {
                                x92Var3 = ((qj1) sj1Var).a;
                            } else {
                                if (!(sj1Var instanceof pj1)) {
                                    b81.d();
                                    return null;
                                }
                                x92Var3 = null;
                            }
                            lu0 lu0Var23 = lu0Var8;
                            tb2Var5 = tb2Var4;
                            lu0Var11 = lu0Var23;
                            lu0Var10 = lu0Var7;
                            qu0Var4 = qu0Var3;
                            coroutineScope6 = coroutineScope4;
                            if (x92Var3 == null) {
                                jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 3));
                            } else {
                                x92Var3.a();
                                jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 4));
                            }
                            if (x92Var3 != null) {
                                if (lu0Var11 == null) {
                                    c53Var.e = p33Var3;
                                    c53Var.f = coroutineScope6;
                                    c53Var.g = tb2Var5;
                                    c53Var.h = lu0Var11;
                                    c53Var.i = lu0Var9;
                                    c53Var.j = qu0Var4;
                                    c53Var.k = lu0Var10;
                                    c53Var.l = x92Var3;
                                    c53Var.m = jobG;
                                    c53Var.o = 5;
                                    qu0Var5 = qu0Var4;
                                    coroutineScope7 = coroutineScope6;
                                    job2 = jobG;
                                    objX = p33Var3.x(p33Var3.s().b(), new pq2(x92Var3, null), c53Var);
                                    if (objX != z70Var) {
                                        lu0Var12 = lu0Var10;
                                        p33Var4 = p33Var3;
                                        coroutineScope8 = coroutineScope7;
                                        x92Var4 = x92Var3;
                                        lu0Var13 = lu0Var9;
                                        objJ2 = objX;
                                        lu0Var14 = lu0Var11;
                                        qu0Var6 = qu0Var5;
                                        job3 = job2;
                                        x92Var5 = (x92) objJ2;
                                        if (x92Var5 != null) {
                                            CoroutineScope coroutineScope18 = coroutineScope8;
                                            r6 = 0;
                                            z = false;
                                            jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope18, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                                            coroutineScope10 = coroutineScope18;
                                            if (qu0Var6 != rf0Var) {
                                                qu0 qu0Var13 = qu0Var6;
                                                tb2 tb2Var18 = tb2Var5;
                                                tb2Var7 = tb2Var18;
                                                g(coroutineScope10, jobLaunch$default2, new d53(qu0Var13, tb2Var18, x92Var5, r6, 1));
                                            } else {
                                                tb2Var7 = tb2Var5;
                                            }
                                            if (lu0Var13 == null) {
                                                x92Var6 = x92Var5;
                                                c53Var.e = coroutineScope10;
                                                c53Var.f = tb2Var7;
                                                c53Var.g = lu0Var14;
                                                c53Var.h = lu0Var12;
                                                c53Var.i = jobLaunch$default2;
                                                c53Var.j = x92Var4;
                                                c53Var.k = null;
                                                c53Var.l = null;
                                                c53Var.m = null;
                                                c53Var.o = 6;
                                                objJ2 = j(p33Var4, q92Var, c53Var);
                                                if (objJ2 != z70Var) {
                                                    x92Var6 = x92Var5;
                                                    x92 x92Var13 = x92Var4;
                                                    job5 = jobLaunch$default2;
                                                    x92Var9 = x92Var13;
                                                    lu0Var17 = lu0Var12;
                                                    lu0Var18 = lu0Var14;
                                                    coroutineScope11 = coroutineScope10;
                                                    r7 = z;
                                                    r9 = (x92) objJ2;
                                                    if (r9 != 0) {
                                                        r7 = r6;
                                                        r7 = r6;
                                                        r9.a();
                                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                        lu0Var18.invoke(new c12(r9.c));
                                                        return mf3Var;
                                                    }
                                                    r7 = r6;
                                                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                    if (lu0Var17 != null) {
                                                        r7 = r6;
                                                        lu0Var17.invoke(new c12(x92Var9.c));
                                                        return mf3Var;
                                                    }
                                                }
                                            } else {
                                                x92Var6 = x92Var5;
                                                c53Var.e = p33Var4;
                                                c53Var.f = coroutineScope10;
                                                c53Var.g = tb2Var7;
                                                c53Var.h = lu0Var14;
                                                c53Var.i = lu0Var13;
                                                c53Var.j = lu0Var12;
                                                c53Var.k = jobLaunch$default2;
                                                c53Var.l = x92Var4;
                                                c53Var.m = x92Var6;
                                                c53Var.o = 7;
                                                objI2 = i(p33Var4, q92Var, c53Var);
                                                if (objI2 != z70Var) {
                                                    x92Var6 = x92Var5;
                                                    tb2 tb2Var19 = tb2Var7;
                                                    job4 = jobLaunch$default2;
                                                    x92Var7 = x92Var6;
                                                    objJ2 = objI2;
                                                    lu0Var15 = lu0Var14;
                                                    lu0Var16 = lu0Var12;
                                                    p33Var5 = p33Var4;
                                                    x92Var8 = x92Var4;
                                                    tb2Var8 = tb2Var19;
                                                    sj1Var2 = (sj1) objJ2;
                                                    if (o51.f(sj1Var2, rj1Var)) {
                                                        lu0Var13.invoke(new c12(x92Var7.c));
                                                        c53Var.e = coroutineScope10;
                                                        c53Var.f = tb2Var8;
                                                        c53Var.g = job4;
                                                        c53Var.h = r6;
                                                        c53Var.i = r6;
                                                        c53Var.j = r6;
                                                        c53Var.k = r6;
                                                        c53Var.l = r6;
                                                        c53Var.m = r6;
                                                        c53Var.o = 8;
                                                        if (d(p33Var5, c53Var) != z70Var) {
                                                            job6 = job4;
                                                            coroutineScope12 = coroutineScope10;
                                                            r8 = r6;
                                                            g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                                            return mf3Var;
                                                        }
                                                    } else {
                                                        if (sj1Var2 instanceof qj1) {
                                                            Job job13 = job4;
                                                            tb2Var7 = tb2Var8;
                                                            job5 = job13;
                                                            lu0Var17 = lu0Var16;
                                                            coroutineScope11 = coroutineScope10;
                                                            r9 = ((qj1) sj1Var2).a;
                                                            x92Var9 = x92Var8;
                                                            lu0Var18 = lu0Var15;
                                                        } else {
                                                            if (sj1Var2 instanceof pj1) {
                                                                b81.d();
                                                                return null;
                                                            }
                                                            Job job14 = job4;
                                                            tb2Var7 = tb2Var8;
                                                            job5 = job14;
                                                            x92Var9 = x92Var8;
                                                            lu0Var17 = lu0Var16;
                                                            lu0Var18 = lu0Var15;
                                                            coroutineScope11 = coroutineScope10;
                                                            r9 = r6;
                                                        }
                                                        if (r9 != 0) {
                                                            r7 = r6;
                                                            r7 = r6;
                                                            r9.a();
                                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                            lu0Var18.invoke(new c12(r9.c));
                                                            return mf3Var;
                                                        }
                                                        r7 = r6;
                                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                        if (lu0Var17 != null) {
                                                            r7 = r6;
                                                            lu0Var17.invoke(new c12(x92Var9.c));
                                                            return mf3Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (lu0Var12 != null) {
                                            lu0Var12.invoke(new c12(x92Var4.c));
                                            return mf3Var;
                                        }
                                    }
                                } else if (lu0Var10 != null) {
                                    lu0Var10.invoke(new c12(x92Var3.c));
                                    return mf3Var;
                                }
                            }
                            r7 = r6;
                            return mf3Var;
                        }
                        lu0Var9.invoke(new c12(x92Var2.c));
                        c53Var.e = coroutineScope4;
                        c53Var.f = tb2Var4;
                        c53Var.g = job;
                        q60Var2 = null;
                        c53Var.h = null;
                        c53Var.i = null;
                        c53Var.j = null;
                        c53Var.k = null;
                        c53Var.l = null;
                        c53Var.m = null;
                        c53Var.o = 4;
                        if (d(p33Var3, c53Var) != z70Var) {
                            tb2Var6 = tb2Var4;
                            coroutineScope9 = coroutineScope4;
                            g(coroutineScope9, job, new z43(tb2Var6, q60Var2, 2));
                            return mf3Var;
                        }
                    }
                }
                x92Var6 = x92Var5;
                x92Var6 = x92Var5;
                return z70Var;
            case 2:
                job = (Job) c53Var.l;
                lu0Var10 = (lu0) c53Var.k;
                qu0Var4 = (qu0) c53Var.j;
                lu0Var5 = (lu0) c53Var.i;
                lu0Var11 = c53Var.h;
                tb2Var3 = (tb2) c53Var.g;
                coroutineScope5 = (CoroutineScope) c53Var.f;
                p33Var3 = (p33) c53Var.e;
                ee0.J(objJ2);
                x92Var3 = (x92) objJ2;
                CoroutineScope coroutineScope19 = coroutineScope5;
                lu0Var9 = lu0Var5;
                coroutineScope6 = coroutineScope19;
                tb2Var5 = tb2Var3;
                if (x92Var3 == null) {
                    jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 3));
                } else {
                    x92Var3.a();
                    jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 4));
                }
                if (x92Var3 != null) {
                    if (lu0Var11 == null) {
                        c53Var.e = p33Var3;
                        c53Var.f = coroutineScope6;
                        c53Var.g = tb2Var5;
                        c53Var.h = lu0Var11;
                        c53Var.i = lu0Var9;
                        c53Var.j = qu0Var4;
                        c53Var.k = lu0Var10;
                        c53Var.l = x92Var3;
                        c53Var.m = jobG;
                        c53Var.o = 5;
                        qu0Var5 = qu0Var4;
                        coroutineScope7 = coroutineScope6;
                        job2 = jobG;
                        objX = p33Var3.x(p33Var3.s().b(), new pq2(x92Var3, null), c53Var);
                        if (objX != z70Var) {
                            lu0Var12 = lu0Var10;
                            p33Var4 = p33Var3;
                            coroutineScope8 = coroutineScope7;
                            x92Var4 = x92Var3;
                            lu0Var13 = lu0Var9;
                            objJ2 = objX;
                            lu0Var14 = lu0Var11;
                            qu0Var6 = qu0Var5;
                            job3 = job2;
                            x92Var5 = (x92) objJ2;
                            if (x92Var5 != null) {
                                CoroutineScope coroutineScope110 = coroutineScope8;
                                r6 = 0;
                                z = false;
                                jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope110, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                                coroutineScope10 = coroutineScope110;
                                if (qu0Var6 != rf0Var) {
                                    qu0 qu0Var14 = qu0Var6;
                                    tb2 tb2Var110 = tb2Var5;
                                    tb2Var7 = tb2Var110;
                                    g(coroutineScope10, jobLaunch$default2, new d53(qu0Var14, tb2Var110, x92Var5, r6, 1));
                                } else {
                                    tb2Var7 = tb2Var5;
                                }
                                if (lu0Var13 == null) {
                                    x92Var6 = x92Var5;
                                    c53Var.e = coroutineScope10;
                                    c53Var.f = tb2Var7;
                                    c53Var.g = lu0Var14;
                                    c53Var.h = lu0Var12;
                                    c53Var.i = jobLaunch$default2;
                                    c53Var.j = x92Var4;
                                    c53Var.k = null;
                                    c53Var.l = null;
                                    c53Var.m = null;
                                    c53Var.o = 6;
                                    objJ2 = j(p33Var4, q92Var, c53Var);
                                    if (objJ2 != z70Var) {
                                        x92Var6 = x92Var5;
                                        x92 x92Var14 = x92Var4;
                                        job5 = jobLaunch$default2;
                                        x92Var9 = x92Var14;
                                        lu0Var17 = lu0Var12;
                                        lu0Var18 = lu0Var14;
                                        coroutineScope11 = coroutineScope10;
                                        r7 = z;
                                        r9 = (x92) objJ2;
                                        if (r9 != 0) {
                                            r7 = r6;
                                            r7 = r6;
                                            r9.a();
                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                            lu0Var18.invoke(new c12(r9.c));
                                            return mf3Var;
                                        }
                                        r7 = r6;
                                        g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                        if (lu0Var17 != null) {
                                            r7 = r6;
                                            lu0Var17.invoke(new c12(x92Var9.c));
                                            return mf3Var;
                                        }
                                    }
                                } else {
                                    x92Var6 = x92Var5;
                                    c53Var.e = p33Var4;
                                    c53Var.f = coroutineScope10;
                                    c53Var.g = tb2Var7;
                                    c53Var.h = lu0Var14;
                                    c53Var.i = lu0Var13;
                                    c53Var.j = lu0Var12;
                                    c53Var.k = jobLaunch$default2;
                                    c53Var.l = x92Var4;
                                    c53Var.m = x92Var6;
                                    c53Var.o = 7;
                                    objI2 = i(p33Var4, q92Var, c53Var);
                                    if (objI2 != z70Var) {
                                        x92Var6 = x92Var5;
                                        tb2 tb2Var111 = tb2Var7;
                                        job4 = jobLaunch$default2;
                                        x92Var7 = x92Var6;
                                        objJ2 = objI2;
                                        lu0Var15 = lu0Var14;
                                        lu0Var16 = lu0Var12;
                                        p33Var5 = p33Var4;
                                        x92Var8 = x92Var4;
                                        tb2Var8 = tb2Var111;
                                        sj1Var2 = (sj1) objJ2;
                                        if (o51.f(sj1Var2, rj1Var)) {
                                            lu0Var13.invoke(new c12(x92Var7.c));
                                            c53Var.e = coroutineScope10;
                                            c53Var.f = tb2Var8;
                                            c53Var.g = job4;
                                            c53Var.h = r6;
                                            c53Var.i = r6;
                                            c53Var.j = r6;
                                            c53Var.k = r6;
                                            c53Var.l = r6;
                                            c53Var.m = r6;
                                            c53Var.o = 8;
                                            if (d(p33Var5, c53Var) != z70Var) {
                                                job6 = job4;
                                                coroutineScope12 = coroutineScope10;
                                                r8 = r6;
                                                g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                                return mf3Var;
                                            }
                                        } else {
                                            if (sj1Var2 instanceof qj1) {
                                                Job job15 = job4;
                                                tb2Var7 = tb2Var8;
                                                job5 = job15;
                                                lu0Var17 = lu0Var16;
                                                coroutineScope11 = coroutineScope10;
                                                r9 = ((qj1) sj1Var2).a;
                                                x92Var9 = x92Var8;
                                                lu0Var18 = lu0Var15;
                                            } else {
                                                if (sj1Var2 instanceof pj1) {
                                                    b81.d();
                                                    return null;
                                                }
                                                Job job16 = job4;
                                                tb2Var7 = tb2Var8;
                                                job5 = job16;
                                                x92Var9 = x92Var8;
                                                lu0Var17 = lu0Var16;
                                                lu0Var18 = lu0Var15;
                                                coroutineScope11 = coroutineScope10;
                                                r9 = r6;
                                            }
                                            if (r9 != 0) {
                                                r7 = r6;
                                                r7 = r6;
                                                r9.a();
                                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                lu0Var18.invoke(new c12(r9.c));
                                                return mf3Var;
                                            }
                                            r7 = r6;
                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                            if (lu0Var17 != null) {
                                                r7 = r6;
                                                lu0Var17.invoke(new c12(x92Var9.c));
                                                return mf3Var;
                                            }
                                        }
                                    }
                                }
                            } else if (lu0Var12 != null) {
                                lu0Var12.invoke(new c12(x92Var4.c));
                                return mf3Var;
                            }
                        }
                        x92Var6 = x92Var5;
                        x92Var6 = x92Var5;
                        return z70Var;
                    }
                    if (lu0Var10 != null) {
                        lu0Var10.invoke(new c12(x92Var3.c));
                        return mf3Var;
                    }
                }
                r7 = r6;
                return mf3Var;
            case 3:
                job = (Job) c53Var.m;
                x92Var2 = (x92) c53Var.l;
                lu0Var7 = (lu0) c53Var.k;
                qu0Var3 = (qu0) c53Var.j;
                lu0Var9 = (lu0) c53Var.i;
                lu0Var8 = c53Var.h;
                tb2Var4 = (tb2) c53Var.g;
                coroutineScope4 = (CoroutineScope) c53Var.f;
                p33Var3 = (p33) c53Var.e;
                ee0.J(objJ2);
                sj1Var = (sj1) objJ2;
                if (!o51.f(sj1Var, rj1Var)) {
                    if (sj1Var instanceof qj1) {
                        x92Var3 = ((qj1) sj1Var).a;
                    } else {
                        if (!(sj1Var instanceof pj1)) {
                            b81.d();
                            return null;
                        }
                        x92Var3 = null;
                    }
                    lu0 lu0Var24 = lu0Var8;
                    tb2Var5 = tb2Var4;
                    lu0Var11 = lu0Var24;
                    lu0Var10 = lu0Var7;
                    qu0Var4 = qu0Var3;
                    coroutineScope6 = coroutineScope4;
                    if (x92Var3 == null) {
                        jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 3));
                    } else {
                        x92Var3.a();
                        jobG = g(coroutineScope6, job, new z43(tb2Var5, null, 4));
                    }
                    if (x92Var3 != null) {
                        if (lu0Var11 == null) {
                            c53Var.e = p33Var3;
                            c53Var.f = coroutineScope6;
                            c53Var.g = tb2Var5;
                            c53Var.h = lu0Var11;
                            c53Var.i = lu0Var9;
                            c53Var.j = qu0Var4;
                            c53Var.k = lu0Var10;
                            c53Var.l = x92Var3;
                            c53Var.m = jobG;
                            c53Var.o = 5;
                            qu0Var5 = qu0Var4;
                            coroutineScope7 = coroutineScope6;
                            job2 = jobG;
                            objX = p33Var3.x(p33Var3.s().b(), new pq2(x92Var3, null), c53Var);
                            if (objX != z70Var) {
                                lu0Var12 = lu0Var10;
                                p33Var4 = p33Var3;
                                coroutineScope8 = coroutineScope7;
                                x92Var4 = x92Var3;
                                lu0Var13 = lu0Var9;
                                objJ2 = objX;
                                lu0Var14 = lu0Var11;
                                qu0Var6 = qu0Var5;
                                job3 = job2;
                                x92Var5 = (x92) objJ2;
                                if (x92Var5 != null) {
                                    CoroutineScope coroutineScope111 = coroutineScope8;
                                    r6 = 0;
                                    z = false;
                                    jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope111, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                                    coroutineScope10 = coroutineScope111;
                                    if (qu0Var6 != rf0Var) {
                                        qu0 qu0Var15 = qu0Var6;
                                        tb2 tb2Var112 = tb2Var5;
                                        tb2Var7 = tb2Var112;
                                        g(coroutineScope10, jobLaunch$default2, new d53(qu0Var15, tb2Var112, x92Var5, r6, 1));
                                    } else {
                                        tb2Var7 = tb2Var5;
                                    }
                                    if (lu0Var13 == null) {
                                        x92Var6 = x92Var5;
                                        c53Var.e = coroutineScope10;
                                        c53Var.f = tb2Var7;
                                        c53Var.g = lu0Var14;
                                        c53Var.h = lu0Var12;
                                        c53Var.i = jobLaunch$default2;
                                        c53Var.j = x92Var4;
                                        c53Var.k = null;
                                        c53Var.l = null;
                                        c53Var.m = null;
                                        c53Var.o = 6;
                                        objJ2 = j(p33Var4, q92Var, c53Var);
                                        if (objJ2 != z70Var) {
                                            x92Var6 = x92Var5;
                                            x92 x92Var15 = x92Var4;
                                            job5 = jobLaunch$default2;
                                            x92Var9 = x92Var15;
                                            lu0Var17 = lu0Var12;
                                            lu0Var18 = lu0Var14;
                                            coroutineScope11 = coroutineScope10;
                                            r7 = z;
                                            r9 = (x92) objJ2;
                                            if (r9 != 0) {
                                                r7 = r6;
                                                r7 = r6;
                                                r9.a();
                                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                lu0Var18.invoke(new c12(r9.c));
                                                return mf3Var;
                                            }
                                            r7 = r6;
                                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                            if (lu0Var17 != null) {
                                                r7 = r6;
                                                lu0Var17.invoke(new c12(x92Var9.c));
                                                return mf3Var;
                                            }
                                        }
                                    } else {
                                        x92Var6 = x92Var5;
                                        c53Var.e = p33Var4;
                                        c53Var.f = coroutineScope10;
                                        c53Var.g = tb2Var7;
                                        c53Var.h = lu0Var14;
                                        c53Var.i = lu0Var13;
                                        c53Var.j = lu0Var12;
                                        c53Var.k = jobLaunch$default2;
                                        c53Var.l = x92Var4;
                                        c53Var.m = x92Var6;
                                        c53Var.o = 7;
                                        objI2 = i(p33Var4, q92Var, c53Var);
                                        if (objI2 != z70Var) {
                                            x92Var6 = x92Var5;
                                            tb2 tb2Var113 = tb2Var7;
                                            job4 = jobLaunch$default2;
                                            x92Var7 = x92Var6;
                                            objJ2 = objI2;
                                            lu0Var15 = lu0Var14;
                                            lu0Var16 = lu0Var12;
                                            p33Var5 = p33Var4;
                                            x92Var8 = x92Var4;
                                            tb2Var8 = tb2Var113;
                                            sj1Var2 = (sj1) objJ2;
                                            if (o51.f(sj1Var2, rj1Var)) {
                                                lu0Var13.invoke(new c12(x92Var7.c));
                                                c53Var.e = coroutineScope10;
                                                c53Var.f = tb2Var8;
                                                c53Var.g = job4;
                                                c53Var.h = r6;
                                                c53Var.i = r6;
                                                c53Var.j = r6;
                                                c53Var.k = r6;
                                                c53Var.l = r6;
                                                c53Var.m = r6;
                                                c53Var.o = 8;
                                                if (d(p33Var5, c53Var) != z70Var) {
                                                    job6 = job4;
                                                    coroutineScope12 = coroutineScope10;
                                                    r8 = r6;
                                                    g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                                    return mf3Var;
                                                }
                                            } else {
                                                if (sj1Var2 instanceof qj1) {
                                                    Job job17 = job4;
                                                    tb2Var7 = tb2Var8;
                                                    job5 = job17;
                                                    lu0Var17 = lu0Var16;
                                                    coroutineScope11 = coroutineScope10;
                                                    r9 = ((qj1) sj1Var2).a;
                                                    x92Var9 = x92Var8;
                                                    lu0Var18 = lu0Var15;
                                                } else {
                                                    if (sj1Var2 instanceof pj1) {
                                                        b81.d();
                                                        return null;
                                                    }
                                                    Job job18 = job4;
                                                    tb2Var7 = tb2Var8;
                                                    job5 = job18;
                                                    x92Var9 = x92Var8;
                                                    lu0Var17 = lu0Var16;
                                                    lu0Var18 = lu0Var15;
                                                    coroutineScope11 = coroutineScope10;
                                                    r9 = r6;
                                                }
                                                if (r9 != 0) {
                                                    r7 = r6;
                                                    r7 = r6;
                                                    r9.a();
                                                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                                    lu0Var18.invoke(new c12(r9.c));
                                                    return mf3Var;
                                                }
                                                r7 = r6;
                                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                                if (lu0Var17 != null) {
                                                    r7 = r6;
                                                    lu0Var17.invoke(new c12(x92Var9.c));
                                                    return mf3Var;
                                                }
                                            }
                                        }
                                    }
                                } else if (lu0Var12 != null) {
                                    lu0Var12.invoke(new c12(x92Var4.c));
                                    return mf3Var;
                                }
                            }
                        } else if (lu0Var10 != null) {
                            lu0Var10.invoke(new c12(x92Var3.c));
                            return mf3Var;
                        }
                    }
                    r7 = r6;
                    return mf3Var;
                }
                lu0Var9.invoke(new c12(x92Var2.c));
                c53Var.e = coroutineScope4;
                c53Var.f = tb2Var4;
                c53Var.g = job;
                q60Var2 = null;
                c53Var.h = null;
                c53Var.i = null;
                c53Var.j = null;
                c53Var.k = null;
                c53Var.l = null;
                c53Var.m = null;
                c53Var.o = 4;
                if (d(p33Var3, c53Var) != z70Var) {
                    tb2Var6 = tb2Var4;
                    coroutineScope9 = coroutineScope4;
                    g(coroutineScope9, job, new z43(tb2Var6, q60Var2, 2));
                    return mf3Var;
                }
                x92Var6 = x92Var5;
                x92Var6 = x92Var5;
                return z70Var;
            case 4:
                job = (Job) c53Var.g;
                tb2Var6 = (tb2) c53Var.f;
                coroutineScope9 = (CoroutineScope) c53Var.e;
                ee0.J(objJ2);
                q60Var2 = null;
                g(coroutineScope9, job, new z43(tb2Var6, q60Var2, 2));
                return mf3Var;
            case Logger.WARN /* 5 */:
                job3 = (Job) c53Var.m;
                x92Var4 = (x92) c53Var.l;
                lu0 lu0Var25 = (lu0) c53Var.k;
                qu0Var6 = (qu0) c53Var.j;
                lu0 lu0Var26 = (lu0) c53Var.i;
                lu0 lu0Var27 = c53Var.h;
                tb2Var5 = (tb2) c53Var.g;
                coroutineScope8 = (CoroutineScope) c53Var.f;
                p33 p33Var8 = (p33) c53Var.e;
                ee0.J(objJ2);
                lu0Var12 = lu0Var25;
                p33Var4 = p33Var8;
                lu0Var14 = lu0Var27;
                lu0Var13 = lu0Var26;
                rj1Var = rj1Var;
                mf3Var = mf3Var;
                x92Var5 = (x92) objJ2;
                if (x92Var5 != null) {
                    CoroutineScope coroutineScope112 = coroutineScope8;
                    r6 = 0;
                    z = false;
                    jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope112, null, CoroutineStart.UNDISPATCHED, new wr1(job3, tb2Var5, r6, 15), 1, null);
                    coroutineScope10 = coroutineScope112;
                    if (qu0Var6 != rf0Var) {
                        qu0 qu0Var16 = qu0Var6;
                        tb2 tb2Var114 = tb2Var5;
                        tb2Var7 = tb2Var114;
                        g(coroutineScope10, jobLaunch$default2, new d53(qu0Var16, tb2Var114, x92Var5, r6, 1));
                    } else {
                        tb2Var7 = tb2Var5;
                    }
                    if (lu0Var13 == null) {
                        x92Var6 = x92Var5;
                        c53Var.e = coroutineScope10;
                        c53Var.f = tb2Var7;
                        c53Var.g = lu0Var14;
                        c53Var.h = lu0Var12;
                        c53Var.i = jobLaunch$default2;
                        c53Var.j = x92Var4;
                        c53Var.k = null;
                        c53Var.l = null;
                        c53Var.m = null;
                        c53Var.o = 6;
                        objJ2 = j(p33Var4, q92Var, c53Var);
                        if (objJ2 != z70Var) {
                            x92Var6 = x92Var5;
                            x92 x92Var16 = x92Var4;
                            job5 = jobLaunch$default2;
                            x92Var9 = x92Var16;
                            lu0Var17 = lu0Var12;
                            lu0Var18 = lu0Var14;
                            coroutineScope11 = coroutineScope10;
                            r7 = z;
                            r9 = (x92) objJ2;
                            if (r9 != 0) {
                                r7 = r6;
                                r7 = r6;
                                r9.a();
                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                lu0Var18.invoke(new c12(r9.c));
                                return mf3Var;
                            }
                            r7 = r6;
                            g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                            if (lu0Var17 != null) {
                                r7 = r6;
                                lu0Var17.invoke(new c12(x92Var9.c));
                                return mf3Var;
                            }
                        }
                    } else {
                        x92Var6 = x92Var5;
                        c53Var.e = p33Var4;
                        c53Var.f = coroutineScope10;
                        c53Var.g = tb2Var7;
                        c53Var.h = lu0Var14;
                        c53Var.i = lu0Var13;
                        c53Var.j = lu0Var12;
                        c53Var.k = jobLaunch$default2;
                        c53Var.l = x92Var4;
                        c53Var.m = x92Var6;
                        c53Var.o = 7;
                        objI2 = i(p33Var4, q92Var, c53Var);
                        if (objI2 != z70Var) {
                            x92Var6 = x92Var5;
                            tb2 tb2Var115 = tb2Var7;
                            job4 = jobLaunch$default2;
                            x92Var7 = x92Var6;
                            objJ2 = objI2;
                            lu0Var15 = lu0Var14;
                            lu0Var16 = lu0Var12;
                            p33Var5 = p33Var4;
                            x92Var8 = x92Var4;
                            tb2Var8 = tb2Var115;
                            sj1Var2 = (sj1) objJ2;
                            if (o51.f(sj1Var2, rj1Var)) {
                                lu0Var13.invoke(new c12(x92Var7.c));
                                c53Var.e = coroutineScope10;
                                c53Var.f = tb2Var8;
                                c53Var.g = job4;
                                c53Var.h = r6;
                                c53Var.i = r6;
                                c53Var.j = r6;
                                c53Var.k = r6;
                                c53Var.l = r6;
                                c53Var.m = r6;
                                c53Var.o = 8;
                                if (d(p33Var5, c53Var) != z70Var) {
                                    job6 = job4;
                                    coroutineScope12 = coroutineScope10;
                                    r8 = r6;
                                    g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                                    return mf3Var;
                                }
                            } else {
                                if (sj1Var2 instanceof qj1) {
                                    Job job19 = job4;
                                    tb2Var7 = tb2Var8;
                                    job5 = job19;
                                    lu0Var17 = lu0Var16;
                                    coroutineScope11 = coroutineScope10;
                                    r9 = ((qj1) sj1Var2).a;
                                    x92Var9 = x92Var8;
                                    lu0Var18 = lu0Var15;
                                } else {
                                    if (sj1Var2 instanceof pj1) {
                                        b81.d();
                                        return null;
                                    }
                                    Job job110 = job4;
                                    tb2Var7 = tb2Var8;
                                    job5 = job110;
                                    x92Var9 = x92Var8;
                                    lu0Var17 = lu0Var16;
                                    lu0Var18 = lu0Var15;
                                    coroutineScope11 = coroutineScope10;
                                    r9 = r6;
                                }
                                if (r9 != 0) {
                                    r7 = r6;
                                    r7 = r6;
                                    r9.a();
                                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                                    lu0Var18.invoke(new c12(r9.c));
                                    return mf3Var;
                                }
                                r7 = r6;
                                g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                                if (lu0Var17 != null) {
                                    r7 = r6;
                                    lu0Var17.invoke(new c12(x92Var9.c));
                                    return mf3Var;
                                }
                            }
                        }
                    }
                    x92Var6 = x92Var5;
                    x92Var6 = x92Var5;
                    return z70Var;
                }
                if (lu0Var12 != null) {
                    lu0Var12.invoke(new c12(x92Var4.c));
                    return mf3Var;
                }
                r7 = r6;
                return mf3Var;
            case Logger.ERROR /* 6 */:
                x92Var9 = (x92) c53Var.j;
                job5 = (Job) c53Var.i;
                lu0Var17 = c53Var.h;
                lu0Var18 = (lu0) c53Var.g;
                tb2Var7 = (tb2) c53Var.f;
                coroutineScope11 = (CoroutineScope) c53Var.e;
                ee0.J(objJ2);
                mf3Var = mf3Var;
                z = false;
                r7 = z;
                r9 = (x92) objJ2;
                if (r9 != 0) {
                    r7 = r6;
                    r7 = r6;
                    r9.a();
                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                    lu0Var18.invoke(new c12(r9.c));
                    return mf3Var;
                }
                r7 = r6;
                g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                if (lu0Var17 != null) {
                    r7 = r6;
                    lu0Var17.invoke(new c12(x92Var9.c));
                    return mf3Var;
                }
                r7 = r6;
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                x92Var7 = (x92) c53Var.m;
                x92 x92Var17 = (x92) c53Var.l;
                job4 = (Job) c53Var.k;
                lu0 lu0Var28 = (lu0) c53Var.j;
                lu0Var13 = (lu0) c53Var.i;
                lu0Var15 = c53Var.h;
                tb2 tb2Var20 = (tb2) c53Var.g;
                CoroutineScope coroutineScope20 = (CoroutineScope) c53Var.f;
                p33 p33Var9 = (p33) c53Var.e;
                ee0.J(objJ2);
                lu0Var16 = lu0Var28;
                rj1Var = rj1Var;
                mf3Var = mf3Var;
                coroutineScope10 = coroutineScope20;
                r6 = 0;
                p33Var5 = p33Var9;
                x92Var8 = x92Var17;
                tb2Var8 = tb2Var20;
                sj1Var2 = (sj1) objJ2;
                if (o51.f(sj1Var2, rj1Var)) {
                    lu0Var13.invoke(new c12(x92Var7.c));
                    c53Var.e = coroutineScope10;
                    c53Var.f = tb2Var8;
                    c53Var.g = job4;
                    c53Var.h = r6;
                    c53Var.i = r6;
                    c53Var.j = r6;
                    c53Var.k = r6;
                    c53Var.l = r6;
                    c53Var.m = r6;
                    c53Var.o = 8;
                    if (d(p33Var5, c53Var) != z70Var) {
                        job6 = job4;
                        coroutineScope12 = coroutineScope10;
                        r8 = r6;
                        g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                        return mf3Var;
                    }
                    x92Var6 = x92Var5;
                    x92Var6 = x92Var5;
                    return z70Var;
                }
                if (sj1Var2 instanceof qj1) {
                    Job job111 = job4;
                    tb2Var7 = tb2Var8;
                    job5 = job111;
                    lu0Var17 = lu0Var16;
                    coroutineScope11 = coroutineScope10;
                    r9 = ((qj1) sj1Var2).a;
                    x92Var9 = x92Var8;
                    lu0Var18 = lu0Var15;
                } else {
                    if (sj1Var2 instanceof pj1) {
                        b81.d();
                        return null;
                    }
                    Job job112 = job4;
                    tb2Var7 = tb2Var8;
                    job5 = job112;
                    x92Var9 = x92Var8;
                    lu0Var17 = lu0Var16;
                    lu0Var18 = lu0Var15;
                    coroutineScope11 = coroutineScope10;
                    r9 = r6;
                }
                if (r9 != 0) {
                    r7 = r6;
                    r7 = r6;
                    r9.a();
                    g(coroutineScope11, job5, new z43(tb2Var7, r7, 5));
                    lu0Var18.invoke(new c12(r9.c));
                    return mf3Var;
                }
                r7 = r6;
                g(coroutineScope11, job5, new z43(tb2Var7, r7, 6));
                if (lu0Var17 != null) {
                    r7 = r6;
                    lu0Var17.invoke(new c12(x92Var9.c));
                    return mf3Var;
                }
                r7 = r6;
                return mf3Var;
            case 8:
                job6 = (Job) c53Var.g;
                tb2Var8 = (tb2) c53Var.f;
                coroutineScope12 = (CoroutineScope) c53Var.e;
                ee0.J(objJ2);
                mf3Var = mf3Var;
                r8 = 0;
                g(coroutineScope12, job6, new z43(tb2Var8, r8, 7));
                return mf3Var;
            default:
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(p33 p33Var, q92 q92Var, r60 r60Var) throws Throwable {
        e53 e53Var;
        we2 we2Var;
        if (r60Var instanceof e53) {
            e53Var = (e53) r60Var;
            int i = e53Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                e53Var.g = i - Integer.MIN_VALUE;
            } else {
                e53Var = new e53(r60Var);
            }
        } else {
            e53Var = new e53(r60Var);
        }
        Object obj = e53Var.f;
        int i2 = e53Var.g;
        q60 q60Var = null;
        try {
            if (i2 == 0) {
                we2 we2VarJ = p91.j(obj);
                we2VarJ.e = pj1.a;
                long jC = p33Var.s().c();
                pu0 nr0Var = new nr0(q92Var, we2VarJ, q60Var, 4);
                e53Var.e = we2VarJ;
                e53Var.g = 1;
                Object objW = p33Var.w(jC, nr0Var, e53Var);
                Object obj2 = z70.e;
                if (objW == obj2) {
                    return obj2;
                }
                we2Var = we2VarJ;
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                we2Var = e53Var.e;
                ee0.J(obj);
            }
            return we2Var.e;
        } catch (r92 unused) {
            return rj1.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(defpackage.p33 r17, defpackage.q92 r18, defpackage.oq r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g53.j(p33, q92, oq):java.lang.Object");
    }
}
