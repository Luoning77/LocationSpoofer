package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fk0 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ pk0 g;
    public final /* synthetic */ lm0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk0(pk0 pk0Var, lm0 lm0Var, int i) {
        super(1);
        this.f = i;
        this.g = pk0Var;
        this.h = lm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        ln0 ln0Var;
        ln0 ln0Var2;
        int i = this.f;
        pk0 pk0Var = this.g;
        ck0 ck0Var = ck0.g;
        ck0 ck0Var2 = ck0.f;
        ck0 ck0Var3 = ck0.e;
        float f = 1.0f;
        lm0 lm0Var = this.h;
        switch (i) {
            case 0:
                ic3 ic3Var = (ic3) obj;
                if (ic3Var.b(ck0Var3, ck0Var2)) {
                    om0 om0Var = pk0Var.a.a;
                    return (om0Var == null || (ln0Var2 = om0Var.a) == null) ? kk0.b : ln0Var2;
                }
                if (!ic3Var.b(ck0Var2, ck0Var)) {
                    return kk0.b;
                }
                om0 om0Var2 = lm0Var.a.a;
                return (om0Var2 == null || (ln0Var = om0Var2.a) == null) ? kk0.b : ln0Var;
            case 1:
                int iOrdinal = ((ck0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            b81.d();
                            return null;
                        }
                        if (lm0Var.a.a != null) {
                            f = 0.0f;
                        }
                    }
                } else if (pk0Var.a.a != null) {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 2:
                ic3 ic3Var2 = (ic3) obj;
                if (ic3Var2.b(ck0Var3, ck0Var2)) {
                    return kk0.b;
                }
                if (!ic3Var2.b(ck0Var2, ck0Var)) {
                    return kk0.b;
                }
                nc3 nc3Var = lm0Var.a;
                return kk0.b;
            default:
                int iOrdinal2 = ((ck0) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        b81.d();
                        return null;
                    }
                    nc3 nc3Var2 = lm0Var.a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
