package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class cv2 {
    public cv2 a(nu2 nu2Var, ju2 ju2Var, long j, long j2, long j3) {
        throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
    }

    public boolean b() {
        return this instanceof m7;
    }

    public pe2 c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public mn2 e() {
        return null;
    }

    public pe2 f(nu2 nu2Var) {
        return c();
    }

    public abstract cv2 g(ju2 ju2Var);

    public abstract cv2 h();

    public void i(pe2 pe2Var) {
    }
}
