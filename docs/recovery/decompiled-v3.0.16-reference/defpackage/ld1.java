package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ld1 {
    public final yd1 a;
    public final kd1 b;
    public final bc1 c;
    public final q01 d;

    public ld1(yd1 yd1Var, kd1 kd1Var, bc1 bc1Var, q01 q01Var) {
        this.a = yd1Var;
        this.b = kd1Var;
        this.c = bc1Var;
        this.d = q01Var;
    }

    public final void a(int i, Object obj, f30 f30Var, int i2) {
        int i3;
        Object obj2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-462424778);
        int i4 = 2;
        int i5 = (ov0Var.d(i) ? 4 : 2) | i2 | (ov0Var.h(obj) ? 32 : 16) | (ov0Var.f(this) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i5 & 1, (i5 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            mc0.b(obj2, i3, this.a.s, sb.a0(-824725566, new dc(i, i4, this), ov0Var), ov0Var, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new nc1(this, i3, obj2, i2);
        }
    }

    public final Object b(int i) {
        kd1 kd1Var = this.b;
        kd1Var.getClass();
        d51 d51VarD = kd1Var.a.d(i);
        return ((lu0) d51VarD.c.b).invoke(Integer.valueOf(i - d51VarD.a));
    }

    public final int c() {
        kd1 kd1Var = this.b;
        kd1Var.getClass();
        return kd1Var.a.b;
    }

    public final Object d(int i) {
        Object objInvoke;
        q01 q01Var = this.d;
        Object[] objArr = (Object[]) q01Var.d;
        int i2 = i - q01Var.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        kd1 kd1Var = this.b;
        kd1Var.getClass();
        d51 d51VarD = kd1Var.a.d(i);
        int i3 = i - d51VarD.a;
        lu0 lu0Var = (lu0) d51VarD.c.a;
        return (lu0Var == null || (objInvoke = lu0Var.invoke(Integer.valueOf(i3))) == null) ? new pa0(i) : objInvoke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld1)) {
            return false;
        }
        return o51.f(this.b, ((ld1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
