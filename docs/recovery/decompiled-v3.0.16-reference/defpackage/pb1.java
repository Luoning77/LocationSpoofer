package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pb1 implements h23 {
    public qa1 e = qa1.f;
    public float f;
    public float g;
    public final /* synthetic */ vb1 h;

    public pb1(vb1 vb1Var) {
        this.h = vb1Var;
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.g;
    }

    @Override // defpackage.g51
    public final boolean J() {
        db1 db1Var = this.h.e.L.d;
        return db1Var == db1.h || db1Var == db1.f;
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.f;
    }

    @Override // defpackage.g51
    public final qa1 getLayoutDirection() {
        return this.e;
    }

    @Override // defpackage.gr1
    public final fr1 m0(int i, int i2, Map map, lu0 lu0Var, lu0 lu0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            p21.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ob1(i, i2, map, lu0Var, this, this.h, lu0Var2);
    }

    @Override // defpackage.h23
    public final List z0(Object obj, pu0 pu0Var) {
        vb1 vb1Var = this.h;
        vb1Var.g();
        hb1 hb1Var = vb1Var.e;
        db1 db1Var = hb1Var.L.d;
        db1 db1Var2 = db1.g;
        db1 db1Var3 = db1.e;
        if (db1Var != db1Var3 && db1Var != db1Var2 && db1Var != db1.f && db1Var != db1.h) {
            p21.c("subcompose can only be used inside the measure or layout blocks");
        }
        zx1 zx1Var = vb1Var.k;
        Object objG = zx1Var.g(obj);
        if (objG == null) {
            objG = (hb1) vb1Var.n.k(obj);
            if (objG != null) {
                if (vb1Var.s <= 0) {
                    p21.c("Check failed.");
                }
                vb1Var.s--;
            } else {
                objG = vb1Var.n(obj);
                if (objG == null) {
                    int i = vb1Var.h;
                    hb1 hb1Var2 = new hb1(2);
                    hb1Var.v = true;
                    hb1Var.A(i, hb1Var2);
                    hb1Var.v = false;
                    objG = hb1Var2;
                }
            }
            zx1Var.m(obj, objG);
        }
        hb1 hb1Var3 = (hb1) objG;
        if (zy.p0(hb1Var.o(), vb1Var.h) != hb1Var3) {
            int i2 = ((gy1) ((qx1) hb1Var.o()).f).i(hb1Var3);
            if (i2 < vb1Var.h) {
                p21.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = vb1Var.h;
            if (i3 != i2) {
                vb1Var.j(i2, i3);
            }
        }
        vb1Var.h++;
        vb1Var.m(hb1Var3, obj, false, pu0Var);
        return (db1Var == db1Var3 || db1Var == db1Var2) ? hb1Var3.m() : hb1Var3.l();
    }
}
