package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qr extends f52 {
    public final td e;
    public final long f;
    public int g = 1;
    public final long h;
    public float i;
    public rr j;

    public qr(td tdVar, long j) {
        int i;
        this.e = tdVar;
        this.f = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > tdVar.a.getWidth() || i > tdVar.a.getHeight()) {
            fo.i("Failed requirement.");
            throw null;
        }
        this.h = j;
        this.i = 1.0f;
    }

    @Override // defpackage.f52
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.f52
    public final void b(rr rrVar) {
        this.j = rrVar;
    }

    @Override // defpackage.f52
    public final long d() {
        return mc0.J(this.h);
    }

    @Override // defpackage.f52
    public final void e(jb1 jb1Var) {
        xv xvVar = jb1Var.e;
        jg0.q0(jb1Var, this.e, this.f, (((long) Math.round(Float.intBitsToFloat((int) (xvVar.a() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        return o51.f(this.e, qrVar.e) && h41.a(0L, 0L) && p41.b(this.f, qrVar.f) && this.g == qrVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + p91.c(p91.c(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) h41.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) p41.c(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
