package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class es2 implements ss2, Iterable, p81 {
    public final zx1 e;
    public iq1 f;
    public boolean g;
    public boolean h;

    public es2() {
        long[] jArr = hn2.a;
        this.e = new zx1();
    }

    @Override // defpackage.ss2
    public final void a(rs2 rs2Var, Object obj) {
        boolean z = obj instanceof z0;
        zx1 zx1Var = this.e;
        if (z && zx1Var.c(rs2Var)) {
            Object objG = zx1Var.g(rs2Var);
            objG.getClass();
            z0 z0Var = (z0) objG;
            z0 z0Var2 = (z0) obj;
            String str = z0Var2.a;
            if (str == null) {
                str = z0Var.a;
            }
            xu0 xu0Var = z0Var2.b;
            if (xu0Var == null) {
                xu0Var = z0Var.b;
            }
            zx1Var.m(rs2Var, new z0(str, xu0Var));
        } else {
            zx1Var.m(rs2Var, obj);
        }
        rs2Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    public final es2 b() {
        es2 es2Var = new es2();
        es2Var.g = this.g;
        es2Var.h = this.h;
        zx1 zx1Var = this.e;
        Object[] objArr = zx1Var.b;
        Object[] objArr2 = zx1Var.c;
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
                            int i4 = (i << 3) + i3;
                            es2Var.e.m(objArr[i4], objArr2[i4]);
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
        return es2Var;
    }

    public final Object c(rs2 rs2Var) {
        Object objG = this.e.g(rs2Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + rs2Var + " - consider getOrElse or getOrNull");
    }

    public final void d(es2 es2Var) {
        zx1 zx1Var = es2Var.e;
        Object[] objArr = zx1Var.b;
        Object[] objArr2 = zx1Var.c;
        long[] jArr = zx1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        rs2 rs2Var = (rs2) obj;
                        zx1 zx1Var2 = this.e;
                        Object objG = zx1Var2.g(rs2Var);
                        rs2Var.getClass();
                        Object objInvoke = rs2Var.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            zx1Var2.m(rs2Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es2)) {
            return false;
        }
        es2 es2Var = (es2) obj;
        return this.e.equals(es2Var.e) && this.g == es2Var.g && this.h == es2Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + p91.e(this.e.hashCode() * 31, 31, this.g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        iq1 iq1Var = this.f;
        if (iq1Var == null) {
            iq1Var = new iq1(this.e);
            this.f = iq1Var;
        }
        return ((uk0) iq1Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        zx1 zx1Var = this.e;
        Object[] objArr = zx1Var.b;
        Object[] objArr2 = zx1Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((rs2) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return ke0.M(this) + "{ " + ((Object) sb) + " }";
    }
}
