package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uy2 implements zi {
    public final i83 a;
    public final long b;
    public final jr0 c;
    public final hr0 d;
    public final ir0 e;
    public final l43 f;
    public final String g;
    public final long h;
    public final qq i;
    public final j83 j;
    public final sh1 k;
    public final long l;
    public final p63 m;
    public final xt2 n;
    public final f92 o;
    public final kg0 p;

    public uy2(long j, long j2, jr0 jr0Var, hr0 hr0Var, ir0 ir0Var, l43 l43Var, String str, long j3, qq qqVar, j83 j83Var, sh1 sh1Var, long j4, p63 p63Var, xt2 xt2Var, int i) {
        this((i & 1) != 0 ? hz.g : j, (i & 2) != 0 ? w93.c : j2, (i & 4) != 0 ? null : jr0Var, (i & 8) != 0 ? null : hr0Var, (i & 16) != 0 ? null : ir0Var, (i & 32) != 0 ? null : l43Var, (i & 64) != 0 ? null : str, (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? w93.c : j3, (i & 256) != 0 ? null : qqVar, (i & 512) != 0 ? null : j83Var, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : sh1Var, (i & 2048) != 0 ? hz.g : j4, (i & 4096) != 0 ? null : p63Var, (i & 8192) != 0 ? null : xt2Var, (f92) null);
    }

    public final boolean a(uy2 uy2Var) {
        if (this == uy2Var) {
            return true;
        }
        if (!w93.a(this.b, uy2Var.b) || !o51.f(this.c, uy2Var.c) || !o51.f(this.d, uy2Var.d) || !o51.f(this.e, uy2Var.e) || !o51.f(this.f, uy2Var.f) || !o51.f(this.g, uy2Var.g) || !w93.a(this.h, uy2Var.h) || !o51.f(this.i, uy2Var.i) || !o51.f(this.j, uy2Var.j) || !o51.f(this.k, uy2Var.k)) {
            return false;
        }
        long j = uy2Var.l;
        int i = hz.h;
        return ye3.a(this.l, j) && o51.f(this.o, uy2Var.o);
    }

    public final boolean b(uy2 uy2Var) {
        return o51.f(this.a, uy2Var.a) && o51.f(this.m, uy2Var.m) && o51.f(this.n, uy2Var.n) && o51.f(this.p, uy2Var.p);
    }

    public final uy2 c(uy2 uy2Var) {
        if (uy2Var == null) {
            return this;
        }
        i83 i83Var = uy2Var.a;
        return vy2.a(this, i83Var.a(), i83Var.b(), i83Var.s(), uy2Var.b, uy2Var.c, uy2Var.d, uy2Var.e, uy2Var.f, uy2Var.g, uy2Var.h, uy2Var.i, uy2Var.j, uy2Var.k, uy2Var.l, uy2Var.m, uy2Var.n, uy2Var.o, uy2Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy2)) {
            return false;
        }
        uy2 uy2Var = (uy2) obj;
        return a(uy2Var) && b(uy2Var);
    }

    public final int hashCode() {
        i83 i83Var = this.a;
        long jA = i83Var.a();
        int i = hz.h;
        int iHashCode = Long.hashCode(jA) * 31;
        st stVarB = i83Var.b();
        int iHashCode2 = (Float.hashCode(i83Var.s()) + ((iHashCode + (stVarB != null ? stVarB.hashCode() : 0)) * 31)) * 31;
        x93[] x93VarArr = w93.b;
        int iC = p91.c(iHashCode2, 31, this.b);
        jr0 jr0Var = this.c;
        int i2 = (iC + (jr0Var != null ? jr0Var.e : 0)) * 31;
        hr0 hr0Var = this.d;
        int iHashCode3 = (i2 + (hr0Var != null ? Integer.hashCode(hr0Var.a) : 0)) * 31;
        ir0 ir0Var = this.e;
        int iHashCode4 = (iHashCode3 + (ir0Var != null ? Integer.hashCode(ir0Var.a) : 0)) * 31;
        l43 l43Var = this.f;
        int iHashCode5 = (iHashCode4 + (l43Var != null ? l43Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = p91.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        qq qqVar = this.i;
        int iHashCode6 = (iC2 + (qqVar != null ? Float.hashCode(qqVar.a) : 0)) * 31;
        j83 j83Var = this.j;
        int iHashCode7 = (iHashCode6 + (j83Var != null ? j83Var.hashCode() : 0)) * 31;
        sh1 sh1Var = this.k;
        int iC3 = p91.c((iHashCode7 + (sh1Var != null ? sh1Var.e.hashCode() : 0)) * 31, 31, this.l);
        p63 p63Var = this.m;
        int i3 = (iC3 + (p63Var != null ? p63Var.a : 0)) * 31;
        xt2 xt2Var = this.n;
        int iHashCode8 = (i3 + (xt2Var != null ? xt2Var.hashCode() : 0)) * 31;
        f92 f92Var = this.o;
        int iHashCode9 = (iHashCode8 + (f92Var != null ? f92Var.hashCode() : 0)) * 31;
        kg0 kg0Var = this.p;
        return iHashCode9 + (kg0Var != null ? kg0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        i83 i83Var = this.a;
        sb.append((Object) hz.i(i83Var.a()));
        sb.append(", brush=");
        sb.append(i83Var.b());
        sb.append(", alpha=");
        sb.append(i83Var.s());
        sb.append(", fontSize=");
        sb.append((Object) w93.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) w93.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        p91.u(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public uy2(i83 i83Var, long j, jr0 jr0Var, hr0 hr0Var, ir0 ir0Var, l43 l43Var, String str, long j2, qq qqVar, j83 j83Var, sh1 sh1Var, long j3, p63 p63Var, xt2 xt2Var, f92 f92Var, kg0 kg0Var) {
        this.a = i83Var;
        this.b = j;
        this.c = jr0Var;
        this.d = hr0Var;
        this.e = ir0Var;
        this.f = l43Var;
        this.g = str;
        this.h = j2;
        this.i = qqVar;
        this.j = j83Var;
        this.k = sh1Var;
        this.l = j3;
        this.m = p63Var;
        this.n = xt2Var;
        this.o = f92Var;
        this.p = kg0Var;
    }

    public uy2(long j, long j2, jr0 jr0Var, hr0 hr0Var, ir0 ir0Var, l43 l43Var, String str, long j3, qq qqVar, j83 j83Var, sh1 sh1Var, long j4, p63 p63Var, xt2 xt2Var, f92 f92Var) {
        i83 szVar;
        if (j != 16) {
            szVar = new sz(j);
        } else {
            szVar = h83.a;
        }
        this(szVar, j2, jr0Var, hr0Var, ir0Var, l43Var, str, j3, qqVar, j83Var, sh1Var, j4, p63Var, xt2Var, f92Var, null);
    }
}
