package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zf0 implements lu0 {
    public final /* synthetic */ xb0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ kw0 g;

    public zf0(xb0 xb0Var, float f, kw0 kw0Var) {
        this.e = xb0Var;
        this.f = f;
        this.g = kw0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        jg0 jg0Var = (jg0) obj;
        jg0Var.getClass();
        xb0 xb0VarL = jg0Var.X().l();
        jg0Var.X().D(this.e);
        try {
            float f = this.f;
            gn gnVarX = jg0Var.X();
            long jR = gnVarX.r();
            gnVarX.i().l();
            try {
                ((t1) gnVarX.a).B(f, f, 0L);
                dh0.m(jg0Var, this.g);
                gnVarX.i().i();
                gnVarX.F(jR);
                jg0Var.X().D(xb0VarL);
                return mf3.a;
            } catch (Throwable th) {
                gnVarX.i().i();
                gnVarX.F(jR);
                throw th;
            }
        } catch (Throwable th2) {
            jg0Var.X().D(xb0VarL);
            throw th2;
        }
    }
}
