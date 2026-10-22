package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudAdaptation {
    private final String markdown;
    private final String sha256;

    public CloudAdaptation(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.markdown = str;
        this.sha256 = str2;
    }

    public static /* synthetic */ CloudAdaptation copy$default(CloudAdaptation cloudAdaptation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudAdaptation.markdown;
        }
        if ((i & 2) != 0) {
            str2 = cloudAdaptation.sha256;
        }
        return cloudAdaptation.copy(str, str2);
    }

    public final String component1() {
        return this.markdown;
    }

    public final String component2() {
        return this.sha256;
    }

    public final CloudAdaptation copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new CloudAdaptation(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudAdaptation)) {
            return false;
        }
        CloudAdaptation cloudAdaptation = (CloudAdaptation) obj;
        return o51.f(this.markdown, cloudAdaptation.markdown) && o51.f(this.sha256, cloudAdaptation.sha256);
    }

    public final String getMarkdown() {
        return this.markdown;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return this.sha256.hashCode() + (this.markdown.hashCode() * 31);
    }

    public String toString() {
        return az2.l("CloudAdaptation(markdown=", this.markdown, ", sha256=", this.sha256, ")");
    }
}
