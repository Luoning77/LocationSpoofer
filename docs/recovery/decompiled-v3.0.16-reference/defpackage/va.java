package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class va extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ we2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va(int i, we2 we2Var) {
        super(1);
        this.f = i;
        this.g = we2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f;
        we2 we2Var = this.g;
        switch (i) {
            case 0:
                we2Var.e = (dq0) obj;
                return Boolean.TRUE;
            case 1:
                ky0 ky0Var = (ky0) obj;
                Object obj2 = we2Var.e;
                if (obj2 == null && ky0Var.u) {
                    we2Var.e = ky0Var;
                } else if (obj2 != null) {
                    ky0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                kb0 kb0Var = (tc3) obj;
                if (((cv1) kb0Var).e.r) {
                    we2Var.e = kb0Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
