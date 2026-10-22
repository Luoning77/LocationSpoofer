package defpackage;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class l90 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ l90(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        String string;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Context context = this.f;
        switch (i) {
            case 0:
                Toast.makeText(context, context.getString(((Boolean) obj).booleanValue() ? 2131624454 : 2131624451), 0).show();
                return mf3Var;
            case 1:
                Toast.makeText(context, context.getString(((Boolean) obj).booleanValue() ? 2131624454 : 2131624451), 0).show();
                return mf3Var;
            case 2:
                vm0 vm0Var = (vm0) obj;
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
            default:
                Integer num = (Integer) obj;
                num.intValue();
                Toast.makeText(context, context.getString(2131624861, num), 0).show();
                return mf3Var;
        }
    }
}
