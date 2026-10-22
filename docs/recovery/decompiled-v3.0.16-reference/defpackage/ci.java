package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ci extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ di g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci(di diVar, long j, int i) {
        super(1);
        this.f = i;
        this.g = diVar;
        this.h = j;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        ln0 ln0Var;
        int i = this.f;
        long j = 0;
        long j2 = this.h;
        di diVar = this.g;
        switch (i) {
            case 0:
                ic3 ic3Var = (ic3) obj;
                if (!o51.f(ic3Var.a(), diVar.v.a())) {
                    s03 s03Var = (s03) diVar.v.c.g(ic3Var.a());
                    j2 = s03Var != null ? ((p41) s03Var.getValue()).a : 0L;
                } else if (!p41.b(diVar.w, -9223372034707292160L)) {
                    j2 = diVar.w;
                }
                s03 s03Var2 = (s03) diVar.v.c.g(ic3Var.c());
                j = s03Var2 != null ? ((p41) s03Var2.getValue()).a : 0L;
                kw2 kw2Var = (kw2) diVar.u.getValue();
                return (kw2Var == null || (ln0Var = (ln0) kw2Var.a.invoke(new p41(j2), new p41(j))) == null) ? o51.D(0.0f, 400.0f, null, 5) : ln0Var;
            default:
                if (o51.f(obj, diVar.v.a())) {
                    j = p41.b(diVar.w, -9223372034707292160L) ? j2 : diVar.w;
                } else {
                    s03 s03Var3 = (s03) diVar.v.c.g(obj);
                    if (s03Var3 != null) {
                        j = ((p41) s03Var3.getValue()).a;
                    }
                }
                return new p41(j);
        }
    }
}
