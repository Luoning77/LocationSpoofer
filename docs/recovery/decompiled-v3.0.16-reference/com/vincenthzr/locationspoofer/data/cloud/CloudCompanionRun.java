package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.au0;
import defpackage.b81;
import defpackage.sw;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudCompanionRun {
    private final KeyPair keys;
    private volatile String leaseId;
    private final au0 monotonic;
    private final String publicKey;
    private volatile long untilNanos;

    public CloudCompanionRun(au0 au0Var) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        au0Var.getClass();
        this.monotonic = au0Var;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        this.keys = keyPairGenerateKeyPair;
        byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
        encoded.getClass();
        this.publicKey = CloudModelsKt.cloudDigestEncode(encoded);
        this.leaseId = "";
    }

    public static /* synthetic */ boolean valid$default(CloudCompanionRun cloudCompanionRun, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return cloudCompanionRun.valid(j);
    }

    public final void accept(String str, long j) throws CloudException {
        str.getClass();
        if (!EncryptedCloudSessionStore.Companion.getUUID_PATTERN$core_data_globalRelease().b(str) || 1 > j || j >= 120001) {
            b81.w("invalid_response");
            return;
        }
        this.leaseId = str;
        this.untilNanos = (j * 1000000) + ((Number) this.monotonic.invoke()).longValue();
    }

    public final void clear() {
        this.leaseId = "";
        this.untilNanos = 0L;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String sign(String str, boolean z) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        str.getClass();
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(this.keys.getPrivate());
        byte[] bytes = ("locationspoofer-companion-run-v1\n" + (z ? "" : this.leaseId) + "\n" + str).getBytes(sw.a);
        bytes.getClass();
        signature.update(bytes);
        byte[] bArrSign = signature.sign();
        bArrSign.getClass();
        return CloudModelsKt.cloudDigestEncode(bArrSign);
    }

    public final boolean valid(long j) {
        return this.leaseId.length() > 0 && this.untilNanos - ((Number) this.monotonic.invoke()).longValue() > j * 1000000;
    }
}
