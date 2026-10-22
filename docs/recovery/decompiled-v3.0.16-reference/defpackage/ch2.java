package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAddress;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ch2 {
    public final e40 a;
    public long b;
    public Long c;
    public bh2 d;
    public Double e;
    public Double f;
    public CloudAddress g;
    public String h;

    public ch2(e40 e40Var) {
        this.a = e40Var;
    }

    public final boolean a(double d, double d2, double d3, double d4) {
        double dDoubleValue = ((Number) this.a.invoke(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4))).doubleValue();
        return Math.abs(dDoubleValue) <= Double.MAX_VALUE && dDoubleValue <= 500.0d;
    }
}
