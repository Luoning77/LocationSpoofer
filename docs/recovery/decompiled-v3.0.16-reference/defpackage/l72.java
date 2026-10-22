package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l72 extends m72 implements w30 {
    public static final l72 h = new l72(zc3.e, 0);

    @Override // defpackage.m72
    public final o72 a() {
        k72 k72Var = new k72(this);
        k72Var.k = this;
        return k72Var;
    }

    @Override // defpackage.m72
    public final o72 b() {
        k72 k72Var = new k72(this);
        k72Var.k = this;
        return k72Var;
    }

    @Override // defpackage.m72, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof cd2) {
            return super.containsKey((cd2) obj);
        }
        return false;
    }

    @Override // defpackage.m72, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof gh3) {
            return super.containsValue((gh3) obj);
        }
        return false;
    }

    public final l72 d(cd2 cd2Var, gh3 gh3Var) {
        x8 x8VarU = this.e.u(cd2Var.hashCode(), 0, cd2Var, gh3Var);
        return x8VarU == null ? this : new l72((zc3) x8VarU.c, this.f + x8VarU.b);
    }

    @Override // defpackage.m72, java.util.Map
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
}
