package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p33 implements xb0, q60 {
    public final /* synthetic */ q33 e;
    public final CancellableContinuationImpl f;
    public CancellableContinuationImpl g;
    public q92 h = q92.f;
    public final /* synthetic */ q33 i;

    public p33(q33 q33Var, CancellableContinuationImpl cancellableContinuationImpl) {
        this.i = q33Var;
        this.e = q33Var;
        this.f = cancellableContinuationImpl;
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
        return this.e.g() * f;
    }

    @Override // defpackage.xb0
    public final float U0(int i) {
        return this.e.U0(i);
    }

    @Override // defpackage.xb0
    public final float X0(float f) {
        return f / this.e.g();
    }

    public final Object c(q92 q92Var, oq oqVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(oqVar), 1);
        cancellableContinuationImpl.initCancellability();
        this.h = q92Var;
        this.g = cancellableContinuationImpl;
        return cancellableContinuationImpl.getResult();
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        return this.e.e0(j);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.g();
    }

    @Override // defpackage.q60
    public final y70 getContext() {
        return sj0.e;
    }

    public final long h() {
        q33 q33Var = this.i;
        long jA0 = q33Var.A0(xp1.O(q33Var).F.g());
        long j = q33Var.B;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jA0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jA0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.xb0
    public final int n0(float f) {
        return this.e.n0(f);
    }

    @Override // defpackage.q60
    public final void resumeWith(Object obj) {
        q33 q33Var = this.i;
        synchronized (q33Var.y) {
            q33Var.x.j(this);
        }
        this.f.resumeWith(obj);
    }

    public final aj3 s() {
        return xp1.O(this.i).F;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(long j, pu0 pu0Var, r60 r60Var) throws Throwable {
        n33 n33Var;
        Throwable th;
        Job job;
        CancellableContinuationImpl cancellableContinuationImpl;
        if (r60Var instanceof n33) {
            n33Var = (n33) r60Var;
            int i = n33Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                n33Var.h = i - Integer.MIN_VALUE;
            } else {
                n33Var = new n33(this, r60Var);
            }
        } else {
            n33Var = new n33(this, r60Var);
        }
        Object objInvoke = n33Var.f;
        int i2 = n33Var.h;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            job = n33Var.e;
            try {
                ee0.J(objInvoke);
                job.cancel((CancellationException) qv.f);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                job.cancel((CancellationException) qv.f);
                throw th;
            }
        }
        ee0.J(objInvoke);
        if (j <= 0 && (cancellableContinuationImpl = this.g) != null) {
            cancellableContinuationImpl.resumeWith(new wg2(new r92(j)));
        }
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.i.a1(), null, null, new ch(j, this, null), 3, null);
        try {
            n33Var.e = jobLaunch$default;
            n33Var.h = 1;
            objInvoke = pu0Var.invoke(this, n33Var);
            Object obj = z70.e;
            if (objInvoke == obj) {
                return obj;
            }
            job = jobLaunch$default;
            job.cancel((CancellationException) qv.f);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            job = jobLaunch$default;
            job.cancel((CancellationException) qv.f);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(long j, pu0 pu0Var, r60 r60Var) {
        o33 o33Var;
        if (r60Var instanceof o33) {
            o33Var = (o33) r60Var;
            int i = o33Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                o33Var.g = i - Integer.MIN_VALUE;
            } else {
                o33Var = new o33(this, r60Var);
            }
        } else {
            o33Var = new o33(this, r60Var);
        }
        Object obj = o33Var.e;
        int i2 = o33Var.g;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ee0.J(obj);
                    return obj;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            o33Var.g = 1;
            Object objW = w(j, pu0Var, o33Var);
            Object obj2 = z70.e;
            return objW == obj2 ? obj2 : objW;
        } catch (r92 unused) {
            return null;
        }
    }
}
