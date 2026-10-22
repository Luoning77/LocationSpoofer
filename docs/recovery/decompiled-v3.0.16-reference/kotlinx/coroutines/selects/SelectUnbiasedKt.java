package kotlinx.coroutines.selects;

import defpackage.lu0;
import defpackage.q60;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(lu0 lu0Var, q60 q60Var) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(q60Var.getContext());
        lu0Var.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(q60Var);
    }

    private static final <R> Object selectUnbiased$$forInline(lu0 lu0Var, q60 q60Var) {
        throw null;
    }
}
