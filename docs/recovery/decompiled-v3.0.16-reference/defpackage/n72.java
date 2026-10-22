package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class n72 implements Iterator, p81 {
    public final ad3[] e;
    public int f;
    public boolean g = true;

    public n72(zc3 zc3Var, ad3[] ad3VarArr) {
        this.e = ad3VarArr;
        ad3VarArr[0].a(zc3Var.d, Integer.bitCount(zc3Var.a) * 2, 0);
        this.f = 0;
        a();
    }

    public final void a() {
        int i = this.f;
        ad3[] ad3VarArr = this.e;
        ad3 ad3Var = ad3VarArr[i];
        if (ad3Var.g < ad3Var.f) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                ad3 ad3Var2 = ad3VarArr[i];
                int i2 = ad3Var2.g;
                Object[] objArr = ad3Var2.e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    ad3Var2.g = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.f = iB;
                return;
            }
            if (i > 0) {
                ad3 ad3Var3 = ad3VarArr[i - 1];
                int i3 = ad3Var3.g;
                int length2 = ad3Var3.e.length;
                ad3Var3.g = i3 + 1;
            }
            ad3VarArr[i].a(zc3.e.d, 0, 0);
            i--;
        }
        this.g = false;
    }

    public final int b(int i) {
        ad3[] ad3VarArr = this.e;
        ad3 ad3Var = ad3VarArr[i];
        int i2 = ad3Var.g;
        if (i2 < ad3Var.f) {
            return i;
        }
        Object[] objArr = ad3Var.e;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        zc3 zc3Var = (zc3) obj;
        if (i == 6) {
            ad3 ad3Var2 = ad3VarArr[i + 1];
            Object[] objArr2 = zc3Var.d;
            ad3Var2.a(objArr2, objArr2.length, 0);
        } else {
            ad3VarArr[i + 1].a(zc3Var.d, Integer.bitCount(zc3Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.g) {
            b81.p();
            return null;
        }
        Object next = this.e[this.f].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
