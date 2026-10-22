package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c0 extends ks {
    public final /* synthetic */ x71 Q;
    public final /* synthetic */ String R;

    public c0(x71 x71Var, String str) {
        this.Q = x71Var;
        this.R = str;
    }

    public final void g0(String str) {
        str.getClass();
        this.Q.I(this.R, new o71(str, false, null));
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void h(short s) {
        g0(String.valueOf(s & 65535));
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void k(byte b) {
        g0(String.valueOf(b & 255));
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void q(int i) {
        g0(Integer.toUnsignedString(i));
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void v(long j) {
        g0(Long.toUnsignedString(j));
    }
}
