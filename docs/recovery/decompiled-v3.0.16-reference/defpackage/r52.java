package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class r52 {
    public final List a;
    public int b;

    public r52(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049 A[RETURN] */
    public Object a(ox oxVar) {
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.b);
        if (!oxVar.d(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.b < list.size() - 1) {
            this.b++;
        }
        if (obj != null) {
            return obj;
        }
        for (Object obj2 : list) {
            if (oxVar.d(obj2)) {
                if (obj2 != null) {
                    return obj2;
                }
                return null;
            }
        }
        obj2 = null;
        if (obj2 != null) {
            return obj2;
        }
        return null;
    }

    public final String toString() {
        return "DefinitionParameters" + zy.J0(this.a);
    }
}
