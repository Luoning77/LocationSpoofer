package defpackage;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mu2 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ nu2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu2(nu2 nu2Var, int i) {
        super(0);
        this.f = i;
        this.g = nu2Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        q60 q60Var;
        Object obj;
        int i = this.f;
        int i2 = 0;
        nu2 nu2Var = this.g;
        switch (i) {
            case 0:
                boolean z = nu2Var.g;
                oh ohVar = nu2Var.f;
                wu2 wu2Var = nu2Var.b;
                if (!z && wu2Var.a() && ((Boolean) ohVar.d.getValue()).booleanValue()) {
                    List listC = nu2Var.c();
                    int size = listC.size();
                    while (true) {
                        q60Var = null;
                        if (i2 < size) {
                            obj = listC.get(i2);
                            if (!((pu2) obj).d().b()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pu2 pu2Var = (pu2) obj;
                    if (pu2Var != null) {
                        ln0 ln0Var = pu2Var.d().f;
                        if (ln0Var instanceof yz2) {
                            yz2 yz2Var = (yz2) ln0Var;
                            BuildersKt__Builders_commonKt.launch$default(wu2Var.f, null, null, new wr1(nu2Var, new yz2(yz2Var.a, yz2Var.b, new c12((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), q60Var, 11), 3, null);
                        }
                        nu2Var.g = true;
                    }
                }
                c12 c12Var = (c12) ohVar.d();
                long j = c12Var.a;
                return c12Var;
            default:
                List listB = nu2Var.b();
                int size2 = listB.size();
                while (i2 < size2) {
                    pu2 pu2Var2 = (pu2) listB.get(i2);
                    if (pu2Var2.d().b() && pu2Var2.h()) {
                        return mf3.a;
                    }
                    i2++;
                }
                return mf3.a;
        }
    }
}
