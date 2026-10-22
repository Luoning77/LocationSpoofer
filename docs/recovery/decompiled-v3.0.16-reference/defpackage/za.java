package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class za extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za(int i, int i2) {
        super(1);
        this.f = i2;
        this.g = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                return Boolean.valueOf(((dq0) obj).t1(i2));
            case 1:
                return Boolean.valueOf(((dq0) obj).t1(i2));
            case 2:
                return Boolean.valueOf(((dq0) obj).t1(i2));
            case 3:
                return Boolean.valueOf(((dq0) obj).t1(i2));
            default:
                return Boolean.valueOf(((dq0) obj).m1(i2));
        }
    }
}
