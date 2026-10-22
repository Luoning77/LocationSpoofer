package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q33 extends cv1 implements ca2, xb0, ba2 {
    public p92 A;
    public long B;
    public Object s;
    public Object t;
    public PointerInputEventHandler u;
    public Job v;
    public p92 w = m33.a;
    public final gy1 x;
    public final gy1 y;
    public final gy1 z;

    public q33(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.s = obj;
        this.t = obj2;
        this.u = pointerInputEventHandler;
        gy1 gy1Var = new gy1(new p33[16]);
        this.x = gy1Var;
        this.y = gy1Var;
        this.z = new gy1(new p33[16]);
        this.B = 0L;
    }

    @Override // defpackage.xb0
    public final float D() {
        return xp1.O(this).D.D();
    }

    @Override // defpackage.ba2
    public final void D0() {
        o1();
    }

    @Override // defpackage.ba2
    public final void K0() {
        p92 p92Var = this.A;
        if (p92Var == null) {
            return;
        }
        List list = p92Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((x92) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    x92 x92Var = (x92) list.get(i2);
                    long j = x92Var.a;
                    long j2 = x92Var.c;
                    long j3 = x92Var.b;
                    float f = x92Var.e;
                    boolean z = x92Var.d;
                    arrayList.add(new x92(j, j3, j2, false, f, j3, j2, z, z, x92Var.i, 0L, 1.0f, 0L));
                }
                p92 p92Var2 = new p92(arrayList, null);
                this.w = p92Var2;
                n1(p92Var2, q92.e);
                n1(p92Var2, q92.f);
                n1(p92Var2, q92.g);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.kb0
    public final void c() {
        o1();
    }

    @Override // defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        this.B = j;
        if (q92Var == q92.e) {
            this.w = p92Var;
        }
        q60 q60Var = null;
        if (this.v == null) {
            this.v = BuildersKt__Builders_commonKt.launch$default(a1(), null, CoroutineStart.UNDISPATCHED, new d6(this, q60Var, 21), 1, null);
        }
        n1(p92Var, q92Var);
        List list = p92Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!mh0.r((x92) list.get(i))) {
                this.A = p92Var;
            }
        }
        p92Var = null;
        this.A = p92Var;
    }

    @Override // defpackage.cv1
    public final void f1() {
        o1();
    }

    @Override // defpackage.xb0
    public final float g() {
        return xp1.O(this).D.g();
    }

    public final Object m1(pu0 pu0Var, q60 q60Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        p33 p33Var = new p33(this, cancellableContinuationImpl);
        synchronized (this.y) {
            this.x.b(p33Var);
            new cl2(hd0.G(hd0.r(pu0Var, p33Var, p33Var))).resumeWith(mf3.a);
        }
        cancellableContinuationImpl.invokeOnCancellation(new q9(p33Var, 27));
        return cancellableContinuationImpl.getResult();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void n1(p92 p92Var, q92 q92Var) {
        Object[] objArr;
        int i;
        int i2;
        p33 p33Var;
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        synchronized (this.y) {
            gy1 gy1Var = this.z;
            gy1Var.c(gy1Var.g, this.x);
        }
        try {
            int iOrdinal = q92Var.ordinal();
            if (iOrdinal == 0) {
                gy1 gy1Var2 = this.z;
                objArr = gy1Var2.e;
                i = gy1Var2.g;
                for (i2 = 0; i2 < i; i2++) {
                    p33Var = (p33) objArr[i2];
                    if (q92Var != p33Var.h && (cancellableContinuationImpl = p33Var.g) != null) {
                        p33Var.g = null;
                        cancellableContinuationImpl.resumeWith(p92Var);
                    }
                }
            } else if (iOrdinal == 1) {
                gy1 gy1Var3 = this.z;
                int i3 = gy1Var3.g - 1;
                Object[] objArr2 = gy1Var3.e;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        p33 p33Var2 = (p33) objArr2[i3];
                        if (q92Var == p33Var2.h && (cancellableContinuationImpl2 = p33Var2.g) != null) {
                            p33Var2.g = null;
                            cancellableContinuationImpl2.resumeWith(p92Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new iv();
                }
                gy1 gy1Var4 = this.z;
                objArr = gy1Var4.e;
                i = gy1Var4.g;
                while (i2 < i) {
                    p33Var = (p33) objArr[i2];
                    if (q92Var != p33Var.h) {
                    }
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void o1() {
        Job job = this.v;
        if (job != null) {
            job.cancel((CancellationException) new gv1("Pointer input was reset", 2));
            this.v = null;
        }
    }
}
