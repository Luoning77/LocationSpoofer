package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dd1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ gd1 f;

    public /* synthetic */ dd1(gd1 gd1Var, int i) {
        this.e = i;
        this.f = gd1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        gd1 gd1Var = this.f;
        switch (i) {
            case 0:
                ld1 ld1Var = (ld1) gd1Var.s.invoke();
                int iC = ld1Var.c();
                int i2 = 0;
                while (i2 < iC) {
                    if (ld1Var.d(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                ld1 ld1Var2 = (ld1) gd1Var.s.invoke();
                if (iIntValue < 0 || iIntValue >= ld1Var2.c()) {
                    StringBuilder sbR = p91.r(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbR.append(ld1Var2.c());
                    sbR.append(')');
                    s21.a(sbR.toString());
                }
                BuildersKt__Builders_commonKt.launch$default(gd1Var.a1(), null, null, new fd1(gd1Var, iIntValue, null), 3, null);
                return Boolean.TRUE;
        }
    }
}
