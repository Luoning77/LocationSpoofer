package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class yl3 {
    public static final gx1 a;
    public static final wl3[] b;

    static {
        gx1 gx1Var = new gx1(8);
        wl3.a.getClass();
        xl3 xl3Var = vl3.g;
        gx1Var.h(1, xl3Var);
        xl3 xl3Var2 = vl3.f;
        gx1Var.h(2, xl3Var2);
        xl3 xl3Var3 = vl3.b;
        gx1Var.h(4, xl3Var3);
        xl3 xl3Var4 = vl3.d;
        gx1Var.h(8, xl3Var4);
        xl3 xl3Var5 = vl3.h;
        gx1Var.h(16, xl3Var5);
        xl3 xl3Var6 = vl3.e;
        gx1Var.h(32, xl3Var6);
        xl3 xl3Var7 = vl3.i;
        gx1Var.h(64, xl3Var7);
        xl3 xl3Var8 = vl3.c;
        gx1Var.h(WorkQueueKt.BUFFER_CAPACITY, xl3Var8);
        a = gx1Var;
        b = new wl3[]{xl3Var, xl3Var2, xl3Var3, xl3Var7, xl3Var5, xl3Var6, xl3Var4, vl3.j, xl3Var8};
    }

    public static final void a(ak1 ak1Var, w21 w21Var, long j, int i, int i2) {
        if (u83.c(j, -1L)) {
            return;
        }
        ak1Var.c(w21Var.b, (int) ((j >>> 48) & 65535));
        ak1Var.c(w21Var.c, (int) ((j >>> 32) & 65535));
        ak1Var.c(w21Var.d, i - ((int) ((j >>> 16) & 65535)));
        ak1Var.c(w21Var.e, i2 - ((int) (j & 65535)));
    }
}
