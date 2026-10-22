package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kc3 implements s03 {
    public final qd3 e;
    public final w52 f;
    public final w52 g;
    public final w52 h;
    public final w52 i;
    public final s52 j;
    public boolean k;
    public final w52 l;
    public yi m;
    public final u52 n;
    public boolean o;
    public final yz2 p;
    public final /* synthetic */ mc3 q;

    public kc3(mc3 mc3Var, Object obj, yi yiVar, qd3 qd3Var) {
        this.q = mc3Var;
        this.e = qd3Var;
        w52 w52VarH = ke0.H(obj);
        this.f = w52VarH;
        Object objInvoke = null;
        w52 w52VarH2 = ke0.H(o51.D(0.0f, 0.0f, null, 7));
        this.g = w52VarH2;
        this.h = ke0.H(new h53((ln0) w52VarH2.getValue(), qd3Var, obj, w52VarH.getValue(), yiVar));
        this.i = ke0.H(Boolean.TRUE);
        this.j = new s52(-1.0f);
        this.l = ke0.H(obj);
        this.m = yiVar;
        this.n = new u52(a().c());
        Float f = (Float) zj3.b.get(qd3Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            yi yiVar2 = (yi) qd3Var.a.invoke(obj);
            int iB = yiVar2.b();
            for (int i = 0; i < iB; i++) {
                yiVar2.e(i, fFloatValue);
            }
            objInvoke = this.e.b.invoke(yiVar2);
        }
        this.p = o51.D(0.0f, 0.0f, objInvoke, 3);
    }

    public final h53 a() {
        return (h53) this.h.getValue();
    }

    public final void b() {
        if (this.j.g() == -1.0f) {
            this.o = true;
            boolean zF = o51.f(a().c, a().d);
            w52 w52Var = this.l;
            if (zF) {
                w52Var.setValue(a().c);
            } else {
                w52Var.setValue(a().b(0L));
                this.m = a().f(0L);
            }
        }
    }

    public final void c(Object obj, boolean z) {
        w52 w52Var = this.f;
        boolean zF = o51.f(null, w52Var.getValue());
        u52 u52Var = this.n;
        w52 w52Var2 = this.h;
        if (zF) {
            w52Var2.setValue(new h53(this.p, this.e, obj, obj, this.m.c()));
            this.k = true;
            u52Var.h(a().c());
            return;
        }
        w52 w52Var3 = this.g;
        ln0 ln0Var = (!z || this.o || (((ln0) w52Var3.getValue()) instanceof yz2)) ? (ln0) w52Var3.getValue() : this.p;
        mc3 mc3Var = this.q;
        long jE = mc3Var.e();
        w52 w52Var4 = mc3Var.h;
        long jMax = 0;
        w52Var2.setValue(new h53(jE <= 0 ? ln0Var : new n03(ln0Var, mc3Var.e()), this.e, obj, w52Var.getValue(), this.m));
        u52Var.h(a().c());
        this.k = false;
        w52Var4.setValue(Boolean.TRUE);
        if (mc3Var.g()) {
            fy2 fy2Var = mc3Var.i;
            int size = fy2Var.size();
            for (int i = 0; i < size; i++) {
                kc3 kc3Var = (kc3) fy2Var.get(i);
                jMax = Math.max(jMax, kc3Var.n.g());
                kc3Var.b();
            }
            w52Var4.setValue(Boolean.FALSE);
        }
    }

    public final void e(Object obj, Object obj2, ln0 ln0Var) {
        this.f.setValue(obj2);
        this.g.setValue(ln0Var);
        if (o51.f(a().d, obj) && o51.f(a().c, obj2)) {
            return;
        }
        c(obj, false);
    }

    public final void f(Object obj, ln0 ln0Var) {
        if (this.k && o51.f(obj, null)) {
            return;
        }
        w52 w52Var = this.f;
        boolean zF = o51.f(w52Var.getValue(), obj);
        s52 s52Var = this.j;
        if (zF && s52Var.g() == -1.0f) {
            return;
        }
        w52Var.setValue(obj);
        this.g.setValue(ln0Var);
        float fG = s52Var.g();
        w52 w52Var2 = this.l;
        Object value = fG == -3.0f ? obj : w52Var2.getValue();
        w52 w52Var3 = this.i;
        c(value, !((Boolean) w52Var3.getValue()).booleanValue());
        w52Var3.setValue(Boolean.valueOf(s52Var.g() == -3.0f));
        if (s52Var.g() >= 0.0f) {
            w52Var2.setValue(a().b((long) (s52Var.g() * a().c())));
        } else if (s52Var.g() == -3.0f) {
            w52Var2.setValue(obj);
        }
        this.k = false;
        s52Var.h(-1.0f);
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return this.l.getValue();
    }

    public final String toString() {
        return "current value: " + this.l.getValue() + ", target: " + this.f.getValue() + ", spec: " + ((ln0) this.g.getValue());
    }
}
