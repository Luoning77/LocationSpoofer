package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hx implements pu0 {
    public final /* synthetic */ np2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ p10 h;
    public final /* synthetic */ q93 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ z42 k;

    public hx(np2 np2Var, boolean z, boolean z2, p10 p10Var, q93 q93Var, float f, z42 z42Var) {
        this.e = np2Var;
        this.f = z;
        this.g = z2;
        this.h = p10Var;
        this.i = q93Var;
        this.j = f;
        this.k = z42Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            np2 np2Var = this.e;
            boolean z = this.f;
            boolean z2 = this.g;
            if (z) {
                j = !z2 ? np2Var.b : np2Var.k;
            } else {
                j = np2Var.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? np2Var.c : np2Var.l;
            } else {
                j2 = np2Var.g;
            }
            long j5 = j2;
            if (z) {
                j3 = !z2 ? np2Var.d : np2Var.m;
            } else {
                j3 = np2Var.h;
            }
            ix.a(this.h, this.i, j4, j5, j3, this.j, this.k, ov0Var, 0);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
