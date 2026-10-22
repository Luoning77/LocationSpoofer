package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kd1 {
    public final q01 a = new q01();
    public fx1 b;

    public kd1(lu0 lu0Var) {
        lu0Var.invoke(this);
    }

    public final void a(final String str, final String str2, qu0 qu0Var) {
        lu0 lu0Var;
        if (str != null) {
            final int i = 0;
            lu0Var = new lu0() { // from class: id1
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    int i2 = i;
                    Object obj2 = str;
                    ((Integer) obj).getClass();
                    return obj2;
                }
            };
        } else {
            lu0Var = null;
        }
        final int i2 = 1;
        this.a.a(1, new gn(lu0Var, new lu0() { // from class: id1
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                int i3 = i2;
                Object obj2 = str2;
                ((Integer) obj).getClass();
                return obj2;
            }
        }, new p10(new oe(qu0Var, 2), true, -857469575)));
    }

    public final void c(int i, lu0 lu0Var, lu0 lu0Var2, p10 p10Var) {
        this.a.a(i, new gn(lu0Var, lu0Var2, p10Var));
    }
}
