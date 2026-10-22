package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vp2 {
    public static final vp2 e;
    public static final vp2 f;
    public static final /* synthetic */ vp2[] g;

    static {
        vp2 vp2Var = new vp2("EditableText", 0);
        e = vp2Var;
        vp2 vp2Var2 = new vp2("StaticText", 1);
        f = vp2Var2;
        g = new vp2[]{vp2Var, vp2Var2};
    }

    public static vp2 valueOf(String str) {
        return (vp2) Enum.valueOf(vp2.class, str);
    }

    public static vp2[] values() {
        return (vp2[]) g.clone();
    }
}
