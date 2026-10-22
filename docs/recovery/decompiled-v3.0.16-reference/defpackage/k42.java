package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k42 implements er1 {
    public final lu0 a;
    public final boolean b;
    public final l73 c;
    public final g73 d;
    public final z42 e;
    public final float f;

    public k42(lu0 lu0Var, boolean z, l73 l73Var, g73 g73Var, z42 z42Var, float f) {
        this.a = lu0Var;
        this.b = z;
        this.c = l73Var;
        this.d = g73Var;
        this.e = z42Var;
        this.f = f;
    }

    public static final int i(int i, k42 k42Var, int i2, int i3, h82 h82Var, h82 h82Var2) {
        if (k42Var.b) {
            i3 = Math.round(((i2 - h82Var2.f) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (h82Var != null ? h82Var.f : 0) / 2);
    }

    public final int a(xb0 xb0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, gh0.F(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        z42 z42Var = this.e;
        float fR = xb0Var.R(z42Var.d());
        return m50.f(Math.max(i, Math.max(i2, xq1.P(gh0.E(fR, Math.max(fR, i6 / 2.0f), f) + i5 + xb0Var.R(z42Var.c())))) + i8, j);
    }

    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
        return e(g51Var, list, i, new v70(13, (byte) 0));
    }

    public final int c(xb0 xb0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, gh0.F(f, i6, 0))) + i + i2;
        z42 z42Var = this.e;
        qa1 qa1Var = qa1.e;
        return m50.g(Math.max(iMax, xq1.P((i6 + xb0Var.R(z42Var.b(qa1Var) + z42Var.a(qa1Var))) * f)), j);
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
        return f(g51Var, list, i, new v70(12, (byte) 0));
    }

    public final int e(g51 g51Var, List list, int i, pu0 pu0Var) {
        Object obj;
        int iV;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        k42 k42Var = this;
        float fInvoke = k42Var.d.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (o51.f(ce0.x((zq1) obj), "Leading")) {
                break;
            }
            i2++;
        }
        zq1 zq1Var = (zq1) obj;
        if (zq1Var != null) {
            iV = ce0.V(i, zq1Var.s0(Integer.MAX_VALUE));
            iIntValue = ((Number) pu0Var.invoke(zq1Var, Integer.valueOf(i))).intValue();
        } else {
            iV = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (o51.f(ce0.x((zq1) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        zq1 zq1Var2 = (zq1) obj2;
        if (zq1Var2 != null) {
            iV = ce0.V(iV, zq1Var2.s0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) pu0Var.invoke(zq1Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (o51.f(ce0.x((zq1) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (zq1) obj3;
        int iIntValue5 = obj8 != null ? ((Number) pu0Var.invoke(obj8, Integer.valueOf(gh0.F(fInvoke, iV, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (o51.f(ce0.x((zq1) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        zq1 zq1Var3 = (zq1) obj4;
        if (zq1Var3 != null) {
            iIntValue3 = ((Number) pu0Var.invoke(zq1Var3, Integer.valueOf(iV))).intValue();
            iV = ce0.V(iV, zq1Var3.s0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (o51.f(ce0.x((zq1) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        zq1 zq1Var4 = (zq1) obj5;
        if (zq1Var4 != null) {
            iIntValue4 = ((Number) pu0Var.invoke(zq1Var4, Integer.valueOf(iV))).intValue();
            iV = ce0.V(iV, zq1Var4.s0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (o51.f(ce0.x((zq1) obj9), "TextField")) {
                int iIntValue6 = ((Number) pu0Var.invoke(obj9, Integer.valueOf(iV))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (o51.f(ce0.x((zq1) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (zq1) obj6;
                int iIntValue7 = obj10 != null ? ((Number) pu0Var.invoke(obj10, Integer.valueOf(iV))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (o51.f(ce0.x((zq1) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (zq1) obj7;
                return k42Var.a(g51Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) pu0Var.invoke(obj11, Integer.valueOf(i))).intValue() : 0, m50.b(0, 0, 0, 0, 15), fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            k42Var = this;
            iIntValue3 = iIntValue3;
        }
        xg1.b("Collection contains no element matching the predicate.");
        fo.d();
        return 0;
    }

    public final int f(g51 g51Var, List list, int i, pu0 pu0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (o51.f(ce0.x((zq1) obj7), "TextField")) {
                int iIntValue = ((Number) pu0Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (o51.f(ce0.x((zq1) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                zq1 zq1Var = (zq1) obj2;
                int iIntValue2 = zq1Var != null ? ((Number) pu0Var.invoke(zq1Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (o51.f(ce0.x((zq1) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                zq1 zq1Var2 = (zq1) obj3;
                int iIntValue3 = zq1Var2 != null ? ((Number) pu0Var.invoke(zq1Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (o51.f(ce0.x((zq1) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                zq1 zq1Var3 = (zq1) obj4;
                int iIntValue4 = zq1Var3 != null ? ((Number) pu0Var.invoke(zq1Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (o51.f(ce0.x((zq1) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                zq1 zq1Var4 = (zq1) obj5;
                int iIntValue5 = zq1Var4 != null ? ((Number) pu0Var.invoke(zq1Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (o51.f(ce0.x((zq1) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                zq1 zq1Var5 = (zq1) obj6;
                int iIntValue6 = zq1Var5 != null ? ((Number) pu0Var.invoke(zq1Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (o51.f(ce0.x((zq1) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                zq1 zq1Var6 = (zq1) obj;
                return c(g51Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, zq1Var6 != null ? ((Number) pu0Var.invoke(zq1Var6, Integer.valueOf(i))).intValue() : 0, m50.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        xg1.b("Collection contains no element matching the predicate.");
        fo.d();
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.er1
    public final defpackage.fr1 g(defpackage.gr1 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k42.g(gr1, java.util.List, long):fr1");
    }

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
        return e(g51Var, list, i, new v70(11, (byte) 0));
    }

    @Override // defpackage.er1
    public final int j(g51 g51Var, List list, int i) {
        return f(g51Var, list, i, new v70(14, (byte) 0));
    }
}
