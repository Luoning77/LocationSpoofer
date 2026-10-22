package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nu2 {
    public final String a;
    public final wu2 b;
    public final dv2 c = new dv2(this);
    public final w52 d;
    public final w52 e;
    public final oh f;
    public boolean g;
    public final mu2 h;
    public final mu2 i;

    public nu2(String str, wu2 wu2Var) {
        this.a = str;
        this.b = wu2Var;
        uj0 uj0Var = uj0.e;
        this.d = ke0.H(uj0Var);
        this.e = ke0.H(uj0Var);
        this.f = new oh(new c12(0L), o51.A0, null, 12);
        this.h = new mu2(this, 0);
        this.i = new mu2(this, 1);
    }

    public final boolean a() {
        dv2 dv2Var = this.c;
        return dv2Var.a().b() || dv2Var.a().d() || dv2Var.e == t03.f;
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            mc3 mc3Var = ((pu2) listC.get(i)).d().b;
            while (true) {
                mc3 mc3Var2 = mc3Var.b;
                if (mc3Var2 == null) {
                    break;
                }
                mc3Var = mc3Var2;
            }
            if (!o51.f(mc3Var.c(), mc3Var.d.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            pu2 pu2Var = (pu2) listB.get(i);
            if (pu2Var.h()) {
                arrayList.add(pu2Var);
                if (pu2Var.d().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        dv2 dv2Var = this.c;
        nu2 nu2Var = dv2Var.a;
        t52 t52Var = dv2Var.d;
        if (nu2Var.c().size() > 1 && z) {
            dv2Var.e = t03.f;
            t52Var.h(dv2Var.c + 1);
        } else if (!nu2Var.b.a()) {
            dv2Var.e = t03.e;
            dv2Var.c = t52Var.g();
            dv2Var.b.setValue(pz1.a);
        } else if (!z) {
            dv2Var.e = t03.g;
            t52Var.h(dv2Var.c + 1);
        }
        dv2Var.b();
    }
}
