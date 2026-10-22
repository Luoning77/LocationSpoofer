package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s72 extends i0 implements p81 {
    public final o72 e;

    public s72(o72 o72Var) {
        this.e = o72Var;
    }

    @Override // defpackage.i0
    public final int a() {
        return this.e.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ad3[] ad3VarArr = new ad3[8];
        for (int i = 0; i < 8; i++) {
            ad3VarArr[i] = new bd3(2);
        }
        return new r72(this.e, ad3VarArr);
    }
}
