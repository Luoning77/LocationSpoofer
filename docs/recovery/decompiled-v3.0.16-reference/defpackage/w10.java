package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w10 implements pu0 {
    public static final w10 f = new w10(0);
    public static final w10 g = new w10(1);
    public static final w10 h = new w10(2);
    public static final w10 i = new w10(3);
    public static final w10 j = new w10(4);
    public static final w10 k = new w10(5);
    public final /* synthetic */ int e;

    public /* synthetic */ w10(int i2) {
        this.e = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        switch (i2) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                }
                return mf3Var;
            case 3:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                }
                return mf3Var;
            case 4:
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ov0Var5.W();
                }
                return mf3Var;
            default:
                long j2 = ((hz) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(xp1.T(j2));
        }
    }
}
