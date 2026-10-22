package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.MapStartupTiming;
import com.vincenthzr.locationspoofer.data.model.AppState;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wk1 extends k33 implements pu0 {
    public final /* synthetic */ AppState e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk1(AppState appState, q60 q60Var) {
        super(2, q60Var);
        this.e = appState;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new wk1(this.e, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        wk1 wk1Var = (wk1) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        wk1Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        if (this.e.isLanguageSet()) {
            MapStartupTiming.INSTANCE.mark(MapStartupTiming.Phase.MAIN_UI_READY);
        }
        return mf3.a;
    }
}
