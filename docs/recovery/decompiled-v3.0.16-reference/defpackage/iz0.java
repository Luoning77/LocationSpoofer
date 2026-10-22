package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iz0 extends i53 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ lz0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(String str, lz0 lz0Var, int i, List list, boolean z) {
        super(str, true);
        this.f = lz0Var;
        this.g = i;
    }

    @Override // defpackage.i53
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.o.getClass();
                try {
                    this.f.A.d0(this.g, 9);
                    synchronized (this.f) {
                        this.f.C.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.o.getClass();
                try {
                    this.f.A.d0(this.g, 9);
                    synchronized (this.f) {
                        this.f.C.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(String str, lz0 lz0Var, int i, List list) {
        super(str, true);
        this.f = lz0Var;
        this.g = i;
    }
}
