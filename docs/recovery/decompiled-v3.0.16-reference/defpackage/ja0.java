package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ja0 extends k33 implements pu0 {
    public te2 e;
    public ti f;
    public int g;
    public final /* synthetic */ float h;
    public final /* synthetic */ ka0 i;
    public final /* synthetic */ sd1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(float f, ka0 ka0Var, sd1 sd1Var, q60 q60Var) {
        super(2, q60Var);
        this.h = f;
        this.i = ka0Var;
        this.j = sd1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new ja0(this.h, this.i, this.j, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ja0) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        float f;
        ti tiVar;
        te2 te2Var;
        ti tiVar2;
        int i = this.g;
        if (i == 0) {
            ee0.J(obj);
            f = this.h;
            if (Math.abs(f) > 1.0f) {
                te2 te2Var2 = new te2();
                te2Var2.e = f;
                te2 te2Var3 = new te2();
                ti tiVarA = am1.a(28, f);
                try {
                    ka0 ka0Var = this.i;
                    u90 u90Var = ka0Var.a;
                    lh lhVar = new lh(te2Var3, this.j, te2Var2, ka0Var, 2);
                    this.e = te2Var2;
                    this.f = tiVarA;
                    this.g = 1;
                    tiVar = tiVarA;
                    try {
                        Object objL = gh0.l(tiVar, new t90(u90Var, o51.v0, tiVarA.f.getValue(), tiVarA.g), Long.MIN_VALUE, lhVar, this);
                        Object obj2 = z70.e;
                        if (objL != obj2) {
                            objL = mf3.a;
                        }
                        if (objL == obj2) {
                            return obj2;
                        }
                        te2Var = te2Var2;
                        f = te2Var.e;
                    } catch (CancellationException unused) {
                        te2Var = te2Var2;
                        tiVar2 = tiVar;
                        te2Var.e = ((Number) tiVar2.e.b.invoke(tiVar2.g)).floatValue();
                    }
                } catch (CancellationException unused2) {
                    tiVar = tiVarA;
                }
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tiVar2 = this.f;
            te2Var = this.e;
            try {
                ee0.J(obj);
            } catch (CancellationException unused3) {
                te2Var.e = ((Number) tiVar2.e.b.invoke(tiVar2.g)).floatValue();
            }
            f = te2Var.e;
        }
        return new Float(f);
    }
}
