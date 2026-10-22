package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yk3 extends zk3 {
    public final WindowInsetsAnimation e;

    public yk3(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.zk3
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.zk3
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.zk3
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.zk3
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.zk3
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
