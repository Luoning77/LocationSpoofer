package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eg1 extends v {
    public final y81 a;
    public final dg1 b;

    public eg1(y81 y81Var) {
        k13 k13Var = k13.a;
        this.a = y81Var;
        this.b = new dg1(k13.b, y81Var.getDescriptor());
    }

    @Override // defpackage.v
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // defpackage.v
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.v
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.v
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        k13 k13Var = k13.a;
        dg1 dg1Var = this.b;
        Object objU = l30Var.u(dg1Var, i, k13Var, null);
        int iJ = l30Var.j(dg1Var);
        if (iJ != i + 1) {
            fo.f(p91.n("Value must follow key in a map, index for key: ", i, iJ, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objU);
        y81 y81Var = this.a;
        map.put(objU, (!zContainsKey || (y81Var.getDescriptor().c() instanceof bc2)) ? l30Var.u(dg1Var, iJ, y81Var, null) : l30Var.u(dg1Var, iJ, y81Var, jq1.L(objU, map)));
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.v
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        d(obj);
        dg1 dg1Var = this.b;
        m30 m30VarB = ak0Var.b(dg1Var);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            m30VarB.r(dg1Var, i, k13.a, key);
            i += 2;
            m30VarB.r(dg1Var, i2, this.a, value);
        }
        m30VarB.a(dg1Var);
    }
}
