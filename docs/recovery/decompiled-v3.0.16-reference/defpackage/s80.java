package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class s80 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ au0 f;
    public final /* synthetic */ long g;

    public /* synthetic */ s80(long j, au0 au0Var) {
        this.e = 2;
        this.g = j;
        this.f = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        final long j = this.g;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    n51.j(this.f, null, false, null, null, null, sb.a0(1690791308, new qu0() { // from class: o80
                        @Override // defpackage.qu0
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            f30 f30Var2 = (f30) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((lk2) obj3).getClass();
                            ov0 ov0Var2 = (ov0) f30Var2;
                            if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                s83.b(ke0.N(2131624085, ov0Var2), null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262138);
                            } else {
                                ov0Var2.W();
                            }
                            return mf3.a;
                        }
                    }, ov0Var), ov0Var, 805306368, 510);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    xq1.l(this.f, null, false, null, null, sb.a0(2091412017, new p80(6, j), ov0Var2), ov0Var2, 1572864, 62);
                }
                break;
            default:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    zj.b(n51.C, null, sb.a0(1800485233, new u2(9, this.f), ov0Var3), null, 0.0f, null, k93.k(j, ov0Var3), ov0Var3, 390, 186);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ s80(au0 au0Var, long j, int i) {
        this.e = i;
        this.f = au0Var;
        this.g = j;
    }
}
