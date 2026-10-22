package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.ca0;
import defpackage.fo;
import defpackage.l13;
import defpackage.lu0;
import defpackage.o51;
import defpackage.p91;
import defpackage.s13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkConfigSnapshot {
    public static final Companion Companion = new Companion(null);
    private final JSONObject config;
    private final long publishedAt;
    private final long sequence;
    private final String source;

    public FrameworkConfigSnapshot(JSONObject jSONObject, String str, long j, long j2) {
        jSONObject.getClass();
        str.getClass();
        this.config = jSONObject;
        this.source = str;
        this.publishedAt = j;
        this.sequence = j2;
    }

    public static /* synthetic */ FrameworkConfigSnapshot copy$default(FrameworkConfigSnapshot frameworkConfigSnapshot, JSONObject jSONObject, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = frameworkConfigSnapshot.config;
        }
        if ((i & 2) != 0) {
            str = frameworkConfigSnapshot.source;
        }
        if ((i & 4) != 0) {
            j = frameworkConfigSnapshot.publishedAt;
        }
        if ((i & 8) != 0) {
            j2 = frameworkConfigSnapshot.sequence;
        }
        long j3 = j2;
        return frameworkConfigSnapshot.copy(jSONObject, str, j, j3);
    }

    public final JSONObject component1() {
        return this.config;
    }

    public final String component2() {
        return this.source;
    }

    public final long component3() {
        return this.publishedAt;
    }

    public final long component4() {
        return this.sequence;
    }

    public final FrameworkConfigSnapshot copy(JSONObject jSONObject, String str, long j, long j2) {
        jSONObject.getClass();
        str.getClass();
        return new FrameworkConfigSnapshot(jSONObject, str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameworkConfigSnapshot)) {
            return false;
        }
        FrameworkConfigSnapshot frameworkConfigSnapshot = (FrameworkConfigSnapshot) obj;
        return o51.f(this.config, frameworkConfigSnapshot.config) && o51.f(this.source, frameworkConfigSnapshot.source) && this.publishedAt == frameworkConfigSnapshot.publishedAt && this.sequence == frameworkConfigSnapshot.sequence;
    }

    public final JSONObject getConfig() {
        return this.config;
    }

    public final long getPublishedAt() {
        return this.publishedAt;
    }

    public final long getSequence() {
        return this.sequence;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return Long.hashCode(this.sequence) + p91.c(p91.d(this.config.hashCode() * 31, 31, this.source), 31, this.publishedAt);
    }

    public String toString() {
        return "FrameworkConfigSnapshot(config=" + this.config + ", source=" + this.source + ", publishedAt=" + this.publishedAt + ", sequence=" + this.sequence + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final FrameworkConfigSnapshot decode(String str, lu0 lu0Var) throws JSONException {
            String string;
            str.getClass();
            lu0Var.getClass();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("version") != 2) {
                fo.i("Unsupported config version");
                return null;
            }
            String string2 = jSONObject.getString("id");
            string2.getClass();
            if (l13.k0(string2)) {
                fo.i("Missing snapshot identity");
                return null;
            }
            long j = jSONObject.getLong("sequence");
            if (j <= 0) {
                fo.i("配置序号无效");
                return null;
            }
            String strOptString = jSONObject.optString("file");
            strOptString.getClass();
            if (strOptString.length() == 0) {
                string = jSONObject.getString("payload");
            } else {
                if (!s13.Z(strOptString, "locationspoofer-config-", false) || !strOptString.endsWith(".json") || l13.d0(strOptString, '/') || l13.d0(strOptString, '\\') || l13.c0(strOptString, "..", false)) {
                    fo.i("Invalid remote config filename");
                    return null;
                }
                string = (String) lu0Var.invoke(strOptString);
            }
            return new FrameworkConfigSnapshot(new JSONObject(string), strOptString.length() == 0 ? "libxposed:remote-preferences" : "libxposed:remote-file", jSONObject.getLong("published_at"), j);
        }

        private Companion() {
        }
    }
}
