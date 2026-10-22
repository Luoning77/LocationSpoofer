package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ke2 extends o30 {
    public final sg a;
    public final gn b;
    public final Object c;
    public Job d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public ay1 h;
    public final gy1 i;
    public final ArrayList j;
    public final ArrayList k;
    public final zx1 l;
    public final d31 m;
    public final zx1 n;
    public final zx1 o;
    public ArrayList p;
    public ay1 q;
    public CancellableContinuationImpl r;
    public final MutableStateFlow s;
    public boolean t;
    public final MutableStateFlow u;
    public final gn v;
    public final CompletableJob w;
    public final y70 x;
    public final k91 y;
    public static final MutableStateFlow z = StateFlowKt.MutableStateFlow(w72.h);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public ke2(y70 y70Var) {
        sg sgVar = new sg(new fe2(this, 0));
        this.a = sgVar;
        fe2 fe2Var = new fe2(this, 1);
        gn gnVar = new gn();
        gnVar.a = new gp(0);
        gnVar.b = new xp(0);
        gnVar.c = new m5(27, gnVar, fe2Var);
        this.b = gnVar;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new ay1();
        this.i = new gy1(new t30[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new zx1();
        this.m = new d31(26);
        this.n = new zx1();
        this.o = new zx1();
        this.s = StateFlowKt.MutableStateFlow(null);
        this.u = StateFlowKt.MutableStateFlow(ie2.g);
        this.v = new gn(15);
        CompletableJob completableJobJob = JobKt.Job((Job) y70Var.get(Job.Key));
        completableJobJob.invokeOnCompletion(new ge2(this, 0));
        this.w = completableJobJob;
        this.x = y70Var.plus(sgVar).plus(completableJobJob);
        this.y = new k91(25);
    }

    public static final void G(ArrayList arrayList, ke2 ke2Var, t30 t30Var) {
        arrayList.clear();
        synchronized (ke2Var.c) {
            Iterator it = ke2Var.k.iterator();
            if (it.hasNext()) {
                ((fw1) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(dy1 dy1Var) {
        try {
            if (dy1Var.w() instanceof ox2) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            dy1Var.c();
        } catch (Throwable th) {
            dy1Var.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.g != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((gp) ((xp) this.b.b).c).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.g != 0 || z() || B();
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? uj0.e : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        CancellableContinuation cancellableContinuationY;
        synchronized (this.c) {
            cancellableContinuationY = y();
            if (((ie2) this.u.getValue()).compareTo(ie2.f) <= 0) {
                throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (cancellableContinuationY != null) {
            cancellableContinuationY.resumeWith(mf3.a);
        }
    }

    public final void F(t30 t30Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((fw1) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, ay1 ay1Var) {
        dy1 dy1VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((fw1) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            t30 t30Var = (t30) entry.getKey();
            List list2 = (List) entry.getValue();
            if (t30Var.z.F) {
                j30.a("Check failed");
            }
            t tVar = new t(t30Var, 29);
            jl1 jl1Var = new jl1(11, t30Var, ay1Var);
            nx2 nx2VarH = tx2.h();
            dy1 dy1Var = nx2VarH instanceof dy1 ? (dy1) nx2VarH : null;
            if (dy1Var == null || (dy1VarC = dy1Var.C(tVar, jl1Var)) == null) {
                fo.n("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                nx2 nx2VarJ = dy1VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                fw1 fw1Var = (fw1) list2.get(i2);
                                zx1 zx1Var = this.l;
                                fw1Var.getClass();
                                Object objA = ax1.a(zx1Var);
                                arrayList.add(new i52(fw1Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                i52 i52Var = (i52) arrayList.get(i3);
                                if (i52Var.f == null) {
                                    d31 d31Var = this.m;
                                    ((fw1) i52Var.e).getClass();
                                    if (((zx1) d31Var.f).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            i52 i52Var2 = (i52) arrayList.get(i4);
                                            if (i52Var2.f == null) {
                                                d31 d31Var2 = this.m;
                                                ((fw1) i52Var2.e).getClass();
                                                zx1 zx1Var2 = (zx1) d31Var2.f;
                                                if (zx1Var2.i()) {
                                                    ((zx1) d31Var2.g).a();
                                                }
                                            }
                                            arrayList3.add(i52Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((i52) arrayList.get(i5)).f != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((i52) arrayList.get(i6)).f == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        i52 i52Var3 = (i52) arrayList.get(i7);
                                        if (i52Var3.f == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        fz.b0(this.k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((i52) obj2).f != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    t30Var.r(arrayList);
                    nx2.q(nx2VarJ);
                    w(dy1VarC);
                } catch (Throwable th2) {
                    nx2.q(nx2VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(dy1VarC);
                throw th3;
            }
        }
        return zy.J0(map.keySet());
    }

    public final t30 I(t30 t30Var, ay1 ay1Var) {
        dy1 dy1VarC;
        if (t30Var.z.F || t30Var.A == 3) {
            return null;
        }
        ay1 ay1Var2 = this.q;
        if (ay1Var2 == null || !ay1Var2.c(t30Var)) {
            t tVar = new t(t30Var, 29);
            jl1 jl1Var = new jl1(11, t30Var, ay1Var);
            nx2 nx2VarH = tx2.h();
            dy1 dy1Var = nx2VarH instanceof dy1 ? (dy1) nx2VarH : null;
            if (dy1Var == null || (dy1VarC = dy1Var.C(tVar, jl1Var)) == null) {
                fo.n("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    nx2 nx2VarJ = dy1VarC.j();
                    if (ay1Var != null) {
                        try {
                            if (ay1Var.h()) {
                                m5 m5Var = new m5(28, ay1Var, t30Var);
                                ov0 ov0Var = t30Var.z;
                                if (ov0Var.F) {
                                    j30.a("Preparing a composition while composing is not supported");
                                }
                                ov0Var.F = true;
                                try {
                                    m5Var.invoke();
                                    ov0Var.F = false;
                                } catch (Throwable th) {
                                    ov0Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            nx2.q(nx2VarJ);
                            throw th2;
                        }
                    }
                    boolean zW = t30Var.w();
                    nx2.q(nx2VarJ);
                    w(dy1VarC);
                    if (zW) {
                        return t30Var;
                    }
                } catch (Throwable th3) {
                    w(dy1VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, t30 t30Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof n20)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                he2 he2Var = (he2) this.s.getValue();
                if (he2Var != null) {
                    throw he2Var.a;
                }
                this.s.setValue(new he2(th));
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new ay1();
                this.k.clear();
                this.l.a();
                this.n.a();
                this.s.setValue(new he2(th));
                if (t30Var != null) {
                    L(t30Var);
                }
                if (y() != null) {
                    j30.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            jn2 jn2Var = new jn2(this.h);
            this.h = new ay1();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((t30) listD.get(i)).x(jn2Var);
                    if (((ie2) this.u.getValue()).compareTo(ie2.f) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    ay1 ay1Var = this.h;
                    int i2 = ay1Var.d;
                    Iterator<E> it = jn2Var.iterator();
                    while (it.hasNext()) {
                        ay1Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(t30 t30Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(t30Var)) {
            arrayList.add(t30Var);
        }
        if (this.f.remove(t30Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.o30
    public final void a(t30 t30Var, pu0 pu0Var) throws Throwable {
        ie2 ie2Var;
        boolean zContains;
        dy1 dy1VarC;
        boolean z2 = t30Var.z.F;
        synchronized (this.c) {
            ie2 ie2Var2 = (ie2) this.u.getValue();
            ie2Var = ie2.f;
            zContains = ie2Var2.compareTo(ie2Var) > 0 ? true ^ D().contains(t30Var) : true;
        }
        try {
            t tVar = new t(t30Var, 29);
            jl1 jl1Var = new jl1(11, t30Var, null);
            nx2 nx2VarH = tx2.h();
            dy1 dy1Var = nx2VarH instanceof dy1 ? (dy1) nx2VarH : null;
            if (dy1Var == null || (dy1VarC = dy1Var.C(tVar, jl1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                nx2 nx2VarJ = dy1VarC.j();
                try {
                    t30Var.j(pu0Var);
                    nx2.q(nx2VarJ);
                    w(dy1VarC);
                    synchronized (this.c) {
                        if (((ie2) this.u.getValue()).compareTo(ie2Var) > 0 && !D().contains(t30Var)) {
                            this.f.add(t30Var);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        tx2.h().m();
                    }
                    try {
                        F(t30Var);
                        try {
                            t30Var.d();
                            t30Var.f();
                            if (z2) {
                                return;
                            }
                            tx2.h().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, t30Var);
                    }
                } catch (Throwable th3) {
                    nx2.q(nx2VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(dy1VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th5, t30Var);
        }
    }

    @Override // defpackage.o30
    public final ay1 b(t30 t30Var, pv2 pv2Var, pu0 pu0Var) {
        gn gnVar = this.v;
        try {
            pv2 pv2Var2 = t30Var.t;
            t30Var.t = pv2Var;
            try {
                a(t30Var, pu0Var);
                ay1 ay1Var = (ay1) gnVar.h();
                if (ay1Var == null) {
                    ay1Var = in2.a;
                    ay1Var.getClass();
                }
                t30Var.t = pv2Var2;
                gnVar.B(null);
                return ay1Var;
            } catch (Throwable th) {
                t30Var.t = pv2Var2;
                throw th;
            }
        } catch (Throwable th2) {
            gnVar.B(null);
            throw th2;
        }
    }

    @Override // defpackage.o30
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.o30
    public final boolean e() {
        return false;
    }

    @Override // defpackage.o30
    public final boolean f() {
        return false;
    }

    @Override // defpackage.o30
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.o30
    public final n30 h() {
        return null;
    }

    @Override // defpackage.o30
    public final y70 j() {
        return this.x;
    }

    @Override // defpackage.o30
    public final boolean k() {
        return false;
    }

    @Override // defpackage.o30
    public final void l(t30 t30Var) {
        CancellableContinuation cancellableContinuationY;
        synchronized (this.c) {
            if (this.i.h(t30Var)) {
                cancellableContinuationY = null;
            } else {
                this.i.b(t30Var);
                cancellableContinuationY = y();
            }
        }
        if (cancellableContinuationY != null) {
            cancellableContinuationY.resumeWith(mf3.a);
        }
    }

    @Override // defpackage.o30
    public final ew1 m(fw1 fw1Var) {
        ew1 ew1Var;
        synchronized (this.c) {
            ew1Var = (ew1) this.n.k(fw1Var);
        }
        return ew1Var;
    }

    @Override // defpackage.o30
    public final ay1 n(t30 t30Var, pv2 pv2Var, ay1 ay1Var) {
        gn gnVar = this.v;
        try {
            K();
            t30Var.x(new jn2(ay1Var));
            pv2 pv2Var2 = t30Var.t;
            t30Var.t = pv2Var;
            try {
                t30 t30VarI = I(t30Var, null);
                if (t30VarI != null) {
                    F(t30Var);
                    t30VarI.d();
                    t30VarI.f();
                }
                ay1 ay1Var2 = (ay1) gnVar.h();
                if (ay1Var2 == null) {
                    ay1Var2 = in2.a;
                    ay1Var2.getClass();
                }
                t30Var.t = pv2Var2;
                gnVar.B(null);
                return ay1Var2;
            } catch (Throwable th) {
                t30Var.t = pv2Var2;
                throw th;
            }
        } catch (Throwable th2) {
            gnVar.B(null);
            throw th2;
        }
    }

    @Override // defpackage.o30
    public final void q(ee2 ee2Var) {
        gn gnVar = this.v;
        ay1 ay1Var = (ay1) gnVar.h();
        if (ay1Var == null) {
            ay1 ay1Var2 = in2.a;
            ay1Var = new ay1();
            gnVar.B(ay1Var);
        }
        ay1Var.a(ee2Var);
    }

    @Override // defpackage.o30
    public final void r(t30 t30Var) {
        synchronized (this.c) {
            try {
                ay1 ay1Var = this.q;
                if (ay1Var == null) {
                    ay1 ay1Var2 = in2.a;
                    ay1Var = new ay1();
                    this.q = ay1Var;
                }
                ay1Var.a(t30Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o30
    public final tv s(ye yeVar) {
        gn gnVar = this.b;
        xp xpVar = (xp) gnVar.b;
        nz1 nz1Var = new nz1();
        nz1Var.a = yeVar;
        return xpVar.d(nz1Var, (m5) gnVar.c);
    }

    @Override // defpackage.o30
    public final void v(t30 t30Var) {
        synchronized (this.c) {
            if (this.f.remove(t30Var)) {
                this.g = null;
            }
            this.i.j(t30Var);
            this.j.remove(t30Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((ie2) this.u.getValue()).compareTo(ie2.i) >= 0) {
                this.u.setValue(ie2.f);
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.w, (CancellationException) null, 1, (Object) null);
    }

    public final CancellableContinuation y() {
        MutableStateFlow mutableStateFlow = this.u;
        int iCompareTo = ((ie2) mutableStateFlow.getValue()).compareTo(ie2.f);
        MutableStateFlow mutableStateFlow2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        gy1 gy1Var = this.i;
        if (iCompareTo > 0) {
            Object value = mutableStateFlow2.getValue();
            ie2 ie2Var = ie2.j;
            ie2 ie2Var2 = ie2.g;
            if (value == null) {
                if (this.d == null) {
                    this.h = new ay1();
                    gy1Var.g();
                    if (z() || B()) {
                        ie2Var2 = ie2.h;
                    }
                } else {
                    ie2Var2 = (gy1Var.g != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? ie2Var : ie2.i;
                }
            }
            mutableStateFlow.setValue(ie2Var2);
            if (ie2Var2 != ie2Var) {
                return null;
            }
            CancellableContinuationImpl cancellableContinuationImpl = this.r;
            this.r = null;
            return cancellableContinuationImpl;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = uj0.e;
        this.h = new ay1();
        gy1Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        CancellableContinuationImpl cancellableContinuationImpl2 = this.r;
        if (cancellableContinuationImpl2 != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl2, null, 1, null);
        }
        this.r = null;
        mutableStateFlow2.setValue(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((gp) ((xp) this.a.g).c).get() & 134217727) > 0;
    }

    @Override // defpackage.o30
    public final void o(Set set) {
    }
}
