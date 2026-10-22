package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ku extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ oh g;
    public final /* synthetic */ float h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ s41 j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(oh ohVar, float f, boolean z, s41 s41Var, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 2;
        this.g = ohVar;
        this.h = f;
        this.i = z;
        this.j = s41Var;
        this.k = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new ku(this.g, this.h, this.i, (lu) obj2, this.j, q60Var, 0);
            case 1:
                return new ku(this.g, this.h, this.i, (cw) obj2, this.j, q60Var, 1);
            default:
                return new ku(this.g, this.h, this.i, this.j, (ey1) obj2, q60Var);
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
        }
        return ((ku) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r9.e(r1, r16) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (defpackage.qi0.a(r9, r10, r1, r14, r16) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r8;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(oh ohVar, float f, boolean z, Object obj, s41 s41Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ohVar;
        this.h = f;
        this.i = z;
        this.k = obj;
        this.j = s41Var;
    }
}
