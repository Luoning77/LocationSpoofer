package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ds1 extends k33 implements qu0 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ long g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds1(CoroutineScope coroutineScope, ey1 ey1Var, ix1 ix1Var, q60 q60Var) {
        super(3, q60Var);
        this.i = coroutineScope;
        this.j = ey1Var;
        this.k = ix1Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                ds1 ds1Var = new ds1((is1) obj5, (bs1) obj4, (q60) obj3);
                ds1Var.i = (String) obj;
                ds1Var.g = jLongValue;
                return ds1Var.invokeSuspend(mf3Var);
            default:
                long j = ((c12) obj2).a;
                ds1 ds1Var2 = new ds1((CoroutineScope) this.i, (ey1) obj5, (ix1) obj4, (q60) obj3);
                ds1Var2.h = (qb2) obj;
                ds1Var2.g = j;
                return ds1Var2.invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6 A[Catch: CloudException -> 0x0153, PHI: r0 r1 r6
      0x01d6: PHI (r0v15 com.vincenthzr.locationspoofer.data.cloud.MembershipOrder) = 
      (r0v13 com.vincenthzr.locationspoofer.data.cloud.MembershipOrder)
      (r0v13 com.vincenthzr.locationspoofer.data.cloud.MembershipOrder)
      (r0v21 com.vincenthzr.locationspoofer.data.cloud.MembershipOrder)
     binds: [B:58:0x01bc, B:60:0x01d2, B:32:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r1v15 java.lang.String) = (r1v13 java.lang.String), (r1v13 java.lang.String), (r1v18 java.lang.String) binds: [B:58:0x01bc, B:60:0x01d2, B:32:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r6v10 ds1) = (r6v8 ds1), (r6v8 ds1), (r6v0 ds1) binds: [B:58:0x01bc, B:60:0x01d2, B:32:0x00d4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CloudException -> 0x0153, blocks: (B:62:0x01d6, B:42:0x010f, B:43:0x0130, B:45:0x0136, B:47:0x014f, B:50:0x0157, B:51:0x016c, B:53:0x0172, B:55:0x018a, B:57:0x0191, B:59:0x01be), top: B:89:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:77:0x0251  */
    /* JADX WARN: Code duplicated, block: B:79:0x026c  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0225, code lost:
    
        if (r2 == r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0279, code lost:
    
        if (r6 == r9) goto L81;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds1(is1 is1Var, bs1 bs1Var, q60 q60Var) {
        super(3, q60Var);
        this.j = is1Var;
        this.k = bs1Var;
    }
}
