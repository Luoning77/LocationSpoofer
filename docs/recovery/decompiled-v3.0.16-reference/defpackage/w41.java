package defpackage;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class w41 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ z41 f;

    public /* synthetic */ w41(z41 z41Var, int i) {
        this.e = i;
        this.f = z41Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        z41 z41Var = this.f;
        switch (i) {
            case 0:
                jb1 jb1Var = (jb1) obj;
                jb1Var.getClass();
                float fFloatValue = ((Number) z41Var.e.d()).floatValue();
                if (fFloatValue > 0.0f) {
                    long j = hz.c;
                    jg0.c0(jb1Var, hz.c(0.06f * fFloatValue, j), 0L, 0L, 0.0f, null, 12, 62);
                    List listG = am1.G(new hz(hz.c(0.12f * fFloatValue, j)), new hz(hz.c(fFloatValue * 0.045f, j)), new hz(hz.f));
                    p2 p2Var = z41Var.b;
                    xv xvVar = jb1Var.e;
                    long j2 = ((c12) p2Var.invoke(new cw2(xvVar.a()), z41Var.f.d())).a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() >> 32));
                    if (fIntBitsToFloat < 0.0f) {
                        fIntBitsToFloat = 0.0f;
                    }
                    if (fIntBitsToFloat <= fIntBitsToFloat2) {
                        fIntBitsToFloat2 = fIntBitsToFloat;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L));
                    float f = fIntBitsToFloat3 >= 0.0f ? fIntBitsToFloat3 : 0.0f;
                    if (f <= fIntBitsToFloat4) {
                        fIntBitsToFloat4 = f;
                    }
                    jg0.P0(jb1Var, new kd2(listG, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), cw2.b(xvVar.a()) * 1.2f), 0L, 0L, 0.0f, null, 12, 62);
                }
                jb1Var.c();
                break;
            case 1:
                x92 x92Var = (x92) obj;
                x92Var.getClass();
                z41Var.g = x92Var.c;
                BuildersKt__Builders_commonKt.launch$default(z41Var.a, null, null, new y41(z41Var, q60Var, 0), 3, null);
                break;
            default:
                ((x92) obj).getClass();
                BuildersKt__Builders_commonKt.launch$default(z41Var.a, null, null, new y41(z41Var, q60Var, 1), 3, null);
                break;
        }
        return mf3Var;
    }
}
