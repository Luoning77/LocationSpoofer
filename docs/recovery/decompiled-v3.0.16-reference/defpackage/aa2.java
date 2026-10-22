package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class aa2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public aa2(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa2)) {
            return false;
        }
        aa2 aa2Var = (aa2) obj;
        return wc0.C(this.a, aa2Var.a) && this.b == aa2Var.b && c12.b(this.c, aa2Var.c) && c12.b(this.d, aa2Var.d) && this.e == aa2Var.e && Float.compare(this.f, aa2Var.f) == 0 && this.g == aa2Var.g && this.h == aa2Var.h && this.i.equals(aa2Var.i) && c12.b(this.j, aa2Var.j) && Float.compare(this.k, aa2Var.k) == 0 && c12.b(this.l, aa2Var.l) && c12.b(this.m, aa2Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + p91.c(az2.c(this.k, p91.c((this.i.hashCode() + p91.e(p91.b(this.g, az2.c(this.f, p91.e(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) wc0.j0(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) c12.g(this.c)) + ", position=" + ((Object) c12.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) ga2.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) c12.g(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) c12.g(this.l)) + ", originalEventPosition=" + ((Object) c12.g(this.m)) + ')';
    }
}
