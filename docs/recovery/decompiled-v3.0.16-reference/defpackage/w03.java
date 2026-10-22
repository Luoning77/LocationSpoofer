package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w03 implements Iterator, p81 {
    public final hy2 e;
    public final Iterator f;
    public int g;
    public Map.Entry h;
    public Map.Entry i;
    public final /* synthetic */ int j;

    public w03(hy2 hy2Var, Iterator it, int i) {
        this.j = i;
        this.e = hy2Var;
        this.f = it;
        this.g = hy2Var.e().d;
        a();
    }

    public final void a() {
        this.h = this.i;
        Iterator it = this.f;
        this.i = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                a();
                if (this.h != null) {
                    return new v03(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.i;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.i;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        hy2 hy2Var = this.e;
        if (hy2Var.e().d != this.g) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.h;
        if (entry == null) {
            throw new IllegalStateException();
        }
        hy2Var.remove(entry.getKey());
        this.h = null;
        this.g = hy2Var.e().d;
    }
}
