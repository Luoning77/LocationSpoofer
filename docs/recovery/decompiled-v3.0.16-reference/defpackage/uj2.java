package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uj2 {
    public final ArrayList a;
    public final double[] b;
    public final double c;
    public final boolean d;

    public uj2(ArrayList arrayList) {
        double d;
        this.a = arrayList;
        int size = arrayList.size();
        double[] dArr = new double[size];
        int size2 = arrayList.size();
        for (int i = 1; i < size2; i++) {
            int i2 = i - 1;
            dArr[i] = vd0.o((z60) this.a.get(i2), (z60) this.a.get(i)) + dArr[i2];
        }
        this.b = dArr;
        if (this.a.isEmpty()) {
            d = 0.0d;
        } else {
            if (size == 0) {
                b81.y("Array is empty.");
                throw null;
            }
            d = dArr[size - 1];
        }
        this.c = d;
        this.d = this.a.size() >= 2 && vd0.o((z60) zy.n0(this.a), (z60) zy.t0(this.a)) <= 5.0d;
    }

    public final boolean a() {
        return this.a.size() >= 2 && this.c > 0.0d;
    }

    public final tj2 b(double d, boolean z) {
        double d2;
        double[] dArr;
        if (!a()) {
            fo.i("route needs at least two distinct points");
            return null;
        }
        double d3 = d >= 0.0d ? d : 0.0d;
        double d4 = this.c;
        ArrayList arrayList = this.a;
        if (z && d3 >= d4) {
            z60 z60Var = (z60) zy.t0(arrayList);
            return new tj2(z60Var.a, z60Var.b, vd0.g((z60) arrayList.get(arrayList.size() - 2), z60Var), true);
        }
        int i = 0;
        boolean z2 = true;
        if (this.d) {
            d2 = d3 % d4;
        } else {
            double d5 = 2.0d * d4;
            d2 = d3 % d5;
            z2 = d2 <= d4;
            if (!z2) {
                d2 = d5 - d2;
            }
        }
        while (true) {
            int size = arrayList.size() - 2;
            dArr = this.b;
            if (i >= size) {
                break;
            }
            int i2 = i + 1;
            if (dArr[i2] >= d2) {
                break;
            }
            i = i2;
        }
        z60 z60Var2 = (z60) arrayList.get(i);
        int i3 = i + 1;
        z60 z60Var3 = (z60) arrayList.get(i3);
        double d6 = dArr[i3];
        double d7 = dArr[i];
        double d8 = d6 - d7;
        if (d8 < 1.0E-4d) {
            d8 = 1.0E-4d;
        }
        double dT = mh0.t((d2 - d7) / d8, 0.0d, 1.0d);
        float fG = z2 ? vd0.g(z60Var2, z60Var3) : vd0.g(z60Var3, z60Var2);
        double d9 = z60Var2.a;
        double d10 = ((z60Var3.a - d9) * dT) + d9;
        double d11 = z60Var2.b;
        return new tj2(d10, ((z60Var3.b - d11) * dT) + d11, fG, false);
    }
}
