package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fc0 extends y03 implements s03 {
    public final au0 f;
    public final ay2 g;
    public ec0 h = new ec0(tx2.h().g());

    public fc0(au0 au0Var, ay2 ay2Var) {
        this.f = au0Var;
        this.g = ay2Var;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.h;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        this.h = (ec0) z03Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final ec0 g(ec0 ec0Var, nx2 nx2Var, boolean z, au0 au0Var) {
        ay2 ay2Var;
        int i;
        ec0 ec0Var2 = ec0Var;
        if (ec0Var2.c(this, nx2Var)) {
            if (z) {
                gy1 gy1VarA = by2.a();
                Object[] objArr = gy1VarA.e;
                int i2 = gy1VarA.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((nv0) objArr[i3]).b();
                }
                try {
                    ox1 ox1Var = ec0Var2.e;
                    gn gnVar = by2.a;
                    m41 m41Var = (m41) gnVar.h();
                    if (m41Var == null) {
                        m41Var = new m41();
                        gnVar.B(m41Var);
                    }
                    int i4 = m41Var.a;
                    Object[] objArr2 = ox1Var.b;
                    int[] iArr = ox1Var.c;
                    long[] jArr = ox1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        x03 x03Var = (x03) objArr2[i9];
                                        i = i6;
                                        m41Var.a = i4 + iArr[i9];
                                        lu0 lu0VarE = nx2Var.e();
                                        if (lu0VarE != null) {
                                            lu0VarE.invoke(x03Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    m41Var.a = i4;
                } finally {
                    Object[] objArr3 = gy1VarA.e;
                    int i10 = gy1VarA.g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((nv0) objArr3[i11]).a();
                    }
                }
            }
            return ec0Var2;
        }
        ox1 ox1Var2 = new ox1();
        gn gnVar2 = by2.a;
        m41 m41Var2 = (m41) gnVar2.h();
        if (m41Var2 == null) {
            m41Var2 = new m41();
            gnVar2.B(m41Var2);
        }
        int i12 = m41Var2.a;
        gy1 gy1VarA2 = by2.a();
        Object[] objArr4 = gy1VarA2.e;
        int i13 = gy1VarA2.g;
        for (int i14 = 0; i14 < i13; i14++) {
            ((nv0) objArr4[i14]).b();
        }
        try {
            m41Var2.a = i12 + 1;
            Object objW = wc0.W(new f9(this, m41Var2, ox1Var2, i12), au0Var);
            m41Var2.a = i12;
            Object[] objArr5 = gy1VarA2.e;
            int i15 = gy1VarA2.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ((nv0) objArr5[i16]).a();
            }
            Object obj = tx2.c;
            synchronized (obj) {
                try {
                    nx2 nx2VarH = tx2.h();
                    Object obj2 = ec0Var2.f;
                    if (obj2 == ec0.h || (ay2Var = this.g) == null || !ay2Var.d(objW, obj2)) {
                        ec0 ec0Var3 = this.h;
                        synchronized (obj) {
                            z03 z03VarK = tx2.k(ec0Var3, this);
                            z03VarK.a(ec0Var3);
                            z03VarK.a = nx2VarH.g();
                            ec0Var2 = (ec0) z03VarK;
                            ec0Var2.e = ox1Var2;
                            ec0Var2.g = ec0Var2.d(this, nx2VarH);
                            ec0Var2.f = objW;
                        }
                        return ec0Var2;
                    }
                    ec0Var2.e = ox1Var2;
                    ec0Var2.g = ec0Var2.d(this, nx2VarH);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m41 m41Var3 = (m41) by2.a.h();
            if (m41Var3 == null || m41Var3.a != 0) {
                return ec0Var2;
            }
            tx2.h().m();
            synchronized (obj) {
                nx2 nx2VarH2 = tx2.h();
                ec0Var2.c = nx2VarH2.g();
                ec0Var2.d = nx2VarH2.h();
                return ec0Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = gy1VarA2.e;
            int i17 = gy1VarA2.g;
            for (int i18 = 0; i18 < i17; i18++) {
                ((nv0) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    @Override // defpackage.s03
    public final Object getValue() {
        lu0 lu0VarE = tx2.h().e();
        if (lu0VarE != null) {
            lu0VarE.invoke(this);
        }
        nx2 nx2VarH = tx2.h();
        return g((ec0) tx2.g(this.h, nx2VarH), nx2VarH, true, this.f).f;
    }

    public final ec0 h() {
        nx2 nx2VarH = tx2.h();
        return g((ec0) tx2.g(this.h, nx2VarH), nx2VarH, false, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ec0 ec0Var = (ec0) tx2.f(this.h);
        sb.append(ec0Var.c(this, tx2.h()) ? String.valueOf(ec0Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
