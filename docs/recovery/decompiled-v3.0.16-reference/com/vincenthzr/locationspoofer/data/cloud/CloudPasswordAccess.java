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
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudPasswordAccess {
    private final KeyPair keys;
    private final au0 monotonic;
    private final String publicKey;
    private String ticket;
    private long until;

    public CloudPasswordAccess(au0 au0Var) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        au0Var.getClass();
        this.monotonic = au0Var;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        this.keys = keyPairGenerateKeyPair;
        byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
        encoded.getClass();
        this.publicKey = CloudModelsKt.cloudDigestEncode(encoded);
        this.ticket = "";
    }

    public final void accept(String str, long j) {
        str.getClass();
        Pattern patternCompile = Pattern.compile("[A-Za-z0-9_-]{43}");
        patternCompile.getClass();
        if (!patternCompile.matcher(str).matches() || 1 > j || j >= 600001) {
            b81.w("invalid_response");
            return;
        }
        this.ticket = str;
        this.until = (j * 1000000) + ((Number) this.monotonic.invoke()).longValue();
    }

    public final String deviceProof(String str) {
        str.getClass();
        return sign("locationspoofer-password-recovery-v1\n" + this.ticket + "\n" + str);
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final String sign(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        str.getClass();
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(this.keys.getPrivate());
        byte[] bytes = str.getBytes(sw.a);
        bytes.getClass();
        signature.update(bytes);
        byte[] bArrSign = signature.sign();
        bArrSign.getClass();
        return CloudModelsKt.cloudDigestEncode(bArrSign);
    }

    public final boolean valid() {
        return this.ticket.length() > 0 && this.until > ((Number) this.monotonic.invoke()).longValue();
    }
}
