package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ur {
    public static final ur g;
    public static final ur h;
    public static final ur i;
    public static final ur j;
    public static final ur k;
    public static final ur l;
    public final long a;
    public final int b;
    public final float c;
    public final lf1 d;
    public final lf1 e;
    public final boolean f;

    static {
        long j2 = hz.c;
        g = new ur(hz.c(0.05f, j2), 3.5f, new lf1(new kf1(0.5f, 0.5f, -0.5f), 0.3f), new lf1(new kf1(0.5f, 0.6f, -0.5f), 0.2f), 34);
        h = new ur(hz.c(0.05f, j2), 2.8f, new lf1(new kf1(0.5f, 0.5f, -0.5f), 0.4f), new lf1(new kf1(0.5f, 0.8f, -0.5f), 0.25f), 34);
        i = new ur(hz.c(0.05f, j2), 2.6f, new lf1(new kf1(0.5f, 0.5f, -0.5f), 0.6f), new lf1(new kf1(0.5f, 0.95f, -0.5f), 0.35f), 34);
        j = new ur(hz.c(0.05f, j2), 1.7f, new lf1(new kf1(0.5f, 0.5f, -0.5f), 0.4f), new lf1(new kf1(0.5f, 0.6f, -0.5f), 0.25f), 34);
        k = new ur(hz.c(0.06f, j2), 2.0f, new lf1(new kf1(0.5f, 0.5f, -0.5f), 0.5f), new lf1(new kf1(0.5f, 0.8f, -0.5f), 0.25f), 34);
        l = new ur(hz.c(0.08f, j2), 2.3f, new lf1(new kf1(0.5f, 0.5f, -0.5f), 0.6f), new lf1(new kf1(0.5f, 0.95f, -0.36f), 0.25f), 34);
    }

    public ur(long j2, float f, lf1 lf1Var, lf1 lf1Var2, int i2) {
        this(j2, 12, f, lf1Var, lf1Var2, (i2 & 32) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        long j2 = urVar.a;
        int i2 = hz.h;
        return ye3.a(this.a, j2) && this.b == urVar.b && td0.b(this.c, urVar.c) && o51.f(this.d, urVar.d) && o51.f(this.e, urVar.e) && this.f == urVar.f;
    }

    public final int hashCode() {
        int i2 = hz.h;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + az2.c(this.c, p91.b(this.b, Long.hashCode(this.a) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        String strI = hz.i(this.a);
        String strG = o51.G(this.b);
        String strC = td0.c(this.c);
        StringBuilder sbT = p91.t("BloomStroke(color=", strI, ", blendMode=", strG, ", innerBlurRadius=");
        sbT.append(strC);
        sbT.append(", primaryLight=");
        sbT.append(this.d);
        sbT.append(", secondaryLight=");
        sbT.append(this.e);
        sbT.append(", dualPeak=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }

    public ur(long j2, int i2, float f, lf1 lf1Var, lf1 lf1Var2, boolean z) {
        lf1Var2.getClass();
        this.a = j2;
        this.b = i2;
        this.c = f;
        this.d = lf1Var;
        this.e = lf1Var2;
        this.f = z;
    }
}
