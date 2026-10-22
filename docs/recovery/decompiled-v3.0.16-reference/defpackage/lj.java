package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.b;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lj {
    public ArrayList a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public lj() {
        gy1 gy1Var = new gy1(new sv0[16]);
        this.d = gy1Var;
        ay1 ay1Var = in2.a;
        this.e = new ay1();
        this.f = gy1Var;
        this.g = new gy1(new Object[16]);
        this.h = new gy1(new au0[16]);
    }

    public static final boolean g(sv0 sv0Var, gy1 gy1Var) {
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            mf2 mf2Var = ((sv0) objArr[i2]).a;
            if (mf2Var instanceof h72) {
                gy1 gy1Var2 = ((h72) mf2Var).f;
                if (gy1Var2.j(sv0Var) || g(sv0Var, gy1Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void i(ij ijVar) {
        Logger.w("Mbgl-AnnotationManager", String.format("Attempting to update non-added %s with value %s", ijVar.getClass().getCanonicalName(), ijVar));
    }

    public void a() {
        this.b = null;
        this.c = null;
        gy1 gy1Var = (gy1) this.d;
        gy1Var.g();
        ((ay1) this.e).b();
        this.f = gy1Var;
        ((gy1) this.g).g();
        ((gy1) this.h).g();
        this.i = null;
        this.j = null;
        this.a = null;
    }

    public void b() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Marker marker = (Marker) obj;
            if (marker != null && marker.k) {
                j21 j21Var = marker.j;
                if (j21Var != null) {
                    j21Var.a();
                }
                marker.k = false;
            }
        }
        arrayList.clear();
    }

    public void c() {
        Set set = (Set) this.b;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                mf2 mf2Var = (mf2) it.next();
                it.remove();
                mf2Var.b();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void d() {
        gy1 gy1Var = (gy1) this.d;
        gy1 gy1Var2 = (gy1) this.g;
        Set set = (Set) this.b;
        if (set == null) {
            return;
        }
        this.k = null;
        int i = 10;
        if (gy1Var2.g != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                ay1 ay1Var = (ay1) this.i;
                int i2 = gy1Var2.g;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = gy1Var2.e[i2];
                    try {
                        if (obj instanceof sv0) {
                            mf2 mf2Var = ((sv0) obj).a;
                            set.remove(mf2Var);
                            mf2Var.c();
                        }
                        if (obj instanceof k20) {
                            if (ay1Var == null || !ay1Var.c(obj)) {
                                ((k20) obj).h();
                            } else {
                                ((k20) obj).f();
                            }
                        }
                    } catch (Throwable th) {
                        r30 r30Var = (r30) this.c;
                        if (r30Var != null) {
                            o51.H(th, new m5(i, r30Var, obj));
                        }
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (gy1Var.g != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.b;
                if (set2 != null) {
                    Object[] objArr = gy1Var.e;
                    int i3 = gy1Var.g;
                    for (int i4 = 0; i4 < i3; i4++) {
                        sv0 sv0Var = (sv0) objArr[i4];
                        mf2 mf2Var2 = sv0Var.a;
                        set2.remove(mf2Var2);
                        try {
                            mf2Var2.a();
                        } catch (Throwable th3) {
                            r30 r30Var2 = (r30) this.c;
                            if (r30Var2 != null) {
                                o51.H(th3, new m5(i, r30Var2, sv0Var));
                            }
                            throw th3;
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public void e() {
        gy1 gy1Var = (gy1) this.h;
        if (gy1Var.g != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = gy1Var.e;
                int i = gy1Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    ((au0) objArr[i2]).invoke();
                }
                gy1Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void f(sv0 sv0Var) {
        gy1 gy1Var = (gy1) this.d;
        if (!((ay1) this.e).c(sv0Var)) {
            ay1 ay1Var = (ay1) this.k;
            if (ay1Var == null || !ay1Var.c(sv0Var)) {
                ((gy1) this.g).b(sv0Var);
                return;
            }
            return;
        }
        ((ay1) this.e).l(sv0Var);
        if (!((gy1) this.f).j(sv0Var) && !gy1Var.j(sv0Var)) {
            g(sv0Var, gy1Var);
        }
        Set set = (Set) this.b;
        if (set == null) {
            return;
        }
        set.add(sv0Var.a);
    }

    public boolean h(ij ijVar) {
        long j = ijVar.e;
        return j != -1 && ((zj1) this.e).d(j) > -1;
    }

    public void j(Set set, r30 r30Var) {
        a();
        this.b = set;
        this.c = r30Var;
    }

    public lj(k kVar, zj1 zj1Var, b bVar, jj jjVar, gn gnVar, jj jjVar2, jj jjVar3, jj jjVar4) {
        this.d = new nx0(1);
        this.a = new ArrayList();
        this.b = kVar;
        this.e = zj1Var;
        this.c = bVar;
        this.g = jjVar;
        this.i = gnVar;
        this.j = jjVar2;
        this.k = jjVar3;
        this.h = jjVar4;
    }
}
