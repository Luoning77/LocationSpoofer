package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v72 extends u {
    public final m72 e;

    public v72(m72 m72Var) {
        this.e = m72Var;
    }

    @Override // defpackage.u
    public final int a() {
        return this.e.f;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zc3 zc3Var = this.e.e;
        ad3[] ad3VarArr = new ad3[8];
        for (int i = 0; i < 8; i++) {
            ad3VarArr[i] = new bd3(2);
        }
        return new u72(zc3Var, ad3VarArr);
    }
}
