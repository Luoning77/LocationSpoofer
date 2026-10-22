package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class j2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j2(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x031e  */
    /* JADX WARN: Code duplicated, block: B:463:0x09bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r58v2 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uj0] */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    private final Object f(Object obj, Object obj2) {
        float fA;
        ko koVar;
        pc1 pc1Var;
        ?? arrayList;
        k41 k41Var;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        ArrayList arrayList2;
        int i6;
        kc1 kc1Var;
        ArrayList arrayList3;
        int i7;
        int i8;
        pc1 pc1Var2;
        ArrayList arrayList4;
        int iG;
        kc1 kc1Var2;
        int i9;
        mo moVar;
        boolean z;
        pc1 pc1Var3;
        int i10;
        boolean z2;
        ?? r8;
        Integer numValueOf;
        ?? r17;
        qd1 qd1Var;
        int i11;
        fx1 fx1Var;
        int i12;
        int i13;
        Object obj3;
        int i14;
        int i15;
        int iMax;
        int i16;
        int i17;
        int i18;
        int iG2;
        boolean zB = p41.b(0L, 0L);
        mc1 mc1Var = (mc1) this.f;
        pd1 pd1Var = (pd1) this.g;
        h23 h23Var = (h23) obj;
        pc1 pc1Var4 = new pc1(mc1Var, h23Var);
        long j2 = ((l50) obj2).a;
        io ioVar = pd1Var.f;
        ko koVar2 = pd1Var.e;
        z42 z42Var = pd1Var.c;
        boolean z3 = pd1Var.b;
        yd1 yd1Var = pd1Var.a;
        yd1Var.t.getValue();
        boolean z4 = yd1Var.b || h23Var.J();
        x32 x32Var = x32.f;
        x32 x32Var2 = x32.e;
        ji2.y(j2, z3 ? x32Var2 : x32Var);
        int iN0 = z3 ? h23Var.n0(z42Var.a(h23Var.getLayoutDirection())) : h23Var.n0(zm3.i(z42Var, h23Var.getLayoutDirection()));
        int iN1 = z3 ? h23Var.n0(z42Var.b(h23Var.getLayoutDirection())) : h23Var.n0(zm3.g(z42Var, h23Var.getLayoutDirection()));
        int iN2 = h23Var.n0(z42Var.d());
        int iN3 = h23Var.n0(z42Var.c()) + iN2;
        int i19 = iN0 + iN1;
        int i20 = z3 ? iN3 : i19;
        if (z3) {
            iN1 = iN2;
        } else if (!z3) {
            iN1 = iN0;
        }
        int i21 = i20 - iN1;
        long jI = m50.i(-i19, -iN3, j2);
        ld1 ld1Var = (ld1) pd1Var.d.invoke();
        bc1 bc1Var = ld1Var.c;
        int iH = l50.h(jI);
        int iG3 = l50.g(jI);
        bc1Var.a.h(iH);
        bc1Var.b.h(iG3);
        if (z3) {
            if (koVar2 == null) {
                throw p91.h("null verticalArrangement when isVertical == true");
            }
            fA = koVar2.a();
        } else {
            if (ioVar == null) {
                throw p91.h("null horizontalAlignment when isVertical == false");
            }
            fA = ioVar.a();
        }
        int iN4 = h23Var.n0(fA);
        int iC = ld1Var.c();
        int iG4 = z3 ? l50.g(j2) - iN3 : l50.h(j2) - i19;
        long j3 = (((long) iN0) << 32) | (((long) iN2) & 4294967295L);
        int i22 = iG4;
        int i23 = iN1;
        od1 od1Var = new od1(jI, pd1Var.b, ld1Var, pc1Var4, iC, iN4, pd1Var.i, pd1Var.j, i23, i21, j3, pd1Var.a);
        ld1 ld1Var2 = od1Var.b;
        q01 q01Var = ld1Var2.d;
        nx2 nx2VarK = wc0.K();
        Integer numValueOf2 = null;
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            ax axVar = yd1Var.e;
            ld1 ld1Var3 = ld1Var2;
            int iG5 = ((t52) axVar.b).g();
            int iX = gh0.x(iG5, ld1Var, axVar.d);
            if (iG5 != iX) {
                pc1Var = pc1Var4;
                ((t52) axVar.b).h(iX);
                qc1 qc1Var = (qc1) axVar.e;
                koVar = koVar2;
                if (iG5 != qc1Var.f) {
                    qc1Var.f = iG5;
                    int i24 = (iG5 / 30) * 30;
                    qc1Var.e.setValue(mh0.f0(Math.max(i24 - 100, 0), i24 + 130));
                }
            } else {
                koVar = koVar2;
                pc1Var = pc1Var4;
            }
            int iG6 = ((t52) axVar.c).g();
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            tc1 tc1Var = yd1Var.s;
            dt dtVar = yd1Var.p;
            gy1 gy1Var = dtVar.a;
            boolean z5 = gy1Var.g != 0;
            ?? r9 = uj0.e;
            if (z5 || !tc1Var.e.isEmpty()) {
                arrayList = new ArrayList();
                if (dtVar.a.g != 0) {
                    int i25 = gy1Var.g;
                    if (i25 == 0) {
                        b81.y("MutableVector is empty.");
                        return null;
                    }
                    Object[] objArr = gy1Var.e;
                    int i26 = ((cc1) objArr[0]).a;
                    int i27 = 0;
                    while (i27 < i25) {
                        int i28 = i27;
                        int i29 = ((cc1) objArr[i27]).a;
                        if (i29 < i26) {
                            i26 = i29;
                        }
                        i27 = i28 + 1;
                    }
                    if (i26 < 0) {
                        s21.a("negative minIndex");
                    }
                    int i30 = gy1Var.g;
                    if (i30 == 0) {
                        b81.y("MutableVector is empty.");
                        return null;
                    }
                    Object[] objArr2 = gy1Var.e;
                    int i31 = ((cc1) objArr2[0]).b;
                    int i32 = 0;
                    while (i32 < i30) {
                        Object[] objArr3 = objArr2;
                        int i33 = ((cc1) objArr2[i32]).b;
                        if (i33 > i31) {
                            i31 = i33;
                        }
                        i32++;
                        objArr2 = objArr3;
                    }
                    k41Var = new k41(i26, Math.min(i31, ld1Var.c() - 1), 1);
                } else {
                    k41Var = k41.h;
                }
                int size = tc1Var.e.size();
                for (int i34 = 0; i34 < size; i34++) {
                    rc1 rc1Var = (rc1) tc1Var.get(i34);
                    int iX2 = gh0.x(rc1Var.c, ld1Var, rc1Var.a);
                    int i35 = k41Var.e;
                    if ((iX2 > k41Var.f || i35 > iX2) && iX2 >= 0 && iX2 < ld1Var.c()) {
                        arrayList.add(Integer.valueOf(iX2));
                    }
                }
                int i36 = k41Var.e;
                int i37 = k41Var.f;
                if (i36 <= i37) {
                    while (true) {
                        arrayList.add(Integer.valueOf(i36));
                        if (i36 == i37) {
                            break;
                        }
                        i36++;
                    }
                }
            } else {
                iG6 = iG6;
                arrayList = r9;
                r9 = arrayList;
            }
            float fFloatValue = (h23Var.J() || !z4) ? yd1Var.h : ((Number) yd1Var.x.b.f.getValue()).floatValue();
            int i38 = iC;
            kc1 kc1Var3 = yd1Var.o;
            boolean zJ = h23Var.J();
            CoroutineScope coroutineScope = pd1Var.g;
            ey1 ey1Var = yd1Var.w;
            gt2 gt2Var = pd1Var.h;
            boolean z6 = yd1Var.i;
            if (i23 < 0) {
                s21.a("invalid beforeContentPadding");
            }
            if (r5 < 0) {
                s21.a("invalid afterContentPadding");
            }
            vj0 vj0Var = vj0.e;
            if (i38 <= 0) {
                int iJ = l50.j(jI);
                int i39 = l50.i(jI);
                kc1Var3.b(iJ, i39, new ArrayList(), q01Var, od1Var, zJ, z4, 0, 0);
                if (zJ) {
                    iG2 = iJ;
                } else {
                    kc1Var3.a();
                    if (zB) {
                        iG2 = iJ;
                    } else {
                        iG2 = m50.g(0, jI);
                        i39 = m50.f(0, jI);
                    }
                }
                qd1Var = new qd1(null, 0, false, 0.0f, h23Var.H0(m50.g(iG2 + i19, j2), m50.f(i39 + iN3, j2), vj0Var, new zs0(17)), 0.0f, false, coroutineScope, pc1Var, od1Var.d, r9, -i23, i22 + r5, 0, z3 ? x32Var2 : x32Var, i21, iN4);
            } else {
                float f = fFloatValue;
                int i40 = iX;
                kc1 kc1Var4 = kc1Var3;
                od1 od1Var2 = od1Var;
                int i41 = i22;
                pc1 pc1Var5 = pc1Var;
                if (i40 >= i38) {
                    i40 = i38 - 1;
                    iG6 = 0;
                }
                int iRound = Math.round(f);
                int i42 = iG6 - iRound;
                if (i40 == 0 && i42 < 0) {
                    iRound += i42;
                    i42 = 0;
                }
                int i43 = i40;
                mo moVar2 = new mo();
                int i44 = -i23;
                int i45 = i44 + (iN4 < 0 ? iN4 : 0);
                vj0 vj0Var2 = vj0Var;
                int i46 = i42 + i45;
                int iMax2 = 0;
                while (true) {
                    j = od1Var2.d;
                    if (i46 >= 0 || i43 <= 0) {
                        break;
                    }
                    ey1 ey1Var2 = ey1Var;
                    int i47 = i43 - 1;
                    rd1 rd1VarA = od1Var2.a(i47, j);
                    moVar2.add(0, rd1VarA);
                    iMax2 = Math.max(iMax2, rd1VarA.o);
                    i46 += rd1VarA.n;
                    i43 = i47;
                    ey1Var = ey1Var2;
                }
                ey1 ey1Var3 = ey1Var;
                if (i46 < i45) {
                    iRound -= i45 - i46;
                    i46 = i45;
                }
                int i48 = iRound;
                int i49 = i46 - i45;
                int i50 = i41 + r5;
                int i51 = iMax2;
                int i52 = i50 < 0 ? 0 : i50;
                int i53 = i44;
                int i54 = -i49;
                int i55 = i49;
                int i56 = i43;
                int i57 = 0;
                boolean z7 = false;
                while (i57 < moVar2.g) {
                    if (i54 >= i52) {
                        moVar2.b(i57);
                        z7 = true;
                    } else {
                        i56++;
                        i54 += ((rd1) moVar2.get(i57)).n;
                        i57++;
                    }
                }
                int iMax3 = i51;
                int i58 = i56;
                while (i58 < i38 && (i54 < i52 || i54 <= 0 || moVar2.isEmpty())) {
                    int i59 = i38;
                    rd1 rd1VarA2 = od1Var2.a(i58, j);
                    int i60 = i52;
                    int i61 = rd1VarA2.n;
                    int i62 = i54 + i61;
                    if (i62 <= i45) {
                        i18 = i62;
                        if (i58 != i59 - 1) {
                            i55 -= i61;
                            i43 = i58 + 1;
                            z7 = true;
                        }
                        i58++;
                        i38 = i59;
                        i52 = i60;
                        i54 = i18;
                    } else {
                        i18 = i62;
                    }
                    int iMax4 = Math.max(iMax3, rd1VarA2.o);
                    moVar2.addLast(rd1VarA2);
                    iMax3 = iMax4;
                    i58++;
                    i38 = i59;
                    i52 = i60;
                    i54 = i18;
                }
                int i63 = i38;
                if (i54 < i41) {
                    int i64 = i41 - i54;
                    int i65 = i54 + i64;
                    int i66 = i55 - i64;
                    while (i66 < i23 && i43 > 0) {
                        int i67 = i43 - 1;
                        int i68 = i65;
                        rd1 rd1VarA3 = od1Var2.a(i67, j);
                        moVar2.add(0, rd1VarA3);
                        iMax3 = Math.max(iMax3, rd1VarA3.o);
                        i66 += rd1VarA3.n;
                        i43 = i67;
                        i65 = i68;
                    }
                    int i69 = i65;
                    int i70 = i66;
                    i = i64 + i48;
                    if (i70 < 0) {
                        i += i70;
                        i54 = i69 + i70;
                        i2 = i43;
                        i3 = 0;
                    } else {
                        i2 = i43;
                        i54 = i69;
                        i3 = i70;
                    }
                } else {
                    i = i48;
                    i2 = i43;
                    i3 = i55;
                }
                int i71 = iMax3;
                int i72 = i58;
                float f2 = (Integer.signum(Math.round(f)) != Integer.signum(i) || Math.abs(Math.round(f)) < Math.abs(i)) ? f : i;
                float f3 = f - f2;
                float f4 = 0.0f;
                if (zJ && i > i48 && f3 <= 0.0f) {
                    f4 = (i - i48) + f3;
                }
                float f5 = f4;
                if (i3 < 0) {
                    s21.a("negative currentFirstItemScrollOffset");
                }
                int i73 = -i3;
                String str2 = "ArrayDeque is empty.";
                if (moVar2.isEmpty()) {
                    b81.y("ArrayDeque is empty.");
                    return null;
                }
                int i74 = i3;
                rd1 rd1Var = (rd1) moVar2.f[moVar2.e];
                if (i23 > 0 || iN4 < 0) {
                    int iA = moVar2.a();
                    rd1 rd1Var2 = rd1Var;
                    int i75 = i74;
                    int i76 = 0;
                    while (true) {
                        if (i76 < iA) {
                            int i77 = iA;
                            int i78 = ((rd1) moVar2.get(i76)).n;
                            if (i75 != 0 && i78 <= i75) {
                                i4 = i75;
                                if (i76 == moVar2.a() - 1) {
                                    break;
                                }
                                i75 = i4 - i78;
                                i76++;
                                rd1Var2 = (rd1) moVar2.get(i76);
                                iA = i77;
                            }
                        }
                        i4 = i75;
                        break;
                    }
                    rd1Var = rd1Var2;
                    i5 = i4;
                } else {
                    i5 = i74;
                }
                int iMax5 = Math.max(0, i2);
                int i79 = i2 - 1;
                if (iMax5 <= i79) {
                    arrayList2 = null;
                    while (true) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        str = str2;
                        arrayList2.add(od1Var2.a(i79, j));
                        if (i79 == iMax5) {
                            break;
                        }
                        i79--;
                        str2 = str;
                    }
                } else {
                    str = "ArrayDeque is empty.";
                    arrayList2 = null;
                }
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i80 = size2 - 1;
                        int iIntValue = ((Number) arrayList.get(size2)).intValue();
                        if (iIntValue < iMax5) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(od1Var2.a(iIntValue, j));
                        }
                        if (i80 < 0) {
                            break;
                        }
                        size2 = i80;
                    }
                }
                ArrayList arrayList5 = arrayList2;
                ?? r10 = arrayList5;
                if (arrayList5 == null) {
                    r10 = r9;
                }
                int iMax6 = i71;
                int i81 = 0;
                for (int size3 = r10.size(); i81 < size3; size3 = size3) {
                    iMax6 = Math.max(iMax6, ((rd1) r10.get(i81)).o);
                    i81++;
                }
                int iMin = Math.min(((rd1) zy.t0(moVar2)).a, i63 - 1);
                int i82 = ((rd1) zy.t0(moVar2)).a + 1;
                if (i82 <= iMin) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        i6 = iMax6;
                        arrayList3 = arrayList6;
                        kc1Var = kc1Var4;
                        arrayList3.add(od1Var2.a(i82, j));
                        if (i82 == iMin) {
                            break;
                        }
                        i82++;
                        kc1Var4 = kc1Var;
                        arrayList6 = arrayList3;
                        iMax6 = i6;
                    }
                } else {
                    i6 = iMax6;
                    kc1Var = kc1Var4;
                    arrayList3 = null;
                }
                if (arrayList3 != null && ((rd1) zy.t0(arrayList3)).a > iMin) {
                    iMin = ((rd1) zy.t0(arrayList3)).a;
                }
                int size4 = arrayList.size();
                int i83 = 0;
                ?? r7 = arrayList;
                ?? arrayList7 = arrayList3;
                while (i83 < size4) {
                    ?? r58 = r7;
                    int iIntValue2 = ((Number) r7.get(i83)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList7 == 0) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(od1Var2.a(iIntValue2, j));
                    } else {
                        arrayList7 = arrayList7;
                    }
                    i83++;
                    r7 = r58;
                    arrayList7 = arrayList7;
                }
                if (arrayList7 == 0) {
                    arrayList7 = r9;
                }
                int size5 = arrayList7.size();
                int iMax7 = i6;
                for (int i84 = 0; i84 < size5; i84++) {
                    iMax7 = Math.max(iMax7, ((rd1) arrayList7.get(i84)).o);
                }
                if (moVar2.isEmpty()) {
                    b81.y(str);
                    return null;
                }
                boolean z8 = o51.f(rd1Var, moVar2.f[moVar2.e]) && r10.isEmpty() && arrayList7.isEmpty();
                int iG7 = m50.g(z3 ? iMax7 : i54, jI);
                if (z3) {
                    iMax7 = i54;
                }
                int iF = m50.f(iMax7, jI);
                if (!z3) {
                    iF = iG7;
                }
                rd1 rd1Var3 = rd1Var;
                boolean z9 = i54 < Math.min(iF, i41);
                if (z9 && i73 != 0) {
                    s21.c("non-zero itemsScrollOffset");
                }
                int i85 = i54;
                boolean z10 = z9;
                ArrayList arrayList8 = new ArrayList(arrayList7.size() + r10.size() + moVar2.a());
                if (z10) {
                    if (!r10.isEmpty() || !arrayList7.isEmpty()) {
                        s21.a("no extra items");
                    }
                    int iA2 = moVar2.a();
                    int[] iArr = new int[iA2];
                    int i86 = 0;
                    while (i86 < iA2) {
                        iArr[i86] = ((rd1) moVar2.get(i86)).m;
                        i86++;
                        iG7 = iG7;
                    }
                    i7 = iG7;
                    i8 = iF;
                    int[] iArr2 = new int[iA2];
                    if (z3) {
                        if (koVar == null) {
                            throw p91.h("null verticalArrangement when isVertical == true");
                        }
                        koVar.h(iF, pc1Var5, iArr, iArr2);
                        pc1Var2 = pc1Var5;
                    } else {
                        if (ioVar == null) {
                            throw p91.h("null horizontalArrangement when isVertical == false");
                        }
                        ioVar.g(pc1Var5, iF, iArr, qa1.e, iArr2);
                        pc1Var2 = pc1Var5;
                    }
                    k41 k41Var2 = new k41(0, iA2 - 1, 1);
                    int i87 = k41Var2.f;
                    int i88 = k41Var2.g;
                    if ((i88 > 0 && i87 >= 0) || (i88 < 0 && i87 <= 0)) {
                        int i89 = 0;
                        while (true) {
                            int i90 = iArr2[i89];
                            int[] iArr3 = iArr2;
                            rd1 rd1Var4 = (rd1) moVar2.get(i89);
                            rd1Var4.c(i90, i7, i8);
                            arrayList8.add(rd1Var4);
                            if (i89 == i87) {
                                break;
                            }
                            i89 += i88;
                            iArr2 = iArr3;
                        }
                    }
                } else {
                    i7 = iG7;
                    i41 = i41;
                    i72 = i72;
                    vj0Var2 = vj0Var2;
                    z8 = z8;
                    f5 = f5;
                    ld1Var3 = ld1Var3;
                    i8 = iF;
                    int size6 = r10.size();
                    int i91 = i73;
                    int i92 = 0;
                    while (i92 < size6) {
                        pc1Var2 = pc1Var5;
                        int i93 = size6;
                        rd1 rd1Var5 = (rd1) r10.get(i92);
                        i91 -= rd1Var5.n;
                        rd1Var5.c(i91, i7, i8);
                        arrayList8.add(rd1Var5);
                        i92++;
                        size6 = i93;
                    }
                    pc1Var2 = pc1Var5;
                    int iA3 = moVar2.a();
                    int i94 = i73;
                    for (int i95 = 0; i95 < iA3; i95++) {
                        rd1 rd1Var6 = (rd1) moVar2.get(i95);
                        rd1Var6.c(i94, i7, i8);
                        arrayList8.add(rd1Var6);
                        i94 += rd1Var6.n;
                    }
                    int size7 = arrayList7.size();
                    for (int i96 = 0; i96 < size7; i96++) {
                        rd1 rd1Var7 = (rd1) arrayList7.get(i96);
                        rd1Var7.c(i94, i7, i8);
                        arrayList8.add(rd1Var7);
                        i94 += rd1Var7.n;
                    }
                }
                if (z6) {
                    arrayList4 = arrayList8;
                    iG = i7;
                    kc1Var2 = kc1Var;
                    i9 = i85;
                } else {
                    int i97 = i7;
                    kc1 kc1Var5 = kc1Var;
                    kc1Var5.b(i97, i8, arrayList8, q01Var, od1Var2, zJ, z4, i5, i85);
                    kc1Var2 = kc1Var5;
                    iG = i97;
                    arrayList4 = arrayList8;
                    od1Var2 = od1Var2;
                    i9 = i85;
                }
                boolean z11 = zJ;
                if (!z11) {
                    kc1Var2.a();
                    if (!zB) {
                        int i98 = z3 ? i8 : iG;
                        iG = m50.g(Math.max(iG, 0), jI);
                        int iF2 = m50.f(Math.max(i8, 0), jI);
                        int i99 = z3 ? iF2 : iG;
                        if (i99 != i98) {
                            int size8 = arrayList4.size();
                            for (int i100 = 0; i100 < size8; i100++) {
                                ((rd1) arrayList4.get(i100)).q = i99;
                            }
                        }
                        i8 = iF2;
                    }
                }
                rd1 rd1Var8 = (rd1) (moVar2.isEmpty() ? null : moVar2.f[moVar2.e]);
                int i101 = rd1Var8 != null ? rd1Var8.a : 0;
                rd1 rd1Var9 = (rd1) moVar2.f();
                int i102 = rd1Var9 != null ? rd1Var9.a : 0;
                fx1 fx1Var2 = ld1Var3.b.b;
                if (fx1Var2 == null) {
                    fx1Var2 = e41.a;
                }
                if (gt2Var == null || arrayList4.isEmpty() || (i11 = fx1Var2.b) == 0) {
                    moVar = moVar2;
                    z = z11;
                    pc1Var3 = pc1Var2;
                    i10 = i53;
                    z2 = true;
                    r8 = r9;
                } else {
                    if (i102 - i101 < 0 || i11 == 0) {
                        pc1Var3 = pc1Var2;
                        fx1Var = e41.a;
                    } else {
                        k41 k41VarF0 = mh0.f0(0, i11);
                        int i103 = k41VarF0.e;
                        int i104 = k41VarF0.f;
                        pc1Var3 = pc1Var2;
                        if (i103 <= i104) {
                            int iC2 = -1;
                            while (fx1Var2.c(i103) <= i101) {
                                iC2 = fx1Var2.c(i103);
                                if (i103 == i104) {
                                    break;
                                }
                                i103++;
                            }
                            i17 = iC2;
                            i16 = -1;
                        } else {
                            i16 = -1;
                            i17 = -1;
                        }
                        if (i17 == i16) {
                            fx1Var = e41.a;
                        } else {
                            fx1 fx1Var3 = e41.a;
                            fx1Var = new fx1(1);
                            fx1Var.a(i17);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList(arrayList4.size());
                    int size9 = arrayList4.size();
                    int i105 = 0;
                    while (i105 < size9) {
                        int i106 = size9;
                        Object obj4 = arrayList4.get(i105);
                        int i107 = i105;
                        int i108 = ((rd1) obj4).a;
                        boolean z12 = z11;
                        int[] iArr4 = fx1Var2.a;
                        int i109 = fx1Var2.b;
                        fx1 fx1Var4 = fx1Var2;
                        int i110 = 0;
                        while (i110 < i109) {
                            int i111 = i109;
                            if (iArr4[i110] == i108) {
                                arrayList10.add(obj4);
                                break;
                            }
                            i110++;
                            i109 = i111;
                        }
                        i105 = i107 + 1;
                        size9 = i106;
                        fx1Var2 = fx1Var4;
                        z11 = z12;
                    }
                    z = z11;
                    int[] iArr5 = fx1Var.a;
                    int i112 = fx1Var.b;
                    int i113 = 0;
                    while (i113 < i112) {
                        int i114 = iArr5[i113];
                        int size10 = arrayList4.size();
                        int[] iArr6 = iArr5;
                        int i115 = 0;
                        int i116 = 0;
                        while (true) {
                            if (i115 >= size10) {
                                i12 = -1;
                                break;
                            }
                            Object obj5 = arrayList4.get(i115);
                            int i117 = i115 + 1;
                            if (((rd1) obj5).a == i114) {
                                i12 = i116;
                                break;
                            }
                            i116++;
                            i115 = i117;
                        }
                        long j4 = j;
                        rd1 rd1VarA4 = i12 == -1 ? od1Var2.a(i114, j) : (rd1) arrayList4.remove(i12);
                        int i118 = rd1VarA4.n;
                        if (i12 == -1) {
                            moVar2 = moVar2;
                            i13 = Integer.MIN_VALUE;
                        } else {
                            long jA = rd1VarA4.a(0);
                            i13 = (int) (rd1VarA4.c ? jA & 4294967295L : jA >> 32);
                        }
                        int size11 = arrayList10.size();
                        int i119 = 0;
                        while (true) {
                            if (i119 >= size11) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList10.get(i119);
                            int i120 = i119;
                            if (((rd1) obj3).a != i114) {
                                break;
                            }
                            i119 = i120 + 1;
                        }
                        rd1 rd1Var10 = (rd1) obj3;
                        if (rd1Var10 != null) {
                            long jA2 = rd1Var10.a(0);
                            i14 = (int) (rd1Var10.c ? jA2 & 4294967295L : jA2 >> 32);
                        } else {
                            moVar2 = moVar2;
                            i14 = Integer.MIN_VALUE;
                        }
                        if (i13 == Integer.MIN_VALUE) {
                            iMax = i53;
                            i15 = iMax;
                        } else {
                            i15 = i53;
                            iMax = Math.max(i15, i13);
                        }
                        if (i14 != Integer.MIN_VALUE) {
                            iMax = Math.min(iMax, i14 - i118);
                        }
                        rd1VarA4.p = true;
                        rd1VarA4.c(iMax, iG, i8);
                        arrayList9.add(rd1VarA4);
                        i113++;
                        moVar2 = moVar2;
                        i53 = i15;
                        iArr5 = iArr6;
                        j = j4;
                    }
                    moVar = moVar2;
                    i10 = i53;
                    z2 = true;
                    r8 = arrayList9;
                }
                if (z8) {
                    rd1 rd1Var11 = (rd1) zy.o0(arrayList4);
                    if (rd1Var11 != null) {
                        numValueOf = Integer.valueOf(rd1Var11.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    rd1 rd1Var12 = (rd1) (moVar.isEmpty() ? null : moVar.f[moVar.e]);
                    if (rd1Var12 != null) {
                        numValueOf = Integer.valueOf(rd1Var12.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z8) {
                    rd1 rd1Var13 = (rd1) zy.u0(arrayList4);
                    if (rd1Var13 != null) {
                        numValueOf2 = Integer.valueOf(rd1Var13.a);
                    }
                } else {
                    rd1 rd1Var14 = (rd1) moVar.f();
                    if (rd1Var14 != null) {
                        numValueOf2 = Integer.valueOf(rd1Var14.a);
                    }
                }
                boolean z13 = (i72 < i63 || i9 > i41) ? z2 : false;
                h23Var = h23Var;
                fr1 fr1VarH0 = h23Var.H0(m50.g(iG + i19, j2), m50.f(i8 + iN3, j2), vj0Var2, new ji1(ey1Var3, arrayList4, (List) r8, z));
                int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                if (arrayList4.isEmpty()) {
                    r17 = r9;
                } else {
                    ArrayList arrayList11 = new ArrayList((Collection) r8);
                    int size12 = arrayList4.size();
                    for (int i121 = 0; i121 < size12; i121++) {
                        rd1 rd1Var15 = (rd1) arrayList4.get(i121);
                        int i122 = rd1Var15.a;
                        if (iIntValue3 <= i122 && i122 <= iIntValue4) {
                            arrayList11.add(rd1Var15);
                        }
                    }
                    ez.Z(arrayList11, da0.K);
                    r17 = arrayList11;
                }
                qd1Var = new qd1(rd1Var3, i5, z13, f2, fr1VarH0, f5, z7, coroutineScope, pc1Var3, od1Var2.d, r17, i10, i50, i63, z3 ? x32Var2 : x32Var, r5, iN4);
            }
            yd1Var.g(qd1Var, h23Var.J(), false);
            return qd1Var;
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        av1 av1Var = av1.a;
        c30 c30Var = d30.a;
        int i2 = 2;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ey1 ey1Var = (ey1) obj4;
                ey1 ey1Var2 = (ey1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = ov0Var.Q();
                    if (objQ == c30Var) {
                        objQ = new s2(ey1Var, 0);
                        ov0Var.m0(objQ);
                    }
                    n51.j((au0) objQ, null, !xq1.p(ey1Var2), null, null, null, ks.z, ov0Var, 805306374, 506);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                String str = (String) obj3;
                ey1 ey1Var3 = (ey1) obj4;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var2, 0);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA);
                    q73.h(ov0Var2, v20.d, l72VarL);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH);
                    s83.b(ke0.N(str.equals("search") ? 2131624879 : 2131624871, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    String strW = xq1.w((String) ey1Var3.getValue(), ov0Var2);
                    if (strW == null) {
                        ov0Var2.c0(-1232427687);
                    } else {
                        ov0Var2.c0(-1232427686);
                        s83.b(strW, null, ((kz) ov0Var2.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262138);
                    }
                    ov0Var2.p(false);
                    ov0Var2.p(true);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                Context context = (Context) obj3;
                ey1 ey1Var4 = (ey1) obj4;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zH = ov0Var3.h(context);
                    Object objQ2 = ov0Var3.Q();
                    if (zH || objQ2 == c30Var) {
                        objQ2 = new m5(0, context, ey1Var4);
                        ov0Var3.m0(objQ2);
                    }
                    n51.j((au0) objQ2, null, false, null, null, null, o51.E, ov0Var3, 805306368, 510);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 3:
                ((Integer) obj2).getClass();
                ji2.o((dv1) obj4, (lu0) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 4:
                b52 b52Var = (b52) obj4;
                p10 p10Var = (p10) obj3;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dv1 dv1VarC = zm3.C(av1Var, b52Var);
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var4, 0);
                    int iHashCode2 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL2 = ov0Var4.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var4, dv1VarC);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var2);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, v20.e, yzVarA2);
                    q73.h(ov0Var4, v20.d, l72VarL2);
                    q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var4, v20.g);
                    q73.h(ov0Var4, v20.c, dv1VarH2);
                    p10Var.invoke(zz.a, ov0Var4, 6);
                    ov0Var4.p(true);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                am1.Q((ul1) obj4, ((CollectionRouteRecord) obj3).getId(), str2, str3, true, new oi1(5));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                ((l60) obj4).a((k60) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                yi2 yi2Var = (yi2) obj;
                long jLongValue = ((Long) obj2).longValue();
                yi2Var.getClass();
                return new d31(18, new File(dh0.i((kn2) obj4).getNoBackupFilesDir(), "root-background-" + yi2Var.b + "-" + yi2Var.d + "-" + jLongValue + ".lease"), new lg(i2, jLongValue, (RuntimeAuthorizationManager) obj3));
            case 8:
                Context context2 = (Context) obj4;
                Configuration configuration = (Configuration) obj3;
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k22.c(new kk[]{AndroidCompositionLocals_androidKt.b.a(context2), AndroidCompositionLocals_androidKt.a.a(configuration)}, am1.o, ov0Var5, 56);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                j90 j90Var = (j90) obj4;
                ca2 ca2Var = (ca2) obj3;
                x92 x92Var = (x92) obj;
                c12 c12Var = (c12) obj2;
                x92Var.getClass();
                long j = x92Var.c;
                long j2 = x92Var.g;
                xc xcVar = j90Var.c;
                boolean zBooleanValue = ((Boolean) xcVar.invoke(new c12(j))).booleanValue();
                boolean zBooleanValue2 = ((Boolean) xcVar.invoke(new c12(j2))).booleanValue();
                if (zBooleanValue && zBooleanValue2) {
                    j90Var.f.invoke(j90Var, new p41(((q33) ca2Var).B), c12Var);
                }
                return mf3Var;
            case mc0.c /* 10 */:
                ((Integer) obj2).getClass();
                ((ba0) obj4).a((mn2) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 11:
                ((Integer) obj2).getClass();
                ((za0) obj4).a((xv2) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case mc0.d /* 12 */:
                y53 y53Var = (y53) obj4;
                k63 k63Var = (k63) obj3;
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zF = ov0Var6.f(y53Var);
                    Object objQ3 = ov0Var6.Q();
                    if (zF || objQ3 == c30Var) {
                        objQ3 = by2.b(new t4(0, y53Var, y53.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 19));
                        ov0Var6.m0(objQ3);
                    }
                    eb0.a(k63Var, (x53) ((s03) objQ3).getValue(), ov0Var6, 0);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case 13:
                ((Integer) obj2).getClass();
                eb0.a((k63) obj4, (x53) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 14:
                lj ljVar = (lj) obj4;
                kx2 kx2Var = (kx2) obj3;
                int iIntValue7 = ((Integer) obj).intValue();
                if (obj2 instanceof k20) {
                    ((gy1) ljVar.g).b((k20) obj2);
                } else if (!(obj2 instanceof zg2)) {
                    if (obj2 instanceof sv0) {
                        o51.y(kx2Var, iIntValue7, obj2);
                        ljVar.f((sv0) obj2);
                    } else if (obj2 instanceof ee2) {
                        o51.y(kx2Var, iIntValue7, obj2);
                        ((ee2) obj2).c();
                    }
                }
                return mf3Var;
            case a83.e /* 15 */:
                mc1 mc1Var = (mc1) obj4;
                lc1 lc1Var = (lc1) obj3;
                Object obj5 = lc1Var.a;
                f30 f30Var7 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (ov0Var7.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ld1 ld1Var = (ld1) mc1Var.b.invoke();
                    int iE = lc1Var.c;
                    if ((iE >= ld1Var.c() || !ld1Var.d(iE).equals(obj5)) && (iE = ld1Var.d.e(obj5)) != -1) {
                        lc1Var.c = iE;
                    }
                    if (iE != -1) {
                        ov0Var7.c0(-1664741271);
                        dh0.e(ld1Var, mc1Var.a, iE, obj5, ov0Var7, 0);
                        ov0Var7.p(false);
                    } else {
                        ov0Var7.c0(-1664505826);
                        ov0Var7.p(false);
                    }
                    boolean zH2 = ov0Var7.h(lc1Var);
                    Object objQ4 = ov0Var7.Q();
                    if (zH2 || objQ4 == c30Var) {
                        objQ4 = new t(lc1Var, 21);
                        ov0Var7.m0(objQ4);
                    }
                    oi0.a(obj5, (lu0) objQ4, ov0Var7);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case 16:
                return f(obj, obj2);
            case 17:
                p10 p10Var2 = (p10) obj4;
                be1 be1Var = (be1) obj3;
                f30 f30Var8 = (f30) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (ov0Var8.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p10Var2.invoke(be1Var, ov0Var8, 0);
                } else {
                    ov0Var8.W();
                }
                return mf3Var;
            case 18:
                ((Integer) obj2).getClass();
                wc0.c((String) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 19:
                List list = (List) obj4;
                ul1 ul1Var = (ul1) obj3;
                f30 f30Var9 = (f30) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (!ov0Var9.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ov0Var9.W();
                    return mf3Var;
                }
                dv1 dv1VarE = zm3.E(av1Var, 14.0f, 8.0f);
                kk2 kk2VarA = jk2.a(new jo(10.0f, true, new fo(0)), j9.p, ov0Var9, 54);
                int iHashCode3 = Long.hashCode(ov0Var9.T);
                l72 l72VarL3 = ov0Var9.l();
                dv1 dv1VarH3 = xp1.H(ov0Var9, dv1VarE);
                w20.b.getClass();
                x30 x30Var3 = v20.b;
                ov0Var9.g0();
                if (ov0Var9.S) {
                    ov0Var9.k(x30Var3);
                } else {
                    ov0Var9.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var9, ghVar, kk2VarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var9, ghVar2, l72VarL3);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                gh ghVar3 = v20.f;
                q73.h(ov0Var9, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var9, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var9, ghVar4, dv1VarH3);
                dv1 dv1VarN = xp1.n(iw2.k(av1Var, 28.0f), cj2.a);
                long j3 = bk.g;
                dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j3), o51.p0);
                er1 er1VarC = ws.c(j9.j, false);
                int iHashCode4 = Long.hashCode(ov0Var9.T);
                l72 l72VarL4 = ov0Var9.l();
                dv1 dv1VarH4 = xp1.H(ov0Var9, dv1VarK);
                ov0Var9.g0();
                if (ov0Var9.S) {
                    ov0Var9.k(x30Var3);
                } else {
                    ov0Var9.p0();
                }
                q73.h(ov0Var9, ghVar, er1VarC);
                q73.h(ov0Var9, ghVar2, l72VarL4);
                az2.s(iHashCode4, ov0Var9, ghVar3, ov0Var9, waVar);
                q73.h(ov0Var9, ghVar4, dv1VarH4);
                s83.b(String.valueOf(list.size()), null, j3, v63.c(13), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 1597824, 0, 262058);
                ov0Var9.p(true);
                String strO = ke0.O(2131624976, new Object[]{Integer.valueOf(list.size())}, ov0Var9);
                long jB = v63.b(13.5d);
                jr0 jr0Var = jr0.h;
                hh0 hh0Var = mz.a;
                s83.b(strO, null, ((kz) ov0Var9.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 1597440, 0, 262058);
                ld0.h(iw2.g(av1Var, 18.0f), 0.0f, hz.c(0.15f, ((kz) ov0Var9.j(hh0Var)).A), ov0Var9, 6);
                boolean zH3 = ov0Var9.h(ul1Var);
                Object objQ5 = ov0Var9.Q();
                if (zH3 || objQ5 == c30Var) {
                    objQ5 = new m6(ul1Var, 17);
                    ov0Var9.m0(objQ5);
                }
                xq1.l((au0) objQ5, iw2.k(av1Var, 28.0f), false, null, null, o51.b0, ov0Var9, 1572912, 60);
                boolean zH4 = ov0Var9.h(ul1Var);
                Object objQ6 = ov0Var9.Q();
                if (zH4 || objQ6 == c30Var) {
                    objQ6 = new m6(ul1Var, 18);
                    ov0Var9.m0(objQ6);
                }
                xq1.l((au0) objQ6, iw2.k(av1Var, 28.0f), false, null, null, o51.c0, ov0Var9, 1572912, 60);
                ov0Var9.p(true);
                return mf3Var;
            case 20:
                ul1 ul1Var2 = (ul1) obj4;
                AppState appState = (AppState) obj3;
                f30 f30Var10 = (f30) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (ov0Var10.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    sj2.f(ul1Var2, appState, false, ov0Var10, 0);
                } else {
                    ov0Var10.W();
                }
                return mf3Var;
            case 21:
                te2 te2Var = (te2) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = te2Var.e;
                te2Var.e = ((ao2) obj3).a(fFloatValue - f) + f;
                return mf3Var;
            case 22:
                RadioSharingManager radioSharingManager = (RadioSharingManager) obj3;
                ey1 ey1Var5 = (ey1) obj4;
                f30 f30Var11 = (f30) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ov0 ov0Var11 = (ov0) f30Var11;
                if (ov0Var11.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zH5 = ov0Var11.h(radioSharingManager);
                    Object objQ7 = ov0Var11.Q();
                    if (zH5 || objQ7 == c30Var) {
                        objQ7 = new qi2(10, radioSharingManager, ey1Var5);
                        ov0Var11.m0(objQ7);
                    }
                    b52 b52Var2 = hu.a;
                    n51.j((au0) objQ7, null, false, null, hu.f(bk.g, ov0Var11), null, ym3.m, ov0Var11, 805306368, 494);
                } else {
                    ov0Var11.W();
                }
                return mf3Var;
            case 23:
                ((Integer) obj2).getClass();
                ((u92) obj4).i((Drawable) obj3, (f30) obj, wc0.m0(49));
                return mf3Var;
            default:
                x73 x73Var = (x73) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                v53 v53Var = (v53) obj;
                Context context3 = (Context) obj2;
                boolean zH6 = x73Var.h();
                dj djVarK = x73Var.k();
                f93 f93Var = null;
                String str4 = djVarK != null ? djVarK.f : null;
                f93 f93Var2 = x73Var.w;
                if (f93Var2 != null) {
                    long j4 = f93Var2.a;
                    e12 e12Var = x73Var.b;
                    f93Var = new f93(g93.a(e12Var.r((int) (j4 >> 32)), e12Var.r((int) (j4 & 4294967295L))));
                }
                e92.a(v53Var, context3, zH6, str4, f93Var, x73Var.j, new ji1(x73Var, coroutineScope, context3, 22));
                return mf3Var;
        }
    }

    public /* synthetic */ j2(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ j2(Object obj, ey1 ey1Var, int i) {
        this.e = i;
        this.g = obj;
        this.f = ey1Var;
    }
}
