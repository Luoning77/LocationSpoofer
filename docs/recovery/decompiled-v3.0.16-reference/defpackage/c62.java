package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c62 extends k33 implements lu0 {
    public final /* synthetic */ d62 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ lu0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c62(d62 d62Var, String str, lu0 lu0Var, q60 q60Var) {
        super(1, q60Var);
        this.e = d62Var;
        this.f = str;
        this.g = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new c62(this.e, this.f, this.g, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        return ((c62) create((q60) obj)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Exception {
        ee0.J(obj);
        bl2 bl2VarA0 = this.e.b.a0(this.f);
        try {
            Object objInvoke = this.g.invoke(bl2VarA0);
            am1.j(bl2VarA0, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }
}
