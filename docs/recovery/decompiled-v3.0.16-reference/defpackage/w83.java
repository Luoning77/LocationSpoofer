package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w83 {
    public final dj a;
    public final q93 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final xb0 g;
    public final qa1 h;
    public final lq0 i;
    public final long j;

    public w83(dj djVar, q93 q93Var, List list, int i, boolean z, int i2, xb0 xb0Var, qa1 qa1Var, lq0 lq0Var, long j) {
        this.a = djVar;
        this.b = q93Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = xb0Var;
        this.h = qa1Var;
        this.i = lq0Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w83)) {
            return false;
        }
        w83 w83Var = (w83) obj;
        return o51.f(this.a, w83Var.a) && o51.f(this.b, w83Var.b) && o51.f(this.c, w83Var.c) && this.d == w83Var.d && this.e == w83Var.e && this.f == w83Var.f && o51.f(this.g, w83Var.g) && this.h == w83Var.h && o51.f(this.i, w83Var.i) && l50.b(this.j, w83Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + p91.b(this.f, p91.e((p91.g(this.c, p91.f(this.b, this.a.hashCode() * 31, 31), 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) l50.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
