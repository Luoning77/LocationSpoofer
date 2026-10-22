package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class g13 {
    public static final Set a = yo.H0(new bt2[]{xe3.b, cf3.b, se3.b, hf3.b});

    public static final boolean a(bt2 bt2Var) {
        bt2Var.getClass();
        return bt2Var.isInline() && a.contains(bt2Var);
    }
}
