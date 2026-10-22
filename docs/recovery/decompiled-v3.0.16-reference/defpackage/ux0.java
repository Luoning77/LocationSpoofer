package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ux0 {
    public final float a;
    public final float b;
    public final ur c;

    static {
        new ux0(ur.g);
        new ux0(ur.h);
        new ux0(ur.i);
        new ux0(ur.j);
        new ux0(ur.k);
        new ux0(ur.l);
    }

    public ux0(float f, float f2, ur urVar) {
        urVar.getClass();
        this.a = f;
        this.b = f2;
        this.c = urVar;
    }

    public static ux0 a(ux0 ux0Var, float f, ur urVar, int i) {
        float f2 = ux0Var.a;
        if ((i & 2) != 0) {
            f = ux0Var.b;
        }
        if ((i & 4) != 0) {
            urVar = ux0Var.c;
        }
        ux0Var.getClass();
        urVar.getClass();
        return new ux0(f2, f, urVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux0)) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        return td0.b(this.a, ux0Var.a) && Float.compare(this.b, ux0Var.b) == 0 && o51.f(this.c, ux0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + az2.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Highlight(width=" + td0.c(this.a) + ", alpha=" + this.b + ", style=" + this.c + ")";
    }

    public ux0(ur urVar) {
        this(0.8f, 1.0f, urVar);
    }
}
