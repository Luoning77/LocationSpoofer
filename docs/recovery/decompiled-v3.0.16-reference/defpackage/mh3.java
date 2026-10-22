package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mh3 extends oh3 implements Iterable, p81 {
    public final String e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final List m;
    public final ArrayList n;

    public mh3(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.e = str;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mh3)) {
            return false;
        }
        mh3 mh3Var = (mh3) obj;
        return o51.f(this.e, mh3Var.e) && this.f == mh3Var.f && this.g == mh3Var.g && this.h == mh3Var.h && this.i == mh3Var.i && this.j == mh3Var.j && this.k == mh3Var.k && this.l == mh3Var.l && o51.f(this.m, mh3Var.m) && this.n.equals(mh3Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + p91.g(this.m, az2.c(this.l, az2.c(this.k, az2.c(this.j, az2.c(this.i, az2.c(this.h, az2.c(this.g, az2.c(this.f, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bz(this);
    }
}
