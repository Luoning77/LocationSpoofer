package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eo extends ee0 {
    public static volatile eo h;
    public static final co i = new co(0);
    public final bb0 g = new bb0();

    public static eo L() {
        if (h != null) {
            return h;
        }
        synchronized (eo.class) {
            try {
                if (h == null) {
                    h = new eo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }
}
