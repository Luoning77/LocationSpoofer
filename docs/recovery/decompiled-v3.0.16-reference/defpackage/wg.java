package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wg extends tk3 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ViewGroup h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(ViewGroup viewGroup, int i) {
        super(1);
        this.g = i;
        this.h = viewGroup;
    }

    @Override // defpackage.tk3
    public final ql3 c(ql3 ql3Var, List list) {
        int i = this.g;
        ViewGroup viewGroup = this.h;
        switch (i) {
            case 0:
                return ((bj3) viewGroup).l(ql3Var);
            default:
                pc0 pc0Var = (pc0) viewGroup;
                if (pc0Var.q) {
                    return ql3Var;
                }
                View childAt = pc0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, pc0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, pc0Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? ql3Var : ql3Var.a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.tk3
    public final z92 d(al3 al3Var, z92 z92Var) {
        int i = this.g;
        ViewGroup viewGroup = this.h;
        switch (i) {
            case 0:
                v21 v21Var = ((bj3) viewGroup).D.K.c;
                if (!v21Var.X.r) {
                    return z92Var;
                }
                long jO = gh0.O(v21Var.h0(0L));
                int i2 = (int) (jO >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jO & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jF0 = wc0.F(v21Var).f0();
                int i4 = (int) (jF0 >> 32);
                int i5 = (int) (jF0 & 4294967295L);
                long j = v21Var.g;
                long jO2 = gh0.O(v21Var.h0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jO2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jO2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? z92Var : new z92(10, eh.k((j31) z92Var.f, i2, i3, i6, i8), eh.k((j31) z92Var.g, i2, i3, i6, i8));
            default:
                pc0 pc0Var = (pc0) viewGroup;
                if (pc0Var.q) {
                    return z92Var;
                }
                View childAt = pc0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, pc0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, pc0Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return z92Var;
                }
                j31 j31VarB = j31.b(iMax, iMax2, iMax3, iMax4);
                int i9 = j31VarB.a;
                j31 j31Var = (j31) z92Var.f;
                int i10 = j31VarB.b;
                int i11 = j31VarB.c;
                int i12 = j31VarB.d;
                return new z92(10, ql3.a(j31Var, i9, i10, i11, i12), ql3.a((j31) z92Var.g, i9, i10, i11, i12));
        }
    }
}
