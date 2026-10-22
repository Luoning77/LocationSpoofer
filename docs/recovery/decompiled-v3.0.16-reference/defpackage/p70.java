package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p70 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p70(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        int i = this.a;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new o70(ca2Var, (s63) obj2, (x73) obj, (q60) null, 0), q60Var);
                return objCoroutineScope == z70Var ? objCoroutineScope : mf3Var;
            case 1:
                Object objU = wc0.u(ca2Var, (jq2) obj2, (iq2) obj, q60Var);
                return objU == z70Var ? objU : mf3Var;
            default:
                Object objL = mh0.l(ca2Var, new nr0((ar2) obj2, (bq2) obj, null, 3), q60Var);
                return objL == z70Var ? objL : mf3Var;
        }
    }
}
