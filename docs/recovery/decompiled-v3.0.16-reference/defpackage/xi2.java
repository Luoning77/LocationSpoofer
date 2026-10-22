package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xi2 extends eb1 {
    public static final xi2 c = new xi2("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi2(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                vj0 vj0Var = vj0.e;
                if (size == 0) {
                    return gr1Var.H0(l50.j(j), l50.i(j), vj0Var, ik0.z);
                }
                if (size == 1) {
                    h82 h82VarS = ((zq1) list.get(0)).s(j);
                    return gr1Var.H0(m50.g(h82VarS.e, j), m50.f(h82VarS.f, j), vj0Var, new oa(h82VarS, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    h82 h82VarS2 = ((zq1) list.get(i)).s(j);
                    iMax = Math.max(h82VarS2.e, iMax);
                    iMax2 = Math.max(h82VarS2.f, iMax2);
                    arrayList.add(h82VarS2);
                }
                return gr1Var.H0(m50.g(iMax, j), m50.f(iMax2, j), vj0Var, new kc(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
