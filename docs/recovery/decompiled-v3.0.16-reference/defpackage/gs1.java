package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudEntitlements;
import com.vincenthzr.locationspoofer.data.cloud.MembershipCatalog;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gs1 extends k33 implements qu0 {
    public MembershipCatalog e;
    public CloudEntitlements f;
    public List g;
    public int h;
    public /* synthetic */ String i;
    public /* synthetic */ long j;
    public final /* synthetic */ is1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs1(is1 is1Var, q60 q60Var) {
        super(3, q60Var);
        this.k = is1Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        gs1 gs1Var = new gs1(this.k, (q60) obj3);
        gs1Var.i = (String) obj;
        gs1Var.j = jLongValue;
        return gs1Var.invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:37:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d A[EDGE_INSN: B:50:0x014d->B:51:0x014f BREAK  A[LOOP:2: B:46:0x0138->B:92:?]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x018b  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab A[PHI: r9 r12
      0x01ab: PHI (r9v1 java.util.List) = (r9v0 java.util.List), (r9v0 java.util.List), (r9v3 java.util.List) binds: [B:59:0x0189, B:61:0x018f, B:65:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r12v6 java.util.List) = (r12v3 java.util.List), (r12v3 java.util.List), (r12v7 java.util.List) binds: [B:59:0x0189, B:61:0x018f, B:65:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8 A[EDGE_INSN: B:78:0x01e8->B:79:0x01ea BREAK  A[LOOP:0: B:73:0x01cf->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:91:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
    
        if (r1 == r15) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021d, code lost:
    
        if (r0.f(r1, r4, r6, r29) == r15) goto L81;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws org.json.JSONException, com.vincenthzr.locationspoofer.data.cloud.CloudException {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
