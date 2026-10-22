package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a41 implements y81 {
    public static final a41 a = new a41();
    public static final cc2 b = new cc2("kotlin.time.Instant", bc2.m);

    /* JADX WARN: Code duplicated, block: B:195:0x0475  */
    /* JADX WARN: Code duplicated, block: B:196:0x048b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1 A[PHI: r2
      0x00e1: PHI (r2v46 d31) = (r2v4 d31), (r2v6 d31), (r2v8 d31), (r2v10 d31), (r2v12 d31) binds: [B:39:0x00df, B:42:0x00f1, B:45:0x0101, B:48:0x0113, B:51:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x048b, please report this as an issue */
    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        int i;
        int i2;
        int i3;
        z31 z31VarM;
        int i4;
        char cCharAt;
        char cCharAt2;
        w31 w31Var = w31.g;
        String strX = w90Var.x();
        strX.getClass();
        if (strX.length() == 0) {
            z31VarM = new d31(19, "An empty string is not a valid Instant", strX);
        } else {
            char cCharAt3 = strX.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strX.length() && '0' <= (cCharAt2 = strX.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strX.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                z31VarM = ji2.M(strX, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strX.charAt(i) >= '2') {
                z31VarM = ji2.M(strX, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                z31VarM = ji2.M(strX, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                z31VarM = ji2.M(strX, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strX.length() < i7) {
                    z31VarM = ji2.M(strX, "The input string is too short");
                } else {
                    d31 d31VarL = ji2.L(strX, "'-'", i5, new zs0(8));
                    if (d31VarL != null) {
                        z31VarM = d31VarL;
                    } else {
                        int i8 = 9;
                        d31VarL = ji2.L(strX, "'-'", i5 + 3, new zs0(9));
                        if (d31VarL == null && (d31VarL = ji2.L(strX, "'T' or 't'", i5 + 6, new zs0(10))) == null && (d31VarL = ji2.L(strX, "':'", i5 + 9, new zs0(11))) == null) {
                            char c = '\f';
                            d31VarL = ji2.L(strX, "':'", i5 + 12, new zs0(12));
                            if (d31VarL != null) {
                                z31VarM = d31VarL;
                            } else {
                                int[] iArr = ji2.o;
                                int i9 = 0;
                                while (i9 < 10) {
                                    char c2 = c;
                                    int i10 = i8;
                                    z31VarM = ji2.L(strX, "an ASCII digit", i5 + iArr[i9], new zs0(13));
                                    if (z31VarM == null) {
                                        i9++;
                                        i8 = i10;
                                        c = c2;
                                    }
                                }
                                int i11 = i8;
                                int iN = ji2.N(i5 + 1, strX);
                                int iN2 = ji2.N(i5 + 4, strX);
                                int iN3 = ji2.N(i5 + 7, strX);
                                int iN4 = ji2.N(i5 + 10, strX);
                                int iN5 = ji2.N(i5 + 13, strX);
                                int i12 = i5 + 15;
                                if (strX.charAt(i12) == '.') {
                                    i12 = i7;
                                    int iCharAt2 = 0;
                                    while (i12 < strX.length() && '0' <= (cCharAt = strX.charAt(i12)) && cCharAt < ':') {
                                        iCharAt2 = (iCharAt2 * 10) + (strX.charAt(i12) - '0');
                                        i12++;
                                    }
                                    int i13 = i12 - i7;
                                    if (1 > i13 || i13 >= 10) {
                                        z31VarM = ji2.M(strX, "1..9 digits are supported for the fraction of the second, got " + i13 + " digits");
                                    } else {
                                        i2 = iCharAt2 * ji2.n[9 - i13];
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (i12 >= strX.length()) {
                                    z31VarM = ji2.M(strX, "The UTC offset at the end of the string is missing");
                                } else {
                                    char cCharAt4 = strX.charAt(i12);
                                    if (cCharAt4 == '+' || cCharAt4 == '-') {
                                        int length = strX.length() - i12;
                                        if (length > i11) {
                                            z31VarM = ji2.M(strX, "The UTC offset string \"" + ji2.W(16, strX.subSequence(i12, strX.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            z31VarM = ji2.M(strX, "Invalid UTC offset string \"" + strX.subSequence(i12, strX.length()).toString() + '\"');
                                        } else {
                                            int[] iArr2 = ji2.p;
                                            int i14 = 0;
                                            for (int i15 = 2; i14 < i15; i15 = 2) {
                                                int i16 = i12 + iArr2[i14];
                                                if (i16 >= strX.length()) {
                                                    break;
                                                }
                                                int[] iArr3 = iArr2;
                                                if (strX.charAt(i16) != ':') {
                                                    StringBuilder sbR = p91.r(i16, "Expected ':' at index ", ", got '");
                                                    sbR.append(strX.charAt(i16));
                                                    sbR.append('\'');
                                                    z31VarM = ji2.M(strX, sbR.toString());
                                                } else {
                                                    i14++;
                                                    iArr2 = iArr3;
                                                }
                                            }
                                            int[] iArr4 = ji2.q;
                                            int i17 = 0;
                                            while (i17 < 6 && (i4 = iArr4[i17] + i12) < strX.length()) {
                                                char cCharAt5 = strX.charAt(i4);
                                                int[] iArr5 = iArr4;
                                                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                    StringBuilder sbR2 = p91.r(i4, "Expected an ASCII digit at index ", ", got '");
                                                    sbR2.append(strX.charAt(i4));
                                                    sbR2.append('\'');
                                                    z31VarM = ji2.M(strX, sbR2.toString());
                                                } else {
                                                    i17++;
                                                    iArr4 = iArr5;
                                                }
                                            }
                                            int iN6 = ji2.N(i12 + 1, strX);
                                            int iN7 = length > 3 ? ji2.N(i12 + 4, strX) : 0;
                                            int iN8 = length > 6 ? ji2.N(i12 + 7, strX) : 0;
                                            if (iN7 > 59) {
                                                z31VarM = ji2.M(strX, "Expected offset-minute-of-hour in 0..59, got " + iN7);
                                            } else if (iN8 > 59) {
                                                z31VarM = ji2.M(strX, "Expected offset-second-of-minute in 0..59, got " + iN8);
                                            } else if (iN6 <= 17 || (iN6 == 18 && iN7 == 0 && iN8 == 0)) {
                                                i3 = ((iN7 * 60) + (iN6 * 3600) + iN8) * (cCharAt4 == '-' ? -1 : 1);
                                                if (1 <= iN || iN >= 13) {
                                                    z31VarM = ji2.M(strX, "Expected a month number in 1..12, got " + iN);
                                                } else if (1 > iN2) {
                                                    StringBuilder sbS = p91.s("Expected a valid day-of-month for month ", " of year ", iN, iCharAt, ", got ");
                                                    sbS.append(iN2);
                                                    z31VarM = ji2.M(strX, sbS.toString());
                                                } else {
                                                    int i18 = iCharAt & 3;
                                                    if (iN2 > (iN != 2 ? (iN == 4 || iN == 6 || iN == 9 || iN == 11) ? 30 : 31 : i18 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                        StringBuilder sbS2 = p91.s("Expected a valid day-of-month for month ", " of year ", iN, iCharAt, ", got ");
                                                        sbS2.append(iN2);
                                                        z31VarM = ji2.M(strX, sbS2.toString());
                                                    } else if (iN3 > 23) {
                                                        z31VarM = ji2.M(strX, "Expected hour in 0..23, got " + iN3);
                                                    } else if (iN4 > 59) {
                                                        z31VarM = ji2.M(strX, "Expected minute-of-hour in 0..59, got " + iN4);
                                                    } else if (iN5 > 59) {
                                                        z31VarM = ji2.M(strX, "Expected second-of-minute in 0..59, got " + iN5);
                                                    } else {
                                                        long j = iCharAt;
                                                        long j2 = 365 * j;
                                                        long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iN * 367) - 362) / 12)) + ((long) (iN2 - 1));
                                                        if (iN > 2) {
                                                            j3 = (i18 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                        }
                                                        z31VarM = new y31(i2, (((j3 - 719528) * 86400) + ((long) (((iN4 * 60) + (iN3 * 3600)) + iN5))) - ((long) i3));
                                                    }
                                                }
                                            } else {
                                                z31VarM = ji2.M(strX, "Expected an offset in -18:00..+18:00, got " + strX.subSequence(i12, strX.length()).toString());
                                            }
                                        }
                                    } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                        int i19 = i12 + 1;
                                        if (strX.length() == i19) {
                                            i3 = 0;
                                            if (1 <= iN) {
                                                z31VarM = ji2.M(strX, "Expected a month number in 1..12, got " + iN);
                                            } else {
                                                z31VarM = ji2.M(strX, "Expected a month number in 1..12, got " + iN);
                                            }
                                        } else {
                                            z31VarM = ji2.M(strX, "Extra text after the instant at position " + i19);
                                        }
                                    } else {
                                        z31VarM = ji2.M(strX, "Expected the UTC offset at position " + i12 + ", got '" + cCharAt4 + '\'');
                                    }
                                }
                            }
                        } else {
                            z31VarM = d31VarL;
                        }
                    }
                }
            } else {
                z31VarM = ji2.M(strX, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return z31VarM.toInstant();
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        w31 w31Var = (w31) obj;
        w31Var.getClass();
        ak0Var.A(w31Var.toString());
    }
}
