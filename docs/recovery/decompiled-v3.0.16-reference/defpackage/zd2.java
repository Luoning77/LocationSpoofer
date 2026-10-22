package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zd2 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd2(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                o51 o51Var = ((jw) obj3).b;
                o51Var.getClass();
                return o51Var.k(((q8) obj).i.d, ((gx0) obj2).a());
            default:
                y yVar = (y) obj3;
                yVar.removeOnAttachStateChangeListener((rd) obj2);
                ce0.C(yVar).a.remove((b81) obj);
                return mf3.a;
        }
    }
}
