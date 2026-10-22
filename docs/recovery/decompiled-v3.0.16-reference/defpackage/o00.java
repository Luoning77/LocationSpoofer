package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class o00 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ o00(l6 l6Var, boolean z) {
        this.f = l6Var;
        this.g = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        boolean z = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                da0.i(this.f, z, (f30) obj, wc0.m0(1));
                break;
            default:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    l6 l6Var = this.f;
                    boolean zH = ov0Var.h(l6Var);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == d30.a) {
                        t4 t4Var = new t4(0, l6Var, l6.class, "dismissCompanionPreview", "dismissCompanionPreview()V", 0, 18);
                        ov0Var.m0(t4Var);
                        objQ = t4Var;
                    }
                    n51.j((au0) ((o81) objQ), null, !z, null, null, null, sb.o, ov0Var, 805306368, 506);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ o00(l6 l6Var, boolean z, int i) {
        this.f = l6Var;
        this.g = z;
    }
}
