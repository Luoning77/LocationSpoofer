package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w72 extends x0 implements f11, Collection, p81 {
    public static final w72 h;
    public final Object e;
    public final Object f;
    public final m72 g;

    static {
        j9 j9Var = j9.K;
        h = new w72(j9Var, j9Var, m72.g);
    }

    public w72(Object obj, Object obj2, m72 m72Var) {
        this.e = obj;
        this.f = obj2;
        this.g = m72Var;
    }

    @Override // defpackage.u
    public final int a() {
        return this.g.f;
    }

    @Override // defpackage.u, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vv0(this.e, this.g);
    }
}
