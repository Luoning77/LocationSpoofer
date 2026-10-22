package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ir {
    public final fd2 a;
    public final ox b;
    public final pu0 c;
    public final t91 d;
    public List e;

    public ir(fd2 fd2Var, ox oxVar, pu0 pu0Var, t91 t91Var) {
        fd2Var.getClass();
        this.a = fd2Var;
        this.b = oxVar;
        this.c = pu0Var;
        this.d = t91Var;
        this.e = uj0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        ir irVar = (ir) obj;
        return this.b.equals(irVar.b) && this.a.equals(irVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String str;
        String string = this.d.toString();
        String str2 = "'" + m81.a(this.b) + '\'';
        j13 j13Var = mn2.i;
        fd2 fd2Var = this.a;
        if (fd2Var.equals(j13Var)) {
            str = "";
        } else {
            str = ",scope:" + fd2Var;
        }
        return "[" + string + ':' + str2 + "" + str + (!this.e.isEmpty() ? ",binds:".concat(zy.s0(this.e, ",", null, null, wa.x, 30)) : "") + ']';
    }
}
