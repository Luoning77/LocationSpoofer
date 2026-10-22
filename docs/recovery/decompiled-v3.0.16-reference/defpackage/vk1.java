package defpackage;

import com.vincenthzr.locationspoofer.MainActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vk1 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk1(MainActivity mainActivity, int i) {
        super(0);
        this.f = i;
        this.g = mainActivity;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        MainActivity mainActivity = this.g;
        switch (i) {
            case 0:
                oj3 viewModelStore = mainActivity.getViewModelStore();
                c80 defaultViewModelCreationExtras = mainActivity.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                kn2 kn2VarT = o51.t(mainActivity);
                ox oxVarA = xe2.a(ul1.class);
                viewModelStore.getClass();
                return ee0.G(oxVarA, viewModelStore, defaultViewModelCreationExtras, kn2VarT);
            default:
                oj3 viewModelStore2 = mainActivity.getViewModelStore();
                c80 defaultViewModelCreationExtras2 = mainActivity.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras2.getClass();
                kn2 kn2VarT2 = o51.t(mainActivity);
                ox oxVarA2 = xe2.a(l6.class);
                viewModelStore2.getClass();
                return ee0.G(oxVarA2, viewModelStore2, defaultViewModelCreationExtras2, kn2VarT2);
        }
    }
}
