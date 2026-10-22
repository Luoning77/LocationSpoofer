package defpackage;

import com.vincenthzr.locationspoofer.data.db.LocationRecord;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tl1 {
    public final LocationRecord a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    public tl1(LocationRecord locationRecord, boolean z, boolean z2, boolean z3) {
        locationRecord.getClass();
        this.a = locationRecord;
        this.b = 1;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return o51.f(this.a, tl1Var.a) && this.b == tl1Var.b && this.c == tl1Var.c && this.d == tl1Var.d && this.e == tl1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p91.e(p91.e(p91.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ClusterData(center=" + this.a + ", count=" + this.b + ", hasWifi=" + this.c + ", hasBluetooth=" + this.d + ", hasCell=" + this.e + ")";
    }
}
