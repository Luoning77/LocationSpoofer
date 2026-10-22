package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n02 implements y81 {
    public final y81 a;
    public final ct2 b;

    public n02(y81 y81Var) {
        y81Var.getClass();
        this.a = y81Var;
        this.b = new ct2(y81Var.getDescriptor());
    }

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        if (w90Var.g()) {
            return w90Var.c(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n02.class == obj.getClass() && o51.f(this.a, ((n02) obj).a);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        if (obj != null) {
            ak0Var.e(this.a, obj);
        } else {
            ak0Var.c();
        }
    }
}
