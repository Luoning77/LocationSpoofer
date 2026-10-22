package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dj implements CharSequence {
    public final List e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;

    static {
        z92 z92Var = an2.a;
    }

    public dj(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.e = list;
        this.f = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                cj cjVar = (cj) list.get(i);
                Object obj = cjVar.a;
                if (obj instanceof uy2) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cjVar);
                } else if (obj instanceof p52) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cjVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.g = arrayList;
        this.h = arrayList2;
        List listC0 = arrayList2 != null ? zy.C0(arrayList2, new gq0(5)) : null;
        if (listC0 == null || listC0.isEmpty()) {
            return;
        }
        int i2 = ((cj) zy.n0(listC0)).c;
        fx1 fx1Var = e41.a;
        fx1 fx1Var2 = new fx1(1);
        fx1Var2.a(i2);
        int size2 = listC0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            cj cjVar2 = (cj) listC0.get(i3);
            while (true) {
                int i4 = fx1Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    b81.y("IntList is empty.");
                    throw null;
                }
                int i5 = fx1Var2.a[i4 - 1];
                int i6 = cjVar2.b;
                int i7 = cjVar2.c;
                if (i6 < i5) {
                    if (i7 > i5) {
                        q21.a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                        break;
                    }
                    break;
                }
                fx1Var2.d(i4 - 1);
            }
            fx1Var2.a(cjVar2.c);
        }
    }

    public final List a(int i) {
        List list = this.e;
        if (list == null) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            cj cjVar = (cj) obj;
            if ((cjVar.a instanceof bg1) && ej.b(0, i, cjVar.b, cjVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final dj b(lu0 lu0Var) {
        bj bjVar = new bj(this);
        ArrayList arrayList = bjVar.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cj cjVar = (cj) lu0Var.invoke(((aj) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new aj(cjVar.b, cjVar.c, cjVar.a, cjVar.d));
        }
        return bjVar.g();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dj subSequence(int i, int i2) {
        if (!(i <= i2)) {
            q21.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        dj djVar = ej.a;
        if (i > i2) {
            q21.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.e;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                cj cjVar = (cj) list.get(i3);
                int i4 = cjVar.b;
                int i5 = cjVar.c;
                if (ej.b(i, i2, i4, i5)) {
                    arrayList2.add(new cj(Math.max(i, cjVar.b) - i, Math.min(i2, i5) - i, cjVar.a, cjVar.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new dj(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return false;
        }
        dj djVar = (dj) obj;
        return o51.f(this.f, djVar.f) && o51.f(this.e, djVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f;
    }

    public /* synthetic */ dj(String str) {
        this(str, uj0.e);
    }

    public dj(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
