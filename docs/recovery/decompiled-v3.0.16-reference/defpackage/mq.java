package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class mq {
    public static final kq c = new kq(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new mq(-1, true, false);
        new mq(76, false, true);
        new mq(64, false, true);
    }

    public mq(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            fo.i("Failed requirement.");
            throw null;
        }
    }
}
