package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bj0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile bj0 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new xy2(cls, charSequence) : super.newEditable(charSequence);
    }
}
