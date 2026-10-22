package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jn0 implements us2 {
    public final us2 a;
    public final boolean b;
    public final lu0 c;

    public jn0(us2 us2Var, boolean z, lu0 lu0Var) {
        us2Var.getClass();
        lu0Var.getClass();
        this.a = us2Var;
        this.b = z;
        this.c = lu0Var;
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        return new in0(this);
    }
}
