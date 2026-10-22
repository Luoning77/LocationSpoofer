package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class f70 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ me1 f;

    public /* synthetic */ f70(me1 me1Var, int i) {
        this.e = i;
        this.f = me1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        me1 me1Var = this.f;
        switch (i) {
            case 0:
                pa1 pa1Var = (pa1) obj;
                y83 y83VarD = me1Var.d();
                if (y83VarD != null) {
                    y83VarD.c = pa1Var;
                }
                return mf3Var;
            case 1:
                w52 w52Var = me1Var.t;
                f83 f83Var = (f83) obj;
                String str = f83Var.a.f;
                dj djVar = me1Var.j;
                if (!o51.f(str, djVar != null ? djVar.f : null)) {
                    me1Var.k.setValue(dx0.e);
                    if (((Boolean) w52Var.getValue()).booleanValue()) {
                        w52Var.setValue(Boolean.FALSE);
                    } else {
                        me1Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = f93.b;
                me1Var.f(j);
                me1Var.e(j);
                me1Var.u.invoke(f83Var);
                ee2 ee2Var = me1Var.b;
                t30 t30Var = ee2Var.a;
                if (t30Var != null) {
                    t30Var.s(ee2Var, null);
                }
                return mf3Var;
            case 2:
                me1Var.r.b(((b11) obj).a);
                return mf3Var;
            case 3:
                return Boolean.valueOf(me1Var.r.b(((b11) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                me1Var.q.setValue(bool);
                return mf3Var;
        }
    }
}
