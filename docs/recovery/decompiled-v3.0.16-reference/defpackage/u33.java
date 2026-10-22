package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u33 implements PointerInputEventHandler {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ oh b;
    public final /* synthetic */ float c;

    public u33(CoroutineScope coroutineScope, oh ohVar, float f) {
        this.a = coroutineScope;
        this.b = ohVar;
        this.c = f;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        CoroutineScope coroutineScope = this.a;
        oh ohVar = this.b;
        float f = this.c;
        dd ddVar = new dd(coroutineScope, ohVar, f);
        uo0 uo0Var = new uo0(coroutineScope, ohVar, f);
        float f2 = df0.a;
        Object objL = mh0.l(ca2Var, new ye0(new my(13), uo0Var, ddVar, new qe0(2), (q60) null, 1), q60Var);
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (objL != z70Var) {
            objL = mf3Var;
        }
        return objL == z70Var ? objL : mf3Var;
    }
}
