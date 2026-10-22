package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qp2 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final x83 f;

    public qp2(long j, int i, int i2, int i3, int i4, x83 x83Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = x83Var;
    }

    public final wp2 a(int i) {
        return new wp2(hd0.F(this.f, i), i, this.a);
    }

    public final e80 b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return e80.f;
        }
        return i > i2 ? e80.e : e80.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        x83 x83Var = this.f;
        sb.append(hd0.F(x83Var, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(hd0.F(x83Var, i2));
        sb.append("), prevOffset=");
        return az2.o(sb, this.e, ')');
    }
}
