package defpackage;

import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ui2 extends k33 implements pu0 {
    public final /* synthetic */ int e = 0;
    public int f;
    public boolean g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui2(x73 x73Var, boolean z, q60 q60Var) {
        super(2, q60Var);
        this.h = x73Var;
        this.g = z;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new ui2((wi2) obj2, q60Var);
            default:
                return new ui2((x73) obj2, this.g, q60Var);
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
        return ((ui2) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [q60] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        boolean zC0;
        boolean z;
        zx zxVar;
        dj djVarC;
        int i = this.e;
        z70 z70Var = z70.e;
        Object obj2 = this.h;
        dj djVar = 0;
        djVar = 0;
        switch (i) {
            case 0:
                wi2 wi2Var = (wi2) obj2;
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    wi2Var.getClass();
                    zC0 = l13.c0(wi2.a("id", null), "uid=0(root)", false);
                    if (zC0) {
                        this.g = zC0;
                        this.f = 1;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new wr1(SelfHostedUpdates.APPLICATION_ID, wi2Var, djVar, 8), this) == z70Var) {
                            return z70Var;
                        }
                        z = zC0;
                    }
                    return Boolean.valueOf(zC0);
                }
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.g;
                ee0.J(obj);
                zC0 = z;
                return Boolean.valueOf(zC0);
            default:
                x73 x73Var = (x73) obj2;
                int i3 = this.f;
                mf3 mf3Var = mf3.a;
                if (i3 == 0) {
                    ee0.J(obj);
                    boolean z2 = this.g;
                    if (!f93.c(x73Var.l().b) && !(x73Var.f instanceof j62)) {
                        djVarC = g83.c(x73Var.l());
                        if (z2) {
                            djVar = djVarC;
                            int iE = f93.e(x73Var.l().b);
                            x73Var.c.invoke(x73.b(x73Var.l().a, g93.a(iE, iE)));
                            x73Var.r(dx0.e);
                            djVar = djVarC;
                        }
                    }
                    if (djVar != 0 && (zxVar = x73Var.h) != null) {
                        yx yxVarR = xq1.R(djVar);
                        this.f = 1;
                        ((ja) zxVar).a(yxVarR);
                        if (mf3Var == z70Var) {
                            return z70Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui2(wi2 wi2Var, q60 q60Var) {
        super(2, q60Var);
        this.h = wi2Var;
    }
}
