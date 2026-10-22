package com.vincenthzr.locationspoofer.data.update;

import defpackage.mc0;
import defpackage.o51;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class UpdatePackagePolicy {
    public static final UpdatePackagePolicy INSTANCE = new UpdatePackagePolicy();
    public static final String SCHEME_METADATA = "com.vincenthzr.locationspoofer.UPDATE_SCHEME";

    private UpdatePackagePolicy() {
    }

    public static /* synthetic */ boolean canInstall$default(UpdatePackagePolicy updatePackagePolicy, UpdateArtifact updateArtifact, long j, Set set, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return updatePackagePolicy.canInstall(updateArtifact, j, set, z);
    }

    public final boolean accepts(UpdateArtifact updateArtifact, long j, long j2, String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        updateArtifact.getClass();
        set.getClass();
        set2.getClass();
        return canInstall(updateArtifact, j, set2, z) && matchesIdentity(updateArtifact, j2, str, str2, set);
    }

    public final boolean canInstall(UpdateArtifact updateArtifact, long j, Set<String> set, boolean z) {
        updateArtifact.getClass();
        set.getClass();
        return (((long) updateArtifact.getVersionCode()) > j || (z && ((long) updateArtifact.getVersionCode()) == j)) && set.contains(updateArtifact.getAbi());
    }

    public final boolean matchesIdentity(UpdateArtifact updateArtifact, long j, String str, String str2, Set<String> set) {
        updateArtifact.getClass();
        set.getClass();
        return j == ((long) updateArtifact.getVersionCode()) && o51.f(str, updateArtifact.getVersionName()) && o51.f(str2, updateArtifact.getScheme()) && set.equals(mc0.H(updateArtifact.getAbi()));
    }
}
