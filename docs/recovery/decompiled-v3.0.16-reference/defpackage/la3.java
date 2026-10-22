package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class la3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[fk3.values().length];
        a = iArr;
        try {
            iArr[fk3.Mapbox.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[fk3.MapTiler.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[fk3.MapLibre.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
