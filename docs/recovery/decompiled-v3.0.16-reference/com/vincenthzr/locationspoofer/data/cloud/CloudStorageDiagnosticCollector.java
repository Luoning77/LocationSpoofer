package com.vincenthzr.locationspoofer.data.cloud;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.security.KeyStoreException;
import android.security.keystore.KeyInfo;
import defpackage.ca0;
import defpackage.lu0;
import defpackage.m1;
import defpackage.my;
import defpackage.wg2;
import defpackage.xs2;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.KeySpec;
import java.util.List;
import java.util.UUID;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudStorageDiagnosticCollector {
    public static final Companion Companion = new Companion(null);
    private static final String PROCESS_RUN_ID;
    private final Context context;

    static {
        String string = UUID.randomUUID().toString();
        string.getClass();
        PROCESS_RUN_ID = string;
    }

    public CloudStorageDiagnosticCollector(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable collect$lambda$0(Throwable th) {
        th.getClass();
        return th.getCause();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    private final CloudDiagnosticKey inspectKey(String str, Key key) {
        KeyInfo keyInfo;
        String str2;
        if (key == null) {
            return new CloudDiagnosticKey(str, "unavailable", null, null, null, null, null, null, null, 508, null);
        }
        try {
            if (key instanceof PrivateKey) {
                keyInfo = (KeyInfo) KeyFactory.getInstance(((PrivateKey) key).getAlgorithm(), "AndroidKeyStore").getKeySpec(key, KeyInfo.class);
            } else {
                if (!(key instanceof SecretKey)) {
                    return new CloudDiagnosticKey(str, "unavailable", null, null, null, null, null, null, null, 508, null);
                }
                KeySpec keySpec = SecretKeyFactory.getInstance(((SecretKey) key).getAlgorithm(), "AndroidKeyStore").getKeySpec((SecretKey) key, KeyInfo.class);
                keySpec.getClass();
                keyInfo = (KeyInfo) keySpec;
            }
            int i = Build.VERSION.SDK_INT;
            String str3 = "unknown_secure";
            if (i >= 31) {
                int securityLevel = keyInfo.getSecurityLevel();
                if (securityLevel != -1) {
                    if (securityLevel == 0) {
                        str2 = "software";
                    } else if (securityLevel != 1) {
                        str3 = securityLevel != 2 ? "unknown" : "strongbox";
                    } else {
                        str3 = "tee";
                    }
                }
                str2 = str3;
            } else if (keyInfo.isInsideSecureHardware()) {
                str2 = str3;
            } else {
                str2 = "software";
            }
            return new CloudDiagnosticKey(str, "available", str2, Boolean.valueOf(keyInfo.isUserAuthenticationRequired()), i >= 30 ? Integer.valueOf(keyInfo.getUserAuthenticationType()) : null, Integer.valueOf(keyInfo.getUserAuthenticationValidityDurationSeconds()), Boolean.valueOf(keyInfo.isInvalidatedByBiometricEnrollment()), i >= 37 ? Boolean.valueOf(keyInfo.isUnlockedDeviceRequired()) : null, null, 256, null);
        } catch (Exception e) {
            return new CloudDiagnosticKey(str, "unavailable", null, null, null, null, null, null, CloudDiagnosticDetails.Companion.exceptionType$core_data_globalRelease(e), 252, null);
        }
    }

    public final CloudDiagnosticDetails collect(Exception exc, String str, String str2, Key key, int i, String str3) {
        Object wg2Var;
        Object wg2Var2;
        exc.getClass();
        str.getClass();
        str3.getClass();
        int i2 = Build.VERSION.SDK_INT;
        KeyStoreException keyStoreExceptionB = i2 >= 33 ? m1.b(xs2.P(xs2.O(xs2.T(xs2.Q(new my(3), exc), 4), new lu0() { // from class: com.vincenthzr.locationspoofer.data.cloud.CloudStorageDiagnosticCollector$collect$$inlined$filterIsInstance$1
            @Override // defpackage.lu0
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(m1.z(obj));
            }
        }))) : null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        CloudDiagnosticDetails.Companion companion = CloudDiagnosticDetails.Companion;
        List<CloudDiagnosticCause> listCaptureCauses$core_data_globalRelease = companion.captureCauses$core_data_globalRelease(exc);
        Integer numInternalCode$core_data_globalRelease = keyStoreExceptionB != null ? companion.internalCode$core_data_globalRelease(keyStoreExceptionB.toString()) : null;
        Boolean boolValueOf = (i2 < 33 || keyStoreExceptionB == null) ? null : Boolean.valueOf(keyStoreExceptionB.isSystemError());
        Integer numValueOf = (i2 < 33 || keyStoreExceptionB == null) ? null : Integer.valueOf(keyStoreExceptionB.getRetryPolicy());
        String str4 = PROCESS_RUN_ID;
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        long startElapsedRealtime = jElapsedRealtime - Process.getStartElapsedRealtime();
        if (startElapsedRealtime < 0) {
            startElapsedRealtime = 0;
        }
        Long lValueOf2 = Long.valueOf(startElapsedRealtime);
        try {
            UserManager userManager = (UserManager) this.context.getSystemService(UserManager.class);
            wg2Var = userManager != null ? Boolean.valueOf(userManager.isUserUnlocked()) : null;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        Boolean bool = (Boolean) wg2Var;
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.context.getSystemService(KeyguardManager.class);
            wg2Var2 = keyguardManager != null ? Boolean.valueOf(keyguardManager.isDeviceLocked()) : null;
        } catch (Throwable th2) {
            wg2Var2 = new wg2(th2);
        }
        if (wg2Var2 instanceof wg2) {
            wg2Var2 = null;
        }
        return new CloudDiagnosticDetails(0, str, listCaptureCauses$core_data_globalRelease, numInternalCode$core_data_globalRelease, boolValueOf, numValueOf, i, str3, str4, lValueOf, lValueOf2, bool, (Boolean) wg2Var2, str2 != null ? inspectKey(str2, key) : null, null, null, null, 114689, null);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        private Companion() {
        }
    }
}
