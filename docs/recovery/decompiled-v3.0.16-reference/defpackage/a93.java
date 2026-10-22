package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a93 {
    public final w52 a = ke0.H(null);
    public dj b;
    public final fy2 c;

    public a93(dj djVar) {
        i73 i73Var = new i73(7);
        djVar.getClass();
        bj bjVar = new bj(djVar);
        ArrayList arrayList = bjVar.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) i73Var.invoke(((aj) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cj cjVar = (cj) list.get(i2);
                arrayList3.add(new aj(cjVar.b, cjVar.c, cjVar.a, cjVar.d));
            }
            fz.b0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = bjVar.g();
        this.c = new fy2();
    }

    public static cj c(cj cjVar, x83 x83Var) {
        sw1 sw1Var = x83Var.b;
        int iC = sw1Var.c(sw1Var.f - 1, false);
        if (cjVar.b < iC) {
            return cj.a(cjVar, null, Math.min(cjVar.c, iC), 11);
        }
        return null;
    }

    public final void a(int i, f30 f30Var) {
        Object obj;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1154651354);
        char c = 2;
        int i2 = (ov0Var.h(this) ? 4 : 2) | i;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            tg tgVar = (tg) ov0Var.j(z30.t);
            dj djVar = this.b;
            List listA = djVar.a(djVar.f.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                cj cjVar = (cj) listA.get(i3);
                int i4 = cjVar.b;
                Object obj2 = cjVar.a;
                if (i4 != cjVar.c) {
                    ov0Var.c0(725478935);
                    Object objQ = ov0Var.Q();
                    c30 c30Var = d30.a;
                    if (objQ == c30Var) {
                        obj = objQ;
                        ix1 ix1Var = new ix1();
                        ov0Var.m0(ix1Var);
                        obj = ix1Var;
                    }
                    obj = objQ;
                    ix1 ix1Var2 = (ix1) obj;
                    dv1 dv1VarZ = am1.z(av1.a, new jl1(28, this, cjVar));
                    Object objQ2 = ov0Var.Q();
                    Object obj3 = objQ2;
                    if (objQ2 == c30Var) {
                        i73 i73Var = new i73(8);
                        ov0Var.m0(i73Var);
                        obj3 = i73Var;
                    }
                    dv1 dv1VarA = xp1.A(gs2.a(dv1VarZ, false, (lu0) obj3).d(new h93(new kb2(this, cjVar))), ix1Var2, true);
                    v92.a.getClass();
                    dv1 dv1VarC = mc0.C(dv1VarA, ji2.t);
                    boolean zH = ov0Var.h(this) | ov0Var.f(cjVar) | ov0Var.h(tgVar);
                    Object objQ3 = ov0Var.Q();
                    Object obj4 = objQ3;
                    if (zH || objQ3 == c30Var) {
                        qi2 qi2Var = new qi2(this, cjVar, tgVar);
                        ov0Var.m0(qi2Var);
                        obj4 = qi2Var;
                    }
                    ws.a(zm3.n(dv1VarC, ix1Var2, (au0) obj4), ov0Var, 0);
                    bg1 bg1Var = (bg1) obj2;
                    b93 b93VarA = bg1Var.a();
                    if (b93VarA == null || (b93VarA.a == null && b93VarA.b == null && b93VarA.c == null && b93VarA.d == null)) {
                        ov0Var.c0(728331710);
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(726303039);
                        Object objQ4 = ov0Var.Q();
                        Object obj5 = objQ4;
                        if (objQ4 == c30Var) {
                            cg1 cg1Var = new cg1(ix1Var2);
                            ov0Var.m0(cg1Var);
                            obj5 = cg1Var;
                        }
                        cg1 cg1Var2 = (cg1) obj5;
                        Object objQ5 = ov0Var.Q();
                        boolean z = false;
                        Object obj6 = objQ5;
                        if (objQ5 == c30Var) {
                            d6 d6Var = new d6((Object) cg1Var2, (q60) (z ? 1 : 0), 24);
                            ov0Var.m0(d6Var);
                            obj6 = d6Var;
                        }
                        oi0.e(ov0Var, (pu0) obj6, mf3.a);
                        t52 t52Var = cg1Var2.b;
                        t52 t52Var2 = cg1Var2.b;
                        Boolean boolValueOf = Boolean.valueOf((t52Var.g() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((t52Var2.g() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((t52Var2.g() & 4) != 0);
                        b93 b93VarA2 = bg1Var.a();
                        uy2 uy2Var = b93VarA2 != null ? b93VarA2.a : null;
                        b93 b93VarA3 = bg1Var.a();
                        uy2 uy2Var2 = b93VarA3 != null ? b93VarA3.b : null;
                        b93 b93VarA4 = bg1Var.a();
                        uy2 uy2Var3 = b93VarA4 != null ? b93VarA4.c : null;
                        b93 b93VarA5 = bg1Var.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, uy2Var, uy2Var2, uy2Var3, b93VarA5 != null ? b93VarA5.d : null};
                        boolean zH2 = ov0Var.h(this) | ov0Var.f(cjVar);
                        Object objQ6 = ov0Var.Q();
                        Object obj7 = objQ6;
                        if (zH2 || objQ6 == c30Var) {
                            jl1 jl1Var = new jl1(this, cjVar, cg1Var2, 27);
                            ov0Var.m0(jl1Var);
                            obj7 = jl1Var;
                        }
                        b(objArr, (lu0) obj7, ov0Var, (i2 << 6) & 896);
                        ov0Var.p(false);
                    }
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(728345598);
                    ov0Var.p(false);
                }
                i3++;
                c = c;
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new iy2(this, i);
        }
    }

    public final void b(Object[] objArr, lu0 lu0Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2083052099);
        int i2 = (i & 48) == 0 ? (ov0Var.h(lu0Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(this) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        ov0Var.a0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (ov0Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= ov0Var.h(obj) ? 4 : 0;
        }
        ov0Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(lu0Var);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = ov0Var.h(this) | ((i3 & 112) == 32);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                objQ = new ar(this, lu0Var, i4);
                ov0Var.m0(objQ);
            }
            oi0.d(array, (lu0) objQ, ov0Var);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(this, objArr, lu0Var, i, 12);
        }
    }
}
