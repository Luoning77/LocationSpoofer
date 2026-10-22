package com.vincenthzr.locationspoofer.data.db;

import defpackage.az2;
import defpackage.bt2;
import defpackage.ca0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.o51;
import defpackage.p91;
import defpackage.y81;
import java.util.UUID;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CollectionRouteRecord {
    public static final Companion Companion = new Companion(null);
    private final double halfWidthM;
    private final long id;
    private final String name;
    private final String pointsJson;
    private final String remark;
    private final String syncId;
    private final long timestamp;

    public /* synthetic */ CollectionRouteRecord(int i, long j, String str, String str2, String str3, double d, long j2, String str4, ht2 ht2Var) {
        this.id = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.remark = "";
        } else {
            this.remark = str2;
        }
        if ((i & 8) == 0) {
            this.pointsJson = "[]";
        } else {
            this.pointsJson = str3;
        }
        if ((i & 16) == 0) {
            this.halfWidthM = 50.0d;
        } else {
            this.halfWidthM = d;
        }
        if ((i & 32) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
        if ((i & 64) != 0) {
            this.syncId = str4;
            return;
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.syncId = string;
    }

    public static /* synthetic */ CollectionRouteRecord copy$default(CollectionRouteRecord collectionRouteRecord, long j, String str, String str2, String str3, double d, long j2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = collectionRouteRecord.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = collectionRouteRecord.name;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = collectionRouteRecord.remark;
        }
        return collectionRouteRecord.copy(j3, str5, str2, (i & 8) != 0 ? collectionRouteRecord.pointsJson : str3, (i & 16) != 0 ? collectionRouteRecord.halfWidthM : d, (i & 32) != 0 ? collectionRouteRecord.timestamp : j2, (i & 64) != 0 ? collectionRouteRecord.syncId : str4);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(CollectionRouteRecord collectionRouteRecord, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || collectionRouteRecord.id != 0) {
            m30Var.j(bt2Var, 0, collectionRouteRecord.id);
        }
        if (m30Var.d(bt2Var) || !o51.f(collectionRouteRecord.name, "")) {
            m30Var.n(bt2Var, 1, collectionRouteRecord.name);
        }
        if (m30Var.d(bt2Var) || !o51.f(collectionRouteRecord.remark, "")) {
            m30Var.n(bt2Var, 2, collectionRouteRecord.remark);
        }
        if (m30Var.d(bt2Var) || !o51.f(collectionRouteRecord.pointsJson, "[]")) {
            m30Var.n(bt2Var, 3, collectionRouteRecord.pointsJson);
        }
        if (m30Var.d(bt2Var) || Double.compare(collectionRouteRecord.halfWidthM, 50.0d) != 0) {
            m30Var.t(bt2Var, 4, collectionRouteRecord.halfWidthM);
        }
        if (m30Var.d(bt2Var) || collectionRouteRecord.timestamp != System.currentTimeMillis()) {
            m30Var.j(bt2Var, 5, collectionRouteRecord.timestamp);
        }
        if (!m30Var.d(bt2Var)) {
            String str = collectionRouteRecord.syncId;
            String string = UUID.randomUUID().toString();
            string.getClass();
            if (o51.f(str, string)) {
                return;
            }
        }
        m30Var.n(bt2Var, 6, collectionRouteRecord.syncId);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.remark;
    }

    public final String component4() {
        return this.pointsJson;
    }

    public final double component5() {
        return this.halfWidthM;
    }

    public final long component6() {
        return this.timestamp;
    }

    public final String component7() {
        return this.syncId;
    }

    public final CollectionRouteRecord copy(long j, String str, String str2, String str3, double d, long j2, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new CollectionRouteRecord(j, str, str2, str3, d, j2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionRouteRecord)) {
            return false;
        }
        CollectionRouteRecord collectionRouteRecord = (CollectionRouteRecord) obj;
        return this.id == collectionRouteRecord.id && o51.f(this.name, collectionRouteRecord.name) && o51.f(this.remark, collectionRouteRecord.remark) && o51.f(this.pointsJson, collectionRouteRecord.pointsJson) && Double.compare(this.halfWidthM, collectionRouteRecord.halfWidthM) == 0 && this.timestamp == collectionRouteRecord.timestamp && o51.f(this.syncId, collectionRouteRecord.syncId);
    }

    public final double getHalfWidthM() {
        return this.halfWidthM;
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

    public final String getRemark() {
        return this.remark;
    }

    public final String getSyncId() {
        return this.syncId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.syncId.hashCode() + p91.c(p91.a(this.halfWidthM, p91.d(p91.d(p91.d(Long.hashCode(this.id) * 31, 31, this.name), 31, this.remark), 31, this.pointsJson), 31), 31, this.timestamp);
    }

    public String toString() {
        long j = this.id;
        String str = this.name;
        String str2 = this.remark;
        String str3 = this.pointsJson;
        double d = this.halfWidthM;
        long j2 = this.timestamp;
        String str4 = this.syncId;
        StringBuilder sb = new StringBuilder("CollectionRouteRecord(id=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        p91.y(sb, ", remark=", str2, ", pointsJson=", str3);
        az2.x(sb, ", halfWidthM=", d, ", timestamp=");
        sb.append(j2);
        sb.append(", syncId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return CollectionRouteRecord$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public CollectionRouteRecord() {
        this(0L, (String) null, (String) null, (String) null, 0.0d, 0L, (String) null, WorkQueueKt.MASK, (ca0) null);
    }

    public CollectionRouteRecord(long j, String str, String str2, String str3, double d, long j2, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.id = j;
        this.name = str;
        this.remark = str2;
        this.pointsJson = str3;
        this.halfWidthM = d;
        this.timestamp = j2;
        this.syncId = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CollectionRouteRecord(long j, String str, String str2, String str3, double d, long j2, String str4, int i, ca0 ca0Var) {
        String str5;
        long j3 = (i & 1) != 0 ? 0L : j;
        String str6 = (i & 2) != 0 ? "" : str;
        String str7 = (i & 4) == 0 ? str2 : "";
        String str8 = (i & 8) != 0 ? "[]" : str3;
        double d2 = (i & 16) != 0 ? 50.0d : d;
        long jCurrentTimeMillis = (i & 32) != 0 ? System.currentTimeMillis() : j2;
        if ((i & 64) != 0) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            str5 = string;
        } else {
            str5 = str4;
        }
        this(j3, str6, str7, str8, d2, jCurrentTimeMillis, str5);
    }
}
