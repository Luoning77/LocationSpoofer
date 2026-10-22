package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ed1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ gd1 f;

    public /* synthetic */ ed1(gd1 gd1Var, int i) {
        this.e = i;
        this.f = gd1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        gd1 gd1Var = this.f;
        switch (i) {
            case 0:
                yd1 yd1Var = gd1Var.t.b;
                return Float.valueOf((((t52) yd1Var.e.b).g() * 500) + ((t52) yd1Var.e.c).g());
            case 1:
                yd1 yd1Var2 = gd1Var.t.b;
                int iG = ((t52) yd1Var2.e.b).g();
                int iG2 = ((t52) yd1Var2.e.c).g();
                return Float.valueOf(yd1Var2.c() ? (iG * 500) + iG2 + 100.0f : (iG * 500) + iG2);
            default:
                yd1 yd1Var3 = gd1Var.t.b;
                int iG3 = (int) (yd1Var3.h().o == x32.e ? yd1Var3.h().g() & 4294967295L : yd1Var3.h().g() >> 32);
                yd1 yd1Var4 = gd1Var.t.b;
                return Float.valueOf(iG3 - ((-yd1Var4.h().l) + yd1Var4.h().p));
        }
    }
}
