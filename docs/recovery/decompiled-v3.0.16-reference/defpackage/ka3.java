package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ka3 extends cv1 implements ya1 {
    public ix1 s;
    public boolean t;
    public yz2 u;
    public boolean v;
    public oh w;
    public oh x;
    public float y;
    public float z;

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.cv1
    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new d6(this, (q60) null, 25), 3, null);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        float f;
        float f2 = xp1.G;
        int i = 0;
        int i2 = 1;
        boolean z = (zq1Var.w(l50.h(j)) == 0 || zq1Var.s0(l50.g(j)) == 0) ? false : true;
        if (this.v) {
            f = xp1.z;
        } else {
            f = (z || this.t) ? b43.a : b43.b;
        }
        float fR = gr1Var.R(f);
        oh ohVar = this.x;
        int iFloatValue = (int) (ohVar != null ? ((Number) ohVar.d()).floatValue() : fR);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            r21.a("width and height must be >= 0");
        }
        h82 h82VarS = zq1Var.s(m50.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fR2 = gr1Var.R((b43.d - gr1Var.X0(fR)) / 2.0f);
        float fR3 = gr1Var.R((b43.c - b43.a) - b43.e);
        boolean z2 = this.v;
        if (z2 && this.t) {
            fR2 = fR3 - gr1Var.R(f2);
        } else if (z2 && !this.t) {
            fR2 = gr1Var.R(f2);
        } else if (this.t) {
            fR2 = fR3;
        }
        oh ohVar2 = this.x;
        q60 q60Var = null;
        Float f3 = ohVar2 != null ? (Float) ohVar2.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fR) {
            BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new ja3(this, fR, q60Var, i), 3, null);
        }
        oh ohVar3 = this.w;
        Float f4 = ohVar3 != null ? (Float) ohVar3.e.getValue() : null;
        if (f4 == null || f4.floatValue() != fR2) {
            BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new ja3(this, fR2, q60Var, i2), 3, null);
        }
        if (Float.isNaN(this.z) && Float.isNaN(this.y)) {
            this.z = fR;
            this.y = fR2;
        }
        return gr1Var.H0(iFloatValue, iFloatValue, vj0.e, new fc(h82VarS, this, fR2));
    }
}
