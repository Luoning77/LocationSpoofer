package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class dy1 extends nx2 {
    public static final int[] n = new int[0];
    public final lu0 e;
    public final lu0 f;
    public int g;
    public ay1 h;
    public ArrayList i;
    public rx2 j;
    public int[] k;
    public int l;
    public boolean m;

    public dy1(long j, rx2 rx2Var, lu0 lu0Var, lu0 lu0Var2) {
        super(j, rx2Var);
        this.e = lu0Var;
        this.f = lu0Var2;
        this.j = rx2.i;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (tx2.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(ay1 ay1Var) {
        this.h = ay1Var;
    }

    public dy1 C(lu0 lu0Var, lu0 lu0Var2) {
        yy1 yy1Var;
        if (this.c) {
            hb2.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            hb2.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = tx2.c;
        synchronized (obj) {
            long j = tx2.e;
            tx2.e = j + 1;
            tx2.d = tx2.d.e(j);
            rx2 rx2VarD = d();
            r(rx2VarD.e(j));
            yy1Var = new yy1(j, tx2.a(rx2VarD, g() + 1, j), tx2.i(lu0Var, e(), true), tx2.j(lu0Var2, i()), this);
        }
        if (this.m || this.c) {
            return yy1Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = tx2.e;
            tx2.e = j2 + 1;
            s(j2);
            tx2.d = tx2.d.e(g());
        }
        r(tx2.a(d(), jG + 1, g()));
        return yy1Var;
    }

    @Override // defpackage.nx2
    public final void b() {
        tx2.d = tx2.d.b(g()).a(this.j);
    }

    @Override // defpackage.nx2
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (tx2.c) {
            o();
        }
        l();
    }

    @Override // defpackage.nx2
    public boolean f() {
        return false;
    }

    @Override // defpackage.nx2
    public int h() {
        return this.g;
    }

    @Override // defpackage.nx2
    public lu0 i() {
        return this.f;
    }

    @Override // defpackage.nx2
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.nx2
    public void l() {
        if (this.l <= 0) {
            hb2.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        ay1 ay1VarX = x();
        if (ay1VarX != null) {
            if (this.m) {
                hb2.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = ay1VarX.b;
            long[] jArr = ay1VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (z03 z03VarA = ((x03) objArr[(i2 << 3) + i4]).a(); z03VarA != null; z03VarA = z03VarA.b) {
                                    long j2 = z03VarA.a;
                                    if (j2 == jG || zy.g0(this.j, Long.valueOf(j2))) {
                                        ym2 ym2Var = tx2.a;
                                        z03VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.nx2
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.nx2
    public void n(x03 x03Var) {
        ay1 ay1VarX = x();
        if (ay1VarX == null) {
            ay1 ay1Var = in2.a;
            ay1VarX = new ay1();
            B(ay1VarX);
        }
        ay1VarX.a(x03Var);
    }

    @Override // defpackage.nx2
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            tx2.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.nx2
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.nx2
    public nx2 u(lu0 lu0Var) {
        zy1 zy1Var;
        if (this.c) {
            hb2.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            hb2.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = tx2.c;
        synchronized (obj) {
            long j = tx2.e;
            tx2.e = j + 1;
            tx2.d = tx2.d.e(j);
            zy1Var = new zy1(j, tx2.a(d(), jG + 1, j), tx2.i(lu0Var, e(), true), this);
        }
        if (this.m || this.c) {
            return zy1Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = tx2.e;
            tx2.e = j2 + 1;
            s(j2);
            tx2.d = tx2.d.e(g());
        }
        r(tx2.a(d(), jG2 + 1, g()));
        return zy1Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (tx2.c) {
            long j = tx2.e;
            tx2.e = j + 1;
            s(j);
            tx2.d = tx2.d.e(g());
        }
        r(tx2.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public hd0 w() {
        HashMap mapM;
        List list;
        ay1 ay1Var;
        long j;
        long j2;
        ay1 ay1VarX = x();
        if (ay1VarX != null) {
            long j3 = tx2.j.b;
            mapM = tx2.m(j3, this, tx2.d.b(j3));
        } else {
            mapM = null;
        }
        uj0 uj0Var = uj0.e;
        synchronized (tx2.c) {
            try {
                tx2.v(this);
                if (ay1VarX == null || ay1VarX.d == 0) {
                    b();
                    cw0 cw0Var = tx2.j;
                    ay1 ay1Var2 = cw0Var.h;
                    tx2.u(cw0Var, tx2.a);
                    if (ay1Var2 == null || !ay1Var2.h()) {
                        list = uj0Var;
                        ay1Var = null;
                    } else {
                        list = tx2.h;
                        ay1Var = ay1Var2;
                    }
                } else {
                    cw0 cw0Var2 = tx2.j;
                    hd0 hd0VarZ = z(tx2.e, ay1VarX, mapM, tx2.d.b(cw0Var2.b));
                    if (!hd0VarZ.equals(px2.f)) {
                        return hd0VarZ;
                    }
                    b();
                    ay1Var = cw0Var2.h;
                    tx2.u(cw0Var2, tx2.a);
                    B(null);
                    cw0Var2.h = null;
                    list = tx2.h;
                }
                this.m = true;
                if (ay1Var != null) {
                    jn2 jn2Var = new jn2(ay1Var);
                    if (!ay1Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((pu0) list.get(i)).invoke(jn2Var, this);
                        }
                    }
                }
                if (ay1VarX != null && ay1VarX.h()) {
                    jn2 jn2Var2 = new jn2(ay1VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((pu0) list.get(i2)).invoke(jn2Var2, this);
                    }
                }
                synchronized (tx2.c) {
                    try {
                        p();
                        tx2.d();
                        if (ay1Var != null) {
                            Object[] objArr = ay1Var.b;
                            long[] jArr = ay1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                tx2.p((x03) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (ay1VarX != null) {
                            Object[] objArr2 = ay1VarX.b;
                            long[] jArr2 = ay1VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                tx2.p((x03) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                tx2.p((x03) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return px2.f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ay1 x() {
        return this.h;
    }

    @Override // defpackage.nx2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public lu0 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final hd0 z(long j, ay1 ay1Var, HashMap map, rx2 rx2Var) {
        ArrayList arrayList;
        ArrayList arrayListX0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        x03 x03Var;
        z03 z03Var;
        rx2 rx2Var2;
        Object[] objArr;
        long[] jArr;
        rx2 rx2Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        z03 z03VarB;
        rx2 rx2VarD = d().e(g()).d(this.j);
        Object[] objArr3 = ay1Var.b;
        long[] jArr3 = ay1Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListX0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            x03 x03Var2 = (x03) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            z03 z03VarA = x03Var2.a();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            z03 z03VarR = tx2.r(z03VarA, j, rx2Var);
                            if (z03VarR == null) {
                                arrayList4 = arrayListX0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListX0;
                                j2 = j3;
                                z03 z03VarR2 = tx2.r(z03VarA, g(), rx2VarD);
                                if (z03VarR2 != null && z03VarR2.a != 1 && !z03VarR.equals(z03VarR2)) {
                                    rx2Var3 = rx2VarD;
                                    z03 z03VarR3 = tx2.r(z03VarA, g(), d());
                                    if (z03VarR3 == null) {
                                        tx2.q();
                                        throw null;
                                    }
                                    if (map == null || (z03VarB = (z03) map.get(z03VarR)) == null) {
                                        z03VarB = x03Var2.b(z03VarR2, z03VarR, z03VarR3);
                                    }
                                    if (z03VarB == null) {
                                        return new ox2(this);
                                    }
                                    if (!z03VarB.equals(z03VarR3)) {
                                        if (z03VarB.equals(z03VarR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new i52(x03Var2, z03VarR.b(g())));
                                            arrayListX0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListX0.add(x03Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!z03VarB.equals(z03VarR2) ? new i52(x03Var2, z03VarB) : new i52(x03Var2, z03VarR2.b(g())));
                                        }
                                    }
                                    arrayListX0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListX0 = arrayList4;
                            }
                            rx2Var3 = rx2VarD;
                            arrayList2 = arrayList5;
                            arrayListX0 = arrayList4;
                        } else {
                            rx2Var3 = rx2VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        rx2VarD = rx2Var3;
                    }
                    rx2Var2 = rx2VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    rx2Var2 = rx2VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    rx2VarD = rx2Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    i52 i52Var = (i52) arrayList2.get(i2);
                    x03Var = (x03) i52Var.e;
                    z03Var = (z03) i52Var.f;
                    z03Var.a = j;
                    synchronized (tx2.c) {
                        z03Var.b = x03Var.a();
                        x03Var.c(z03Var);
                    }
                }
            }
            if (arrayListX0 != null) {
                size = arrayListX0.size();
                for (i = 0; i < size; i++) {
                    ay1Var.l((x03) arrayListX0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListX0 = zy.x0(arrayList3, arrayListX0);
                }
                this.i = arrayListX0;
            }
            return px2.f;
        }
        arrayList = null;
        arrayListX0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                i52 i52Var2 = (i52) arrayList2.get(i2);
                x03Var = (x03) i52Var2.e;
                z03Var = (z03) i52Var2.f;
                z03Var.a = j;
                synchronized (tx2.c) {
                    z03Var.b = x03Var.a();
                    x03Var.c(z03Var);
                }
            }
        }
        if (arrayListX0 != null) {
            size = arrayListX0.size();
            while (i < size) {
                ay1Var.l((x03) arrayListX0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListX0 = zy.x0(arrayList3, arrayListX0);
            }
            this.i = arrayListX0;
        }
        return px2.f;
    }
}
