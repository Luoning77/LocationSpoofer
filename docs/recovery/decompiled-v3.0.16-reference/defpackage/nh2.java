package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nh2 extends g0 implements RandomAccess {
    public final Object[] e;
    public final int f;
    public int g;
    public int h;

    public nh2(Object[] objArr, int i) {
        this.e = objArr;
        if (i < 0) {
            fo.f(p91.l(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            fo.k(p91.r(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "), objArr.length);
            throw null;
        }
        this.f = objArr.length;
        this.h = i;
    }

    @Override // defpackage.u
    public final int a() {
        return this.h;
    }

    public final void b(int i) {
        if (i < 0) {
            fo.f(p91.l(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.h) {
            fo.k(p91.r(i, "n shouldn't be greater than the buffer size: n = ", ", size = "), this.h);
            return;
        }
        if (i > 0) {
            int i2 = this.g;
            int i3 = this.f;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.e;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.g = i4;
            this.h -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            fo.p(p91.n("index: ", i, i2, ", size: "));
            return null;
        }
        return this.e[(this.g + i) % this.f];
    }

    @Override // defpackage.g0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new mh2(this);
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.h;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.h;
        int i3 = this.g;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.e;
            if (i5 >= i2 || i3 >= this.f) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
