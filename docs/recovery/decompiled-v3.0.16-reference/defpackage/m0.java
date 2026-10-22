package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class m0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Collection f;

    public /* synthetic */ m0(int i, Collection collection) {
        this.e = i;
        this.f = collection;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.e;
        Collection<?> collection = this.f;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
