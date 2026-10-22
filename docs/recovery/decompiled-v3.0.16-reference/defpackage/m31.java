package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m31 extends tk3 implements Runnable, n12, View.OnAttachStateChangeListener {
    public boolean g;
    public int h;
    public ql3 i;
    public final zx1 j;
    public final t52 k;
    public final sx1 l;
    public final fy2 m;

    public m31() {
        super(1);
        zx1 zx1Var = new zx1(9);
        wl3.a.getClass();
        zx1Var.m(vl3.b, new lm3("caption bar"));
        zx1Var.m(vl3.c, new lm3("display cutout"));
        zx1Var.m(vl3.d, new lm3("ime"));
        zx1Var.m(vl3.e, new lm3("mandatory system gestures"));
        zx1Var.m(vl3.f, new lm3("navigation bars"));
        zx1Var.m(vl3.g, new lm3("status bars"));
        zx1Var.m(vl3.h, new lm3("system gestures"));
        zx1Var.m(vl3.i, new lm3("tappable element"));
        zx1Var.m(vl3.j, new lm3("waterfall"));
        this.j = zx1Var;
        this.k = new t52(0);
        this.l = new sx1(4);
        this.m = new fy2();
    }

    @Override // defpackage.tk3
    public final void a(al3 al3Var) {
        boolean z = false;
        this.g = false;
        int iD = al3Var.a.d();
        this.h &= ~iD;
        this.i = null;
        wl3 wl3Var = (wl3) yl3.a.b(iD);
        if (wl3Var != null) {
            Object objG = this.j.g(wl3Var);
            objG.getClass();
            lm3 lm3Var = (lm3) objG;
            lm3Var.c.h(0.0f);
            lm3Var.e.h(1.0f);
            lm3Var.d.h(0L);
            lm3Var.c.h(0.0f);
            lm3Var.b.setValue(Boolean.FALSE);
            lm3Var.j = -1L;
            lm3Var.k = -1L;
            t52 t52Var = this.k;
            t52Var.h(t52Var.g() + 1);
            synchronized (tx2.c) {
                ay1 ay1Var = tx2.j.h;
                if (ay1Var != null && ay1Var.h()) {
                    z = true;
                }
            }
            if (z) {
                tx2.c();
            }
        }
    }

    @Override // defpackage.tk3
    public final void b() {
        this.g = true;
    }

    @Override // defpackage.tk3
    public final ql3 c(ql3 ql3Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            al3 al3Var = (al3) list.get(i);
            wl3 wl3Var = (wl3) yl3.a.b(al3Var.a.d());
            if (wl3Var != null) {
                Object objG = this.j.g(wl3Var);
                objG.getClass();
                lm3 lm3Var = (lm3) objG;
                if (((Boolean) lm3Var.b.getValue()).booleanValue()) {
                    zk3 zk3Var = al3Var.a;
                    lm3Var.c.h(zk3Var.c());
                    lm3Var.e.h(zk3Var.a());
                    lm3Var.d.h(zk3Var.b());
                }
            }
        }
        e(ql3Var);
        return ql3Var;
    }

    @Override // defpackage.tk3
    public final z92 d(al3 al3Var, z92 z92Var) {
        ql3 ql3Var = this.i;
        boolean z = false;
        this.g = false;
        this.i = null;
        if (al3Var.a.b() > 0 && ql3Var != null) {
            int iD = al3Var.a.d();
            this.h |= iD;
            wl3 wl3Var = (wl3) yl3.a.b(iD);
            if (wl3Var != null) {
                Object objG = this.j.g(wl3Var);
                objG.getClass();
                lm3 lm3Var = (lm3) objG;
                j31 j31VarG = ql3Var.a.g(iD);
                long j = (((long) j31VarG.a) << 48) | (((long) j31VarG.b) << 32) | (((long) j31VarG.c) << 16) | ((long) j31VarG.d);
                long j2 = lm3Var.h;
                if (!u83.c(j, j2)) {
                    lm3Var.j = j2;
                    lm3Var.k = j;
                    lm3Var.b.setValue(Boolean.TRUE);
                    zk3 zk3Var = al3Var.a;
                    lm3Var.c.h(zk3Var.c());
                    lm3Var.e.h(zk3Var.a());
                    lm3Var.d.h(zk3Var.b());
                    t52 t52Var = this.k;
                    t52Var.h(t52Var.g() + 1);
                    synchronized (tx2.c) {
                        ay1 ay1Var = tx2.j.h;
                        if (ay1Var != null && ay1Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        tx2.c();
                        return z92Var;
                    }
                }
            }
        }
        return z92Var;
    }

    public final void e(ql3 ql3Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        gx1 gx1Var = yl3.a;
        int[] iArr2 = gx1Var.b;
        Object[] objArr3 = gx1Var.c;
        long[] jArr2 = gx1Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            wl3 wl3Var = (wl3) objArr3[i6];
                            j31 j31VarG = ql3Var.a.g(i7);
                            long j3 = (((long) j31VarG.a) << 48) | (((long) j31VarG.b) << 32) | (((long) j31VarG.c) << 16) | ((long) j31VarG.d);
                            Object objG = this.j.g(wl3Var);
                            objG.getClass();
                            lm3 lm3Var = (lm3) objG;
                            if (!u83.c(j3, lm3Var.h)) {
                                lm3Var.h = j3;
                                z2 = true;
                                if (!u83.c(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                j31 j31VarH = ql3Var.a.h(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) j31VarH.b) << 32) | (((long) j31VarH.a) << 48) | (((long) j31VarH.c) << 16) | ((long) j31VarH.d);
                                if (!u83.c(lm3Var.i, j4)) {
                                    lm3Var.i = j4;
                                    z2 = true;
                                    if (!u83.c(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            lm3Var.a.setValue(Boolean.valueOf(ql3Var.a.q(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        bd0 bd0VarF = ql3Var.a.f();
        if (bd0VarF == null) {
            j = 0;
        } else {
            j31 j31VarA = bd0VarF.a();
            j = (((long) j31VarA.a) << c3) | (((long) j31VarA.b) << c2) | (((long) j31VarA.c) << c) | ((long) j31VarA.d);
        }
        zx1 zx1Var = this.j;
        wl3.a.getClass();
        Object objG2 = zx1Var.g(vl3.j);
        objG2.getClass();
        lm3 lm3Var2 = (lm3) objG2;
        lm3Var2.a.setValue(Boolean.valueOf(!u83.c(j, 0L)));
        if (!u83.c(lm3Var2.h, j)) {
            lm3Var2.h = j;
            lm3Var2.i = j;
            z2 = z;
            if (!u83.c(j, 0L)) {
                z3 = z2;
            }
        }
        if (bd0VarF == null) {
            sx1 sx1Var = this.l;
            if (sx1Var.b > 0) {
                sx1Var.d();
                this.m.clear();
                z2 = z;
            }
        } else {
            List listC = Build.VERSION.SDK_INT >= 28 ? ad0.c(bd0VarF.a) : Collections.EMPTY_LIST;
            int size = listC.size();
            sx1 sx1Var2 = this.l;
            if (size < sx1Var2.b) {
                sx1Var2.l(listC.size(), this.l.b);
                this.m.d(listC.size(), this.m.size());
                z2 = z;
            } else {
                int size2 = listC.size() - this.l.b;
                int i8 = 0;
                while (i8 < size2) {
                    sx1 sx1Var3 = this.l;
                    sx1Var3.a(ke0.H(listC.get(sx1Var3.b)));
                    this.m.add(new w21("display cutout rect " + this.l.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listC.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listC.get(i9);
                ey1 ey1Var = (ey1) this.l.f(i9);
                if (!o51.f(ey1Var.getValue(), rect)) {
                    ey1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listC.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.k.g() != 0) && z2) {
            t52 t52Var = this.k;
            t52Var.h(t52Var.g() + 1);
            synchronized (tx2.c) {
                ay1 ay1Var = tx2.j.h;
                z4 = (ay1Var == null || ay1Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                tx2.c();
            }
        }
    }

    @Override // defpackage.n12
    public final ql3 g(View view, ql3 ql3Var) {
        if (this.g) {
            this.i = ql3Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return ql3Var;
            }
        } else if (this.h == 0) {
            e(ql3Var);
        }
        return ql3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = yi3.a;
        ri3.h(view, this);
        al3.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = yi3.a;
        ri3.h(view, null);
        al3.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.h = 0;
            this.g = false;
            ql3 ql3Var = this.i;
            if (ql3Var != null) {
                e(ql3Var);
                this.i = null;
            }
        }
    }
}
