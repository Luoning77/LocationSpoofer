package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z72 extends h0 {
    public final Object[] g;
    public final yc3 h;

    public z72(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.g = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.h = new yc3(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b81.p();
            return null;
        }
        yc3 yc3Var = this.h;
        if (yc3Var.hasNext()) {
            this.e++;
            return yc3Var.next();
        }
        int i = this.e;
        this.e = i + 1;
        return this.g[i - yc3Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            b81.p();
            return null;
        }
        int i = this.e;
        yc3 yc3Var = this.h;
        int i2 = yc3Var.f;
        if (i <= i2) {
            this.e = i - 1;
            return yc3Var.previous();
        }
        int i3 = i - 1;
        this.e = i3;
        return this.g[i3 - i2];
    }
}
