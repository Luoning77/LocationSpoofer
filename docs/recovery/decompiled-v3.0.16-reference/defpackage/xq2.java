package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xq2 {
    public static final vi a = new vi(Float.NaN, Float.NaN);
    public static final qd3 b = new qd3(new ym2(11), new ym2(12));
    public static final long c;
    public static final yz2 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new yz2(new c12(jFloatToRawIntBits), 3);
    }
}
