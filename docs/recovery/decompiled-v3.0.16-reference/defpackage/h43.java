package defpackage;

import com.vincenthzr.locationspoofer.data.sync.SyncCategory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class h43 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SyncCategory.values().length];
        try {
            iArr[SyncCategory.SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SyncCategory.FAVORITES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SyncCategory.ROUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SyncCategory.COLLECTED_POINTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SyncCategory.COLLECTED_ROUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
