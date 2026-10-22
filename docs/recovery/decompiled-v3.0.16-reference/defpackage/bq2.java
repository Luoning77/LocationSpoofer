package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class bq2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ar2 f;

    public /* synthetic */ bq2(ar2 ar2Var, int i) {
        this.e = i;
        this.f = ar2Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int iNextIndex;
        CoroutineScope coroutineScope;
        pa1 pa1Var;
        List list;
        pa1 pa1Var2;
        pe2 pe2Var;
        int i;
        pa1 pa1Var3;
        pa1 pa1VarC;
        int[] iArr;
        int i2;
        bx1 bx1Var;
        xp2 xp2Var;
        int i3 = this.e;
        mf3 mf3Var = mf3.a;
        int i4 = 0;
        int i5 = 1;
        ar2 ar2Var = this.f;
        switch (i3) {
            case 0:
                c12 c12Var = (c12) ar2Var.p.getValue();
                return new c12(c12Var != null ? c12Var.a : 9205357640488583168L);
            case 1:
                c12 c12Var2 = (c12) ar2Var.q.getValue();
                return new c12(c12Var2 != null ? c12Var2.a : 9205357640488583168L);
            case 2:
                ar2 ar2Var2 = this.f;
                ar2Var2.x = true;
                ar2Var2.o();
                ar2Var2.r.setValue(null);
                ar2Var2.s.setValue(null);
                if (ar2Var2.u && ar2Var2.h()) {
                    we2 we2Var = new we2();
                    we2 we2Var2 = new we2();
                    ve2 ve2Var = new ve2();
                    er2 er2Var = ar2Var2.a;
                    ArrayList arrayListC = er2Var.c(ar2Var2.j());
                    ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            xp2 xp2Var2 = (xp2) er2Var.a().e(((bx1) listIterator.previous()).a);
                            if (xp2Var2 != null && xp2Var2.a.b != xp2Var2.b.b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = arrayListC.size();
                        int i6 = 0;
                        while (i6 < size) {
                            bx1 bx1Var2 = (bx1) arrayListC.get(i6);
                            xp2 xp2Var3 = (xp2) er2Var.a().e(bx1Var2.a);
                            if (xp2Var3 != null) {
                                dj djVarD = bx1Var2.d();
                                long jA = g93.a(xp2Var3.a.b, xp2Var3.b.b);
                                boolean z = i6 >= iNextIndex;
                                long j = bx1Var2.a;
                                if (z) {
                                    we2Var.e = djVarD;
                                    we2Var2.e = new f93(jA);
                                    ve2Var.e = j;
                                }
                            } else {
                                i6++;
                            }
                        }
                    }
                    Object obj = we2Var.e;
                    if (obj != null && we2Var2.e != null && ve2Var.e != 0 && ((CharSequence) obj).length() > 0 && (coroutineScope = ar2Var2.v) != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new t3(ar2Var2, we2Var, we2Var2, ve2Var, null, 13), 3, null);
                    }
                }
                ar2Var2.u = false;
                return mf3Var;
            case 3:
                ar2Var.i();
                return mf3Var;
            case 4:
                pe2 pe2Var2 = n51.O;
                er2 er2Var2 = ar2Var.a;
                ar2Var.m.getValue();
                if (ar2Var.f() != null && (pa1Var = ar2Var.l) != null && pa1Var.U()) {
                    ArrayList arrayListC2 = er2Var2.c(ar2Var.j());
                    ArrayList arrayList = new ArrayList(arrayListC2.size());
                    int size2 = arrayListC2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        bx1 bx1Var3 = (bx1) arrayListC2.get(i7);
                        xp2 xp2Var4 = (xp2) er2Var2.a().e(bx1Var3.a);
                        i52 i52Var = xp2Var4 != null ? new i52(bx1Var3, xp2Var4) : null;
                        if (i52Var != null) {
                            arrayList.add(i52Var);
                        }
                    }
                    int size3 = arrayList.size();
                    List listG = arrayList;
                    listG = arrayList;
                    if (size3 != 0 && size3 != 1) {
                        listG = am1.G(zy.n0(arrayList), zy.t0(arrayList));
                    }
                    if (!listG.isEmpty()) {
                        if (listG.isEmpty()) {
                            pe2Var = pe2Var2;
                            pa1Var2 = pa1Var;
                        } else {
                            int size4 = listG.size();
                            int i8 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            while (i8 < size4) {
                                i52 i52Var2 = (i52) list.get(i8);
                                bx1 bx1Var4 = (bx1) i52Var2.e;
                                xp2 xp2Var5 = (xp2) i52Var2.f;
                                int i9 = xp2Var5.a.b;
                                int i10 = xp2Var5.b.b;
                                if (i9 == i10 || (pa1VarC = bx1Var4.c()) == null) {
                                    list = listG;
                                    list = listG;
                                    i = size4;
                                    pa1Var3 = pa1Var;
                                } else {
                                    int iMin = Math.min(i9, i10);
                                    int iMax = Math.max(i9, i10) - i5;
                                    if (iMin == iMax) {
                                        list = listG;
                                        iArr = new int[i5];
                                        iArr[i4] = iMin;
                                    } else {
                                        list = listG;
                                        int[] iArr2 = new int[2];
                                        iArr2[i4] = iMin;
                                        iArr2[i5] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    int i11 = i4;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    while (i11 < length) {
                                        int i12 = iArr[i11];
                                        x83 x83Var = (x83) bx1Var4.c.invoke();
                                        pe2 pe2VarB = pe2.e;
                                        if (x83Var == null) {
                                            i2 = size4;
                                            bx1Var = bx1Var4;
                                        } else {
                                            i2 = size4;
                                            int length2 = x83Var.a.a.f.length();
                                            bx1Var = bx1Var4;
                                            if (length2 >= 1) {
                                                pe2VarB = x83Var.b(mh0.v(i12, 0, length2 - 1));
                                            }
                                        }
                                        pe2 pe2Var3 = pe2VarB;
                                        fMin3 = Math.min(fMin3, pe2Var3.a);
                                        fMin4 = Math.min(fMin4, pe2Var3.b);
                                        fMax3 = Math.max(fMax3, pe2Var3.c);
                                        fMax4 = Math.max(fMax4, pe2Var3.d);
                                        i11++;
                                        size4 = i2;
                                        bx1Var4 = bx1Var;
                                    }
                                    i = size4;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMin3)) << 32);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    pa1Var3 = pa1Var;
                                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fMax4)) & 4294967295L;
                                    long jL = pa1Var3.L(pa1VarC, jFloatToRawIntBits);
                                    long jL2 = pa1Var3.L(pa1VarC, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jL >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jL & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jL2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jL2 & 4294967295L)));
                                }
                                i8++;
                                list = list;
                                pa1Var = pa1Var3;
                                size4 = i;
                                i4 = 0;
                                i5 = 1;
                            }
                            list = listG;
                            pa1Var2 = pa1Var;
                            pe2Var = new pe2(fMin, fMin2, fMax, fMax2);
                        }
                        if (!pe2Var.equals(pe2Var2)) {
                            pe2 pe2VarF = n51.A(pa1Var2).f(pe2Var);
                            if (pe2VarF.c - pe2VarF.a >= 0.0f && pe2VarF.d - pe2VarF.b >= 0.0f) {
                                pe2 pe2VarJ = pe2VarF.j(pa1Var2.h0(0L));
                                float f = pe2VarJ.d;
                                rs2 rs2Var = tq2.a;
                                return pe2.b(pe2VarJ, 0.0f, 0.0f, f + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case Logger.WARN /* 5 */:
                ar2Var.b();
                if (ar2Var.g()) {
                    ar2Var.i();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return Boolean.valueOf((ar2Var.x && ar2Var.g()) ? false : true);
            default:
                er2 er2Var3 = ar2Var.a;
                ArrayList arrayListC3 = er2Var3.c(ar2Var.j());
                if (!arrayListC3.isEmpty()) {
                    lx1 lx1Var = nj1.a;
                    lx1 lx1Var2 = new lx1();
                    int i13 = 0;
                    xp2 xp2Var6 = null;
                    xp2 xp2Var7 = null;
                    for (int size5 = arrayListC3.size(); i13 < size5; size5 = size5) {
                        bx1 bx1Var5 = (bx1) arrayListC3.get(i13);
                        long j2 = bx1Var5.a;
                        x83 x83Var2 = (x83) bx1Var5.c.invoke();
                        if (x83Var2 == null) {
                            xp2Var = null;
                        } else {
                            int length3 = x83Var2.a.a.f.length();
                            xp2Var = new xp2(new wp2(x83Var2.a(0), 0, j2), new wp2(x83Var2.a(Math.max(length3 - 1, 0)), length3, j2), false);
                        }
                        if (xp2Var != null) {
                            if (xp2Var6 == null) {
                                xp2Var6 = xp2Var;
                            }
                            long j3 = bx1Var5.a;
                            int iC = lx1Var2.c(j3);
                            Object[] objArr = lx1Var2.c;
                            Object obj2 = objArr[iC];
                            lx1Var2.b[iC] = j3;
                            objArr[iC] = xp2Var;
                            xp2Var7 = xp2Var;
                        }
                        i13++;
                        arrayListC3 = arrayListC3;
                    }
                    if (lx1Var2.e != 0) {
                        if (xp2Var6 != xp2Var7) {
                            xp2Var6.getClass();
                            wp2 wp2Var = xp2Var6.a;
                            xp2Var7.getClass();
                            xp2Var6 = new xp2(wp2Var, xp2Var7.b, false);
                        }
                        er2Var3.k.setValue(lx1Var2);
                        ar2Var.d.invoke(xp2Var6);
                        ar2Var.t = null;
                    }
                }
                return mf3Var;
        }
    }
}
