package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class aa1 implements zu0, Serializable {
    public final int e;

    public aa1(int i) {
        this.e = i;
    }

    @Override // defpackage.zu0
    public final int getArity() {
        return this.e;
    }

    public final String toString() {
        xe2.a.getClass();
        return ye2.a(this);
    }
}
