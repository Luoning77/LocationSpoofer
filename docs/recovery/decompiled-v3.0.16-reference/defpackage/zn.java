package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zn implements fr1 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Map d;
    public final lu0 e;
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ gr1 g;

    public /* synthetic */ zn(int i, int i2, Map map, lu0 lu0Var, lu0 lu0Var2, gr1 gr1Var, int i3) {
        this.a = i3;
        this.f = lu0Var2;
        this.g = gr1Var;
        this.b = i;
        this.c = i2;
        this.d = map;
        this.e = lu0Var;
    }

    @Override // defpackage.fr1
    public final void a() {
        int i = this.a;
        gr1 gr1Var = this.g;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                lu0Var.invoke(((ao) gr1Var).e.p);
                break;
            default:
                lu0Var.invoke(((ck1) gr1Var).p);
                break;
        }
    }

    @Override // defpackage.fr1
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // defpackage.fr1
    public final Map c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // defpackage.fr1
    public final lu0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    @Override // defpackage.fr1
    public final int e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }
}
