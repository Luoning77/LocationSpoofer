package defpackage;

import com.vincenthzr.locationspoofer.MainActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class uk1 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ uk1(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        MainActivity mainActivity = this.f;
        f30 f30Var = (f30) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return MainActivity.onCreate$lambda$10(mainActivity, f30Var, iIntValue);
            default:
                return MainActivity.onCreate$lambda$10$lambda$9(mainActivity, f30Var, iIntValue);
        }
    }
}
