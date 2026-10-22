package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class v82 extends CancellationException {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v82(String str, int i) {
        super(str);
        this.e = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.e) {
            case 0:
                setStackTrace(n51.I);
                break;
            case 1:
                setStackTrace(xp1.j);
                break;
            default:
                setStackTrace(o51.o0);
                break;
        }
        return this;
    }
}
