package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e13 extends sb implements w90, l30 {
    public final t61 n0;
    public final um3 o0;
    public final fk p0;
    public int q0;
    public final a71 r0;
    public final f71 s0;

    public e13(t61 t61Var, um3 um3Var, fk fkVar, bt2 bt2Var) {
        bt2Var.getClass();
        this.n0 = t61Var;
        this.o0 = um3Var;
        this.p0 = fkVar;
        this.q0 = -1;
        a71 a71Var = t61Var.a;
        this.r0 = a71Var;
        this.s0 = a71Var.e ? null : new f71(bt2Var);
    }

    @Override // defpackage.sb, defpackage.w90
    public final double A() {
        fk fkVar = this.p0;
        String strK = fkVar.k();
        try {
            double d = Double.parseDouble(strK);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            fk.n(fkVar, ce0.K(null, Double.valueOf(d)), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            fk.n(fkVar, p91.p("Failed to parse type 'double' for input '", strK, '\''), 0, 6);
            throw null;
        }
    }

    @Override // defpackage.sb, defpackage.l30
    public final void a(bt2 bt2Var) {
        bt2Var.getClass();
        if (bt2Var.d() == 0 && ym3.D(this.n0, bt2Var)) {
            while (j(bt2Var) != -1) {
            }
        }
        fk fkVar = this.p0;
        if (fkVar.A()) {
            ce0.F(fkVar, "");
            throw null;
        }
        fkVar.h(this.o0.f);
        je jeVar = (je) fkVar.d;
        int i = jeVar.b;
        int[] iArr = (int[]) jeVar.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            jeVar.b = i;
        }
        if (i != -1) {
            jeVar.b = i - 1;
        }
    }

    @Override // defpackage.sb, defpackage.w90
    public final l30 b(bt2 bt2Var) {
        bt2Var.getClass();
        t61 t61Var = this.n0;
        um3 um3VarP = v83.p(t61Var, bt2Var);
        fk fkVar = this.p0;
        je jeVar = (je) fkVar.d;
        int i = jeVar.b + 1;
        jeVar.b = i;
        if (i == ((Object[]) jeVar.d).length) {
            jeVar.d();
        }
        ((Object[]) jeVar.d)[i] = bt2Var;
        fkVar.h(um3VarP.e);
        if (fkVar.u() == 4) {
            fk.n(fkVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = um3VarP.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new e13(t61Var, um3VarP, fkVar, bt2Var);
        }
        return (this.o0 == um3VarP && t61Var.a.e) ? this : new e13(t61Var, um3VarP, fkVar, bt2Var);
    }

    @Override // defpackage.w90
    public final Object c(y81 y81Var) {
        y81Var.getClass();
        try {
            if (!(y81Var instanceof p0)) {
                return y81Var.deserialize(this);
            }
            p91.x(y81Var);
            throw null;
        } catch (du1 e) {
            String message = e.getMessage();
            message.getClass();
            if (l13.c0(message, "at path", false)) {
                throw e;
            }
            throw new du1(e.getMessage() + " at path: " + ((je) this.p0.d).a(), e, e.e, e.f);
        }
    }

    @Override // defpackage.sb, defpackage.w90
    public final long d() {
        return this.p0.i();
    }

    @Override // defpackage.sb, defpackage.w90
    public final boolean f() {
        boolean z;
        boolean z2;
        fk fkVar = this.p0;
        int iZ = fkVar.z();
        String str = (String) fkVar.g;
        if (iZ == str.length()) {
            fk.n(fkVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iZ) == '\"') {
            iZ++;
            z = true;
        } else {
            z = false;
        }
        int iV = fkVar.v(iZ);
        if (iV >= str.length() || iV == -1) {
            fk.n(fkVar, "EOF", 0, 6);
            throw null;
        }
        int i = iV + 1;
        int iCharAt = str.charAt(iV) | ' ';
        if (iCharAt == 102) {
            fkVar.d(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                fk.n(fkVar, "Expected valid boolean literal prefix, but had '" + fkVar.k() + '\'', 0, 6);
                throw null;
            }
            fkVar.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (fkVar.b == str.length()) {
            fk.n(fkVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(fkVar.b) == '\"') {
            fkVar.b++;
            return z2;
        }
        fk.n(fkVar, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // defpackage.sb, defpackage.w90
    public final boolean g() {
        f71 f71Var = this.s0;
        return ((f71Var != null ? f71Var.b : false) || this.p0.B(true)) ? false : true;
    }

    @Override // defpackage.sb, defpackage.w90
    public final char h() {
        fk fkVar = this.p0;
        String strK = fkVar.k();
        if (strK.length() == 1) {
            return strK.charAt(0);
        }
        fk.n(fkVar, p91.p("Expected single char, but got '", strK, '\''), 0, 6);
        throw null;
    }

    public final JsonElement i0() {
        return new f(this.n0.a, this.p0).d();
    }

    /* JADX WARN: Code duplicated, block: B:174:0x02a5 A[EDGE_INSN: B:174:0x02a5->B:175:0x02a6 BREAK  A[LOOP:2: B:157:0x0243->B:209:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l30
    public final int j(bt2 bt2Var) throws Throwable {
        boolean z;
        boolean z2;
        char c;
        String strJ;
        String str;
        fk fkVar = this.p0;
        je jeVar = (je) fkVar.d;
        bt2Var.getClass();
        um3 um3Var = this.o0;
        int iOrdinal = um3Var.ordinal();
        Throwable th = null;
        char c2 = ':';
        int i = 0;
        zA = false;
        boolean zA = false;
        boolean z3 = true;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zA2 = fkVar.A();
            while (true) {
                boolean zC = fkVar.c();
                th = th;
                f71 f71Var = this.s0;
                if (zC) {
                    a71 a71Var = this.r0;
                    boolean z4 = a71Var.c;
                    String strL = z4 ? fkVar.l() : fkVar.e();
                    fkVar.h(c2);
                    t61 t61Var = this.n0;
                    int iC = ym3.C(bt2Var, t61Var, strL);
                    int i3 = i2;
                    if (iC != -3) {
                        if (a71Var.g) {
                            boolean zJ = bt2Var.j(iC);
                            bt2 bt2VarI = bt2Var.i(iC);
                            if (!zJ || bt2VarI.g() || !fkVar.B(z3)) {
                                if (o51.f(bt2VarI.c(), ft2.e) && (!bt2VarI.g() || !fkVar.B(false))) {
                                    byte bU = fkVar.u();
                                    if (z4) {
                                        if (bU == 1 || bU == 0) {
                                            strJ = fkVar.k();
                                            fkVar.e = strJ;
                                            str = strJ;
                                        } else {
                                            str = th;
                                        }
                                    } else if (bU != 1) {
                                        str = th;
                                    } else {
                                        strJ = fkVar.j();
                                        fkVar.e = strJ;
                                        str = strJ;
                                    }
                                    if (str != 0) {
                                        int iC2 = ym3.C(bt2VarI, t61Var, str);
                                        boolean z5 = !t61Var.a.e && bt2VarI.g();
                                        if (iC2 == -3 && (zJ || z5)) {
                                            fkVar.j();
                                        }
                                    }
                                }
                            }
                            zA2 = fkVar.A();
                            z = false;
                        }
                        if (f71Var != null) {
                            pi0 pi0Var = f71Var.a;
                            if (iC < 64) {
                                pi0Var.c |= 1 << iC;
                            } else {
                                int i4 = (iC >>> 6) - 1;
                                long[] jArr = pi0Var.d;
                                jArr[i4] = jArr[i4] | (1 << (iC & 63));
                            }
                        }
                        i2 = iC;
                    } else {
                        zA2 = false;
                        z = true;
                    }
                    if (!z) {
                        i2 = i3;
                        c2 = ':';
                        z3 = true;
                    } else {
                        if (!ym3.D(t61Var, bt2Var)) {
                            int i5 = jeVar.b;
                            int[] iArr = (int[]) jeVar.e;
                            if (iArr[i5] == -2) {
                                iArr[i5] = i3;
                                i5--;
                                jeVar.b = i5;
                            }
                            if (i5 != i3) {
                                jeVar.b = i5 + i3;
                            }
                            fkVar.m(l13.l0(6, ((String) fkVar.g).subSequence(0, fkVar.b).toString(), strL), p91.p("Encountered an unknown key '", strL, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw th;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bU2 = fkVar.u();
                        if (bU2 == 8 || bU2 == 6) {
                            while (true) {
                                byte bU3 = fkVar.u();
                                z2 = true;
                                if (bU3 != 1) {
                                    c = 6;
                                    if (bU3 == 8 || bU3 == 6) {
                                        arrayList.add(Byte.valueOf(bU3));
                                    } else if (bU3 == 9) {
                                        if (((Number) zy.t0(arrayList)).byteValue() != 8) {
                                            fk.n(fkVar, "found ] instead of }", 0, 6);
                                            throw th;
                                        }
                                        fz.d0(arrayList);
                                    } else if (bU3 == 7) {
                                        if (((Number) zy.t0(arrayList)).byteValue() != 6) {
                                            fk.n(fkVar, "found } instead of ]", 0, 6);
                                            throw th;
                                        }
                                        fz.d0(arrayList);
                                    } else if (bU3 == 10) {
                                        fk.n(fkVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th;
                                    }
                                    fkVar.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z4) {
                                    fkVar.k();
                                } else {
                                    fkVar.e();
                                }
                            }
                        } else {
                            fkVar.k();
                            c = 6;
                            z2 = true;
                        }
                        zA2 = fkVar.A();
                        boolean z6 = z2;
                        i2 = i3;
                        z3 = z6;
                        c2 = ':';
                    }
                } else if (!zA2) {
                    if (f71Var == null) {
                        i2 = -1;
                        break;
                    }
                    pi0 pi0Var2 = f71Var.a;
                    t5 t5Var = pi0Var2.b;
                    bt2 bt2Var2 = pi0Var2.a;
                    int iD = bt2Var2.d();
                    while (true) {
                        long j = pi0Var2.c;
                        if (j == -1) {
                            if (iD <= 64) {
                                i2 = -1;
                                break;
                            }
                            long[] jArr2 = pi0Var2.d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i >= length) {
                                    i2 = -1;
                                    break;
                                }
                                int i6 = i + 1;
                                int i7 = i6 * 64;
                                long j2 = jArr2[i];
                                while (true) {
                                    if (j2 != -1) {
                                        int i8 = i7;
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << iNumberOfTrailingZeros;
                                        int i9 = i8 + iNumberOfTrailingZeros;
                                        if (((Boolean) t5Var.invoke(bt2Var2, Integer.valueOf(i9))).booleanValue()) {
                                            jArr2[i] = j2;
                                            i2 = i9;
                                            break;
                                        }
                                        i7 = i8;
                                    } else {
                                        jArr2[i] = j2;
                                        i = i6;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            pi0Var2.c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) t5Var.invoke(bt2Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i2 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    ce0.F(fkVar, "object");
                    throw th;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zA3 = fkVar.A();
            if (fkVar.c()) {
                int i10 = this.q0;
                if (i10 != -1 && !zA3) {
                    fk.n(fkVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i2 = i10 + 1;
                this.q0 = i2;
            } else if (zA3) {
                ce0.F(fkVar, "array");
                throw null;
            }
        } else {
            int i11 = this.q0;
            boolean z7 = i11 % 2 != 0;
            if (!z7) {
                fkVar.h(':');
            } else if (i11 != -1) {
                zA = fkVar.A();
            }
            if (fkVar.c()) {
                if (z7) {
                    int i12 = this.q0;
                    int i13 = fkVar.b;
                    if (i12 == -1) {
                        if (zA) {
                            fk.n(fkVar, "Unexpected leading comma", i13, 4);
                            throw null;
                        }
                    } else if (!zA) {
                        fk.n(fkVar, "Expected comma after the key-value pair", i13, 4);
                        throw null;
                    }
                }
                i2 = this.q0 + 1;
                this.q0 = i2;
            } else if (zA) {
                ce0.F(fkVar, "object");
                throw null;
            }
        }
        if (um3Var != um3.MAP) {
            ((int[]) jeVar.e)[jeVar.b] = i2;
        }
        return i2;
    }

    public final t61 j0() {
        return this.n0;
    }

    @Override // defpackage.sb, defpackage.w90
    public final int o() {
        fk fkVar = this.p0;
        long jI = fkVar.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        fk.n(fkVar, "Failed to parse int for input '" + jI + '\'', 0, 6);
        throw null;
    }

    @Override // defpackage.sb, defpackage.w90
    public final byte r() {
        fk fkVar = this.p0;
        long jI = fkVar.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        fk.n(fkVar, "Failed to parse byte for input '" + jI + '\'', 0, 6);
        throw null;
    }

    @Override // defpackage.sb, defpackage.w90
    public final w90 t(bt2 bt2Var) {
        bt2Var.getClass();
        return g13.a(bt2Var) ? new b71(this.p0, this.n0) : this;
    }

    @Override // defpackage.sb, defpackage.l30
    public final Object u(bt2 bt2Var, int i, y81 y81Var, Object obj) {
        je jeVar = (je) this.p0.d;
        bt2Var.getClass();
        y81Var.getClass();
        boolean z = this.o0 == um3.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) jeVar.e;
            int i2 = jeVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) jeVar.d)[i2] = j9.S;
            }
        }
        Object objC = c(y81Var);
        if (z) {
            int[] iArr2 = (int[]) jeVar.e;
            int i3 = jeVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                jeVar.b = i4;
                if (i4 == ((Object[]) jeVar.d).length) {
                    jeVar.d();
                }
            }
            Object[] objArr = (Object[]) jeVar.d;
            int i5 = jeVar.b;
            objArr[i5] = ((a71) jeVar.c).k ? objC : j9.R;
            ((int[]) jeVar.e)[i5] = -2;
        }
        return objC;
    }

    @Override // defpackage.sb, defpackage.w90
    public final short w() {
        fk fkVar = this.p0;
        long jI = fkVar.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        fk.n(fkVar, "Failed to parse short for input '" + jI + '\'', 0, 6);
        throw null;
    }

    @Override // defpackage.sb, defpackage.w90
    public final String x() {
        boolean z = this.r0.c;
        fk fkVar = this.p0;
        return z ? fkVar.l() : fkVar.j();
    }

    @Override // defpackage.sb, defpackage.w90
    public final float y() {
        fk fkVar = this.p0;
        String strK = fkVar.k();
        try {
            float f = Float.parseFloat(strK);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            fk.n(fkVar, ce0.K(null, Float.valueOf(f)), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            fk.n(fkVar, p91.p("Failed to parse type 'float' for input '", strK, '\''), 0, 6);
            throw null;
        }
    }
}
