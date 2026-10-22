package defpackage;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class w00 implements z12 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ w00(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // defpackage.z12
    public final void a(ComponentActivity componentActivity) {
        int i = this.a;
        ComponentActivity componentActivity2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity._init_$lambda$5(componentActivity2, componentActivity);
                break;
            default:
                ((FragmentActivity) componentActivity2).lambda$init$3(componentActivity);
                break;
        }
    }
}
