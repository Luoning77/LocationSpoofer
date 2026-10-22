package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vb0 implements us2 {
    public final CharSequence a;
    public final int b;
    public final pu0 c;

    public vb0(CharSequence charSequence, int i, pu0 pu0Var) {
        this.a = charSequence;
        this.b = i;
        this.c = pu0Var;
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        return new ub0(this);
    }
}
