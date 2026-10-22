package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class po implements Iterator, p81 {
    public int e;
    public int f;
    public boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public po(to toVar, int i) {
        this(toVar.g);
        this.h = i;
        switch (i) {
            case 1:
                this.i = toVar;
                this(toVar.g);
                break;
            default:
                this.i = toVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            b81.p();
            return null;
        }
        int i = this.f;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                objE = ((to) obj).e(i);
                break;
            case 1:
                objE = ((to) obj).h(i);
                break;
            default:
                objE = ((vo) obj).f[i];
                break;
        }
        this.f++;
        this.g = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            fo.n("Call next() before removing an element.");
            return;
        }
        int i = this.f - 1;
        this.f = i;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((to) obj).f(i);
                break;
            case 1:
                ((to) obj).f(i);
                break;
            default:
                ((vo) obj).a(i);
                break;
        }
        this.e--;
        this.g = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public po(vo voVar) {
        this(voVar.g);
        this.h = 2;
        this.i = voVar;
    }

    public po(int i) {
        this.e = i;
    }
}
