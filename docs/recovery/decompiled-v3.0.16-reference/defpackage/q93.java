package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q93 {
    public static final q93 d = new q93(0, 0, null, 0, 0, 0, 0, 16777215);
    public final uy2 a;
    public final p52 b;
    public final k92 c;

    public q93(long j, long j2, jr0 jr0Var, long j3, long j4, int i, long j5, int i2) {
        this(new uy2((i2 & 1) != 0 ? hz.g : j, (i2 & 2) != 0 ? w93.c : j2, (i2 & 4) != 0 ? null : jr0Var, (hr0) null, (ir0) null, (l43) null, (String) null, (i2 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? w93.c : j3, (qq) null, (j83) null, (sh1) null, (i2 & 2048) != 0 ? hz.g : j4, (p63) null, (xt2) null, (f92) null), new p52((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? w93.c : j5, null, null, null, 0, 0, null), null);
    }

    public static q93 a(q93 q93Var, long j, long j2, jr0 jr0Var, l43 l43Var, long j3, long j4, sf1 sf1Var, int i) {
        i83 szVar;
        k92 k92Var = ym3.q;
        long jA = (i & 1) != 0 ? q93Var.a.a.a() : j;
        long j5 = (i & 2) != 0 ? q93Var.a.b : j2;
        jr0 jr0Var2 = (i & 4) != 0 ? q93Var.a.c : jr0Var;
        uy2 uy2Var = q93Var.a;
        hr0 hr0Var = uy2Var.d;
        ir0 ir0Var = uy2Var.e;
        l43 l43Var2 = (i & 32) != 0 ? uy2Var.f : l43Var;
        String str = uy2Var.g;
        long j6 = (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? uy2Var.h : j3;
        qq qqVar = uy2Var.i;
        j83 j83Var = uy2Var.j;
        sh1 sh1Var = uy2Var.k;
        long j7 = uy2Var.l;
        p63 p63Var = uy2Var.m;
        xt2 xt2Var = uy2Var.n;
        kg0 kg0Var = uy2Var.p;
        p52 p52Var = q93Var.b;
        int i2 = p52Var.a;
        int i3 = p52Var.b;
        long j8 = (i & 131072) != 0 ? p52Var.c : j4;
        k83 k83Var = p52Var.d;
        k92 k92Var2 = (i & 524288) != 0 ? q93Var.c : k92Var;
        sf1 sf1Var2 = (i & 1048576) != 0 ? p52Var.f : sf1Var;
        int i4 = p52Var.g;
        int i5 = p52Var.h;
        d93 d93Var = p52Var.i;
        long jA2 = uy2Var.a.a();
        int i6 = hz.h;
        if (ye3.a(jA, jA2)) {
            szVar = uy2Var.a;
        } else {
            szVar = jA != 16 ? new sz(jA) : h83.a;
        }
        return new q93(new uy2(szVar, j5, jr0Var2, hr0Var, ir0Var, l43Var2, str, j6, qqVar, j83Var, sh1Var, j7, p63Var, xt2Var, k92Var2 != null ? k92Var2.a : null, kg0Var), new p52(i2, i3, j8, k83Var, k92Var2 != null ? k92Var2.b : null, sf1Var2, i4, i5, d93Var), k92Var2);
    }

    public static q93 e(q93 q93Var, long j, long j2, jr0 jr0Var, l43 l43Var, long j3, p63 p63Var, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? w93.c : j2;
        jr0 jr0Var2 = (i2 & 4) != 0 ? null : jr0Var;
        l43 l43Var2 = (i2 & 32) != 0 ? null : l43Var;
        long j6 = (i2 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? w93.c : j3;
        long j7 = hz.g;
        p63 p63Var2 = (i2 & 4096) != 0 ? null : p63Var;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? w93.c : j4;
        uy2 uy2VarA = vy2.a(q93Var.a, j, null, Float.NaN, j5, jr0Var2, null, null, l43Var2, null, j6, null, null, null, j7, p63Var2, null, null, null);
        p52 p52VarA = q52.a(q93Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (q93Var.a == uy2VarA && q93Var.b == p52VarA) ? q93Var : new q93(uy2VarA, p52VarA);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(q93 q93Var) {
        if (this != q93Var) {
            return o51.f(this.b, q93Var.b) && this.a.a(q93Var.a);
        }
        return true;
    }

    public final q93 d(q93 q93Var) {
        return (q93Var == null || q93Var.equals(d)) ? this : new q93(this.a.c(q93Var.a), this.b.a(q93Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q93)) {
            return false;
        }
        q93 q93Var = (q93) obj;
        return o51.f(this.a, q93Var.a) && o51.f(this.b, q93Var.b) && o51.f(this.c, q93Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k92 k92Var = this.c;
        return iHashCode + (k92Var != null ? k92Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) hz.i(b()));
        sb.append(", brush=");
        uy2 uy2Var = this.a;
        sb.append(uy2Var.a.b());
        sb.append(", alpha=");
        sb.append(uy2Var.a.s());
        sb.append(", fontSize=");
        sb.append((Object) w93.d(uy2Var.b));
        sb.append(", fontWeight=");
        sb.append(uy2Var.c);
        sb.append(", fontStyle=");
        sb.append(uy2Var.d);
        sb.append(", fontSynthesis=");
        sb.append(uy2Var.e);
        sb.append(", fontFamily=");
        sb.append(uy2Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(uy2Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) w93.d(uy2Var.h));
        sb.append(", baselineShift=");
        sb.append(uy2Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(uy2Var.j);
        sb.append(", localeList=");
        sb.append(uy2Var.k);
        sb.append(", background=");
        p91.u(uy2Var.l, sb, ", textDecoration=");
        sb.append(uy2Var.m);
        sb.append(", shadow=");
        sb.append(uy2Var.n);
        sb.append(", drawStyle=");
        sb.append(uy2Var.p);
        sb.append(", textAlign=");
        p52 p52Var = this.b;
        sb.append((Object) m53.a(p52Var.a));
        sb.append(", textDirection=");
        sb.append((Object) r63.a(p52Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) w93.d(p52Var.c));
        sb.append(", textIndent=");
        sb.append(p52Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(p52Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) nf1.a(p52Var.g));
        sb.append(", hyphens=");
        sb.append((Object) c01.a(p52Var.h));
        sb.append(", textMotion=");
        sb.append(p52Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q93(uy2 uy2Var, p52 p52Var) {
        f92 f92Var = uy2Var.o;
        w82 w82Var = p52Var.e;
        this(uy2Var, p52Var, (f92Var == null && w82Var == null) ? null : new k92(f92Var, w82Var));
    }

    public q93(uy2 uy2Var, p52 p52Var, k92 k92Var) {
        this.a = uy2Var;
        this.b = p52Var;
        this.c = k92Var;
    }
}
