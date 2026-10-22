package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class be2 implements a51 {
    public final xd2 a;
    public final ArrayList b;
    public final int c;
    public final em0 d;
    public final yf2 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public be2(xd2 xd2Var, ArrayList arrayList, int i, em0 em0Var, yf2 yf2Var, int i2, int i3, int i4) {
        yf2Var.getClass();
        this.a = xd2Var;
        this.b = arrayList;
        this.c = i;
        this.d = em0Var;
        this.e = yf2Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static be2 a(be2 be2Var, int i, em0 em0Var, yf2 yf2Var, int i2) {
        if ((i2 & 1) != 0) {
            i = be2Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            em0Var = be2Var.d;
        }
        em0 em0Var2 = em0Var;
        if ((i2 & 4) != 0) {
            yf2Var = be2Var.e;
        }
        yf2 yf2Var2 = yf2Var;
        int i4 = be2Var.f;
        int i5 = be2Var.g;
        int i6 = be2Var.h;
        yf2Var2.getClass();
        return new be2(be2Var.a, be2Var.b, i3, em0Var2, yf2Var2, i4, i5, i6);
    }

    public final qg2 b(yf2 yf2Var) {
        yf2Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            fo.n("Check failed.");
            return null;
        }
        this.i++;
        em0 em0Var = this.d;
        if (em0Var != null) {
            gm0 gm0Var = em0Var.c;
            zz0 zz0Var = yf2Var.a;
            gm0Var.getClass();
            zz0Var.getClass();
            zz0 zz0Var2 = gm0Var.b.i;
            if (zz0Var.e != zz0Var2.e || !o51.f(zz0Var.d, zz0Var2.d)) {
                b81.j(arrayList.get(i - 1), "network interceptor ", " must retain the same host and port");
                return null;
            }
            if (this.i != 1) {
                b81.j(arrayList.get(i - 1), "network interceptor ", " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        be2 be2VarA = a(this, i2, null, yf2Var, 58);
        b51 b51Var = (b51) arrayList.get(i);
        qg2 qg2VarIntercept = b51Var.intercept(be2VarA);
        if (qg2VarIntercept == null) {
            throw new NullPointerException("interceptor " + b51Var + " returned null");
        }
        if (em0Var != null && i2 < arrayList.size() && be2VarA.i != 1) {
            b81.j(b51Var, "network interceptor ", " must call proceed() exactly once");
            return null;
        }
        if (qg2VarIntercept.k != null) {
            return qg2VarIntercept;
        }
        b81.j(b51Var, "interceptor ", " returned a response with no body");
        return null;
    }
}
