package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.fo;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationStartupGate {
    private final WeakHashMap<Object, Long> deadlines;
    private final long periodNanos;

    public LocationStartupGate(long j) {
        this.periodNanos = j;
        if (j > 0) {
            this.deadlines = new WeakHashMap<>();
        } else {
            fo.i("Failed requirement.");
            throw null;
        }
    }

    public final synchronized void clear() {
        this.deadlines.clear();
    }

    public final synchronized void forget(Object obj) {
        obj.getClass();
        this.deadlines.remove(obj);
    }

    public final synchronized void registered(Object obj, long j) {
        obj.getClass();
        this.deadlines.put(obj, Long.valueOf(j + this.periodNanos));
    }

    public final synchronized void registering(Object obj) {
        obj.getClass();
        this.deadlines.put(obj, Long.MAX_VALUE);
    }

    public final synchronized boolean shouldWait(Object obj, long j) {
        obj.getClass();
        Long l = this.deadlines.get(obj);
        if (l == null) {
            return false;
        }
        if (j < l.longValue()) {
            return true;
        }
        this.deadlines.remove(obj);
        return false;
    }
}
