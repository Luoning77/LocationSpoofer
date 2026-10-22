package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m20 extends RuntimeException {
    public final sx1 e;
    public final sx1 f;
    public final fx1 g;
    public final int h;

    public m20(sx1 sx1Var, sx1 sx1Var2, fx1 fx1Var, int i, Exception exc) {
        super(exc);
        this.e = sx1Var;
        this.f = sx1Var2;
        this.g = fx1Var;
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listF;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.h);
        sb.append(":\n            |");
        vs2 vs2VarV = dh0.v(new l20(this, null));
        if (vs2VarV.hasNext()) {
            Object next = vs2VarV.next();
            if (vs2VarV.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (vs2VarV.hasNext()) {
                    arrayList.add(vs2VarV.next());
                }
                listF = arrayList;
            } else {
                listF = am1.F(next);
            }
        } else {
            listF = uj0.e;
        }
        sb.append(zy.s0(zy.E0(listF, 50), "\n", null, null, null, 62));
        sb.append("\n            ");
        return m13.P(sb.toString());
    }
}
