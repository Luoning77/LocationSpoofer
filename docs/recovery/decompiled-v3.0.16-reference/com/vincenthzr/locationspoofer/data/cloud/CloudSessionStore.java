package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.b81;
import defpackage.jq1;
import defpackage.my;
import defpackage.uj0;
import defpackage.vj0;
import defpackage.yo;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CloudSessionStore {
    /* JADX INFO: Access modifiers changed from: private */
    static CharSequence publicKeyFingerprint$lambda$0(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    static /* synthetic */ void recordDiagnostic$default(CloudSessionStore cloudSessionStore, String str, String str2, Integer num, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: recordDiagnostic");
            return;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        cloudSessionStore.recordDiagnostic(str, str2, num);
    }

    default void acknowledgeDiagnostics(List<CloudDiagnostic> list) {
        list.getClass();
    }

    default void adoptRecoveredDevice(String str, String str2) {
        str.getClass();
        str2.getClass();
        saveDeviceId(str);
    }

    default CloudClientInfo clientInfo() {
        return null;
    }

    default boolean companionMode() {
        return false;
    }

    default void completeTeeEnrollment(String str, String str2, String str3) throws CloudException {
        str.getClass();
        str2.getClass();
        str3.getClass();
        throw new CloudException("device_recovery_required", null, null, null, 14, null);
    }

    default CloudHardwareIdentity deviceHardwareIdentity() {
        return new CloudHardwareIdentity(jq1.R(deviceSignals()), null, null, null, 14, null);
    }

    String deviceHint();

    String deviceId();

    default Map<String, String> deviceSignals() {
        return vj0.e;
    }

    default boolean getAccountProtocol() {
        return false;
    }

    default boolean getHardwareSnapshotProtocol() {
        return false;
    }

    default boolean getSupportsDeviceProof() {
        return true;
    }

    default boolean getSupportsPasswordAccess() {
        return false;
    }

    default boolean getSupportsSessionProof() {
        return false;
    }

    default CloudRuntimeBinding mapPreviewBinding() {
        return null;
    }

    default CloudMapResourceCache mapResourceCache() {
        return null;
    }

    default long monotonicTimeNanos() {
        return System.nanoTime();
    }

    default String nonce() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return CloudModelsKt.cloudDigestEncode(bArr);
    }

    default List<CloudDiagnostic> pendingDiagnostics() {
        return uj0.e;
    }

    default CloudTeeEnrollment pendingTeeEnrollment() {
        return null;
    }

    default void preparePasswordIdentity() {
        prepareHardwareIdentity();
    }

    default String prepareRecoveryInfo() throws CloudException {
        throw new CloudException("device_recovery_required", null, null, null, 14, null);
    }

    String publicKey();

    default String publicKeyFingerprint() {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(Base64.getUrlDecoder().decode(publicKey()));
        bArrDigest.getClass();
        return yo.z0(bArrDigest, new my(1));
    }

    CloudTokens read();

    default String readRuntimeRun() {
        return null;
    }

    default void recordDiagnostic(String str, String str2, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        recordDiagnostic(str, str2, num);
    }

    void saveDeviceId(String str);

    default void selectCompanionMode(boolean z) {
        if (z) {
            b81.w("companion_not_supported");
        }
    }

    String sign(String str);

    default String signingProfile() {
        return null;
    }

    default String softwareAndroidIdHash() {
        return null;
    }

    default Boolean teeAvailability() {
        return null;
    }

    void write(CloudTokens cloudTokens);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        @Deprecated
        public static void acknowledgeDiagnostics(CloudSessionStore cloudSessionStore, List<CloudDiagnostic> list) {
            list.getClass();
            CloudSessionStore.super.acknowledgeDiagnostics(list);
        }

        @Deprecated
        public static void adoptRecoveredDevice(CloudSessionStore cloudSessionStore, String str, String str2) {
            str.getClass();
            str2.getClass();
            CloudSessionStore.super.adoptRecoveredDevice(str, str2);
        }

        @Deprecated
        public static CloudClientInfo clientInfo(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.clientInfo();
        }

        @Deprecated
        public static boolean companionMode(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.companionMode();
        }

        @Deprecated
        public static void completeTeeEnrollment(CloudSessionStore cloudSessionStore, String str, String str2, String str3) throws CloudException {
            str.getClass();
            str2.getClass();
            str3.getClass();
            CloudSessionStore.super.completeTeeEnrollment(str, str2, str3);
        }

        @Deprecated
        public static CloudHardwareIdentity deviceHardwareIdentity(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.deviceHardwareIdentity();
        }

        @Deprecated
        public static Map<String, String> deviceSignals(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.deviceSignals();
        }

        @Deprecated
        public static boolean getAccountProtocol(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.getAccountProtocol();
        }

        @Deprecated
        public static boolean getHardwareSnapshotProtocol(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.getHardwareSnapshotProtocol();
        }

        @Deprecated
        public static boolean getSupportsDeviceProof(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.getSupportsDeviceProof();
        }

        @Deprecated
        public static boolean getSupportsPasswordAccess(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.getSupportsPasswordAccess();
        }

        @Deprecated
        public static boolean getSupportsSessionProof(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.getSupportsSessionProof();
        }

        @Deprecated
        public static CloudRuntimeBinding mapPreviewBinding(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.mapPreviewBinding();
        }

        @Deprecated
        public static CloudMapResourceCache mapResourceCache(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.mapResourceCache();
        }

        @Deprecated
        public static long monotonicTimeNanos(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.monotonicTimeNanos();
        }

        @Deprecated
        public static String nonce(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.nonce();
        }

        @Deprecated
        public static List<CloudDiagnostic> pendingDiagnostics(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.pendingDiagnostics();
        }

        @Deprecated
        public static CloudTeeEnrollment pendingTeeEnrollment(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.pendingTeeEnrollment();
        }

        @Deprecated
        public static void prepareHardwareIdentity(CloudSessionStore cloudSessionStore) {
            CloudSessionStore.super.prepareHardwareIdentity();
        }

        @Deprecated
        public static void preparePasswordIdentity(CloudSessionStore cloudSessionStore) {
            CloudSessionStore.super.preparePasswordIdentity();
        }

        @Deprecated
        public static String prepareRecoveryInfo(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.prepareRecoveryInfo();
        }

        @Deprecated
        public static String publicKeyFingerprint(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.publicKeyFingerprint();
        }

        @Deprecated
        public static String readRuntimeRun(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.readRuntimeRun();
        }

        @Deprecated
        public static void recordDiagnostic(CloudSessionStore cloudSessionStore, String str, String str2, Integer num) {
            str.getClass();
            str2.getClass();
            CloudSessionStore.super.recordDiagnostic(str, str2, num);
        }

        @Deprecated
        public static void saveMapPreviewBinding(CloudSessionStore cloudSessionStore, CloudRuntimeBinding cloudRuntimeBinding) {
            CloudSessionStore.super.saveMapPreviewBinding(cloudRuntimeBinding);
        }

        @Deprecated
        public static void selectCompanionMode(CloudSessionStore cloudSessionStore, boolean z) {
            CloudSessionStore.super.selectCompanionMode(z);
        }

        @Deprecated
        public static String signingProfile(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.signingProfile();
        }

        @Deprecated
        public static String softwareAndroidIdHash(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.softwareAndroidIdHash();
        }

        @Deprecated
        public static Boolean teeAvailability(CloudSessionStore cloudSessionStore) {
            return CloudSessionStore.super.teeAvailability();
        }

        @Deprecated
        public static void writeRuntimeRun(CloudSessionStore cloudSessionStore, String str) {
            CloudSessionStore.super.writeRuntimeRun(str);
        }

        @Deprecated
        public static void recordDiagnostic(CloudSessionStore cloudSessionStore, String str, String str2, Integer num, String str3) {
            str.getClass();
            str2.getClass();
            CloudSessionStore.super.recordDiagnostic(str, str2, num, str3);
        }
    }

    default void recordDiagnostic(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
    }

    default void prepareHardwareIdentity() {
    }

    default void saveMapPreviewBinding(CloudRuntimeBinding cloudRuntimeBinding) {
    }

    default void writeRuntimeRun(String str) {
    }
}
