package defpackage;

import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class gs0 {
    public ArrayDeque A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public ks0 H;
    public final ab I;
    public boolean b;
    public x12 f;
    public final ArrayList m;
    public final CopyOnWriteArrayList n;
    public final yr0 o;
    public final yr0 p;
    public final yr0 q;
    public final yr0 r;
    public final bs0 s;
    public int t;
    public a u;
    public a v;
    public final cs0 w;
    public e8 x;
    public e8 y;
    public e8 z;
    public final ArrayList a = new ArrayList();
    public final mn2 c = new mn2(3);
    public ArrayList d = new ArrayList();
    public final xr0 e = new xr0(this);
    public cq g = null;
    public boolean h = false;
    public final as0 i = new as0(this);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [yr0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [yr0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [yr0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [yr0] */
    public gs0() {
        Collections.synchronizedMap(new HashMap());
        this.m = new ArrayList();
        new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        final int i = 0;
        this.o = new r50(this) { // from class: yr0
            public final /* synthetic */ gs0 b;

            {
                this.b = this;
            }

            @Override // defpackage.r50
            public final void accept(Object obj) {
                int i2 = i;
                gs0 gs0Var = this.b;
                switch (i2) {
                    case 0:
                        Iterator it = gs0Var.c.k().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = gs0Var.c.k().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    b81.u();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        boolean z = ((cx1) obj).a;
                        Iterator it3 = gs0Var.c.k().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((e82) obj).a;
                        Iterator it4 = gs0Var.c.k().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.p = new r50(this) { // from class: yr0
            public final /* synthetic */ gs0 b;

            {
                this.b = this;
            }

            @Override // defpackage.r50
            public final void accept(Object obj) {
                int i3 = i2;
                gs0 gs0Var = this.b;
                switch (i3) {
                    case 0:
                        Iterator it = gs0Var.c.k().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = gs0Var.c.k().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    b81.u();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        boolean z = ((cx1) obj).a;
                        Iterator it3 = gs0Var.c.k().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((e82) obj).a;
                        Iterator it4 = gs0Var.c.k().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.q = new r50(this) { // from class: yr0
            public final /* synthetic */ gs0 b;

            {
                this.b = this;
            }

            @Override // defpackage.r50
            public final void accept(Object obj) {
                int i4 = i3;
                gs0 gs0Var = this.b;
                switch (i4) {
                    case 0:
                        Iterator it = gs0Var.c.k().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = gs0Var.c.k().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    b81.u();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        boolean z = ((cx1) obj).a;
                        Iterator it3 = gs0Var.c.k().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((e82) obj).a;
                        Iterator it4 = gs0Var.c.k().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.r = new r50(this) { // from class: yr0
            public final /* synthetic */ gs0 b;

            {
                this.b = this;
            }

            @Override // defpackage.r50
            public final void accept(Object obj) {
                int i5 = i4;
                gs0 gs0Var = this.b;
                switch (i5) {
                    case 0:
                        Iterator it = gs0Var.c.k().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = gs0Var.c.k().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    b81.u();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        boolean z = ((cx1) obj).a;
                        Iterator it3 = gs0Var.c.k().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((e82) obj).a;
                        Iterator it4 = gs0Var.c.k().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                b81.u();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.s = new bs0(this);
        this.t = -1;
        this.w = new cs0(this);
        this.A = new ArrayDeque();
        this.I = new ab(this, 4);
    }

    public static HashSet c(ArrayList arrayList, int i, int i2) {
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((cq) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ((ms0) obj).getClass();
            }
            i++;
        }
        return hashSet;
    }

    public static HashSet k(cq cqVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < cqVar.a.size(); i++) {
            ((ms0) cqVar.a.get(i)).getClass();
        }
        return hashSet;
    }

    public static boolean l(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final void a() {
        this.b = false;
        this.F.clear();
        this.E.clear();
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.j().iterator();
        if (!it.hasNext()) {
            return hashSet;
        }
        p91.x(it.next());
        throw null;
    }

    public final void d(int i) {
        try {
            this.b = true;
            Iterator it = ((HashMap) this.c.f).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
            m(i, false);
            Iterator it2 = b().iterator();
            if (it2.hasNext()) {
                ((bz2) it2.next()).a();
                throw null;
            }
            this.b = false;
            h(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void e() {
        Iterator it = b().iterator();
        if (it.hasNext()) {
            ((bz2) it.next()).a();
            throw null;
        }
    }

    public final void f(es0 es0Var) {
        if (this.u == null) {
            if (this.D) {
                fo.n("FragmentManager has been destroyed");
                return;
            } else {
                fo.n("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (this.B || this.C) {
            fo.n("Can not perform this action after onSaveInstanceState");
            return;
        }
        synchronized (this.a) {
            try {
                if (this.u == null) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.a.add(es0Var);
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(boolean z) {
        if (this.b) {
            fo.n("FragmentManager is already executing transactions");
            return;
        }
        if (this.u == null) {
            if (this.D) {
                fo.n("FragmentManager has been destroyed");
                return;
            } else {
                fo.n("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.u.f.getLooper()) {
            fo.n("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.B || this.C)) {
            fo.n("Can not perform this action after onSaveInstanceState");
        } else if (this.E == null) {
            this.E = new ArrayList();
            this.F = new ArrayList();
        }
    }

    public final boolean h(boolean z) {
        boolean zA;
        ArrayList arrayList;
        cq cqVar;
        g(z);
        if (!this.h && (cqVar = this.g) != null) {
            cqVar.r = false;
            cqVar.c();
            if (l(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.g + " as part of execPendingActions for actions " + this.a);
            }
            this.g.d(false);
            this.a.add(0, this.g);
            ArrayList arrayList2 = this.g.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((ms0) obj).getClass();
            }
            this.g = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList3 = this.E;
            ArrayList arrayList4 = this.F;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        int i2 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i2 >= size2) {
                                break;
                            }
                            zA |= ((es0) arrayList.get(i2)).a(arrayList3, arrayList4);
                            i2++;
                            throw th;
                        }
                        arrayList.clear();
                        this.u.f.removeCallbacks(this.I);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.u.f.removeCallbacks(this.I);
                        throw th;
                    }
                }
            }
            if (!zA) {
                q();
                ((HashMap) this.c.f).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                o(this.E, this.F);
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    public final void i(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = i;
        boolean z3 = ((cq) arrayList.get(i3)).o;
        ArrayList arrayList3 = this.G;
        if (arrayList3 == null) {
            this.G = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.G.addAll(this.c.k());
        int i4 = i3;
        boolean z4 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i2) {
                boolean z5 = z3;
                this.G.clear();
                if (!z5 && this.t >= 1) {
                    for (int i6 = i3; i6 < i2; i6++) {
                        ArrayList arrayList4 = ((cq) arrayList.get(i6)).a;
                        int size = arrayList4.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList4.get(i7);
                            i7++;
                            ((ms0) obj).getClass();
                        }
                    }
                }
                for (int i8 = i3; i8 < i2; i8++) {
                    cq cqVar = (cq) arrayList.get(i8);
                    if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                        cqVar.b(-1);
                        ArrayList arrayList5 = cqVar.a;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            ms0 ms0Var = (ms0) arrayList5.get(size2);
                            ms0Var.getClass();
                            switch (ms0Var.a) {
                                case 1:
                                    throw null;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + ms0Var.a);
                                case 3:
                                    throw null;
                                case 4:
                                    throw null;
                                case Logger.WARN /* 5 */:
                                    throw null;
                                case Logger.ERROR /* 6 */:
                                    throw null;
                                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                                    throw null;
                                case 8:
                                case mc0.b /* 9 */:
                                    break;
                                case mc0.c /* 10 */:
                                    throw null;
                            }
                        }
                    } else {
                        cqVar.b(1);
                        ArrayList arrayList6 = cqVar.a;
                        int size3 = arrayList6.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            ms0 ms0Var2 = (ms0) arrayList6.get(i9);
                            ms0Var2.getClass();
                            switch (ms0Var2.a) {
                                case 1:
                                    throw null;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + ms0Var2.a);
                                case 3:
                                    throw null;
                                case 4:
                                    throw null;
                                case Logger.WARN /* 5 */:
                                    throw null;
                                case Logger.ERROR /* 6 */:
                                    throw null;
                                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                                    throw null;
                                case 8:
                                case mc0.b /* 9 */:
                                    break;
                                case mc0.c /* 10 */:
                                    throw null;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList7 = this.m;
                if (z4 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size4) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        linkedHashSet.addAll(k((cq) obj2));
                    }
                    if (this.g == null) {
                        int size5 = arrayList7.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            Object obj3 = arrayList7.get(i11);
                            i11++;
                            if (obj3 != null) {
                                b81.u();
                                return;
                            } else {
                                Iterator it = linkedHashSet.iterator();
                                if (it.hasNext()) {
                                    throw az2.g(it);
                                }
                            }
                        }
                        int size6 = arrayList7.size();
                        int i12 = 0;
                        while (i12 < size6) {
                            Object obj4 = arrayList7.get(i12);
                            i12++;
                            if (obj4 != null) {
                                b81.u();
                                return;
                            } else {
                                Iterator it2 = linkedHashSet.iterator();
                                if (it2.hasNext()) {
                                    throw az2.g(it2);
                                }
                            }
                        }
                    }
                }
                for (int i13 = i3; i13 < i2; i13++) {
                    cq cqVar2 = (cq) arrayList.get(i13);
                    if (zBooleanValue) {
                        for (int size7 = cqVar2.a.size() - 1; size7 >= 0; size7--) {
                            ((ms0) cqVar2.a.get(size7)).getClass();
                        }
                    } else {
                        ArrayList arrayList8 = cqVar2.a;
                        int size8 = arrayList8.size();
                        int i14 = 0;
                        while (i14 < size8) {
                            Object obj5 = arrayList8.get(i14);
                            i14++;
                            ((ms0) obj5).getClass();
                        }
                    }
                }
                m(this.t, true);
                Iterator it3 = c(arrayList, i3, i2).iterator();
                if (it3.hasNext()) {
                    ((bz2) it3.next()).getClass();
                    throw null;
                }
                while (i3 < i2) {
                    cq cqVar3 = (cq) arrayList.get(i3);
                    if (((Boolean) arrayList2.get(i3)).booleanValue() && cqVar3.s >= 0) {
                        cqVar3.s = -1;
                    }
                    if (cqVar3.p != null) {
                        for (int i15 = 0; i15 < cqVar3.p.size(); i15++) {
                            ((Runnable) cqVar3.p.get(i15)).run();
                        }
                        cqVar3.p = null;
                    }
                    i3++;
                }
                if (!z4 || arrayList7.size() <= 0) {
                    return;
                }
                arrayList7.get(0).getClass();
                b81.u();
                return;
            }
            cq cqVar4 = (cq) arrayList.get(i4);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i4)).booleanValue();
            ArrayList arrayList9 = this.G;
            int i16 = 3;
            if (zBooleanValue2) {
                z = z3;
                int i17 = 1;
                ArrayList arrayList10 = cqVar4.a;
                int size9 = arrayList10.size() - 1;
                while (size9 >= 0) {
                    ms0 ms0Var3 = (ms0) arrayList10.get(size9);
                    int i18 = ms0Var3.a;
                    if (i18 != i17) {
                        if (i18 != 3) {
                            switch (i18) {
                                case Logger.ERROR /* 6 */:
                                    arrayList9.add(null);
                                    break;
                                case mc0.c /* 10 */:
                                    ms0Var3.h = ms0Var3.g;
                                    break;
                            }
                        } else {
                            arrayList9.add(null);
                        }
                        size9--;
                        i17 = 1;
                    }
                    arrayList9.remove((Object) null);
                    size9--;
                    i17 = 1;
                }
            } else {
                ArrayList arrayList11 = cqVar4.a;
                int i19 = 0;
                while (i19 < arrayList11.size()) {
                    ms0 ms0Var4 = (ms0) arrayList11.get(i19);
                    int i20 = ms0Var4.a;
                    if (i20 == i5) {
                        z2 = z3;
                    } else {
                        if (i20 == 2) {
                            throw null;
                        }
                        we1 we1Var = we1.i;
                        z2 = z3;
                        if (i20 == i16 || i20 == 6) {
                            arrayList9.remove((Object) null);
                            ms0 ms0Var5 = new ms0();
                            ms0Var5.a = 9;
                            ms0Var5.b = false;
                            ms0Var5.g = we1Var;
                            ms0Var5.h = we1Var;
                            arrayList11.add(i19, ms0Var5);
                        } else {
                            if (i20 != 7) {
                                if (i20 == 8) {
                                    ms0 ms0Var6 = new ms0();
                                    ms0Var6.a = 9;
                                    ms0Var6.b = true;
                                    ms0Var6.g = we1Var;
                                    ms0Var6.h = we1Var;
                                    arrayList11.add(i19, ms0Var6);
                                    ms0Var4.b = true;
                                }
                            }
                            i19++;
                            i5 = 1;
                            z3 = z2;
                            i16 = 3;
                        }
                        i19++;
                        i19++;
                        i5 = 1;
                        z3 = z2;
                        i16 = 3;
                    }
                    arrayList9.add(null);
                    i19++;
                    i5 = 1;
                    z3 = z2;
                    i16 = 3;
                }
                z = z3;
            }
            z4 = z4 || cqVar4.g;
            i4++;
            z3 = z;
        }
    }

    public final void j() {
        mn2 mn2Var = this.c;
        ArrayList arrayList = (ArrayList) mn2Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                b81.u();
                return;
            }
        }
        Iterator it = ((HashMap) mn2Var.f).values().iterator();
        while (it.hasNext()) {
            p91.x(it.next());
        }
    }

    public final void m(int i, boolean z) {
        if (this.u == null && i != -1) {
            fo.n("No activity");
            return;
        }
        if (z || i != this.t) {
            this.t = i;
            mn2 mn2Var = this.c;
            Iterator it = ((ArrayList) mn2Var.e).iterator();
            if (it.hasNext()) {
                throw az2.g(it);
            }
            Iterator it2 = ((HashMap) mn2Var.f).values().iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    b81.u();
                    return;
                }
            }
            Iterator it3 = mn2Var.j().iterator();
            if (it3.hasNext()) {
                p91.x(it3.next());
                throw null;
            }
        }
    }

    public final boolean n(ArrayList arrayList, ArrayList arrayList2) {
        int size = this.d.isEmpty() ? -1 : this.d.size() - 1;
        if (size < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= size; size2--) {
            arrayList.add((cq) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void o(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            fo.n("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((cq) arrayList.get(i)).o) {
                if (i2 != i) {
                    i(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((cq) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                i(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            i(arrayList, arrayList2, i2, size);
        }
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.u.f.removeCallbacks(this.I);
                    this.u.f.post(this.I);
                    q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    as0 as0Var = this.i;
                    as0Var.a = true;
                    au0 au0Var = as0Var.c;
                    if (au0Var != null) {
                        au0Var.invoke();
                    }
                    if (l(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.g != null ? 1 : 0) > 0;
                if (l(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                as0 as0Var2 = this.i;
                as0Var2.a = z;
                au0 au0Var2 = as0Var2.c;
                if (au0Var2 != null) {
                    au0Var2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(WorkQueueKt.BUFFER_CAPACITY);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a aVar = this.u;
        if (aVar != null) {
            sb.append(aVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.u)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }
}
