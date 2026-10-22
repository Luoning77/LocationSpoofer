package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class f9 implements lu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f9(int i, CoroutineScope coroutineScope, t52 t52Var, oh ohVar) {
        this.f = i;
        this.g = coroutineScope;
        this.h = t52Var;
        this.i = ohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        float f = 8.0f;
        qa1 qa1Var = qa1.e;
        boolean z = true;
        Object[] objArr = 0;
        int i2 = 0;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.i;
        int i3 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                gr1 gr1Var = (gr1) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                g82 g82Var = (g82) obj;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    List list = (List) arrayList.get(i4);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i5 = i2;
                    while (i5 < size2) {
                        boolean z2 = z;
                        iArr[i5] = ((h82) list.get(i5)).e + (i5 < list.size() + (-1) ? gr1Var.n0(f) : 0);
                        i5++;
                        z = z2;
                    }
                    boolean z3 = z;
                    int[] iArr2 = new int[size2];
                    if (gr1Var.getLayoutDirection() == qa1Var) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < size2; i7++) {
                            i6 += iArr[i7];
                        }
                        int i8 = i3 - i6;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size2) {
                            int i11 = iArr[i9];
                            iArr2[i10] = i8;
                            i8 += i11;
                            i9++;
                            i10++;
                        }
                    } else {
                        int i12 = 0;
                        for (int i13 = size2 - 1; -1 < i13; i13--) {
                            int i14 = iArr[i13];
                            iArr2[i13] = i12;
                            i12 += i14;
                        }
                    }
                    int size3 = list.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        g82.z(g82Var, (h82) list.get(i15), iArr2[i15], ((Number) arrayList2.get(i4)).intValue());
                    }
                    i4++;
                    z = z3;
                    f = 8.0f;
                    i2 = 0;
                }
                return mf3Var;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                t52 t52Var = (t52) obj3;
                oh ohVar = (oh) obj2;
                j90 j90Var = (j90) obj;
                j90Var.getClass();
                int iRound = Math.round(((Number) j90Var.l.e.getValue()).floatValue());
                int i16 = i3 - 1;
                if (iRound < 0) {
                    iRound = 0;
                }
                if (iRound <= i16) {
                    i16 = iRound;
                }
                t52Var.h(i16);
                BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new e90(j90Var, i16, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new md(ohVar, objArr == true ? 1 : 0, i2), 3, null);
                return mf3Var;
            case 2:
                s52 s52Var = (s52) obj3;
                s52 s52Var2 = (s52) obj2;
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                s52Var.h((int) (pa1Var.f0() >> 32));
                float fG = (s52Var.g() - ((xb0) obj4).R(8.0f)) / i3;
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
                s52Var2.h(fG);
                return mf3Var;
            case 3:
                m41 m41Var = (m41) obj3;
                ox1 ox1Var = (ox1) obj2;
                if (obj == ((fc0) obj4)) {
                    fo.n("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof x03) {
                    int i17 = m41Var.a - i3;
                    int iD = ox1Var.d(obj);
                    ox1Var.g(Math.min(i17, iD >= 0 ? ox1Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                return mf3Var;
            case 4:
                hy0 hy0Var = (hy0) obj4;
                gr1 gr1Var2 = (gr1) obj2;
                h82 h82Var = (h82) obj3;
                g82 g82Var2 = (g82) obj;
                int i18 = hy0Var.b;
                r73 r73Var = hy0Var.a;
                bc3 bc3Var = hy0Var.c;
                y83 y83Var = (y83) hy0Var.d.invoke();
                r73Var.a(x32.f, q73.d(g82Var2, i18, bc3Var, y83Var != null ? y83Var.a : null, gr1Var2.getLayoutDirection() == qa1.f, h82Var.e), i3, h82Var.e);
                g82.B(g82Var2, h82Var, Math.round(-r73Var.a.g()), 0);
                return mf3Var;
            default:
                h82[] h82VarArr = (h82[]) obj4;
                kk2 kk2Var = (kk2) obj3;
                int[] iArr3 = (int[]) obj2;
                g82 g82Var3 = (g82) obj;
                int length = h82VarArr.length;
                int i19 = 0;
                while (i2 < length) {
                    h82 h82Var2 = h82VarArr[i2];
                    int i20 = i19 + 1;
                    h82Var2.getClass();
                    Object objA = h82Var2.A();
                    ik2 ik2Var = objA instanceof ik2 ? (ik2) objA : null;
                    d80 d80Var = ik2Var != null ? ik2Var.c : null;
                    g82.z(g82Var3, h82Var2, iArr3[i19], d80Var != null ? d80Var.a.a(h82Var2.f, i3, qa1Var) : kk2Var.b.a(h82Var2.f, i3));
                    i2++;
                    i19 = i20;
                }
                return mf3Var;
        }
    }

    public /* synthetic */ f9(xb0 xb0Var, int i, s52 s52Var, s52 s52Var2) {
        this.g = xb0Var;
        this.f = i;
        this.h = s52Var;
        this.i = s52Var2;
    }

    public /* synthetic */ f9(fc0 fc0Var, m41 m41Var, ox1 ox1Var, int i) {
        this.g = fc0Var;
        this.h = m41Var;
        this.i = ox1Var;
        this.f = i;
    }

    public /* synthetic */ f9(hy0 hy0Var, gr1 gr1Var, h82 h82Var, int i) {
        this.g = hy0Var;
        this.i = gr1Var;
        this.h = h82Var;
        this.f = i;
    }

    public /* synthetic */ f9(ArrayList arrayList, gr1 gr1Var, int i, ArrayList arrayList2) {
        this.g = arrayList;
        this.i = gr1Var;
        this.f = i;
        this.h = arrayList2;
    }

    public /* synthetic */ f9(h82[] h82VarArr, kk2 kk2Var, int i, int[] iArr) {
        this.g = h82VarArr;
        this.h = kk2Var;
        this.f = i;
        this.i = iArr;
    }
}
