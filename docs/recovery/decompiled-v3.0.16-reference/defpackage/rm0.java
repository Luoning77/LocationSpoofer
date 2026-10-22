package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rm0 implements Iterable {
    public el2 e;
    public el2 f;
    public final WeakHashMap g = new WeakHashMap();
    public int h = 0;
    public final HashMap i = new HashMap();

    public final boolean equals(Object obj) {
        dl2 dl2Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rm0)) {
            return false;
        }
        rm0 rm0Var = (rm0) obj;
        if (this.h != rm0Var.h) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = rm0Var.iterator();
        while (true) {
            dl2Var = (dl2) it;
            if (!dl2Var.hasNext()) {
                break;
            }
            dl2 dl2Var2 = (dl2) it2;
            if (!dl2Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) dl2Var.next();
            Object next = dl2Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (dl2Var.hasNext() || ((dl2) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            dl2 dl2Var = (dl2) it;
            if (!dl2Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) dl2Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        dl2 dl2Var = new dl2(this.e, this.f, 0);
        this.g.put(dl2Var, Boolean.FALSE);
        return dl2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            dl2 dl2Var = (dl2) it;
            if (!dl2Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) dl2Var.next()).toString());
            if (dl2Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
