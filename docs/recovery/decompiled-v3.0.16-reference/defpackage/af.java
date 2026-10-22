package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class af implements CoroutineScope {
    public final View e;
    public final l83 f;
    public final CoroutineScope g;
    public final AtomicReference h = new AtomicReference(null);

    public af(View view, l83 l83Var, CoroutineScope coroutineScope) {
        this.e = view;
        this.f = l83Var;
        this.g = coroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(ne1 ne1Var, r60 r60Var) {
        xe xeVar;
        if (r60Var instanceof xe) {
            xeVar = (xe) r60Var;
            int i = xeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xeVar.g = i - Integer.MIN_VALUE;
            } else {
                xeVar = new xe(this, r60Var);
            }
        } else {
            xeVar = new xe(this, r60Var);
        }
        Object obj = xeVar.e;
        int i2 = xeVar.g;
        if (i2 == 0) {
            ee0.J(obj);
            ze zeVar = new ze(0, ne1Var, this);
            q60 q60Var = null;
            k kVar = new k(this, q60Var, 6);
            xeVar.g = 1;
            if (CoroutineScopeKt.coroutineScope(new t3(zeVar, this.h, kVar, q60Var, 15), xeVar) == z70.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ee0.J(obj);
        }
        fo.d();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final y70 getCoroutineContext() {
        return this.g.getCoroutineContext();
    }
}
