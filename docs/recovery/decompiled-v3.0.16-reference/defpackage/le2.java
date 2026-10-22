package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class le2 implements un {
    public final fx1 e = new fx1();
    public final sx1 f = new sx1();
    public final Object g;

    public le2(Object obj) {
        this.g = obj;
    }

    public final void a(if3 if3Var, lj ljVar) {
        Exception exc;
        fx1 fx1Var = this.e;
        int i = fx1Var.b;
        sx1 sx1Var = new sx1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            sx1 sx1Var2 = this.f;
            if (i2 >= i) {
                if (i3 != sx1Var2.b) {
                    j30.a("Applier operation size mismatch");
                }
                sx1Var2.d();
                fx1Var.b = 0;
                if3Var.g();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (fx1Var.c(i2)) {
                        case 0:
                            if3Var.s();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            if3Var.d(sx1Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            if3Var.k(fx1Var.c(i4), fx1Var.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    if3Var.h(fx1Var.c(i4), fx1Var.c(i7), fx1Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            if3Var.a();
                            i2 = i4;
                            break;
                        case Logger.WARN /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            if3Var.c(fx1Var.c(i4), sx1Var2.f(i3));
                            i3 = i9;
                            break;
                        case Logger.ERROR /* 6 */:
                            i2 += 2;
                            try {
                                fx1Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                            int i11 = i3 + 1;
                            Object objF = sx1Var2.f(i3);
                            objF.getClass();
                            da0.o(2, objF);
                            i3 += 2;
                            if3Var.i(sx1Var2.f(i11), (pu0) objF);
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = if3Var.g;
                            if (obj instanceof k20) {
                                k20 k20Var = (k20) obj;
                                if (((gy1) ljVar.g).j(k20Var)) {
                                    k20Var.h();
                                }
                            }
                            sx1Var.a(obj);
                            if3Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                if3Var.g();
                throw th;
            }
            exc = e3;
            throw new m20(sx1Var2, sx1Var, fx1Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.un
    public final void c(int i, Object obj) {
        fx1 fx1Var = this.e;
        fx1Var.a(5);
        fx1Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.un
    public final void d(Object obj) {
        this.e.a(1);
        this.f.a(obj);
    }

    @Override // defpackage.un
    public final void e() {
        this.e.a(8);
    }

    @Override // defpackage.un
    public final void f(int i, Object obj) {
        fx1 fx1Var = this.e;
        fx1Var.a(6);
        fx1Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.un
    public final void h(int i, int i2, int i3) {
        fx1 fx1Var = this.e;
        fx1Var.a(3);
        fx1Var.a(i);
        fx1Var.a(i2);
        fx1Var.a(i3);
    }

    @Override // defpackage.un
    public final void i(Object obj, pu0 pu0Var) {
        this.e.a(7);
        sx1 sx1Var = this.f;
        sx1Var.a(pu0Var);
        sx1Var.a(obj);
    }

    @Override // defpackage.un
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.un
    public final void k(int i, int i2) {
        fx1 fx1Var = this.e;
        fx1Var.a(2);
        fx1Var.a(i);
        fx1Var.a(i2);
    }

    @Override // defpackage.un
    public final void s() {
        this.e.a(0);
    }
}
