package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a43 extends k33 implements qu0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ jx0 f;
    public final /* synthetic */ s52 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ix1 k;
    public final /* synthetic */ s52 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a43(boolean z, jx0 jx0Var, s52 s52Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ix1 ix1Var, s52 s52Var2, q60 q60Var) {
        super(3, q60Var);
        this.e = z;
        this.f = jx0Var;
        this.g = s52Var;
        this.h = ey1Var;
        this.i = ey1Var2;
        this.j = ey1Var3;
        this.k = ix1Var;
        this.l = s52Var2;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        ix1 ix1Var = this.k;
        s52 s52Var = this.l;
        a43 a43Var = new a43(this.e, this.f, this.g, this.h, this.i, this.j, ix1Var, s52Var, (q60) obj3);
        mf3 mf3Var = mf3.a;
        a43Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        lu0 lu0Var;
        ee0.J(obj);
        s52 s52Var = this.g;
        float fAbs = Math.abs(s52Var.g());
        boolean z = this.e;
        if (fAbs > 10.5f && (lu0Var = (lu0) this.h.getValue()) != null) {
            lu0Var.invoke(Boolean.valueOf(!z));
        }
        if (!((Boolean) this.i.getValue()).booleanValue() && Math.abs(s52Var.g()) >= 1.0f) {
            jx0 jx0Var = this.f;
            if ((z && s52Var.g() <= -11.0f) || (!z && s52Var.g() <= 10.0f)) {
                ((m82) jx0Var).a(22);
            } else if ((z && s52Var.g() >= -10.0f) || (!z && s52Var.g() >= 11.0f)) {
                ((m82) jx0Var).a(21);
            }
        }
        mf0 mf0Var = (mf0) this.j.getValue();
        if (mf0Var != null) {
            this.k.a.tryEmit(new nf0(mf0Var));
        }
        s52Var.h(0.0f);
        this.l.h(0.0f);
        return mf3.a;
    }
}
