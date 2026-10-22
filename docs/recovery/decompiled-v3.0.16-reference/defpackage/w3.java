package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w3 implements lu0 {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ w3(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        String string;
        int i = this.e;
        boolean z = false;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((ArrayList) this.f).get(((Number) obj).intValue());
                return null;
            case 1:
                ((tv) this.f).cancel();
                return mf3Var;
            case 2:
                vm0 vm0Var = (vm0) obj;
                Context context = (Context) this.f;
                vm0Var.getClass();
                if (vm0Var instanceof sm0) {
                    string = context.getString(2131624456, ((sm0) vm0Var).a);
                } else if (vm0Var instanceof um0) {
                    string = context.getString(2131625124, ((um0) vm0Var).a);
                } else {
                    if (!vm0Var.equals(tm0.a)) {
                        b81.d();
                        return null;
                    }
                    string = context.getString(2131624455);
                }
                string.getClass();
                Toast.makeText(context, string, 0).show();
                return mf3Var;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ea2 ea2Var = (ea2) this.f;
                if (ea2Var != null) {
                    ea2Var.c = zBooleanValue;
                }
                return mf3Var;
            case 4:
                KeyEvent keyEvent = ((e91) obj).a;
                ar2 ar2Var = (ar2) this.f;
                if (ks.K.s(keyEvent) == d91.w) {
                    ar2Var.b();
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                float[] fArr = ((yq1) obj).a;
                pa1 pa1Var = (pa1) this.f;
                if (pa1Var.U()) {
                    wc0.F(pa1Var).Z(pa1Var, fArr);
                }
                return mf3Var;
        }
    }

    public /* synthetic */ w3() {
        this.e = 3;
    }
}
