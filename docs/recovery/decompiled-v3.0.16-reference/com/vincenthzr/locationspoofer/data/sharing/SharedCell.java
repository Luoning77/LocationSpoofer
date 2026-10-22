package com.vincenthzr.locationspoofer.data.sharing;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharedCell {
    private final long area;
    private final long cell;
    private final int mcc;
    private final int mnc;
    private final String radio;
    private final int signalDbm;

    public SharedCell(String str, int i, int i2, long j, long j2, int i3) {
        str.getClass();
        this.radio = str;
        this.mcc = i;
        this.mnc = i2;
        this.area = j;
        this.cell = j2;
        this.signalDbm = i3;
    }

    public static /* synthetic */ SharedCell copy$default(SharedCell sharedCell, String str, int i, int i2, long j, long j2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sharedCell.radio;
        }
        if ((i4 & 2) != 0) {
            i = sharedCell.mcc;
        }
        if ((i4 & 4) != 0) {
            i2 = sharedCell.mnc;
        }
        if ((i4 & 8) != 0) {
            j = sharedCell.area;
        }
        if ((i4 & 16) != 0) {
            j2 = sharedCell.cell;
        }
        if ((i4 & 32) != 0) {
            i3 = sharedCell.signalDbm;
        }
        int i5 = i3;
        long j3 = j2;
        int i6 = i2;
        return sharedCell.copy(str, i, i6, j, j3, i5);
    }

    public final String component1() {
        return this.radio;
    }

    public final int component2() {
        return this.mcc;
    }

    public final int component3() {
        return this.mnc;
    }

    public final long component4() {
        return this.area;
    }

    public final long component5() {
        return this.cell;
    }

    public final int component6() {
        return this.signalDbm;
    }

    public final SharedCell copy(String str, int i, int i2, long j, long j2, int i3) {
        str.getClass();
        return new SharedCell(str, i, i2, j, j2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedCell)) {
            return false;
        }
        SharedCell sharedCell = (SharedCell) obj;
        return o51.f(this.radio, sharedCell.radio) && this.mcc == sharedCell.mcc && this.mnc == sharedCell.mnc && this.area == sharedCell.area && this.cell == sharedCell.cell && this.signalDbm == sharedCell.signalDbm;
    }

    public final long getArea() {
        return this.area;
    }

    public final long getCell() {
        return this.cell;
    }

    public final int getMcc() {
        return this.mcc;
    }

    public final int getMnc() {
        return this.mnc;
    }

    public final String getRadio() {
        return this.radio;
    }

    public final int getSignalDbm() {
        return this.signalDbm;
    }

    public int hashCode() {
        return Integer.hashCode(this.signalDbm) + p91.c(p91.c(p91.b(this.mnc, p91.b(this.mcc, this.radio.hashCode() * 31, 31), 31), 31, this.area), 31, this.cell);
    }

    public String toString() {
        return "SharedCell(radio=" + this.radio + ", mcc=" + this.mcc + ", mnc=" + this.mnc + ", area=" + this.area + ", cell=" + this.cell + ", signalDbm=" + this.signalDbm + ")";
    }
}
