package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l6 extends hj3 {
    public final CloudRepository b;
    public final StateFlow c;
    public final boolean d;
    public final boolean e;
    public final StateFlow f;
    public final StateFlow g;
    public final StateFlow h;
    public final StateFlow i;
    public final StateFlow j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;

    public l6(CloudRepository cloudRepository) {
        this.b = cloudRepository;
        StateFlow<CloudAccountState> state = cloudRepository.getState();
        this.c = state;
        this.d = cloudRepository.getConfigured();
        this.e = cloudRepository.getAccountProtocol();
        this.f = cloudRepository.getSignOutNotice();
        this.g = cloudRepository.getRegistrationNotice();
        this.h = cloudRepository.getTeeAvailability();
        this.i = cloudRepository.getAccountProtocol() ? FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(Boolean.FALSE)) : cloudRepository.getCompanionMode();
        this.j = cloudRepository.getCompanionPairing();
        q60 q60Var = null;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.k = MutableStateFlow;
        this.l = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.m = MutableStateFlow2;
        this.n = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.o = MutableStateFlow3;
        this.p = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.q = MutableStateFlow4;
        this.r = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(uj0.e);
        this.s = MutableStateFlow5;
        this.t = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.u = MutableStateFlow6;
        this.v = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.w = MutableStateFlow7;
        this.x = FlowKt.asStateFlow(MutableStateFlow7);
        int i = 0;
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new d6(this, q60Var, i), 3, null);
        if (state.getValue().getValidated() || state.getValue().getChecking()) {
            return;
        }
        g(new e6(this, q60Var, i));
    }

    public final void e() {
        if (((Boolean) this.o.getValue()).booleanValue()) {
            return;
        }
        this.q.setValue(null);
        this.b.dismissAccountEntryError();
    }

    public final void f() {
        g(new e6(this, null, 2));
    }

    public final void g(lu0 lu0Var) {
        MutableStateFlow mutableStateFlow = this.o;
        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
            return;
        }
        mutableStateFlow.setValue(Boolean.TRUE);
        this.q.setValue(null);
        this.u.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new k(lu0Var, this, null, 2), 3, null);
    }
}
