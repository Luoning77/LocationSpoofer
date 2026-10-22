package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i8 extends aa1 implements lu0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(y7 y7Var, f8 f8Var, String str, u7 u7Var, ey1 ey1Var) {
        super(1);
        this.h = y7Var;
        this.i = f8Var;
        this.g = str;
        this.j = u7Var;
        this.k = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        Object obj2 = this.k;
        String str = this.g;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                y7 y7Var = (y7) obj5;
                y7Var.a = ((f8) obj4).c(str, (u7) obj3, new g8((ey1) obj2));
                return new h8(y7Var, 0);
            default:
                ya2 ya2Var = (ya2) obj5;
                ya2Var.t.addView(ya2Var, ya2Var.u);
                ya2Var.o((au0) obj4, (db2) obj3, str, (qa1) obj2);
                return new h8(ya2Var, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(ya2 ya2Var, au0 au0Var, db2 db2Var, String str, qa1 qa1Var) {
        super(1);
        this.h = ya2Var;
        this.i = au0Var;
        this.j = db2Var;
        this.g = str;
        this.k = qa1Var;
    }
}
