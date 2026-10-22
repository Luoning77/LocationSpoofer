package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mv1 implements lv1 {
    public final Context e;
    public CoroutineScope f;
    public final s52 g = new s52(1.0f);
    public Job h;

    public mv1(Context context) {
        this.e = context;
    }

    @Override // defpackage.lv1
    public final float A() {
        q60 q60Var;
        StateFlow stateFlow;
        if (this.h == null) {
            Context context = this.e;
            zx1 zx1Var = km3.a;
            synchronized (zx1Var) {
                try {
                    Object objG = zx1Var.g(context);
                    q60Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                        objG = FlowKt.stateIn(FlowKt.flow(new n3(contentResolver, uriFor, new h80(channelChannel$default, mh0.z(Looper.getMainLooper())), channelChannel$default, context, null, 3)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        zx1Var.m(context, objG);
                    }
                    stateFlow = (StateFlow) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g.h(((Number) stateFlow.getValue()).floatValue());
            CoroutineScope coroutineScope = this.f;
            if (coroutineScope == null) {
                fo.n("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.h = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new wr1(stateFlow, this, q60Var, 2), 3, null);
        }
        return this.g.g();
    }

    @Override // defpackage.y70
    public final Object fold(Object obj, pu0 pu0Var) {
        return da0.u(this, obj, pu0Var);
    }

    @Override // defpackage.y70
    public final w70 get(x70 x70Var) {
        return da0.v(this, x70Var);
    }

    @Override // defpackage.y70
    public final y70 minusKey(x70 x70Var) {
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public final y70 plus(y70 y70Var) {
        return da0.E(y70Var, this);
    }
}
