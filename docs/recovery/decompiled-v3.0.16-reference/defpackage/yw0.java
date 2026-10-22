package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yw0 extends rd3 {
    public rd3 a;

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        rd3 rd3Var = this.a;
        if (rd3Var != null) {
            return rd3Var.read(z71Var);
        }
        fo.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) {
        rd3 rd3Var = this.a;
        if (rd3Var != null) {
            rd3Var.write(i81Var, obj);
        } else {
            fo.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }
}
