package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class im0 extends rd3 {
    public rd3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zw0 d;
    public final /* synthetic */ zd3 e;
    public final /* synthetic */ jm0 f;

    public im0(jm0 jm0Var, boolean z, boolean z2, zw0 zw0Var, zd3 zd3Var) {
        this.f = jm0Var;
        this.b = z;
        this.c = z2;
        this.d = zw0Var;
        this.e = zd3Var;
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) throws IOException {
        if (this.b) {
            z71Var.A0();
            return null;
        }
        rd3 rd3VarD = this.a;
        if (rd3VarD == null) {
            rd3VarD = this.d.d(this.f, this.e);
            this.a = rd3VarD;
        }
        return rd3VarD.read(z71Var);
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) {
        if (this.c) {
            i81Var.f0();
            return;
        }
        rd3 rd3VarD = this.a;
        if (rd3VarD == null) {
            rd3VarD = this.d.d(this.f, this.e);
            this.a = rd3VarD;
        }
        rd3VarD.write(i81Var, obj);
    }
}
