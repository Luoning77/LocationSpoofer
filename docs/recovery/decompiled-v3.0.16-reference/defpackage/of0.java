package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class of0 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ of0(ArrayList arrayList, ey1 ey1Var, int i) {
        this.e = i;
        this.f = arrayList;
        this.g = ey1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                s41 s41Var = (s41) obj;
                if (s41Var instanceof mf0) {
                    arrayList.add(s41Var);
                } else if (s41Var instanceof nf0) {
                    arrayList.remove(((nf0) s41Var).a);
                } else if (s41Var instanceof lf0) {
                    arrayList.remove(((lf0) s41Var).a);
                }
                ey1Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                s41 s41Var2 = (s41) obj;
                if (s41Var2 instanceof jp0) {
                    arrayList.add(s41Var2);
                } else if (s41Var2 instanceof kp0) {
                    arrayList.remove(((kp0) s41Var2).a);
                }
                ey1Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 2:
                s41 s41Var3 = (s41) obj;
                if (s41Var3 instanceof ly0) {
                    arrayList.add(s41Var3);
                } else if (s41Var3 instanceof my0) {
                    arrayList.remove(((my0) s41Var3).a);
                }
                ey1Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                s41 s41Var4 = (s41) obj;
                if (s41Var4 instanceof vb2) {
                    arrayList.add(s41Var4);
                } else if (s41Var4 instanceof wb2) {
                    arrayList.remove(((wb2) s41Var4).a);
                } else if (s41Var4 instanceof ub2) {
                    arrayList.remove(((ub2) s41Var4).a);
                }
                ey1Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return mf3Var;
    }
}
