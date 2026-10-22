package defpackage;

import com.vincenthzr.locationspoofer.data.motion.MotionController;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class l10 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ l10(sk3 sk3Var, pu0 pu0Var, pu0 pu0Var2, pu0 pu0Var3, int i, pu0 pu0Var4, en2 en2Var, pu0 pu0Var5) {
        this.e = 2;
        this.g = sk3Var;
        this.h = pu0Var;
        this.i = pu0Var2;
        this.j = pu0Var3;
        this.f = i;
        this.k = pu0Var4;
        this.l = en2Var;
        this.m = pu0Var5;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        final h82 h82Var;
        int i;
        int iN0;
        mm0 mm0Var;
        final Integer numValueOf;
        int iIntValue;
        int iN1;
        int iA;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        int i3 = this.f;
        Object obj9 = this.g;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                ((p10) obj9).l(this.h, this.i, this.j, this.k, this.l, this.m, (f30) obj, wc0.m0(i3) | 1);
                return mf3Var;
            case 1:
                ((Integer) obj2).getClass();
                wo0.a((MotionController.State) obj9, (j52) obj8, (au0) obj7, (au0) obj6, (au0) obj5, (au0) obj4, (au0) obj3, (f30) obj, wc0.m0(i3 | 1));
                return mf3Var;
            default:
                final sk3 sk3Var = (sk3) obj9;
                pu0 pu0Var = (pu0) obj5;
                en2 en2Var = (en2) obj4;
                pu0 pu0Var2 = (pu0) obj3;
                final h23 h23Var = (h23) obj;
                l50 l50Var = (l50) obj2;
                final int iH = l50.h(l50Var.a);
                final int iG = l50.g(l50Var.a);
                long jA = l50.a(l50Var.a, 0, 0, 0, 0, 10);
                int iD = sk3Var.d(h23Var, h23Var.getLayoutDirection());
                int iC = sk3Var.c(h23Var, h23Var.getLayoutDirection());
                int iA2 = sk3Var.a(h23Var);
                final h82 h82VarS = ((zq1) zy.n0(h23Var.z0(fn2.e, (pu0) obj8))).s(jA);
                int i4 = (-iD) - iC;
                int i5 = -iA2;
                final h82 h82VarS2 = ((zq1) zy.n0(h23Var.z0(fn2.g, (pu0) obj7))).s(m50.i(i4, i5, jA));
                h82 h82VarS3 = ((zq1) zy.n0(h23Var.z0(fn2.h, (pu0) obj6))).s(m50.i(i4, i5, jA));
                int i6 = h82VarS3.e;
                if (i6 == 0 && h82VarS3.f == 0) {
                    h82Var = h82VarS3;
                    i = i3;
                    mm0Var = null;
                } else {
                    int i7 = h82VarS3.f;
                    qa1 qa1Var = qa1.e;
                    if (i3 == 0) {
                        h82Var = h82VarS3;
                        iN0 = h23Var.getLayoutDirection() == qa1Var ? h23Var.n0(16.0f) + iD : ((iH - h23Var.n0(16.0f)) - i6) - iC;
                        i = i3;
                    } else {
                        h82Var = h82VarS3;
                        i = i3;
                        if (i == 2 || i == 3) {
                            iN0 = h23Var.getLayoutDirection() == qa1Var ? ((iH - h23Var.n0(16.0f)) - i6) - iC : h23Var.n0(16.0f) + iD;
                        } else {
                            iN0 = (((iH - i6) + iD) - iC) / 2;
                        }
                    }
                    mm0Var = new mm0();
                    mm0Var.a = iN0;
                    mm0Var.b = i7;
                }
                final h82 h82VarS4 = ((zq1) zy.n0(h23Var.z0(fn2.i, pu0Var))).s(jA);
                int i8 = 0;
                boolean z = h82VarS4.e == 0 && h82VarS4.f == 0;
                if (mm0Var != null) {
                    int i9 = mm0Var.b;
                    if (z || i == 3) {
                        iN1 = h23Var.n0(16.0f) + i9;
                        iA = sk3Var.a(h23Var);
                    } else {
                        iN1 = h82VarS4.f + i9;
                        iA = h23Var.n0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iA + iN1);
                } else {
                    numValueOf = null;
                }
                int i10 = h82VarS2.f;
                if (i10 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = !z ? Integer.valueOf(h82VarS4.f) : null;
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : sk3Var.a(h23Var);
                    }
                    i8 = iIntValue + i10;
                }
                final int i11 = i8;
                r31 r31Var = new r31(sk3Var, h23Var);
                en2Var.a.setValue(new b52(zm3.i(r31Var, h23Var.getLayoutDirection()), (h82VarS.e == 0 && h82VarS.f == 0) ? r31Var.d() : h23Var.U0(h82VarS.f), zm3.g(r31Var, h23Var.getLayoutDirection()), z ? r31Var.c() : h23Var.U0(h82VarS4.f)));
                final h82 h82VarS5 = ((zq1) zy.n0(h23Var.z0(fn2.f, pu0Var2))).s(jA);
                final mm0 mm0Var2 = mm0Var;
                return h23Var.H0(iH, iG, vj0.e, new lu0() { // from class: cn2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj10) {
                        g82 g82Var = (g82) obj10;
                        g82.z(g82Var, h82VarS5, 0, 0);
                        g82.z(g82Var, h82VarS, 0, 0);
                        h82 h82Var2 = h82VarS2;
                        int i12 = iH - h82Var2.e;
                        h23 h23Var2 = h23Var;
                        qa1 layoutDirection = h23Var2.getLayoutDirection();
                        sk3 sk3Var2 = sk3Var;
                        int iD2 = ((sk3Var2.d(h23Var2, layoutDirection) + i12) - sk3Var2.c(h23Var2, h23Var2.getLayoutDirection())) / 2;
                        int i13 = iG;
                        g82.z(g82Var, h82Var2, iD2, i13 - i11);
                        h82 h82Var3 = h82VarS4;
                        g82.z(g82Var, h82Var3, 0, i13 - h82Var3.f);
                        mm0 mm0Var3 = mm0Var2;
                        if (mm0Var3 != null) {
                            int i14 = mm0Var3.a;
                            Integer num = numValueOf;
                            num.getClass();
                            g82.z(g82Var, h82Var, i14, i13 - num.intValue());
                        }
                        return mf3.a;
                    }
                });
        }
    }

    public /* synthetic */ l10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.l = obj6;
        this.m = obj7;
        this.f = i;
    }
}
