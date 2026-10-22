package com.vincenthzr.locationspoofer.data.db;

import defpackage.bt2;
import defpackage.ca0;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.o51;
import defpackage.p91;
import defpackage.y81;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SavedRouteEntity {
    public static final Companion Companion = new Companion(null);
    private final long id;
    private final String name;
    private final String pointsJson;
    private final String syncId;
    private final long timestamp;

    public /* synthetic */ SavedRouteEntity(int i, long j, String str, String str2, long j2, String str3, ht2 ht2Var) {
        if (2 != (i & 2)) {
            dh0.K(i, 2, SavedRouteEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = (i & 1) == 0 ? 0L : j;
        this.name = str;
        if ((i & 4) == 0) {
            this.pointsJson = "[]";
        } else {
            this.pointsJson = str2;
        }
        if ((i & 8) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
        if ((i & 16) != 0) {
            this.syncId = str3;
            return;
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.syncId = string;
    }

    public static /* synthetic */ SavedRouteEntity copy$default(SavedRouteEntity savedRouteEntity, long j, String str, String str2, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = savedRouteEntity.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = savedRouteEntity.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = savedRouteEntity.pointsJson;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            j2 = savedRouteEntity.timestamp;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            str3 = savedRouteEntity.syncId;
        }
        return savedRouteEntity.copy(j3, str4, str5, j4, str3);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(SavedRouteEntity savedRouteEntity, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || savedRouteEntity.id != 0) {
            m30Var.j(bt2Var, 0, savedRouteEntity.id);
        }
        m30Var.n(bt2Var, 1, savedRouteEntity.name);
        if (m30Var.d(bt2Var) || !o51.f(savedRouteEntity.pointsJson, "[]")) {
            m30Var.n(bt2Var, 2, savedRouteEntity.pointsJson);
        }
        if (m30Var.d(bt2Var) || savedRouteEntity.timestamp != System.currentTimeMillis()) {
            m30Var.j(bt2Var, 3, savedRouteEntity.timestamp);
        }
        if (!m30Var.d(bt2Var)) {
            String str = savedRouteEntity.syncId;
            String string = UUID.randomUUID().toString();
            string.getClass();
            if (o51.f(str, string)) {
                return;
            }
        }
        m30Var.n(bt2Var, 4, savedRouteEntity.syncId);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.pointsJson;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final String component5() {
        return this.syncId;
    }

    public final SavedRouteEntity copy(long j, String str, String str2, long j2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new SavedRouteEntity(j, str, str2, j2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedRouteEntity)) {
            return false;
        }
        SavedRouteEntity savedRouteEntity = (SavedRouteEntity) obj;
        return this.id == savedRouteEntity.id && o51.f(this.name, savedRouteEntity.name) && o51.f(this.pointsJson, savedRouteEntity.pointsJson) && this.timestamp == savedRouteEntity.timestamp && o51.f(this.syncId, savedRouteEntity.syncId);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPointsJson() {
        return this.pointsJson;
    }

    public final String getSyncId() {
        return this.syncId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.syncId.hashCode() + p91.c(p91.d(p91.d(Long.hashCode(this.id) * 31, 31, this.name), 31, this.pointsJson), 31, this.timestamp);
    }

    public String toString() {
        return "SavedRouteEntity(id=" + this.id + ", name=" + this.name + ", pointsJson=" + this.pointsJson + ", timestamp=" + this.timestamp + ", syncId=" + this.syncId + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return SavedRouteEntity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public SavedRouteEntity(long j, String str, String str2, long j2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.id = j;
        this.name = str;
        this.pointsJson = str2;
        this.timestamp = j2;
        this.syncId = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SavedRouteEntity(long j, String str, String str2, long j2, String str3, int i, ca0 ca0Var) {
        String str4;
        long j3 = (i & 1) != 0 ? 0L : j;
        String str5 = (i & 4) != 0 ? "[]" : str2;
        long jCurrentTimeMillis = (i & 8) != 0 ? System.currentTimeMillis() : j2;
        if ((i & 16) != 0) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            str4 = string;
        } else {
            str4 = str3;
        }
        this(j3, str, str5, jCurrentTimeMillis, str4);
    }
}
