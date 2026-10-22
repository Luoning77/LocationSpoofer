package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fo1 {
    public final List a;
    public final List b;
    public final boolean c;

    public fo1(List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo1)) {
            return false;
        }
        fo1 fo1Var = (fo1) obj;
        return o51.f(this.a, fo1Var.a) && o51.f(this.b, fo1Var.b) && this.c == fo1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + p91.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ManageDataUiState(dataList=" + this.a + ", collectionRoutes=" + this.b + ", isLoading=" + this.c + ")";
    }
}
