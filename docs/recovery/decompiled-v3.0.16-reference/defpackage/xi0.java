package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xi0 implements ra0 {
    public final /* synthetic */ xe1 e;

    public xi0(EmojiCompatInitializer emojiCompatInitializer, xe1 xe1Var) {
        this.e = xe1Var;
    }

    @Override // defpackage.ra0
    public final void P(df1 df1Var) {
        (Build.VERSION.SDK_INT >= 28 ? d40.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new hv(1), 500L);
        this.e.b(this);
    }
}
