package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.am1;
import defpackage.sw;
import defpackage.wg2;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudMapPreviewStore {
    private final CloudMapResourceCache cache;
    private final String path;
    private final String scope;

    public CloudMapPreviewStore(CloudMapResourceCache cloudMapResourceCache, String str) {
        cloudMapResourceCache.getClass();
        str.getClass();
        this.cache = cloudMapResourceCache;
        this.scope = "location-map-preview-v1\n".concat(str);
        this.path = "@display-binding";
    }

    public final CloudRuntimeBinding read() {
        Object wg2Var;
        byte[] bytes;
        try {
            CloudMapCacheEntry cloudMapCacheEntry = this.cache.read(this.scope, this.path, 4096L, false);
            if (cloudMapCacheEntry != null && (bytes = cloudMapCacheEntry.getBytes()) != null) {
                JSONObject jSONObject = new JSONObject(new String(bytes, sw.a));
                String string = jSONObject.getString("userId");
                string.getClass();
                String string2 = jSONObject.getString("deviceId");
                string2.getClass();
                String string3 = jSONObject.getString("publicKeyFingerprint");
                string3.getClass();
                String string4 = jSONObject.getString("sessionId");
                string4.getClass();
                CloudRuntimeBinding cloudRuntimeBinding = new CloudRuntimeBinding(string, string2, string3, string4);
                List listG = am1.G(cloudRuntimeBinding.getUserId(), cloudRuntimeBinding.getDeviceId(), cloudRuntimeBinding.getSessionId());
                if (!listG.isEmpty()) {
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        if (!EncryptedCloudSessionStore.Companion.getUUID_PATTERN$core_data_globalRelease().b((String) it.next())) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
                String publicKeyFingerprint = cloudRuntimeBinding.getPublicKeyFingerprint();
                Pattern patternCompile = Pattern.compile("[a-f0-9]{64}");
                patternCompile.getClass();
                publicKeyFingerprint.getClass();
                if (!patternCompile.matcher(publicKeyFingerprint).matches()) {
                    throw new IllegalStateException("Check failed.");
                }
                wg2Var = cloudRuntimeBinding;
                return (CloudRuntimeBinding) (wg2Var instanceof wg2 ? null : wg2Var);
            }
            return null;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
    }

    public final void write(CloudRuntimeBinding cloudRuntimeBinding) {
        if (cloudRuntimeBinding == null) {
            this.cache.remove(this.scope, this.path);
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("userId", cloudRuntimeBinding.getUserId()).put("deviceId", cloudRuntimeBinding.getDeviceId()).put("publicKeyFingerprint", cloudRuntimeBinding.getPublicKeyFingerprint()).put("sessionId", cloudRuntimeBinding.getSessionId());
        CloudMapResourceCache cloudMapResourceCache = this.cache;
        String str = this.scope;
        String str2 = this.path;
        String string = jSONObjectPut.toString();
        string.getClass();
        byte[] bytes = string.getBytes(sw.a);
        bytes.getClass();
        cloudMapResourceCache.write(str, str2, new CloudMapCacheEntry(bytes, 200, false, 4, null));
    }
}
