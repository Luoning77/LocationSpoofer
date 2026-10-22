package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class y03 implements x03 {
    public final gp e = new gp(0);

    public final boolean e(int i) {
        return (this.e.get() & i) != 0;
    }

    public final void f(int i) {
        gp gpVar;
        int i2;
        do {
            gpVar = this.e;
            i2 = gpVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!gpVar.compareAndSet(i2, i2 | i));
    }
}
