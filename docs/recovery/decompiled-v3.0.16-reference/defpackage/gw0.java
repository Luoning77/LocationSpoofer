package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gw0 extends ke0 {
    public final CharSequence j;
    public final TextPaint k;

    public gw0(CharSequence charSequence, TextPaint textPaint) {
        this.j = charSequence;
        this.k = textPaint;
    }

    @Override // defpackage.ke0
    public final int I(int i) {
        CharSequence charSequence = this.j;
        return this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.ke0
    public final int K(int i) {
        CharSequence charSequence = this.j;
        return this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
