package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g23 {
    public final j23 a;
    public vb1 b;
    public final f23 c = new f23(this, 2);
    public final f23 d = new f23(this, 0);
    public final f23 e = new f23(this, 1);

    public g23(j23 j23Var) {
        this.a = j23Var;
    }

    public final vb1 a() {
        vb1 vb1Var = this.b;
        if (vb1Var != null) {
            return vb1Var;
        }
        fo.i("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
