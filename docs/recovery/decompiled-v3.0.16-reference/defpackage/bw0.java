package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bw0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;

    public /* synthetic */ bw0(int i, lu0 lu0Var) {
        this.e = i;
        this.f = lu0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                rx2 rx2Var = (rx2) obj;
                synchronized (tx2.c) {
                    j = tx2.e;
                    tx2.e = 1 + j;
                }
                return new rd2(j, rx2Var, this.f);
            default:
                return this.f.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
