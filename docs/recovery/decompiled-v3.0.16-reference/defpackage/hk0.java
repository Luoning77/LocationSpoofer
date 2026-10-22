package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hk0 extends aa1 implements lu0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(we2 we2Var) {
        super(1);
        this.f = 4;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                return new p41((((long) ((int) (((p41) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 1:
                return new p41((((long) ((int) (((p41) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 2:
                return new p41((((long) ((int) (((p41) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 3:
                return new p41((((long) ((int) (((p41) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            default:
                ((ky0) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk0(int i, int i2) {
        super(i);
        this.f = i2;
    }
}
