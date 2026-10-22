package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class m8 implements zu0, Serializable {
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public m8(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return this.i == m8Var.i && this.j == m8Var.j && this.k == m8Var.k && this.e.equals(m8Var.e) && this.f.equals(m8Var.f) && this.g.equals(m8Var.g) && this.h.equals(m8Var.h);
    }

    @Override // defpackage.zu0
    public final int getArity() {
        return this.j;
    }

    public final int hashCode() {
        return ((((p91.d(p91.d((this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31, this.g), 31, this.h) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        xe2.a.getClass();
        return ye2.a(this);
    }
}
