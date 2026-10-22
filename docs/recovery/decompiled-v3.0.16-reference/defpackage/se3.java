package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class se3 implements y81 {
    public static final se3 a = new se3();
    public static final l21 b = ig0.b(tu.a, "kotlin.UByte");

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        return new oe3(w90Var.t(b).r());
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        ak0Var.m(b).k(((oe3) obj).e);
    }
}
