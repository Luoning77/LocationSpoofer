package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class o72 extends k0 implements Map, s81 {
    public m72 e;
    public k91 f = new k91(9);
    public zc3 g;
    public Object h;
    public int i;
    public int j;

    public o72(m72 m72Var) {
        this.e = m72Var;
        this.g = m72Var.e;
        this.j = m72Var.f;
    }

    /* JADX INFO: renamed from: a */
    public m72 b() {
        zc3 zc3Var = this.g;
        m72 m72Var = this.e;
        if (zc3Var != m72Var.e) {
            this.f = new k91(9);
            m72Var = new m72(this.g, size());
        }
        this.e = m72Var;
        return m72Var;
    }

    public /* bridge */ m72 b() {
        return b();
    }

    public final void c(int i) {
        this.j = i;
        this.i++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g = zc3.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.g.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.g.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.k0
    public final Set getEntries() {
        return new q72(0, this);
    }

    @Override // defpackage.k0
    public final Set getKeys() {
        return new q72(1, this);
    }

    @Override // defpackage.k0
    public final int getSize() {
        return this.j;
    }

    @Override // defpackage.k0
    public final Collection getValues() {
        return new s72(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.h = null;
        this.g = this.g.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m72 m72VarB = null;
        m72 m72Var = map instanceof m72 ? (m72) map : null;
        if (m72Var == null) {
            o72 o72Var = map instanceof o72 ? (o72) map : null;
            if (o72Var != null) {
                m72VarB = o72Var.b();
            }
        } else {
            m72VarB = m72Var;
        }
        if (m72VarB == null) {
            super.putAll(map);
            return;
        }
        wb0 wb0Var = new wb0();
        wb0Var.a = 0;
        int size = size();
        this.g = this.g.m(m72VarB.e, 0, wb0Var, this);
        int i = (m72VarB.f + size) - wb0Var.a;
        if (size != i) {
            c(i);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        zc3 zc3VarO = this.g.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (zc3VarO == null) {
            zc3VarO = zc3.e;
        }
        this.g = zc3VarO;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.h = null;
        zc3 zc3VarN = this.g.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (zc3VarN == null) {
            zc3VarN = zc3.e;
        }
        this.g = zc3VarN;
        return this.h;
    }
}
