package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class n92 implements bt2, yu {
    public final String a;
    public final uv0 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final zb1 i;
    public final zb1 j;
    public final zb1 k;

    public n92(String str, uv0 uv0Var, int i) {
        this.a = str;
        this.b = uv0Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = vj0.e;
        au0 au0Var = new au0(this) { // from class: m92
            public final /* synthetic */ n92 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                y81[] y81VarArrChildSerializers;
                ArrayList arrayList;
                y81[] y81VarArrTypeParametersSerializers;
                int i5 = i2;
                n92 n92Var = this.f;
                switch (i5) {
                    case 0:
                        uv0 uv0Var2 = n92Var.b;
                        return (uv0Var2 == null || (y81VarArrChildSerializers = uv0Var2.childSerializers()) == null) ? k22.w : y81VarArrChildSerializers;
                    case 1:
                        uv0 uv0Var3 = n92Var.b;
                        if (uv0Var3 == null || (y81VarArrTypeParametersSerializers = uv0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(y81VarArrTypeParametersSerializers.length);
                            for (y81 y81Var : y81VarArrTypeParametersSerializers) {
                                arrayList.add(y81Var.getDescriptor());
                            }
                        }
                        return xq1.B(arrayList);
                    default:
                        return Integer.valueOf(gh0.C(n92Var, (bt2[]) n92Var.j.getValue()));
                }
            }
        };
        ce1 ce1Var = ce1.f;
        this.i = ig0.A(ce1Var, au0Var);
        final int i5 = 1;
        this.j = ig0.A(ce1Var, new au0(this) { // from class: m92
            public final /* synthetic */ n92 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                y81[] y81VarArrChildSerializers;
                ArrayList arrayList;
                y81[] y81VarArrTypeParametersSerializers;
                int i6 = i5;
                n92 n92Var = this.f;
                switch (i6) {
                    case 0:
                        uv0 uv0Var2 = n92Var.b;
                        return (uv0Var2 == null || (y81VarArrChildSerializers = uv0Var2.childSerializers()) == null) ? k22.w : y81VarArrChildSerializers;
                    case 1:
                        uv0 uv0Var3 = n92Var.b;
                        if (uv0Var3 == null || (y81VarArrTypeParametersSerializers = uv0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(y81VarArrTypeParametersSerializers.length);
                            for (y81 y81Var : y81VarArrTypeParametersSerializers) {
                                arrayList.add(y81Var.getDescriptor());
                            }
                        }
                        return xq1.B(arrayList);
                    default:
                        return Integer.valueOf(gh0.C(n92Var, (bt2[]) n92Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = ig0.A(ce1Var, new au0(this) { // from class: m92
            public final /* synthetic */ n92 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                y81[] y81VarArrChildSerializers;
                ArrayList arrayList;
                y81[] y81VarArrTypeParametersSerializers;
                int i7 = i6;
                n92 n92Var = this.f;
                switch (i7) {
                    case 0:
                        uv0 uv0Var2 = n92Var.b;
                        return (uv0Var2 == null || (y81VarArrChildSerializers = uv0Var2.childSerializers()) == null) ? k22.w : y81VarArrChildSerializers;
                    case 1:
                        uv0 uv0Var3 = n92Var.b;
                        if (uv0Var3 == null || (y81VarArrTypeParametersSerializers = uv0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(y81VarArrTypeParametersSerializers.length);
                            for (y81 y81Var : y81VarArrTypeParametersSerializers) {
                                arrayList.add(y81Var.getDescriptor());
                            }
                        }
                        return xq1.B(arrayList);
                    default:
                        return Integer.valueOf(gh0.C(n92Var, (bt2[]) n92Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
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
        return u13.e;
    }

    @Override // defpackage.bt2
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n92) {
            bt2 bt2Var = (bt2) obj;
            if (this.a.equals(bt2Var.b()) && Arrays.equals((bt2[]) this.j.getValue(), (bt2[]) ((n92) obj).j.getValue())) {
                int iD = bt2Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (o51.f(i(i2).b(), bt2Var.i(i2).b()) && o51.f(i(i2).c(), bt2Var.i(i2).c())) {
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
        return this.h.keySet();
    }

    @Override // defpackage.bt2
    public final List getAnnotations() {
        return uj0.e;
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? uj0.e : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        return ((y81[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public final String toString() {
        return gh0.Q(this);
    }
}
