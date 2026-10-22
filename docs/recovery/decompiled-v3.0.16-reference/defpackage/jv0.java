package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jv0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public Object e;

    public jv0(u32 u32Var) {
        this.e = u32Var;
    }

    public int a() {
        return this.d - this.c;
    }

    public int b(int i) {
        return ((u32) this.e).h[this.c + i];
    }

    public Object c(int i) {
        return ((u32) this.e).j[this.d + i];
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jv0() {
    }
}
