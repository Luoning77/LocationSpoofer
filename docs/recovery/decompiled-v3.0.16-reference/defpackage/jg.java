package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jg implements g63 {
    public final View a;
    public final lu0 b;
    public final au0 c;
    public final ry1 d = new ry1();
    public final ky2 e = new ky2(new cg(this, 0));
    public final cg f = new cg(this, 1);
    public final cg g = new cg(this, 2);
    public ActionMode h;
    public hg i;
    public Runnable j;

    public jg(View view, lu0 lu0Var, au0 au0Var) {
        this.a = view;
        this.b = lu0Var;
        this.c = au0Var;
    }

    @Override // defpackage.g63
    public final Object a(y53 y53Var, k33 k33Var) {
        Object objA = ry1.a(this.d, new ig(this, y53Var, null, 0), k33Var);
        return objA == z70.e ? objA : mf3.a;
    }
}
