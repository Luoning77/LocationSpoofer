package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class um1 extends k33 implements pu0 {
    public int e;
    public int f;
    public final /* synthetic */ ul1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um1(ul1 ul1Var, q60 q60Var) {
        super(2, q60Var);
        this.g = ul1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new um1(this.g, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((um1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x011a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0134 A[PHI: r1
      0x0134: PHI (r1v8 java.lang.Object) = (r1v5 java.lang.Object), (r1v16 java.lang.Object) binds: [B:22:0x0130, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0112, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r107) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0219, code lost:
    
        if (r0 == r7) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0112 -> B:20:0x0116). Please report as a decompilation issue!!! */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r108) {
        /*
            Method dump skipped, instruction units count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
