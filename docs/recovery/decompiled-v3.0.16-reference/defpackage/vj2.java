package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vj2 {
    public final String a;

    public vj2(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj2) && o51.f(this.a, ((vj2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 592722598;
    }

    public final String toString() {
        return az2.k("RouteRequestOptions(engine=self_hosted, mode=", this.a, ")");
    }
}
