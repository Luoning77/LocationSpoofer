package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dt {
    public final gy1 a;

    public dt(int i) {
        switch (i) {
            case 1:
                this.a = new gy1(new cc1[16]);
                break;
            default:
                this.a = new gy1(new x50[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        gy1 gy1Var = this.a;
        int i = gy1Var.g;
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[i];
        for (int i2 = 0; i2 < i; i2++) {
            cancellableContinuationArr[i2] = ((x50) gy1Var.e[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            cancellableContinuationArr[i3].cancel(cancellationException);
        }
        if (gy1Var.g == 0) {
            return;
        }
        s21.c("uncancelled requests present");
    }

    public void b() {
        gy1 gy1Var = this.a;
        k41 k41VarF0 = mh0.f0(0, gy1Var.g);
        int i = k41VarF0.e;
        int i2 = k41VarF0.f;
        if (i <= i2) {
            while (true) {
                ((x50) gy1Var.e[i]).b.resumeWith(mf3.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        gy1Var.g();
    }
}
