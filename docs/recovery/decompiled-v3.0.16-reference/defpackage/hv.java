package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hv implements Runnable {
    public final /* synthetic */ int e;

    public hv(us1 us1Var, int i) {
        this.e = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                return;
            case 1:
                try {
                    int i = rb3.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (wi0.d()) {
                        wi0.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i2 = rb3.a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    public /* synthetic */ hv(int i) {
        this.e = i;
    }

    private final void a() {
    }

    private final void b() {
    }
}
