package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xc implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xc(boolean z, fy1 fy1Var, ey1 ey1Var, kc3 kc3Var, kc3 kc3Var2) {
        this.e = 1;
        this.f = z;
        this.g = fy1Var;
        this.h = ey1Var;
        this.i = kc3Var;
        this.j = kc3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        float fFloatValue;
        int i = this.e;
        float fFloatValue2 = 0.0f;
        mf3 mf3Var = mf3.a;
        boolean z = true;
        Object obj2 = this.j;
        Object obj3 = this.i;
        boolean z2 = this.f;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                xb0 xb0Var = (xb0) obj4;
                s52 s52Var = (s52) obj3;
                s52 s52Var2 = (s52) obj2;
                c12 c12Var = (c12) obj;
                j90 j90Var = ((ld) obj5).a;
                if (j90Var != null) {
                    if (s52Var.g() == 0.0f) {
                        z = false;
                    } else {
                        float fG = s52Var.g() * j90Var.b();
                        float fR = xb0Var.R(4.0f);
                        if (z2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (c12Var.a >> 32)) + fR + fG;
                        } else {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (c12Var.a >> 32)) + (((s52Var2.g() - fR) - s52Var.g()) - fG);
                        }
                        if (0.0f > fIntBitsToFloat || fIntBitsToFloat > s52Var2.g()) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                w52 w52Var = ((fy1) obj5).c;
                ey1 ey1Var = (ey1) obj4;
                s03 s03Var = (s03) obj3;
                s03 s03Var2 = (s03) obj2;
                ow0 ow0Var = (ow0) obj;
                float fFloatValue3 = 0.8f;
                if (z2) {
                    fFloatValue = ((Boolean) w52Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) s03Var.getValue()).floatValue();
                }
                ow0Var.l(fFloatValue);
                if (!z2) {
                    fFloatValue3 = ((Number) s03Var.getValue()).floatValue();
                } else if (((Boolean) w52Var.getValue()).booleanValue()) {
                    fFloatValue3 = 1.0f;
                }
                ow0Var.r(fFloatValue3);
                if (!z2) {
                    fFloatValue2 = ((Number) s03Var2.getValue()).floatValue();
                } else if (((Boolean) w52Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                ow0Var.d(fFloatValue2);
                ow0Var.o0(((ac3) ey1Var.getValue()).a);
                return mf3Var;
            default:
                me1 me1Var = (me1) obj5;
                vp0 vp0Var = (vp0) obj4;
                x73 x73Var = (x73) obj3;
                e12 e12Var = (e12) obj2;
                c12 c12Var2 = (c12) obj;
                if (me1Var.b()) {
                    ny2 ny2Var = me1Var.c;
                    if (ny2Var != null) {
                        ((nb0) ny2Var).b();
                    }
                } else {
                    vp0.a(vp0Var);
                }
                if (me1Var.b() && z2) {
                    if (me1Var.a() != dx0.f) {
                        y83 y83VarD = me1Var.d();
                        if (y83VarD != null) {
                            long j = c12Var2.a;
                            d31 d31Var = me1Var.d;
                            f70 f70Var = me1Var.v;
                            int iN = e12Var.n(y83VarD.b(j, true));
                            f70Var.invoke(f83.a((f83) d31Var.f, null, g93.a(iN, iN), 5));
                            if (((dj) me1Var.a.b).f.length() > 0) {
                                me1Var.k.setValue(dx0.g);
                            }
                        }
                    } else {
                        x73Var.d(c12Var2);
                    }
                }
                return mf3Var;
        }
    }

    public /* synthetic */ xc(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.f = z;
        this.i = obj3;
        this.j = obj4;
    }
}
