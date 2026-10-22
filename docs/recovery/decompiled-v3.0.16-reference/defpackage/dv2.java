package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dv2 {
    public final nu2 a;
    public int c;
    public ju2 f;
    public int h;
    public final w52 b = ke0.H(pz1.a);
    public final t52 d = new t52(0);
    public t03 e = t03.e;
    public final t52 g = new t52(0);

    public dv2(nu2 nu2Var) {
        this.a = nu2Var;
    }

    public final cv2 a() {
        return (cv2) this.b.getValue();
    }

    public final void b() {
        Object obj;
        List listC = this.a.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i);
            if (((pu2) obj).d().b()) {
                break;
            } else {
                i++;
            }
        }
        pu2 pu2Var = (pu2) obj;
        if (pu2Var == null && this.f == null) {
            return;
        }
        if (o51.f(pu2Var != null ? pu2Var.p : null, this.f)) {
            return;
        }
        this.g.h(this.h + 1);
    }

    public final void c() {
        Object obj;
        Object obj2;
        cv2 cv2VarA;
        t52 t52Var = this.d;
        int iG = t52Var.g();
        int i = this.c;
        int i2 = 0;
        nu2 nu2Var = this.a;
        if (iG != i) {
            this.c = t52Var.g();
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 0) {
                cv2VarA = a();
            } else if (iOrdinal != 1) {
                cv2VarA = pz1.a;
                if (iOrdinal == 2) {
                    List listC = nu2Var.c();
                    int size = listC.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            cv2VarA = a().h();
                            break;
                        } else if (o51.f(((pu2) listC.get(i3)).p, this.f)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else if (iOrdinal != 3) {
                    b81.d();
                    return;
                }
            } else {
                cv2VarA = a().g(this.f);
            }
            this.b.setValue(cv2VarA);
            this.e = t03.e;
        }
        t52 t52Var2 = this.g;
        if (t52Var2.g() != this.h) {
            ju2 ju2Var = null;
            if (nu2Var.b.a()) {
                List listC2 = nu2Var.c();
                int size2 = listC2.size();
                while (true) {
                    if (i2 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listC2.get(i2);
                    if (((pu2) obj2).d().b()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                pu2 pu2Var = (pu2) obj2;
                if (pu2Var != null) {
                    ju2Var = pu2Var.p;
                }
            } else {
                List listB = nu2Var.b();
                int size3 = listB.size();
                while (true) {
                    if (i2 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i2);
                    if (((pu2) obj).d().b()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                pu2 pu2Var2 = (pu2) obj;
                if (pu2Var2 != null) {
                    ju2Var = pu2Var2.p;
                }
            }
            if (!o51.f(ju2Var, this.f)) {
                this.f = ju2Var;
            }
            this.h = t52Var2.g();
        }
    }
}
