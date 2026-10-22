package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class q61 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            StringBuilder sbR = p91.r(i, "Given job ID ", " is different than previous ");
            sbR.append(this.b);
            throw new IllegalArgumentException(sbR.toString());
        }
    }
}
