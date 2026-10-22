package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ch extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(long j, p33 p33Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 3;
        this.g = j;
        this.h = p33Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new ch((eh) obj2, this.g, q60Var, 0);
            case 1:
                return new ch((lo1) obj2, this.g, q60Var, 1);
            case 2:
                return new ch((oh) obj2, this.g, q60Var, 2);
            default:
                return new ch(this.g, (p33) obj2, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((ch) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(8, r13) == r7) goto L16;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(Object obj, long j, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
        this.g = j;
    }
}
