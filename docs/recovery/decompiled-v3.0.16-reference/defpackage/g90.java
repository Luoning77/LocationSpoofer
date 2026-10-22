package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g90 implements FlowCollector {
    public final /* synthetic */ FlowCollector e;
    public final /* synthetic */ j90 f;
    public final /* synthetic */ float g;

    public g90(FlowCollector flowCollector, j90 j90Var, float f) {
        this.e = flowCollector;
        this.f = j90Var;
        this.g = f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        f90 f90Var;
        if (q60Var instanceof f90) {
            f90Var = (f90) q60Var;
            int i = f90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                f90Var.f = i - Integer.MIN_VALUE;
            } else {
                f90Var = new f90(this, q60Var);
            }
        } else {
            f90Var = new f90(this, q60Var);
        }
        Object obj2 = f90Var.e;
        int i2 = f90Var.f;
        if (i2 == 0) {
            ee0.J(obj2);
            if (Math.abs(((Number) obj).floatValue() - ((Number) this.f.l.e.getValue()).floatValue()) < this.g) {
                f90Var.f = 1;
                Object objEmit = this.e.emit(obj, f90Var);
                z70 z70Var = z70.e;
                if (objEmit == z70Var) {
                    return z70Var;
                }
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj2);
        }
        return mf3.a;
    }
}
