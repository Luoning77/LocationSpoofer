package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vr1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ co2 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ is1 k;
    public final /* synthetic */ s52 l;
    public final /* synthetic */ s52 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(boolean z, co2 co2Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, is1 is1Var, s52 s52Var, s52 s52Var2, q60 q60Var) {
        super(2, q60Var);
        this.f = z;
        this.g = co2Var;
        this.h = ey1Var;
        this.i = ey1Var2;
        this.j = ey1Var3;
        this.k = is1Var;
        this.l = s52Var;
        this.m = s52Var2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new vr1(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((vr1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        if (defpackage.co2.f(r11, r0, r10) == r6) goto L45;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
