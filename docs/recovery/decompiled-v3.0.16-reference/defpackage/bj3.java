package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bj3 extends eh {
    public final View E;
    public final dz1 F;
    public sl2 G;
    public lu0 H;
    public lu0 I;
    public lu0 J;

    public bj3(Context context, lu0 lu0Var, mv0 mv0Var, tl2 tl2Var, int i, t42 t42Var) {
        View view = (View) lu0Var.invoke(context);
        dz1 dz1Var = new dz1();
        super(context, mv0Var, i, dz1Var, view, t42Var);
        this.E = view;
        this.F = dz1Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objD = tl2Var != null ? tl2Var.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (tl2Var != null) {
            setSavableRegistryEntry(tl2Var.a(strValueOf, new dh(this, 2)));
        }
        wa waVar = wa.s;
        this.H = waVar;
        this.I = waVar;
        this.J = waVar;
    }

    private final void setSavableRegistryEntry(sl2 sl2Var) {
        sl2 sl2Var2 = this.G;
        if (sl2Var2 != null) {
            ((gn) sl2Var2).G();
        }
        this.G = sl2Var;
    }

    public final dz1 getDispatcher() {
        return this.F;
    }

    public final lu0 getReleaseBlock() {
        return this.J;
    }

    public final lu0 getResetBlock() {
        return this.I;
    }

    public /* bridge */ /* synthetic */ y getSubCompositionView() {
        return null;
    }

    public final lu0 getUpdateBlock() {
        return this.H;
    }

    public final void n() {
        setSavableRegistryEntry(null);
    }

    public final void setReleaseBlock(lu0 lu0Var) {
        this.J = lu0Var;
        setRelease(new dh(this, 3));
    }

    public final void setResetBlock(lu0 lu0Var) {
        this.I = lu0Var;
        setReset(new dh(this, 4));
    }

    public final void setUpdateBlock(lu0 lu0Var) {
        this.H = lu0Var;
        setUpdate(new dh(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
