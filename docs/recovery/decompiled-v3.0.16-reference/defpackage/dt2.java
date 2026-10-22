package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dt2 implements bt2, yu {
    public final String a;
    public final mh0 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final bt2[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final bt2[] j;
    public final i43 k;

    public dt2(String str, mh0 mh0Var, int i, List list, px pxVar) {
        this.a = str;
        this.b = mh0Var;
        this.c = i;
        ArrayList arrayList = pxVar.b;
        HashSet hashSet = new HashSet(jq1.M(az.Y(arrayList, 12)));
        zy.G0(arrayList, hashSet);
        this.d = hashSet;
        int i2 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = xq1.B(pxVar.d);
        this.g = (List[]) pxVar.e.toArray(new List[0]);
        ArrayList arrayList2 = pxVar.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zArr[i2] = ((Boolean) obj).booleanValue();
            i2++;
        }
        this.h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        zo zoVar = new zo(new hd(strArr, 3), 1);
        ArrayList arrayList3 = new ArrayList(az.Y(zoVar, 10));
        Iterator it = zoVar.iterator();
        while (true) {
            wg0 wg0Var = (wg0) it;
            if (!wg0Var.f.hasNext()) {
                this.i = jq1.Q(arrayList3);
                this.j = xq1.B(list);
                this.k = new i43(new ol2(this, 6));
                return;
            }
            l11 l11Var = (l11) wg0Var.next();
            arrayList3.add(new i52(l11Var.b, Integer.valueOf(l11Var.a)));
        }
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.bt2
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bt2
    public final mh0 c() {
        return this.b;
    }

    @Override // defpackage.bt2
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dt2) {
            bt2 bt2Var = (bt2) obj;
            if (this.a.equals(bt2Var.b()) && Arrays.equals(this.j, ((dt2) obj).j)) {
                int iD = bt2Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        bt2[] bt2VarArr = this.f;
                        if (o51.f(bt2VarArr[i2].b(), bt2Var.i(i2).b()) && o51.f(bt2VarArr[i2].c(), bt2Var.i(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yu
    public final Set f() {
        return this.d;
    }

    @Override // defpackage.bt2
    public final List getAnnotations() {
        return uj0.e;
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        return this.f[i];
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        return this.h[i];
    }

    public final String toString() {
        return gh0.Q(this);
    }
}
