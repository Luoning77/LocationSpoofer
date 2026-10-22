package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n7 extends cv2 {
    public ju2 a;
    public final w52 b;

    public n7(ju2 ju2Var, pe2 pe2Var) {
        this.a = ju2Var;
        this.b = ke0.H(pe2Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[PHI: r3
      0x0079: PHI (r3v3 pe2) = (r3v2 pe2), (r3v6 pe2) binds: [B:3:0x003b, B:19:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cv2
    public final cv2 a(nu2 nu2Var, ju2 ju2Var, long j, long j2, long j3) {
        long j4;
        Object obj;
        long jD = c12.d(j2, j3);
        mn2 mn2Var = new mn2();
        mn2Var.e = ke0.H(new cw2(j));
        mn2Var.f = ke0.H(new c12(jD));
        mn2Var.g = ke0.H(new c12(j3));
        mn2Var.h = ke0.H(new c12(jD));
        pe2 pe2VarC = c();
        if (pe2VarC != null) {
            j4 = j2;
        } else {
            ju2 ju2Var2 = this.a;
            if (ju2Var2 == null) {
                List listB = nu2Var.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (nu2Var.c().contains((pu2) obj)) {
                        break;
                    }
                    i++;
                }
                pu2 pu2Var = (pu2) obj;
                ju2Var2 = pu2Var != null ? pu2Var.p : null;
            }
            pe2VarC = ce0.L(nu2Var, ju2Var2);
            if (pe2VarC == null) {
                j4 = j2;
                pe2VarC = ce0.d(j4, j);
            } else {
                j4 = j2;
            }
        }
        pe2 pe2Var = pe2VarC;
        ce0.X(mn2Var, j, j4, j3, true);
        return new m7(mn2Var, ju2Var, pe2Var);
    }

    @Override // defpackage.cv2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.cv2
    public final pe2 c() {
        return (pe2) this.b.getValue();
    }

    @Override // defpackage.cv2
    public final mn2 e() {
        return null;
    }

    @Override // defpackage.cv2
    public final pe2 f(nu2 nu2Var) {
        Object obj;
        pe2 pe2VarC = c();
        if (pe2VarC != null) {
            return pe2VarC;
        }
        if (c() == null) {
            ju2 ju2Var = this.a;
            if (ju2Var == null) {
                List listB = nu2Var.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (nu2Var.c().contains((pu2) obj)) {
                        break;
                    }
                    i++;
                }
                pu2 pu2Var = (pu2) obj;
                ju2Var = pu2Var != null ? pu2Var.p : null;
            }
            pe2 pe2VarL = ce0.L(nu2Var, ju2Var);
            if (pe2VarL != null) {
                this.b.setValue(pe2VarL);
            }
        }
        return c();
    }

    @Override // defpackage.cv2
    public final cv2 g(ju2 ju2Var) {
        if (this.a == null) {
            this.a = ju2Var;
        }
        return this;
    }

    @Override // defpackage.cv2
    public final cv2 h() {
        return pz1.a;
    }

    @Override // defpackage.cv2
    public final void i(pe2 pe2Var) {
        this.b.setValue(pe2Var);
    }
}
