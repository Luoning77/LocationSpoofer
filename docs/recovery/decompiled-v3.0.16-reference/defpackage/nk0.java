package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nk0 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ok0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk0(ok0 ok0Var, int i) {
        super(1);
        this.f = i;
        this.g = ok0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        ck0 ck0Var = ck0.g;
        ck0 ck0Var2 = ck0.f;
        ck0 ck0Var3 = ck0.e;
        ok0 ok0Var = this.g;
        switch (i) {
            case 0:
                ic3 ic3Var = (ic3) obj;
                boolean zB = ic3Var.b(ck0Var3, ck0Var2);
                Object obj2 = null;
                if (zB) {
                    lw lwVar = ok0Var.x.a.c;
                    if (lwVar != null) {
                        obj2 = lwVar.c;
                    }
                } else if (ic3Var.b(ck0Var2, ck0Var)) {
                    lw lwVar2 = ok0Var.y.a.c;
                    if (lwVar2 != null) {
                        obj2 = lwVar2.c;
                    }
                } else {
                    obj2 = kk0.d;
                }
                return obj2 == null ? kk0.d : obj2;
            default:
                ic3 ic3Var2 = (ic3) obj;
                if (ic3Var2.b(ck0Var3, ck0Var2)) {
                    lw2 lw2Var = ok0Var.x.a.b;
                    return lw2Var != null ? lw2Var.b : kk0.c;
                }
                if (!ic3Var2.b(ck0Var2, ck0Var)) {
                    return kk0.c;
                }
                lw2 lw2Var2 = ok0Var.y.a.b;
                return lw2Var2 != null ? lw2Var2.b : kk0.c;
        }
    }
}
