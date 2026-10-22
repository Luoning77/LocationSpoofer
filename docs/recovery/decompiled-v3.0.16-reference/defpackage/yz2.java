package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yz2 implements ln0 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ yz2(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.si
    public final rh3 a(qd3 qd3Var) {
        Object obj = this.c;
        return new us1(this.a, this.b, obj == null ? null : (yi) qd3Var.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yz2) {
            yz2 yz2Var = (yz2) obj;
            if (yz2Var.a == this.a && yz2Var.b == this.b && o51.f(yz2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + az2.c(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public yz2(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
