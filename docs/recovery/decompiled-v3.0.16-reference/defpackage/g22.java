package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g22 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dq0 g;
    public final /* synthetic */ dq0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ah j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g22(dq0 dq0Var, dq0 dq0Var2, Object obj, int i, ah ahVar, int i2) {
        super(1);
        this.f = i2;
        this.g = dq0Var;
        this.h = dq0Var2;
        this.k = obj;
        this.i = i;
        this.j = ahVar;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        ah ahVar = this.j;
        int i2 = this.i;
        Object obj2 = this.k;
        dq0 dq0Var = this.h;
        dq0 dq0Var2 = this.g;
        switch (i) {
            case 0:
                jr jrVar = (jr) obj;
                if (dq0Var2 != ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zY = mh0.Y(dq0Var, (dq0) obj2, i2, ahVar);
                Boolean boolValueOf = Boolean.valueOf(zY);
                if (zY || !jrVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                jr jrVar2 = (jr) obj;
                if (dq0Var2 != ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zO = v83.o(i2, ahVar, dq0Var, (pe2) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zO);
                if (zO || !jrVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
