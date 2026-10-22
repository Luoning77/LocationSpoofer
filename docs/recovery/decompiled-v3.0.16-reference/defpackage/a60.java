package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a60 extends cv1 implements u30, hr1 {
    public x32 s;
    public final wo2 t;
    public boolean u;
    public final lo2 v;
    public boolean x;
    public boolean z;
    public final dt w = new dt(0);
    public long y = -1;

    public a60(x32 x32Var, wo2 wo2Var, boolean z, lo2 lo2Var) {
        this.s = x32Var;
        this.t = wo2Var;
        this.u = z;
        this.v = lo2Var;
    }

    public static boolean o1(a60 a60Var, pe2 pe2Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = a60Var.n1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jQ1 = a60Var.q1(pe2Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jQ1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jQ1 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.hr1
    public final void h(long j) {
        int iM;
        long j2;
        long jN1 = n1();
        this.y = j;
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            iM = o51.m((int) (j & 4294967295L), (int) (jN1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                b81.d();
                return;
            }
            iM = o51.m((int) (j >> 32), (int) (jN1 >> 32));
        }
        if (iM >= 0) {
            return;
        }
        if (this.u) {
            j2 = 0;
        } else {
            j2 = this.s == x32.e ? ((long) (((int) (jN1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jN1 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        pe2 pe2Var = (pe2) this.v.invoke();
        if (pe2Var == null || this.z || this.x || !o1(this, pe2Var, jN1, 0L, 2) || o1(this, pe2Var, 0L, j3, 1)) {
            return;
        }
        this.x = true;
        p1(j3);
    }

    public final float m1(ot otVar, long j) {
        float f;
        pe2 pe2Var;
        int iCompare;
        long j2 = this.y;
        gy1 gy1Var = this.w.a;
        int i = gy1Var.g - 1;
        Object[] objArr = gy1Var.e;
        if (i < objArr.length) {
            pe2Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                pe2 pe2Var2 = (pe2) ((x50) objArr[i]).a.invoke();
                if (pe2Var2 != null) {
                    long jD = pe2Var2.d();
                    long J = mc0.J(n1());
                    f = 0.0f;
                    int iOrdinal = this.s.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (J & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            b81.d();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (J >> 32)));
                    }
                    if (iCompare > 0) {
                        if (pe2Var != null) {
                            break;
                        }
                        pe2Var = pe2Var2;
                        break;
                    }
                    pe2Var = pe2Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            pe2Var = null;
        }
        if (pe2Var == null) {
            pe2 pe2Var3 = this.x ? (pe2) this.v.invoke() : null;
            if (pe2Var3 == null) {
                return f;
            }
            pe2Var = pe2Var3;
        }
        long J2 = mc0.J(j2);
        int iOrdinal2 = this.s.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = pe2Var.b;
            return otVar.a(f2 - ((int) (j & 4294967295L)), pe2Var.d - f2, Float.intBitsToFloat((int) (J2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = pe2Var.a;
            return otVar.a(f3 - ((int) (j >> 32)), pe2Var.c - f3, Float.intBitsToFloat((int) (J2 >> 32)));
        }
        b81.d();
        return f;
    }

    public final long n1() {
        long j = this.y;
        if (p41.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void p1(long j) {
        a40 a40Var = qt.a;
        ot otVar = (ot) xq1.C(this, a40Var);
        if (this.z) {
            s21.c("launchAnimation called when previous animation was running");
        }
        ((ot) xq1.C(this, a40Var)).getClass();
        ot.a.getClass();
        BuildersKt__Builders_commonKt.launch$default(a1(), null, CoroutineStart.UNDISPATCHED, new z50(this, new dg3(nt.b), otVar, j, null), 1, null);
    }

    public final long q1(pe2 pe2Var, long j, long j2) {
        long J = mc0.J(j);
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            ot otVar = (ot) xq1.C(this, qt.a);
            float f = pe2Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(otVar.a(f - ((int) (j2 & 4294967295L)), pe2Var.d - f, Float.intBitsToFloat((int) (J & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            b81.d();
            return 0L;
        }
        ot otVar2 = (ot) xq1.C(this, qt.a);
        float f2 = pe2Var.a;
        return (((long) Float.floatToRawIntBits(otVar2.a(f2 - ((int) (j2 >> 32)), pe2Var.c - f2, Float.intBitsToFloat((int) (J >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
