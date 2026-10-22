package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k72 extends o72 {
    public l72 k;

    @Override // defpackage.o72, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof cd2) {
            return super.containsKey((cd2) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof gh3) {
            return super.containsValue((gh3) obj);
        }
        return false;
    }

    @Override // defpackage.o72
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final l72 b() {
        zc3 zc3Var = this.g;
        l72 l72Var = this.k;
        if (zc3Var != l72Var.e) {
            this.f = new k91(9);
            l72Var = new l72(this.g, size());
        }
        this.k = l72Var;
        return l72Var;
    }

    @Override // defpackage.o72, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof cd2) {
            return (gh3) super.get((cd2) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof cd2) ? obj2 : (gh3) super.getOrDefault((cd2) obj, (gh3) obj2);
    }

    @Override // defpackage.o72, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof cd2) {
            return (gh3) super.remove((cd2) obj);
        }
        return null;
    }
}
