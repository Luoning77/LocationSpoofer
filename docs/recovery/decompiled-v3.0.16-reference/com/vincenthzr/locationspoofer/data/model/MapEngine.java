package com.vincenthzr.locationspoofer.data.model;

import defpackage.ca0;
import defpackage.hd0;
import defpackage.vk0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum MapEngine {
    SELF_HOSTED;

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());
    public static final Companion Companion = new Companion(null);

    public static vk0 getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final MapEngine fromStored(String str) {
            str.getClass();
            return MapEngine.SELF_HOSTED;
        }

        private Companion() {
        }
    }
}
