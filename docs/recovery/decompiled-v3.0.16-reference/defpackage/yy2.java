package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yy2 implements Cloneable {
    public /* synthetic */ int[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public yy2(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.e = new int[i5];
        this.f = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yy2 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        yy2 yy2Var = (yy2) objClone;
        yy2Var.e = (int[]) this.e.clone();
        yy2Var.f = (Object[]) this.f.clone();
        return yy2Var;
    }

    public final void b(int i, Object obj) {
        int iX = xq1.x(this.g, i, this.e);
        if (iX >= 0) {
            this.f[iX] = obj;
            return;
        }
        int i2 = ~iX;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.f;
            if (objArr[i2] == sb.k0) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.e.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.e = Arrays.copyOf(this.e, i7);
            this.f = Arrays.copyOf(this.f, i7);
        }
        int i8 = this.g;
        if (i8 - i2 != 0) {
            int[] iArr = this.e;
            int i9 = i2 + 1;
            yo.k0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.f;
            yo.n0(objArr2, objArr2, i9, i2, this.g);
        }
        this.e[i2] = i;
        this.f[i2] = obj;
        this.g++;
    }

    public final Object c(int i) {
        Object[] objArr = this.f;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.g;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.e[i3]);
            sb.append('=');
            Object objC = c(i3);
            if (objC != this) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
