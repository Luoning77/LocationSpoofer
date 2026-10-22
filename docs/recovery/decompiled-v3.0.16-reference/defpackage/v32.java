package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v32 extends g0 implements RandomAccess {
    public final uu[] e;
    public final int[] f;

    public v32(uu[] uuVarArr, int[] iArr) {
        this.e = uuVarArr;
        this.f = iArr;
    }

    @Override // defpackage.u
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof uu) {
            return super.contains((uu) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.e[i];
    }

    @Override // defpackage.g0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof uu) {
            return super.indexOf((uu) obj);
        }
        return -1;
    }

    @Override // defpackage.g0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof uu) {
            return super.lastIndexOf((uu) obj);
        }
        return -1;
    }
}
