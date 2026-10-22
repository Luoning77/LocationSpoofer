package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class in0 implements Iterator, p81 {
    public final /* synthetic */ int e;
    public final Iterator f;
    public int g;
    public Object h;
    public final /* synthetic */ us2 i;

    public in0(jn0 jn0Var) {
        this.e = 0;
        this.i = jn0Var;
        this.f = jn0Var.a.iterator();
        this.g = -1;
    }

    public void a() {
        Object next;
        jn0 jn0Var = (jn0) this.i;
        do {
            Iterator it = this.f;
            if (!it.hasNext()) {
                this.g = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) jn0Var.c.invoke(next)).booleanValue() != jn0Var.b);
        this.h = next;
        this.g = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.h;
        if (it2 != null && it2.hasNext()) {
            this.g = 1;
            return true;
        }
        do {
            Iterator it3 = this.f;
            if (!it3.hasNext()) {
                this.g = 2;
                this.h = null;
                return false;
            }
            Object next = it3.next();
            qn0 qn0Var = (qn0) this.i;
            it = (Iterator) qn0Var.c.invoke(qn0Var.b.invoke(next));
        } while (!it.hasNext());
        this.h = it;
        this.g = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.g == -1) {
                    a();
                }
                return this.g == 1;
            default:
                int i = this.g;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.g == -1) {
                    a();
                }
                if (this.g == 0) {
                    b81.p();
                    return null;
                }
                Object obj = this.h;
                this.h = null;
                this.g = -1;
                return obj;
            default:
                int i = this.g;
                if (i == 2) {
                    b81.p();
                    return null;
                }
                if (i == 0 && !b()) {
                    b81.p();
                    return null;
                }
                this.g = 0;
                Iterator it = (Iterator) this.h;
                it.getClass();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public in0(qn0 qn0Var) {
        this.e = 1;
        this.i = qn0Var;
        this.f = qn0Var.a.iterator();
    }
}
