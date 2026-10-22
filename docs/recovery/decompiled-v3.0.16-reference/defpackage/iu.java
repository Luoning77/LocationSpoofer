package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iu implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ fy2 f;

    public /* synthetic */ iu(fy2 fy2Var, int i) {
        this.e = i;
        this.f = fy2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        fy2 fy2Var = this.f;
        switch (i) {
            case 0:
                s41 s41Var = (s41) obj;
                if (s41Var instanceof ly0) {
                    fy2Var.add(s41Var);
                } else if (s41Var instanceof my0) {
                    fy2Var.remove(((my0) s41Var).a);
                } else if (s41Var instanceof jp0) {
                    fy2Var.add(s41Var);
                } else if (s41Var instanceof kp0) {
                    fy2Var.remove(((kp0) s41Var).a);
                } else if (s41Var instanceof vb2) {
                    fy2Var.add(s41Var);
                } else if (s41Var instanceof wb2) {
                    fy2Var.remove(((wb2) s41Var).a);
                } else if (s41Var instanceof ub2) {
                    fy2Var.remove(((ub2) s41Var).a);
                }
                break;
            case 1:
                s41 s41Var2 = (s41) obj;
                if (s41Var2 instanceof ly0) {
                    fy2Var.add(s41Var2);
                } else if (s41Var2 instanceof my0) {
                    fy2Var.remove(((my0) s41Var2).a);
                } else if (s41Var2 instanceof jp0) {
                    fy2Var.add(s41Var2);
                } else if (s41Var2 instanceof kp0) {
                    fy2Var.remove(((kp0) s41Var2).a);
                } else if (s41Var2 instanceof vb2) {
                    fy2Var.add(s41Var2);
                } else if (s41Var2 instanceof wb2) {
                    fy2Var.remove(((wb2) s41Var2).a);
                } else if (s41Var2 instanceof ub2) {
                    fy2Var.remove(((ub2) s41Var2).a);
                } else if (s41Var2 instanceof mf0) {
                    fy2Var.add(s41Var2);
                } else if (s41Var2 instanceof nf0) {
                    fy2Var.remove(((nf0) s41Var2).a);
                } else if (s41Var2 instanceof lf0) {
                    fy2Var.remove(((lf0) s41Var2).a);
                }
                break;
            case 2:
                s41 s41Var3 = (s41) obj;
                if (s41Var3 instanceof ly0) {
                    fy2Var.add(s41Var3);
                } else if (s41Var3 instanceof my0) {
                    fy2Var.remove(((my0) s41Var3).a);
                } else if (s41Var3 instanceof jp0) {
                    fy2Var.add(s41Var3);
                } else if (s41Var3 instanceof kp0) {
                    fy2Var.remove(((kp0) s41Var3).a);
                } else if (s41Var3 instanceof vb2) {
                    fy2Var.add(s41Var3);
                } else if (s41Var3 instanceof wb2) {
                    fy2Var.remove(((wb2) s41Var3).a);
                } else if (s41Var3 instanceof ub2) {
                    fy2Var.remove(((ub2) s41Var3).a);
                } else if (s41Var3 instanceof mf0) {
                    fy2Var.add(s41Var3);
                } else if (s41Var3 instanceof nf0) {
                    fy2Var.remove(((nf0) s41Var3).a);
                } else if (s41Var3 instanceof lf0) {
                    fy2Var.remove(((lf0) s41Var3).a);
                }
                break;
            default:
                s41 s41Var4 = (s41) obj;
                if (s41Var4 instanceof vb2) {
                    fy2Var.add(s41Var4);
                } else if (s41Var4 instanceof wb2) {
                    fy2Var.remove(((wb2) s41Var4).a);
                } else if (s41Var4 instanceof ub2) {
                    fy2Var.remove(((ub2) s41Var4).a);
                } else if (s41Var4 instanceof mf0) {
                    fy2Var.add(s41Var4);
                } else if (s41Var4 instanceof nf0) {
                    fy2Var.remove(((nf0) s41Var4).a);
                } else if (s41Var4 instanceof lf0) {
                    fy2Var.remove(((lf0) s41Var4).a);
                }
                break;
        }
        return mf3Var;
    }
}
