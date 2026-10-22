package defpackage;

import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kn implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ kn(ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.f = ey1Var;
        this.g = ey1Var2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        ey1 ey1Var2 = this.f;
        switch (i) {
            case 0:
                ((ed0) obj).getClass();
                return new nn(0, ey1Var2, ey1Var);
            case 1:
                lr2 lr2Var = (lr2) obj;
                lr2Var.getClass();
                if (!((Boolean) ey1Var2.getValue()).booleanValue()) {
                    ((lu0) ey1Var.getValue()).invoke(lr2Var);
                }
                return mf3Var;
            case 2:
                lr2 lr2Var2 = (lr2) obj;
                lr2Var2.getClass();
                if (!((Boolean) ey1Var2.getValue()).booleanValue()) {
                    ey1Var.setValue(lr2Var2);
                }
                return mf3Var;
            case 3:
                ki0 ki0Var = (ki0) obj;
                ki0Var.getClass();
                ey1Var2.setValue(ki0Var);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case 4:
                ji0 ji0Var = (ji0) obj;
                ji0Var.getClass();
                ey1Var2.setValue(ji0Var);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case Logger.WARN /* 5 */:
                li0 li0Var = (li0) obj;
                li0Var.getClass();
                ey1Var2.setValue(li0Var);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                lu0 lu0Var = (lu0) ey1Var2.getValue();
                if (lu0Var != null) {
                    lu0Var.invoke(bool);
                }
                ((m82) ((jx0) ey1Var.getValue())).a(zBooleanValue ? 21 : 22);
                return mf3Var;
        }
    }
}
