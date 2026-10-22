package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ig extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ g63 g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig(g63 g63Var, Object obj, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.g = g63Var;
        this.h = obj;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        Object obj = this.h;
        g63 g63Var = this.g;
        switch (i) {
            case 0:
                return new ig((jg) g63Var, (y53) obj, q60Var, 0);
            default:
                return new ig((vq) g63Var, (uq) obj, q60Var, 1);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((ig) create(q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        fg fgVar;
        int i = this.e;
        z70 z70Var = z70.e;
        g63 g63Var = this.g;
        Object obj2 = this.h;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                jg jgVar = (jg) g63Var;
                ky2 ky2Var = jgVar.e;
                View view = jgVar.a;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ee0.J(obj);
                        gg ggVar = new gg();
                        y53 y53Var = (y53) obj2;
                        fg fgVar2 = new fg(ggVar, new dg(jgVar, y53Var, 0), new dg(jgVar, y53Var, 1), view);
                        lu0 lu0Var = jgVar.b;
                        if (lu0Var != null && (fgVar = (fg) lu0Var.invoke(fgVar2)) != null) {
                            fgVar2 = fgVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper == (handler != null ? handler.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new xo0(fgVar2), 1);
                            if (actionModeStartActionMode != null) {
                                jgVar.h = actionModeStartActionMode;
                            }
                            return mf3Var;
                        }
                        hg hgVar = jgVar.i;
                        if (hgVar == null) {
                            hgVar = new hg(jgVar, fgVar2, ggVar, 0);
                            jgVar.i = hgVar;
                        }
                        view.post(hgVar);
                        this.f = 1;
                        Object objReceive = ggVar.a.receive(this);
                        if (objReceive != z70Var) {
                            objReceive = mf3Var;
                        }
                        if (objReceive == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i2 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    ky2Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable wVar = jgVar.j;
                        if (wVar == null) {
                            wVar = new w(jgVar, 4);
                            jgVar.j = wVar;
                        }
                        view.post(wVar);
                    } else {
                        ActionMode actionMode = jgVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    hg hgVar2 = jgVar.i;
                    if (hgVar2 != null) {
                        view.removeCallbacks(hgVar2);
                    }
                    jgVar.h = null;
                    return mf3Var;
                } catch (Throwable th) {
                    ky2Var.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable wVar2 = jgVar.j;
                        if (wVar2 == null) {
                            wVar2 = new w(jgVar, 4);
                            jgVar.j = wVar2;
                        }
                        view.post(wVar2);
                    } else {
                        ActionMode actionMode2 = jgVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    hg hgVar3 = jgVar.i;
                    if (hgVar3 != null) {
                        view.removeCallbacks(hgVar3);
                    }
                    jgVar.h = null;
                    throw th;
                }
            default:
                uq uqVar = (uq) obj2;
                w52 w52Var = ((vq) g63Var).c;
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ee0.J(obj);
                        w52Var.setValue(uqVar);
                        this.f = 1;
                        Object objReceive2 = uqVar.b.receive(this);
                        if (objReceive2 != z70Var) {
                            objReceive2 = mf3Var;
                        }
                        if (objReceive2 == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i3 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    w52Var.setValue(null);
                    return mf3Var;
                } catch (Throwable th2) {
                    w52Var.setValue(null);
                    throw th2;
                }
        }
    }
}
