package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ic1 extends cv1 implements hg0 {
    public kc1 s;

    @Override // defpackage.cv1
    public final void e1() {
        this.s.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic1) && o51.f(this.s, ((ic1) obj).s);
    }

    @Override // defpackage.cv1
    public final void f1() {
        kc1 kc1Var = this.s;
        kc1Var.c();
        kc1Var.b = null;
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        ArrayList arrayList = this.s.h;
        if (arrayList.size() <= 0) {
            jb1Var.c();
        } else {
            p91.x(arrayList.get(0));
            throw null;
        }
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.s + ')';
    }
}
