package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lx2 extends n0 {
    public static final lx2 f = new lx2(new Object[0]);
    public final Object[] e;

    public lx2(Object[] objArr) {
        this.e = objArr;
    }

    @Override // defpackage.u
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.n0
    public final n0 b(int i, Object obj) {
        Object[] objArr = this.e;
        gh0.r(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            yo.p0(objArr, objArr2, 0, i, 6);
            yo.n0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new lx2(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        yo.n0(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new x72(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.n0
    public final n0 c(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new lx2(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new x72(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.n0
    public final n0 d(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length > 32) {
            y72 y72VarE = e();
            y72VarE.addAll(collection);
            return y72VarE.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new lx2(objArrCopyOf);
    }

    @Override // defpackage.n0
    public final y72 e() {
        return new y72(this, null, this.e, 0);
    }

    @Override // defpackage.n0
    public final n0 f(m0 m0Var) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) m0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f : new lx2(yo.r0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.n0
    public final n0 g(int i) {
        Object[] objArr = this.e;
        gh0.q(i, objArr.length);
        if (objArr.length == 1) {
            return f;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        yo.n0(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new lx2(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.e;
        gh0.q(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.n0
    public final n0 h(int i, Object obj) {
        Object[] objArr = this.e;
        gh0.q(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new lx2(objArrCopyOf);
    }

    @Override // defpackage.g0, java.util.List
    public final int indexOf(Object obj) {
        return yo.y0(this.e, obj);
    }

    @Override // defpackage.g0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.g0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.e;
        gh0.r(i, objArr.length);
        return new yt(objArr, i, objArr.length);
    }
}
