package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gz0 extends i53 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lz0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz0(String str, lz0 lz0Var, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = lz0Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.i53
    public final long a() {
        switch (this.e) {
            case 0:
                lz0 lz0Var = this.f;
                try {
                    lz0Var.A.c0(this.g, this.h, true);
                    break;
                } catch (IOException e) {
                    lz0Var.A(2, 2, e);
                }
                return -1L;
            case 1:
                u92 u92Var = this.f.o;
                int i = this.h;
                u92Var.getClass();
                if (i == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.C.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                lz0 lz0Var2 = this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    lz0Var2.A.d0(i2, i3);
                    return -1L;
                } catch (IOException e2) {
                    lz0Var2.A(2, 2, e2);
                }
                break;
        }
    }
}
