package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class db0 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ db0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                long j = ((hz) obj).a;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ov0) f30Var).e(j) ? 4 : 2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ov0Var.W();
                } else {
                    eb0.b(((e63) obj4).c, j, ov0Var, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    ((pu0) obj4).invoke(ov0Var2, 0);
                }
                break;
            case 2:
                long j2 = ((hz) obj).a;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    u92.s.i((Drawable) obj4, ov0Var3, 48);
                }
                break;
            default:
                long j3 = ((hz) obj).a;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    u92.s.j(((RemoteAction) obj4).getIcon(), ov0Var4, 48);
                }
                break;
        }
        return mf3Var;
    }
}
