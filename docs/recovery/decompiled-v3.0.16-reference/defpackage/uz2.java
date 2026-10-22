package defpackage;

import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uz2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final List g;
    public final boolean h;
    public final String i;
    public final long j;

    public uz2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, List list, boolean z6, String str2, long j) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = list;
        this.h = z6;
        this.i = str2;
        this.j = j;
    }

    public static uz2 a(uz2 uz2Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, List list, boolean z6, String str2, long j, int i) {
        if ((i & 1) != 0) {
            z = uz2Var.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = uz2Var.b;
        }
        boolean z8 = z2;
        boolean z9 = (i & 4) != 0 ? uz2Var.c : z3;
        boolean z10 = (i & 8) != 0 ? uz2Var.d : z4;
        uz2Var.getClass();
        uz2Var.getClass();
        boolean z11 = (i & 64) != 0 ? uz2Var.e : z5;
        String str3 = (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? uz2Var.f : str;
        List list2 = (i & 256) != 0 ? uz2Var.g : list;
        boolean z12 = (i & 512) != 0 ? uz2Var.h : z6;
        String str4 = (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? uz2Var.i : str2;
        long j2 = (i & 2048) != 0 ? uz2Var.j : j;
        uz2Var.getClass();
        uz2Var.getClass();
        list2.getClass();
        str4.getClass();
        return new uz2(z7, z8, z9, z10, z11, str3, list2, z12, str4, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz2)) {
            return false;
        }
        uz2 uz2Var = (uz2) obj;
        return this.a == uz2Var.a && this.b == uz2Var.b && this.c == uz2Var.c && this.d == uz2Var.d && this.e == uz2Var.e && this.f.equals(uz2Var.f) && o51.f(this.g, uz2Var.g) && this.h == uz2Var.h && this.i.equals(uz2Var.i) && this.j == uz2Var.j;
    }

    public final int hashCode() {
        return p91.c(p91.d(p91.e(p91.g(this.g, p91.d(p91.e(p91.e(p91.e(p91.e(p91.e(p91.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, true), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "SpoofingUiState(showSaveDialog=" + this.a + ", showSavedLocationsDialog=" + this.b + ", showCustomCoordDialog=" + this.c + ", showStartSpoofingDialog=" + this.d + ", showAppCoordinateScreen=false, isSheetExpanded=true, isSearchActive=" + this.e + ", searchQuery=" + this.f + ", searchResults=" + this.g + ", showSearchResults=" + this.h + ", cachedSearchQuery=" + this.i + ", cachedSearchAt=" + this.j + ", toastMessage=null)";
    }
}
