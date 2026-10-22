package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uf3 extends wf3 {
    public final /* synthetic */ Method b;

    public uf3(Method method) {
        this.b = method;
    }

    @Override // defpackage.wf3
    public final Object a(Class cls) {
        String strN = d31.n(cls);
        if (strN != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strN));
        }
        return this.b.invoke(null, cls, Object.class);
    }
}
