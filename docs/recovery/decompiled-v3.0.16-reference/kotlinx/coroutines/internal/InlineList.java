package kotlinx.coroutines.internal;

import defpackage.ca0;
import defpackage.lu0;
import defpackage.o51;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class InlineList<E> {
    private final Object holder;

    private /* synthetic */ InlineList(Object obj) {
        this.holder = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineList m79boximpl(Object obj) {
        return new InlineList(obj);
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m81constructorimpl$default(Object obj, int i, ca0 ca0Var) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m80constructorimpl(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m82equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && o51.f(obj, ((InlineList) obj2).m88unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m83equalsimpl0(Object obj, Object obj2) {
        return o51.f(obj, obj2);
    }

    /* JADX INFO: renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m84forEachReversedimpl(Object obj, lu0 lu0Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lu0Var.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lu0Var.invoke(arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m85hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m86plusFjFbRPM(Object obj, E e) {
        if (obj == null) {
            return m80constructorimpl(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m80constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m80constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m87toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m82equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m85hashCodeimpl(this.holder);
    }

    public String toString() {
        return m87toStringimpl(this.holder);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m88unboximpl() {
        return this.holder;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m80constructorimpl(Object obj) {
        return obj;
    }
}
