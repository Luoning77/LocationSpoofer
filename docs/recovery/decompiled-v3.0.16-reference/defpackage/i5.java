package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ i5(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Context context = this.f;
        switch (i) {
            case 0:
                context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName())));
                break;
            case 1:
                Toast.makeText(context, context.getString(2131624554), 0).show();
                break;
            default:
                Toast.makeText(context, context.getString(2131624554), 0).show();
                break;
        }
        return mf3Var;
    }
}
