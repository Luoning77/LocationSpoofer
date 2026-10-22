package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jp2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public jp2 f;
    public jp2 g;

    public jp2(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final jp2 a() {
        jp2 jp2Var = this.f;
        if (jp2Var == this) {
            jp2Var = null;
        }
        jp2 jp2Var2 = this.g;
        jp2Var2.getClass();
        jp2Var2.f = this.f;
        jp2 jp2Var3 = this.f;
        jp2Var3.getClass();
        jp2Var3.g = this.g;
        this.f = null;
        this.g = null;
        return jp2Var;
    }

    public final void b(jp2 jp2Var) {
        jp2Var.getClass();
        jp2Var.g = this;
        jp2Var.f = this.f;
        jp2 jp2Var2 = this.f;
        jp2Var2.getClass();
        jp2Var2.g = jp2Var;
        this.f = jp2Var;
    }

    public final jp2 c() {
        this.d = true;
        return new jp2(this.a, this.b, this.c, true);
    }

    public final void d(jp2 jp2Var, int i) {
        jp2Var.getClass();
        byte[] bArr = jp2Var.a;
        if (!jp2Var.e) {
            fo.n("only owner can write");
            return;
        }
        int i2 = jp2Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (jp2Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = jp2Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            yo.l0(bArr, bArr, 0, i4, i2);
            i2 = jp2Var.c - jp2Var.b;
            jp2Var.c = i2;
            jp2Var.b = 0;
        }
        int i5 = this.b;
        yo.l0(this.a, bArr, i2, i5, i5 + i);
        jp2Var.c += i;
        this.b += i;
    }

    public jp2() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
