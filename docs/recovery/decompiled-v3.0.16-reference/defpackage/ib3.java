package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ib3 extends h73 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public ib3(tj3 tj3Var) {
        this.a = 1;
        this.d = tj3Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.uj3
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((jb3) obj).a.setVisibility(this.c);
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                tj3 tj3Var = (tj3) obj;
                if (i2 == tj3Var.a.size()) {
                    uj3 uj3Var = tj3Var.d;
                    if (uj3Var != null) {
                        uj3Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    tj3Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.h73, defpackage.uj3
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.h73, defpackage.uj3
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((jb3) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    uj3 uj3Var = ((tj3) obj).d;
                    if (uj3Var != null) {
                        uj3Var.c();
                    }
                    break;
                }
                break;
        }
    }

    public ib3(jb3 jb3Var, int i) {
        this.a = 0;
        this.d = jb3Var;
        this.c = i;
        this.b = false;
    }
}
