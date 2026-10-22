package com.vincenthzr.locationspoofer.data.sharing;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.fo;
import defpackage.sw;
import defpackage.yo;
import defpackage.zs0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocalSharingConsentStore implements SharingConsentStore {
    private final SharedPreferences preferences;

    public LocalSharingConsentStore(Context context) {
        context.getClass();
        this.preferences = context.getSharedPreferences("radio_sharing_consent", 0);
    }

    private final String key(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(sw.a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        return yo.z0(bArrDigest, new zs0(25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence key$lambda$0(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    @Override // com.vincenthzr.locationspoofer.data.sharing.SharingConsentStore
    public boolean enabled(String str) {
        str.getClass();
        return this.preferences.getBoolean(key(str), false);
    }

    @Override // com.vincenthzr.locationspoofer.data.sharing.SharingConsentStore
    public void setEnabled(String str, boolean z) {
        str.getClass();
        if (this.preferences.edit().putBoolean(key(str), z).commit()) {
            return;
        }
        fo.n("共享设置保存失败");
    }
}
