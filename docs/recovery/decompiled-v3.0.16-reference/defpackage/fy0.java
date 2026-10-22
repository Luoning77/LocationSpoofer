package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fy0 extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gy0[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fy0(gy0[] gy0VarArr, int i) {
        super(2);
        this.f = i;
        this.g = gy0VarArr;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        gy0[] gy0VarArr = this.g;
        switch (i) {
            case 0:
                return Float.valueOf(dh0.x((g82) obj, true, gy0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(dh0.x((g82) obj, false, gy0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
