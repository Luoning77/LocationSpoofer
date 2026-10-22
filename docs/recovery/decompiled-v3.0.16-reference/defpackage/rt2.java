package defpackage;

import android.content.SharedPreferences;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rt2 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ tt2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rt2(tt2 tt2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = tt2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        tt2 tt2Var = this.h;
        switch (i) {
            case 0:
                rt2 rt2Var = new rt2(tt2Var, q60Var, 0);
                rt2Var.g = obj;
                return rt2Var;
            default:
                rt2 rt2Var2 = new rt2(tt2Var, q60Var, 1);
                rt2Var2.g = obj;
                return rt2Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ProducerScope producerScope = (ProducerScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((rt2) create(producerScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        final tt2 tt2Var = this.h;
        switch (i) {
            case 0:
                ProducerScope producerScope = (ProducerScope) this.g;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                dt0 dt0Var = new dt0(producerScope, 1);
                tt2Var.b.registerOnSharedPreferenceChangeListener(dt0Var);
                producerScope.mo32trySendJP2dKIU(mf3Var);
                qi2 qi2Var = new qi2(8, tt2Var, dt0Var);
                this.g = null;
                this.f = 1;
                return ProduceKt.awaitClose(producerScope, qi2Var, this) == z70Var ? z70Var : mf3Var;
            default:
                final ProducerScope producerScope2 = (ProducerScope) this.g;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: st2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != 596271680) {
                                if (iHashCode != 1334477213 || !str.equals("sync_enabled")) {
                                    return;
                                }
                            } else if (!str.equals("sync_categories")) {
                                return;
                            }
                            producerScope2.mo32trySendJP2dKIU(tt2Var.d());
                        }
                    }
                };
                tt2Var.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                producerScope2.mo32trySendJP2dKIU(tt2Var.d());
                qi2 qi2Var2 = new qi2(9, tt2Var, onSharedPreferenceChangeListener);
                this.g = null;
                this.f = 1;
                return ProduceKt.awaitClose(producerScope2, qi2Var2, this) == z70Var ? z70Var : mf3Var;
        }
    }
}
