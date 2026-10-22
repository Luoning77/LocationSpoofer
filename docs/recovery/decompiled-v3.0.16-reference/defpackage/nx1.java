package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nx1 extends yo1 implements r81 {
    public final bz h;
    public Object i;

    public nx1(bz bzVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.h = bzVar;
        this.i = obj2;
    }

    @Override // defpackage.yo1, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // defpackage.yo1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.i;
        this.i = obj;
        p72 p72Var = (p72) this.h.f;
        o72 o72Var = p72Var.h;
        Object obj3 = this.f;
        if (!o72Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = p72Var.g;
        if (!z) {
            o72Var.put(obj3, obj);
        } else {
            if (!z) {
                b81.p();
                return null;
            }
            ad3 ad3Var = p72Var.e[p72Var.f];
            Object obj4 = ad3Var.e[ad3Var.g];
            o72Var.put(obj3, obj);
            p72Var.c(obj4 != null ? obj4.hashCode() : 0, o72Var.g, obj4, 0);
        }
        p72Var.k = o72Var.i;
        return obj2;
    }
}
