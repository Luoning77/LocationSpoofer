package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dc3 implements us2 {
    public final us2 a;
    public final lu0 b;

    public dc3(us2 us2Var, lu0 lu0Var) {
        this.a = us2Var;
        this.b = lu0Var;
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        return new cc3(this);
    }
}
