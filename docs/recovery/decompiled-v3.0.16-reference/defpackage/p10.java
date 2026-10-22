package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p10 implements pu0, qu0, ru0, su0, tu0, uu0, vu0, wu0, bu0, cu0, eu0, fu0, gu0, hu0, iu0, ju0, ku0, mu0, nu0 {
    public final int e;
    public final boolean f;
    public Object g;
    public ee2 h;
    public ArrayList i;

    public p10(Object obj, boolean z, int i) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }

    @Override // defpackage.uu0
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return k(obj, obj2, obj3, obj4, obj5, (f30) obj6, ((Number) serializable).intValue());
    }

    @Override // defpackage.su0
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(obj, obj2, obj3, (f30) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.tu0
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        return j(obj, obj2, obj3, obj4, (f30) obj5, ((Number) serializable).intValue());
    }

    @Override // defpackage.vu0
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, (f30) obj7, ((Number) obj8).intValue());
    }

    @Override // defpackage.iu0
    public final /* bridge */ /* synthetic */ Object e(String str, Object obj, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l, Integer num9, Integer num10, Integer num11, Object obj2, Object obj3, Object obj4) {
        return m(str, obj, num, num2, num3, num4, num5, num6, num7, num8, l, num9, num10, num11, (f30) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue());
    }

    public final Object f(int i, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = i | (ov0Var.f(this) ? sb.I(2, 0) : sb.I(1, 0));
        Object obj = this.g;
        obj.getClass();
        da0.o(2, obj);
        Object objInvoke = ((pu0) obj).invoke(ov0Var, Integer.valueOf(I));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new o10(2, this, p10.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object g(Object obj, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int i2 = 1;
        int I = ov0Var.f(this) ? sb.I(2, 1) : sb.I(1, 1);
        Object obj2 = this.g;
        obj2.getClass();
        da0.o(3, obj2);
        Object objInvoke = ((qu0) obj2).invoke(obj, ov0Var, Integer.valueOf(I | i));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj(i, i2, this, obj);
        }
        return objInvoke;
    }

    public final Object h(Object obj, Object obj2, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = ov0Var.f(this) ? sb.I(2, 2) : sb.I(1, 2);
        Object obj3 = this.g;
        obj3.getClass();
        da0.o(4, obj3);
        Object objInvoke = ((ru0) obj3).invoke(obj, obj2, ov0Var, Integer.valueOf(I | i));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(this, obj, obj2, i);
        }
        return objInvoke;
    }

    public final Object i(Object obj, Object obj2, Object obj3, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = ov0Var.f(this) ? sb.I(2, 3) : sb.I(1, 3);
        Object obj4 = this.g;
        obj4.getClass();
        da0.o(5, obj4);
        Object objB = ((su0) obj4).b(obj, obj2, obj3, ov0Var, Integer.valueOf(I | i));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(this, obj, obj2, obj3, i);
        }
        return objB;
    }

    @Override // defpackage.pu0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return f(((Number) obj2).intValue(), (f30) obj);
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = ov0Var.f(this) ? sb.I(2, 4) : sb.I(1, 4);
        Object obj5 = this.g;
        obj5.getClass();
        da0.o(6, obj5);
        Object objC = ((tu0) obj5).c(obj, obj2, obj3, obj4, ov0Var, Integer.valueOf(i | I));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new v9(this, obj, obj2, obj3, obj4, i, 1);
        }
        return objC;
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = ov0Var.f(this) ? sb.I(2, 5) : sb.I(1, 5);
        Object obj6 = this.g;
        obj6.getClass();
        da0.o(7, obj6);
        Object objA = ((uu0) obj6).a(obj, obj2, obj3, obj4, obj5, ov0Var, Integer.valueOf(i | I));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new n10(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objA;
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = ov0Var.f(this) ? sb.I(2, 6) : sb.I(1, 6);
        Object obj7 = this.g;
        obj7.getClass();
        da0.o(8, obj7);
        Object objD = ((vu0) obj7).d(obj, obj2, obj3, obj4, obj5, obj6, ov0Var, Integer.valueOf(i | I));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new l10(this, obj, obj2, obj3, obj4, obj5, obj6, i, 0);
        }
        return objD;
    }

    public final Object m(final String str, final Object obj, final Integer num, final Integer num2, final Integer num3, final Integer num4, final Integer num5, final Integer num6, final Integer num7, final Integer num8, final Long l, final Integer num9, final Integer num10, final Integer num11, f30 f30Var, final int i, final int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(this.e);
        n(ov0Var);
        int I = ov0Var.f(this) ? sb.I(2, 14) : sb.I(1, 14);
        Object obj2 = this.g;
        obj2.getClass();
        da0.o(17, obj2);
        Object objE = ((iu0) obj2).e(str, obj, num, num2, num3, num4, num5, num6, num7, num8, l, num9, num10, num11, ov0Var, Integer.valueOf(i), Integer.valueOf(i2 | I));
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: m10
                @Override // defpackage.pu0
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM0 = wc0.m0(i) | 1;
                    int iM1 = wc0.m0(i2);
                    this.e.m(str, obj, num, num2, num3, num4, num5, num6, num7, num8, l, num9, num10, num11, (f30) obj3, iM0, iM1);
                    return mf3.a;
                }
            };
        }
        return objE;
    }

    public final void n(f30 f30Var) {
        ee2 ee2VarA;
        if (!this.f || (ee2VarA = ((ov0) f30Var).A()) == null) {
            return;
        }
        ee2VarA.b |= 1;
        ee2 ee2Var = this.h;
        if (ee2Var == null || !ee2Var.a() || ee2Var == ee2VarA || o51.f(ee2Var.c, ee2VarA.c)) {
            this.h = ee2VarA;
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.i = arrayList2;
            arrayList2.add(ee2VarA);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ee2 ee2Var2 = (ee2) arrayList.get(i);
            if (ee2Var2 == null || !ee2Var2.a() || ee2Var2 == ee2VarA || o51.f(ee2Var2.c, ee2VarA.c)) {
                arrayList.set(i, ee2VarA);
                return;
            }
        }
        arrayList.add(ee2VarA);
    }

    @Override // defpackage.qu0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return g(obj, (f30) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.ru0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (f30) obj3, ((Number) obj4).intValue());
    }
}
