package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t72 extends x0 implements f11 {
    public final /* synthetic */ int e;
    public final m72 f;

    public /* synthetic */ t72(m72 m72Var, int i) {
        this.e = i;
        this.f = m72Var;
    }

    @Override // defpackage.u
    public final int a() {
        int i = this.e;
        m72 m72Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return m72Var.f;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.e;
        m72 m72Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = m72Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && m72Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return m72Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        m72 m72Var = this.f;
        switch (i) {
            case 0:
                zc3 zc3Var = m72Var.e;
                ad3[] ad3VarArr = new ad3[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    ad3VarArr[i2] = new bd3(0);
                }
                return new u72(zc3Var, ad3VarArr);
            default:
                zc3 zc3Var2 = m72Var.e;
                ad3[] ad3VarArr2 = new ad3[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    ad3VarArr2[i3] = new bd3(1);
                }
                return new u72(zc3Var2, ad3VarArr2);
        }
    }
}
