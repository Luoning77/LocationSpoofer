package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class o0 extends od2 {
    @Override // defpackage.od2
    public final int a(int i) {
        return (e().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.od2
    public final int b() {
        return e().nextInt();
    }

    @Override // defpackage.od2
    public final int c(int i) {
        return e().nextInt(i);
    }

    public abstract Random e();
}
