package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i70 implements lu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ i70(au0 au0Var, boolean z, AppState appState, au0 au0Var2, au0 au0Var3, au0 au0Var4, au0 au0Var5, no1 no1Var, ul1 ul1Var, ey1 ey1Var) {
        this.g = au0Var;
        this.f = z;
        this.h = appState;
        this.i = au0Var2;
        this.j = au0Var3;
        this.k = au0Var5;
        this.l = no1Var;
        this.m = ul1Var;
        this.n = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        y83 y83VarD;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        boolean z = this.f;
        Object obj9 = this.g;
        switch (i) {
            case 0:
                me1 me1Var = (me1) obj9;
                l83 l83Var = (l83) obj8;
                f83 f83Var = (f83) obj7;
                c11 c11Var = (c11) obj6;
                e12 e12Var = (e12) obj5;
                x73 x73Var = (x73) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                gt gtVar = (gt) obj2;
                zp0 zp0Var = (zp0) obj;
                if (me1Var.b() != zp0Var.b()) {
                    me1Var.f.setValue(Boolean.valueOf(zp0Var.b()));
                    if (me1Var.b() && z) {
                        k22.H(l83Var, me1Var, f83Var, c11Var, e12Var);
                    } else {
                        k22.q(me1Var);
                    }
                    if (zp0Var.b() && (y83VarD = me1Var.d()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new yd(gtVar, f83Var, me1Var, y83VarD, e12Var, null, 3), 3, null);
                    }
                    if (!zp0Var.b()) {
                        x73Var.d(null);
                    }
                }
                break;
            default:
                AppState appState = (AppState) obj8;
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                kd1Var.a(null, null, new p10(new ak(2, (au0) obj9), true, 1008799071));
                kd1Var.a(null, null, new p10(new ym0(z, appState, (au0) obj7), true, -118445368));
                kd1Var.a(null, null, new p10(new zf(z, (au0) obj6), true, 613730087));
                kd1Var.a(null, null, new p10(new ym0(appState, z, (au0) obj5), true, -203833779));
                kd1Var.a(null, null, new p10(new j5(z, (no1) obj4, (ul1) obj3, (ey1) obj2), true, 1345905542));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ i70(me1 me1Var, boolean z, l83 l83Var, f83 f83Var, c11 c11Var, e12 e12Var, x73 x73Var, CoroutineScope coroutineScope, gt gtVar) {
        this.g = me1Var;
        this.f = z;
        this.h = l83Var;
        this.i = f83Var;
        this.j = c11Var;
        this.k = e12Var;
        this.l = x73Var;
        this.m = coroutineScope;
        this.n = gtVar;
    }
}
