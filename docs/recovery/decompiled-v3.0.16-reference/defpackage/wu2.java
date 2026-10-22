package defpackage;

import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wu2 implements jk1 {
    public final /* synthetic */ jk1 e;
    public final CoroutineScope f;
    public pa1 i;
    public pa1 j;
    public final w52 g = ke0.H(Boolean.FALSE);
    public final ye h = new ye(this, 23);
    public final fy2 k = new fy2();
    public final hy2 l = new hy2();

    public wu2(jk1 jk1Var, CoroutineScope coroutineScope) {
        this.e = jk1Var;
        this.f = coroutineScope;
    }

    public static uu2 b(String str, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.c0(800730162);
        ov0Var.c0(-148945892);
        boolean zF = ov0Var.f(str);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new uu2(str);
            ov0Var.m0(objQ);
        }
        uu2 uu2Var = (uu2) objQ;
        uu2Var.b.setValue(ru2.a);
        ov0Var.p(false);
        ov0Var.p(false);
        return uu2Var;
    }

    public static dv1 d(wu2 wu2Var, uu2 uu2Var, yh yhVar, ui1 ui1Var) {
        tu2.a.getClass();
        return xp1.p(av1.a, new vu2(uu2Var, yhVar.a.a(), wu2Var, zu2.a, ui1Var));
    }

    public final boolean a() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.jk1
    public final pa1 c(pa1 pa1Var) {
        return this.e.c(pa1Var);
    }

    public final void e() {
        Collection<nu2> collectionValues = this.l.e().c.values();
        boolean z = false;
        for (nu2 nu2Var : collectionValues) {
            z = z || (nu2Var.a() && nu2Var.d());
            nu2Var.e();
        }
        if (z != a()) {
            this.g.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (nu2 nu2Var2 : collectionValues) {
                if (nu2Var2.c().size() > 1) {
                    List listC = nu2Var2.c();
                    int i = qu2.a;
                    int size = listC.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (((pu2) listC.get(i2)).d().b()) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                dv2 dv2Var = nu2Var2.c;
                dv2Var.e = t03.e;
                dv2Var.c = dv2Var.d.g();
                dv2Var.b.setValue(pz1.a);
            }
        }
    }

    @Override // defpackage.jk1
    public final long h(pa1 pa1Var, pa1 pa1Var2) {
        return this.e.h(pa1Var, pa1Var2);
    }
}
