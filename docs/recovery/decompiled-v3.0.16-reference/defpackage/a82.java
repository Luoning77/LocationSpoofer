package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a82 extends h0 {
    public final y72 g;
    public int h;
    public yc3 i;
    public int j;

    public a82(y72 y72Var, int i) {
        super(i, y72Var.l);
        this.g = y72Var;
        this.h = y72Var.e();
        this.j = -1;
        b();
    }

    public final void a() {
        if (this.h != this.g.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.h0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.e;
        y72 y72Var = this.g;
        y72Var.add(i, obj);
        this.e++;
        this.f = y72Var.a();
        this.h = y72Var.e();
        this.j = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        y72 y72Var = this.g;
        Object[] objArr = y72Var.j;
        if (objArr == null) {
            this.i = null;
            return;
        }
        int i = (y72Var.l - 1) & (-32);
        int i2 = this.e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (y72Var.h / 5) + 1;
        yc3 yc3Var = this.i;
        if (yc3Var == null) {
            this.i = new yc3(objArr, i2, i, i3);
            return;
        }
        yc3Var.e = i2;
        yc3Var.f = i;
        yc3Var.g = i3;
        Object[] objArr2 = yc3Var.h;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            yc3Var.h = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        yc3Var.i = r0;
        yc3Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            b81.p();
            return null;
        }
        int i = this.e;
        this.j = i;
        yc3 yc3Var = this.i;
        y72 y72Var = this.g;
        if (yc3Var == null) {
            Object[] objArr = y72Var.k;
            this.e = i + 1;
            return objArr[i];
        }
        if (yc3Var.hasNext()) {
            this.e++;
            return yc3Var.next();
        }
        Object[] objArr2 = y72Var.k;
        int i2 = this.e;
        this.e = i2 + 1;
        return objArr2[i2 - yc3Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            b81.p();
            return null;
        }
        int i = this.e;
        this.j = i - 1;
        yc3 yc3Var = this.i;
        y72 y72Var = this.g;
        if (yc3Var == null) {
            Object[] objArr = y72Var.k;
            int i2 = i - 1;
            this.e = i2;
            return objArr[i2];
        }
        int i3 = yc3Var.f;
        if (i <= i3) {
            this.e = i - 1;
            return yc3Var.previous();
        }
        Object[] objArr2 = y72Var.k;
        int i4 = i - 1;
        this.e = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.h0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        y72 y72Var = this.g;
        y72Var.b(i);
        int i2 = this.j;
        if (i2 < this.e) {
            this.e = i2;
        }
        this.f = y72Var.a();
        this.h = y72Var.e();
        this.j = -1;
        b();
    }

    @Override // defpackage.h0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        y72 y72Var = this.g;
        y72Var.set(i, obj);
        this.h = y72Var.e();
        b();
    }
}
