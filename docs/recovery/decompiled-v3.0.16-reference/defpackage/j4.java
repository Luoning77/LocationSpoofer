package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class j4 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;

    public /* synthetic */ j4(String str, boolean z) {
        this.g = str;
        this.f = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        boolean z = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    String strN = ke0.N(gh0.j(this.g), ov0Var);
                    dv1 dv1VarD = zm3.D(av1Var, 12.0f);
                    q93 q93Var = ((je3) ov0Var.j(le3.a)).l;
                    if (z) {
                        ov0Var.c0(-1508453020);
                        j = ((kz) ov0Var.j(mz.a)).d;
                    } else {
                        ov0Var.c0(-1508451422);
                        j = ((kz) ov0Var.j(mz.a)).z;
                    }
                    ov0Var.p(false);
                    s83.b(strN, dv1VarD, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var, 48, 0, 131064);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarE = zm3.E(av1Var, 12.0f, 8.0f);
                    q93 q93Var2 = ((je3) ov0Var2.j(le3.a)).l;
                    if (z) {
                        ov0Var2.c0(-1939553127);
                        j2 = ((kz) ov0Var2.j(mz.a)).w;
                    } else {
                        ov0Var2.c0(-1939551932);
                        j2 = ((kz) ov0Var2.j(mz.a)).s;
                    }
                    ov0Var2.p(false);
                    s83.b(this.g, dv1VarE, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var2, ov0Var2, 48, 0, 131064);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ j4(boolean z, String str) {
        this.f = z;
        this.g = str;
    }
}
