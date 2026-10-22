package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gc2 implements df1 {
    public static final gc2 m = new gc2();
    public int e;
    public int f;
    public Handler i;
    public boolean g = true;
    public boolean h = true;
    public final ff1 j = new ff1(this, true);
    public final w k = new w(this, 12);
    public final us1 l = new us1(this, 6);

    public final void a() {
        int i = this.f + 1;
        this.f = i;
        if (i == 1) {
            if (this.g) {
                this.j.e(ve1.ON_RESUME);
                this.g = false;
            } else {
                Handler handler = this.i;
                handler.getClass();
                handler.removeCallbacks(this.k);
            }
        }
    }

    @Override // defpackage.df1
    public final xe1 getLifecycle() {
        return this.j;
    }
}
