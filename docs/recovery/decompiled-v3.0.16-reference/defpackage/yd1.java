package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yd1 implements qo2 {
    public static final z92 y = mh0.P(new v70(7, 0), new zs0(18));
    public final qa0 a;
    public boolean b;
    public qd1 c;
    public boolean d;
    public final ax e;
    public final w52 f;
    public final ix1 g;
    public float h;
    public boolean i;
    public final va0 j;
    public final boolean k;
    public hb1 l;
    public final vd1 m;
    public final vp n;
    public final kc1 o;
    public final dt p;
    public final wc1 q;
    public final t1 r;
    public final tc1 s;
    public final ey1 t;
    public final w52 u;
    public final w52 v;
    public final ey1 w;
    public final yc1 x;

    public yd1(int i, int i2) {
        qa0 qa0Var = new qa0();
        qa0Var.a = -1;
        qa0Var.d = -1;
        this.a = qa0Var;
        ax axVar = new ax();
        axVar.b = new t52(i);
        axVar.c = new t52(i2);
        axVar.e = new qc1(i);
        this.e = axVar;
        qd1 qd1Var = ae1.a;
        j9 j9Var = j9.W;
        this.f = new w52(qd1Var, j9Var);
        this.g = new ix1();
        this.j = new va0(new t(this, 23));
        this.k = true;
        this.m = new vd1(this);
        this.n = new vp();
        this.o = new kc1();
        this.p = new dt(1);
        this.q = new wc1(new gz(this, i));
        this.r = new t1(this, 27);
        this.s = new tc1();
        mf3 mf3Var = mf3.a;
        this.t = new w52(mf3Var, j9Var);
        Boolean bool = Boolean.FALSE;
        this.u = ke0.H(bool);
        this.v = ke0.H(bool);
        this.w = new w52(mf3Var, j9Var);
        yc1 yc1Var = new yc1();
        qd3 qd3Var = o51.v0;
        Float fValueOf = Float.valueOf(0.0f);
        yc1Var.b = new ti(qd3Var, fValueOf, (yi) qd3Var.a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.x = yc1Var;
    }

    public static Object j(yd1 yd1Var, int i, k33 k33Var) {
        yd1Var.getClass();
        Object objD = yd1Var.d(jy1.e, new xd1(yd1Var, i, (q60) null), k33Var);
        return objD == z70.e ? objD : mf3.a;
    }

    @Override // defpackage.qo2
    public final boolean a() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // defpackage.qo2
    public final boolean b() {
        return this.j.b();
    }

    @Override // defpackage.qo2
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.qo2
    public final Object d(jy1 jy1Var, pu0 pu0Var, r60 r60Var) {
        wd1 wd1Var;
        if (r60Var instanceof wd1) {
            wd1Var = (wd1) r60Var;
            int i = wd1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                wd1Var.i = i - Integer.MIN_VALUE;
            } else {
                wd1Var = new wd1(this, r60Var);
            }
        } else {
            wd1Var = new wd1(this, r60Var);
        }
        Object obj = wd1Var.g;
        int i2 = wd1Var.i;
        Object obj2 = mf3.a;
        Object obj3 = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            if (this.f.getValue() == ae1.a) {
                wd1Var.e = jy1Var;
                wd1Var.f = (k33) pu0Var;
                wd1Var.i = 1;
                vp vpVar = this.n;
                CompletableDeferred completableDeferredCompletableDeferred$default = vpVar.b;
                if (completableDeferredCompletableDeferred$default == null) {
                    completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    vpVar.b = completableDeferredCompletableDeferred$default;
                    up upVar = vpVar.a;
                    if (upVar != null && upVar.r) {
                        upVar.m1();
                    }
                }
                Object objAwait = completableDeferredCompletableDeferred$default.await(wd1Var);
                if (objAwait != obj3) {
                    objAwait = obj2;
                }
                if (objAwait != obj3) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ee0.J(obj);
                return obj2;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pu0Var = (pu0) wd1Var.f;
        jy1Var = wd1Var.e;
        ee0.J(obj);
        wd1Var.e = null;
        wd1Var.f = null;
        wd1Var.i = 2;
        return this.j.d(jy1Var, pu0Var, wd1Var) == obj3 ? obj3 : obj2;
    }

    @Override // defpackage.qo2
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, mf3] */
    public final Object f(int i, r60 r60Var) {
        td1 td1Var;
        if (r60Var instanceof td1) {
            td1Var = (td1) r60Var;
            int i2 = td1Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                td1Var.g = i2 - Integer.MIN_VALUE;
            } else {
                td1Var = new td1(this, r60Var);
            }
        } else {
            td1Var = new td1(this, r60Var);
        }
        Object obj = td1Var.e;
        int i3 = td1Var.g;
        try {
            if (i3 == 0) {
                ee0.J(obj);
                this.i = true;
                ud1 ud1Var = new ud1(this, i, null);
                td1Var.g = 1;
                Object objD = d(jy1.e, ud1Var, td1Var);
                z70 z70Var = z70.e;
                if (objD == z70Var) {
                    return z70Var;
                }
            } else {
                if (i3 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            this.i = false;
            this = mf3.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(qd1 qd1Var, boolean z, boolean z2) {
        qd3 qd3Var = o51.v0;
        List list = qd1Var.k;
        int i = qd1Var.n;
        int i2 = qd1Var.b;
        rd1 rd1Var = qd1Var.a;
        this.q.e = list.size();
        yc1 yc1Var = this.x;
        ax axVar = this.e;
        q60 q60Var = null;
        if (!z && this.b) {
            this.c = qd1Var;
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                if (((Number) yc1Var.b.f.getValue()).floatValue() != 0.0f && rd1Var != null && rd1Var.a == ((t52) axVar.b).g() && i2 == ((t52) axVar.c).g()) {
                    Job job = yc1Var.a;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    yc1Var.b = new ti(qd3Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.v.setValue(Boolean.valueOf(((rd1Var != null ? rd1Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(qd1Var.c));
        this.h -= qd1Var.d;
        this.f.setValue(qd1Var);
        if (z2) {
            axVar.getClass();
            if (i2 < 0.0f) {
                s21.c("scrollOffset should be non-negative");
            }
            ((t52) axVar.c).h(i2);
        } else {
            rd1 rd1Var2 = (rd1) zy.o0(list);
            rd1 rd1Var3 = (rd1) zy.u0(list);
            ks.e0("firstVisibleItem:index", rd1Var2 != null ? rd1Var2.a : -1L);
            ks.e0("lastVisibleItem:index", rd1Var3 != null ? rd1Var3.a : -1L);
            axVar.getClass();
            axVar.d = rd1Var != null ? rd1Var.i : null;
            if (axVar.a || i > 0) {
                axVar.a = true;
                if (i2 < 0.0f) {
                    s21.c("scrollOffset should be non-negative");
                }
                axVar.d(rd1Var != null ? rd1Var.a : 0, i2);
            }
            if (this.k) {
                qa0 qa0Var = this.a;
                int i3 = qa0Var.a;
                boolean z3 = qa0Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != qa0.a(qd1Var, z3)) {
                    qa0Var.a = -1;
                    vc1 vc1Var = qa0Var.b;
                    if (vc1Var != null) {
                        vc1Var.cancel();
                    }
                    qa0Var.b = null;
                }
                int i4 = qa0Var.d;
                if (i4 != -1 && qa0Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = qa0.a(qd1Var, qa0Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        qa0Var.a = iA;
                        qa0Var.b = t1.C(this.r, iA);
                    }
                }
                qa0Var.d = i;
            }
        }
        if (z) {
            float f = qd1Var.f;
            xb0 xb0Var = qd1Var.i;
            CoroutineScope coroutineScope = qd1Var.h;
            yc1Var.getClass();
            if (f <= xb0Var.R(1.0f)) {
                return;
            }
            nx2 nx2VarK2 = wc0.K();
            lu0 lu0VarE2 = nx2VarK2 != null ? nx2VarK2.e() : null;
            nx2 nx2VarS2 = wc0.S(nx2VarK2);
            try {
                float fFloatValue = ((Number) yc1Var.b.f.getValue()).floatValue();
                Job job2 = yc1Var.a;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                ti tiVar = yc1Var.b;
                if (tiVar.j) {
                    yc1Var.b = am1.l(tiVar, fFloatValue - f);
                } else {
                    yc1Var.b = new ti(qd3Var, Float.valueOf(-f), null, 60);
                }
                yc1Var.a = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new d6(yc1Var, q60Var, 7), 3, null);
            } finally {
                wc0.g0(nx2VarK2, nx2VarS2, lu0VarE2);
            }
        }
    }

    public final qd1 h() {
        return (qd1) this.f.getValue();
    }

    public final void i(float f, qd1 qd1Var) {
        vc1 vc1Var;
        vc1 vc1Var2;
        if (this.k) {
            boolean zIsEmpty = qd1Var.k.isEmpty();
            qa0 qa0Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = qa0.a(qd1Var, z);
                if (iA >= 0 && iA < qd1Var.n) {
                    if (iA != qa0Var.a) {
                        if (qa0Var.c != z) {
                            qa0Var.a = -1;
                            vc1 vc1Var3 = qa0Var.b;
                            if (vc1Var3 != null) {
                                vc1Var3.cancel();
                            }
                            qa0Var.b = null;
                        }
                        qa0Var.c = z;
                        qa0Var.a = iA;
                        qa0Var.b = t1.C(this.r, iA);
                    }
                    List list = qd1Var.k;
                    if (z) {
                        rd1 rd1Var = (rd1) zy.t0(list);
                        if (((rd1Var.l + rd1Var.m) + qd1Var.q) - qd1Var.m < (-f) && (vc1Var2 = qa0Var.b) != null) {
                            vc1Var2.b();
                        }
                    } else if (qd1Var.l - ((rd1) zy.n0(list)).l < f && (vc1Var = qa0Var.b) != null) {
                        vc1Var.b();
                    }
                }
            }
            qa0Var.e = f;
        }
    }

    public final void k(int i) {
        ax axVar = this.e;
        if (((t52) axVar.b).g() != i || ((t52) axVar.c).g() != 0) {
            kc1 kc1Var = this.o;
            kc1Var.c();
            kc1Var.b = null;
        }
        axVar.d(i, 0);
        axVar.d = null;
        hb1 hb1Var = this.l;
        if (hb1Var != null) {
            hb1Var.k();
        }
    }
}
