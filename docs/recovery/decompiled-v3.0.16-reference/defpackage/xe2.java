package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xe2 {
    public static final ye2 a;

    static {
        ye2 ye2Var = null;
        try {
            ye2Var = (ye2) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ye2Var == null) {
            ye2Var = new ye2();
        }
        a = ye2Var;
    }

    public static ox a(Class cls) {
        a.getClass();
        return new ox(cls);
    }
}
