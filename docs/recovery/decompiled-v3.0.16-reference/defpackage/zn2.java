package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zn2 implements u42 {
    public final int e;
    public final List f;
    public Float g = null;
    public Float h = null;
    public on2 i = null;
    public on2 j = null;

    public zn2(int i, ArrayList arrayList) {
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.u42
    public final boolean S() {
        return this.f.contains(this);
    }
}
