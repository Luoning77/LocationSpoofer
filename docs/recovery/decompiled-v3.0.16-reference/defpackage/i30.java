package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i30 extends e30 {
    public final boolean g;

    public i30(x8 x8Var, boolean z) {
        super(x8Var);
        this.g = z;
    }

    @Override // defpackage.e30
    public final void e(byte b) {
        if (this.g) {
            j(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((x8) this.f).k(strValueOf);
    }

    @Override // defpackage.e30
    public final void g(int i) {
        boolean z = this.g;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            j(unsignedString);
        } else {
            unsignedString.getClass();
            ((x8) this.f).k(unsignedString);
        }
    }

    @Override // defpackage.e30
    public final void h(long j) {
        boolean z = this.g;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            j(unsignedString);
        } else {
            unsignedString.getClass();
            ((x8) this.f).k(unsignedString);
        }
    }

    @Override // defpackage.e30
    public final void i(short s) {
        if (this.g) {
            j(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((x8) this.f).k(strValueOf);
    }
}
