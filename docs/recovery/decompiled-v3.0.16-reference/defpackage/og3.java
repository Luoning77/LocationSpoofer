package defpackage;

import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class og3 {
    public final boolean a;
    public final String b;
    public final List c;
    public final Long d;
    public final String e;
    public final int f;
    public final int g;
    public final long h;
    public final UpdateArtifact i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Boolean m;
    public final boolean n;
    public final String o;

    public og3(boolean z, String str, List list, Long l, String str2, int i, int i2, long j, UpdateArtifact updateArtifact, boolean z2, boolean z3, boolean z4, Boolean bool, boolean z5, String str3) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = l;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = updateArtifact;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = bool;
        this.n = z5;
        this.o = str3;
    }

    public static og3 a(og3 og3Var, boolean z, String str, List list, Long l, String str2, int i, int i2, long j, UpdateArtifact updateArtifact, boolean z2, boolean z3, boolean z4, Boolean bool, boolean z5, String str3, int i3) {
        boolean z6 = (i3 & 1) != 0 ? og3Var.a : z;
        String str4 = (i3 & 2) != 0 ? og3Var.b : str;
        List list2 = (i3 & 4) != 0 ? og3Var.c : list;
        Long l2 = (i3 & 8) != 0 ? og3Var.d : l;
        String str5 = (i3 & 16) != 0 ? og3Var.e : str2;
        int i4 = (i3 & 32) != 0 ? og3Var.f : i;
        int i5 = (i3 & 64) != 0 ? og3Var.g : i2;
        long j2 = (i3 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? og3Var.h : j;
        UpdateArtifact updateArtifact2 = (i3 & 256) != 0 ? og3Var.i : updateArtifact;
        boolean z7 = (i3 & 512) != 0 ? og3Var.j : z2;
        boolean z8 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? og3Var.k : z3;
        boolean z9 = (i3 & 2048) != 0 ? og3Var.l : z4;
        Boolean bool2 = (i3 & 4096) != 0 ? og3Var.m : bool;
        boolean z10 = z6;
        boolean z11 = (i3 & 8192) != 0 ? og3Var.n : z5;
        String str6 = (i3 & 16384) != 0 ? og3Var.o : str3;
        og3Var.getClass();
        list2.getClass();
        return new og3(z10, str4, list2, l2, str5, i4, i5, j2, updateArtifact2, z7, z8, z9, bool2, z11, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3)) {
            return false;
        }
        og3 og3Var = (og3) obj;
        return this.a == og3Var.a && o51.f(this.b, og3Var.b) && o51.f(this.c, og3Var.c) && o51.f(this.d, og3Var.d) && o51.f(this.e, og3Var.e) && this.f == og3Var.f && this.g == og3Var.g && this.h == og3Var.h && o51.f(this.i, og3Var.i) && this.j == og3Var.j && this.k == og3Var.k && this.l == og3Var.l && o51.f(this.m, og3Var.m) && this.n == og3Var.n && o51.f(this.o, og3Var.o);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iG = p91.g(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Long l = this.d;
        int iHashCode2 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int iC = p91.c(p91.b(this.g, p91.b(this.f, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.h);
        UpdateArtifact updateArtifact = this.i;
        int iE = p91.e(p91.e(p91.e((iC + (updateArtifact == null ? 0 : updateArtifact.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        Boolean bool = this.m;
        int iE2 = p91.e((iE + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.n);
        String str3 = this.o;
        return iE2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateUiState(isLoading=" + this.a + ", error=" + this.b + ", releases=" + this.c + ", activeDownloadId=" + this.d + ", activeDownloadUrl=" + this.e + ", downloadProgress=" + this.f + ", downloadStatus=" + this.g + ", installedCode=" + this.h + ", downloadArtifact=" + this.i + ", canInstallDownload=" + this.j + ", isSaving=" + this.k + ", savedDownload=" + this.l + ", betaEnabled=" + this.m + ", isUpdatingBeta=" + this.n + ", betaError=" + this.o + ")";
    }
}
