package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hz0 extends i53 {
    public final /* synthetic */ lz0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ xt g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(String str, lz0 lz0Var, int i, xt xtVar, int i2, boolean z) {
        super(str, true);
        this.e = lz0Var;
        this.f = i;
        this.g = xtVar;
        this.h = i2;
    }

    @Override // defpackage.i53
    public final long a() {
        try {
            u92 u92Var = this.e.o;
            xt xtVar = this.g;
            int i = this.h;
            u92Var.getClass();
            xtVar.skip(i);
            this.e.A.d0(this.f, 9);
            synchronized (this.e) {
                this.e.C.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
