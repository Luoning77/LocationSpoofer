package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.MapStartupTiming;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pg3 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ xg3 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg3(xg3 xg3Var, String str, q60 q60Var) {
        super(2, q60Var);
        this.f = xg3Var;
        this.g = str;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new pg3(this.f, this.g, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((pg3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            this.e = 1;
            Object objDelay = DelayKt.delay(5000L, this);
            z70 z70Var = z70.e;
            if (objDelay == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        String str = this.g;
        xg3 xg3Var = this.f;
        if (xg3Var.h(str)) {
            MapStartupTiming.INSTANCE.mark(MapStartupTiming.Phase.AUTO_UPDATE_STARTED);
            xg3Var.g();
        }
        return mf3.a;
    }
}
