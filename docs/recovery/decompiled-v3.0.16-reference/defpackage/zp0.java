package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zp0 {
    public static final zp0 e;
    public static final zp0 f;
    public static final zp0 g;
    public static final /* synthetic */ zp0[] h;

    static {
        zp0 zp0Var = new zp0("Active", 0);
        e = zp0Var;
        zp0 zp0Var2 = new zp0("ActiveParent", 1);
        f = zp0Var2;
        zp0 zp0Var3 = new zp0("Captured", 2);
        zp0 zp0Var4 = new zp0("Inactive", 3);
        g = zp0Var4;
        h = new zp0[]{zp0Var, zp0Var2, zp0Var3, zp0Var4};
    }

    public static zp0 valueOf(String str) {
        return (zp0) Enum.valueOf(zp0.class, str);
    }

    public static zp0[] values() {
        return (zp0[]) h.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        b81.d();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                b81.d();
                return false;
            }
        }
        return true;
    }
}
