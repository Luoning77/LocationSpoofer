package defpackage;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class t5 extends bv0 implements pu0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        boolean zB2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        rc1 rc1Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                l6 l6Var = (l6) this.receiver;
                l6Var.getClass();
                l6Var.g(new g6(l6Var, str, str2, null, 0));
                return mf3Var;
            case 1:
                wi2 wi2Var = (wi2) this.receiver;
                wi2Var.getClass();
                return BuildersKt.withContext(Dispatchers.getIO(), new l80(wi2Var, (String) obj, objArr == true ? 1 : 0, 11), (q60) obj2);
            case 2:
                zp0 zp0Var = (zp0) obj;
                zp0 zp0Var2 = (zp0) obj2;
                bq0 bq0Var = (bq0) this.receiver;
                if (bq0Var.r && (zB = zp0Var2.b()) != zp0Var.b()) {
                    if (zB) {
                        we2 we2Var = new we2();
                        gh0.H(bq0Var, new ta(4, we2Var, bq0Var));
                        rc1 rc1Var2 = (rc1) we2Var.e;
                        if (rc1Var2 != null) {
                            rc1Var2.a();
                            rc1Var = rc1Var2;
                        }
                        bq0Var.v = rc1Var;
                    } else {
                        rc1 rc1Var3 = bq0Var.v;
                        if (rc1Var3 != null) {
                            rc1Var3.b();
                        }
                        bq0Var.v = null;
                    }
                }
                return mf3Var;
            case 3:
                zp0 zp0Var3 = (zp0) obj;
                zp0 zp0Var4 = (zp0) obj2;
                iq0 iq0Var = (iq0) this.receiver;
                if (iq0Var.r && (zB2 = zp0Var4.b()) != zp0Var3.b()) {
                    lu0 lu0Var = iq0Var.v;
                    if (lu0Var != null) {
                        lu0Var.invoke(Boolean.valueOf(zB2));
                    }
                    c30 c30Var = jq0.s;
                    if (zB2) {
                        BuildersKt__Builders_commonKt.launch$default(iq0Var.a1(), null, null, new d6((Object) iq0Var, (q60) (objArr2 == true ? 1 : 0), 5), 3, null);
                        we2 we2Var2 = new we2();
                        gh0.H(iq0Var, new m5(15, we2Var2, iq0Var));
                        rc1 rc1Var4 = (rc1) we2Var2.e;
                        if (rc1Var4 != null) {
                            rc1Var4.a();
                        } else {
                            rc1Var4 = null;
                        }
                        iq0Var.x = rc1Var4;
                        xz1 xz1Var = iq0Var.y;
                        if (xz1Var != null && xz1Var.t1().r && iq0Var.r) {
                            q73.c(iq0Var, c30Var);
                        }
                    } else {
                        rc1 rc1Var5 = iq0Var.x;
                        if (rc1Var5 != null) {
                            rc1Var5.b();
                        }
                        iq0Var.x = null;
                        if (iq0Var.r) {
                            q73.c(iq0Var, c30Var);
                        }
                    }
                    ee0.C(iq0Var);
                    ix1 ix1Var = iq0Var.u;
                    if (ix1Var != null) {
                        jp0 jp0Var = iq0Var.w;
                        if (zB2) {
                            if (jp0Var != null) {
                                iq0Var.p1(ix1Var, new kp0(jp0Var));
                                iq0Var.w = null;
                            }
                            jp0 jp0Var2 = new jp0();
                            iq0Var.p1(ix1Var, jp0Var2);
                            iq0Var.w = jp0Var2;
                        } else if (jp0Var != null) {
                            iq0Var.p1(ix1Var, new kp0(jp0Var));
                            iq0Var.w = null;
                        }
                    }
                }
                return mf3Var;
            case 4:
                bt2 bt2Var = (bt2) obj;
                int iIntValue = ((Number) obj2).intValue();
                bt2Var.getClass();
                f71 f71Var = (f71) this.receiver;
                f71Var.getClass();
                boolean z = !bt2Var.j(iIntValue) && bt2Var.i(iIntValue).g();
                f71Var.b = z;
                return Boolean.valueOf(z);
            case Logger.WARN /* 5 */:
                return ji2.B((q60) obj2, (lu0) obj, (ii2) this.receiver);
            default:
                return ji2.B((q60) obj2, (lu0) obj, (ii2) this.receiver);
        }
    }
}
