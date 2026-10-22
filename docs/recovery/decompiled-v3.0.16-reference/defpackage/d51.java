package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d51 {
    public final int a;
    public final int b;
    public final gn c;

    public d51(int i, int i2, gn gnVar) {
        this.a = i;
        this.b = i2;
        this.c = gnVar;
        if (i < 0) {
            s21.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        s21.a("size should be > 0");
    }
}
