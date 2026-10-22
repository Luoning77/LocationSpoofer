package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v7 extends u7 {
    public final String a;

    public v7(String str) {
        this.a = str;
    }

    @Override // defpackage.u7
    public final Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.u7
    public final t7 b(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @Override // defpackage.u7
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
