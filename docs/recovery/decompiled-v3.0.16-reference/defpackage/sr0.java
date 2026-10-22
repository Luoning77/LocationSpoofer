package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sr0 extends pa3 {
    public pa3 e;

    public sr0(pa3 pa3Var) {
        pa3Var.getClass();
        this.e = pa3Var;
    }

    @Override // defpackage.pa3
    public final pa3 a() {
        return this.e.a();
    }

    @Override // defpackage.pa3
    public final pa3 b() {
        return this.e.b();
    }

    @Override // defpackage.pa3
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.pa3
    public final pa3 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.pa3
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.pa3
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.pa3
    public final pa3 g(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        timeUnit2.getClass();
        return this.e.g(j, timeUnit2);
    }

    @Override // defpackage.pa3
    public final long h() {
        return this.e.h();
    }
}
