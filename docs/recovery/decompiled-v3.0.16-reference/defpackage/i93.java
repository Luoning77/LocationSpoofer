package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i93 {
    public final long a;
    public final long b;

    public i93(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i93)) {
            return false;
        }
        i93 i93Var = (i93) obj;
        long j = i93Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, i93Var.b);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        p91.u(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) hz.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
