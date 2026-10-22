package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class p31 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;

    public /* synthetic */ p31(int i, int i2, h82 h82Var) {
        this.e = 1;
        this.f = i;
        this.g = h82Var;
        this.h = i2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.h;
        int i3 = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                g82.z((g82) obj, (h82) obj2, i3, i2);
                break;
            case 1:
                h82 h82Var = (h82) obj2;
                g82.z((g82) obj, h82Var, xq1.P((i3 - h82Var.e) / 2.0f), xq1.P((i2 - h82Var.f) / 2.0f));
                break;
            case 2:
                g82.z((g82) obj, (h82) obj2, i3, i2);
                break;
            default:
                re reVar = (re) obj2;
                l52 l52Var = (l52) obj;
                le leVar = l52Var.a;
                int iD = l52Var.d(i3);
                int iD2 = l52Var.d(i2);
                CharSequence charSequence = leVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbS = p91.s("start(", ") or end(", iD, iD2, ") is out of range [0..");
                    sbS.append(charSequence.length());
                    sbS.append("], or start > end!");
                    q21.a(sbS.toString());
                }
                Path path = new Path();
                t83 t83Var = leVar.d;
                t83Var.f.getSelectionPath(iD, iD2, path);
                int i4 = t83Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                re reVar2 = new re(path);
                reVar2.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(l52Var.f)) & 4294967295L));
                re.a(reVar, reVar2);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ p31(int i, int i2, int i3, Object obj) {
        this.e = i3;
        this.g = obj;
        this.f = i;
        this.h = i2;
    }
}
