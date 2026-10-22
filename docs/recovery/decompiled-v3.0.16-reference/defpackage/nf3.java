package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nf3 implements y81 {
    public static final nf3 b = new nf3();
    public final /* synthetic */ u02 a = new u02();

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        this.a.deserialize(w90Var);
        return mf3.a;
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        mf3 mf3Var = (mf3) obj;
        mf3Var.getClass();
        this.a.serialize(ak0Var, mf3Var);
    }
}
