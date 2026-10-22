package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hy2 implements x03, Map, s81 {
    public gy2 e;
    public final ux2 f;
    public final ux2 g;
    public final ux2 h;

    public hy2() {
        m72 m72Var = m72.g;
        nx2 nx2VarH = tx2.h();
        gy2 gy2Var = new gy2(nx2VarH.g(), m72Var);
        if (!(nx2VarH instanceof cw0)) {
            gy2Var.b = new gy2(1L, m72Var);
        }
        this.e = gy2Var;
        this.f = new ux2(this, 0);
        this.g = new ux2(this, 1);
        this.h = new ux2(this, 2);
    }

    public static boolean d(gy2 gy2Var, int i, m72 m72Var) {
        boolean z;
        synchronized (ym3.d0) {
            int i2 = gy2Var.d;
            if (i2 == i) {
                gy2Var.c = m72Var;
                z = true;
                gy2Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.e;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        this.e = (gy2) z03Var;
    }

    @Override // java.util.Map
    public final void clear() {
        nx2 nx2VarH;
        m72 m72Var = ((gy2) tx2.f(this.e)).c;
        m72 m72Var2 = m72.g;
        if (m72Var2 != m72Var) {
            gy2 gy2Var = this.e;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                gy2 gy2Var2 = (gy2) tx2.w(gy2Var, this, nx2VarH);
                synchronized (ym3.d0) {
                    gy2Var2.c = m72Var2;
                    gy2Var2.d++;
                }
            }
            tx2.l(nx2VarH, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    public final gy2 e() {
        return (gy2) tx2.s(this.e, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.g;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m72 m72Var;
        int i;
        Object objPut;
        nx2 nx2VarH;
        boolean zD;
        do {
            synchronized (ym3.d0) {
                gy2 gy2Var = (gy2) tx2.f(this.e);
                m72Var = gy2Var.c;
                i = gy2Var.d;
            }
            m72Var.getClass();
            o72 o72VarB = m72Var.b();
            objPut = o72VarB.put(obj, obj2);
            m72 m72VarB = o72VarB.b();
            if (o51.f(m72VarB, m72Var)) {
                break;
            }
            gy2 gy2Var2 = this.e;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zD = d((gy2) tx2.w(gy2Var2, this, nx2VarH), i, m72VarB);
            }
            tx2.l(nx2VarH, this);
        } while (!zD);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m72 m72Var;
        int i;
        nx2 nx2VarH;
        boolean zD;
        do {
            synchronized (ym3.d0) {
                gy2 gy2Var = (gy2) tx2.f(this.e);
                m72Var = gy2Var.c;
                i = gy2Var.d;
            }
            m72Var.getClass();
            o72 o72VarB = m72Var.b();
            o72VarB.putAll(map);
            m72 m72VarB = o72VarB.b();
            if (o51.f(m72VarB, m72Var)) {
                return;
            }
            gy2 gy2Var2 = this.e;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zD = d((gy2) tx2.w(gy2Var2, this, nx2VarH), i, m72VarB);
            }
            tx2.l(nx2VarH, this);
        } while (!zD);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m72 m72Var;
        int i;
        V vRemove;
        nx2 nx2VarH;
        boolean zD;
        do {
            synchronized (ym3.d0) {
                gy2 gy2Var = (gy2) tx2.f(this.e);
                m72Var = gy2Var.c;
                i = gy2Var.d;
            }
            m72Var.getClass();
            o72 o72VarB = m72Var.b();
            vRemove = o72VarB.remove(obj);
            m72 m72VarB = o72VarB.b();
            if (o51.f(m72VarB, m72Var)) {
                break;
            }
            gy2 gy2Var2 = this.e;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zD = d((gy2) tx2.w(gy2Var2, this, nx2VarH), i, m72VarB);
            }
            tx2.l(nx2VarH, this);
        } while (!zD);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        m72 m72Var = e().c;
        m72Var.getClass();
        return m72Var.f;
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((gy2) tx2.f(this.e)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.h;
    }
}
