package defpackage;

import java.util.ListIterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pu2 implements mf2 {
    public final w52 e = ke0.H(Boolean.FALSE);
    public final s52 f = new s52(0.0f);
    public final w52 g;
    public final w52 h;
    public final w52 i;
    public final w52 j;
    public final w52 k;
    public final w52 l;
    public final w52 m;
    public re n;
    public pu2 o;
    public ju2 p;
    public final w52 q;

    public pu2(nu2 nu2Var, ps psVar, xu2 xu2Var, uu2 uu2Var) {
        Boolean bool = Boolean.TRUE;
        this.g = ke0.H(bool);
        this.h = ke0.H(nu2Var);
        this.i = ke0.H(psVar);
        this.j = ke0.H(su2.b);
        this.k = ke0.H(bool);
        this.l = ke0.H(xu2Var);
        this.m = ke0.H(uu2Var);
        this.q = ke0.H(null);
    }

    @Override // defpackage.mf2
    public final void a() {
        wu2 wu2Var = e().b;
        nu2 nu2VarE = e();
        nu2VarE.d.setValue(zy.w0(nu2VarE.b(), this));
        nu2VarE.e();
        wu2Var.e();
        fy2 fy2Var = wu2Var.k;
        ListIterator listIterator = fy2Var.listIterator();
        int i = 0;
        while (true) {
            xx0 xx0Var = (xx0) listIterator;
            if (!xx0Var.hasNext()) {
                i = -1;
                break;
            }
            pu2 pu2Var = (pu2) xx0Var.next();
            if (pu2Var == null) {
                pu2Var = null;
            }
            if (o51.f(pu2Var != null ? pu2Var.e() : null, e())) {
                break;
            } else {
                i++;
            }
        }
        if (i == fy2Var.size() - 1 || i == -1) {
            fy2Var.add(this);
        } else {
            fy2Var.add(i + 1, this);
        }
        e().c.b();
    }

    @Override // defpackage.mf2
    public final void c() {
        wu2 wu2Var = e().b;
        nu2 nu2VarE = e();
        nu2VarE.d.setValue(zy.v0(this, nu2VarE.b()));
        nu2VarE.e.setValue(zy.v0(this, nu2VarE.c()));
        nu2VarE.e();
        wu2Var.e();
        wu2Var.k.remove(this);
        if (nu2VarE.b().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(nu2VarE.b.f, null, null, new l80(nu2VarE, this, null, 16), 3, null);
        }
        e().c.b();
    }

    public final ps d() {
        return (ps) this.i.getValue();
    }

    public final nu2 e() {
        return (nu2) this.h.getValue();
    }

    public final boolean f() {
        if (d().b()) {
            return true;
        }
        return (e().c.a().d() && !e().c.a().b()) || !((Boolean) this.k.getValue()).booleanValue();
    }

    public final boolean g() {
        return f() && e().c.a().d() && h() && ((Boolean) this.g.getValue()).booleanValue() && e().b.a();
    }

    public final boolean h() {
        uu2 uu2Var = (uu2) this.m.getValue();
        if (!((Boolean) this.e.getValue()).booleanValue()) {
            return false;
        }
        ((ru2) uu2Var.b.getValue()).getClass();
        return true;
    }

    @Override // defpackage.mf2
    public final void b() {
    }
}
