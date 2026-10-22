package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ng1 implements bt2 {
    public final bt2 a;

    public ng1(bt2 bt2Var) {
        this.a = bt2Var;
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        Integer numA0 = s13.a0(str);
        if (numA0 != null) {
            return numA0.intValue();
        }
        fo.i(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.bt2
    public final mh0 c() {
        return u13.f;
    }

    @Override // defpackage.bt2
    public final int d() {
        return 1;
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1)) {
            return false;
        }
        ng1 ng1Var = (ng1) obj;
        return o51.f(this.a, ng1Var.a) && o51.f(b(), ng1Var.b());
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        if (i >= 0) {
            return uj0.e;
        }
        b81.o(p91.r(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return b().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        if (i >= 0) {
            return this.a;
        }
        b81.o(p91.r(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        b81.o(p91.r(i, "Illegal index ", ", "), b(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return b() + '(' + this.a + ')';
    }
}
