package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cc2 implements bt2 {
    public final String a;
    public final bc2 b;

    public cc2(String str, bc2 bc2Var) {
        bc2Var.getClass();
        this.a = str;
        this.b = bc2Var;
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        f();
        throw null;
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
        return 0;
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        f();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc2)) {
            return false;
        }
        cc2 cc2Var = (cc2) obj;
        return this.a.equals(cc2Var.a) && o51.f(this.b, cc2Var.b);
    }

    public final void f() {
        throw new IllegalStateException(az2.p(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        f();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        f();
        throw null;
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        f();
        throw null;
    }

    public final String toString() {
        return p91.q(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
