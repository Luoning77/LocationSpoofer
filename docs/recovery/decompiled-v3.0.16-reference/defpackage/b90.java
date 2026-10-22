package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b90 extends k33 implements pu0 {
    public wb3 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ii2 j;
    public final /* synthetic */ lu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(q60 q60Var, lu0 lu0Var, ii2 ii2Var, boolean z, boolean z2) {
        super(2, q60Var);
        this.h = z;
        this.i = z2;
        this.j = ii2Var;
        this.k = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        b90 b90Var = new b90(q60Var, this.k, this.j, this.h, this.i);
        b90Var.g = obj;
        return b90Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((b90) create((xb3) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[DONT_INVERT, PHI: r0 r12
      0x0098: PHI (r0v10 xb3) = (r0v7 xb3), (r0v15 xb3) binds: [B:32:0x0095, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r12v14 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:32:0x0095, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r12.b(r11) == r9) goto L37;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
