package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudClientArtifact {
    private final String abi;
    private final String id;
    private final String path;
    private final String sha256;
    private final long sizeBytes;

    public CloudClientArtifact(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.id = str;
        this.abi = str2;
        this.path = str3;
        this.sha256 = str4;
        this.sizeBytes = j;
    }

    public static /* synthetic */ CloudClientArtifact copy$default(CloudClientArtifact cloudClientArtifact, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudClientArtifact.id;
        }
        if ((i & 2) != 0) {
            str2 = cloudClientArtifact.abi;
        }
        if ((i & 4) != 0) {
            str3 = cloudClientArtifact.path;
        }
        if ((i & 8) != 0) {
            str4 = cloudClientArtifact.sha256;
        }
        if ((i & 16) != 0) {
            j = cloudClientArtifact.sizeBytes;
        }
        long j2 = j;
        return cloudClientArtifact.copy(str, str2, str3, str4, j2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.abi;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.sha256;
    }

    public final long component5() {
        return this.sizeBytes;
    }

    public final CloudClientArtifact copy(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new CloudClientArtifact(str, str2, str3, str4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudClientArtifact)) {
            return false;
        }
        CloudClientArtifact cloudClientArtifact = (CloudClientArtifact) obj;
        return o51.f(this.id, cloudClientArtifact.id) && o51.f(this.abi, cloudClientArtifact.abi) && o51.f(this.path, cloudClientArtifact.path) && o51.f(this.sha256, cloudClientArtifact.sha256) && this.sizeBytes == cloudClientArtifact.sizeBytes;
    }

    public final String getAbi() {
        return this.abi;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.sizeBytes) + p91.d(p91.d(p91.d(this.id.hashCode() * 31, 31, this.abi), 31, this.path), 31, this.sha256);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.abi;
        String str3 = this.path;
        String str4 = this.sha256;
        long j = this.sizeBytes;
        StringBuilder sbT = p91.t("CloudClientArtifact(id=", str, ", abi=", str2, ", path=");
        p91.y(sbT, str3, ", sha256=", str4, ", sizeBytes=");
        sbT.append(j);
        sbT.append(")");
        return sbT.toString();
    }
}
