package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bg0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xb0 f;
    public final /* synthetic */ cv1 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bg0(xb0 xb0Var, cv1 cv1Var, Object obj, int i) {
        this.e = i;
        this.f = xb0Var;
        this.g = cv1Var;
        this.h = obj;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.h;
        cv1 cv1Var = this.g;
        xb0 xb0Var = this.f;
        switch (i) {
            case 0:
                jg0 jg0Var = (jg0) obj;
                jg0Var.getClass();
                xb0 xb0VarL = jg0Var.X().l();
                jg0Var.X().D(xb0Var);
                try {
                    ((cg0) cv1Var).o1(jg0Var, (yf0) obj2);
                    return mf3Var;
                } finally {
                    jg0Var.X().D(xb0VarL);
                }
            case 1:
                jg0 jg0Var2 = (jg0) obj;
                jg0Var2.getClass();
                xb0 xb0VarL2 = jg0Var2.X().l();
                jg0Var2.X().D(xb0Var);
                try {
                    ((cg0) cv1Var).o1(jg0Var2, (yf0) obj2);
                    return mf3Var;
                } finally {
                    jg0Var2.X().D(xb0VarL2);
                }
            case 2:
                jg0 jg0Var3 = (jg0) obj;
                jg0Var3.getClass();
                xb0 xb0VarL3 = jg0Var3.X().l();
                jg0Var3.X().D(xb0Var);
                try {
                    ((cg0) cv1Var).o1(jg0Var3, (yf0) obj2);
                    return mf3Var;
                } finally {
                    jg0Var3.X().D(xb0VarL3);
                }
            default:
                jg0 jg0Var4 = (jg0) obj;
                jg0Var4.getClass();
                xb0 xb0VarL4 = jg0Var4.X().l();
                jg0Var4.X().D(xb0Var);
                try {
                    ((la1) cv1Var).s.b.invoke((jb1) obj2);
                    return mf3Var;
                } finally {
                    jg0Var4.X().D(xb0VarL4);
                }
        }
    }
}
