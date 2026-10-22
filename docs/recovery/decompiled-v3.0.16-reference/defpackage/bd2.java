package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum bd2 {
    f("http/1.0"),
    g("http/1.1"),
    h("spdy/3.1"),
    i("h2"),
    j("h2_prior_knowledge"),
    k("quic");

    public final String e;

    bd2(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
