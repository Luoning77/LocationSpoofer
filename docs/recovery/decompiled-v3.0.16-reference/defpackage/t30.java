package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t30 implements n30 {
    public int A;
    public final o30 e;
    public final if3 f;
    public final AtomicReference g = new AtomicReference(null);
    public final Object h = new Object();
    public final cy1 i;
    public final hx2 j;
    public final zx1 k;
    public final ay1 l;
    public final ay1 m;
    public final zx1 n;
    public final kw o;
    public final kw p;
    public final zx1 q;
    public zx1 r;
    public boolean s;
    public pv2 t;
    public g72 u;
    public t30 v;
    public int w;
    public final t1 x;
    public final lj y;
    public final ov0 z;

    public t30(o30 o30Var, if3 if3Var) {
        this.e = o30Var;
        this.f = if3Var;
        cy1 cy1Var = new cy1(new ay1());
        this.i = cy1Var;
        hx2 hx2Var = new hx2();
        if (o30Var.d()) {
            hx2Var.o = new gx1();
        }
        if (o30Var.f()) {
            hx2Var.b();
        }
        this.j = hx2Var;
        this.k = ce0.k();
        this.l = new ay1();
        this.m = new ay1();
        this.n = ce0.k();
        kw kwVar = new kw();
        this.o = kwVar;
        kw kwVar2 = new kw();
        this.p = kwVar2;
        this.q = ce0.k();
        this.r = ce0.k();
        t1 t1Var = new t1(o30Var, 9);
        this.x = t1Var;
        this.y = new lj();
        ov0 ov0Var = new ov0(if3Var, o30Var, jx2.a(hx2Var), cy1Var, kwVar, kwVar2, t1Var, this);
        o30Var.p(ov0Var);
        this.z = ov0Var;
    }

    public final void A(pu0 pu0Var) {
        boolean zI = i();
        q();
        o30 o30Var = this.e;
        if (!zI) {
            o30Var.a(this, pu0Var);
            return;
        }
        ov0 ov0Var = this.z;
        ov0Var.z = 0;
        ov0Var.y = true;
        o30Var.a(this, pu0Var);
        ov0Var.u();
    }

    public final void a() {
        this.g.set(null);
        this.o.F0.S();
        this.p.F0.S();
        cy1 cy1Var = this.i;
        if (cy1Var.e.g()) {
            return;
        }
        lj ljVar = this.y;
        try {
            ljVar.j(cy1Var, this.z.C());
            ljVar.c();
        } finally {
            ljVar.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.k.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof ay1;
        y51 y51Var = y51.e;
        ay1 ay1Var = this.l;
        ay1 ay1Var2 = this.m;
        zx1 zx1Var = this.q;
        if (!z2) {
            ee2 ee2Var = (ee2) objG;
            if (ce0.S(zx1Var, obj, ee2Var) || ee2Var.b(obj) == y51Var) {
                return;
            }
            if (ee2Var.g == null || z) {
                ay1Var.a(ee2Var);
                return;
            } else {
                ay1Var2.a(ee2Var);
                return;
            }
        }
        ay1 ay1Var3 = (ay1) objG;
        Object[] objArr = ay1Var3.b;
        long[] jArr = ay1Var3.a;
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
                        ee2 ee2Var2 = (ee2) objArr[(i << 3) + i3];
                        if (!ce0.S(zx1Var, obj, ee2Var2) && ee2Var2.b(obj) != y51Var) {
                            if (ee2Var2.g == null || z) {
                                ay1Var.a(ee2Var2);
                            } else {
                                ay1Var2.a(ee2Var2);
                            }
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

    /* JADX WARN: Code duplicated, block: B:190:0x00c8 A[EDGE_INSN: B:190:0x00c8->B:38:0x00c8 BREAK  A[LOOP:2: B:24:0x0077->B:36:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0122 A[EDGE_INSN: B:218:0x0122->B:213:0x0122 BREAK  A[LOOP:13: B:61:0x0151->B:72:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4 A[LOOP:2: B:24:0x0077->B:36:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185 A[LOOP:13: B:61:0x0151->B:72:0x0185, LOOP_END] */
    public final void c(boolean z, Set set) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        Object[] objArr;
        long[] jArr8;
        Object[] objArr2;
        char c2;
        int i;
        int i2;
        boolean z2 = set instanceof jn2;
        zx1 zx1Var = this.n;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            ay1 ay1Var = ((jn2) set).e;
            Object[] objArr3 = ay1Var.b;
            long[] jArr9 = ay1Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j8 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j8 & 255) < 128) {
                                Object obj2 = objArr3[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof ee2) {
                                    ((ee2) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = zx1Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof ay1) {
                                            ay1 ay1Var2 = (ay1) objG;
                                            Object[] objArr4 = ay1Var2.b;
                                            long[] jArr10 = ay1Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j9 = jArr10[i8];
                                                    jArr8 = jArr9;
                                                    objArr2 = objArr3;
                                                    if ((((~j9) << c2) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i8 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i8++;
                                                        objArr3 = objArr2;
                                                        jArr9 = jArr8;
                                                        i7 = 8;
                                                    } else {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        for (int i10 = 0; i10 < i9; i10++) {
                                                            if ((j9 & 255) < 128) {
                                                                b((fc0) objArr4[(i8 << 3) + i10], z);
                                                            }
                                                            j9 >>= i7;
                                                        }
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                        if (i8 != length2) {
                                                            break;
                                                        }
                                                        i8++;
                                                        objArr3 = objArr2;
                                                        jArr9 = jArr8;
                                                        i7 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            objArr2 = objArr3;
                                            i = length;
                                            b((fc0) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                objArr2 = objArr3;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                objArr2 = objArr3;
                                c2 = c3;
                                i = length;
                                i2 = i3;
                            }
                            j8 >>= i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            objArr3 = objArr2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        objArr = objArr3;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        objArr = objArr3;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    objArr3 = objArr;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof ee2) {
                    ((ee2) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = zx1Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof ay1) {
                            ay1 ay1Var3 = (ay1) objG2;
                            Object[] objArr5 = ay1Var3.b;
                            long[] jArr11 = ay1Var3.a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j10 = jArr11[i12];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j10 & 255) < 128) {
                                                b((fc0) objArr5[(i12 << 3) + i14], z);
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((fc0) objG2, z);
                        }
                    }
                }
            }
        }
        zx1 zx1Var2 = this.k;
        ay1 ay1Var4 = this.l;
        if (z) {
            ay1 ay1Var5 = this.m;
            if (ay1Var5.h()) {
                long[] jArr12 = zx1Var2.a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j11 = jArr12[i15];
                        if ((((~j11) << c) & j11 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j11 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = zx1Var2.b[i18];
                                    Object obj5 = zx1Var2.c[i18];
                                    if (obj5 instanceof ay1) {
                                        ay1 ay1Var6 = (ay1) obj5;
                                        Object[] objArr6 = ay1Var6.b;
                                        long[] jArr13 = ay1Var6.a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j11;
                                            int i19 = 0;
                                            while (true) {
                                                long j12 = jArr13[i19];
                                                Object[] objArr7 = objArr6;
                                                long[] jArr14 = jArr13;
                                                if ((((~j12) << c) & j12 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j12 & j2) < j) {
                                                            jArr6 = jArr12;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j12;
                                                            ee2 ee2Var = (ee2) objArr7[i22];
                                                            if (ay1Var5.c(ee2Var) || ay1Var4.c(ee2Var)) {
                                                                ay1Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr12;
                                                            j7 = j12;
                                                        }
                                                        j12 = j7 >> 8;
                                                        i21++;
                                                        jArr12 = jArr6;
                                                    }
                                                    jArr5 = jArr12;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr12;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr6 = objArr7;
                                                jArr13 = jArr14;
                                                jArr12 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            j6 = j11;
                                        }
                                        zG = ay1Var6.g();
                                    } else {
                                        jArr5 = jArr12;
                                        j6 = j11;
                                        obj5.getClass();
                                        ee2 ee2Var2 = (ee2) obj5;
                                        zG = ay1Var5.c(ee2Var2) || ay1Var4.c(ee2Var2);
                                    }
                                    if (zG) {
                                        zx1Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    j6 = j11;
                                }
                                j11 = j6 >> 8;
                                i17++;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr12 = jArr4;
                    }
                }
                ay1Var5.b();
                h();
                return;
            }
        }
        if (ay1Var4.h()) {
            long[] jArr15 = zx1Var2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j13 = jArr15[i23];
                    if ((((~j13) << c) & j13 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j13 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = zx1Var2.b[i26];
                                Object obj7 = zx1Var2.c[i26];
                                if (obj7 instanceof ay1) {
                                    ay1 ay1Var7 = (ay1) obj7;
                                    Object[] objArr8 = ay1Var7.b;
                                    long[] jArr16 = ay1Var7.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j13;
                                        int i27 = 0;
                                        while (true) {
                                            long j14 = jArr16[i27];
                                            Object[] objArr9 = objArr8;
                                            long[] jArr17 = jArr16;
                                            if ((((~j14) << c) & j14 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j14 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j14;
                                                        if (ay1Var4.c((ee2) objArr9[i30])) {
                                                            ay1Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j14;
                                                    }
                                                    j14 = j5 >> 8;
                                                    i29++;
                                                    jArr15 = jArr3;
                                                }
                                                jArr2 = jArr15;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr8 = objArr9;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j13;
                                    }
                                    zC = ay1Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j13;
                                    obj7.getClass();
                                    zC = ay1Var4.c((ee2) obj7);
                                }
                                if (zC) {
                                    zx1Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j13;
                            }
                            j13 = j4 >> 8;
                            i25++;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr15 = jArr;
                }
            }
            h();
            ay1Var4.b();
        }
    }

    public final void d() {
        synchronized (this.h) {
            try {
                e(this.o);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        lj ljVar = this.y;
                        try {
                            ljVar.j(this.i, this.z.C());
                            ljVar.c();
                        } finally {
                            ljVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:146:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:146:0x00e9->B:76:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0158, B:89:0x016b, B:76:0x012c, B:81:0x0140, B:95:0x0189, B:97:0x0195), top: B:146:0x00e9 }] */
    public final void e(kw kwVar) throws Throwable {
        lj ljVar;
        long[] jArr;
        int i;
        long[] jArr2;
        lj ljVar2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        kw kwVar2 = this.p;
        ov0 ov0Var = this.z;
        r30 r30VarC = ov0Var.C();
        lj ljVar3 = this.y;
        ljVar3.j(this.i, r30VarC);
        try {
            if (kwVar.F0.U()) {
                try {
                    if (kwVar2.F0.U() && this.u == null) {
                        ljVar3.c();
                    }
                    return;
                } finally {
                    ljVar3.a();
                }
            }
            g72 g72Var = this.u;
            un unVar = g72Var != null ? g72Var.l : this.f;
            try {
                Trace.beginSection(unVar.equals(g72Var != null ? g72Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    g72 g72Var2 = this.u;
                    lj ljVar4 = g72Var2 != null ? g72Var2.k : ljVar3;
                    hx2 hx2Var = this.j;
                    r30 r30VarC2 = ov0Var.C();
                    kx2 kx2VarD = jx2.a(hx2Var).d();
                    int i3 = 0;
                    try {
                        kwVar.J(unVar, kx2VarD, ljVar4, r30VarC2);
                        kx2VarD.e(true);
                        unVar.g();
                        Trace.endSection();
                        ljVar3.d();
                        ljVar3.e();
                        if (this.s) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.s = false;
                                zx1 zx1Var = this.k;
                                long[] jArr3 = zx1Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = zx1Var.b[i8];
                                                    Object obj2 = zx1Var.c[i8];
                                                    if (obj2 instanceof ay1) {
                                                        ay1 ay1Var = (ay1) obj2;
                                                        Object[] objArr = ay1Var.b;
                                                        long[] jArr4 = ay1Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        ljVar2 = ljVar3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((ee2) objArr[i13]).a()) {
                                                                                    ay1Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = ay1Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        ljVar2 = ljVar3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((ee2) obj2).a();
                                                    }
                                                    if (zG) {
                                                        zx1Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    ljVar2 = ljVar3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                ljVar3 = ljVar2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            ljVar = ljVar3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            ljVar = ljVar3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        ljVar3 = ljVar;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    ljVar = ljVar3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            ljVar = ljVar3;
                        }
                        try {
                            if (kwVar2.F0.U() && this.u == null) {
                                ljVar.c();
                            }
                            return;
                        } finally {
                            ljVar.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            kx2VarD.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (kwVar2.F0.U() && this.u == null) {
                ljVar3.c();
            }
            throw th;
        } finally {
            ljVar3.a();
        }
    }

    public final void f() {
        synchronized (this.h) {
            try {
                kw kwVar = this.p;
                kwVar.getClass();
                if (!kwVar.F0.U()) {
                    e(this.p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        lj ljVar = this.y;
                        try {
                            ljVar.j(this.i, this.z.C());
                            ljVar.c();
                        } finally {
                            ljVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.h) {
            try {
                this.z.v = null;
                if (!this.i.e.g()) {
                    lj ljVar = this.y;
                    try {
                        ljVar.j(this.i, this.z.C());
                        ljVar.c();
                        ljVar.a();
                    } catch (Throwable th) {
                        ljVar.a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.i.e.g()) {
                        lj ljVar2 = this.y;
                        try {
                            ljVar2.j(this.i, this.z.C());
                            ljVar2.c();
                        } finally {
                            ljVar2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        zx1 zx1Var = this.n;
        long[] jArr3 = zx1Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = zx1Var.b[i10];
                            Object obj2 = zx1Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof ay1;
                            j5 = j8;
                            zx1 zx1Var2 = this.k;
                            if (z) {
                                ay1 ay1Var = (ay1) obj2;
                                Object[] objArr = ay1Var.b;
                                long[] jArr4 = ay1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!zx1Var2.c((fc0) objArr[i15])) {
                                                        ay1Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = ay1Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !zx1Var2.c((fc0) obj2);
                            }
                            if (zG) {
                                zx1Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        ay1 ay1Var2 = this.m;
        if (!ay1Var2.h()) {
            return;
        }
        Object[] objArr2 = ay1Var2.b;
        long[] jArr5 = ay1Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((ee2) objArr2[i20]).g == null) {
                            ay1Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.h) {
            z = true;
            if (this.A != 1) {
                z = false;
            }
            if (z) {
                this.A = 0;
            }
        }
        return z;
    }

    public final void j(pu0 pu0Var) {
        try {
            synchronized (this.h) {
                n();
                zx1 zx1Var = this.r;
                this.r = ce0.k();
                try {
                    ov0 ov0Var = this.z;
                    pv2 pv2Var = this.t;
                    if (!ov0Var.e.F0.U()) {
                        j30.a("Expected applyChanges() to have been called");
                    }
                    ov0Var.P = pv2Var;
                    try {
                        ov0Var.n(zx1Var, pu0Var);
                        ov0Var.P = null;
                    } catch (Throwable th) {
                        ov0Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.r = zx1Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.i.e.g()) {
                    lj ljVar = this.y;
                    try {
                        ljVar.j(this.i, this.z.C());
                        ljVar.c();
                    } finally {
                        ljVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final g72 k(boolean z, pu0 pu0Var) {
        if (this.u != null) {
            hb2.b("A pausable composition is in progress");
        }
        g72 g72Var = new g72(this, this.e, this.z, this.i, pu0Var, z, this.f, this.h);
        this.u = g72Var;
        return g72Var;
    }

    public final void l() {
        synchronized (this.h) {
            try {
                if (this.u != null) {
                    hb2.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.j.f == 0;
                if (!z || !this.i.e.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        lj ljVar = this.y;
                        try {
                            ljVar.j(this.i, this.z.C());
                            if (!z) {
                                hx2 hx2Var = this.j;
                                lj ljVar2 = this.y;
                                kx2 kx2VarD = hx2Var.d();
                                try {
                                    kx2VarD.m(kx2VarD.t, new j2(14, ljVar2, kx2VarD));
                                    kx2VarD.e(true);
                                    this.f.g();
                                    ljVar.d();
                                } catch (Throwable th) {
                                    kx2VarD.e(false);
                                    throw th;
                                }
                            }
                            ljVar.c();
                            ljVar.a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            ljVar.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.k.a();
                this.n.a();
                this.r.a();
                this.o.F0.S();
                this.p.F0.S();
                ov0 ov0Var = this.z;
                ov0Var.E.clear();
                ov0Var.s.clear();
                ov0Var.e.F0.S();
                ov0Var.v = null;
                this.A = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.h) {
            try {
                if (this.z.F) {
                    hb2.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.A != 3) {
                    this.A = 3;
                    kw kwVar = this.z.L;
                    if (kwVar != null) {
                        e(kwVar);
                    }
                    boolean z = this.j.f == 0;
                    if (!z || !this.i.e.g()) {
                        lj ljVar = this.y;
                        try {
                            ljVar.j(this.i, this.z.C());
                            if (!z) {
                                hx2 hx2Var = this.j;
                                lj ljVar2 = this.y;
                                kx2 kx2VarD = hx2Var.d();
                                try {
                                    kx2VarD.m(kx2VarD.t, new s5(ljVar2, 4));
                                    kx2VarD.G();
                                    kx2VarD.e(true);
                                    this.f.a();
                                    this.f.g();
                                    ljVar.d();
                                } catch (Throwable th) {
                                    kx2VarD.e(false);
                                    throw th;
                                }
                            }
                            ljVar.c();
                            ljVar.a();
                        } catch (Throwable th2) {
                            ljVar.a();
                            throw th2;
                        }
                    }
                    ov0 ov0Var = this.z;
                    ov0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        ov0Var.b.u(ov0Var);
                        ov0Var.E.clear();
                        ov0Var.s.clear();
                        ov0Var.e.F0.S();
                        ov0Var.v = null;
                        ov0Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.e.v(this);
    }

    public final void n() {
        Object obj = xp1.i;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                j30.b("pending composition has not been applied");
                fo.d();
                return;
            }
            if (andSet instanceof Set) {
                c(true, (Set) andSet);
                return;
            }
            if (!(andSet instanceof Object[])) {
                j30.b("corrupt pendingModifications drain: " + atomicReference);
                fo.d();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(true, set);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(null);
        if (o51.f(andSet, xp1.i)) {
            return;
        }
        if (andSet instanceof Set) {
            c(false, (Set) andSet);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(false, set);
            }
            return;
        }
        if (andSet == null) {
            if (this.u == null) {
                j30.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            j30.b("corrupt pendingModifications drain: " + atomicReference);
            fo.d();
        }
    }

    public final void p() {
        zj0 zj0Var = zj0.e;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(zj0Var);
        if (o51.f(andSet, xp1.i) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c(false, (Set) andSet);
            return;
        }
        if (!(andSet instanceof Object[])) {
            j30.b("corrupt pendingModifications drain: " + atomicReference);
            fo.d();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(false, set);
        }
    }

    public final void q() {
        String str;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            hb2.b(str);
        }
        if (this.u == null) {
            return;
        }
        hb2.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        cy1 cy1Var = this.i;
        ov0 ov0Var = this.z;
        if (arrayList.size() > 0) {
            ((fw1) ((i52) arrayList.get(0)).e).getClass();
            j30.a("Check failed");
        }
        try {
            ov0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    ov0Var.F(arrayList);
                    ov0Var.i();
                    Trace.endSection();
                } catch (Throwable th) {
                    ov0Var.a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!cy1Var.e.g()) {
                    lj ljVar = this.y;
                    try {
                        ljVar.j(cy1Var, ov0Var.C());
                        ljVar.c();
                    } finally {
                        ljVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final y51 s(ee2 ee2Var, Object obj) {
        t30 t30Var;
        int i = ee2Var.b;
        if ((i & 2) != 0) {
            ee2Var.b = i | 4;
        }
        iv0 iv0Var = ee2Var.c;
        if (iv0Var == null || !iv0Var.a()) {
            return y51.e;
        }
        hx2 hx2Var = this.j;
        hx2Var.getClass();
        iv0 iv0Var2 = ee2Var.c;
        if (iv0Var2 != null && hx2Var.e(ld0.j(iv0Var2))) {
            if (ee2Var.d == null) {
                return y51.e;
            }
            y51 y51VarT = t(ee2Var, iv0Var, obj);
            if (y51VarT != y51.e) {
                this.x.u();
            }
            return y51VarT;
        }
        synchronized (this.h) {
            t30Var = this.v;
        }
        if (t30Var != null) {
            ov0 ov0Var = t30Var.z;
            if (ov0Var.F && ov0Var.i0(ee2Var, obj)) {
                return y51.h;
            }
        }
        return y51.e;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final y51 t(ee2 ee2Var, iv0 iv0Var, Object obj) {
        synchronized (this.h) {
            try {
                t30 t30Var = this.v;
                t30 t30Var2 = null;
                if (t30Var != null) {
                    hx2 hx2Var = this.j;
                    int i = this.w;
                    if (hx2Var.k) {
                        j30.a("Writer is active");
                    }
                    if (i < 0 || i >= hx2Var.f) {
                        j30.a("Invalid group index");
                    }
                    iv0 iv0VarJ = ld0.j(iv0Var);
                    if (hx2Var.e(iv0VarJ)) {
                        int i2 = hx2Var.e[(i * 5) + 3] + i;
                        int i3 = iv0VarJ.a;
                        if (i > i3 || i3 >= i2) {
                            t30Var = null;
                        }
                    } else {
                        t30Var = null;
                    }
                    t30Var2 = t30Var;
                }
                if (t30Var2 == null) {
                    ov0 ov0Var = this.z;
                    if (ov0Var.F && ov0Var.i0(ee2Var, obj)) {
                        return y51.h;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof fc0;
                        zx1 zx1Var = this.r;
                        if (z) {
                            Object objG = zx1Var.g(ee2Var);
                            if (objG == null) {
                                ce0.f(this.r, ee2Var, obj);
                                break;
                            }
                            if (objG instanceof ay1) {
                                ay1 ay1Var = (ay1) objG;
                                Object[] objArr = ay1Var.b;
                                long[] jArr = ay1Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    ce0.f(this.r, ee2Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == u92.i) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        ce0.f(this.r, ee2Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        ce0.f(this.r, ee2Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != u92.i) {
                                    ce0.f(this.r, ee2Var, obj);
                                    break;
                                }
                            }
                        } else {
                            zx1Var.m(ee2Var, u92.i);
                        }
                    } else {
                        this.r.m(ee2Var, u92.i);
                    }
                }
                if (t30Var2 != null) {
                    return t30Var2.t(ee2Var, iv0Var, obj);
                }
                this.e.l(this);
                return this.z.F ? y51.g : y51.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.k.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof ay1;
        y51 y51Var = y51.h;
        zx1 zx1Var = this.q;
        if (!z) {
            ee2 ee2Var = (ee2) objG;
            if (ee2Var.b(obj) == y51Var) {
                ce0.f(zx1Var, obj, ee2Var);
                return;
            }
            return;
        }
        ay1 ay1Var = (ay1) objG;
        Object[] objArr = ay1Var.b;
        long[] jArr = ay1Var.a;
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
                        ee2 ee2Var2 = (ee2) objArr[(i << 3) + i3];
                        if (ee2Var2.b(obj) == y51Var) {
                            ce0.f(zx1Var, obj, ee2Var2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z = set instanceof jn2;
        zx1 zx1Var = this.n;
        zx1 zx1Var2 = this.k;
        if (z) {
            ay1 ay1Var = ((jn2) set).e;
            Object[] objArr = ay1Var.b;
            long[] jArr = ay1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (zx1Var2.c(obj) || zx1Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (zx1Var2.c(obj2) || zx1Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.h) {
            g72 g72Var = this.u;
            boolean z = false;
            if (g72Var != null && (g72Var.h.get() != i72.i || g72Var.i != a83.b())) {
                AtomicReference atomicReference = g72Var.h;
                i72 i72Var = i72.j;
                i72 i72Var2 = i72.h;
                while (!atomicReference.compareAndSet(i72Var, i72Var2) && atomicReference.get() == i72Var) {
                }
                g72Var.l.e.a(9);
                return false;
            }
            n();
            try {
                zx1 zx1Var = this.r;
                this.r = ce0.k();
                try {
                    ov0 ov0Var = this.z;
                    pv2 pv2Var = this.t;
                    u32 u32Var = ov0Var.e.F0;
                    if (!u32Var.U()) {
                        j30.a("Expected applyChanges() to have been called");
                    }
                    if (zx1Var.e > 0 || !ov0Var.s.isEmpty()) {
                        ov0Var.P = pv2Var;
                        try {
                            ov0Var.n(zx1Var, null);
                            ov0Var.P = null;
                            z = !u32Var.U();
                        } catch (Throwable th) {
                            ov0Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.r = zx1Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.i.e.g()) {
                        lj ljVar = this.y;
                        try {
                            ljVar.j(this.i, this.z.C());
                            ljVar.c();
                        } finally {
                            ljVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(jn2 jn2Var) {
        Object obj;
        while (true) {
            Object obj2 = this.g.get();
            if (obj2 == null || obj2.equals(xp1.i)) {
                obj = jn2Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, jn2Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    b81.v(this.g, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = jn2Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.g;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.h) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void y(Object obj) {
        ee2 ee2VarA;
        int i;
        boolean z;
        ov0 ov0Var = this.z;
        if (ov0Var.A <= 0 && (ee2VarA = ov0Var.A()) != null) {
            int i2 = ee2VarA.b | 1;
            ee2VarA.b = i2;
            if ((i2 & 32) == 0) {
                ox1 ox1Var = ee2VarA.f;
                if (ox1Var == null) {
                    ox1Var = new ox1();
                    ee2VarA.f = ox1Var;
                }
                int i3 = ee2VarA.e;
                int iC = ox1Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = ox1Var.c[iC];
                }
                ox1Var.b[iC] = obj;
                ox1Var.c[iC] = i3;
                if (i == ee2VarA.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.x.u();
            if (z) {
                return;
            }
            if (obj instanceof y03) {
                ((y03) obj).f(1);
            }
            ce0.f(this.k, obj, ee2VarA);
            if (obj instanceof fc0) {
                fc0 fc0Var = (fc0) obj;
                ec0 ec0VarH = fc0Var.h();
                zx1 zx1Var = this.n;
                ce0.T(zx1Var, obj);
                ox1 ox1Var2 = ec0VarH.e;
                Object[] objArr = ox1Var2.b;
                long[] jArr = ox1Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    x03 x03Var = (x03) objArr[(i4 << 3) + i7];
                                    if (x03Var instanceof y03) {
                                        ((y03) x03Var).f(1);
                                    }
                                    ce0.f(zx1Var, x03Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = ec0VarH.f;
                zx1 zx1Var2 = ee2VarA.g;
                if (zx1Var2 == null) {
                    zx1Var2 = new zx1();
                    ee2VarA.g = zx1Var2;
                }
                zx1Var2.m(fc0Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.h) {
            try {
                u(obj);
                Object objG = this.n.g(obj);
                if (objG != null) {
                    if (objG instanceof ay1) {
                        ay1 ay1Var = (ay1) objG;
                        Object[] objArr = ay1Var.b;
                        long[] jArr = ay1Var.a;
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
                                            u((fc0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((fc0) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
