package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.b81;
import defpackage.l13;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SoftwareDeviceIdentity {
    public static final SoftwareDeviceIdentity INSTANCE = new SoftwareDeviceIdentity();

    private SoftwareDeviceIdentity() {
    }

    public final String digest(String str, String str2) throws CloudException {
        String lowerCase;
        String string;
        str.getClass();
        if (str2 == null || (string = l13.D0(str2).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        Pattern patternCompile = Pattern.compile("[a-f0-9]{1,16}");
        patternCompile.getClass();
        if (patternCompile.matcher(lowerCase).matches()) {
            for (int i = 0; i < lowerCase.length(); i++) {
                if (lowerCase.charAt(i) != '0') {
                    if (lowerCase.equals("9774d56d682e549c")) {
                        break;
                    }
                    return DeviceSignalCollector.Companion.hashSignal$core_data_globalRelease(str, "android_id", l13.o0(16, lowerCase));
                }
            }
        }
        b81.w("software_identity_unavailable");
        return null;
    }
}
