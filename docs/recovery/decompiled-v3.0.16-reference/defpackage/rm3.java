package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class rm3 implements gf1, yu0 {
    public final /* synthetic */ o30 a;

    public rm3(o30 o30Var) {
        this.a = o30Var;
    }

    @Override // defpackage.yu0
    public final xu0 a() {
        return new bv0(1, 0, o30.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gf1) && (obj instanceof yu0)) {
            return a().equals(((yu0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
