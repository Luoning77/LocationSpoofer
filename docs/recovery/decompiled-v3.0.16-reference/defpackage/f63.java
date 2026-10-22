package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum f63 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(da0.X, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(da0.Y, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(da0.Z, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(da0.a0, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(da0.b0, Build.VERSION.SDK_INT <= 26 ? 2131624015 : R.string.autofill, 0);

    public final Object e;
    public final int f;
    public final int g;

    f63(Object obj, int i2, int i3) {
        this.e = obj;
        this.f = i2;
        this.g = i3;
    }
}
