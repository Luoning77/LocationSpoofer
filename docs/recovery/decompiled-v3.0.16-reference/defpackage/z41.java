package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z41 {
    public final CoroutineScope a;
    public final p2 b;
    public final yz2 c;
    public final yz2 d;
    public final oh e;
    public final oh f;
    public long g;
    public final dv1 h;
    public final dv1 i;

    public z41(CoroutineScope coroutineScope, p2 p2Var) {
        coroutineScope.getClass();
        this.a = coroutineScope;
        this.b = p2Var;
        this.c = new yz2(0.5f, 300.0f, Float.valueOf(0.001f));
        this.d = new yz2(0.5f, 300.0f, new c12((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)));
        this.e = k22.a(0.0f, 0.001f);
        this.f = new oh(new c12(0L), o51.A0, new c12((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 8);
        this.g = 0L;
        w41 w41Var = new w41(this, 0);
        av1 av1Var = av1.a;
        this.h = xp1.w(av1Var, w41Var);
        this.i = m33.a(av1Var, coroutineScope, new qc(this, 2));
    }
}
