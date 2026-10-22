package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudRuntimeAuthorization {
    private final CloudRuntimeBinding binding;
    private final CloudRuntimePermit permit;

    public CloudRuntimeAuthorization(CloudRuntimePermit cloudRuntimePermit, CloudRuntimeBinding cloudRuntimeBinding) {
        cloudRuntimePermit.getClass();
        cloudRuntimeBinding.getClass();
        this.permit = cloudRuntimePermit;
        this.binding = cloudRuntimeBinding;
    }

    public static /* synthetic */ CloudRuntimeAuthorization copy$default(CloudRuntimeAuthorization cloudRuntimeAuthorization, CloudRuntimePermit cloudRuntimePermit, CloudRuntimeBinding cloudRuntimeBinding, int i, Object obj) {
        if ((i & 1) != 0) {
            cloudRuntimePermit = cloudRuntimeAuthorization.permit;
        }
        if ((i & 2) != 0) {
            cloudRuntimeBinding = cloudRuntimeAuthorization.binding;
        }
        return cloudRuntimeAuthorization.copy(cloudRuntimePermit, cloudRuntimeBinding);
    }

    public final CloudRuntimePermit component1() {
        return this.permit;
    }

    public final CloudRuntimeBinding component2() {
        return this.binding;
    }

    public final CloudRuntimeAuthorization copy(CloudRuntimePermit cloudRuntimePermit, CloudRuntimeBinding cloudRuntimeBinding) {
        cloudRuntimePermit.getClass();
        cloudRuntimeBinding.getClass();
        return new CloudRuntimeAuthorization(cloudRuntimePermit, cloudRuntimeBinding);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudRuntimeAuthorization)) {
            return false;
        }
        CloudRuntimeAuthorization cloudRuntimeAuthorization = (CloudRuntimeAuthorization) obj;
        return o51.f(this.permit, cloudRuntimeAuthorization.permit) && o51.f(this.binding, cloudRuntimeAuthorization.binding);
    }

    public final CloudRuntimeBinding getBinding() {
        return this.binding;
    }

    public final CloudRuntimePermit getPermit() {
        return this.permit;
    }

    public int hashCode() {
        return this.binding.hashCode() + (this.permit.hashCode() * 31);
    }

    public String toString() {
        return "CloudRuntimeAuthorization(permit=" + this.permit + ", binding=" + this.binding + ")";
    }
}
