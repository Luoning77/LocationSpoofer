package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dh extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ bj3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh(bj3 bj3Var, int i) {
        super(0);
        this.f = i;
        this.g = bj3Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        bj3 bj3Var = this.g;
        switch (i) {
            case 0:
                bj3Var.getLayoutNode().B();
                return mf3Var;
            case 1:
                if (bj3Var.i && bj3Var.isAttachedToWindow() && bj3Var.getView().getParent() == bj3Var) {
                    v42 snapshotObserver = bj3Var.getSnapshotObserver();
                    snapshotObserver.a.c(bj3Var, wa.p, bj3Var.getUpdate());
                }
                return mf3Var;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                bj3Var.E.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                bj3Var.getReleaseBlock().invoke(bj3Var.E);
                bj3Var.n();
                return mf3Var;
            case 4:
                bj3Var.getResetBlock().invoke(bj3Var.E);
                return mf3Var;
            default:
                bj3Var.getUpdateBlock().invoke(bj3Var.E);
                return mf3Var;
        }
    }
}
