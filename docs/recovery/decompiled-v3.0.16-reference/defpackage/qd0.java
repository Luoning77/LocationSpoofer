package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qd0 implements y81 {
    public static final qd0 a = new qd0();
    public static final cc2 b = new cc2("kotlin.Double", bc2.h);

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        return Double.valueOf(w90Var.A());
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        ak0Var.g(((Number) obj).doubleValue());
    }
}
