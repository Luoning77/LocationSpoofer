package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.am1;
import defpackage.az;
import defpackage.az2;
import defpackage.ca0;
import defpackage.ji2;
import defpackage.jq1;
import defpackage.l13;
import defpackage.my;
import defpackage.o51;
import defpackage.sw;
import defpackage.wg2;
import defpackage.yf1;
import defpackage.yo;
import defpackage.zy;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DeviceSignalCollector {
    private static final String ROOT_SIGNALS_COMMAND = "getprop ro.boot.serialno; getprop ro.serialno; getprop ro.soc.serialno; for path in /sys/devices/soc0/serial_number /sys/devices/system/soc/soc0/serial_number /proc/device-tree/serial-number /sys/firmware/devicetree/base/serial-number; do if [ -r \"$path\" ]; then head -c 128 \"$path\" | tr -d '\\000\\r\\n'; fi; printf '\\n'; done";
    private final String realm;
    public static final Companion Companion = new Companion(null);
    private static final List<String> DETAIL_SOURCES = am1.G("boot_serial", "device_serial", "soc_serial", "soc0_serial", "system_soc_serial", "device_tree_serial", "firmware_tree_serial", "cpu_serial", "mtk_chip_serial");
    private static final String DETAILS_COMMAND = "(set -o pipefail) 2>/dev/null && set -o pipefail\nprop() { v=$(getprop \"$2\" 2>/dev/null); if [ \"$?\" -ne 0 ]; then printf '%s\\tfailed\\t\\n' \"$1\"; elif [ -n \"$v\" ]; then printf '%s\\tok\\t%s\\n' \"$1\" \"$v\"; else printf '%s\\tmissing\\t\\n' \"$1\"; fi; }\nnode() { if [ ! -e \"$2\" ]; then printf '%s\\tmissing\\t\\n' \"$1\"; elif [ ! -r \"$2\" ]; then printf '%s\\tunreadable\\t\\n' \"$1\"; else v=$(head -c 128 \"$2\" 2>/dev/null | tr -d '\\000\\r\\n'); if [ \"$?\" -ne 0 ]; then printf '%s\\tfailed\\t\\n' \"$1\"; else printf '%s\\tok\\t%s\\n' \"$1\" \"$v\"; fi; fi; }\nprop boot_serial ro.boot.serialno\nprop device_serial ro.serialno\nprop soc_serial ro.soc.serialno\nnode soc0_serial /sys/devices/soc0/serial_number\nnode system_soc_serial /sys/devices/system/soc/soc0/serial_number\nnode device_tree_serial /proc/device-tree/serial-number\nnode firmware_tree_serial /sys/firmware/devicetree/base/serial-number\nv=$(sed -n 's/^Serial[[:space:]]*:[[:space:]]*//p' /proc/cpuinfo 2>/dev/null | head -n 1); printf 'cpu_serial\\tok\\t%s\\n' \"$v\"\nnode mtk_chip_serial /proc/chip/serial";

    public DeviceSignalCollector(String str) {
        str.getClass();
        this.realm = str;
    }

    public final CloudHardwareIdentity collect() {
        Object wg2Var;
        CloudHardwareIdentity cloudHardwareIdentity = new CloudHardwareIdentity(null, null, null, null, 15, null);
        int i = 0;
        try {
            wg2Var = new ProcessBuilder("su", "-c", ROOT_SIGNALS_COMMAND).redirectErrorStream(false).start();
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        Process process = (Process) wg2Var;
        if (process != null) {
            try {
                process.getOutputStream().close();
                if (process.waitFor(1500L, TimeUnit.MILLISECONDS) && process.exitValue() == 0) {
                    InputStream inputStream = process.getInputStream();
                    try {
                        byte[] bArr = new byte[2048];
                        while (i < 2048) {
                            int i2 = inputStream.read(bArr, i, 2048 - i);
                            if (i2 <= 0) {
                                break;
                            }
                            i += i2;
                        }
                        List<String> listN0 = l13.n0(new String(Arrays.copyOf(bArr, i), sw.a));
                        ji2.z(inputStream, null);
                        cloudHardwareIdentity = Companion.serialIdentity$core_data_globalRelease(this.realm, listN0);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ji2.z(inputStream, th2);
                            throw th3;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                process.destroyForcibly();
            } catch (Throwable unused2) {
            }
            try {
                process.getInputStream().close();
            } catch (Throwable unused3) {
            }
            try {
                process.getErrorStream().close();
            } catch (Throwable unused4) {
            }
        }
        return cloudHardwareIdentity;
    }

    public final CloudHardwareIdentity collectDetailed() {
        try {
            int i = 0;
            Process processStart = new ProcessBuilder("su", "-c", DETAILS_COMMAND).redirectErrorStream(false).start();
            try {
                try {
                    processStart.getOutputStream().close();
                    if (!processStart.waitFor(6000L, TimeUnit.MILLISECONDS)) {
                        CloudHardwareIdentity cloudHardwareIdentityFailedSnapshot$core_data_globalRelease = Companion.failedSnapshot$core_data_globalRelease("timeout");
                        try {
                            processStart.destroyForcibly();
                        } catch (Throwable unused) {
                        }
                        try {
                            processStart.getInputStream().close();
                        } catch (Throwable unused2) {
                        }
                        try {
                            processStart.getErrorStream().close();
                        } catch (Throwable unused3) {
                        }
                        return cloudHardwareIdentityFailedSnapshot$core_data_globalRelease;
                    }
                    if (processStart.exitValue() != 0) {
                        CloudHardwareIdentity cloudHardwareIdentityFailedSnapshot$core_data_globalRelease2 = Companion.failedSnapshot$core_data_globalRelease(processStart.exitValue() == 1 ? "denied" : "failed");
                        try {
                            processStart.destroyForcibly();
                        } catch (Throwable unused4) {
                        }
                        try {
                            processStart.getInputStream().close();
                        } catch (Throwable unused5) {
                        }
                        try {
                            processStart.getErrorStream().close();
                        } catch (Throwable unused6) {
                        }
                        return cloudHardwareIdentityFailedSnapshot$core_data_globalRelease2;
                    }
                    InputStream inputStream = processStart.getInputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        while (i < 8192) {
                            int i2 = inputStream.read(bArr, i, 8192 - i);
                            if (i2 <= 0) {
                                break;
                            }
                            i += i2;
                        }
                        String str = new String(Arrays.copyOf(bArr, i), sw.a);
                        ji2.z(inputStream, null);
                        CloudHardwareIdentity cloudHardwareIdentityDetailedIdentity$core_data_globalRelease = Companion.detailedIdentity$core_data_globalRelease(this.realm, str);
                        try {
                            processStart.destroyForcibly();
                        } catch (Throwable unused7) {
                        }
                        try {
                            processStart.getInputStream().close();
                        } catch (Throwable unused8) {
                        }
                        try {
                            processStart.getErrorStream().close();
                        } catch (Throwable unused9) {
                        }
                        return cloudHardwareIdentityDetailedIdentity$core_data_globalRelease;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ji2.z(inputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        processStart.destroyForcibly();
                    } catch (Throwable unused10) {
                    }
                    try {
                        processStart.getInputStream().close();
                    } catch (Throwable unused11) {
                    }
                    try {
                        processStart.getErrorStream().close();
                        throw th3;
                    } catch (Throwable unused12) {
                        throw th3;
                    }
                }
            } catch (Exception unused13) {
                CloudHardwareIdentity cloudHardwareIdentityFailedSnapshot$core_data_globalRelease3 = Companion.failedSnapshot$core_data_globalRelease("failed");
                try {
                    processStart.destroyForcibly();
                } catch (Throwable unused14) {
                }
                try {
                    processStart.getInputStream().close();
                } catch (Throwable unused15) {
                }
                try {
                    processStart.getErrorStream().close();
                } catch (Throwable unused16) {
                }
                return cloudHardwareIdentityFailedSnapshot$core_data_globalRelease3;
            }
        } catch (Exception unused17) {
            return Companion.failedSnapshot$core_data_globalRelease("unavailable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence hashSignal$lambda$15(byte b) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        public final CloudHardwareIdentity detailedIdentity$core_data_globalRelease(String str, String str2) {
            String strNormalizedSignal$core_data_globalRelease;
            str.getClass();
            str2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> dETAIL_SOURCES$core_data_globalRelease = getDETAIL_SOURCES$core_data_globalRelease();
            int iM = jq1.M(az.Y(dETAIL_SOURCES$core_data_globalRelease, 10));
            if (iM < 16) {
                iM = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM);
            for (Object obj : dETAIL_SOURCES$core_data_globalRelease) {
                linkedHashMap2.put(obj, "missing");
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            yf1 yf1Var = new yf1(str2);
            while (true) {
                strNormalizedSignal$core_data_globalRelease = null;
                if (!yf1Var.hasNext()) {
                    break;
                }
                List listU0 = l13.u0((String) yf1Var.next(), new char[]{'\t'}, 2);
                String str3 = (String) zy.o0(listU0);
                if (str3 != null) {
                    Companion companion = DeviceSignalCollector.Companion;
                    if (!companion.getDETAIL_SOURCES$core_data_globalRelease().contains(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        String str4 = (String) zy.p0(listU0, 1);
                        if (zy.g0(yo.H0(new String[]{"unreadable", "failed"}), str4)) {
                            str4.getClass();
                            linkedHashMap3.put(str3, str4);
                        } else {
                            String str5 = (String) zy.p0(listU0, 2);
                            if (!yo.H0(new String[]{"soc0_serial", "system_soc_serial", "cpu_serial", "mtk_chip_serial"}).contains(str3)) {
                                strNormalizedSignal$core_data_globalRelease = companion.normalizedSignal$core_data_globalRelease(str5);
                            } else if (str5 != null) {
                                strNormalizedSignal$core_data_globalRelease = HardwareIdentity.INSTANCE.normalizedSocSerial$core_data_globalRelease(str5);
                            }
                            if (!o51.f(str4, "ok") || strNormalizedSignal$core_data_globalRelease == null) {
                                linkedHashMap3.put(str3, (str5 == null || l13.k0(str5) || o51.f(str4, "missing")) ? "missing" : "invalid");
                            } else {
                                linkedHashMap.put(str3, strNormalizedSignal$core_data_globalRelease);
                                linkedHashMap3.put(str3, "ok");
                            }
                        }
                    }
                }
            }
            Iterator it = am1.G("soc0_serial", "system_soc_serial", "device_tree_serial", "firmware_tree_serial").iterator();
            while (it.hasNext()) {
                String str6 = (String) linkedHashMap.get((String) it.next());
                String strNormalizedSocSerial$core_data_globalRelease = str6 != null ? HardwareIdentity.INSTANCE.normalizedSocSerial$core_data_globalRelease(str6) : null;
                if (strNormalizedSocSerial$core_data_globalRelease != null) {
                    strNormalizedSignal$core_data_globalRelease = strNormalizedSocSerial$core_data_globalRelease;
                    break;
                }
            }
            if (strNormalizedSignal$core_data_globalRelease != null) {
                linkedHashMap.put("soc_serial_sysfs", strNormalizedSignal$core_data_globalRelease);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(jq1.M(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap4.put(entry.getKey(), DeviceSignalCollector.Companion.hashSignal$core_data_globalRelease(str, (String) entry.getKey(), (String) entry.getValue()));
            }
            return new CloudHardwareIdentity(linkedHashMap4, linkedHashMap, linkedHashMap3, linkedHashMap.isEmpty() ? "empty" : "ok");
        }

        public final CloudHardwareIdentity failedSnapshot$core_data_globalRelease(String str) {
            str.getClass();
            List<String> dETAIL_SOURCES$core_data_globalRelease = getDETAIL_SOURCES$core_data_globalRelease();
            int iM = jq1.M(az.Y(dETAIL_SOURCES$core_data_globalRelease, 10));
            if (iM < 16) {
                iM = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
            for (Object obj : dETAIL_SOURCES$core_data_globalRelease) {
                linkedHashMap.put(obj, str);
            }
            return new CloudHardwareIdentity(null, null, linkedHashMap, str, 3, null);
        }

        public final List<String> getDETAIL_SOURCES$core_data_globalRelease() {
            return DeviceSignalCollector.DETAIL_SOURCES;
        }

        public final String hashSignal$core_data_globalRelease(String str, String str2, String str3) throws NoSuchAlgorithmException {
            str.getClass();
            str2.getClass();
            str3.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = az2.l(str, "\n", str2, "\n", str3).getBytes(sw.a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            return yo.z0(bArrDigest, new my(11));
        }

        public final String normalizedSignal$core_data_globalRelease(String str) {
            String string;
            int length;
            if (str != null && (string = l13.D0(str).toString()) != null && 4 <= (length = string.length()) && length < 257) {
                for (int i = 0; i < string.length(); i++) {
                    if (!Character.isISOControl(string.charAt(i))) {
                    }
                }
                Set setH0 = yo.H0(new String[]{"unknown", "null", "none", "default", "serial", "0123456789abcdef", "9774d56d682e549c"});
                String lowerCase = string.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!setH0.contains(lowerCase)) {
                    for (int i2 = 0; i2 < string.length(); i2++) {
                        char cCharAt = string.charAt(i2);
                        if (cCharAt != '0' && cCharAt != 'f' && cCharAt != 'F') {
                            return string;
                        }
                    }
                }
            }
            return null;
        }

        public final CloudHardwareIdentity serialIdentity$core_data_globalRelease(String str, List<String> list) {
            str.getClass();
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (Object obj : am1.G("boot_serial", "device_serial", "soc_serial")) {
                int i2 = i + 1;
                if (i < 0) {
                    am1.X();
                    throw null;
                }
                String str2 = (String) obj;
                String strNormalizedSignal$core_data_globalRelease = DeviceSignalCollector.Companion.normalizedSignal$core_data_globalRelease((String) zy.p0(list, i));
                if (strNormalizedSignal$core_data_globalRelease != null) {
                    linkedHashMap.put(str2, strNormalizedSignal$core_data_globalRelease);
                }
                i = i2;
            }
            String strSocSerial = HardwareIdentity.INSTANCE.socSerial(zy.i0(list, 3));
            if (strSocSerial != null) {
                linkedHashMap.put("soc_serial_sysfs", strSocSerial);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(jq1.M(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), DeviceSignalCollector.Companion.hashSignal$core_data_globalRelease(str, (String) entry.getKey(), (String) entry.getValue()));
            }
            return new CloudHardwareIdentity(linkedHashMap2, jq1.R(linkedHashMap), null, null, 12, null);
        }

        public final Map<String, String> serialSignals$core_data_globalRelease(String str, List<String> list) {
            str.getClass();
            list.getClass();
            return serialIdentity$core_data_globalRelease(str, list).getSignals();
        }

        private Companion() {
        }
    }
}
