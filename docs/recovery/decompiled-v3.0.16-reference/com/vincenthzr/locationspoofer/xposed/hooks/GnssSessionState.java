package com.vincenthzr.locationspoofer.xposed.hooks;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class GnssSessionState {
    private boolean firstFix;
    private Long session;
    private boolean started;

    private final void select(long j) {
        Long l = this.session;
        if (l != null && l.longValue() == j) {
            return;
        }
        this.session = Long.valueOf(j);
        this.started = false;
        this.firstFix = false;
    }

    public final synchronized boolean acceptFirstFix(long j) {
        select(j);
        if (this.firstFix) {
            return false;
        }
        this.firstFix = true;
        return true;
    }

    public final synchronized boolean acceptStarted(long j) {
        select(j);
        if (this.started) {
            return false;
        }
        this.started = true;
        return true;
    }

    public final synchronized boolean needsFirstFix(long j) {
        Long l;
        l = this.session;
        return (l != null && l.longValue() == j && this.firstFix) ? false : true;
    }

    public final synchronized boolean needsStarted(long j) {
        Long l;
        l = this.session;
        return (l != null && l.longValue() == j && this.started) ? false : true;
    }

    public final synchronized void reset() {
        this.session = null;
        this.started = false;
        this.firstFix = false;
    }

    public final synchronized void restore(long[] jArr) {
        if (jArr != null) {
            if (jArr.length == 3) {
                long j = jArr[0];
                if (j >= 0) {
                    this.session = Long.valueOf(j);
                    this.started = jArr[1] == 1;
                    this.firstFix = jArr[2] == 1;
                }
            }
        }
    }

    public final synchronized long[] save() {
        Long l;
        try {
            l = this.session;
        } catch (Throwable th) {
            throw th;
        }
        return new long[]{l != null ? l.longValue() : -1L, this.started ? 1L : 0L, this.firstFix ? 1L : 0L};
    }
}
