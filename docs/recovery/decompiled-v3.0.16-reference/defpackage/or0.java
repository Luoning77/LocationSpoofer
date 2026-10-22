package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class or0 implements Comparable {
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public or0(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        or0 or0Var = (or0) obj;
        or0Var.getClass();
        int i = this.e - or0Var.e;
        return i == 0 ? this.f - or0Var.f : i;
    }
}
