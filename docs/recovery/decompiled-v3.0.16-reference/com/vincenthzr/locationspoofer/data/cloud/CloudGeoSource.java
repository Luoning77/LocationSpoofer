package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.hd0;
import defpackage.o51;
import defpackage.vk0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum CloudGeoSource {
    FOLLOW_MAP,
    NOMINATIM;

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());
    public static final Companion Companion = new Companion(null);

    public static vk0 getEntries() {
        return $ENTRIES;
    }

    public final String engine(String str, boolean z) {
        str.getClass();
        return "nominatim";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final CloudGeoSource fromStored(String str) {
            Object next;
            str.getClass();
            Iterator<E> it = CloudGeoSource.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!o51.f(((CloudGeoSource) next).name(), str));
            CloudGeoSource cloudGeoSource = (CloudGeoSource) next;
            return cloudGeoSource == null ? CloudGeoSource.FOLLOW_MAP : cloudGeoSource;
        }

        private Companion() {
        }
    }
}
