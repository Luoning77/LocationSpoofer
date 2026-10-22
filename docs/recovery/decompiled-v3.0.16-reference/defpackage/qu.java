package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qu implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ xu0 h;

    public /* synthetic */ qu(long j, Object obj, xu0 xu0Var, int i) {
        this.e = i;
        this.f = j;
        this.g = obj;
        this.h = xu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        xu0 xu0Var = this.h;
        Object obj3 = this.g;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    hd0.i(this.f, ((je3) ov0Var.j(le3.a)).m, sb.a0(417635459, new pu(objArr == true ? 1 : 0, (z42) obj3, (qu0) xu0Var), ov0Var), ov0Var, 384);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    h73.e(this.f, (q93) obj3, (pu0) xu0Var, ov0Var2, 0);
                }
                break;
        }
        return mf3Var;
    }
}
