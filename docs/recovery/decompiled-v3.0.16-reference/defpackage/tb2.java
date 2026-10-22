package defpackage;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tb2 implements qb2, xb0 {
    public final /* synthetic */ xb0 e;
    public boolean f;
    public boolean g;
    public final Mutex h = MutexKt.Mutex(false);

    public tb2(xb0 xb0Var) {
        this.e = xb0Var;
    }

    @Override // defpackage.xb0
    public final long A0(long j) {
        return this.e.A0(j);
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.e.D();
    }

    @Override // defpackage.xb0
    public final float G0(long j) {
        return this.e.G0(j);
    }

    @Override // defpackage.xb0
    public final long O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.xb0
    public final long P(long j) {
        return this.e.P(j);
    }

    @Override // defpackage.xb0
    public final long Q0(float f) {
        return this.e.Q0(f);
    }

    @Override // defpackage.xb0
    public final float R(float f) {
        return this.e.R(f);
    }

    @Override // defpackage.xb0
    public final float U0(int i) {
        return this.e.U0(i);
    }

    @Override // defpackage.xb0
    public final float X0(float f) {
        return this.e.X0(f);
    }

    public final void c() {
        this.f = true;
        Mutex mutex = this.h;
        if (mutex.isLocked()) {
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        }
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        return this.e.e0(j);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(r60 r60Var) {
        rb2 rb2Var;
        if (r60Var instanceof rb2) {
            rb2Var = (rb2) r60Var;
            int i = rb2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rb2Var.g = i - Integer.MIN_VALUE;
            } else {
                rb2Var = new rb2(this, r60Var);
            }
        } else {
            rb2Var = new rb2(this, r60Var);
        }
        Object obj = rb2Var.e;
        int i2 = rb2Var.g;
        if (i2 == 0) {
            ee0.J(obj);
            rb2Var.g = 1;
            Object objLock$default = Mutex.DefaultImpls.lock$default(this.h, null, rb2Var, 1, null);
            z70 z70Var = z70.e;
            if (objLock$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        this.f = false;
        this.g = false;
        return mf3.a;
    }

    @Override // defpackage.xb0
    public final int n0(float f) {
        return this.e.n0(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(r60 r60Var) {
        sb2 sb2Var;
        if (r60Var instanceof sb2) {
            sb2Var = (sb2) r60Var;
            int i = sb2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sb2Var.g = i - Integer.MIN_VALUE;
            } else {
                sb2Var = new sb2(this, r60Var);
            }
        } else {
            sb2Var = new sb2(this, r60Var);
        }
        Object obj = sb2Var.e;
        int i2 = sb2Var.g;
        Mutex mutex = this.h;
        if (i2 == 0) {
            ee0.J(obj);
            if (!this.f && !this.g) {
                sb2Var.g = 1;
                Object objLock$default = Mutex.DefaultImpls.lock$default(mutex, null, sb2Var, 1, null);
                z70 z70Var = z70.e;
                if (objLock$default == z70Var) {
                    return z70Var;
                }
            }
            return Boolean.valueOf(this.f);
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        return Boolean.valueOf(this.f);
    }
}
