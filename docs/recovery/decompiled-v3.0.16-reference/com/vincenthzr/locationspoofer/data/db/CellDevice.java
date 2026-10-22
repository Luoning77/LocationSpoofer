package com.vincenthzr.locationspoofer.data.db;

import defpackage.az2;
import defpackage.bt2;
import defpackage.ca0;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.o51;
import defpackage.p91;
import defpackage.y81;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CellDevice {
    public static final Companion Companion = new Companion(null);
    private final int basestationId;
    private final String cellKey;
    private final int ci;
    private final int cid;
    private final int lac;
    private final int mcc;
    private final int mnc;
    private final long nci;
    private final int networkId;
    private final int pci;
    private final int psc;
    private final int systemId;
    private final int tac;
    private final String type;

    public /* synthetic */ CellDevice(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, int i10, int i11, int i12, ht2 ht2Var) {
        if (1 != (i & 1)) {
            dh0.K(i, 1, CellDevice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.cellKey = str;
        if ((i & 2) == 0) {
            this.type = "LTE";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.mcc = 460;
        } else {
            this.mcc = i2;
        }
        if ((i & 8) == 0) {
            this.mnc = 0;
        } else {
            this.mnc = i3;
        }
        if ((i & 16) == 0) {
            this.tac = 0;
        } else {
            this.tac = i4;
        }
        if ((i & 32) == 0) {
            this.ci = 0;
        } else {
            this.ci = i5;
        }
        if ((i & 64) == 0) {
            this.pci = 0;
        } else {
            this.pci = i6;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) == 0) {
            this.lac = 0;
        } else {
            this.lac = i7;
        }
        if ((i & 256) == 0) {
            this.cid = 0;
        } else {
            this.cid = i8;
        }
        if ((i & 512) == 0) {
            this.psc = 0;
        } else {
            this.psc = i9;
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            this.nci = 0L;
        } else {
            this.nci = j;
        }
        if ((i & 2048) == 0) {
            this.networkId = 0;
        } else {
            this.networkId = i10;
        }
        if ((i & 4096) == 0) {
            this.systemId = 0;
        } else {
            this.systemId = i11;
        }
        if ((i & 8192) == 0) {
            this.basestationId = 0;
        } else {
            this.basestationId = i12;
        }
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(CellDevice cellDevice, m30 m30Var, bt2 bt2Var) {
        m30Var.n(bt2Var, 0, cellDevice.cellKey);
        if (m30Var.d(bt2Var) || !o51.f(cellDevice.type, "LTE")) {
            m30Var.n(bt2Var, 1, cellDevice.type);
        }
        if (m30Var.d(bt2Var) || cellDevice.mcc != 460) {
            m30Var.i(2, cellDevice.mcc, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.mnc != 0) {
            m30Var.i(3, cellDevice.mnc, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.tac != 0) {
            m30Var.i(4, cellDevice.tac, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.ci != 0) {
            m30Var.i(5, cellDevice.ci, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.pci != 0) {
            m30Var.i(6, cellDevice.pci, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.lac != 0) {
            m30Var.i(7, cellDevice.lac, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.cid != 0) {
            m30Var.i(8, cellDevice.cid, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.psc != 0) {
            m30Var.i(9, cellDevice.psc, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.nci != 0) {
            m30Var.j(bt2Var, 10, cellDevice.nci);
        }
        if (m30Var.d(bt2Var) || cellDevice.networkId != 0) {
            m30Var.i(11, cellDevice.networkId, bt2Var);
        }
        if (m30Var.d(bt2Var) || cellDevice.systemId != 0) {
            m30Var.i(12, cellDevice.systemId, bt2Var);
        }
        if (!m30Var.d(bt2Var) && cellDevice.basestationId == 0) {
            return;
        }
        m30Var.i(13, cellDevice.basestationId, bt2Var);
    }

    public final String component1() {
        return this.cellKey;
    }

    public final int component10() {
        return this.psc;
    }

    public final long component11() {
        return this.nci;
    }

    public final int component12() {
        return this.networkId;
    }

    public final int component13() {
        return this.systemId;
    }

    public final int component14() {
        return this.basestationId;
    }

    public final String component2() {
        return this.type;
    }

    public final int component3() {
        return this.mcc;
    }

    public final int component4() {
        return this.mnc;
    }

    public final int component5() {
        return this.tac;
    }

    public final int component6() {
        return this.ci;
    }

    public final int component7() {
        return this.pci;
    }

    public final int component8() {
        return this.lac;
    }

    public final int component9() {
        return this.cid;
    }

    public final CellDevice copy(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10, int i11) {
        str.getClass();
        str2.getClass();
        return new CellDevice(str, str2, i, i2, i3, i4, i5, i6, i7, i8, j, i9, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellDevice)) {
            return false;
        }
        CellDevice cellDevice = (CellDevice) obj;
        return o51.f(this.cellKey, cellDevice.cellKey) && o51.f(this.type, cellDevice.type) && this.mcc == cellDevice.mcc && this.mnc == cellDevice.mnc && this.tac == cellDevice.tac && this.ci == cellDevice.ci && this.pci == cellDevice.pci && this.lac == cellDevice.lac && this.cid == cellDevice.cid && this.psc == cellDevice.psc && this.nci == cellDevice.nci && this.networkId == cellDevice.networkId && this.systemId == cellDevice.systemId && this.basestationId == cellDevice.basestationId;
    }

    public final int getBasestationId() {
        return this.basestationId;
    }

    public final String getCellKey() {
        return this.cellKey;
    }

    public final int getCi() {
        return this.ci;
    }

    public final int getCid() {
        return this.cid;
    }

    public final int getLac() {
        return this.lac;
    }

    public final int getMcc() {
        return this.mcc;
    }

    public final int getMnc() {
        return this.mnc;
    }

    public final long getNci() {
        return this.nci;
    }

    public final int getNetworkId() {
        return this.networkId;
    }

    public final int getPci() {
        return this.pci;
    }

    public final int getPsc() {
        return this.psc;
    }

    public final int getSystemId() {
        return this.systemId;
    }

    public final int getTac() {
        return this.tac;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.basestationId) + p91.b(this.systemId, p91.b(this.networkId, p91.c(p91.b(this.psc, p91.b(this.cid, p91.b(this.lac, p91.b(this.pci, p91.b(this.ci, p91.b(this.tac, p91.b(this.mnc, p91.b(this.mcc, p91.d(this.cellKey.hashCode() * 31, 31, this.type), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.nci), 31), 31);
    }

    public String toString() {
        String str = this.cellKey;
        String str2 = this.type;
        int i = this.mcc;
        int i2 = this.mnc;
        int i3 = this.tac;
        int i4 = this.ci;
        int i5 = this.pci;
        int i6 = this.lac;
        int i7 = this.cid;
        int i8 = this.psc;
        long j = this.nci;
        int i9 = this.networkId;
        int i10 = this.systemId;
        int i11 = this.basestationId;
        StringBuilder sbT = p91.t("CellDevice(cellKey=", str, ", type=", str2, ", mcc=");
        az2.w(sbT, i, ", mnc=", i2, ", tac=");
        az2.w(sbT, i3, ", ci=", i4, ", pci=");
        az2.w(sbT, i5, ", lac=", i6, ", cid=");
        az2.w(sbT, i7, ", psc=", i8, ", nci=");
        sbT.append(j);
        sbT.append(", networkId=");
        sbT.append(i9);
        sbT.append(", systemId=");
        sbT.append(i10);
        sbT.append(", basestationId=");
        sbT.append(i11);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return CellDevice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public CellDevice(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10, int i11) {
        str.getClass();
        str2.getClass();
        this.cellKey = str;
        this.type = str2;
        this.mcc = i;
        this.mnc = i2;
        this.tac = i3;
        this.ci = i4;
        this.pci = i5;
        this.lac = i6;
        this.cid = i7;
        this.psc = i8;
        this.nci = j;
        this.networkId = i9;
        this.systemId = i10;
        this.basestationId = i11;
    }

    public /* synthetic */ CellDevice(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10, int i11, int i12, ca0 ca0Var) {
        this(str, (i12 & 2) != 0 ? "LTE" : str2, (i12 & 4) != 0 ? 460 : i, (i12 & 8) != 0 ? 0 : i2, (i12 & 16) != 0 ? 0 : i3, (i12 & 32) != 0 ? 0 : i4, (i12 & 64) != 0 ? 0 : i5, (i12 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? 0 : i6, (i12 & 256) != 0 ? 0 : i7, (i12 & 512) != 0 ? 0 : i8, (i12 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0L : j, (i12 & 2048) != 0 ? 0 : i9, (i12 & 4096) != 0 ? 0 : i10, (i12 & 8192) != 0 ? 0 : i11);
    }
}
