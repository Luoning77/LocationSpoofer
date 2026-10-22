package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a32 extends s32 {
    public static final a32 d;
    public static final a32 e;
    public static final a32 f;
    public static final a32 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new a32(i, 2, 0);
        int i2 = 1;
        e = new a32(i2, i2, 1);
        f = new a32(i, 2, 2);
        int i3 = 1;
        g = new a32(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a32(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        switch (this.c) {
            case 0:
                Object objInvoke = ((au0) jv0Var.c(0)).invoke();
                iv0 iv0Var = (iv0) jv0Var.c(1);
                int iB = jv0Var.b(0);
                iv0Var.getClass();
                kx2Var.T(kx2Var.c(iv0Var), objInvoke);
                unVar.f(iB, objInvoke);
                unVar.d(objInvoke);
                break;
            case 1:
                iv0 iv0Var2 = (iv0) jv0Var.c(0);
                int iB2 = jv0Var.b(0);
                unVar.s();
                iv0Var2.getClass();
                unVar.c(iB2, kx2Var.C(kx2Var.c(iv0Var2)));
                break;
            case 2:
                Object objC = jv0Var.c(0);
                iv0 iv0Var3 = (iv0) jv0Var.c(1);
                int iB3 = jv0Var.b(0);
                if (objC instanceof sv0) {
                    sv0 sv0Var = (sv0) objC;
                    ((gy1) ljVar.f).b(sv0Var);
                    ((ay1) ljVar.e).a(sv0Var);
                }
                Object objJ = kx2Var.J(kx2Var.c(iv0Var3), iB3, objC);
                if (objJ instanceof sv0) {
                    ljVar.f((sv0) objJ);
                } else if (objJ instanceof ee2) {
                    ((ee2) objJ).c();
                }
                break;
            default:
                Object objC2 = jv0Var.c(0);
                int iB4 = jv0Var.b(0);
                if (objC2 instanceof sv0) {
                    sv0 sv0Var2 = (sv0) objC2;
                    ((gy1) ljVar.f).b(sv0Var2);
                    ((ay1) ljVar.e).a(sv0Var2);
                }
                Object objJ2 = kx2Var.J(kx2Var.t, iB4, objC2);
                if (objJ2 instanceof sv0) {
                    ljVar.f((sv0) objJ2);
                } else if (objJ2 instanceof ee2) {
                    ((ee2) objJ2).c();
                }
                break;
        }
    }

    @Override // defpackage.s32
    public iv0 b(jv0 jv0Var) {
        switch (this.c) {
            case 0:
                return (iv0) jv0Var.c(1);
            case 1:
                return (iv0) jv0Var.c(0);
            default:
                return super.b(jv0Var);
        }
    }
}
