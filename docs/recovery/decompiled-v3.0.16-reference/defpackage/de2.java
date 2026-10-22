package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class de2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ de2(li3 li3Var, h82 h82Var, int i) {
        this.e = 2;
        this.g = li3Var;
        this.h = h82Var;
        this.f = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        n30 n30Var;
        mf3 mf3Var;
        n30 n30Var2;
        mf3 mf3Var2;
        int i;
        int i2 = this.e;
        mf3 mf3Var3 = mf3.a;
        int i3 = 0;
        int i4 = this.f;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                ee2 ee2Var = (ee2) obj3;
                ox1 ox1Var = (ox1) obj2;
                n30 n30Var3 = (n30) obj;
                if (ee2Var.e == i4 && o51.f(ox1Var, ee2Var.f) && (n30Var3 instanceof t30)) {
                    long[] jArr = ox1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = ox1Var.b[i9];
                                        boolean z = ox1Var.c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            t30 t30Var = (t30) n30Var3;
                                            n30Var2 = n30Var3;
                                            zx1 zx1Var = t30Var.k;
                                            ce0.S(zx1Var, obj4, ee2Var);
                                            mf3Var2 = mf3Var3;
                                            if (obj4 instanceof fc0) {
                                                fc0 fc0Var = (fc0) obj4;
                                                if (!zx1Var.c(fc0Var)) {
                                                    ce0.T(t30Var.n, fc0Var);
                                                }
                                                zx1 zx1Var2 = ee2Var.g;
                                                if (zx1Var2 != null) {
                                                    zx1Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            n30Var2 = n30Var3;
                                            mf3Var2 = mf3Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            ox1Var.f(i9);
                                        }
                                    } else {
                                        n30Var2 = n30Var3;
                                        mf3Var2 = mf3Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    n30Var3 = n30Var2;
                                    mf3Var3 = mf3Var2;
                                }
                                n30Var = n30Var3;
                                mf3Var = mf3Var3;
                                if (i7 != i6) {
                                    return mf3Var;
                                }
                            } else {
                                n30Var = n30Var3;
                                mf3Var = mf3Var3;
                            }
                            if (i5 == length) {
                                return mf3Var;
                            }
                            i5++;
                            n30Var3 = n30Var;
                            mf3Var3 = mf3Var;
                            i3 = 0;
                        }
                    }
                }
                return mf3Var3;
            case 1:
                yn2 yn2Var = (yn2) obj3;
                h82 h82Var = (h82) obj2;
                g82 g82Var = (g82) obj;
                int iG = yn2Var.s.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                if (iG <= i4) {
                    i4 = iG;
                }
                int i10 = -i4;
                boolean z2 = yn2Var.t;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                g82Var.e = true;
                g82.C(g82Var, h82Var, i11, i10);
                g82Var.e = false;
                return mf3Var3;
            default:
                li3 li3Var = (li3) obj3;
                h82 h82Var2 = (h82) obj2;
                g82 g82Var2 = (g82) obj;
                int i12 = li3Var.b;
                r73 r73Var = li3Var.a;
                bc3 bc3Var = li3Var.c;
                y83 y83Var = (y83) li3Var.d.invoke();
                r73Var.a(x32.e, q73.d(g82Var2, i12, bc3Var, y83Var != null ? y83Var.a : null, false, h82Var2.e), i4, h82Var2.f);
                g82.B(g82Var2, h82Var2, 0, Math.round(-r73Var.a.g()));
                return mf3Var3;
        }
    }

    public /* synthetic */ de2(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }
}
