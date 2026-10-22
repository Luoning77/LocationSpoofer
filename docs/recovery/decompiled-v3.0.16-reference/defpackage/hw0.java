package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hw0 extends ke0 {
    public final BreakIterator j;

    public hw0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.j = characterInstance;
    }

    @Override // defpackage.ke0
    public final int I(int i) {
        return this.j.following(i);
    }

    @Override // defpackage.ke0
    public final int K(int i) {
        return this.j.preceding(i);
    }
}
