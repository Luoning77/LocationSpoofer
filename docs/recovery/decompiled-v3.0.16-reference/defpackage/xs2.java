package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xs2 extends ys2 {
    public static us2 N(Iterator it) {
        it.getClass();
        return new k50(new ap(it, 3));
    }

    public static jn0 O(us2 us2Var, lu0 lu0Var) {
        us2Var.getClass();
        lu0Var.getClass();
        return new jn0(us2Var, true, lu0Var);
    }

    public static Object P(jn0 jn0Var) {
        in0 in0Var = new in0(jn0Var);
        if (in0Var.hasNext()) {
            return in0Var.next();
        }
        return null;
    }

    public static us2 Q(lu0 lu0Var, Object obj) {
        return obj == null ? yj0.a : new wv0(0, new ol2(obj, 5), lu0Var);
    }

    public static String R(us2 us2Var, String str) {
        us2Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : us2Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            dh0.j(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static jn0 S(us2 us2Var, lu0 lu0Var) {
        return new jn0(new dc3(us2Var, lu0Var), false, new ym2(17));
    }

    public static us2 T(us2 us2Var, int i) {
        if (i < 0) {
            fo.f(p91.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return yj0.a;
        }
        return us2Var instanceof yg0 ? ((yg0) us2Var).a(i) : new xg0(us2Var, i, 1);
    }

    public static List U(us2 us2Var) {
        us2Var.getClass();
        Iterator it = us2Var.iterator();
        if (!it.hasNext()) {
            return uj0.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return am1.F(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set V(us2 us2Var) {
        Iterator it = us2Var.iterator();
        if (!it.hasNext()) {
            return zj0.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return mc0.H(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
