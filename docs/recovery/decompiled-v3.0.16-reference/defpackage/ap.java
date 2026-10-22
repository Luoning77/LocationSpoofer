package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ap implements us2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new d0((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return dh0.v((pu0) obj);
            case 3:
                return (Iterator) obj;
            case 4:
                return new zs2((Class) obj);
            default:
                return new yf1((CharSequence) obj);
        }
    }
}
