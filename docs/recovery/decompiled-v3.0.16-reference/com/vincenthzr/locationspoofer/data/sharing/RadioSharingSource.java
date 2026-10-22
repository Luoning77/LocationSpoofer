package com.vincenthzr.locationspoofer.data.sharing;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import defpackage.q60;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface RadioSharingSource {
    StateFlow<CloudAccountState> getAccountState();

    Object status(String str, q60 q60Var);

    Object upload(RadioContributionDraft radioContributionDraft, String str, q60 q60Var);

    Object withdraw(String str, q60 q60Var);
}
