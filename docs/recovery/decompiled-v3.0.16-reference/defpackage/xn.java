package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xn implements yn, vn {
    public final /* synthetic */ vn e;
    public final qa1 f;

    public xn(vn vnVar, qa1 qa1Var) {
        this.e = vnVar;
        this.f = qa1Var;
    }

    @Override // defpackage.xb0
    public final long A0(long j) {
        return this.e.A0(j);
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.e.D();
    }

    @Override // defpackage.xb0
    public final float G0(long j) {
        return this.e.G0(j);
    }

    @Override // defpackage.g51
    public final boolean J() {
        return this.e.J();
    }

    @Override // defpackage.xb0
    public final long O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.xb0
    public final long P(long j) {
        return this.e.P(j);
    }

    @Override // defpackage.xb0
    public final long Q0(float f) {
        return this.e.Q0(f);
    }

    @Override // defpackage.xb0
    public final float R(float f) {
        return this.e.R(f);
    }

    @Override // defpackage.xb0
    public final float U0(int i) {
        return this.e.U0(i);
    }

    @Override // defpackage.xb0
    public final float X0(float f) {
        return this.e.X0(f);
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        return this.e.e0(j);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.g();
    }

    @Override // defpackage.g51
    public final qa1 getLayoutDirection() {
        return this.f;
    }

    @Override // defpackage.gr1
    public final fr1 m0(int i, int i2, Map map, lu0 lu0Var, lu0 lu0Var2) {
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            p21.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new wn(i3, i4, map, lu0Var, 0);
    }

    @Override // defpackage.xb0
    public final int n0(float f) {
        return this.e.n0(f);
    }
}
