package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qn0 implements us2 {
    public final us2 a;
    public final lu0 b;
    public final lu0 c;

    public qn0(us2 us2Var, lu0 lu0Var, lu0 lu0Var2) {
        this.a = us2Var;
        this.b = lu0Var;
        this.c = lu0Var2;
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        return new in0(this);
    }
}
