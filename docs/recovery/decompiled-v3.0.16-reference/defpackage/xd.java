package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xd extends bv0 implements lu0 {
    public final /* synthetic */ ge1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(ge1 ge1Var) {
        super(1, n51.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.e = ge1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        float[] fArr = ((yq1) obj).a;
        pa1 pa1Var = (pa1) this.e.v.getValue();
        if (pa1Var != null) {
            if (!pa1Var.U()) {
                pa1Var = null;
            }
            if (pa1Var != null) {
                pa1Var.W(fArr);
            }
        }
        return mf3.a;
    }
}
