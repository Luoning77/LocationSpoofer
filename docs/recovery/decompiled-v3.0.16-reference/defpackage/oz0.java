package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oz0 implements Closeable {
    public static final Logger h;
    public final du e;
    public final nz0 f;
    public final sy0 g;

    static {
        Logger logger = Logger.getLogger(cz0.class.getName());
        logger.getClass();
        h = logger;
    }

    public oz0(td2 td2Var) {
        td2Var.getClass();
        this.e = td2Var;
        nz0 nz0Var = new nz0(td2Var);
        this.f = nz0Var;
        this.g = new sy0(nz0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A(boolean z, bn bnVar) throws IOException {
        int i;
        boolean z2;
        int i2;
        Object[] array;
        boolean z3 = false;
        try {
            this.e.S(9L);
            int iR = bh3.r(this.e);
            if (iR > 16384) {
                fo.r(p91.l(iR, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i3 = this.e.readByte() & 255;
            byte b = this.e.readByte();
            int i4 = b & 255;
            int i5 = this.e.readInt();
            int i6 = i5 & Integer.MAX_VALUE;
            Logger logger = h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(cz0.a(true, i6, iR, i3, i4));
            }
            if (z && i3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = cz0.b;
                sb.append(i3 < strArr.length ? strArr[i3] : bh3.g("0x%02x", Integer.valueOf(i3)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (i3) {
                case 0:
                    F(bnVar, iR, i4, i6);
                    return true;
                case 1:
                    P(bnVar, iR, i4, i6);
                    return true;
                case 2:
                    if (iR != 5) {
                        fo.r(p91.m(iR, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i6 == 0) {
                        fo.r("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    du duVar = this.e;
                    duVar.readInt();
                    duVar.readByte();
                    return true;
                case 3:
                    if (iR != 4) {
                        fo.r(p91.m(iR, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i6 == 0) {
                        fo.r("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i8 = this.e.readInt();
                    int[] iArrB = az2.B(14);
                    int length = iArrB.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            int i10 = iArrB[i9];
                            if (az2.z(i10) == i8) {
                                i = i10;
                            } else {
                                i9++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        fo.r(p91.l(i8, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    lz0 lz0Var = (lz0) bnVar.f;
                    if (i6 != 0 && (i5 & 1) == 0) {
                        lz0Var.m.c(new gz0(lz0Var.g + '[' + i6 + "] onReset", lz0Var, i6, i, 1), 0L);
                        return true;
                    }
                    sz0 sz0VarO = lz0Var.O(i6);
                    if (sz0VarO == null) {
                        return true;
                    }
                    synchronized (sz0VarO) {
                        try {
                            if (i == 0) {
                                throw null;
                            }
                            if (sz0VarO.m == 0) {
                                sz0VarO.m = i;
                                sz0VarO.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 4:
                    du duVar2 = this.e;
                    if (i6 != 0) {
                        fo.r("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) == 0) {
                        if (iR % 6 != 0) {
                            fo.r(p91.l(iR, "TYPE_SETTINGS length % 6 != 0: "));
                            return false;
                        }
                        qt2 qt2Var = new qt2();
                        i41 i41VarC0 = mh0.c0(mh0.f0(0, iR), 6);
                        int i11 = i41VarC0.e;
                        int i12 = i41VarC0.f;
                        int i13 = i41VarC0.g;
                        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                            while (true) {
                                short s = duVar2.readShort();
                                byte[] bArr = bh3.a;
                                int i14 = s & 65535;
                                int i15 = duVar2.readInt();
                                if (i14 == 2) {
                                    z2 = z3;
                                    if (i15 != 0 && i15 != 1) {
                                        fo.r("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i14 == 3) {
                                    z2 = z3;
                                    i14 = 4;
                                } else if (i14 == 4) {
                                    z2 = z3;
                                    if (i15 < 0) {
                                        fo.r("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z2;
                                    }
                                    i14 = 7;
                                } else if (i14 != 5) {
                                    z2 = z3;
                                } else {
                                    z2 = z3;
                                    if (i15 < 16384 || i15 > 16777215) {
                                        fo.r(p91.l(i15, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return z2;
                                    }
                                }
                                qt2Var.b(i14, i15);
                                if (i11 != i12) {
                                    i11 += i13;
                                    z3 = z2;
                                }
                            }
                        }
                        lz0 lz0Var2 = (lz0) bnVar.f;
                        lz0Var2.l.c(new fz0(az2.p(new StringBuilder(), lz0Var2.g, " applyAndAckSettings"), bnVar, qt2Var, i7), 0L);
                        return true;
                    }
                    if (iR != 0) {
                        fo.r("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case org.maplibre.android.log.Logger.WARN /* 5 */:
                    U(bnVar, iR, i4, i6);
                    return true;
                case org.maplibre.android.log.Logger.ERROR /* 6 */:
                    if (iR != 8) {
                        fo.r(p91.l(iR, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        fo.r("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i16 = this.e.readInt();
                    int i17 = this.e.readInt();
                    Object[] objArr = (b & 1) != 0 ? 1 : 0;
                    lz0 lz0Var3 = (lz0) bnVar.f;
                    if (objArr == 0) {
                        lz0Var3.l.c(new gz0(az2.p(new StringBuilder(), ((lz0) bnVar.f).g, " ping"), (lz0) bnVar.f, i16, i17, 0), 0L);
                        return true;
                    }
                    synchronized (lz0Var3) {
                        try {
                            if (i16 == 1) {
                                lz0Var3.p++;
                            } else if (i16 == 2) {
                                lz0Var3.r++;
                            } else if (i16 == 3) {
                                lz0Var3.notifyAll();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    if (iR < 8) {
                        fo.r(p91.l(iR, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        fo.r("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i18 = this.e.readInt();
                    int i19 = this.e.readInt();
                    int i20 = iR - 8;
                    int[] iArrB2 = az2.B(14);
                    int length2 = iArrB2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 < length2) {
                            i2 = iArrB2[i21];
                            if (az2.z(i2) != i19) {
                                i21++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        fo.r(p91.l(i19, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    uu uuVarO = uu.h;
                    if (i20 > 0) {
                        uuVarO = this.e.o(i20);
                    }
                    uuVarO.getClass();
                    uuVarO.a();
                    lz0 lz0Var4 = (lz0) bnVar.f;
                    synchronized (lz0Var4) {
                        array = lz0Var4.f.values().toArray(new sz0[0]);
                        lz0Var4.j = true;
                    }
                    for (sz0 sz0Var : (sz0[]) array) {
                        if (sz0Var.a > i18 && sz0Var.g()) {
                            synchronized (sz0Var) {
                                if (sz0Var.m == 0) {
                                    sz0Var.m = 8;
                                    sz0Var.notifyAll();
                                }
                                break;
                            }
                            ((lz0) bnVar.f).O(sz0Var.a);
                        }
                    }
                    break;
                    break;
                case 8:
                    if (iR != 4) {
                        fo.r(p91.l(iR, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long j = 2147483647L & ((long) this.e.readInt());
                    if (j == 0) {
                        fo.r("windowSizeIncrement was 0");
                        return false;
                    }
                    lz0 lz0Var5 = (lz0) bnVar.f;
                    if (i6 == 0) {
                        synchronized (lz0Var5) {
                            lz0Var5.y += j;
                            lz0Var5.notifyAll();
                        }
                        return true;
                    }
                    sz0 sz0VarF = lz0Var5.F(i6);
                    if (sz0VarF != null) {
                        synchronized (sz0VarF) {
                            sz0VarF.f += j;
                            if (j > 0) {
                                sz0VarF.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                default:
                    this.e.skip(iR);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void F(bn bnVar, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            fo.r("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            fo.r("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = bh3.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iC = ig0.C(i, i2, i4);
        du duVar = this.e;
        lz0 lz0Var = (lz0) bnVar.f;
        if (i3 != 0 && (i3 & 1) == 0) {
            xt xtVar = new xt();
            long j = iC;
            duVar.S(j);
            duVar.C(xtVar, j);
            lz0Var.m.c(new hz0(lz0Var.g + '[' + i3 + "] onData", lz0Var, i3, xtVar, iC, z3), 0L);
        } else {
            sz0 sz0VarF = lz0Var.F(i3);
            if (sz0VarF == null) {
                ((lz0) bnVar.f).d0(i3, 2);
                long j2 = iC;
                ((lz0) bnVar.f).U(j2);
                duVar.skip(j2);
            } else {
                byte[] bArr2 = bh3.a;
                qz0 qz0Var = sz0VarF.i;
                long j3 = iC;
                qz0Var.getClass();
                long j4 = j3;
                while (true) {
                    sz0 sz0Var = qz0Var.j;
                    if (j4 <= 0) {
                        byte[] bArr3 = bh3.a;
                        sz0Var.b.U(j3);
                        break;
                    }
                    synchronized (sz0Var) {
                        z = qz0Var.f;
                        z2 = qz0Var.h.f + j4 > qz0Var.e;
                    }
                    if (z2) {
                        duVar.skip(j4);
                        qz0Var.j.e(4);
                        break;
                    }
                    if (z) {
                        duVar.skip(j4);
                        break;
                    }
                    long jC = duVar.C(qz0Var.g, j4);
                    if (jC == -1) {
                        throw new EOFException();
                    }
                    j4 -= jC;
                    sz0 sz0Var2 = qz0Var.j;
                    synchronized (sz0Var2) {
                        try {
                            if (qz0Var.i) {
                                xt xtVar2 = qz0Var.g;
                                xtVar2.skip(xtVar2.f);
                            } else {
                                xt xtVar3 = qz0Var.h;
                                boolean z4 = xtVar3.f == 0;
                                xtVar3.B(qz0Var.g);
                                if (z4) {
                                    sz0Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    sz0VarF.i(bh3.b, true);
                }
            }
        }
        this.e.skip(i4);
    }

    public final List O(int i, int i2, int i3, int i4) throws IOException {
        nz0 nz0Var = this.f;
        nz0Var.i = i;
        nz0Var.f = i;
        nz0Var.j = i2;
        nz0Var.g = i3;
        nz0Var.h = i4;
        sy0 sy0Var = this.g;
        td2 td2Var = sy0Var.c;
        ArrayList arrayList = sy0Var.b;
        while (!td2Var.A()) {
            byte b = td2Var.readByte();
            byte[] bArr = bh3.a;
            int i5 = b & 255;
            if (i5 == 128) {
                fo.r("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = sy0Var.e(i5, WorkQueueKt.MASK);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    mx0[] mx0VarArr = uy0.a;
                    if (i6 <= mx0VarArr.length - 1) {
                        arrayList.add(mx0VarArr[i6]);
                    }
                }
                int length = sy0Var.e + 1 + (i6 - uy0.a.length);
                if (length >= 0) {
                    mx0[] mx0VarArr2 = sy0Var.d;
                    if (length < mx0VarArr2.length) {
                        mx0 mx0Var = mx0VarArr2[length];
                        mx0Var.getClass();
                        arrayList.add(mx0Var);
                    }
                }
                fo.r(p91.l(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                mx0[] mx0VarArr3 = uy0.a;
                uu uuVarD = sy0Var.d();
                uy0.a(uuVarD);
                sy0Var.c(new mx0(uuVarD, sy0Var.d()));
            } else if ((b & 64) == 64) {
                sy0Var.c(new mx0(sy0Var.b(sy0Var.e(i5, 63) - 1), sy0Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = sy0Var.e(i5, 31);
                sy0Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + sy0Var.a);
                }
                int i7 = sy0Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        mx0[] mx0VarArr4 = sy0Var.d;
                        yo.s0(0, mx0VarArr4.length, null, mx0VarArr4);
                        sy0Var.e = sy0Var.d.length - 1;
                        sy0Var.f = 0;
                        sy0Var.g = 0;
                    } else {
                        sy0Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                mx0[] mx0VarArr5 = uy0.a;
                uu uuVarD2 = sy0Var.d();
                uy0.a(uuVarD2);
                arrayList.add(new mx0(uuVarD2, sy0Var.d()));
            } else {
                arrayList.add(new mx0(sy0Var.b(sy0Var.e(i5, 15) - 1), sy0Var.d()));
            }
        }
        List listJ0 = zy.J0(arrayList);
        arrayList.clear();
        return listJ0;
    }

    public final void P(bn bnVar, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            fo.r("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i5 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = bh3.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            du duVar = this.e;
            duVar.readInt();
            duVar.readByte();
            byte[] bArr2 = bh3.a;
            i -= 5;
        }
        List listO = O(ig0.C(i, i2, i4), i4, i2, i3);
        lz0 lz0Var = (lz0) bnVar.f;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            lz0Var.m.c(new iz0(lz0Var.g + '[' + i3 + "] onHeaders", lz0Var, i3, listO, z2), 0L);
            return;
        }
        synchronized (lz0Var) {
            sz0 sz0VarF = lz0Var.F(i3);
            if (sz0VarF != null) {
                sz0VarF.i(bh3.t(listO), z2);
                return;
            }
            if (lz0Var.j) {
                return;
            }
            if (i3 <= lz0Var.h) {
                return;
            }
            if (i3 % 2 == lz0Var.i % 2) {
                return;
            }
            sz0 sz0Var = new sz0(i3, lz0Var, false, z2, bh3.t(listO));
            lz0Var.h = i3;
            lz0Var.f.put(Integer.valueOf(i3), sz0Var);
            lz0Var.k.d().c(new fz0(lz0Var.g + '[' + i3 + "] onStream", lz0Var, sz0Var, i5), 0L);
        }
    }

    public final void U(bn bnVar, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            fo.r("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = bh3.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.e.readInt() & Integer.MAX_VALUE;
        List listO = O(ig0.C(i - 4, i2, i4), i4, i2, i3);
        lz0 lz0Var = (lz0) bnVar.f;
        synchronized (lz0Var) {
            if (lz0Var.C.contains(Integer.valueOf(i5))) {
                lz0Var.d0(i5, 2);
                return;
            }
            lz0Var.C.add(Integer.valueOf(i5));
            lz0Var.m.c(new iz0(lz0Var.g + '[' + i5 + "] onRequest", lz0Var, i5, listO), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }
}
