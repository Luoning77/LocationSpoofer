package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qz {
    public static final float[] a;
    public static final float[] b;
    public static final yb3 c;
    public static final yb3 d;
    public static final jh2 e;
    public static final jh2 f;
    public static final jh2 g;
    public static final jh2 h;
    public static final jh2 i;
    public static final jh2 j;
    public static final jh2 k;
    public static final jh2 l;
    public static final jh2 m;
    public static final jh2 n;
    public static final jh2 o;
    public static final jh2 p;
    public static final jh2 q;
    public static final jh2 r;
    public static final z91 s;
    public static final z91 t;
    public static final jh2 u;
    public static final jh2 v;
    public static final jh2 w;
    public static final m12 x;
    public static final oz[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        yb3 yb3Var = new yb3(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        yb3 yb3Var2 = new yb3(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        yb3 yb3Var3 = new yb3(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = yb3Var3;
        yb3 yb3Var4 = new yb3(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = yb3Var4;
        gk3 gk3Var = k22.u;
        jh2 jh2Var = new jh2("sRGB IEC61966-2.1", fArr, gk3Var, yb3Var, 0);
        e = jh2Var;
        jh2 jh2Var2 = new jh2("sRGB IEC61966-2.1 (Linear)", fArr, gk3Var, 1.0d, 0.0f, 1.0f, 1);
        f = jh2Var2;
        jh2 jh2Var3 = new jh2("scRGB-nl IEC 61966-2-2:2003", fArr, gk3Var, null, new fo(9), new fo(10), -0.799f, 2.399f, yb3Var, 2);
        g = jh2Var3;
        jh2 jh2Var4 = new jh2("scRGB IEC 61966-2-2:2003", fArr, gk3Var, 1.0d, -0.5f, 7.499f, 3);
        h = jh2Var4;
        jh2 jh2Var5 = new jh2("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, gk3Var, new yb3(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = jh2Var5;
        jh2 jh2Var6 = new jh2("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, gk3Var, new yb3(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = jh2Var6;
        jh2 jh2Var7 = new jh2("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new gk3(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = jh2Var7;
        jh2 jh2Var8 = new jh2("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, gk3Var, yb3Var, 7);
        l = jh2Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        jh2 jh2Var9 = new jh2("NTSC (1953)", fArr2, k22.r, new yb3(d4, d5, d6, d2, d3), 8);
        m = jh2Var9;
        jh2 jh2Var10 = new jh2("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, gk3Var, new yb3(d4, d5, d6, d2, d3), 9);
        n = jh2Var10;
        jh2 jh2Var11 = new jh2("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, gk3Var, 2.2d, 0.0f, 1.0f, 10);
        o = jh2Var11;
        jh2 jh2Var12 = new jh2("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k22.s, new yb3(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = jh2Var12;
        gk3 gk3Var2 = k22.t;
        jh2 jh2Var13 = new jh2("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, gk3Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = jh2Var13;
        jh2 jh2Var14 = new jh2("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, gk3Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = jh2Var14;
        z91 z91Var = new z91(14, 1, 12884901889L, "Generic XYZ");
        s = z91Var;
        z91 z91Var2 = new z91(15, 0, 12884901890L, "Generic L*a*b*");
        t = z91Var2;
        jh2 jh2Var15 = new jh2("None", fArr, gk3Var, yb3Var2, 16);
        u = jh2Var15;
        jh2 jh2Var16 = new jh2("Hybrid Log Gamma encoding", fArr3, gk3Var, null, new fo(11), new fo(12), 0.0f, 1.0f, yb3Var3, 17);
        v = jh2Var16;
        jh2 jh2Var17 = new jh2("Perceptual Quantizer encoding", fArr3, gk3Var, null, new fo(13), new fo(14), 0.0f, 1.0f, yb3Var4, 18);
        w = jh2Var17;
        m12 m12Var = new m12("Oklab", 12884901890L, 19);
        x = m12Var;
        y = new oz[]{jh2Var, jh2Var2, jh2Var3, jh2Var4, jh2Var5, jh2Var6, jh2Var7, jh2Var8, jh2Var9, jh2Var10, jh2Var11, jh2Var12, jh2Var13, jh2Var14, z91Var, z91Var2, jh2Var15, jh2Var16, jh2Var17, m12Var};
    }

    public static double a(yb3 yb3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = yb3Var.b;
        double d6 = yb3Var.c;
        double d7 = yb3Var.d;
        double d8 = yb3Var.e;
        double d9 = yb3Var.f;
        double d10 = d5 * d4;
        return (yb3Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(yb3 yb3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / yb3Var.b;
        double d5 = 1.0d / yb3Var.c;
        double d6 = 1.0d / yb3Var.d;
        double d7 = yb3Var.e;
        double d8 = yb3Var.f;
        double d9 = (d2 * d3) / (yb3Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(yb3 yb3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = yb3Var.b;
        double d6 = yb3Var.d;
        double dPow = (Math.pow(d4, d6) * yb3Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * yb3Var.f) + yb3Var.e), yb3Var.g) * d3;
    }

    public static double d(yb3 yb3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -yb3Var.b;
        double d6 = yb3Var.e;
        double d7 = 1.0d / yb3Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-yb3Var.f)) + yb3Var.c), 1.0d / yb3Var.d) * d3;
    }
}
