package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n50 implements q02, hj0 {
    public final /* synthetic */ int e;
    public final String f;

    public /* synthetic */ n50(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.hj0
    public boolean j(CharSequence charSequence, int i, int i2, ee3 ee3Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f)) {
            return true;
        }
        ee3Var.c = (ee3Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.q02
    public Object n() {
        int i = this.e;
        String str = this.f;
        switch (i) {
            case 0:
                throw new l71(str);
            default:
                throw new l71(str);
        }
    }

    @Override // defpackage.hj0
    public Object a() {
        return this;
    }
}
