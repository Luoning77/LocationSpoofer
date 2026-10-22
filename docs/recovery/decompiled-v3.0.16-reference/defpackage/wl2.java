package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wl2 implements tl2, tm2 {
    public final /* synthetic */ ul2 e;
    public ff1 f;
    public rm2 g;

    public wl2(ul2 ul2Var) {
        this.e = ul2Var;
        Object objD = ul2Var.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objD instanceof Bundle ? (Bundle) objD : null;
        if (bundle != null && this.g == null) {
            rm2 rm2Var = new rm2(new sm2(this, new ol2(this, 3)));
            this.g = rm2Var;
            rm2Var.a(bundle);
        }
        ul2Var.a("androidx.savedstate.SavedStateRegistry", new ol2(this, 1));
    }

    @Override // defpackage.tl2
    public final sl2 a(String str, au0 au0Var) {
        return this.e.a(str, au0Var);
    }

    @Override // defpackage.tl2
    public final boolean b(Object obj) {
        return this.e.b(obj);
    }

    @Override // defpackage.tl2
    public final Map c() {
        return this.e.c();
    }

    @Override // defpackage.tl2
    public final Object d(String str) {
        return this.e.d(str);
    }

    @Override // defpackage.df1
    public final xe1 getLifecycle() {
        ff1 ff1Var = this.f;
        if (ff1Var != null) {
            return ff1Var;
        }
        ff1 ff1Var2 = new ff1(this, false);
        this.f = ff1Var2;
        return ff1Var2;
    }

    @Override // defpackage.tm2
    public final qm2 getSavedStateRegistry() {
        rm2 rm2Var = this.g;
        if (rm2Var == null) {
            rm2 rm2Var2 = new rm2(new sm2(this, new ol2(this, 3)));
            this.g = rm2Var2;
            rm2Var2.a(null);
            rm2Var = rm2Var2;
        }
        return rm2Var.b;
    }
}
