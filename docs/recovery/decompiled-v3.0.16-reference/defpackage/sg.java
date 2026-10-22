package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sg implements w70 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public sg(fe2 fe2Var) {
        this.e = 1;
        this.f = fe2Var;
        this.g = new xp(0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final Object a(lu0 lu0Var, q60 q60Var) {
        f72 f72Var;
        boolean z;
        Object result;
        int i = 1;
        switch (this.e) {
            case 0:
                qg qgVar = (qg) this.g;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
                cancellableContinuationImpl.initCancellability();
                rg rgVar = new rg(cancellableContinuationImpl, this, lu0Var);
                if (o51.f(qgVar.e, (Choreographer) this.f)) {
                    synchronized (qgVar.g) {
                        qgVar.i.add(rgVar);
                        if (!qgVar.l) {
                            qgVar.l = true;
                            qgVar.e.postFrameCallback(qgVar.m);
                        }
                        break;
                    }
                    cancellableContinuationImpl.invokeOnCancellation(new ze(3, qgVar, rgVar));
                } else {
                    ((Choreographer) this.f).postFrameCallback(rgVar);
                    cancellableContinuationImpl.invokeOnCancellation(new ze(4, this, rgVar));
                }
                return cancellableContinuationImpl.getResult();
            case 1:
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(hd0.G(q60Var), 1);
                cancellableContinuationImpl2.initCancellability();
                xp xpVar = (xp) this.g;
                rt rtVar = new rt();
                rtVar.a = cancellableContinuationImpl2;
                rtVar.b = lu0Var;
                cancellableContinuationImpl2.invokeOnCancellation(new w3(xpVar.d(rtVar, (fe2) this.f), i));
                return cancellableContinuationImpl2.getResult();
            default:
                if (q60Var instanceof f72) {
                    f72Var = (f72) q60Var;
                    int i2 = f72Var.h;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        f72Var.h = i2 - Integer.MIN_VALUE;
                    } else {
                        f72Var = new f72(this, q60Var);
                    }
                } else {
                    f72Var = new f72(this, q60Var);
                }
                Object obj = f72Var.f;
                z70 z70Var = z70.e;
                int i3 = f72Var.h;
                if (i3 == 0) {
                    ee0.J(obj);
                    ha1 ha1Var = (ha1) this.g;
                    f72Var.e = lu0Var;
                    f72Var.h = 1;
                    synchronized (ha1Var.b) {
                        z = ha1Var.a;
                    }
                    if (z) {
                        result = mf3.a;
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(hd0.G(f72Var), 1);
                        cancellableContinuationImpl3.initCancellability();
                        synchronized (ha1Var.b) {
                            ((ArrayList) ha1Var.c).add(cancellableContinuationImpl3);
                        }
                        cancellableContinuationImpl3.invokeOnCancellation(new l3(13, ha1Var, cancellableContinuationImpl3));
                        result = cancellableContinuationImpl3.getResult();
                        if (result != z70Var) {
                            result = mf3.a;
                        }
                    }
                    if (result != z70Var) {
                    }
                    return z70Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lu0Var = f72Var.e;
                ee0.J(obj);
                sg sgVar = (sg) this.f;
                f72Var.e = null;
                f72Var.h = 2;
                Object objA = sgVar.a(lu0Var, f72Var);
                if (objA != z70Var) {
                    return objA;
                }
                return z70Var;
        }
    }

    @Override // defpackage.y70
    public final Object fold(Object obj, pu0 pu0Var) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return da0.u(this, obj, pu0Var);
    }

    @Override // defpackage.y70
    public final w70 get(x70 x70Var) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return da0.v(this, x70Var);
    }

    @Override // defpackage.w70
    public x70 getKey() {
        return j9.U;
    }

    @Override // defpackage.y70
    public final y70 minusKey(x70 x70Var) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public final y70 plus(y70 y70Var) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return da0.E(y70Var, this);
    }

    public sg(sg sgVar) {
        this.e = 2;
        this.f = sgVar;
        this.g = new ha1();
    }

    public sg(Choreographer choreographer, qg qgVar) {
        this.e = 0;
        this.f = choreographer;
        this.g = qgVar;
    }
}
