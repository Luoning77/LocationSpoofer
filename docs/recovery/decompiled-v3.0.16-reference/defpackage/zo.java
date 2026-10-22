package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zo implements Iterable, p81 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ zo(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return zm3.y((Object[]) obj);
            case 1:
                return new wg0(zm3.y((Object[]) ((hd) obj).f));
            default:
                return new ub0((vb0) obj);
        }
    }
}
