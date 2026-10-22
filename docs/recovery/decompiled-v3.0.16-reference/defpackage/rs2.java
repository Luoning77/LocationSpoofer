package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rs2 {
    public final String a;
    public final pu0 b;
    public final boolean c;

    public rs2(String str, pu0 pu0Var) {
        this.a = str;
        this.b = pu0Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ rs2(String str) {
        this(str, ns2.o);
    }

    public rs2(String str, int i) {
        this(str);
        this.c = true;
    }

    public rs2(String str, boolean z, pu0 pu0Var) {
        this(str, pu0Var);
        this.c = z;
    }
}
