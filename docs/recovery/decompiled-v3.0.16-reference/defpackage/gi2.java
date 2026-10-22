package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gi2 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ boolean g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi2(int i, q60 q60Var, Object obj, Object obj2, boolean z) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
        this.g = z;
        this.j = obj2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                gi2 gi2Var = new gi2(0, q60Var, (ii2) obj3, (String[]) obj2, this.g);
                gi2Var.h = obj;
                return gi2Var;
            default:
                return new gi2(1, q60Var, (ey1) obj3, (ix1) obj2, this.g);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((gi2) create((xb3) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((gi2) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[PHI: r0
      0x00be: PHI (r0v7 xb3) = (r0v4 xb3), (r0v4 xb3), (r0v9 xb3) binds: [B:35:0x00ac, B:37:0x00bb, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[PHI: r0
      0x00d3: PHI (r0v10 xb3) = (r0v7 xb3), (r0v12 xb3) binds: [B:40:0x00d0, B:27:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df A[PHI: r0 r11
      0x00df: PHI (r0v13 xb3) = (r0v10 xb3), (r0v15 xb3) binds: [B:43:0x00dc, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r11v13 java.lang.Object) = (r11v12 java.lang.Object), (r11v0 java.lang.Object) binds: [B:43:0x00dc, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5 A[PHI: r0
      0x00f5: PHI (r0v16 xb3) = (r0v13 xb3), (r0v18 xb3) binds: [B:48:0x00f2, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (defpackage.v63.a(r0, "VACUUM", r10) == r5) goto L52;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
