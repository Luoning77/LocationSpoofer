package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m42 {
    public final long a;
    public final b52 b;

    public m42() {
        long jD = xp1.d(4284900966L);
        b52 b52VarE = zm3.e(3, 0.0f);
        this.a = jD;
        this.b = b52VarE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m42.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m42 m42Var = (m42) obj;
        long j = m42Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && this.b.equals(m42Var.b);
    }

    public final int hashCode() {
        int i = hz.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        p91.u(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
