package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vv0 implements Iterator, p81 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final Object h;

    public vv0(cy1 cy1Var) {
        this.e = 2;
        this.h = cy1Var;
        this.f = -1;
        this.g = dh0.v(new by1(cy1Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.f;
        wv0 wv0Var = (wv0) this.h;
        if (i == -2) {
            objInvoke = ((au0) wv0Var.b).invoke();
        } else {
            lu0 lu0Var = (lu0) wv0Var.c;
            Object obj = this.g;
            obj.getClass();
            objInvoke = lu0Var.invoke(obj);
        }
        this.g = objInvoke;
        this.f = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                return this.f == 1;
            case 1:
                return ((vs2) this.g).hasNext();
            case 2:
                return ((vs2) this.g).hasNext();
            case 3:
                return this.f < ((Map) obj).size();
            default:
                d23 d23Var = (d23) obj;
                Iterator it = (Iterator) this.g;
                while (this.f < d23Var.b && it.hasNext()) {
                    it.next();
                    this.f++;
                }
                return this.f < d23Var.c && it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.h;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                if (this.f == 0) {
                    b81.p();
                    return null;
                }
                Object obj3 = this.g;
                obj3.getClass();
                this.f = -1;
                return obj3;
            case 1:
                return ((vs2) this.g).next();
            case 2:
                return ((vs2) this.g).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.g;
                    this.f++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.g = ((jg1) obj4).b;
                } else {
                    b81.p();
                }
                return obj2;
            default:
                d23 d23Var = (d23) obj;
                Iterator it = (Iterator) this.g;
                while (this.f < d23Var.b && it.hasNext()) {
                    it.next();
                    this.f++;
                }
                int i2 = this.f;
                if (i2 < d23Var.c) {
                    this.f = i2 + 1;
                    return it.next();
                }
                b81.p();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f;
                if (i2 != -1) {
                    ((vx1) obj).f.h(i2);
                    this.f = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.f;
                if (i3 != -1) {
                    ((cy1) obj).f.m(i3);
                    this.f = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vv0(d23 d23Var) {
        this.e = 4;
        this.h = d23Var;
        this.g = d23Var.a.iterator();
    }

    public vv0(wv0 wv0Var) {
        this.e = 0;
        this.h = wv0Var;
        this.f = -2;
    }

    public vv0(Object obj, Map map) {
        this.e = 3;
        this.g = obj;
        this.h = map;
    }

    public vv0(vx1 vx1Var) {
        this.e = 1;
        this.h = vx1Var;
        this.f = -1;
        this.g = dh0.v(new ux1(vx1Var, this, null));
    }
}
