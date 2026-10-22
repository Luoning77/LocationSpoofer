package com.vincenthzr.locationspoofer.data.cloud;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudResponseErrors {
    public static final CloudResponseErrors INSTANCE = new CloudResponseErrors();

    private CloudResponseErrors() {
    }

    public static /* synthetic */ String code$default(CloudResponseErrors cloudResponseErrors, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return cloudResponseErrors.code(i, str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final String code(int i, String str) {
        if (str != null) {
            if (str.equals("null")) {
                str = null;
            } else {
                Pattern patternCompile = Pattern.compile("[a-z][a-z0-9_]{0,63}");
                patternCompile.getClass();
                if (!patternCompile.matcher(str).matches()) {
                    str = null;
                }
            }
            if (str != null) {
                return str;
            }
        }
        if (i == 401) {
            return "invalid_session";
        }
        if (i == 403) {
            return "access_denied";
        }
        if (i == 426) {
            return "client_upgrade_required";
        }
        if (i == 429) {
            return "rate_limited";
        }
        if (i == 500) {
            return "service_unavailable";
        }
        switch (i) {
            case 502:
            case 503:
            case 504:
                return "service_unavailable";
            default:
                return "invalid_response";
        }
    }
}
