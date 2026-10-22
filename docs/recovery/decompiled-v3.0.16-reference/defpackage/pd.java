package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pd {
    public final ArrayList a;
    public final ArrayList b;
    public final j03 c;
    public final m03 d;
    public final zi2 e;
    public final qv2 f;
    public final kw1 g;
    public final hw1 h;

    public pd(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.a = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.b = arrayList3;
        arrayList2.addAll(arrayList);
        zi2 zi2Var = new zi2(context, this);
        this.e = zi2Var;
        m03 m03Var = new m03(context, this);
        this.d = m03Var;
        qv2 qv2Var = new qv2(context, this);
        this.f = qv2Var;
        sv2 sv2Var = new sv2(context, this);
        kw1 kw1Var = new kw1(context, this);
        this.g = kw1Var;
        hw1 hw1Var = new hw1(context, this);
        this.h = hw1Var;
        j03 j03Var = new j03(context, this);
        this.c = j03Var;
        arrayList3.add(zi2Var);
        arrayList3.add(m03Var);
        arrayList3.add(qv2Var);
        arrayList3.add(sv2Var);
        arrayList3.add(kw1Var);
        arrayList3.add(hw1Var);
        arrayList3.add(j03Var);
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            pq pqVar = (pq) obj;
            if (pqVar instanceof jw1) {
                jw1 jw1Var = (jw1) pqVar;
                jw1Var.j = jw1Var.a.getResources().getDimension(2131099749);
            }
            if (pqVar instanceof m03) {
                m03 m03Var2 = (m03) pqVar;
                m03Var2.E = m03Var2.a.getResources().getDimension(2131099746);
            }
            if (pqVar instanceof qv2) {
                qv2 qv2Var2 = (qv2) pqVar;
                qv2Var2.w = qv2Var2.a.getResources().getDimension(2131099747);
                qv2Var2.v = 20.0f;
            }
            if (pqVar instanceof sv2) {
                sv2 sv2Var2 = (sv2) pqVar;
                sv2Var2.w = sv2Var2.a.getResources().getDimension(2131099747);
                sv2Var2.v = 20.0f;
            }
            if (pqVar instanceof kw1) {
                kw1 kw1Var2 = (kw1) pqVar;
                kw1Var2.q = kw1Var2.a.getResources().getDimension(2131099745);
                kw1Var2.p = 150L;
            }
            if (pqVar instanceof zi2) {
                ((zi2) pqVar).v = 15.3f;
            }
        }
    }
}
