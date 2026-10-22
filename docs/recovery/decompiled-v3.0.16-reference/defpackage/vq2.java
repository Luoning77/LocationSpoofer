package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vq2 {
    public final long a;
    public final long b;
    public final pa1 c;
    public final boolean d;
    public final xp2 e;
    public final wl1 f;
    public final jx1 g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public vq2(long j, long j2, pa1 pa1Var, boolean z, xp2 xp2Var, wl1 wl1Var) {
        this.a = j;
        this.b = j2;
        this.c = pa1Var;
        this.d = z;
        this.e = xp2Var;
        this.f = wl1Var;
        int i = mj1.a;
        this.g = new jx1(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, uc0 uc0Var, uc0 uc0Var2) {
        if (i == -1) {
            int iOrdinal = ld0.K(uc0Var, uc0Var2).ordinal();
            if (iOrdinal == 0) {
                return this.k - 1;
            }
            if (iOrdinal == 1) {
                return this.k;
            }
            if (iOrdinal != 2) {
                b81.d();
                return 0;
            }
        }
        return i;
    }
}
