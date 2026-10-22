package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v33 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public v33(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v33)) {
            return false;
        }
        v33 v33Var = (v33) obj;
        long j = v33Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, v33Var.b) && ye3.a(this.c, v33Var.c) && ye3.a(this.d, v33Var.d) && ye3.a(this.e, v33Var.e) && ye3.a(this.f, v33Var.f) && ye3.a(this.g, v33Var.g) && ye3.a(this.h, v33Var.h);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.h) + p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = hz.i(this.a);
        String strI2 = hz.i(this.b);
        String strI3 = hz.i(this.c);
        String strI4 = hz.i(this.d);
        String strI5 = hz.i(this.e);
        String strI6 = hz.i(this.f);
        String strI7 = hz.i(this.g);
        String strI8 = hz.i(this.h);
        StringBuilder sbT = p91.t("SwitchColors(checkedThumbColor=", strI, ", uncheckedThumbColor=", strI2, ", disabledCheckedThumbColor=");
        p91.y(sbT, strI3, ", disabledUncheckedThumbColor=", strI4, ", checkedTrackColor=");
        p91.y(sbT, strI5, ", uncheckedTrackColor=", strI6, ", disabledCheckedTrackColor=");
        sbT.append(strI7);
        sbT.append(", disabledUncheckedTrackColor=");
        sbT.append(strI8);
        sbT.append(")");
        return sbT.toString();
    }
}
