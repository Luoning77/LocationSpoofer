package defpackage;

import com.vincenthzr.locationspoofer.data.motion.MotionController;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class po0 extends k33 implements pu0 {
    public final /* synthetic */ MotionController.State e;
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ ey1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po0(MotionController.State state, lu0 lu0Var, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.e = state;
        this.f = lu0Var;
        this.g = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new po0(this.e, this.f, this.g, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        po0 po0Var = (po0) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        po0Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        MotionController.State state = this.e;
        if (state.getHasPendingRecording()) {
            j52 j52Var = wo0.a;
            this.g.setValue(Boolean.FALSE);
        }
        this.f.invoke(Boolean.valueOf(state.getHasPendingRecording()));
        return mf3.a;
    }
}
