package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ct2 implements bt2, yu {
    public final bt2 a;
    public final String b;
    public final Set c;

    public ct2(bt2 bt2Var) {
        bt2Var.getClass();
        this.a = bt2Var;
        this.b = bt2Var.b() + '?';
        this.c = xq1.A(bt2Var);
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.bt2
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bt2
    public final mh0 c() {
        return this.a.c();
    }

    @Override // defpackage.bt2
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct2) {
            return o51.f(this.a, ((ct2) obj).a);
        }
        return false;
    }

    @Override // defpackage.yu
    public final Set f() {
        return this.c;
    }

    @Override // defpackage.bt2
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bt2
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.bt2
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
