package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mn2 implements mp, k7, uh3 {
    public static final j13 i = new j13();
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public mn2(Typeface typeface, vt1 vt1Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.h = typeface;
        this.e = vt1Var;
        this.g = new wt1(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int iA = vt1Var.a(6);
        if (iA != 0) {
            int i6 = iA + vt1Var.e;
            i2 = ((ByteBuffer) vt1Var.h).getInt(((ByteBuffer) vt1Var.h).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f = new char[i2 * 2];
        int iA2 = vt1Var.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + vt1Var.e;
            i3 = ((ByteBuffer) vt1Var.h).getInt(((ByteBuffer) vt1Var.h).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            ee3 ee3Var = new ee3(this, i8);
            ut1 ut1VarB = ee3Var.b();
            int iA3 = ut1VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) ut1VarB.h).getInt(iA3 + ut1VarB.e) : 0, (char[]) this.f, i8 * 2);
            ut1 ut1VarB2 = ee3Var.b();
            int iA4 = ut1VarB2.a(16);
            if (iA4 != 0) {
                int i9 = iA4 + ut1VarB2.e;
                i4 = ((ByteBuffer) ut1VarB2.h).getInt(((ByteBuffer) ut1VarB2.h).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (!(i4 > 0)) {
                fo.i("invalid metadata codepoint length");
                throw null;
            }
            wt1 wt1Var = (wt1) this.g;
            ut1 ut1VarB3 = ee3Var.b();
            int iA5 = ut1VarB3.a(16);
            if (iA5 != 0) {
                int i10 = iA5 + ut1VarB3.e;
                i5 = ((ByteBuffer) ut1VarB3.h).getInt(((ByteBuffer) ut1VarB3.h).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            wt1Var.a(ee3Var, 0, i5 - 1);
        }
    }

    @Override // defpackage.rh3
    public long b(yi yiVar, yi yiVar2, yi yiVar3) {
        int iB = yiVar.b();
        long jMax = 0;
        for (int i2 = 0; i2 < iB; i2++) {
            jMax = Math.max(jMax, ((us1) this.e).j(i2).d(yiVar.a(i2), yiVar2.a(i2), yiVar3.a(i2)));
        }
        return jMax;
    }

    public void c(p92 p92Var, boolean z) {
        ea2 ea2Var = (ea2) this.h;
        List list = p92Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((x92) list.get(i2)).b()) {
                s(p92Var);
                return;
            }
        }
        xz1 xz1Var = (xz1) this.e;
        if (xz1Var == null) {
            fo.n("layoutCoordinates not set");
            return;
        }
        hd0.P(p92Var, xz1Var.h0(0L), new ze(9, this, ea2Var), false);
        if (((da2) this.f) == da2.f) {
            if (z) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((x92) list.get(i3)).a();
                }
            }
            c51 c51Var = p92Var.b;
            if (c51Var != null) {
                c51Var.e = !ea2Var.c;
            }
        }
    }

    @Override // defpackage.k7
    public boolean d(l7 l7Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.e).onActionItemClicked(h(l7Var), new zs1((Context) this.f, (q23) menuItem));
    }

    public void e() {
        Iterator it = ((HashMap) this.f).values().iterator();
        while (it.hasNext()) {
            p91.x(it.next());
        }
    }

    @Override // defpackage.k7
    public boolean f(l7 l7Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.e;
        m23 m23VarH = h(l7Var);
        tv2 tv2Var = (tv2) this.h;
        Menu tt1Var = (Menu) tv2Var.get(menu);
        if (tt1Var == null) {
            tt1Var = new tt1((Context) this.f, (ms1) menu);
            tv2Var.put(menu, tt1Var);
        }
        return callback.onPrepareActionMode(m23VarH, tt1Var);
    }

    @Override // defpackage.k7
    public void g(l7 l7Var) {
        ((ActionMode.Callback) this.e).onDestroyActionMode(h(l7Var));
    }

    public m23 h(l7 l7Var) {
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m23 m23Var = (m23) arrayList.get(i2);
            if (m23Var != null && m23Var.b == l7Var) {
                return m23Var;
            }
        }
        m23 m23Var2 = new m23((Context) this.f, l7Var);
        arrayList.add(m23Var2);
        return m23Var2;
    }

    @Override // defpackage.k7
    public boolean i(l7 l7Var, ms1 ms1Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.e;
        m23 m23VarH = h(l7Var);
        tv2 tv2Var = (tv2) this.h;
        Menu tt1Var = (Menu) tv2Var.get(ms1Var);
        if (tt1Var == null) {
            tt1Var = new tt1((Context) this.f, ms1Var);
            tv2Var.put(ms1Var, tt1Var);
        }
        return callback.onCreateActionMode(m23VarH, tt1Var);
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) this.f).values().iterator();
        while (it.hasNext()) {
            p91.x(it.next());
        }
        return arrayList;
    }

    public List k() {
        ArrayList arrayList;
        if (((ArrayList) this.e).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.e)) {
            arrayList = new ArrayList((ArrayList) this.e);
        }
        return arrayList;
    }

    @Override // defpackage.rh3
    public yi m(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        yi yiVarC = (yi) this.g;
        if (yiVarC == null) {
            yiVarC = yiVar3.c();
            this.g = yiVarC;
        }
        int iB = yiVarC.b();
        int i2 = 0;
        while (true) {
            yi yiVar4 = (yi) this.g;
            if (i2 >= iB) {
                if (yiVar4 != null) {
                    return yiVar4;
                }
                o51.F("velocityVector");
                throw null;
            }
            if (yiVar4 == null) {
                o51.F("velocityVector");
                throw null;
            }
            long j2 = j;
            yiVar4.e(i2, ((us1) this.e).j(i2).c(j2, yiVar.a(i2), yiVar2.a(i2), yiVar3.a(i2)));
            i2++;
            j = j2;
        }
    }

    public yi n(long j, yi yiVar, yi yiVar2) {
        yi yiVarC = (yi) this.g;
        if (yiVarC == null) {
            yiVarC = yiVar.c();
            this.g = yiVarC;
        }
        int iB = yiVarC.b();
        int i2 = 0;
        while (true) {
            yi yiVar3 = (yi) this.g;
            if (i2 >= iB) {
                if (yiVar3 != null) {
                    return yiVar3;
                }
                o51.F("velocityVector");
                throw null;
            }
            if (yiVar3 == null) {
                o51.F("velocityVector");
                throw null;
            }
            us1 us1Var = (us1) this.e;
            yiVar.getClass();
            long j2 = j / 1000000;
            rn0 rn0VarA = ((sn0) us1Var.f).a(yiVar2.a(i2));
            long j3 = rn0VarA.c;
            yiVar3.e(i2, (((Math.signum(rn0VarA.a) * vc.a(j3 > 0 ? j2 / j3 : 1.0f).b) * rn0VarA.b) / j3) * 1000.0f);
            i2++;
        }
    }

    @Override // defpackage.rh3
    public yi p(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        yi yiVarC = (yi) this.f;
        if (yiVarC == null) {
            yiVarC = yiVar.c();
            this.f = yiVarC;
        }
        int iB = yiVarC.b();
        int i2 = 0;
        while (true) {
            yi yiVar4 = (yi) this.f;
            if (i2 >= iB) {
                if (yiVar4 != null) {
                    return yiVar4;
                }
                o51.F("valueVector");
                throw null;
            }
            if (yiVar4 == null) {
                o51.F("valueVector");
                throw null;
            }
            long j2 = j;
            yiVar4.e(i2, ((us1) this.e).j(i2).b(j2, yiVar.a(i2), yiVar2.a(i2), yiVar3.a(i2)));
            i2++;
            j = j2;
        }
    }

    @Override // defpackage.rh3
    public yi q(yi yiVar, yi yiVar2, yi yiVar3) {
        yi yiVarC = (yi) this.h;
        if (yiVarC == null) {
            yiVarC = yiVar3.c();
            this.h = yiVarC;
        }
        int iB = yiVarC.b();
        int i2 = 0;
        while (true) {
            yi yiVar4 = (yi) this.h;
            if (i2 >= iB) {
                if (yiVar4 != null) {
                    return yiVar4;
                }
                o51.F("endVelocityVector");
                throw null;
            }
            if (yiVar4 == null) {
                o51.F("endVelocityVector");
                throw null;
            }
            yiVar4.e(i2, ((us1) this.e).j(i2).e(yiVar.a(i2), yiVar2.a(i2), yiVar3.a(i2)));
            i2++;
        }
    }

    public hj3 r(ox oxVar, String str) {
        hj3 hj3Var;
        hj3 hj3VarA;
        synchronized (((gt2) this.h)) {
            try {
                oj3 oj3Var = (oj3) this.e;
                oj3Var.getClass();
                hj3Var = (hj3) oj3Var.a.get(str);
                if (oxVar.d(hj3Var)) {
                    mj3 mj3Var = (mj3) this.f;
                    if (mj3Var instanceof um2) {
                        um2 um2Var = (um2) mj3Var;
                        hj3Var.getClass();
                        xe1 xe1Var = um2Var.d;
                        if (xe1Var != null) {
                            qm2 qm2Var = um2Var.e;
                            qm2Var.getClass();
                            ee0.q(hj3Var, qm2Var, xe1Var);
                        }
                    }
                    hj3Var.getClass();
                } else {
                    dx1 dx1Var = new dx1((c80) this.g);
                    dx1Var.a.put(xp1.O, str);
                    mj3 mj3Var2 = (mj3) this.f;
                    mj3Var2.getClass();
                    try {
                        try {
                            hj3VarA = mj3Var2.c(oxVar, dx1Var);
                        } catch (AbstractMethodError unused) {
                            hj3VarA = mj3Var2.b(ig0.r(oxVar), dx1Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        hj3VarA = mj3Var2.a(ig0.r(oxVar));
                    }
                    hj3Var = hj3VarA;
                    oj3 oj3Var2 = (oj3) this.e;
                    oj3Var2.getClass();
                    hj3Var.getClass();
                    hj3 hj3Var2 = (hj3) oj3Var2.a.put(str, hj3Var);
                    if (hj3Var2 != null) {
                        hj3Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hj3Var;
    }

    public void s(p92 p92Var) {
        if (((da2) this.f) == da2.f) {
            xz1 xz1Var = (xz1) this.e;
            if (xz1Var == null) {
                fo.n("layoutCoordinates not set");
                return;
            }
            hd0.P(p92Var, xz1Var.h0(0L), new q9((ea2) this.h, 20), true);
        }
        this.f = da2.g;
    }

    public mn2(int i2) {
        switch (i2) {
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                break;
            default:
                this.e = new ArrayList();
                this.f = new HashMap();
                this.g = new HashMap();
                break;
        }
    }

    public mn2(oj3 oj3Var, mj3 mj3Var, c80 c80Var) {
        oj3Var.getClass();
        mj3Var.getClass();
        c80Var.getClass();
        this.e = oj3Var;
        this.f = mj3Var;
        this.g = c80Var;
        this.h = new gt2(3);
    }

    public /* synthetic */ mn2(Object obj) {
        this.e = obj;
    }

    public mn2(wn0 wn0Var) {
        this(new us1(wn0Var, 24));
    }
}
