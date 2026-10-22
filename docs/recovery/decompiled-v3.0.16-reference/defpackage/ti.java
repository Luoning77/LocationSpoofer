package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ti implements s03 {
    public final qd3 e;
    public final w52 f;
    public yi g;
    public long h;
    public long i;
    public boolean j;

    public ti(qd3 qd3Var, Object obj, yi yiVar, long j, long j2, boolean z) {
        yi yiVarR;
        this.e = qd3Var;
        this.f = ke0.H(obj);
        if (yiVar != null) {
            yiVarR = xp1.r(yiVar);
        } else {
            yiVarR = (yi) qd3Var.a.invoke(obj);
            yiVarR.d();
        }
        this.g = yiVarR;
        this.h = j;
        this.i = j2;
        this.j = z;
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return this.f.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f.getValue() + ", velocity=" + this.e.b.invoke(this.g) + ", isRunning=" + this.j + ", lastFrameTimeNanos=" + this.h + ", finishedTimeNanos=" + this.i + ')';
    }

    public /* synthetic */ ti(qd3 qd3Var, Object obj, yi yiVar, int i) {
        this(qd3Var, obj, (i & 4) != 0 ? null : yiVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
