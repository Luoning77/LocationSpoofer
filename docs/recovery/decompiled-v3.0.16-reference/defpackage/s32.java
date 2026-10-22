package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class s32 {
    public final int a;
    public final int b;

    public /* synthetic */ s32(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var);

    public iv0 b(jv0 jv0Var) {
        return null;
    }

    public final String toString() {
        String strC = xe2.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public s32(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
