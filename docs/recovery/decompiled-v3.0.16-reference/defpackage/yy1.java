package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yy1 extends dy1 {
    public final dy1 o;
    public boolean p;

    public yy1(long j, rx2 rx2Var, lu0 lu0Var, lu0 lu0Var2, dy1 dy1Var) {
        super(j, rx2Var, lu0Var, lu0Var2);
        this.o = dy1Var;
        dy1Var.k();
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.dy1
    public final hd0 w() {
        yy1 yy1Var;
        dy1 dy1Var = this.o;
        if (dy1Var.m || dy1Var.c) {
            return new ox2(this);
        }
        ay1 ay1Var = this.h;
        long j = this.b;
        HashMap mapM = ay1Var != null ? tx2.m(dy1Var.g(), this, this.o.d()) : null;
        Object obj = tx2.c;
        synchronized (obj) {
            try {
                tx2.v(this);
                if (ay1Var == null || ay1Var.d == 0) {
                    yy1Var = this;
                    yy1Var.a();
                } else {
                    yy1Var = this;
                    hd0 hd0VarZ = yy1Var.z(this.o.g(), ay1Var, mapM, this.o.d());
                    if (!hd0VarZ.equals(px2.f)) {
                        return hd0VarZ;
                    }
                    ay1 ay1VarX = yy1Var.o.x();
                    if (ay1VarX != null) {
                        ay1VarX.j(ay1Var);
                    } else {
                        yy1Var.o.B(ay1Var);
                        yy1Var.h = null;
                    }
                }
                if (o51.n(yy1Var.o.g(), j) < 0) {
                    yy1Var.o.v();
                }
                dy1 dy1Var2 = yy1Var.o;
                dy1Var2.r(dy1Var2.d().b(j).a(yy1Var.j));
                yy1Var.o.A(j);
                dy1 dy1Var3 = yy1Var.o;
                int i = yy1Var.d;
                yy1Var.d = -1;
                if (i >= 0) {
                    int[] iArr = dy1Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    dy1Var3.k = iArrCopyOf;
                } else {
                    dy1Var3.getClass();
                }
                dy1 dy1Var4 = yy1Var.o;
                rx2 rx2Var = yy1Var.j;
                dy1Var4.getClass();
                synchronized (obj) {
                    dy1Var4.j = dy1Var4.j.d(rx2Var);
                    dy1 dy1Var5 = yy1Var.o;
                    int[] iArr2 = yy1Var.k;
                    dy1Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = dy1Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        dy1Var5.k = iArr2;
                    }
                }
                yy1Var.m = true;
                if (!yy1Var.p) {
                    yy1Var.p = true;
                    yy1Var.o.l();
                }
                return px2.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
