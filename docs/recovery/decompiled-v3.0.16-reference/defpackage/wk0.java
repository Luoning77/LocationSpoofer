package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wk0 extends g0 implements vk0, RandomAccess, Serializable {
    public final Enum[] e;

    public wk0(Enum[] enumArr) {
        enumArr.getClass();
        this.e = enumArr;
    }

    @Override // defpackage.u
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) yo.x0(this.e, r3.ordinal())) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        fo.p(p91.n("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.g0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) yo.x0(this.e, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.g0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) yo.x0(this.e, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
