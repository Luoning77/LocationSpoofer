package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i02 implements y81 {
    public static final i02 a = new i02();
    public static final h02 b = h02.a;

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        throw new x31("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        ((Void) obj).getClass();
        throw new x31("'kotlin.Nothing' cannot be serialized");
    }
}
