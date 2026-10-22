package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uq1 extends g0 {
    public final /* synthetic */ int e = 1;
    public final Object f;

    public uq1(List list) {
        list.getClass();
        this.f = list;
    }

    @Override // defpackage.u
    public final int a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((vq1) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                String strGroup = ((vq1) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(zy.y0(this, i));
        }
    }

    @Override // defpackage.g0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.e) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.g0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.e) {
            case 1:
                return new dh2(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.g0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.e) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.g0, java.util.List
    public ListIterator listIterator() {
        switch (this.e) {
            case 1:
                return new dh2(this, 0);
            default:
                return super.listIterator();
        }
    }

    public uq1(vq1 vq1Var) {
        this.f = vq1Var;
    }

    @Override // defpackage.g0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.e) {
            case 1:
                return new dh2(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
