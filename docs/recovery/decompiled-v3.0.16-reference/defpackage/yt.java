package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yt extends h0 {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public yt(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    b81.p();
                    return null;
                }
                int i2 = this.e;
                this.e = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.e++;
                    return obj;
                }
                b81.p();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    b81.p();
                    return null;
                }
                int i2 = this.e - 1;
                this.e = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.e--;
                    return obj;
                }
                b81.p();
                return null;
        }
    }

    public yt(Object obj, int i) {
        super(i, 1);
        this.h = obj;
    }
}
