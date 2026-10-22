package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.au0;
import defpackage.ca0;
import defpackage.i52;
import defpackage.o51;
import defpackage.s13;
import defpackage.sw;
import defpackage.yo;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudSessionProof {
    public static final Companion Companion = new Companion(null);
    private volatile String id;
    private KeyPair keys;
    private final au0 monotonic;
    private String token;
    private long until;

    public CloudSessionProof(au0 au0Var) {
        au0Var.getClass();
        this.monotonic = au0Var;
        this.token = "";
        this.id = "";
    }

    private final KeyPair keys() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPair keyPair = this.keys;
        if (keyPair != null) {
            return keyPair;
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        this.keys = keyPairGenerateKeyPair;
        keyPairGenerateKeyPair.getClass();
        return keyPairGenerateKeyPair;
    }

    public static /* synthetic */ boolean valid$default(CloudSessionProof cloudSessionProof, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 30000;
        }
        return cloudSessionProof.valid(str, j);
    }

    public final synchronized void accept(String str, long j, String str2) {
        str.getClass();
        str2.getClass();
        if (!EncryptedCloudSessionStore.Companion.getUUID_PATTERN$core_data_globalRelease().b(str) || 1 > j || j >= 900001) {
            throw new CloudException("invalid_response", null, null, null, 14, null);
        }
        this.id = str;
        this.token = str2;
        this.until = (j * 1000000) + ((Number) this.monotonic.invoke()).longValue();
    }

    public final synchronized i52 authorization(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!valid(str2, 0L)) {
            return null;
        }
        return new i52(this.id, sign(str, str2));
    }

    public final synchronized void clear() {
        this.id = "";
        this.token = "";
        this.until = 0L;
        this.keys = null;
    }

    public final String getId() {
        return this.id;
    }

    public final synchronized String publicKey() {
        byte[] encoded;
        encoded = keys().getPublic().getEncoded();
        encoded.getClass();
        return CloudModelsKt.cloudDigestEncode(encoded);
    }

    public final synchronized String sign(String str, String str2) {
        byte[] bArrSign;
        str.getClass();
        str2.getClass();
        if (!valid(str2, 0L)) {
            throw new CloudException("session_proof_expired", null, null, null, 14, null);
        }
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(keys().getPrivate());
        byte[] bytes = ("locationspoofer-session-proof-v1\n" + this.id + "\n" + str).getBytes(sw.a);
        bytes.getClass();
        signature.update(bytes);
        bArrSign = signature.sign();
        bArrSign.getClass();
        return CloudModelsKt.cloudDigestEncode(bArrSign);
    }

    public final synchronized boolean valid(String str, long j) {
        str.getClass();
        return this.id.length() > 0 && o51.f(this.token, str) && this.until - ((Number) this.monotonic.invoke()).longValue() > j * 1000000;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final boolean supports(String str, String str2) {
            str.getClass();
            str2.getClass();
            if (!str.equals("GET") || !s13.Z(str2, "/v2/", false) || s13.Z(str2, "/v2/auth/", false) || s13.Z(str2, "/v2/devices/", false)) {
                return str.equals("POST") && yo.H0(new String[]{"/v2/runtime/permit", "/v2/runtime/run", "/v2/places/reverse", "/v2/routes/plan", "/v2/environment/wifi", "/v2/environment/cells", "/v2/wifi/nearby", "/v2/client/diagnostics"}).contains(str2);
            }
            return true;
        }

        private Companion() {
        }
    }
}
