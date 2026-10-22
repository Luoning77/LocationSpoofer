package defpackage;

import com.vincenthzr.locationspoofer.MainActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class tk1 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ s03 h;

    public /* synthetic */ tk1(boolean z, MainActivity mainActivity, s03 s03Var) {
        this.e = 2;
        this.g = z;
        this.f = mainActivity;
        this.h = s03Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        f30 f30Var = (f30) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return MainActivity.onCreate$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(this.f, this.g, this.h, f30Var, iIntValue);
            case 1:
                return MainActivity.onCreate$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(this.f, this.g, this.h, f30Var, iIntValue);
            default:
                return MainActivity.onCreate$lambda$10$lambda$9$lambda$8$lambda$7(this.g, this.f, this.h, f30Var, iIntValue);
        }
    }

    public /* synthetic */ tk1(MainActivity mainActivity, boolean z, s03 s03Var, int i) {
        this.e = i;
        this.f = mainActivity;
        this.g = z;
        this.h = s03Var;
    }
}
