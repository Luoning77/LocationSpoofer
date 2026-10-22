package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class n0 extends g0 {
    public abstract n0 b(int i, Object obj);

    public abstract n0 c(Object obj);

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public n0 d(Collection collection) {
        y72 y72VarE = e();
        y72VarE.addAll(collection);
        return y72VarE.c();
    }

    public abstract y72 e();

    public abstract n0 f(m0 m0Var);

    public abstract n0 g(int i);

    public abstract n0 h(int i, Object obj);

    @Override // defpackage.g0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.g0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.g0, java.util.List
    public final List subList(int i, int i2) {
        return new e11(this, i, i2);
    }
}
