package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oh {
    public final qd3 a;
    public final Object b;
    public final ti c;
    public final w52 d;
    public final w52 e;
    public final sy1 f;
    public final yi g;
    public final yi h;
    public final yi i;
    public final yi j;

    public oh(Object obj, qd3 qd3Var, Object obj2) {
        this.a = qd3Var;
        this.b = obj2;
        ti tiVar = new ti(qd3Var, obj, null, 60);
        this.c = tiVar;
        this.d = ke0.H(Boolean.FALSE);
        this.e = ke0.H(obj);
        this.f = new sy1();
        new yz2(obj2, 3);
        yi yiVar = tiVar.g;
        boolean z = yiVar instanceof ui;
        yi yiVar2 = z ? k22.e : yiVar instanceof vi ? k22.f : yiVar instanceof wi ? k22.g : k22.h;
        this.g = yiVar2;
        yi yiVar3 = z ? k22.a : yiVar instanceof vi ? k22.b : yiVar instanceof wi ? k22.c : k22.d;
        this.h = yiVar3;
        this.i = yiVar2;
        this.j = yiVar3;
    }

    public static Object a(oh ohVar, Object obj, si siVar, wc wcVar, q60 q60Var, int i) {
        Object objInvoke = ohVar.a.b.invoke(ohVar.c.g);
        wc wcVar2 = (i & 8) != 0 ? null : wcVar;
        Object objD = ohVar.d();
        qd3 qd3Var = ohVar.a;
        return sy1.a(ohVar.f, new mh(ohVar, objInvoke, new h53(siVar, qd3Var, objD, obj, (yi) qd3Var.a.invoke(objInvoke)), ohVar.c.h, wcVar2, (q60) null), q60Var);
    }

    public final Object b(Object obj) {
        yi yiVar = this.g;
        yi yiVar2 = this.i;
        boolean zF = o51.f(yiVar2, yiVar);
        yi yiVar3 = this.j;
        if (!zF || !o51.f(yiVar3, this.h)) {
            qd3 qd3Var = this.a;
            yi yiVar4 = (yi) qd3Var.a.invoke(obj);
            int iB = yiVar4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (yiVar4.a(i) < yiVar2.a(i) || yiVar4.a(i) > yiVar3.a(i)) {
                    yiVar4.e(i, mh0.u(yiVar4.a(i), yiVar2.a(i), yiVar3.a(i)));
                    z = true;
                }
            }
            if (z) {
                return qd3Var.b.invoke(yiVar4);
            }
        }
        return obj;
    }

    public final void c() {
        ti tiVar = this.c;
        tiVar.g.d();
        tiVar.h = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.f.getValue();
    }

    public final Object e(Object obj, q60 q60Var) {
        Object objA = sy1.a(this.f, new nh(this, obj, null), q60Var);
        return objA == z70.e ? objA : mf3.a;
    }

    public /* synthetic */ oh(Object obj, qd3 qd3Var, Object obj2, int i) {
        this(obj, qd3Var, (i & 4) != 0 ? null : obj2);
    }
}
