package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ux2 implements Set, t81 {
    public final hy2 e;
    public final /* synthetic */ int f;

    public ux2(hy2 hy2Var, int i) {
        this.f = i;
        this.e = hy2Var;
    }

    private final boolean a(Collection collection) {
        m72 m72Var;
        int i;
        nx2 nx2VarH;
        boolean zD;
        Set setN0 = zy.N0(collection);
        hy2 hy2Var = this.e;
        boolean z = false;
        do {
            synchronized (ym3.d0) {
                gy2 gy2Var = (gy2) tx2.f(hy2Var.e);
                m72Var = gy2Var.c;
                i = gy2Var.d;
            }
            m72Var.getClass();
            o72 o72VarB = m72Var.b();
            Iterator it = hy2Var.f.iterator();
            while (((w03) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((w03) it).next();
                if (!setN0.contains(entry.getKey())) {
                    o72VarB.remove(entry.getKey());
                    z = true;
                }
            }
            m72 m72VarB = o72VarB.b();
            if (o51.f(m72VarB, m72Var)) {
                break;
            }
            gy2 gy2Var2 = hy2Var.e;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zD = hy2.d((gy2) tx2.w(gy2Var2, hy2Var, nx2VarH), i, m72VarB);
            }
            tx2.l(nx2VarH, hy2Var);
        } while (!zD);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                ym3.O();
                throw null;
            case 1:
                ym3.O();
                throw null;
            default:
                ym3.O();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f) {
            case 0:
                ym3.O();
                throw null;
            case 1:
                ym3.O();
                throw null;
            default:
                ym3.O();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f;
        hy2 hy2Var = this.e;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof p81) && !(obj instanceof r81))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return o51.f(hy2Var.get(entry.getKey()), entry.getValue());
            case 1:
                return hy2Var.containsKey(obj);
            default:
                return hy2Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f;
        hy2 hy2Var = this.e;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!hy2Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!hy2Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f;
        hy2 hy2Var = this.e;
        switch (i) {
            case 0:
                return new w03(hy2Var, ((f11) hy2Var.e().c.entrySet()).iterator(), 0);
            case 1:
                return new w03(hy2Var, ((f11) hy2Var.e().c.entrySet()).iterator(), 1);
            default:
                return new w03(hy2Var, ((f11) hy2Var.e().c.entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f
            r1 = 0
            r2 = 1
            hy2 r5 = r5.e
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            ux2 r0 = r5.f
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            w03 r3 = (defpackage.w03) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            w03 r3 = (defpackage.w03) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = defpackage.o51.f(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof defpackage.p81
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof defpackage.r81
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux2.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        m72 m72Var;
        int i;
        nx2 nx2VarH;
        boolean zD;
        boolean z = false;
        switch (this.f) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.e.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.e.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setN0 = zy.N0(collection);
                hy2 hy2Var = this.e;
                do {
                    synchronized (ym3.d0) {
                        gy2 gy2Var = (gy2) tx2.f(hy2Var.e);
                        m72Var = gy2Var.c;
                        i = gy2Var.d;
                    }
                    m72Var.getClass();
                    o72 o72VarB = m72Var.b();
                    Iterator it3 = hy2Var.f.iterator();
                    while (((w03) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((w03) it3).next();
                        if (setN0.contains(entry.getValue())) {
                            o72VarB.remove(entry.getKey());
                            z = true;
                        }
                    }
                    m72 m72VarB = o72VarB.b();
                    if (!o51.f(m72VarB, m72Var)) {
                        gy2 gy2Var2 = hy2Var.e;
                        synchronized (tx2.c) {
                            nx2VarH = tx2.h();
                            zD = hy2.d((gy2) tx2.w(gy2Var2, hy2Var, nx2VarH), i, m72VarB);
                        }
                        tx2.l(nx2VarH, hy2Var);
                    }
                    return z;
                } while (!zD);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        m72 m72Var;
        int i;
        nx2 nx2VarH;
        boolean zD;
        m72 m72Var2;
        int i2;
        nx2 nx2VarH2;
        boolean zD2;
        boolean z = false;
        switch (this.f) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM = jq1.M(az.Y(collection2, 10));
                if (iM < 16) {
                    iM = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                hy2 hy2Var = this.e;
                do {
                    synchronized (ym3.d0) {
                        gy2 gy2Var = (gy2) tx2.f(hy2Var.e);
                        m72Var = gy2Var.c;
                        i = gy2Var.d;
                    }
                    m72Var.getClass();
                    o72 o72VarB = m72Var.b();
                    Iterator it = hy2Var.f.iterator();
                    while (((w03) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((w03) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !o51.f(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            o72VarB.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    m72 m72VarB = o72VarB.b();
                    if (!o51.f(m72VarB, m72Var)) {
                        gy2 gy2Var2 = hy2Var.e;
                        synchronized (tx2.c) {
                            nx2VarH = tx2.h();
                            zD = hy2.d((gy2) tx2.w(gy2Var2, hy2Var, nx2VarH), i, m72VarB);
                        }
                        tx2.l(nx2VarH, hy2Var);
                    }
                    return z;
                } while (!zD);
                return z;
            case 1:
                return a(collection);
            default:
                Set setN0 = zy.N0(collection);
                hy2 hy2Var2 = this.e;
                do {
                    synchronized (ym3.d0) {
                        gy2 gy2Var3 = (gy2) tx2.f(hy2Var2.e);
                        m72Var2 = gy2Var3.c;
                        i2 = gy2Var3.d;
                    }
                    m72Var2.getClass();
                    o72 o72VarB2 = m72Var2.b();
                    Iterator it2 = hy2Var2.f.iterator();
                    while (((w03) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((w03) it2).next();
                        if (!setN0.contains(entry3.getValue())) {
                            o72VarB2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    m72 m72VarB2 = o72VarB2.b();
                    if (!o51.f(m72VarB2, m72Var2)) {
                        gy2 gy2Var4 = hy2Var2.e;
                        synchronized (tx2.c) {
                            nx2VarH2 = tx2.h();
                            zD2 = hy2.d((gy2) tx2.w(gy2Var4, hy2Var2, nx2VarH2), i2, m72VarB2);
                        }
                        tx2.l(nx2VarH2, hy2Var2);
                    }
                    return z;
                } while (!zD2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return sb.f0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return sb.g0(this, objArr);
    }
}
