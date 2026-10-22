package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class j70 implements lu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ j70(me1 me1Var, boolean z, qk3 qk3Var, x73 x73Var, f83 f83Var, e12 e12Var) {
        this.g = me1Var;
        this.f = z;
        this.h = qk3Var;
        this.i = x73Var;
        this.j = f83Var;
        this.k = e12Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        p83 p83Var;
        pa1 pa1Var;
        pa1 pa1Var2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                me1 me1Var = (me1) obj6;
                w52 w52Var = me1Var.o;
                qk3 qk3Var = (qk3) obj5;
                x73 x73Var = (x73) obj4;
                f83 f83Var = (f83) obj3;
                e12 e12Var = (e12) obj2;
                pa1 pa1Var3 = (pa1) obj;
                me1Var.h = pa1Var3;
                y83 y83VarD = me1Var.d();
                if (y83VarD != null) {
                    y83VarD.b = pa1Var3;
                }
                if (z) {
                    if (me1Var.a() == dx0.f) {
                        if (((Boolean) me1Var.l.getValue()).booleanValue() && ((Boolean) ((ee1) qk3Var).c.getValue()).booleanValue()) {
                            x73Var.s();
                        } else {
                            x73Var.m();
                        }
                        me1Var.m.setValue(Boolean.valueOf(a83.g(x73Var, true)));
                        me1Var.n.setValue(Boolean.valueOf(a83.g(x73Var, false)));
                        w52Var.setValue(Boolean.valueOf(f93.c(f83Var.b)));
                    } else if (me1Var.a() == dx0.g) {
                        w52Var.setValue(Boolean.valueOf(a83.g(x73Var, true)));
                    }
                    k22.E(me1Var, f83Var, e12Var);
                    y83 y83VarD2 = me1Var.d();
                    if (y83VarD2 != null && (p83Var = me1Var.e) != null && me1Var.b() && (pa1Var = y83VarD2.b) != null && pa1Var.U() && (pa1Var2 = y83VarD2.c) != null) {
                        x83 x83Var = y83VarD2.a;
                        w3 w3Var = new w3(pa1Var, 5);
                        pe2 pe2VarA = n51.A(pa1Var);
                        pe2 pe2VarD0 = pa1Var.d0(pa1Var2, false);
                        if (o51.f((p83) p83Var.a.b.get(), p83Var)) {
                            p83Var.b.h(f83Var, e12Var, x83Var, w3Var, pe2VarA, pe2VarD0);
                        }
                    }
                }
                break;
            default:
                jx0 jx0Var = (jx0) obj6;
                s52 s52Var = (s52) obj5;
                s52 s52Var2 = (s52) obj4;
                ey1 ey1Var = (ey1) obj3;
                ey1 ey1Var2 = (ey1) obj2;
                s52Var.h((((Float) obj).floatValue() / 2.0f) + s52Var.g());
                s52Var2.h(z ? mh0.u(s52Var.g(), -21.0f, 0.0f) : mh0.u(s52Var.g(), 0.0f, 21.0f));
                float fG = s52Var2.g();
                if (-11.0f <= fG && fG <= -10.0f) {
                    ey1Var.setValue(Boolean.FALSE);
                } else {
                    float fG2 = s52Var2.g();
                    if (10.0f <= fG2 && fG2 <= 11.0f) {
                        ey1Var.setValue(Boolean.FALSE);
                    } else {
                        float fG3 = s52Var2.g();
                        if (-20.0f <= fG3 && fG3 <= -1.0f) {
                            ey1Var2.setValue(Boolean.FALSE);
                        } else {
                            float fG4 = s52Var2.g();
                            if (1.0f <= fG4 && fG4 <= 20.0f) {
                                ey1Var2.setValue(Boolean.FALSE);
                            } else if (!((Boolean) ey1Var2.getValue()).booleanValue()) {
                                if ((z && s52Var2.g() == -21.0f) || (!z && s52Var2.g() == 0.0f)) {
                                    ((m82) jx0Var).a(22);
                                    Boolean bool = Boolean.TRUE;
                                    ey1Var2.setValue(bool);
                                    ey1Var.setValue(bool);
                                } else if ((z && s52Var2.g() == 0.0f) || (!z && s52Var2.g() == 21.0f)) {
                                    ((m82) jx0Var).a(21);
                                    Boolean bool2 = Boolean.TRUE;
                                    ey1Var2.setValue(bool2);
                                    ey1Var.setValue(bool2);
                                }
                            }
                        }
                    }
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ j70(boolean z, jx0 jx0Var, s52 s52Var, s52 s52Var2, ey1 ey1Var, ey1 ey1Var2) {
        this.f = z;
        this.g = jx0Var;
        this.h = s52Var;
        this.i = s52Var2;
        this.j = ey1Var;
        this.k = ey1Var2;
    }
}
