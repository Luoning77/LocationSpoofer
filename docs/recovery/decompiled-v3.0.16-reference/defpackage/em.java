package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class em implements Runnable {
    public final /* synthetic */ TextView e;
    public final /* synthetic */ Typeface f;
    public final /* synthetic */ int g;

    public em(TextView textView, Typeface typeface, int i) {
        this.e = textView;
        this.f = typeface;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.setTypeface(this.f, this.g);
    }
}
