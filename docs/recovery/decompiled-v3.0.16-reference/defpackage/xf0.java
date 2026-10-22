package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xf0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xf0(cg0 cg0Var, int i) {
        this.e = 0;
        this.g = cg0Var;
        this.f = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                cg0 cg0Var = (cg0) obj2;
                jg0 jg0Var = (jg0) obj;
                jg0Var.getClass();
                cg0Var.s.b(jg0Var, cg0Var.B, (pa1) cg0Var.I.getValue(), cg0Var.v, this.f);
                return mf3Var;
            case 1:
                ((t52) obj2).h(mh0.v(((Integer) obj).intValue(), 0, i2 - 1));
                return mf3Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ xf0(int i, int i2, Object obj) {
        this.e = i2;
        this.f = i;
        this.g = obj;
    }
}
