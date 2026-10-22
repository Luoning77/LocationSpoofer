package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m40 implements b51 {
    public static final m40 b = new m40(0);
    public final /* synthetic */ int a;

    public /* synthetic */ m40(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018a A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x0110, B:87:0x012b, B:89:0x0134, B:92:0x013b, B:93:0x014f, B:95:0x0171, B:102:0x018a, B:104:0x018e, B:108:0x019b, B:110:0x01ae, B:112:0x01b8, B:113:0x01c2, B:97:0x017b), top: B:225:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x018e A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x0110, B:87:0x012b, B:89:0x0134, B:92:0x013b, B:93:0x014f, B:95:0x0171, B:102:0x018a, B:104:0x018e, B:108:0x019b, B:110:0x01ae, B:112:0x01b8, B:113:0x01c2, B:97:0x017b), top: B:225:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0193  */
    /* JADX WARN: Code duplicated, block: B:108:0x019b A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x0110, B:87:0x012b, B:89:0x0134, B:92:0x013b, B:93:0x014f, B:95:0x0171, B:102:0x018a, B:104:0x018e, B:108:0x019b, B:110:0x01ae, B:112:0x01b8, B:113:0x01c2, B:97:0x017b), top: B:225:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x0110, B:87:0x012b, B:89:0x0134, B:92:0x013b, B:93:0x014f, B:95:0x0171, B:102:0x018a, B:104:0x018e, B:108:0x019b, B:110:0x01ae, B:112:0x01b8, B:113:0x01c2, B:97:0x017b), top: B:225:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ce A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:227:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc A[Catch: IOException -> 0x0101, TryCatch #10 {IOException -> 0x0101, blocks: (B:72:0x00f3, B:74:0x00fc, B:77:0x0106), top: B:238:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134 A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x0110, B:87:0x012b, B:89:0x0134, B:92:0x013b, B:93:0x014f, B:95:0x0171, B:102:0x018a, B:104:0x018e, B:108:0x019b, B:110:0x01ae, B:112:0x01b8, B:113:0x01c2, B:97:0x017b), top: B:225:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017b A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x0110, B:87:0x012b, B:89:0x0134, B:92:0x013b, B:93:0x014f, B:95:0x0171, B:102:0x018a, B:104:0x018e, B:108:0x019b, B:110:0x01ae, B:112:0x01b8, B:113:0x01c2, B:97:0x017b), top: B:225:0x0110 }] */
    @Override // defpackage.b51
    public final qg2 intercept(a51 a51Var) throws Throwable {
        ox0 ox0Var;
        pg2 pg2VarD;
        boolean z;
        IOException iOException;
        qg2 qg2VarA;
        int i;
        qg2 qg2VarA2;
        yf2 yf2Var;
        tg2 tg2Var;
        long jContentLength;
        tg2 tg2Var2;
        Long lValueOf;
        pg2 pg2Var;
        pg2 pg2Var2;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                be2 be2Var = (be2) a51Var;
                xd2 xd2Var = be2Var.a;
                synchronized (xd2Var) {
                    try {
                        if (!xd2Var.r) {
                            throw new IllegalStateException("released");
                        }
                        if (xd2Var.q) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (xd2Var.p) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gm0 gm0Var = xd2Var.l;
                gm0Var.getClass();
                k12 k12Var = xd2Var.e;
                try {
                    em0 em0Var = new em0(xd2Var, xd2Var.h, gm0Var, gm0Var.a(be2Var.f, be2Var.g, be2Var.h, k12Var.j, !o51.f(be2Var.e.b, "GET")).j(k12Var, be2Var));
                    xd2Var.o = em0Var;
                    xd2Var.t = em0Var;
                    synchronized (xd2Var) {
                        xd2Var.p = true;
                        xd2Var.q = true;
                    }
                    if (!xd2Var.s) {
                        return be2.a(be2Var, 0, em0Var, null, 61).b(be2Var.e);
                    }
                    fo.r("Canceled");
                    return null;
                } catch (IOException e) {
                    gm0Var.b(e);
                    throw new oj2(e);
                } catch (oj2 e2) {
                    gm0Var.b(e2.f);
                    throw e2;
                }
            case 1:
                be2 be2Var2 = (be2) a51Var;
                xd2 xd2Var2 = be2Var2.a;
                System.currentTimeMillis();
                yf2 yf2Var2 = be2Var2.e;
                yf2Var2.getClass();
                int i2 = 8;
                d31 d31Var = new d31(i2, yf2Var2, null);
                vu vuVarK = yf2Var2.f;
                if (vuVarK == null) {
                    int i3 = vu.n;
                    vuVarK = am1.K(yf2Var2.c);
                    yf2Var2.f = vuVarK;
                }
                if (vuVarK.j) {
                    Object obj = null;
                    d31Var = new d31(i2, obj, obj);
                }
                yf2 yf2Var3 = (yf2) d31Var.f;
                qg2 qg2Var = (qg2) d31Var.g;
                zl0 zl0Var = xd2Var2.h;
                if (zl0Var == null) {
                    zl0Var = zl0.NONE;
                }
                if (yf2Var3 == null && qg2Var == null) {
                    qg2 qg2Var2 = new qg2(yf2Var2, bd2.g, "Unsatisfiable Request (only-if-cached)", 504, null, new ox0((String[]) new ArrayList(20).toArray(new String[0])), bh3.c, null, null, null, -1L, System.currentTimeMillis(), null);
                    zl0Var.satisfactionFailure(xd2Var2, qg2Var2);
                    return qg2Var2;
                }
                if (yf2Var3 == null) {
                    qg2Var.getClass();
                    pg2 pg2VarO = qg2Var.O();
                    qg2 qg2VarS = xp1.S(qg2Var);
                    pg2.b(qg2VarS, "cacheResponse");
                    pg2VarO.i = qg2VarS;
                    qg2 qg2VarA3 = pg2VarO.a();
                    zl0Var.cacheHit(xd2Var2, qg2VarA3);
                    return qg2VarA3;
                }
                if (qg2Var != null) {
                    zl0Var.cacheConditionalHit(xd2Var2, qg2Var);
                }
                qg2 qg2VarB = be2Var2.b(yf2Var3);
                if (qg2Var != null) {
                    if (qg2VarB.h == 304) {
                        pg2 pg2VarO2 = qg2Var.O();
                        ox0 ox0Var2 = qg2Var.j;
                        ox0 ox0Var3 = qg2VarB.j;
                        ArrayList arrayList = new ArrayList(20);
                        int size = ox0Var2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            String strB = ox0Var2.b(i4);
                            String strD = ox0Var2.d(i4);
                            if ("Warning".equalsIgnoreCase(strB)) {
                                ox0Var = ox0Var2;
                                if (s13.Z(strD, "1", false)) {
                                }
                                i4++;
                                ox0Var2 = ox0Var;
                            } else {
                                ox0Var = ox0Var2;
                            }
                            if ("Content-Length".equalsIgnoreCase(strB) || "Content-Encoding".equalsIgnoreCase(strB) || "Content-Type".equalsIgnoreCase(strB) || !xp1.B(strB) || ox0Var3.a(strB) == null) {
                                strB.getClass();
                                strD.getClass();
                                arrayList.add(strB);
                                arrayList.add(l13.D0(strD).toString());
                            }
                            i4++;
                            ox0Var2 = ox0Var;
                        }
                        int size2 = ox0Var3.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            String strB2 = ox0Var3.b(i5);
                            if (!"Content-Length".equalsIgnoreCase(strB2) && !"Content-Encoding".equalsIgnoreCase(strB2) && !"Content-Type".equalsIgnoreCase(strB2) && xp1.B(strB2)) {
                                String strD2 = ox0Var3.d(i5);
                                strB2.getClass();
                                strD2.getClass();
                                arrayList.add(strB2);
                                arrayList.add(l13.D0(strD2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        nx0 nx0Var = new nx0(0);
                        fz.a0(nx0Var.a, strArr);
                        pg2VarO2.f = nx0Var;
                        pg2VarO2.k = qg2VarB.o;
                        pg2VarO2.l = qg2VarB.p;
                        qg2 qg2VarS2 = xp1.S(qg2Var);
                        pg2.b(qg2VarS2, "cacheResponse");
                        pg2VarO2.i = qg2VarS2;
                        qg2 qg2VarS3 = xp1.S(qg2VarB);
                        pg2.b(qg2VarS3, "networkResponse");
                        pg2VarO2.h = qg2VarS3;
                        pg2VarO2.a();
                        tg2 tg2Var3 = qg2VarB.k;
                        tg2Var3.getClass();
                        tg2Var3.close();
                        throw null;
                    }
                    tg2 tg2Var4 = qg2Var.k;
                    if (tg2Var4 != null) {
                        bh3.c(tg2Var4);
                    }
                }
                pg2 pg2VarO3 = qg2VarB.O();
                qg2 qg2VarS4 = xp1.S(qg2Var);
                pg2.b(qg2VarS4, "cacheResponse");
                pg2VarO3.i = qg2VarS4;
                qg2 qg2VarS5 = xp1.S(qg2VarB);
                pg2.b(qg2VarS5, "networkResponse");
                pg2VarO3.h = qg2VarS5;
                return pg2VarO3.a();
            default:
                be2 be2Var3 = (be2) a51Var;
                em0 em0Var2 = be2Var3.d;
                em0Var2.getClass();
                fm0 fm0Var = em0Var2.d;
                ae2 ae2Var = em0Var2.g;
                zl0 zl0Var2 = em0Var2.b;
                xd2 xd2Var3 = em0Var2.a;
                yf2 yf2Var4 = be2Var3.e;
                cg2 cg2Var = yf2Var4.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        zl0Var2.requestHeadersStart(xd2Var3);
                        fm0Var.a(yf2Var4);
                        zl0Var2.requestHeadersEnd(xd2Var3, yf2Var4);
                        try {
                            if (gh0.K(yf2Var4.b) && cg2Var != null) {
                                if ("100-continue".equalsIgnoreCase(yf2Var4.c.a("Expect"))) {
                                    try {
                                        fm0Var.d();
                                        pg2VarD = em0Var2.d(true);
                                        try {
                                            zl0Var2.responseHeadersStart(xd2Var3);
                                            z = false;
                                        } catch (IOException e3) {
                                            e = e3;
                                            if (e instanceof t40) {
                                                throw e;
                                            }
                                            throw e;
                                        }
                                    } catch (IOException e4) {
                                        zl0Var2.requestFailed(xd2Var3, e4);
                                        em0Var2.e(e4);
                                        throw e4;
                                    }
                                } else {
                                    z = true;
                                    pg2VarD = null;
                                }
                                if (pg2VarD != null) {
                                    pg2Var2 = pg2VarD;
                                    try {
                                        xd2Var3.e(em0Var2, true, false, null);
                                        if (ae2Var.g == null) {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            fm0Var.h().k();
                                        }
                                        pg2Var = pg2Var2;
                                    } catch (IOException e5) {
                                        e = e5;
                                        pg2VarD = pg2Var2;
                                        z2 = z;
                                        if (e instanceof t40) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                    break;
                                } else {
                                    try {
                                        if (cg2Var.isDuplex()) {
                                            try {
                                                fm0Var.d();
                                                cg2Var.writeTo(new sd2(em0Var2.b(yf2Var4, true)));
                                            } catch (IOException e6) {
                                                zl0Var2.requestFailed(xd2Var3, e6);
                                                em0Var2.e(e6);
                                                throw e6;
                                            }
                                        } else {
                                            sd2 sd2Var = new sd2(em0Var2.b(yf2Var4, false));
                                            cg2Var.writeTo(sd2Var);
                                            sd2Var.close();
                                        }
                                        pg2Var2 = pg2VarD;
                                        pg2Var = pg2Var2;
                                    } catch (IOException e7) {
                                        e = e7;
                                        z2 = z;
                                        if (e instanceof t40) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                }
                                if ((e instanceof t40) || !em0Var2.f) {
                                    throw e;
                                }
                                z = z2;
                                iOException = e;
                                if (pg2VarD == null) {
                                    try {
                                        pg2VarD = em0Var2.d(false);
                                        pg2VarD.getClass();
                                        if (z) {
                                            zl0Var2.responseHeadersStart(xd2Var3);
                                            z = false;
                                        }
                                    } catch (IOException e8) {
                                        e = e8;
                                        if (iOException != 0) {
                                            throw e;
                                        }
                                        IOException iOException2 = iOException;
                                        vd0.d(iOException2, e);
                                        throw iOException2;
                                    }
                                }
                                pg2VarD.a = yf2Var4;
                                pg2VarD.e = ae2Var.e;
                                pg2VarD.k = jCurrentTimeMillis;
                                pg2VarD.l = System.currentTimeMillis();
                                qg2VarA = pg2VarD.a();
                                i = qg2VarA.h;
                                if (i != 100 || (102 <= i && i < 200)) {
                                    pg2 pg2VarD2 = em0Var2.d(false);
                                    pg2VarD2.getClass();
                                    if (z) {
                                        zl0Var2.responseHeadersStart(xd2Var3);
                                    }
                                    pg2VarD2.a = yf2Var4;
                                    pg2VarD2.e = ae2Var.e;
                                    pg2VarD2.k = jCurrentTimeMillis;
                                    pg2VarD2.l = System.currentTimeMillis();
                                    qg2VarA = pg2VarD2.a();
                                    i = qg2VarA.h;
                                }
                                zl0Var2.responseHeadersEnd(xd2Var3, qg2VarA);
                                pg2 pg2VarO4 = qg2VarA.O();
                                pg2VarO4.g = em0Var2.c(qg2VarA);
                                qg2VarA2 = pg2VarO4.a();
                                yf2Var = qg2VarA2.e;
                                yf2Var.getClass();
                                if ("close".equalsIgnoreCase(yf2Var.c.a("Connection")) || "close".equalsIgnoreCase(qg2.A(qg2VarA2, "Connection"))) {
                                    fm0Var.h().k();
                                }
                                if (i != 204 || i == 205) {
                                    tg2Var = qg2VarA2.k;
                                    if (tg2Var != null) {
                                        jContentLength = tg2Var.contentLength();
                                    } else {
                                        jContentLength = -1;
                                    }
                                    if (jContentLength > 0) {
                                        StringBuilder sb = new StringBuilder("HTTP ");
                                        sb.append(i);
                                        sb.append(" had non-zero Content-Length: ");
                                        tg2Var2 = qg2VarA2.k;
                                        if (tg2Var2 != null) {
                                            lValueOf = Long.valueOf(tg2Var2.contentLength());
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb.append(lValueOf);
                                        throw new ProtocolException(sb.toString());
                                    }
                                }
                                return qg2VarA2;
                            }
                            xd2Var3.e(em0Var2, true, false, null);
                            z = true;
                            pg2Var = null;
                            pg2VarD.l = System.currentTimeMillis();
                            qg2VarA = pg2VarD.a();
                            i = qg2VarA.h;
                            if (i != 100) {
                                pg2 pg2VarD3 = em0Var2.d(false);
                                pg2VarD3.getClass();
                                if (z) {
                                    zl0Var2.responseHeadersStart(xd2Var3);
                                }
                                pg2VarD3.a = yf2Var4;
                                pg2VarD3.e = ae2Var.e;
                                pg2VarD3.k = jCurrentTimeMillis;
                                pg2VarD3.l = System.currentTimeMillis();
                                qg2VarA = pg2VarD3.a();
                                i = qg2VarA.h;
                            } else {
                                pg2 pg2VarD4 = em0Var2.d(false);
                                pg2VarD4.getClass();
                                if (z) {
                                    zl0Var2.responseHeadersStart(xd2Var3);
                                }
                                pg2VarD4.a = yf2Var4;
                                pg2VarD4.e = ae2Var.e;
                                pg2VarD4.k = jCurrentTimeMillis;
                                pg2VarD4.l = System.currentTimeMillis();
                                qg2VarA = pg2VarD4.a();
                                i = qg2VarA.h;
                            }
                            zl0Var2.responseHeadersEnd(xd2Var3, qg2VarA);
                            pg2 pg2VarO5 = qg2VarA.O();
                            pg2VarO5.g = em0Var2.c(qg2VarA);
                            qg2VarA2 = pg2VarO5.a();
                            yf2Var = qg2VarA2.e;
                            yf2Var.getClass();
                            if ("close".equalsIgnoreCase(yf2Var.c.a("Connection"))) {
                                fm0Var.h().k();
                            } else {
                                fm0Var.h().k();
                            }
                            if (i != 204) {
                                tg2Var = qg2VarA2.k;
                                if (tg2Var != null) {
                                    jContentLength = tg2Var.contentLength();
                                } else {
                                    jContentLength = -1;
                                }
                                if (jContentLength > 0) {
                                    StringBuilder sb2 = new StringBuilder("HTTP ");
                                    sb2.append(i);
                                    sb2.append(" had non-zero Content-Length: ");
                                    tg2Var2 = qg2VarA2.k;
                                    if (tg2Var2 != null) {
                                        lValueOf = Long.valueOf(tg2Var2.contentLength());
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb2.append(lValueOf);
                                    throw new ProtocolException(sb2.toString());
                                }
                            } else {
                                tg2Var = qg2VarA2.k;
                                if (tg2Var != null) {
                                    jContentLength = tg2Var.contentLength();
                                } else {
                                    jContentLength = -1;
                                }
                                if (jContentLength > 0) {
                                    StringBuilder sb3 = new StringBuilder("HTTP ");
                                    sb3.append(i);
                                    sb3.append(" had non-zero Content-Length: ");
                                    tg2Var2 = qg2VarA2.k;
                                    if (tg2Var2 != null) {
                                        lValueOf = Long.valueOf(tg2Var2.contentLength());
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb3.append(lValueOf);
                                    throw new ProtocolException(sb3.toString());
                                }
                            }
                            return qg2VarA2;
                        } catch (IOException e9) {
                            e = e9;
                            if (iOException != 0) {
                                throw e;
                            }
                            IOException iOException3 = iOException;
                            vd0.d(iOException3, e);
                            throw iOException3;
                        }
                        if (cg2Var != null) {
                            try {
                                if (!cg2Var.isDuplex()) {
                                    try {
                                        fm0Var.c();
                                    } catch (IOException e10) {
                                        zl0Var2.requestFailed(xd2Var3, e10);
                                        em0Var2.e(e10);
                                        throw e10;
                                    }
                                }
                                pg2VarD = pg2Var;
                                iOException = null;
                            } catch (IOException e11) {
                                e = e11;
                                pg2VarD = pg2Var;
                                z2 = z;
                                if (e instanceof t40) {
                                    throw e;
                                }
                                throw e;
                            }
                        } else {
                            fm0Var.c();
                            pg2VarD = pg2Var;
                            iOException = null;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        pg2VarD = null;
                    }
                    if (pg2VarD == null) {
                        pg2VarD = em0Var2.d(false);
                        pg2VarD.getClass();
                        if (z) {
                            zl0Var2.responseHeadersStart(xd2Var3);
                            z = false;
                        }
                    }
                    pg2VarD.a = yf2Var4;
                    pg2VarD.e = ae2Var.e;
                    pg2VarD.k = jCurrentTimeMillis;
                } catch (IOException e13) {
                    zl0Var2.requestFailed(xd2Var3, e13);
                    em0Var2.e(e13);
                    throw e13;
                }
                break;
        }
    }
}
