package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qz1 extends b02 {
    public final cv1 c;
    public final x8 d;
    public final zj1 e;
    public xz1 f;
    public p92 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public qz1(cv1 cv1Var) {
        this.c = cv1Var;
        x8 x8Var = new x8(6, (byte) 0);
        x8Var.c = new long[2];
        this.d = x8Var;
        this.e = new zj1(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x029d  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cv1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [cv1] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // defpackage.b02
    public final boolean a(zj1 zj1Var, pa1 pa1Var, c51 c51Var, boolean z) {
        x8 x8Var;
        zj1 zj1Var2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        p92 p92Var;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        boolean zA = super.a(zj1Var, pa1Var, c51Var, z);
        ?? J = this.c;
        if (J.r) {
            ?? gy1Var = 0;
            while (J != 0) {
                if (J instanceof ba2) {
                    this.f = xp1.L((ba2) J, 16);
                } else if ((J.g & 16) != 0 && (J instanceof lb0)) {
                    cv1 cv1Var = ((lb0) J).t;
                    int i5 = 0;
                    while (cv1Var != null) {
                        if ((cv1Var.g & 16) != 0) {
                            i5++;
                            if (i5 == 1) {
                                J = J;
                                gy1Var = gy1Var;
                                gy1Var = gy1Var;
                                J = cv1Var;
                            } else {
                                if (gy1Var == 0) {
                                    gy1Var = new gy1(new cv1[16]);
                                }
                                if (J != 0) {
                                    gy1Var.b(J);
                                    J = 0;
                                }
                                gy1Var.b(cv1Var);
                            }
                        } else {
                            J = J;
                            gy1Var = gy1Var;
                        }
                        cv1Var = cv1Var.j;
                        J = J;
                        gy1Var = gy1Var;
                    }
                    if (i5 == 1) {
                        J = J;
                        gy1Var = gy1Var;
                    } else {
                        J = J;
                        gy1Var = gy1Var;
                    }
                }
                J = xp1.J(gy1Var);
            }
            if (this.f != null) {
                int iJ = zj1Var.j();
                int i6 = 0;
                while (true) {
                    x8Var = this.d;
                    zj1Var2 = this.e;
                    if (i6 >= iJ) {
                        break;
                    }
                    long jF = zj1Var.f(i6);
                    x92 x92Var = (x92) zj1Var.k(i6);
                    if (x8Var.b(jF)) {
                        long j = x92Var.g;
                        List list = x92Var.m;
                        i4 = i6;
                        long j2 = x92Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            uj0 uj0Var = uj0.e;
                            ArrayList arrayList = new ArrayList((list == null ? uj0Var : list).size());
                            if (list == null) {
                                list = uj0Var;
                            }
                            int size = list.size();
                            int i7 = 0;
                            while (i7 < size) {
                                int i8 = size;
                                vx0 vx0Var = (vx0) list.get(i7);
                                int i9 = i7;
                                List list2 = list;
                                long j3 = vx0Var.b;
                                if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j4 = vx0Var.a;
                                    xz1 xz1Var = this.f;
                                    xz1Var.getClass();
                                    arrayList.add(new vx0(j4, xz1Var.i0(pa1Var, j3, true), vx0Var.c, vx0Var.d, vx0Var.e));
                                }
                                i7 = i9 + 1;
                                list = list2;
                                size = i8;
                                zj1Var2 = zj1Var2;
                                jF = jF;
                            }
                            zj1 zj1Var3 = zj1Var2;
                            long j5 = jF;
                            xz1 xz1Var2 = this.f;
                            xz1Var2.getClass();
                            long jI0 = xz1Var2.i0(pa1Var, j, true);
                            xz1 xz1Var3 = this.f;
                            xz1Var3.getClass();
                            x92 x92Var2 = new x92(x92Var.a, x92Var.b, xz1Var3.i0(pa1Var, j2, true), x92Var.d, x92Var.e, x92Var.f, jI0, x92Var.h, x92Var.i, arrayList, x92Var.j, x92Var.k, x92Var.l, x92Var.n);
                            x92 x92Var3 = x92Var.q;
                            if (x92Var3 == null) {
                                x92Var3 = x92Var;
                            }
                            x92Var2.q = x92Var3;
                            x92 x92Var4 = x92Var.q;
                            if (x92Var4 != null) {
                                x92Var = x92Var4;
                            }
                            x92Var2.q = x92Var;
                            zj1Var3.g(j5, x92Var2);
                        }
                    } else {
                        i4 = i6;
                    }
                    i6 = i4 + 1;
                    iJ = iJ;
                    zA = zA;
                }
                boolean z7 = zA;
                if (zj1Var2.e()) {
                    x8Var.b = 0;
                    this.a.g();
                    return true;
                }
                int i10 = x8Var.b;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    if (!zj1Var.b(((long[]) x8Var.c)[i10]) && i10 < (i3 = x8Var.b)) {
                        int i11 = i3 - 1;
                        int i12 = i10;
                        while (i12 < i11) {
                            long[] jArr = (long[]) x8Var.c;
                            int i13 = i12 + 1;
                            jArr[i12] = jArr[i13];
                            i12 = i13;
                        }
                        x8Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(zj1Var2.j());
                int iJ2 = zj1Var2.j();
                for (int i14 = 0; i14 < iJ2; i14++) {
                    arrayList2.add(zj1Var2.k(i14));
                }
                p92 p92Var2 = new p92(arrayList2, c51Var);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i15);
                    if (c51Var.a(((x92) obj).a)) {
                        break;
                    }
                    i15++;
                }
                x92 x92Var5 = (x92) obj;
                if (x92Var5 != null) {
                    boolean z8 = x92Var5.d;
                    if (z) {
                        z2 = false;
                        z5 = this.i;
                        if (!z5 && (z8 || x92Var5.h)) {
                            xz1 xz1Var4 = this.f;
                            xz1Var4.getClass();
                            long j6 = xz1Var4.g;
                            long j7 = x92Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            z3 = true;
                            z5 = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j6 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j6 & 4294967295L)))));
                            this.i = z5;
                        }
                        z6 = this.h;
                        if (z5 == z6 && ((i2 = p92Var2.f) == 3 || i2 == 4 || i2 == 5)) {
                            p92Var2.f = z5 ? 4 : 5;
                        } else {
                            i = p92Var2.f;
                            if (i != 4 && z6 && !this.j) {
                                p92Var2.f = 3;
                            } else if (i == 5 && z5 && z8) {
                                p92Var2.f = 3;
                            }
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z5 = false;
                    }
                    z3 = true;
                    z6 = this.h;
                    if (z5 == z6) {
                        i = p92Var2.f;
                        if (i != 4) {
                            if (i == 5) {
                                p92Var2.f = 3;
                            }
                        } else if (i == 5) {
                            p92Var2.f = 3;
                        }
                    } else {
                        i = p92Var2.f;
                        if (i != 4) {
                            if (i == 5) {
                                p92Var2.f = 3;
                            }
                        } else if (i == 5) {
                            p92Var2.f = 3;
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z7 && p92Var2.f == 3 && (p92Var = this.g) != null) {
                    ?? r1 = p92Var.a;
                    int size3 = r1.size();
                    ?? r4 = p92Var2.a;
                    if (size3 != r4.size()) {
                        z4 = z3;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z4 = z2;
                            break;
                        }
                        if (!c12.b(((x92) r1.get(r5)).c, ((x92) r4.get(r5)).c)) {
                            z4 = z3;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z4 = z3;
                    break;
                }
                this.g = p92Var2;
                return z4;
            }
        }
        return true;
    }

    @Override // defpackage.b02
    public final void b(c51 c51Var) {
        super.b(c51Var);
        p92 p92Var = this.g;
        if (p92Var == null) {
            return;
        }
        this.h = this.i;
        List list = p92Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x92 x92Var = (x92) list.get(i);
            boolean z = x92Var.d;
            long j = x92Var.a;
            boolean zA = c51Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.j(j);
            }
        }
        this.i = false;
        this.j = p92Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [gy1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [gy1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cv1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cv1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        gy1 gy1Var = this.a;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((qz1) objArr[i2]).c();
        }
        ?? J = this.c;
        ?? gy1Var2 = 0;
        while (J != 0) {
            if (J instanceof ba2) {
                ((ba2) J).K0();
            } else if ((J.g & 16) != 0 && (J instanceof lb0)) {
                cv1 cv1Var = ((lb0) J).t;
                int i3 = 0;
                gy1Var2 = gy1Var2;
                J = J;
                while (cv1Var != null) {
                    if ((cv1Var.g & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            gy1Var2 = gy1Var2;
                            J = cv1Var;
                        } else {
                            if (gy1Var2 == 0) {
                                gy1Var2 = new gy1(new cv1[16]);
                            }
                            if (J != 0) {
                                gy1Var2.b(J);
                                J = 0;
                            }
                            gy1Var2.b(cv1Var);
                        }
                    }
                    cv1Var = cv1Var.j;
                    gy1Var2 = gy1Var2;
                    J = J;
                }
                if (i3 == 1) {
                }
            }
            J = xp1.J(gy1Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(c51 c51Var) {
        hb1 hb1Var;
        zj1 zj1Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!zj1Var.e()) {
            cv1 cv1Var = this.c;
            if (cv1Var.r) {
                xz1 xz1Var = cv1Var.l;
                if ((xz1Var == null || (hb1Var = xz1Var.s) == null) ? false : hb1Var.H()) {
                    p92 p92Var = this.g;
                    p92Var.getClass();
                    xz1 xz1Var2 = this.f;
                    xz1Var2.getClass();
                    long j = xz1Var2.g;
                    ?? J = cv1Var;
                    ?? gy1Var = 0;
                    while (J != 0) {
                        if (J instanceof ba2) {
                            ((ba2) J).d0(p92Var, q92.g, j);
                        } else if ((J.g & 16) != 0 && (J instanceof lb0)) {
                            cv1 cv1Var2 = ((lb0) J).t;
                            int i = 0;
                            while (cv1Var2 != null) {
                                if ((cv1Var2.g & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        J = J;
                                        gy1Var = gy1Var;
                                        gy1Var = gy1Var;
                                        J = cv1Var2;
                                    } else {
                                        if (gy1Var == 0) {
                                            gy1Var = new gy1(new cv1[16]);
                                        }
                                        if (J != 0) {
                                            gy1Var.b(J);
                                            J = 0;
                                        }
                                        gy1Var.b(cv1Var2);
                                    }
                                } else {
                                    J = J;
                                    gy1Var = gy1Var;
                                }
                                cv1Var2 = cv1Var2.j;
                                J = J;
                                gy1Var = gy1Var;
                            }
                            if (i == 1) {
                                J = J;
                                gy1Var = gy1Var;
                            } else {
                                J = J;
                                gy1Var = gy1Var;
                            }
                        }
                        J = xp1.J(gy1Var);
                    }
                    if (cv1Var.r) {
                        gy1 gy1Var2 = this.a;
                        Object[] objArr = gy1Var2.e;
                        int i2 = gy1Var2.g;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((qz1) objArr[i3]).d(c51Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(c51Var);
        zj1Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cv1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cv1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cv1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [gy1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [gy1] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(c51 c51Var, boolean z) {
        hb1 hb1Var;
        if (!this.e.e()) {
            ?? J = this.c;
            if (J.r) {
                xz1 xz1Var = J.l;
                if ((xz1Var == null || (hb1Var = xz1Var.s) == null) ? false : hb1Var.H()) {
                    p92 p92Var = this.g;
                    p92Var.getClass();
                    xz1 xz1Var2 = this.f;
                    xz1Var2.getClass();
                    long j = xz1Var2.g;
                    ?? J2 = J;
                    ?? gy1Var = 0;
                    while (J2 != 0) {
                        if (J2 instanceof ba2) {
                            ((ba2) J2).d0(p92Var, q92.e, j);
                        } else if ((J2.g & 16) != 0 && (J2 instanceof lb0)) {
                            cv1 cv1Var = ((lb0) J2).t;
                            int i = 0;
                            while (cv1Var != null) {
                                if ((cv1Var.g & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        J2 = J2;
                                        gy1Var = gy1Var;
                                        gy1Var = gy1Var;
                                        J2 = cv1Var;
                                    } else {
                                        if (gy1Var == 0) {
                                            gy1Var = new gy1(new cv1[16]);
                                        }
                                        if (J2 != 0) {
                                            gy1Var.b(J2);
                                            J2 = 0;
                                        }
                                        gy1Var.b(cv1Var);
                                    }
                                } else {
                                    J2 = J2;
                                    gy1Var = gy1Var;
                                }
                                cv1Var = cv1Var.j;
                                J2 = J2;
                                gy1Var = gy1Var;
                            }
                            if (i == 1) {
                                J2 = J2;
                                gy1Var = gy1Var;
                            } else {
                                J2 = J2;
                                gy1Var = gy1Var;
                            }
                        }
                        J2 = xp1.J(gy1Var);
                    }
                    if (J.r) {
                        gy1 gy1Var2 = this.a;
                        Object[] objArr = gy1Var2.e;
                        int i2 = gy1Var2.g;
                        for (int i3 = 0; i3 < i2; i3++) {
                            qz1 qz1Var = (qz1) objArr[i3];
                            this.f.getClass();
                            qz1Var.e(c51Var, z);
                        }
                    }
                    if (J.r) {
                        ?? gy1Var3 = 0;
                        while (J != 0) {
                            if (J instanceof ba2) {
                                ((ba2) J).d0(p92Var, q92.f, j);
                            } else if ((J.g & 16) != 0 && (J instanceof lb0)) {
                                cv1 cv1Var2 = ((lb0) J).t;
                                int i4 = 0;
                                while (cv1Var2 != null) {
                                    if ((cv1Var2.g & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            J = J;
                                            gy1Var3 = gy1Var3;
                                            gy1Var3 = gy1Var3;
                                            J = cv1Var2;
                                        } else {
                                            if (gy1Var3 == 0) {
                                                gy1Var3 = new gy1(new cv1[16]);
                                            }
                                            if (J != 0) {
                                                gy1Var3.b(J);
                                                J = 0;
                                            }
                                            gy1Var3.b(cv1Var2);
                                        }
                                    } else {
                                        J = J;
                                        gy1Var3 = gy1Var3;
                                    }
                                    cv1Var2 = cv1Var2.j;
                                    J = J;
                                    gy1Var3 = gy1Var3;
                                }
                                if (i4 == 1) {
                                    J = J;
                                    gy1Var3 = gy1Var3;
                                } else {
                                    J = J;
                                    gy1Var3 = gy1Var3;
                                }
                            }
                            J = xp1.J(gy1Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, sx1 sx1Var) {
        x8 x8Var = this.d;
        if (x8Var.b(j) && sx1Var.g(this) < 0) {
            x8Var.j(j);
            this.e.h(j);
        }
        gy1 gy1Var = this.a;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((qz1) objArr[i2]).f(j, sx1Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
