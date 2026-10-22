package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class fr0 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile yy2 b = new yy2(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.b(115, new gr0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.b(130, new gr0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.b(150, new gr0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.b(180, new gr0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.b(200, new gr0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.e[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        r21.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static er0 a(float f) {
        float f2;
        er0 gr0Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        yy2 yy2Var = b;
        int i = (int) (f * 100.0f);
        yy2Var.getClass();
        er0 er0Var = (er0) sb.L(yy2Var, i);
        if (er0Var != null) {
            return er0Var;
        }
        yy2 yy2Var2 = b;
        int iX = xq1.x(yy2Var2.g, i, yy2Var2.e);
        if (iX >= 0) {
            return (er0) b.c(iX);
        }
        int i2 = -(iX + 1);
        int i3 = i2 - 1;
        if (i2 >= b.g) {
            gr0 gr0Var2 = new gr0(new float[]{1.0f}, new float[]{f});
            b(f, gr0Var2);
            return gr0Var2;
        }
        if (i3 < 0) {
            gr0Var = new gr0(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.e[i3] / 100.0f;
            gr0Var = (er0) b.c(i3);
        }
        float f3 = b.e[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        er0 er0Var2 = (er0) b.c(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = gr0Var.b(f4);
            fArr2[i4] = ((er0Var2.b(f4) - fB) * fMax) + fB;
        }
        gr0 gr0Var3 = new gr0(fArr, fArr2);
        b(f, gr0Var3);
        return gr0Var3;
    }

    public static void b(float f, gr0 gr0Var) {
        synchronized (c) {
            yy2 yy2VarA = b.clone();
            yy2VarA.b((int) (f * 100.0f), gr0Var);
            b = yy2VarA;
        }
    }
}
