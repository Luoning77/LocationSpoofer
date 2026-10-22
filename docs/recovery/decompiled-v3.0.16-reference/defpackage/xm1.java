package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xm1 extends k33 implements lu0 {
    public Exception e;
    public int f;
    public final /* synthetic */ ul1 g;
    public final /* synthetic */ CloudAccountState h;
    public final /* synthetic */ AppState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(ul1 ul1Var, CloudAccountState cloudAccountState, AppState appState, q60 q60Var) {
        super(1, q60Var);
        this.g = ul1Var;
        this.h = cloudAccountState;
        this.i = appState;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new xm1(this.g, this.h, this.i, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        return ((xm1) create((q60) obj)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x017c, code lost:
    
        if (defpackage.an1.g(r9, r0, r8, r109) == r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03f7, code lost:
    
        if (defpackage.on1.h(r9, r109) == r10) goto L59;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r110) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
