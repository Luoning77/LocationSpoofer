package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w01 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final v01 j;
    public boolean k;

    public w01(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? hz.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        v01 v01Var = new v01(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = v01Var;
        arrayList.add(v01Var);
    }

    public static void a(w01 w01Var, ArrayList arrayList, qy2 qy2Var) {
        if (w01Var.k) {
            p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = w01Var.i;
        ((v01) arrayList2.get(arrayList2.size() - 1)).j.add(new qh3("", arrayList, 0, qy2Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final x01 b() {
        if (this.k) {
            p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                v01 v01Var = this.j;
                x01 x01Var = new x01(this.a, this.b, this.c, this.d, this.e, new mh3(v01Var.a, v01Var.b, v01Var.c, v01Var.d, v01Var.e, v01Var.f, v01Var.g, v01Var.h, v01Var.i, v01Var.j), this.f, this.g, this.h);
                this.k = true;
                return x01Var;
            }
            if (this.k) {
                p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            v01 v01Var2 = (v01) arrayList.remove(arrayList.size() - 1);
            ((v01) arrayList.get(arrayList.size() - 1)).j.add(new mh3(v01Var2.a, v01Var2.b, v01Var2.c, v01Var2.d, v01Var2.e, v01Var2.f, v01Var2.g, v01Var2.h, v01Var2.i, v01Var2.j));
        }
    }
}
