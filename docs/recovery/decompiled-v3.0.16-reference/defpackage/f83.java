package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f83 {
    public final dj a;
    public final long b;
    public final f93 c;

    public f83(dj djVar, long j, f93 f93Var) {
        f93 f93Var2;
        this.a = djVar;
        this.b = g93.d(djVar.f.length(), j);
        if (f93Var != null) {
            f93Var2 = new f93(g93.d(djVar.f.length(), f93Var.a));
        } else {
            f93Var2 = null;
        }
        this.c = f93Var2;
    }

    public static f83 a(f83 f83Var, dj djVar, long j, int i) {
        if ((i & 1) != 0) {
            djVar = f83Var.a;
        }
        if ((i & 2) != 0) {
            j = f83Var.b;
        }
        f93 f93Var = (i & 4) != 0 ? f83Var.c : null;
        f83Var.getClass();
        return new f83(djVar, j, f93Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83Var = (f83) obj;
        return f93.b(this.b, f83Var.b) && o51.f(this.c, f83Var.c) && o51.f(this.a, f83Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = f93.c;
        int iC = p91.c(iHashCode, 31, this.b);
        f93 f93Var = this.c;
        return iC + (f93Var != null ? Long.hashCode(f93Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) f93.h(this.b)) + ", composition=" + this.c + ')';
    }

    public f83(String str, long j, int i) {
        this(new dj((i & 1) != 0 ? "" : str), (i & 2) != 0 ? f93.b : j, (f93) null);
    }
}
