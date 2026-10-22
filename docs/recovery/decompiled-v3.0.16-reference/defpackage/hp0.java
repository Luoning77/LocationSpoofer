package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hp0 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ip0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp0(ip0 ip0Var, int i) {
        super(1);
        this.f = i;
        this.g = ip0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        ip0 ip0Var = this.g;
        switch (i) {
            case 0:
                pv pvVar = (pv) obj;
                View viewL = wc0.L(ip0Var);
                if (!viewL.isFocused() && !viewL.hasFocus()) {
                    op0 focusOwner = ((db) xp1.P(ip0Var)).getFocusOwner();
                    View viewN = xq1.N(ip0Var);
                    Integer numC = lp0.c(pvVar.a);
                    int[] iArr = new int[2];
                    viewN.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewL.getLocationOnScreen(iArr2);
                    dq0 dq0VarP = vd0.p(((rp0) focusOwner).c);
                    Rect rect = null;
                    pe2 pe2VarS = dq0VarP != null ? vd0.s(dq0VarP) : null;
                    if (pe2VarS != null) {
                        int i2 = (int) pe2VarS.a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) pe2VarS.b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) pe2VarS.c) + i3) - i4, (((int) pe2VarS.d) + i6) - i7);
                    }
                    if (!lp0.b(viewL, numC, rect)) {
                        pvVar.b = true;
                    }
                }
                break;
            default:
                wc0.L(ip0Var);
                break;
        }
        return mf3Var;
    }
}
