package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.b81;
import defpackage.o51;
import defpackage.wg2;
import defpackage.yo;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipPaymentUrls {
    public static final MembershipPaymentUrls INSTANCE = new MembershipPaymentUrls();

    private MembershipPaymentUrls() {
    }

    public final String validate(String str) throws CloudException {
        Object wg2Var;
        str.getClass();
        try {
            wg2Var = new URI(str);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        URI uri = (URI) wg2Var;
        if (uri == null) {
            b81.w("invalid_response");
            return null;
        }
        if (str.length() <= 4096 && o51.f(uri.getScheme(), "https") && yo.H0(new String[]{"api.xunhupay.com", "api.dpweixin.com"}).contains(uri.getHost()) && uri.getUserInfo() == null && yo.H0(new Integer[]{-1, 443}).contains(Integer.valueOf(uri.getPort())) && uri.getFragment() == null) {
            return str;
        }
        b81.w("invalid_response");
        return null;
    }
}
