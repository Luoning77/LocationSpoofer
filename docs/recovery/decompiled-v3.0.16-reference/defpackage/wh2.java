package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum wh2 {
    f("Android"),
    g("HyperOS"),
    h("ColorOS"),
    i("One UI"),
    j("OriginOS"),
    k("MagicOS"),
    l("Flyme");

    public final String e;

    static {
        am1.F("AOSP");
        am1.G("HyperOS", "MIUI");
        am1.G("ColorOS", "OxygenOS");
        am1.F("One UI");
        am1.F("OriginOS");
        am1.G("MagicOS", "EMUI");
        am1.F("Flyme");
    }

    wh2(String str) {
        this.e = str;
    }
}
