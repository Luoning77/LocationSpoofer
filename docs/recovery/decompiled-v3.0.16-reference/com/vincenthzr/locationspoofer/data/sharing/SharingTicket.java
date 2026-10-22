package com.vincenthzr.locationspoofer.data.sharing;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharingTicket {
    private final long generation;
    private final String identity;
    private final String session;

    public SharingTicket(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.identity = str;
        this.session = str2;
        this.generation = j;
    }

    public final long getGeneration$core_data_globalRelease() {
        return this.generation;
    }

    public final String getIdentity$core_data_globalRelease() {
        return this.identity;
    }

    public final String getSession$core_data_globalRelease() {
        return this.session;
    }
}
