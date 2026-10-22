package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.am1;
import defpackage.zy;
import java.security.MessageDigest;
import java.util.Base64;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudModelsKt {
    public static final String SOFTWARE_SIGNING_PROFILE = "software-v1";

    public static final String cloudBodyDigest(byte[] bArr) {
        bArr.getClass();
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        bArrDigest.getClass();
        return cloudDigestEncode(bArrDigest);
    }

    public static final String cloudCanonical(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return zy.s0(am1.G("locationspoofer-client-v2", str, str2, str3, str4, str5, str6, str7), "\n", null, null, null, 62);
    }

    public static final String cloudDigestEncode(byte[] bArr) {
        bArr.getClass();
        String strEncodeToString = Base64.getUrlEncoder().withoutPadding().encodeToString(bArr);
        strEncodeToString.getClass();
        return strEncodeToString;
    }
}
