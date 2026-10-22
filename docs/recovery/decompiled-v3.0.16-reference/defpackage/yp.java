package defpackage;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yp {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public yp(BackEvent backEvent) {
        sj sjVar = sj.a;
        float fD = sjVar.d(backEvent);
        float fE = sjVar.e(backEvent);
        float fB = sjVar.b(backEvent);
        int iC = sjVar.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return az2.o(sb, this.d, '}');
    }
}
