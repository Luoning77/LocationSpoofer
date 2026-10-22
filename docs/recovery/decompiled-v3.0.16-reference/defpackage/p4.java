package defpackage;

import android.os.Build;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class p4 implements au0 {
    public final /* synthetic */ int e;

    public /* synthetic */ p4(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    @Override // defpackage.au0
    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int i5 = this.e;
        mf3 mf3Var = mf3.a;
        switch (i5) {
            case 0:
                return ke0.H(Boolean.FALSE);
            case 1:
                return ke0.H("");
            case 2:
                b52 b52Var = i9.a;
                return ba0.a;
            case 3:
                return new p4(5);
            case 4:
                return mf3Var;
            case Logger.WARN /* 5 */:
                return Float.valueOf(1.0f);
            case Logger.ERROR /* 6 */:
                hh0 hh0Var = zj.a;
                return za0.a;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                hh0 hh0Var2 = zj.a;
                return j9.D;
            case 8:
                return new qy2(xp1.c(1308617531));
            case mc0.b /* 9 */:
                kq kqVar = mq.c;
                String strA0 = yo.A0(jq.a, null, 62);
                int length = strA0.length();
                kqVar.getClass();
                o51.h(0, length, strA0.length());
                byte[] bytes = strA0.substring(0, length).getBytes(sw.b);
                bytes.getClass();
                int length2 = bytes.length;
                boolean z = kqVar.b;
                o51.h(0, length2, bytes.length);
                int i6 = 1;
                int i7 = -2;
                if (length2 != 0) {
                    if (length2 != 1) {
                        if (z) {
                            i = length2;
                            for (int i8 = 0; i8 < length2; i8++) {
                                int i9 = nq.a[bytes[i8] & 255];
                                if (i9 < 0) {
                                    if (i9 == -2) {
                                        i -= length2 - i8;
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        } else if (bytes[length2 - 1] == 61) {
                            i = length2 - 1;
                            if (bytes[length2 - 2] == 61) {
                                i = length2 - 2;
                            }
                        } else {
                            i = length2;
                        }
                        i2 = (int) ((((long) i) * 6) / 8);
                    } else {
                        fo.i(p91.l(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                    }
                    return null;
                }
                i2 = 0;
                byte[] bArr = new byte[i2];
                int[] iArr = kqVar.a ? nq.b : nq.a;
                int i10 = -8;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = -8;
                while (true) {
                    i6 = i6;
                    if (i11 < length2) {
                        if (i14 == i10) {
                            i4 = 8;
                            int i15 = i11 + 3;
                            if (i15 < length2) {
                                int i16 = i11 + 4;
                                int i17 = (iArr[bytes[i11] & 255] << 18) | (iArr[bytes[i11 + 1] & 255] << 12) | (iArr[bytes[i11 + 2] & 255] << 6) | iArr[bytes[i15] & 255];
                                if (i17 >= 0) {
                                    bArr[i13] = (byte) (i17 >> 16);
                                    int i18 = i13 + 2;
                                    bArr[i13 + 1] = (byte) (i17 >> 8);
                                    i13 += 3;
                                    bArr[i18] = (byte) i17;
                                    i11 = i16;
                                }
                                i7 = -2;
                                i10 = -8;
                            }
                            return null;
                        }
                        i4 = 8;
                        int i19 = bytes[i11] & 255;
                        int i20 = iArr[i19];
                        if (i20 >= 0) {
                            c = '=';
                            i11++;
                            i12 = (i12 << 6) | i20;
                            int i21 = i14 + 6;
                            if (i21 >= 0) {
                                bArr[i13] = (byte) (i12 >>> i21);
                                i12 &= (i6 << i21) - 1;
                                i14 -= 2;
                                i13++;
                            } else {
                                i14 = i21;
                            }
                        } else {
                            if (i20 == -2) {
                                if (i14 == -8) {
                                    fo.i(p91.l(i11, "Redundant pad character at index "));
                                } else if (i14 == -6) {
                                    i11++;
                                    i3 = i6;
                                    i7 = -2;
                                } else if (i14 == -4) {
                                    int i22 = i11 + 1;
                                    if (z) {
                                        while (i22 < length2) {
                                            if (nq.a[bytes[i22] & 255] == -1) {
                                                i22++;
                                            }
                                        }
                                    }
                                    if (i22 == length2 || bytes[i22] != 61) {
                                        fo.i(p91.l(i22, "Missing one pad character at index "));
                                    } else {
                                        i11 = i22 + 1;
                                        i3 = i6;
                                        i7 = -2;
                                    }
                                } else if (i14 == -2) {
                                    i11++;
                                    i3 = i6;
                                    i7 = -2;
                                } else {
                                    fo.n("Unreachable");
                                }
                                return null;
                            }
                            c = '=';
                            if (!z) {
                                char c2 = (char) i19;
                                xp1.m(i4);
                                String string = Integer.toString(i19, i4);
                                string.getClass();
                                throw new IllegalArgumentException("Invalid symbol '" + c2 + "'(" + string + ") at index " + i11);
                            }
                            i11++;
                        }
                        i7 = -2;
                        i10 = -8;
                    } else {
                        i3 = 0;
                    }
                }
                if (i14 == i7) {
                    fo.i("The last unit of input does not have enough bits");
                } else if (i14 != -8 && i3 == 0) {
                    fo.i("The padding option is set to PRESENT, but the input is not properly padded");
                } else if (i12 == 0) {
                    if (z) {
                        while (i11 < length2) {
                            if (nq.a[bytes[i11] & 255] == -1) {
                                i11++;
                            }
                        }
                    }
                    if (i11 < length2) {
                        int i23 = bytes[i11] & 255;
                        char c3 = (char) i23;
                        xp1.m(8);
                        String string2 = Integer.toString(i23, 8);
                        string2.getClass();
                        StringBuilder sb = new StringBuilder("Symbol '");
                        sb.append(c3);
                        sb.append("'(");
                        sb.append(string2);
                        sb.append(") at index ");
                        sb.append(i11 - 1);
                        sb.append(" is prohibited after the pad character");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (i13 == i2) {
                        return bArr;
                    }
                    fo.n("Check failed.");
                } else {
                    fo.i("The pad bits must be zeros");
                }
                return null;
            case mc0.c /* 10 */:
                return null;
            case 11:
                return Build.VERSION.RELEASE;
            case mc0.d /* 12 */:
                return Build.MANUFACTURER;
            case 13:
                return Build.BRAND;
            case 14:
                return Build.MODEL;
            case a83.e /* 15 */:
                return CloudRepository.mapPreviewScope_delegate$lambda$10();
            case 16:
                return CloudRepository.diagnosticScope_delegate$lambda$11();
            case 17:
                return CloudRepository.companionScope_delegate$lambda$13();
            case 18:
                long j = iz.z;
                return new kz(j, iz.j, iz.A, iz.k, iz.e, iz.E, iz.n, iz.F, iz.o, iz.R, iz.t, iz.S, iz.u, iz.a, iz.g, iz.I, iz.r, iz.Q, iz.s, j, iz.f, iz.d, iz.b, iz.h, iz.c, iz.i, iz.x, iz.y, iz.D, iz.J, iz.P, iz.K, iz.L, iz.M, iz.N, iz.O, iz.B, iz.C, iz.l, iz.m, iz.G, iz.H, iz.p, iz.q, iz.T, iz.U, iz.v, iz.w);
            case 19:
                return vz.a();
            case 20:
                return CompleteCollectionRoute._childSerializers$_anonymous_();
            case 21:
                return CompleteLocation._childSerializers$_anonymous_();
            case 22:
                return CompleteLocation._childSerializers$_anonymous_$0();
            case 23:
                return CompleteLocation._childSerializers$_anonymous_$1();
            case 24:
                return null;
            case 25:
                j30.b("Unexpected call to default provider");
                throw new iv();
            case 26:
                return mf3Var;
            case 27:
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            case 28:
                return Float.valueOf(1.0f);
            default:
                return mf3Var;
        }
    }
}
