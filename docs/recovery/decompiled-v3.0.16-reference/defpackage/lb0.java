package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class lb0 extends cv1 {
    public final int s = yz1.e(this);
    public cv1 t;

    @Override // defpackage.cv1
    public final void c1() {
        super.c1();
        for (cv1 cv1Var = this.t; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.l1(this.l);
            if (!cv1Var.r) {
                cv1Var.c1();
            }
        }
    }

    @Override // defpackage.cv1
    public final void d1() {
        for (cv1 cv1Var = this.t; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.d1();
        }
        super.d1();
    }

    @Override // defpackage.cv1
    public final void h1() {
        super.h1();
        for (cv1 cv1Var = this.t; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.h1();
        }
    }

    @Override // defpackage.cv1
    public final void i1() {
        for (cv1 cv1Var = this.t; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.i1();
        }
        super.i1();
    }

    @Override // defpackage.cv1
    public final void j1() {
        super.j1();
        for (cv1 cv1Var = this.t; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.j1();
        }
    }

    @Override // defpackage.cv1
    public final void k1(cv1 cv1Var) {
        this.e = cv1Var;
        for (cv1 cv1Var2 = this.t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
            cv1Var2.k1(cv1Var);
        }
    }

    @Override // defpackage.cv1
    public final void l1(xz1 xz1Var) {
        this.l = xz1Var;
        for (cv1 cv1Var = this.t; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.l1(xz1Var);
        }
    }

    public final kb0 m1(kb0 kb0Var) {
        cv1 cv1Var = ((cv1) kb0Var).e;
        if (cv1Var != kb0Var) {
            cv1 cv1Var2 = kb0Var instanceof cv1 ? (cv1) kb0Var : null;
            cv1 cv1Var3 = cv1Var2 != null ? cv1Var2.i : null;
            if (cv1Var != this.e || !o51.f(cv1Var3, this)) {
                fo.n("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (cv1Var.r) {
                p21.c("Cannot delegate to an already attached node");
            }
            cv1Var.k1(this.e);
            int i = this.g;
            int iF = yz1.f(cv1Var);
            cv1Var.g = iF;
            int i2 = this.g;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof ya1)) {
                p21.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cv1Var);
            }
            cv1Var.j = this.t;
            this.t = cv1Var;
            cv1Var.i = this;
            o1(iF | this.g, false);
            if (this.r) {
                if (i3 == 0 || (i & 2) != 0) {
                    l1(this.l);
                } else {
                    tz1 tz1Var = xp1.O(this).K;
                    this.e.l1(null);
                    tz1Var.g();
                }
                cv1Var.c1();
                cv1Var.i1();
                if (!cv1Var.r) {
                    p21.c("autoInvalidateInsertedNode called on unattached node");
                }
                yz1.a(cv1Var, -1, 1);
            }
        }
        return kb0Var;
    }

    public final void n1(kb0 kb0Var) {
        cv1 cv1Var = null;
        for (cv1 cv1Var2 = this.t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
            if (cv1Var2 == kb0Var) {
                boolean z = cv1Var2.r;
                if (z) {
                    ox1 ox1Var = yz1.a;
                    if (!z) {
                        p21.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    yz1.a(cv1Var2, -1, 2);
                    cv1Var2.j1();
                    cv1Var2.d1();
                }
                cv1Var2.k1(cv1Var2);
                cv1Var2.h = 0;
                cv1 cv1Var3 = cv1Var2.j;
                if (cv1Var == null) {
                    this.t = cv1Var3;
                } else {
                    cv1Var.j = cv1Var3;
                }
                cv1Var2.j = null;
                cv1Var2.i = null;
                int i = this.g;
                int iF = yz1.f(this);
                o1(iF, true);
                if (this.r && (i & 2) != 0 && (iF & 2) == 0) {
                    tz1 tz1Var = xp1.O(this).K;
                    this.e.l1(null);
                    tz1Var.g();
                    return;
                }
                return;
            }
            cv1Var = cv1Var2;
        }
        fo.o(kb0Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void o1(int i, boolean z) {
        cv1 cv1Var;
        int i2 = this.g;
        this.g = i;
        if (i2 != i) {
            cv1 cv1Var2 = this.e;
            if (cv1Var2 == this) {
                this.h = i;
            }
            boolean z2 = this.r;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.g;
                    r2.g = i;
                    if (r2 == cv1Var2) {
                        break;
                    } else {
                        r2 = r2.i;
                    }
                }
                if (z && r2 == cv1Var2) {
                    i = yz1.f(cv1Var2);
                    cv1Var2.g = i;
                }
                int i3 = i | ((r2 == 0 || (cv1Var = r2.j) == null) ? 0 : cv1Var.h);
                for (?? r3 = r2; r3 != 0; r3 = r3.i) {
                    i3 |= r3.g;
                    r3.h = i3;
                }
            }
        }
    }
}
