package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.l13;
import defpackage.yo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HardwareIdentity {
    public static final HardwareIdentity INSTANCE = new HardwareIdentity();

    private HardwareIdentity() {
    }

    public final String normalizedSocSerial$core_data_globalRelease(String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        String lowerCase = l13.D0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strQ0 = l13.q0(lowerCase, "0x");
        int length = strQ0.length();
        if (4 > length || length >= 65) {
            return null;
        }
        for (int i = 0; i < strQ0.length(); i++) {
            if (!l13.d0("0123456789abcdef", strQ0.charAt(i))) {
                return null;
            }
        }
        for (int i2 = 0; i2 < strQ0.length(); i2++) {
            if (strQ0.charAt(i2) != '0') {
                for (int i3 = 0; i3 < strQ0.length(); i3++) {
                    if (strQ0.charAt(i3) != 'f') {
                        char[] cArr = {'0'};
                        int length2 = strQ0.length();
                        for (int i4 = 0; i4 < length2; i4++) {
                            if (!yo.i0(cArr, strQ0.charAt(i4))) {
                                charSequenceSubSequence = strQ0.subSequence(i4, strQ0.length());
                                return l13.o0(16, charSequenceSubSequence.toString());
                            }
                        }
                        charSequenceSubSequence = "";
                        return l13.o0(16, charSequenceSubSequence.toString());
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final String socSerial(List<String> list) {
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String strNormalizedSocSerial$core_data_globalRelease = normalizedSocSerial$core_data_globalRelease((String) it.next());
            if (strNormalizedSocSerial$core_data_globalRelease != null) {
                return strNormalizedSocSerial$core_data_globalRelease;
            }
        }
        return null;
    }
}
