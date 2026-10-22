package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wv0 implements us2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wv0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new vv0(this);
            default:
                us2 us2Var = (us2) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = us2Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                ez.Z(arrayList, (Comparator) this.c);
                return arrayList.iterator();
        }
    }
}
