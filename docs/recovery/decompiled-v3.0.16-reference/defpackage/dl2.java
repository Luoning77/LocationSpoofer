package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dl2 extends gl2 implements Iterator {
    public el2 e;
    public el2 f;
    public final /* synthetic */ int g;

    public dl2(el2 el2Var, el2 el2Var2, int i) {
        this.g = i;
        this.e = el2Var2;
        this.f = el2Var;
    }

    @Override // defpackage.gl2
    public final void a(el2 el2Var) {
        el2 el2Var2;
        el2 el2Var3 = this.e;
        el2 el2VarB = null;
        if (el2Var3 == el2Var && el2Var == this.f) {
            this.f = null;
            this.e = null;
            el2Var3 = null;
        }
        el2 el2Var4 = el2Var3;
        if (el2Var3 == el2Var) {
            switch (this.g) {
                case 0:
                    el2Var2 = el2Var3.h;
                    break;
                default:
                    el2Var2 = el2Var3.g;
                    break;
            }
            el2Var4 = el2Var2;
            this.e = el2Var4;
        }
        el2 el2Var5 = this.f;
        if (el2Var5 == el2Var) {
            if (el2Var5 != el2Var4 && el2Var4 != null) {
                el2VarB = b(el2Var5);
            }
            this.f = el2VarB;
        }
    }

    public final el2 b(el2 el2Var) {
        switch (this.g) {
            case 0:
                return el2Var.g;
            default:
                return el2Var.h;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        el2 el2Var = this.f;
        el2 el2Var2 = this.e;
        this.f = (el2Var == el2Var2 || el2Var2 == null) ? null : b(el2Var);
        return el2Var;
    }
}
