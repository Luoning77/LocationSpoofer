package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mx2 implements bh0 {
    public final int a;

    public mx2(int i) {
        this.a = i;
    }

    @Override // defpackage.si
    public final th3 a(qd3 qd3Var) {
        return new xh3(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mx2) && ((mx2) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
