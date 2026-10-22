package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ae0 extends aa1 implements lu0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ se2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae0(t1 t1Var, be0 be0Var, se2 se2Var) {
        super(1);
        this.g = se2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        sc3 sc3Var = sc3.e;
        se2 se2Var = this.g;
        switch (i) {
            case 0:
                be0 be0Var = (be0) obj;
                if (!be0Var.r) {
                    return sc3.f;
                }
                if (be0Var.t != null) {
                    p21.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                be0Var.t = null;
                se2Var.e = se2Var.e;
                return sc3Var;
            default:
                if (!((ky0) obj).u) {
                    return sc3Var;
                }
                se2Var.e = false;
                return sc3.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae0(se2 se2Var) {
        super(1);
        this.g = se2Var;
    }
}
