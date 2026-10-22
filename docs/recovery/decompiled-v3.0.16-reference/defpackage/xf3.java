package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xf3 implements zb1, Serializable {
    public au0 e;
    public Object f;

    @Override // defpackage.zb1
    public final boolean a() {
        return this.f != u92.v;
    }

    @Override // defpackage.zb1
    public final Object getValue() {
        Object obj = this.f;
        if (obj != u92.v) {
            return obj;
        }
        au0 au0Var = this.e;
        au0Var.getClass();
        Object objInvoke = au0Var.invoke();
        this.f = objInvoke;
        this.e = null;
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
