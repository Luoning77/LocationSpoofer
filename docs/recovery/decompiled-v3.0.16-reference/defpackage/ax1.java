package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ax1 {
    public final zx1 a;

    public /* synthetic */ ax1(zx1 zx1Var) {
        this.a = zx1Var;
    }

    public static final Object a(zx1 zx1Var) {
        Object objG = zx1Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof sx1)) {
            zx1Var.k(null);
            return objG;
        }
        sx1 sx1Var = (sx1) objG;
        if (sx1Var.h()) {
            b81.y("List is empty.");
            return null;
        }
        int i = sx1Var.b - 1;
        Object objF = sx1Var.f(i);
        sx1Var.k(i);
        objF.getClass();
        if (sx1Var.h()) {
            zx1Var.k(null);
        }
        if (sx1Var.b == 1) {
            zx1Var.m(null, sx1Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final sx1 b(zx1 zx1Var) {
        if (zx1Var.i()) {
            sx1 sx1Var = s02.b;
            sx1Var.getClass();
            return sx1Var;
        }
        sx1 sx1Var2 = new sx1();
        Object[] objArr = zx1Var.c;
        long[] jArr = zx1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof sx1) {
                                sx1Var2.b((sx1) obj);
                            } else {
                                obj.getClass();
                                sx1Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return sx1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ax1) {
            return this.a.equals(((ax1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
