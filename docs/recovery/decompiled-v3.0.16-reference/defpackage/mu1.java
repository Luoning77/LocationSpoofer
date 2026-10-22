package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mu1 implements o42 {
    public float a;
    public float b;
    public float c;
    public float d;
    public ou1 e;
    public float f;
    public float g;
    public float h;
    public float i;
    public Job l;
    public Job m;
    public nu1 n;
    public ou1 o;
    public ou1 p;
    public final vz2 j = new vz2();
    public final vz2 k = new vz2();
    public final pu1 q = new pu1(this);

    @Override // defpackage.o42
    public final kb0 a() {
        return this.q;
    }

    @Override // defpackage.o42
    public final boolean b() {
        return Math.abs(this.b) > 1.0f || Math.abs(this.d) > 1.0f;
    }

    @Override // defpackage.o42
    public final long c(long j, int i, ge2 ge2Var) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        wo2 wo2Var = (wo2) ge2Var.f;
        if (i != 1) {
            c12 c12Var = new c12(wo2Var.c(wo2Var.k, j, wo2Var.j));
            k();
            return c12Var.a;
        }
        ou1 ou1Var = this.o;
        if (ou1Var != null) {
            ou1Var.invoke();
        }
        Job job = this.m;
        if (job != null && job.isActive()) {
            this.g = ld0.D(this.d, this.h) * Math.signum(this.d);
        }
        Job job2 = this.m;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.l;
        if (job3 != null && job3.isActive()) {
            this.f = ld0.D(this.b, this.i) * Math.signum(this.b);
        }
        Job job4 = this.l;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        if (Math.abs(this.d) <= 1.0f || Float.intBitsToFloat(i2) == 0.0f || Math.signum(Float.intBitsToFloat(i2)) == Math.signum(this.g)) {
            fIntBitsToFloat = 0.0f;
        } else {
            float fIntBitsToFloat4 = Math.abs(this.g) <= Math.abs(Float.intBitsToFloat(i2)) ? -this.g : Float.intBitsToFloat(i2);
            if (Math.abs(this.g) <= Math.abs(Float.intBitsToFloat(i2))) {
                h(0.0f);
                this.g = 0.0f;
                float f = fIntBitsToFloat4;
                fIntBitsToFloat3 = Float.intBitsToFloat(i2) - fIntBitsToFloat4;
                fIntBitsToFloat = f;
            } else {
                f(fIntBitsToFloat4);
                fIntBitsToFloat = Float.intBitsToFloat(i2);
                fIntBitsToFloat3 = 0.0f;
            }
        }
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        if (Math.abs(this.b) <= 1.0f || Float.intBitsToFloat(i3) == 0.0f || Math.signum(Float.intBitsToFloat(i3)) == Math.signum(this.f)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            float fIntBitsToFloat6 = Math.abs(this.f) <= Math.abs(Float.intBitsToFloat(i3)) ? -this.f : Float.intBitsToFloat(i3);
            if (Math.abs(this.f) <= Math.abs(Float.intBitsToFloat(i3))) {
                g(0.0f);
                this.f = 0.0f;
                float f2 = fIntBitsToFloat6;
                fIntBitsToFloat5 = Float.intBitsToFloat(i3) - fIntBitsToFloat6;
                fIntBitsToFloat2 = f2;
            } else {
                e(fIntBitsToFloat6);
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                fIntBitsToFloat5 = 0.0f;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        long j2 = new c12(wo2Var.c(wo2Var.k, jFloatToRawIntBits, wo2Var.j)).a;
        long jD = c12.d(jFloatToRawIntBits, j2);
        int i4 = (int) (jD & 4294967295L);
        if (Float.intBitsToFloat(i4) != 0.0f) {
            f(Float.intBitsToFloat(i4));
        }
        int i5 = (int) (jD >> 32);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            e(Float.intBitsToFloat(i5));
        }
        k();
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat + (Float.intBitsToFloat(i4) != 0.0f ? Float.intBitsToFloat(i4) : 0.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 >> 32)) + fIntBitsToFloat2) + (Float.intBitsToFloat(i5) == 0.0f ? 0.0f : Float.intBitsToFloat(i5)))) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.o42
    public final Object d(long j, vo2 vo2Var, r60 r60Var) {
        iu1 iu1Var;
        long jC;
        long jC2;
        if (r60Var instanceof iu1) {
            iu1Var = (iu1) r60Var;
            int i = iu1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                iu1Var.h = i - Integer.MIN_VALUE;
            } else {
                iu1Var = new iu1(this, r60Var);
            }
        } else {
            iu1Var = new iu1(this, r60Var);
        }
        Object objInvokeSuspend = iu1Var.f;
        int i2 = iu1Var.h;
        mf3 mf3Var = mf3.a;
        if (i2 == 0) {
            ee0.J(objInvokeSuspend);
            boolean z = Math.abs(this.d) > 1.0f;
            boolean z2 = Math.abs(this.b) > 1.0f;
            ou1 ou1Var = this.o;
            if (ou1Var != null) {
                ou1Var.invoke();
            }
            Job job = this.m;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            Job job2 = this.l;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            if (!z || yh3.c(j) == 0.0f) {
                jC = j;
            } else if (Math.signum(yh3.c(j)) == Math.signum(this.d)) {
                j(yh3.c(j));
                jC = g93.c(yh3.b(j), 0.0f);
            } else {
                j(yh3.c(j));
                jC = g93.c(yh3.b(j), yh3.c(j) / 2.13333f);
            }
            if (!z2 || yh3.b(j) == 0.0f) {
                jC2 = jC;
            } else if (Math.signum(yh3.b(j)) == Math.signum(this.b)) {
                i(yh3.b(j));
                jC2 = g93.c(0.0f, yh3.c(jC));
            } else {
                i(yh3.b(j));
                jC2 = g93.c(yh3.b(j) / 2.13333f, yh3.c(jC));
            }
            iu1Var.e = jC2;
            iu1Var.h = 1;
            vo2Var.getClass();
            vo2 vo2Var2 = new vo2(vo2Var.h, iu1Var);
            vo2Var2.g = jC2;
            objInvokeSuspend = vo2Var2.invokeSuspend(mf3Var);
            z70 z70Var = z70.e;
            if (objInvokeSuspend == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jC2 = iu1Var.e;
            ee0.J(objInvokeSuspend);
        }
        long jD = yh3.d(jC2, ((yh3) objInvokeSuspend).a);
        j(yh3.c(jD) / 1.53333f);
        i(yh3.b(jD) / 1.53333f);
        k();
        return mf3Var;
    }

    public final void e(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.i;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f + f;
        this.f = f3;
        float fU = mh0.u(f3, -f2, f2);
        this.f = fU;
        float fMin = Math.min(Math.abs(fU) / this.i, 1.0f);
        float fSignum = Math.signum(this.f);
        float f4 = this.i;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        g(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    public final void f(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.h;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.g + f;
        this.g = f3;
        float fU = mh0.u(f3, -f2, f2);
        this.g = fU;
        float fMin = Math.min(Math.abs(fU) / this.h, 1.0f);
        float fSignum = Math.signum(this.g);
        float f4 = this.h;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        h(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    public final void g(float f) {
        if (this.b == f) {
            return;
        }
        this.b = f;
        float fRint = (float) Math.rint(f);
        if (fRint == this.a) {
            return;
        }
        this.a = fRint;
        ou1 ou1Var = this.e;
        if (ou1Var != null) {
            ou1Var.invoke();
        }
    }

    public final void h(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        float fRint = (float) Math.rint(f);
        if (fRint == this.c) {
            return;
        }
        this.c = fRint;
        ou1 ou1Var = this.e;
        if (ou1Var != null) {
            ou1Var.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(float f) {
        if (Math.abs(this.b) <= 1.0f && f == 0.0f) {
            g(0.0f);
            this.f = 0.0f;
            return;
        }
        Job job = this.l;
        Job job2 = null;
        Object[] objArr = 0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        nu1 nu1Var = this.n;
        if (nu1Var != null) {
            job2 = (Job) nu1Var.invoke(new lu1(this, f, objArr == true ? 1 : 0, 0));
        }
        this.l = job2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(float f) {
        if (Math.abs(this.d) <= 1.0f && f == 0.0f) {
            h(0.0f);
            this.g = 0.0f;
            return;
        }
        Job job = this.m;
        int i = 1;
        Object[] objArr = 0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        nu1 nu1Var = this.n;
        this.m = nu1Var != null ? (Job) nu1Var.invoke(new lu1(this, f, objArr == true ? 1 : 0, i)) : null;
    }

    public final void k() {
        l42 l42Var;
        ou1 ou1Var = this.p;
        if (ou1Var == null || (l42Var = (l42) ou1Var.invoke()) == null) {
            return;
        }
        w52 w52Var = l42Var.a;
        boolean zB = b();
        if (((Boolean) w52Var.getValue()).booleanValue() != zB) {
            w52Var.setValue(Boolean.valueOf(zB));
        }
    }
}
