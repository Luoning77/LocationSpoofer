package defpackage;

import com.vincenthzr.locationspoofer.LocationApp;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = yVar;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        av1 av1Var = av1.a;
        boolean z = false;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((y) obj3).a(0, ov0Var);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ = ov0Var2.Q();
                    if (objQ == d30.a) {
                        objQ = wa.k;
                        ov0Var2.m0(objQ);
                    }
                    sb.G(gs2.a(av1Var, false, (lu0) objQ), (pu0) ((ey1) obj3).getValue(), ov0Var2, 0);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                ck0 ck0Var = (ck0) obj;
                ck0 ck0Var2 = (ck0) obj2;
                ck0 ck0Var3 = ck0.g;
                if (ck0Var == ck0Var3 && ck0Var2 == ck0Var3 && !((lm0) obj3).a.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ((Number) obj2).intValue();
                ((x20) obj3).a(wc0.m0(1), (f30) obj);
                return mf3Var;
            case 4:
                dv1 dv1Var = (dv1) obj;
                dv1 dv1VarG = (bv1) obj2;
                f30 f30Var3 = (f30) obj3;
                if (dv1VarG instanceof b30) {
                    qu0 qu0Var = ((b30) dv1VarG).a;
                    da0.o(3, qu0Var);
                    dv1VarG = xp1.G(f30Var3, (dv1) qu0Var.invoke(av1Var, f30Var3, 0));
                }
                return dv1Var.d(dv1VarG);
            case Logger.WARN /* 5 */:
                ((Number) obj2).intValue();
                ((pc0) obj3).a(wc0.m0(1), (f30) obj);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((kn2) obj).getClass();
                ((r52) obj2).getClass();
                return (LocationApp) obj3;
            default:
                ((Number) obj2).intValue();
                ((ya2) obj3).a(wc0.m0(1), (f30) obj);
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, int i) {
        super(2);
        this.f = i;
        this.g = obj;
    }
}
