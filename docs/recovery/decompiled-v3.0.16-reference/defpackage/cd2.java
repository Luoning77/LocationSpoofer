package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class cd2 {
    public final de1 a;

    public cd2(au0 au0Var) {
        this.a = new de1(au0Var);
    }

    public abstract kk a(Object obj);

    public gh3 b() {
        return this.a;
    }

    public final gh3 c(kk kkVar, gh3 gh3Var) {
        ih0 ih0Var;
        gh3 gh3Var2 = null;
        gh3Var2 = null;
        gh3Var2 = null;
        gh3Var2 = null;
        gh3Var2 = null;
        gh3Var2 = null;
        if (gh3Var instanceof ih0) {
            if (kkVar.d) {
                ih0Var = (ih0) gh3Var;
                ih0Var.a.setValue(kkVar.c());
            }
        } else if (gh3Var instanceof b13) {
            if ((kkVar.c || kkVar.b != null) && !kkVar.d) {
                b13 b13Var = (b13) gh3Var;
                if (o51.f(kkVar.c(), b13Var.a)) {
                    gh3Var2 = b13Var;
                }
            }
        } else if (gh3Var instanceof b40) {
            kkVar.getClass();
        }
        if (gh3Var2 != null) {
            gh3Var2 = ih0Var;
            return gh3Var2;
        }
        if (!kkVar.d) {
            gh3Var2 = ih0Var;
            return new b13(kkVar.c());
        }
        Object obj = kkVar.b;
        ay2 ay2Var = (ay2) kkVar.a;
        if (ay2Var == null) {
            gh3Var2 = ih0Var;
            ay2Var = u92.q;
        }
        gh3Var2 = ih0Var;
        return new ih0(new w52(obj, ay2Var));
    }
}
