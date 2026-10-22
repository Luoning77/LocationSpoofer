package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uf0 extends kf0 {
    public vf0 N;
    public x32 O;
    public boolean P;
    public qu0 Q;
    public qu0 R;
    public boolean S;

    @Override // defpackage.kf0
    public final boolean E1() {
        return this.P;
    }

    @Override // defpackage.kf0
    public final Object q1(jf0 jf0Var, jf0 jf0Var2) {
        Object objA = this.N.a(new m(jf0Var, this, null, 8), jf0Var2);
        return objA == z70.e ? objA : mf3.a;
    }

    @Override // defpackage.kf0
    public final void v1(long j) {
        if (!this.r || o51.f(this.Q, sf0.a)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(a1(), null, CoroutineStart.UNDISPATCHED, new tf0(this, j, null), 1, null);
    }

    @Override // defpackage.kf0
    public final void w1(oe0 oe0Var) {
        if (!this.r || o51.f(this.R, sf0.b)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(a1(), null, CoroutineStart.UNDISPATCHED, new m(this, oe0Var, null, 9), 1, null);
    }
}
