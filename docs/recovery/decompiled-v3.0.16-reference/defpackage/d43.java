package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class d43 implements lu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d43(AppState appState, boolean z, ey1 ey1Var) {
        this.h = appState;
        this.f = z;
        this.g = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f) {
                    this.g.setValue(Boolean.TRUE);
                } else {
                    tt2Var.h(SyncSelection.copy$default(tt2Var.d(), zBooleanValue, null, 2, null));
                }
                break;
            default:
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                o43[] o43VarArrValues = o43.values();
                kd1Var.c(o43VarArrValues.length, null, new cn(o43VarArrValues, 1), new p10(new en(o43VarArrValues, (AppState) obj2, this.f, this.g, 3), true, -1781742563));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ d43(boolean z, tt2 tt2Var, ey1 ey1Var) {
        this.f = z;
        this.h = tt2Var;
        this.g = ey1Var;
    }
}
