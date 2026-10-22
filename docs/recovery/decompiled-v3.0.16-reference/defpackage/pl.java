package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pl extends rr0 {
    public final /* synthetic */ yl n;
    public final /* synthetic */ bm o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(bm bmVar, bm bmVar2, yl ylVar) {
        super(bmVar2);
        this.o = bmVar;
        this.n = ylVar;
    }

    @Override // defpackage.rr0
    public final rv2 b() {
        return this.n;
    }

    @Override // defpackage.rr0
    public final boolean c() {
        bm bmVar = this.o;
        if (bmVar.getInternalPopup().a()) {
            return true;
        }
        bmVar.j.m(sl.b(bmVar), sl.a(bmVar));
        return true;
    }
}
