package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kz0 extends i53 {
    public final /* synthetic */ lz0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(String str, lz0 lz0Var, int i, long j) {
        super(str, true);
        this.e = lz0Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.i53
    public final long a() {
        lz0 lz0Var = this.e;
        try {
            lz0Var.A.e0(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            lz0Var.A(2, 2, e);
            return -1L;
        }
    }
}
