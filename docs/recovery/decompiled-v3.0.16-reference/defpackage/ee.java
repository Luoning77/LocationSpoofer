package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ee extends t20 {
    public final /* synthetic */ int b;

    public /* synthetic */ ee(int i) {
        this.b = i;
    }

    @Override // defpackage.t20
    public final void g(re1 re1Var, String str) {
        int i = this.b;
        str.getClass();
        switch (i) {
            case 0:
                int iOrdinal = re1Var.ordinal();
                if (iOrdinal == 0) {
                    Log.d("[Koin]", str);
                } else if (iOrdinal == 1) {
                    Log.i("[Koin]", str);
                } else if (iOrdinal == 2) {
                    Log.w("[Koin]", str);
                } else if (iOrdinal == 3) {
                    Log.e("[Koin]", str);
                } else {
                    Log.e("[Koin]", str);
                }
                break;
        }
    }
}
