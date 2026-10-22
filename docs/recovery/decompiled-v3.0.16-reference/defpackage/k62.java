package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k62 extends eh3 {
    public st b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public st g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public t13 q;
    public final re r;
    public re s;
    public re t;
    public final zb1 u;

    public k62() {
        int i = nh3.a;
        this.d = uj0.e;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        re reVarA = ue.a();
        this.r = reVarA;
        this.s = reVarA;
        this.u = ig0.A(ce1.g, x30.z);
    }

    @Override // defpackage.eh3
    public final void a(jg0 jg0Var) {
        t13 t13Var;
        if (this.n) {
            mh0.e0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        st stVar = this.b;
        if (stVar != null) {
            jg0.K(jg0Var, this.s, stVar, this.c, null, 56);
        }
        st stVar2 = this.g;
        if (stVar2 != null) {
            t13 t13Var2 = this.q;
            if (this.o || t13Var2 == null) {
                t13 t13Var3 = new t13(this.f, this.j, this.h, this.i, null, 16);
                this.q = t13Var3;
                this.o = false;
                t13Var = t13Var3;
            } else {
                t13Var = t13Var2;
            }
            jg0.K(jg0Var, this.s, stVar2, this.e, t13Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        re reVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = reVar;
            return;
        }
        re reVar2 = this.s;
        if (reVar2 != reVar) {
            Path.FillType fillType = reVar2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.h();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = ue.a();
        }
        zb1 zb1Var = this.u;
        ((te) zb1Var.getValue()).a.setPath(reVar.a, false);
        float length = ((te) zb1Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((te) zb1Var.getValue()).a(f4, f5, this.s);
            return;
        }
        re reVarA = this.t;
        if (reVarA == null) {
            reVarA = ue.a();
            this.t = reVarA;
        }
        reVarA.g();
        ((te) zb1Var.getValue()).a(f4, length, reVarA);
        re.a(this.s, reVarA);
        reVarA.g();
        ((te) zb1Var.getValue()).a(0.0f, f5, reVarA);
        re.a(this.s, reVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
