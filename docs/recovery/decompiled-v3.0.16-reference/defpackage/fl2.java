package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fl2 extends gl2 implements Iterator {
    public el2 e;
    public boolean f = true;
    public final /* synthetic */ rm0 g;

    public fl2(rm0 rm0Var) {
        this.g = rm0Var;
    }

    @Override // defpackage.gl2
    public final void a(el2 el2Var) {
        el2 el2Var2 = this.e;
        if (el2Var == el2Var2) {
            el2 el2Var3 = el2Var2.h;
            this.e = el2Var3;
            this.f = el2Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f) {
            return this.g.e != null;
        }
        el2 el2Var = this.e;
        return (el2Var == null || el2Var.g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f) {
            this.f = false;
            el2 el2Var = this.g.e;
            this.e = el2Var;
            return el2Var;
        }
        el2 el2Var2 = this.e;
        el2 el2Var3 = el2Var2 != null ? el2Var2.g : null;
        this.e = el2Var3;
        return el2Var3;
    }
}
