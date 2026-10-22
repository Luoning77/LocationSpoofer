package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dz1 {
    public hz1 a;
    public hz1 b;
    public au0 c = new ye(this, 17);
    public CoroutineScope d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, defpackage.r60 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.bz1
            if (r0 == 0) goto L14
            r0 = r12
            bz1 r0 = (defpackage.bz1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            bz1 r0 = new bz1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.e
            int r1 = r12.g
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ee0.J(r0)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r2
        L31:
            defpackage.ee0.J(r0)
            goto L55
        L35:
            defpackage.ee0.J(r0)
            hz1 r0 = r7.a
            if (r0 == 0) goto L41
            hz1 r0 = r0.n1()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            z70 r1 = defpackage.z70.e
            if (r0 != 0) goto L5a
            hz1 r7 = r7.b
            if (r7 == 0) goto L72
            r12.g = r4
            java.lang.Object r0 = r7.I0(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            yh3 r0 = (defpackage.yh3) r0
            long r5 = r0.a
            goto L72
        L5a:
            hz1 r7 = r7.a
            if (r7 == 0) goto L62
            hz1 r2 = r7.n1()
        L62:
            r7 = r2
            if (r7 == 0) goto L72
            r12.g = r3
            java.lang.Object r0 = r7.I0(r8, r10, r12)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            yh3 r0 = (defpackage.yh3) r0
            long r5 = r0.a
        L72:
            yh3 r7 = new yh3
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.a(long, long, r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, r60 r60Var) {
        cz1 cz1Var;
        long j2;
        if (r60Var instanceof cz1) {
            cz1Var = (cz1) r60Var;
            int i = cz1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz1Var.g = i - Integer.MIN_VALUE;
            } else {
                cz1Var = new cz1(this, r60Var);
            }
        } else {
            cz1Var = new cz1(this, r60Var);
        }
        Object objF0 = cz1Var.e;
        int i2 = cz1Var.g;
        if (i2 == 0) {
            ee0.J(objF0);
            hz1 hz1Var = this.a;
            hz1 hz1VarN1 = hz1Var != null ? hz1Var.n1() : null;
            if (hz1VarN1 != null) {
                cz1Var.g = 1;
                objF0 = hz1VarN1.F0(j, cz1Var);
                z70 z70Var = z70.e;
                if (objF0 == z70Var) {
                    return z70Var;
                }
            } else {
                j2 = 0;
            }
            return new yh3(j2);
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(objF0);
        j2 = ((yh3) objF0).a;
        return new yh3(j2);
    }

    public final CoroutineScope c() {
        CoroutineScope coroutineScope = (CoroutineScope) this.c.invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        fo.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
