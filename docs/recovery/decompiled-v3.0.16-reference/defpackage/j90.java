package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j90 {
    public final CoroutineScope a;
    public final fy b;
    public final xc c;
    public final cd d;
    public final f9 e;
    public final ed f;
    public final yz2 g;
    public final yz2 h;
    public final yz2 i;
    public final yz2 j;
    public final yz2 k;
    public final oh l;
    public final oh m;
    public final oh n;
    public final oh o;
    public final oh p;
    public final ry1 q;
    public final us1 r;
    public final dv1 s;

    public j90(CoroutineScope coroutineScope, float f, fy fyVar, xc xcVar, cd cdVar, f9 f9Var, ed edVar) {
        Float fValueOf = Float.valueOf(0.001f);
        coroutineScope.getClass();
        this.a = coroutineScope;
        this.b = fyVar;
        this.c = xcVar;
        this.d = cdVar;
        this.e = f9Var;
        this.f = edVar;
        this.g = new yz2(1.0f, 1000.0f, fValueOf);
        this.h = new yz2(0.5f, 300.0f, Float.valueOf(0.010000001f));
        this.i = new yz2(1.0f, 1000.0f, fValueOf);
        this.j = new yz2(0.6f, 250.0f, fValueOf);
        this.k = new yz2(0.7f, 250.0f, fValueOf);
        this.l = k22.a(f, 0.001f);
        this.m = k22.a(0.0f, 5.0f);
        this.n = k22.a(0.0f, 0.001f);
        this.o = k22.a(1.0f, 0.001f);
        this.p = k22.a(1.0f, 0.001f);
        this.q = new ry1();
        this.r = new us1(26, (byte) 0);
        this.s = m33.a(av1.a, mf3.a, new qc(this, 1));
    }

    public final float a() {
        return ((Number) this.n.d()).floatValue();
    }

    public final float b() {
        return ((Number) this.l.d()).floatValue();
    }
}
