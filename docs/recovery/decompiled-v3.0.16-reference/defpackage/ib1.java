package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ib1 {
    public final r9 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public r9 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public ib1(r9 r9Var, int i) {
        this.j = i;
        this.a = r9Var;
    }

    public final void a(m9 m9Var, int i, xz1 xz1Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jL = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        s42 s42Var = xz1Var.R;
                        if (s42Var != null) {
                            nw0 nw0Var = (nw0) s42Var;
                            float[] fArrB = nw0Var.b();
                            if (!nw0Var.w) {
                                jL = yq1.b(jL, fArrB);
                            }
                        }
                        jL = gh0.L(jL, xz1Var.F);
                        break;
                    default:
                        ek1 ek1VarR1 = xz1Var.r1();
                        ek1VarR1.getClass();
                        long j = ek1VarR1.t;
                        jL = c12.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jL);
                        break;
                }
                xz1Var = xz1Var.w;
                xz1Var.getClass();
                if (xz1Var.equals(this.a.F())) {
                    int iRound = Math.round(m9Var instanceof dy0 ? Float.intBitsToFloat((int) (jL & 4294967295L)) : Float.intBitsToFloat((int) (jL >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(m9Var)) {
                        int iIntValue = ((Number) jq1.L(m9Var, map)).intValue();
                        dy0 dy0Var = p9.a;
                        iRound = ((Number) m9Var.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(m9Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(xz1Var).containsKey(m9Var));
            float fC = c(xz1Var, m9Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(xz1 xz1Var) {
        switch (this.j) {
            case 0:
                return xz1Var.b1().c();
            default:
                ek1 ek1VarR1 = xz1Var.r1();
                ek1VarR1.getClass();
                return ek1VarR1.b1().c();
        }
    }

    public final int c(xz1 xz1Var, m9 m9Var) {
        switch (this.j) {
            case 0:
                return xz1Var.x0(m9Var);
            default:
                ek1 ek1VarR1 = xz1Var.r1();
                ek1VarR1.getClass();
                return ek1VarR1.x0(m9Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        r9 r9Var = this.a;
        r9 r9VarH = r9Var.H();
        if (r9VarH == null) {
            return;
        }
        if (this.c) {
            r9VarH.r0();
        } else if (this.e || this.d) {
            r9VarH.requestLayout();
        }
        if (this.f) {
            r9Var.r0();
        }
        if (this.g) {
            r9Var.requestLayout();
        }
        r9VarH.c().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        q9 q9Var = new q9(this, 0);
        r9 r9Var = this.a;
        r9Var.C(q9Var);
        map.putAll(b(r9Var.F()));
        this.b = false;
    }

    public final void h() {
        ib1 ib1VarC;
        ib1 ib1VarC2;
        boolean zD = d();
        r9 r9Var = this.a;
        if (!zD) {
            r9 r9VarH = r9Var.H();
            if (r9VarH == null) {
                return;
            }
            r9Var = r9VarH.c().h;
            if (r9Var == null || !r9Var.c().d()) {
                r9 r9Var2 = this.h;
                if (r9Var2 == null || r9Var2.c().d()) {
                    return;
                }
                r9 r9VarH2 = r9Var2.H();
                if (r9VarH2 != null && (ib1VarC2 = r9VarH2.c()) != null) {
                    ib1VarC2.h();
                }
                r9 r9VarH3 = r9Var2.H();
                r9Var = (r9VarH3 == null || (ib1VarC = r9VarH3.c()) == null) ? null : ib1VarC.h;
            }
        }
        this.h = r9Var;
    }
}
