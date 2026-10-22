package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ug2 extends oq {
    public ug2(q60 q60Var) {
        super(q60Var);
        if (q60Var == null || q60Var.getContext() == sj0.e) {
            return;
        }
        fo.i("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.q60
    public y70 getContext() {
        return sj0.e;
    }
}
