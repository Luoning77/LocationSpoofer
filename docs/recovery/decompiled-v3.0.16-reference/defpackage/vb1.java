package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vb1 implements k20 {
    public final hb1 e;
    public o30 f;
    public j23 g;
    public int h;
    public int i;
    public final zx1 j;
    public final zx1 k;
    public final pb1 l;
    public final mb1 m;
    public final zx1 n;
    public final i23 o;
    public final zx1 p;
    public final gy1 q;
    public int r;
    public int s;
    public final String t;

    public vb1(hb1 hb1Var, j23 j23Var) {
        this.e = hb1Var;
        this.g = j23Var;
        long[] jArr = hn2.a;
        this.j = new zx1();
        this.k = new zx1();
        this.l = new pb1(this);
        this.m = new mb1(this);
        this.n = new zx1();
        this.o = new i23();
        this.p = new zx1();
        this.q = new gy1(new Object[16]);
        this.t = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void b(nb1 nb1Var) {
        ay1 ay1Var;
        g72 g72Var = nb1Var.f;
        if (g72Var != null) {
            g72Var.h.set(i72.f);
            lj ljVar = g72Var.k;
            if (((ay1) ljVar.e).h()) {
                ay1Var = (ay1) ljVar.e;
                ay1 ay1Var2 = in2.a;
                ljVar.e = new ay1();
                ((gy1) ljVar.d).g();
            } else {
                ay1Var = null;
            }
            ljVar.c();
            t30 t30Var = g72Var.a;
            t30Var.u = null;
            if (ay1Var != null) {
                t30Var.y.k = ay1Var;
                t30Var.A = 2;
            }
            nb1Var.f = null;
            t30 t30Var2 = nb1Var.c;
            if (t30Var2 != null) {
                t30Var2.m();
            }
            nb1Var.c = null;
        }
    }

    public final void a(nb1 nb1Var, boolean z) {
        g72 g72Var = nb1Var.f;
        if (g72Var != null) {
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                hb1 hb1Var = this.e;
                hb1Var.v = true;
                if (z) {
                    while (!g72Var.c()) {
                        try {
                            g72Var.e(new b81(2));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                g72Var.a();
                nb1Var.f = null;
                hb1Var.v = false;
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            } catch (Throwable th2) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                throw th2;
            }
        }
    }

    public final e23 c(Object obj) {
        return !this.e.G() ? new sb1() : new tb1(this, obj);
    }

    public final void d(int i) {
        boolean z;
        boolean z2 = false;
        this.r = 0;
        List listO = this.e.o();
        qx1 qx1Var = (qx1) listO;
        int i2 = (((gy1) qx1Var.f).g - this.s) - 1;
        if (i <= i2) {
            this.o.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.j.g((hb1) qx1Var.get(i3));
                    objG.getClass();
                    ((tx1) this.o.f).a(((nb1) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.g.e(this.o);
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            z = false;
            while (i2 >= i) {
                try {
                    hb1 hb1Var = (hb1) ((qx1) listO).get(i2);
                    Object objG2 = this.j.g(hb1Var);
                    objG2.getClass();
                    nb1 nb1Var = (nb1) objG2;
                    Object obj = nb1Var.a;
                    if (((tx1) this.o.f).c(obj)) {
                        this.r++;
                        if (((Boolean) nb1Var.g.getValue()).booleanValue()) {
                            lb1 lb1Var = hb1Var.L;
                            dr1 dr1Var = lb1Var.p;
                            fb1 fb1Var = fb1.g;
                            dr1Var.p = fb1Var;
                            ik1 ik1Var = lb1Var.q;
                            if (ik1Var != null) {
                                ik1Var.n = fb1Var;
                            }
                            l(nb1Var, false);
                            if (nb1Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        hb1 hb1Var2 = this.e;
                        hb1Var2.v = true;
                        this.j.k(hb1Var);
                        t30 t30Var = nb1Var.c;
                        if (t30Var != null) {
                            t30Var.m();
                        }
                        this.e.P(i2, 1);
                        hb1Var2.v = false;
                    }
                    this.k.k(obj);
                    i2--;
                } catch (Throwable th) {
                    wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                    throw th;
                }
            }
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (tx2.c) {
                ay1 ay1Var = tx2.j.h;
                if (ay1Var != null && ay1Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                tx2.c();
            }
        }
        g();
    }

    public final void e(Object obj) {
        g();
        hb1 hb1Var = (hb1) this.n.k(obj);
        hb1 hb1Var2 = this.e;
        if (hb1Var != null) {
            if (this.s <= 0) {
                p21.c("No pre-composed items to dispose");
            }
            int i = ((gy1) ((qx1) hb1Var2.o()).f).i(hb1Var);
            if (i < ((gy1) ((qx1) hb1Var2.o()).f).g - this.s) {
                p21.c("Item is not in pre-composed item range");
            }
            this.r++;
            this.s--;
            nb1 nb1Var = (nb1) this.j.g(hb1Var);
            if (nb1Var != null) {
                b(nb1Var);
            }
            int i2 = (((gy1) ((qx1) hb1Var2.o()).f).g - this.s) - this.r;
            j(i, i2);
            d(i2);
        }
        if (this.q.h(obj)) {
            hb1.V(hb1Var2, true, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.k20
    public final void f() {
        t30 t30Var;
        hb1 hb1Var = this.e;
        hb1Var.v = true;
        zx1 zx1Var = this.j;
        Object[] objArr = zx1Var.c;
        long[] jArr = zx1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (t30Var = ((nb1) objArr[(i << 3) + i3]).c) != null) {
                            t30Var.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        hb1Var.O();
        hb1Var.v = false;
        zx1Var.a();
        this.k.a();
        this.s = 0;
        this.r = 0;
        this.n.a();
        g();
    }

    public final void g() {
        int i = ((gy1) ((qx1) this.e.o()).f).g;
        zx1 zx1Var = this.j;
        if (zx1Var.e != i) {
            p21.a("Inconsistency between the count of nodes tracked by the state (" + zx1Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.r) - this.s < 0) {
            StringBuilder sbR = p91.r(i, "Incorrect state. Total children ", ". Reusable children ");
            sbR.append(this.r);
            sbR.append(". Precomposed children ");
            sbR.append(this.s);
            p21.a(sbR.toString());
        }
        zx1 zx1Var2 = this.n;
        if (zx1Var2.e == this.s) {
            return;
        }
        p21.a("Incorrect state. Precomposed children " + this.s + ". Map size " + zx1Var2.e);
    }

    @Override // defpackage.k20
    public final void h() {
        i(true);
    }

    public final void i(boolean z) {
        this.s = 0;
        this.n.a();
        List listO = this.e.o();
        int i = ((gy1) ((qx1) listO).f).g;
        if (this.r != i) {
            this.r = i;
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    hb1 hb1Var = (hb1) ((qx1) listO).get(i2);
                    nb1 nb1Var = (nb1) this.j.g(hb1Var);
                    if (nb1Var != null && ((Boolean) nb1Var.g.getValue()).booleanValue()) {
                        lb1 lb1Var = hb1Var.L;
                        dr1 dr1Var = lb1Var.p;
                        fb1 fb1Var = fb1.g;
                        dr1Var.p = fb1Var;
                        ik1 ik1Var = lb1Var.q;
                        if (ik1Var != null) {
                            ik1Var.n = fb1Var;
                        }
                        l(nb1Var, z);
                        nb1Var.a = o51.t0;
                    }
                } catch (Throwable th) {
                    wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                    throw th;
                }
            }
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            this.k.a();
        }
        g();
    }

    public final void j(int i, int i2) {
        hb1 hb1Var = this.e;
        hb1Var.v = true;
        hb1Var.K(i, i2, 1);
        hb1Var.v = false;
    }

    public final void k(Object obj, pu0 pu0Var, boolean z) {
        hb1 hb1Var = this.e;
        if (hb1Var.G()) {
            g();
            if (this.k.c(obj)) {
                return;
            }
            this.p.k(obj);
            zx1 zx1Var = this.n;
            Object objG = zx1Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((gy1) ((qx1) hb1Var.o()).f).i(objG), ((gy1) ((qx1) hb1Var.o()).f).g);
                    this.s++;
                } else {
                    int i = ((gy1) ((qx1) hb1Var.o()).f).g;
                    hb1 hb1Var2 = new hb1(2);
                    hb1Var.v = true;
                    hb1Var.A(i, hb1Var2);
                    hb1Var.v = false;
                    this.s++;
                    objG = hb1Var2;
                }
                zx1Var.m(obj, objG);
            }
            m((hb1) objG, obj, z, pu0Var);
        }
    }

    public final void l(nb1 nb1Var, boolean z) {
        t30 t30Var;
        if (z || !nb1Var.h) {
            nb1Var.g = ke0.H(Boolean.FALSE);
        } else {
            nb1Var.g.setValue(Boolean.FALSE);
        }
        if (nb1Var.f != null) {
            b(nb1Var);
            return;
        }
        if (z) {
            t30 t30Var2 = nb1Var.c;
            if (t30Var2 != null) {
                t30Var2.l();
                return;
            }
            return;
        }
        y32 y32VarM19getOutOfFrameExecutor = ((db) kb1.a(this.e)).m19getOutOfFrameExecutor();
        if (y32VarM19getOutOfFrameExecutor == null) {
            if (nb1Var.h || (t30Var = nb1Var.c) == null) {
                return;
            }
            t30Var.l();
            return;
        }
        ye yeVar = new ye(nb1Var, 15);
        db dbVar = (db) y32VarM19getOutOfFrameExecutor;
        mo moVar = dbVar.m;
        boolean zIsEmpty = moVar.isEmpty();
        moVar.addLast(yeVar);
        if (zIsEmpty) {
            Handler handler = dbVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(dbVar.n);
            } else {
                fo.i("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(hb1 hb1Var, Object obj, boolean z, pu0 pu0Var) {
        boolean z2;
        t30 t30Var;
        zx1 zx1Var = this.j;
        Object objG = zx1Var.g(hb1Var);
        Object obj2 = objG;
        if (objG == null) {
            p10 p10Var = f20.a;
            nb1 nb1Var = new nb1();
            nb1Var.a = obj;
            nb1Var.b = p10Var;
            nb1Var.c = null;
            nb1Var.g = ke0.H(Boolean.TRUE);
            zx1Var.m(hb1Var, nb1Var);
            obj2 = nb1Var;
        }
        nb1 nb1Var2 = (nb1) obj2;
        int i = 1;
        boolean z3 = nb1Var2.b != pu0Var;
        if (nb1Var2.f != null) {
            if (z3) {
                b(nb1Var2);
            } else if (z) {
                return;
            } else {
                a(nb1Var2, true);
            }
        }
        t30 t30Var2 = nb1Var2.c;
        if (t30Var2 != null) {
            synchronized (t30Var2.h) {
                z2 = t30Var2.r.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || nb1Var2.d) {
            nb1Var2.b = pu0Var;
            if (nb1Var2.f != null) {
                p21.a("new subcompose call while paused composition is still active");
            }
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                hb1 hb1Var2 = this.e;
                hb1Var2.v = true;
                t30 t30Var3 = nb1Var2.c;
                o30 o30Var = this.f;
                if (o30Var == null) {
                    p21.d("parent composition reference not set");
                    throw new iv();
                }
                if (t30Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = sm3.a;
                        t30Var = new t30(o30Var, new if3(hb1Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = sm3.a;
                        t30Var = new t30(o30Var, new if3(hb1Var));
                    }
                    t30Var3 = t30Var;
                } else {
                    if (t30Var3.A == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = sm3.a;
                            t30Var = new t30(o30Var, new if3(hb1Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = sm3.a;
                            t30Var = new t30(o30Var, new if3(hb1Var));
                        }
                        t30Var3 = t30Var;
                    }
                }
                nb1Var2.c = t30Var3;
                pu0 p10Var2 = nb1Var2.b;
                if (((db) kb1.a(this.e)).m19getOutOfFrameExecutor() != null) {
                    nb1Var2.h = false;
                } else {
                    nb1Var2.h = true;
                    p10Var2 = new p10(new xb(i, nb1Var2, p10Var2), true, 1524156494);
                }
                if (z) {
                    if (nb1Var2.e) {
                        t30Var3.i();
                        t30Var3.q();
                        nb1Var2.f = t30Var3.k(true, p10Var2);
                    } else {
                        nb1Var2.f = t30Var3.k(t30Var3.i(), p10Var2);
                    }
                } else if (nb1Var2.e) {
                    t30Var3.i();
                    t30Var3.q();
                    ov0 ov0Var = t30Var3.z;
                    ov0Var.z = 0;
                    ov0Var.y = true;
                    t30Var3.e.a(t30Var3, p10Var2);
                    ov0Var.u();
                } else {
                    t30Var3.A(p10Var2);
                }
                nb1Var2.e = false;
                hb1Var2.v = false;
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                nb1Var2.d = false;
            } catch (Throwable th) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                throw th;
            }
        }
    }

    public final hb1 n(Object obj) {
        zx1 zx1Var;
        int i;
        if (this.r == 0) {
            return null;
        }
        qx1 qx1Var = (qx1) this.e.o();
        int i2 = ((gy1) qx1Var.f).g - this.s;
        int i3 = i2 - this.r;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            zx1Var = this.j;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = zx1Var.g((hb1) qx1Var.get(i5));
            objG.getClass();
            if (((nb1) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = zx1Var.g((hb1) qx1Var.get(i4));
                objG2.getClass();
                nb1 nb1Var = (nb1) objG2;
                Object obj2 = nb1Var.a;
                if (obj2 == o51.t0 || this.g.l(obj, obj2)) {
                    nb1Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.r--;
        hb1 hb1Var = (hb1) qx1Var.get(i3);
        Object objG3 = zx1Var.g(hb1Var);
        objG3.getClass();
        nb1 nb1Var2 = (nb1) objG3;
        nb1Var2.g = ke0.H(Boolean.TRUE);
        nb1Var2.e = true;
        nb1Var2.d = true;
        return hb1Var;
    }
}
