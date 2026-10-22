package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ag2 extends cg2 {
    public final /* synthetic */ kr1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public ag2(kr1 kr1Var, byte[] bArr, int i, int i2) {
        this.a = kr1Var;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // defpackage.cg2
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.cg2
    public final kr1 contentType() {
        return this.a;
    }

    @Override // defpackage.cg2
    public final void writeTo(cu cuVar) {
        cuVar.getClass();
        cuVar.write(this.c, this.d, this.b);
    }
}
