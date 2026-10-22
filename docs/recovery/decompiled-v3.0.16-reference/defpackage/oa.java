package defpackage;

import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oa extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h82 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa(h82 h82Var, int i) {
        super(1);
        this.f = i;
        this.g = h82Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        h82 h82Var = this.g;
        switch (i) {
            case 0:
                g82.z((g82) obj, h82Var, 0, 0);
                break;
            case 1:
                g82.B((g82) obj, h82Var, 0, 0);
                break;
            case 2:
                g82.z((g82) obj, h82Var, 0, 0);
                break;
            case 3:
                g82.z((g82) obj, h82Var, 0, 0);
                break;
            case 4:
                g82.z((g82) obj, h82Var, 0, 0);
                break;
            case Logger.WARN /* 5 */:
                g82.B((g82) obj, h82Var, 0, 0);
                break;
            default:
                g82.C((g82) obj, h82Var, 0, 0);
                break;
        }
        return mf3Var;
    }
}
