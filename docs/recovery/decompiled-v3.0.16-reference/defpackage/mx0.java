package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mx0 {
    public static final uu d;
    public static final uu e;
    public static final uu f;
    public static final uu g;
    public static final uu h;
    public static final uu i;
    public final uu a;
    public final uu b;
    public final int c;

    static {
        uu uuVar = uu.h;
        d = u92.l(":");
        e = u92.l(":status");
        f = u92.l(":method");
        g = u92.l(":path");
        h = u92.l(":scheme");
        i = u92.l(":authority");
    }

    public mx0(uu uuVar, uu uuVar2) {
        uuVar.getClass();
        uuVar2.getClass();
        this.a = uuVar;
        this.b = uuVar2;
        this.c = uuVar2.a() + uuVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx0)) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        return o51.f(this.a, mx0Var.a) && o51.f(this.b, mx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.h() + ": " + this.b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mx0(String str, String str2) {
        this(u92.l(str), u92.l(str2));
        str.getClass();
        str2.getClass();
        uu uuVar = uu.h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mx0(uu uuVar, String str) {
        this(uuVar, u92.l(str));
        uuVar.getClass();
        str.getClass();
        uu uuVar2 = uu.h;
    }
}
