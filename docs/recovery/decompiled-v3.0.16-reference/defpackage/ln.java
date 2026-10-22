package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ln implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ dv1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ xu0 l;

    public /* synthetic */ ln(dv1 dv1Var, Object obj, Object obj2, Object obj3, xu0 xu0Var, int i, int i2, int i3) {
        this.e = i3;
        this.f = dv1Var;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = xu0Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.g;
        xu0 xu0Var = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(i2 | 1);
                da0.g(this.f, (au0) obj5, (Double) obj4, (Double) obj3, (lu0) xu0Var, (f30) obj, iM0, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(i2 | 1);
                sb.C(this.f, (au2) obj5, (aw) obj4, (cw) obj3, (p10) xu0Var, (f30) obj, iM1, this.h);
                break;
        }
        return mf3Var;
    }
}
