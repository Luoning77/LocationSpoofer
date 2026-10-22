package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cs {
    public td a = null;
    public ga b = null;
    public xv c = null;
    public re d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return o51.f(this.a, csVar.a) && o51.f(this.b, csVar.b) && o51.f(this.c, csVar.c) && o51.f(this.d, csVar.d);
    }

    public final int hashCode() {
        td tdVar = this.a;
        int iHashCode = (tdVar == null ? 0 : tdVar.hashCode()) * 31;
        ga gaVar = this.b;
        int iHashCode2 = (iHashCode + (gaVar == null ? 0 : gaVar.hashCode())) * 31;
        xv xvVar = this.c;
        int iHashCode3 = (iHashCode2 + (xvVar == null ? 0 : xvVar.hashCode())) * 31;
        re reVar = this.d;
        return iHashCode3 + (reVar != null ? reVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
