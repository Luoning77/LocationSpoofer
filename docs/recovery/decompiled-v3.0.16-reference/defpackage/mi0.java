package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mi0 {
    public final dm a;
    public int b;
    public int c;
    public int d;
    public int e;

    public mi0(dj djVar, long j) {
        String str = djVar.f;
        dm dmVar = new dm();
        dmVar.d = str;
        dmVar.b = -1;
        dmVar.c = -1;
        this.a = dmVar;
        this.b = f93.f(j);
        this.c = f93.e(j);
        this.d = -1;
        this.e = -1;
        int iF = f93.f(j);
        int iE = f93.e(j);
        if (iF < 0 || iF > str.length()) {
            b81.n(p91.r(iF, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            b81.n(p91.r(iE, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        fo.i(p91.n("Do not set reversed range: ", iF, iE, " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jA = g93.a(i, i2);
        this.a.m(i, i2, "");
        long jK = ig0.K(g93.a(this.b, this.c), jA);
        h(f93.f(jK));
        g(f93.e(jK));
        int i3 = this.d;
        if (i3 != -1) {
            long jK2 = ig0.K(g93.a(i3, this.e), jA);
            if (f93.c(jK2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = f93.f(jK2);
                this.e = f93.e(jK2);
            }
        }
    }

    public final char b(int i) {
        dm dmVar = this.a;
        jv0 jv0Var = (jv0) dmVar.e;
        if (jv0Var == null) {
            return ((String) dmVar.d).charAt(i);
        }
        if (i < dmVar.b) {
            return ((String) dmVar.d).charAt(i);
        }
        int iA = jv0Var.b - jv0Var.a();
        int i2 = dmVar.b;
        if (i >= iA + i2) {
            return ((String) dmVar.d).charAt(i - ((iA - dmVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = jv0Var.c;
        char[] cArr = (char[]) jv0Var.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + jv0Var.d];
    }

    public final f93 c() {
        int i = this.d;
        if (i != -1) {
            return new f93(g93.a(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        dm dmVar = this.a;
        if (i < 0 || i > dmVar.c()) {
            b81.n(p91.r(i, "start (", ") offset is outside of text region "), dmVar.c());
            return;
        }
        if (i2 < 0 || i2 > dmVar.c()) {
            b81.n(p91.r(i2, "end (", ") offset is outside of text region "), dmVar.c());
            return;
        }
        if (i > i2) {
            fo.i(p91.n("Do not set reversed range: ", i, i2, " > "));
            return;
        }
        dmVar.m(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        dm dmVar = this.a;
        if (i < 0 || i > dmVar.c()) {
            b81.n(p91.r(i, "start (", ") offset is outside of text region "), dmVar.c());
            return;
        }
        if (i2 < 0 || i2 > dmVar.c()) {
            b81.n(p91.r(i2, "end (", ") offset is outside of text region "), dmVar.c());
        } else if (i >= i2) {
            fo.i(p91.n("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        dm dmVar = this.a;
        if (i < 0 || i > dmVar.c()) {
            b81.n(p91.r(i, "start (", ") offset is outside of text region "), dmVar.c());
            return;
        }
        if (i2 < 0 || i2 > dmVar.c()) {
            b81.n(p91.r(i2, "end (", ") offset is outside of text region "), dmVar.c());
        } else if (i > i2) {
            fo.i(p91.n("Do not set reversed range: ", i, i2, " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            q21.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            q21.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
