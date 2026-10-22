package com.vincenthzr.locationspoofer.data.repository;

import com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository;
import defpackage.q60;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class WifiRepository {
    private final CommunityWifiRepository community;

    public WifiRepository(CommunityWifiRepository communityWifiRepository) {
        communityWifiRepository.getClass();
        this.community = communityWifiRepository;
    }

    public final Object fetchWifiData(double d, double d2, q60 q60Var) {
        return this.community.nearby(d, d2, q60Var);
    }
}
