package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gh extends aa1 implements pu0 {
    public static final gh A;
    public static final gh B;
    public static final gh C;
    public static final gh D;
    public static final gh E;
    public static final gh F;
    public static final gh G;
    public static final gh H;
    public static final gh I;
    public static final gh J;
    public static final gh g;
    public static final gh h;
    public static final gh i;
    public static final gh j;
    public static final gh k;
    public static final gh l;
    public static final gh m;
    public static final gh n;
    public static final gh o;
    public static final gh p;
    public static final gh q;
    public static final gh r;
    public static final gh s;
    public static final gh t;
    public static final gh u;
    public static final gh v;
    public static final gh w;
    public static final gh x;
    public static final gh y;
    public static final gh z;
    public final /* synthetic */ int f;

    static {
        int i2 = 2;
        g = new gh(i2, 0);
        h = new gh(i2, 1);
        i = new gh(i2, 2);
        j = new gh(i2, 3);
        k = new gh(i2, 4);
        l = new gh(i2, 5);
        m = new gh(i2, 6);
        n = new gh(i2, 7);
        o = new gh(i2, 8);
        p = new gh(i2, 9);
        q = new gh(i2, 10);
        r = new gh(i2, 11);
        s = new gh(i2, 12);
        t = new gh(i2, 13);
        u = new gh(i2, 14);
        v = new gh(i2, 15);
        w = new gh(i2, 16);
        x = new gh(i2, 17);
        y = new gh(i2, 18);
        z = new gh(i2, 19);
        A = new gh(i2, 20);
        B = new gh(i2, 21);
        C = new gh(i2, 22);
        D = new gh(i2, 23);
        E = new gh(i2, 24);
        F = new gh(i2, 25);
        G = new gh(i2, 26);
        H = new gh(i2, 27);
        I = new gh(i2, 28);
        J = new gh(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [gy1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [gy1] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38, types: [cv1] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [cv1] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f;
        int i3 = 0;
        z = false;
        boolean z2 = false;
        mf3 mf3Var = mf3.a;
        switch (i2) {
            case 0:
                xq1.O((hb1) obj).setUpdateBlock((lu0) obj2);
                return mf3Var;
            case 1:
                xq1.O((hb1) obj).setReleaseBlock((lu0) obj2);
                return mf3Var;
            case 2:
                xq1.O((hb1) obj).setModifier((dv1) obj2);
                return mf3Var;
            case 3:
                xq1.O((hb1) obj).setDensity((xb0) obj2);
                return mf3Var;
            case 4:
                xq1.O((hb1) obj).setLifecycleOwner((df1) obj2);
                return mf3Var;
            case Logger.WARN /* 5 */:
                xq1.O((hb1) obj).setSavedStateRegistryOwner((tm2) obj2);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                bj3 bj3VarO = xq1.O((hb1) obj);
                int iOrdinal = ((qa1) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        b81.d();
                        return null;
                    }
                    i3 = 1;
                }
                bj3VarO.setLayoutDirection(i3);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                long j2 = ((p41) obj).a;
                long j3 = ((p41) obj2).a;
                pe2 pe2Var = zj3.a;
                return o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
            case 8:
                ck0 ck0Var = (ck0) obj2;
                if (((ck0) obj) == ck0Var && ck0Var == ck0.g) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case mc0.b /* 9 */:
                String str = (String) obj;
                bv1 bv1Var = (bv1) obj2;
                if (str.length() == 0) {
                    return bv1Var.toString();
                }
                return str + ", " + bv1Var;
            case mc0.c /* 10 */:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                }
                return mf3Var;
            case 11:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                }
                return mf3Var;
            case 13:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                }
                return mf3Var;
            case 14:
                ((Number) obj2).intValue();
                ((hb1) ((w20) obj)).getClass();
                return mf3Var;
            case a83.e /* 15 */:
                ((hb1) ((w20) obj)).c0((er1) obj2);
                return mf3Var;
            case 16:
                ((hb1) ((w20) obj)).d0((dv1) obj2);
                return mf3Var;
            case 17:
                w30 w30Var = (w30) obj2;
                hb1 hb1Var = (hb1) ((w20) obj);
                hb1Var.G = w30Var;
                tz1 tz1Var = hb1Var.K;
                hh0 hh0Var = z30.h;
                l72 l72Var = (l72) w30Var;
                l72Var.getClass();
                hb1Var.Z((xb0) ji2.P(l72Var, hh0Var));
                l72 l72Var2 = (l72) w30Var;
                qa1 qa1Var = (qa1) ji2.P(l72Var2, z30.n);
                if (hb1Var.E != qa1Var) {
                    hb1Var.E = qa1Var;
                    hb1Var.D();
                    hb1 hb1VarU = hb1Var.u();
                    if (hb1VarU != null) {
                        hb1VarU.B();
                    } else {
                        t42 t42Var = hb1Var.s;
                        if (t42Var != null) {
                            ((db) t42Var).invalidate();
                        }
                    }
                    hb1Var.C();
                    for (cv1 cv1Var = tz1Var.f; cv1Var != null; cv1Var = cv1Var.j) {
                        cv1Var.W0();
                    }
                }
                hb1Var.e0((aj3) ji2.P(l72Var2, z30.u));
                cv1 cv1Var2 = tz1Var.f;
                if ((cv1Var2.h & 32768) != 0) {
                    while (cv1Var2 != null) {
                        if ((cv1Var2.g & 32768) != 0) {
                            ?? J2 = cv1Var2;
                            ?? gy1Var = 0;
                            while (J2 != 0) {
                                if (J2 instanceof u30) {
                                    cv1 cv1Var3 = ((cv1) ((u30) J2)).e;
                                    if (cv1Var3.r) {
                                        yz1.c(cv1Var3);
                                    } else {
                                        cv1Var3.n = true;
                                    }
                                } else if ((J2.g & 32768) != 0 && (J2 instanceof lb0)) {
                                    cv1 cv1Var4 = ((lb0) J2).t;
                                    int i4 = 0;
                                    while (cv1Var4 != null) {
                                        if ((cv1Var4.g & 32768) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                gy1Var = gy1Var;
                                                J2 = J2;
                                                gy1Var = gy1Var;
                                                J2 = cv1Var4;
                                            } else {
                                                if (gy1Var == 0) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (J2 != 0) {
                                                    gy1Var.b(J2);
                                                    J2 = 0;
                                                }
                                                gy1Var.b(cv1Var4);
                                            }
                                        } else {
                                            gy1Var = gy1Var;
                                            J2 = J2;
                                        }
                                        cv1Var4 = cv1Var4.j;
                                        gy1Var = gy1Var;
                                        J2 = J2;
                                    }
                                    if (i4 == 1) {
                                        gy1Var = gy1Var;
                                        J2 = J2;
                                    } else {
                                        gy1Var = gy1Var;
                                        J2 = J2;
                                    }
                                }
                                J2 = xp1.J(gy1Var);
                            }
                        }
                        if ((cv1Var2.h & 32768) != 0) {
                            cv1Var2 = cv1Var2.j;
                        }
                    }
                }
                return mf3Var;
            case 18:
                ((kk1) obj2).getClass();
                return mf3Var;
            case 19:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = uj0.e;
                }
                return zy.x0(collection, list);
            case 20:
                return (zb) obj;
            case 21:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 22:
                return (i60) obj;
            case 23:
                return (tc) obj;
            case 24:
                return (mf3) obj;
            case 25:
                return (mf3) obj;
            case 26:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 27:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 28:
                return (mf3) obj;
            default:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }
}
