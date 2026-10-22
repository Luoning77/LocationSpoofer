package defpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bz implements Iterator, p81 {
    public final /* synthetic */ int e = 0;
    public final Object f;

    public bz(o72 o72Var) {
        ad3[] ad3VarArr = new ad3[8];
        for (int i = 0; i < 8; i++) {
            ad3VarArr[i] = new cd3(this);
        }
        this.f = new p72(o72Var, ad3VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((Enumeration) obj).hasMoreElements();
            case 1:
                return ((p72) obj).g;
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((Enumeration) obj).nextElement();
            case 1:
                return (Map.Entry) ((p72) obj).next();
            default:
                return (oh3) ((Iterator) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((p72) this.f).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bz(Enumeration enumeration) {
        this.f = enumeration;
    }

    public bz(mh3 mh3Var) {
        this.f = mh3Var.n.iterator();
    }
}
