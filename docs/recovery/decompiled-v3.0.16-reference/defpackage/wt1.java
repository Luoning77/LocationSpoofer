package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wt1 {
    public final SparseArray a;
    public ee3 b;

    public wt1(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(ee3 ee3Var, int i, int i2) {
        int iA = ee3Var.a(i);
        SparseArray sparseArray = this.a;
        wt1 wt1Var = (wt1) sparseArray.get(iA);
        if (wt1Var == null) {
            wt1Var = new wt1(1);
            sparseArray.put(ee3Var.a(i), wt1Var);
        }
        if (i2 > i) {
            wt1Var.a(ee3Var, i + 1, i2);
        } else {
            wt1Var.b = ee3Var;
        }
    }
}
