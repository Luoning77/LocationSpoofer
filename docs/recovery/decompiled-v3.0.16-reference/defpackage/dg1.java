package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dg1 implements bt2 {
    public final bt2 a;
    public final bt2 b;

    public dg1(bt2 bt2Var, bt2 bt2Var2) {
        bt2Var.getClass();
        bt2Var2.getClass();
        this.a = bt2Var;
        this.b = bt2Var2;
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        Integer numA0 = s13.a0(str);
        if (numA0 != null) {
            return numA0.intValue();
        }
        fo.i(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.bt2
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // defpackage.bt2
    public final mh0 c() {
        return u13.g;
    }

    @Override // defpackage.bt2
    public final int d() {
        return 2;
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg1)) {
            return false;
        }
        dg1 dg1Var = (dg1) obj;
        return o51.f(this.a, dg1Var.a) && o51.f(this.b, dg1Var.b);
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        if (i >= 0) {
            return uj0.e;
        }
        fo.f(p91.m(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        if (i < 0) {
            fo.f(p91.m(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        fo.n("Unreached");
        return null;
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        fo.f(p91.m(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
