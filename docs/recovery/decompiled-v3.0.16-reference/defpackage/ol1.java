package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ol1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ul1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol1(ul1 ul1Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = ul1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        ul1 ul1Var = this.h;
        switch (i) {
            case 0:
                ol1 ol1Var = new ol1(ul1Var, q60Var, 0);
                ol1Var.g = obj;
                return ol1Var;
            default:
                ol1 ol1Var2 = new ol1(ul1Var, q60Var, 1);
                ol1Var2.g = obj;
                return ol1Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ol1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object wg2Var = mf3.a;
        ul1 ul1Var = this.h;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.g;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return wg2Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                Flow<mf3> flowObserveChanges = ul1Var.c.observeChanges();
                nl1 nl1Var = new nl1(ul1Var, coroutineScope);
                this.g = null;
                this.f = 1;
                return flowObserveChanges.collect(nl1Var, this) == z70Var ? z70Var : wg2Var;
            default:
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ee0.J(obj);
                        LocationRepository locationRepository = ul1Var.b;
                        Context context = ul1Var.j;
                        this.g = null;
                        this.f = 1;
                        if (locationRepository.stopSpoofing(context, false, this) == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i3 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    break;
                } catch (Throwable th) {
                    wg2Var = new wg2(th);
                }
                return new xg2(wg2Var);
        }
    }
}
