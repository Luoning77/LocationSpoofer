package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vw0 extends eh3 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = hz.g;
    public List f;
    public boolean g;
    public re h;
    public lu0 i;
    public final q9 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public vw0() {
        int i = nh3.a;
        this.f = uj0.e;
        this.g = true;
        this.j = new q9(this, 17);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.eh3
    public final void a(jg0 jg0Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = yq1.a();
                this.b = fArrA;
            } else {
                yq1.d(fArrA);
            }
            yq1.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            yq1.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                re reVarA = this.h;
                if (reVarA == null) {
                    reVarA = ue.a();
                    this.h = reVarA;
                }
                mh0.e0(this.f, reVarA);
            }
            this.g = false;
        }
        gn gnVarX = jg0Var.X();
        long jR = gnVarX.r();
        gnVarX.i().l();
        try {
            gn gnVar = (gn) ((t1) gnVarX.a).f;
            float[] fArr = this.b;
            if (fArr != null) {
                gnVar.i().q(fArr);
            }
            re reVar = this.h;
            if (!this.f.isEmpty() && reVar != null) {
                gnVar.i().s(reVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((eh3) arrayList.get(i)).a(jg0Var);
            }
        } finally {
            p91.v(gnVarX, jR);
        }
    }

    @Override // defpackage.eh3
    public final lu0 b() {
        return this.i;
    }

    @Override // defpackage.eh3
    public final void d(q9 q9Var) {
        this.i = q9Var;
    }

    public final void e(int i, eh3 eh3Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, eh3Var);
        } else {
            arrayList.add(eh3Var);
        }
        g(eh3Var);
        eh3Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = nh3.a;
            if (hz.h(j2) == hz.h(j) && hz.g(j2) == hz.g(j) && hz.e(j2) == hz.e(j)) {
                return;
            }
            this.d = false;
            this.e = hz.g;
        }
    }

    public final void g(eh3 eh3Var) {
        if (!(eh3Var instanceof k62)) {
            if (eh3Var instanceof vw0) {
                vw0 vw0Var = (vw0) eh3Var;
                if (vw0Var.d && this.d) {
                    f(vw0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = hz.g;
                    return;
                }
            }
            return;
        }
        k62 k62Var = (k62) eh3Var;
        st stVar = k62Var.b;
        if (this.d && stVar != null) {
            if (stVar instanceof qy2) {
                f(((qy2) stVar).a);
            } else {
                this.d = false;
                this.e = hz.g;
            }
        }
        st stVar2 = k62Var.g;
        if (this.d && stVar2 != null) {
            if (stVar2 instanceof qy2) {
                f(((qy2) stVar2).a);
            } else {
                this.d = false;
                this.e = hz.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eh3 eh3Var = (eh3) arrayList.get(i);
            sb.append("\t");
            sb.append(eh3Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
