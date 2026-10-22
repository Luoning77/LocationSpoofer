package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vj1 implements Iterator, p81 {
    public final long e;
    public boolean f;
    public long g;

    public vj1(long j, long j2) {
        this.e = j2;
        boolean z = j <= j2;
        this.f = z;
        this.g = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j = this.g;
        if (j != this.e) {
            this.g = 1 + j;
            return j;
        }
        if (this.f) {
            this.f = false;
            return j;
        }
        b81.p();
        return 0L;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
