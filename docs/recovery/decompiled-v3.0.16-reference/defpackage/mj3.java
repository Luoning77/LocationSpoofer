package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface mj3 {
    default hj3 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default hj3 b(Class cls, dx1 dx1Var) {
        return a(cls);
    }

    default hj3 c(ox oxVar, dx1 dx1Var) {
        return b(ig0.r(oxVar), dx1Var);
    }
}
