package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vv2 extends v31 {
    public Object b;

    @Override // defpackage.v31
    public final Object a(gn gnVar) {
        Object obj = this.b;
        if (obj == null) {
            return super.a(gnVar);
        }
        if (obj != null) {
            return obj;
        }
        fo.n("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.v31
    public final Object b(gn gnVar) {
        synchronized (this) {
            if (this.b == null) {
                this.b = a(gnVar);
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        fo.n("Single instance created couldn't return value");
        return null;
    }
}
