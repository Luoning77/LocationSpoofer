package kotlinx.coroutines.selects;

import defpackage.hd0;
import defpackage.vk0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum TrySelectDetailedResult {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());

    public static vk0 getEntries() {
        return $ENTRIES;
    }
}
