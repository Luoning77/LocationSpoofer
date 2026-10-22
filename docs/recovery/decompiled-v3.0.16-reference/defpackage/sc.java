package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sc implements p42 {
    public final Context a;
    public final xb0 b;
    public final long c;
    public final b52 d;

    public sc(Context context, xb0 xb0Var, long j, b52 b52Var) {
        this.a = context;
        this.b = xb0Var;
        this.c = j;
        this.d = b52Var;
    }

    @Override // defpackage.p42
    public final o42 a() {
        return new rc(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        sc scVar = (sc) obj;
        if (!o51.f(this.a, scVar.a) || !o51.f(this.b, scVar.b)) {
            return false;
        }
        long j = scVar.c;
        int i = hz.h;
        return ye3.a(this.c, j) && this.d.equals(scVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = hz.h;
        return this.d.hashCode() + p91.c(iHashCode, 31, this.c);
    }
}
