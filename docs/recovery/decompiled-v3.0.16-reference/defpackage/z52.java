package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z52 implements pd2, na2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z52(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pd2
    public final zk2 b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((d62) obj).b;
            default:
                return ((ua2) obj).b;
        }
    }

    @Override // defpackage.na2
    public final Object d(String str, lu0 lu0Var, r60 r60Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((d62) obj).d(str, lu0Var, r60Var);
            default:
                return ((ua2) obj).d(str, lu0Var, r60Var);
        }
    }
}
