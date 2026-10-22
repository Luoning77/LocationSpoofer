package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yq2 implements tu0 {
    public final /* synthetic */ ar2 e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tu0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        pa1 pa1Var = (pa1) obj2;
        long j = ((c12) obj3).a;
        ar2 ar2Var = this.e;
        long jA = ar2Var.a(pa1Var, j);
        long jA2 = ar2Var.a(pa1Var, ((c12) obj4).a);
        ar2Var.k(zBooleanValue);
        return Boolean.valueOf(ar2Var.n(jA, jA2, ((Boolean) obj5).booleanValue(), (yp2) serializable));
    }
}
