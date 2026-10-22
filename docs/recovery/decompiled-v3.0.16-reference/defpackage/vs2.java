package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vs2 extends ws2 implements Iterator, q60, p81 {
    public int e;
    public Object f;
    public q60 g;

    @Override // defpackage.ws2
    public final void a(Object obj, q60 q60Var) {
        this.f = obj;
        this.e = 3;
        this.g = q60Var;
        q60Var.getClass();
    }

    public final RuntimeException b() {
        int i = this.e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.e);
    }

    @Override // defpackage.q60
    public final y70 getContext() {
        return sj0.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.e;
            if (i != 0) {
                break;
            }
            this.e = 5;
            q60 q60Var = this.g;
            q60Var.getClass();
            this.g = null;
            q60Var.resumeWith(mf3.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            b81.p();
            return null;
        }
        if (i == 2) {
            this.e = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.e = 0;
        Object obj = this.f;
        this.f = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.q60
    public final void resumeWith(Object obj) {
        ee0.J(obj);
        this.e = 4;
    }
}
