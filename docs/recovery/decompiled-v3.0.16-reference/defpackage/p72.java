package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class p72 extends n72 {
    public final o72 h;
    public Object i;
    public boolean j;
    public int k;

    public p72(o72 o72Var, ad3[] ad3VarArr) {
        super(o72Var.g, ad3VarArr);
        this.h = o72Var;
        this.k = o72Var.i;
    }

    public final void c(int i, zc3 zc3Var, Object obj, int i2) {
        int i3 = i2 * 5;
        ad3[] ad3VarArr = this.e;
        if (i3 <= 30) {
            int iD = 1 << a83.d(i, i3);
            if (zc3Var.h(iD)) {
                ad3VarArr[i2].a(zc3Var.d, Integer.bitCount(zc3Var.a) * 2, zc3Var.f(iD));
                this.f = i2;
                return;
            } else {
                int iT = zc3Var.t(iD);
                zc3 zc3VarS = zc3Var.s(iT);
                ad3VarArr[i2].a(zc3Var.d, Integer.bitCount(zc3Var.a) * 2, iT);
                c(i, zc3VarS, obj, i2 + 1);
                return;
            }
        }
        ad3 ad3Var = ad3VarArr[i2];
        Object[] objArr = zc3Var.d;
        ad3Var.a(objArr, objArr.length, 0);
        while (true) {
            ad3 ad3Var2 = ad3VarArr[i2];
            if (o51.f(ad3Var2.e[ad3Var2.g], obj)) {
                this.f = i2;
                return;
            } else {
                ad3VarArr[i2].g += 2;
            }
        }
    }

    @Override // defpackage.n72, java.util.Iterator
    public final Object next() {
        if (this.h.i != this.k) {
            throw new ConcurrentModificationException();
        }
        if (!this.g) {
            b81.p();
            return null;
        }
        ad3 ad3Var = this.e[this.f];
        this.i = ad3Var.e[ad3Var.g];
        this.j = true;
        return super.next();
    }

    @Override // defpackage.n72, java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        boolean z = this.g;
        o72 o72Var = this.h;
        if (!z) {
            da0.l(o72Var).remove(this.i);
        } else {
            if (!z) {
                b81.p();
                return;
            }
            ad3 ad3Var = this.e[this.f];
            Object obj = ad3Var.e[ad3Var.g];
            da0.l(o72Var).remove(this.i);
            c(obj != null ? obj.hashCode() : 0, o72Var.g, obj, 0);
        }
        this.i = null;
        this.j = false;
        this.k = o72Var.i;
    }
}
