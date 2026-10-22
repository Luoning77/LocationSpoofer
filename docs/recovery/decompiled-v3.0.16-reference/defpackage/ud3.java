package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ud3 extends rd3 {
    public final /* synthetic */ int a;

    public /* synthetic */ ud3(int i) {
        this.a = i;
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(z71Var.k0());
            default:
                try {
                    return new AtomicInteger(z71Var.m0());
                } catch (NumberFormatException e) {
                    throw new l71(e);
                }
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                i81Var.n0(((AtomicBoolean) obj).get());
                break;
            default:
                i81Var.j0(((AtomicInteger) obj).get());
                break;
        }
    }
}
