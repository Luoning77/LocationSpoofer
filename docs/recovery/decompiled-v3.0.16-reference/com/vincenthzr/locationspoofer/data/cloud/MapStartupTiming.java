package com.vincenthzr.locationspoofer.data.cloud;

import android.os.SystemClock;
import android.util.Log;
import defpackage.hd0;
import defpackage.vk0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MapStartupTiming {
    public static final MapStartupTiming INSTANCE = new MapStartupTiming();
    private static final Set<Phase> recorded = new LinkedHashSet();
    private static Long startedAt;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public enum Phase {
        MAIN_UI_READY,
        ENVIRONMENT_READY,
        ACCOUNT_VERIFIED,
        MAP_STYLE_READY,
        MAP_FIRST_FRAME,
        AUTO_UPDATE_STARTED;

        private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());

        public static vk0 getEntries() {
            return $ENTRIES;
        }
    }

    private MapStartupTiming() {
    }

    public final synchronized void begin() {
        startedAt = Long.valueOf(SystemClock.elapsedRealtime());
        recorded.clear();
        Log.i("MapStartup", "phase=APPLICATION_STARTED elapsedMs=0");
    }

    public final void mark(Phase phase) {
        phase.getClass();
        synchronized (this) {
            Long l = startedAt;
            if (l != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                if (0 > jElapsedRealtime || jElapsedRealtime >= 60001 || !recorded.add(phase)) {
                    return;
                }
                Log.i("MapStartup", "phase=" + phase.name() + " elapsedMs=" + jElapsedRealtime);
            }
        }
    }
}
