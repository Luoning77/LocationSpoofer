package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class av0 extends fv implements zu0, o81 {
    private final int arity;

    public av0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.fv
    public k81 computeReflected() {
        xe2.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av0) {
            av0 av0Var = (av0) obj;
            return getName().equals(av0Var.getName()) && getSignature().equals(av0Var.getSignature()) && o51.f(getBoundReceiver(), av0Var.getBoundReceiver()) && o51.f(getOwner(), av0Var.getOwner());
        }
        if (obj instanceof o81) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.zu0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.fv
    public o81 getReflected() {
        k81 k81VarCompute = compute();
        if (k81VarCompute != this) {
            return (o81) k81VarCompute;
        }
        throw new y91("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.o81
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.o81
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.o81
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.o81
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.fv, defpackage.k81, defpackage.o81
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        k81 k81VarCompute = compute();
        if (k81VarCompute != this) {
            return k81VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
