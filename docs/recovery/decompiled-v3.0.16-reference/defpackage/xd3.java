package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xd3 implements fd2 {
    public final String a;

    public xd3(ox oxVar) {
        this.a = m81.a(oxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xd3.class == obj.getClass() && this.a.equals(((xd3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p91.q(new StringBuilder("q:'"), this.a, '\'');
    }
}
