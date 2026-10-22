package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ih3 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ jh3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih3(jh3 jh3Var, int i) {
        super(1);
        this.f = i;
        this.g = jh3Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        jh3 jh3Var = this.g;
        switch (i) {
            case 0:
                jh3Var.d = true;
                jh3Var.f.invoke();
                return mf3Var;
            default:
                jg0 jg0Var = (jg0) obj;
                vw0 vw0Var = jh3Var.b;
                float f = jh3Var.k;
                float f2 = jh3Var.l;
                gn gnVarX = jg0Var.X();
                long jR = gnVarX.r();
                gnVarX.i().l();
                try {
                    ((t1) gnVarX.a).B(f, f2, 0L);
                    vw0Var.a(jg0Var);
                    return mf3Var;
                } finally {
                    p91.v(gnVarX, jR);
                }
        }
    }
}
