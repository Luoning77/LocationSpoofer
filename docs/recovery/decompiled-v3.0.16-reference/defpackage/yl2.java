package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yl2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ dv1 g;
    public final /* synthetic */ lu0 h;
    public final /* synthetic */ lu0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ yl2(dv1 dv1Var, List list, mi1 mi1Var, boolean z, lu0 lu0Var, lu0 lu0Var2, au0 au0Var, au0 au0Var2, dv1 dv1Var2, int i) {
        this.g = dv1Var;
        this.l = list;
        this.m = mi1Var;
        this.f = z;
        this.h = lu0Var;
        this.i = lu0Var2;
        this.n = au0Var;
        this.o = au0Var2;
        this.k = dv1Var2;
        this.j = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.j;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        Object obj6 = this.l;
        Object obj7 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(i2 | 1);
                ig0.e(this.g, (List) obj6, (mi1) obj5, this.f, this.h, this.i, (au0) obj4, (au0) obj3, (dv1) obj7, (f30) obj, iM0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(i2 | 1);
                as2.a((Context) obj7, (df1) obj6, (CloudRepository) obj5, this.f, this.g, this.h, this.i, (Double) obj4, (Double) obj3, (f30) obj, iM1);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ yl2(Context context, df1 df1Var, CloudRepository cloudRepository, boolean z, dv1 dv1Var, lu0 lu0Var, lu0 lu0Var2, Double d, Double d2, int i) {
        this.k = context;
        this.l = df1Var;
        this.m = cloudRepository;
        this.f = z;
        this.g = dv1Var;
        this.h = lu0Var;
        this.i = lu0Var2;
        this.n = d;
        this.o = d2;
        this.j = i;
    }
}
