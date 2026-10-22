package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vq implements g63 {
    public final p10 a;
    public final ry1 b = new ry1();
    public final w52 c = ke0.H(null);

    public vq(p10 p10Var) {
        this.a = p10Var;
    }

    @Override // defpackage.g63
    public final Object a(y53 y53Var, k33 k33Var) {
        Object objA = ry1.a(this.b, new ig(this, new uq(y53Var), null, 1), k33Var);
        return objA == z70.e ? objA : mf3.a;
    }

    public final void b(final au0 au0Var, f30 f30Var, final int i) {
        final au0 au0Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(723898654);
        int i2 = (ov0Var.f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            uq uqVar = (uq) this.c.getValue();
            if (uqVar == null) {
                ee2 ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0(this, au0Var, i, i3) { // from class: tq
                        public final /* synthetic */ int e;
                        public final /* synthetic */ vq f;
                        public final /* synthetic */ au0 g;

                        {
                            this.e = i3;
                            this.f = this;
                        }

                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.e;
                            mf3 mf3Var = mf3.a;
                            au0 au0Var3 = this.g;
                            vq vqVar = this.f;
                            f30 f30Var2 = (f30) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    vqVar.b(au0Var3, f30Var2, wc0.m0(7));
                                    break;
                                default:
                                    vqVar.b(au0Var3, f30Var2, wc0.m0(7));
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    return;
                }
                return;
            }
            au0Var2 = au0Var;
            this.a.b(uqVar, uqVar.a, au0Var2, ov0Var, 384);
        } else {
            au0Var2 = au0Var;
            ov0Var.W();
        }
        ee2 ee2VarT2 = ov0Var.t();
        if (ee2VarT2 != null) {
            ee2VarT2.d = new pu0(this, au0Var2, i, i4) { // from class: tq
                public final /* synthetic */ int e;
                public final /* synthetic */ vq f;
                public final /* synthetic */ au0 g;

                {
                    this.e = i4;
                    this.f = this;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.e;
                    mf3 mf3Var = mf3.a;
                    au0 au0Var3 = this.g;
                    vq vqVar = this.f;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            vqVar.b(au0Var3, f30Var2, wc0.m0(7));
                            break;
                        default:
                            vqVar.b(au0Var3, f30Var2, wc0.m0(7));
                            break;
                    }
                    return mf3Var;
                }
            };
        }
    }
}
