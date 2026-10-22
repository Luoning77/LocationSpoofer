package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bn1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ Job g;
    public final /* synthetic */ we2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(ul1 ul1Var, Job job, we2 we2Var, q60 q60Var) {
        super(2, q60Var);
        this.f = ul1Var;
        this.g = job;
        this.h = we2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new bn1(this.f, this.g, this.h, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((bn1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[PHI: r4
      0x0057: PHI (r4v8 java.lang.Boolean) = (r4v6 java.lang.Boolean), (r4v15 java.lang.Boolean) binds: [B:23:0x0055, B:28:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x024e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0261  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r4 == r10) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0276, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r2, r3, r109) == r10) goto L71;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r110) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
