package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zs2 implements Iterator, p81 {
    public boolean e = true;
    public final /* synthetic */ Class f;

    public zs2(Class cls) {
        this.f = cls;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            return this.f;
        }
        b81.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
