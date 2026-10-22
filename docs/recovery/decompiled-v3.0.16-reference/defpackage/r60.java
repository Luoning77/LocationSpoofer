package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class r60 extends oq {
    private final y70 _context;
    private transient q60 intercepted;

    public r60(q60 q60Var) {
        this(q60Var, q60Var != null ? q60Var.getContext() : null);
    }

    @Override // defpackage.q60
    public y70 getContext() {
        y70 y70Var = this._context;
        y70Var.getClass();
        return y70Var;
    }

    public final q60 intercepted() {
        q60 q60VarInterceptContinuation = this.intercepted;
        if (q60VarInterceptContinuation == null) {
            s60 s60Var = (s60) getContext().get(j9.B);
            if (s60Var == null || (q60VarInterceptContinuation = s60Var.interceptContinuation(this)) == null) {
                q60VarInterceptContinuation = this;
            }
            this.intercepted = q60VarInterceptContinuation;
        }
        return q60VarInterceptContinuation;
    }

    @Override // defpackage.oq
    public void releaseIntercepted() {
        q60 q60Var = this.intercepted;
        if (q60Var != null && q60Var != this) {
            w70 w70Var = getContext().get(j9.B);
            w70Var.getClass();
            ((s60) w70Var).releaseInterceptedContinuation(q60Var);
        }
        this.intercepted = s00.e;
    }

    public r60(q60 q60Var, y70 y70Var) {
        super(q60Var);
        this._context = y70Var;
    }
}
