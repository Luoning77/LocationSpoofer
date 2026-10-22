package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ad2 extends fv implements x81 {
    private final boolean syntheticJavaProperty;

    public ad2(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // defpackage.fv
    public k81 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ad2) {
            ad2 ad2Var = (ad2) obj;
            return getOwner().equals(ad2Var.getOwner()) && getName().equals(ad2Var.getName()) && getSignature().equals(ad2Var.getSignature()) && o51.f(getBoundReceiver(), ad2Var.getBoundReceiver());
        }
        if (obj instanceof x81) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.fv
    public x81 getReflected() {
        if (this.syntheticJavaProperty) {
            b81.s("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        k81 k81VarCompute = compute();
        if (k81VarCompute != this) {
            return (x81) k81VarCompute;
        }
        throw new y91("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.x81
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.x81
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        k81 k81VarCompute = compute();
        if (k81VarCompute != this) {
            return k81VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
