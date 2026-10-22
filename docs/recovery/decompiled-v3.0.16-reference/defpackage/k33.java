package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class k33 extends r60 implements zu0 {
    private final int arity;

    public k33(int i, q60 q60Var) {
        super(q60Var);
        this.arity = i;
    }

    @Override // defpackage.zu0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.oq
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        xe2.a.getClass();
        return ye2.a(this);
    }
}
