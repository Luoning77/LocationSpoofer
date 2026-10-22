package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class u2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ au0 f;

    public /* synthetic */ u2(int i, int i2, au0 au0Var) {
        this.e = i2;
        this.f = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        au0 au0Var = this.f;
        int i2 = 2;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    xq1.l(this.f, null, false, null, null, ks.b, ov0Var, 1572864, 62);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    zj.b(o51.c, null, sb.a0(-2048146653, new u2(i2, au0Var), ov0Var2), null, 0.0f, null, null, ov0Var2, 390, 250);
                }
                break;
            case 2:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    xq1.l(this.f, null, false, null, null, o51.d, ov0Var3, 1572864, 62);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ig0.a(au0Var, (f30) obj, wc0.m0(1));
                break;
            case 4:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                } else {
                    zj.b(am1.r, null, sb.a0(-609593075, new u2(6, au0Var), ov0Var4), null, 0.0f, null, null, ov0Var4, 390, 250);
                }
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                ee0.g(au0Var, (f30) obj, wc0.m0(1));
                break;
            case Logger.ERROR /* 6 */:
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ov0Var5.W();
                } else {
                    xq1.l(this.f, null, false, null, null, am1.s, ov0Var5, 1572864, 62);
                }
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ov0Var6.W();
                } else {
                    xq1.l(this.f, null, false, null, null, da0.o, ov0Var6, 1572864, 62);
                }
                break;
            case 8:
                f30 f30Var7 = (f30) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (!ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ov0Var7.W();
                } else {
                    zj.b(da0.n, null, sb.a0(-1526145429, new u2(7, au0Var), ov0Var7), null, 0.0f, null, null, ov0Var7, 390, 250);
                }
                break;
            default:
                f30 f30Var8 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (!ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ov0Var8.W();
                } else {
                    xq1.l(this.f, null, false, null, null, n51.D, ov0Var8, 1572864, 62);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ u2(int i, au0 au0Var) {
        this.e = i;
        this.f = au0Var;
    }
}
