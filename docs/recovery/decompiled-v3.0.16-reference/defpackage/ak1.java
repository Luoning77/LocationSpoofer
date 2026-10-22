package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ak1 implements xb0 {
    public boolean e;
    public long f = 9223372034707292159L;
    public long g = 0;
    public final /* synthetic */ ck1 h;

    public ak1(ck1 ck1Var) {
        this.h = ck1Var;
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.h.D();
    }

    public final void c(gy0 gy0Var, float f) {
        ck1 ck1Var = this.h;
        fk fkVar = ck1Var.q;
        if (fkVar == null) {
            fkVar = new fk();
            ck1Var.q = fkVar;
        }
        int iY0 = yo.y0((gy0[]) fkVar.c, gy0Var);
        if (iY0 >= 0) {
            float[] fArr = (float[]) fkVar.d;
            if (fArr[iY0] != f) {
                fArr[iY0] = f;
                ((byte[]) fkVar.e)[iY0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) fkVar.e;
                if (bArr[iY0] == 2) {
                    bArr[iY0] = 0;
                    return;
                }
                return;
            }
        }
        int i = fkVar.b;
        gy0[] gy0VarArr = (gy0[]) fkVar.c;
        if (i == gy0VarArr.length) {
            int i2 = i * 2;
            fkVar.c = (gy0[]) Arrays.copyOf(gy0VarArr, i2);
            fkVar.d = Arrays.copyOf((float[]) fkVar.d, i2);
            fkVar.e = Arrays.copyOf((byte[]) fkVar.e, i2);
        }
        ((gy0[]) fkVar.c)[i] = gy0Var;
        ((byte[]) fkVar.e)[i] = 3;
        ((float[]) fkVar.d)[i] = f;
        fkVar.b++;
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.h.g();
    }
}
