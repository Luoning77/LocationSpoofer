package com.vincenthzr.locationspoofer.data.update;

import defpackage.o51;
import defpackage.p91;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class UpdateArtifact {
    private final String abi;
    private final String id;
    private final String path;
    private final String scheme;
    private final String sha256;
    private final long sizeBytes;
    private final int versionCode;
    private final String versionName;

    public UpdateArtifact(String str, String str2, String str3, String str4, long j, String str5, String str6, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.id = str;
        this.abi = str2;
        this.path = str3;
        this.sha256 = str4;
        this.sizeBytes = j;
        this.scheme = str5;
        this.versionName = str6;
        this.versionCode = i;
    }

    public static /* synthetic */ UpdateArtifact copy$default(UpdateArtifact updateArtifact, String str, String str2, String str3, String str4, long j, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = updateArtifact.id;
        }
        if ((i2 & 2) != 0) {
            str2 = updateArtifact.abi;
        }
        if ((i2 & 4) != 0) {
            str3 = updateArtifact.path;
        }
        if ((i2 & 8) != 0) {
            str4 = updateArtifact.sha256;
        }
        if ((i2 & 16) != 0) {
            j = updateArtifact.sizeBytes;
        }
        if ((i2 & 32) != 0) {
            str5 = updateArtifact.scheme;
        }
        if ((i2 & 64) != 0) {
            str6 = updateArtifact.versionName;
        }
        if ((i2 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            i = updateArtifact.versionCode;
        }
        int i3 = i;
        String str7 = str5;
        long j2 = j;
        String str8 = str3;
        String str9 = str4;
        return updateArtifact.copy(str, str2, str8, str9, j2, str7, str6, i3);
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

    public final String component6() {
        return this.scheme;
    }

    public final String component7() {
        return this.versionName;
    }

    public final int component8() {
        return this.versionCode;
    }

    public final UpdateArtifact copy(String str, String str2, String str3, String str4, long j, String str5, String str6, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new UpdateArtifact(str, str2, str3, str4, j, str5, str6, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateArtifact)) {
            return false;
        }
        UpdateArtifact updateArtifact = (UpdateArtifact) obj;
        return o51.f(this.id, updateArtifact.id) && o51.f(this.abi, updateArtifact.abi) && o51.f(this.path, updateArtifact.path) && o51.f(this.sha256, updateArtifact.sha256) && this.sizeBytes == updateArtifact.sizeBytes && o51.f(this.scheme, updateArtifact.scheme) && o51.f(this.versionName, updateArtifact.versionName) && this.versionCode == updateArtifact.versionCode;
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

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return Integer.hashCode(this.versionCode) + p91.d(p91.d(p91.c(p91.d(p91.d(p91.d(this.id.hashCode() * 31, 31, this.abi), 31, this.path), 31, this.sha256), 31, this.sizeBytes), 31, this.scheme), 31, this.versionName);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.abi;
        String str3 = this.path;
        String str4 = this.sha256;
        long j = this.sizeBytes;
        String str5 = this.scheme;
        String str6 = this.versionName;
        int i = this.versionCode;
        StringBuilder sbT = p91.t("UpdateArtifact(id=", str, ", abi=", str2, ", path=");
        p91.y(sbT, str3, ", sha256=", str4, ", sizeBytes=");
        sbT.append(j);
        sbT.append(", scheme=");
        sbT.append(str5);
        sbT.append(", versionName=");
        sbT.append(str6);
        sbT.append(", versionCode=");
        sbT.append(i);
        sbT.append(")");
        return sbT.toString();
    }
}
