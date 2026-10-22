package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r23 implements zk2 {
    public final s23 e;

    public r23(s23 s23Var) {
        s23Var.getClass();
        this.e = s23Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.zk2
    public final bl2 a0(String str) {
        w23 w23Var;
        int i;
        str.getClass();
        s23 s23Var = this.e;
        u92 u92Var = null;
        if (!s23Var.isOpen()) {
            mh0.d0(21, "connection is closed");
            throw null;
        }
        String upperCase = l13.D0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iH0 = 0;
            loop0: while (iH0 < length) {
                char cCharAt = upperCase.charAt(iH0);
                if (o51.m(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iH1 = iH0 + 1;
                            if (upperCase.charAt(iH1) == '*') {
                                do {
                                    iH1 = l13.h0(upperCase, '*', iH1 + 1, 4);
                                    if (iH1 < 0) {
                                        break loop0;
                                    }
                                    i = iH1 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iH0 = iH1 + 2;
                            }
                        }
                        i2 = iH0;
                        break;
                    }
                    if (upperCase.charAt(iH0 + 1) != '-') {
                        i2 = iH0;
                        break;
                    }
                    iH0 = l13.h0(upperCase, '\n', iH0 + 2, 4);
                    if (iH0 < 0) {
                        break;
                    }
                }
                iH0++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new x23(s23Var, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    w23Var = null;
                } else if (!l13.c0(upperCase, "EXCLUSIVE", false)) {
                    w23Var = !l13.c0(upperCase, "IMMEDIATE", false) ? w23.i : w23.h;
                } else {
                    w23Var = w23.g;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    w23Var = null;
                } else {
                    w23Var = w23.e;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    w23Var = null;
                } else {
                    w23Var = w23.e;
                }
                break;
            case 81327:
                w23Var = (!strSubstring.equals("ROL") || l13.c0(upperCase, " TO ", false)) ? null : w23.f;
                break;
            default:
                w23Var = null;
                break;
        }
        if (w23Var != null) {
            return new x23(s23Var, str, w23Var);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (l13.c0(l13.w0(lowerCase, "journal_mode", ""), "=", false)) {
                u92Var = u92.r;
            }
        }
        if (u92Var != null) {
            return new x23(s23Var, str, new y23(s23Var, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new x23(s23Var, str) : new y23(s23Var, str);
    }

    @Override // defpackage.zk2
    public final boolean c() {
        return this.e.c();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }
}
