package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uz1 implements vz1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.vz1
    public final boolean a(cv1 cv1Var) {
        ?? gy1Var = 0;
        while (true) {
            int i = 0;
            if (cv1Var == 0) {
                return false;
            }
            if (cv1Var instanceof ba2) {
                ((ba2) cv1Var).T0();
            } else if ((cv1Var.g & 16) != 0 && (cv1Var instanceof lb0)) {
                cv1 cv1Var2 = ((lb0) cv1Var).t;
                gy1Var = gy1Var;
                cv1Var = cv1Var;
                while (cv1Var2 != null) {
                    if ((cv1Var2.g & 16) != 0) {
                        i++;
                        if (i == 1) {
                            gy1Var = gy1Var;
                            cv1Var = cv1Var2;
                        } else {
                            if (gy1Var == 0) {
                                gy1Var = new gy1(new cv1[16]);
                            }
                            if (cv1Var != 0) {
                                gy1Var.b(cv1Var);
                                cv1Var = 0;
                            }
                            gy1Var.b(cv1Var2);
                        }
                    }
                    cv1Var2 = cv1Var2.j;
                    gy1Var = gy1Var;
                    cv1Var = cv1Var;
                }
                if (i == 1) {
                }
            }
            cv1Var = xp1.J(gy1Var);
        }
    }

    @Override // defpackage.vz1
    public final int b() {
        return 16;
    }

    @Override // defpackage.vz1
    public final void d(hb1 hb1Var, long j, zx0 zx0Var, int i, boolean z) {
        hb1Var.z(j, zx0Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.vz1
    public final boolean e(zx0 zx0Var, hb1 hb1Var) {
        xz1 xz1Var = hb1Var.K.d;
        xz1Var.getClass();
        cv1 cv1VarV1 = xz1Var.v1(yz1.g(16));
        if (cv1VarV1 != null && cv1VarV1.r) {
            if (!cv1VarV1.e.r) {
                p21.c("visitLocalDescendants called on an unattached node");
            }
            cv1 cv1Var = cv1VarV1.e;
            if ((cv1Var.h & 16) != 0) {
                while (cv1Var != null) {
                    if ((cv1Var.g & 16) != 0) {
                        ?? J = cv1Var;
                        ?? gy1Var = 0;
                        while (J != 0) {
                            if (J instanceof ba2) {
                                if (((ba2) J).x0()) {
                                    zx0Var.g = zx0Var.e.b - 1;
                                    return true;
                                }
                            } else if ((J.g & 16) != 0 && (J instanceof lb0)) {
                                cv1 cv1Var2 = ((lb0) J).t;
                                int i = 0;
                                while (cv1Var2 != null) {
                                    if ((cv1Var2.g & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            J = J;
                                            gy1Var = gy1Var;
                                            gy1Var = gy1Var;
                                            J = cv1Var2;
                                        } else {
                                            if (gy1Var == 0) {
                                                gy1Var = new gy1(new cv1[16]);
                                            }
                                            if (J != 0) {
                                                gy1Var.b(J);
                                                J = 0;
                                            }
                                            gy1Var.b(cv1Var2);
                                        }
                                    } else {
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                    cv1Var2 = cv1Var2.j;
                                    J = J;
                                    gy1Var = gy1Var;
                                }
                                if (i == 1) {
                                    J = J;
                                    gy1Var = gy1Var;
                                } else {
                                    J = J;
                                    gy1Var = gy1Var;
                                }
                            }
                            J = xp1.J(gy1Var);
                        }
                    }
                    cv1Var = cv1Var.j;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vz1
    public final boolean h(hb1 hb1Var) {
        return true;
    }
}
