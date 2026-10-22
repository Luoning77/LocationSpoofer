package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qb1 implements fr1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr1 b;
    public final /* synthetic */ vb1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fr1 e;

    public /* synthetic */ qb1(fr1 fr1Var, vb1 vb1Var, int i, fr1 fr1Var2, int i2) {
        this.a = i2;
        this.c = vb1Var;
        this.d = i;
        this.e = fr1Var2;
        this.b = fr1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[LOOP:0: B:11:0x002f->B:33:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[SYNTHETIC] */
    @Override // defpackage.fr1
    public final void a() {
        int i = this.a;
        fr1 fr1Var = this.e;
        int i2 = this.d;
        vb1 vb1Var = this.c;
        switch (i) {
            case 0:
                vb1Var.i = i2;
                fr1Var.a();
                gy1 gy1Var = vb1Var.q;
                zx1 zx1Var = vb1Var.p;
                long[] jArr = zx1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = zx1Var.b[i7];
                                    e23 e23Var = (e23) zx1Var.c[i7];
                                    int i8 = gy1Var.i(obj);
                                    if (i8 < 0 || i8 >= vb1Var.i) {
                                        if (i8 >= 0) {
                                            Object obj2 = o51.u0;
                                            Object[] objArr = gy1Var.e;
                                            Object obj3 = objArr[i8];
                                            objArr[i8] = obj2;
                                        }
                                        if (vb1Var.n.b(obj)) {
                                            e23Var.dispose();
                                        }
                                        zx1Var.l(i7);
                                    } else {
                                        i4 = i4;
                                    }
                                } else {
                                    i4 = i4;
                                }
                                j >>= i4;
                                i6++;
                                i4 = i4;
                            }
                            if (i5 == i4) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                vb1Var.d(vb1Var.h);
                break;
            default:
                vb1Var.h = i2;
                fr1Var.a();
                if (vb1Var.e.m == null) {
                    vb1Var.d(vb1Var.h);
                }
                break;
        }
    }

    @Override // defpackage.fr1
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }

    @Override // defpackage.fr1
    public final Map c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    @Override // defpackage.fr1
    public final lu0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // defpackage.fr1
    public final int e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }
}
