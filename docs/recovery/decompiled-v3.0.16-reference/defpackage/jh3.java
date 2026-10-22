package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jh3 extends eh3 {
    public final vw0 b;
    public String c;
    public boolean d;
    public final fg0 e;
    public au0 f;
    public final w52 g;
    public rr h;
    public final w52 i;
    public long j;
    public float k;
    public float l;
    public final ih3 m;

    public jh3(vw0 vw0Var) {
        this.b = vw0Var;
        vw0Var.i = new ih3(this, 0);
        this.c = "";
        this.d = true;
        this.e = new fg0();
        this.f = x30.D;
        this.g = ke0.H(null);
        this.i = ke0.H(new cw2(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new ih3(this, 1);
    }

    @Override // defpackage.eh3
    public final void a(jg0 jg0Var) {
        e(jg0Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    public final void e(jg0 jg0Var, float f, rr rrVar) {
        int i;
        rr rrVar2;
        td tdVarA;
        char c;
        long j;
        long jC;
        rr rrVar3;
        int i2;
        int i3;
        vw0 vw0Var = this.b;
        boolean z = vw0Var.d;
        w52 w52Var = this.g;
        if (!z || vw0Var.e == 16) {
            i = 0;
        } else {
            rr rrVar4 = (rr) w52Var.getValue();
            int i4 = nh3.a;
            if (!(rrVar4 instanceof rr) ? rrVar4 == null : (i3 = rrVar4.c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(rrVar instanceof rr) ? rrVar == null : (i2 = rrVar.c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        fg0 fg0Var = this.e;
        if (z2 || !cw2.a(this.j, jg0Var.a())) {
            if (i == 1) {
                jC = vw0Var.e;
                int i5 = nh3.a;
                if (hz.d(jC) != 1.0f) {
                    jC = hz.c(1.0f, jC);
                }
                rrVar2 = new rr(5, jC);
            } else {
                rrVar2 = null;
            }
            this.h = rrVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() >> 32));
            w52 w52Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((cw2) w52Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) / Float.intBitsToFloat((int) (((cw2) w52Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (jg0Var.a() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L))))) & 4294967295L);
            qa1 layoutDirection = jg0Var.getLayoutDirection();
            tdVarA = (td) fg0Var.c;
            ga gaVar = (ga) fg0Var.d;
            if (tdVarA != null || gaVar == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = tdVarA.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || fg0Var.a != i) {
                }
                fg0Var.b = jCeil;
                xv xvVar = (xv) fg0Var.e;
                wv wvVar = xvVar.e;
                long J = mc0.J(jCeil);
                xb0 xb0Var = wvVar.a;
                qa1 qa1Var = wvVar.b;
                vv vvVar = wvVar.c;
                ga gaVar2 = gaVar;
                long j2 = wvVar.d;
                wvVar.a = jg0Var;
                wvVar.b = layoutDirection;
                wvVar.c = gaVar2;
                wvVar.d = J;
                gaVar2.l();
                jg0.c0(xvVar, hz.b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.invoke(xvVar);
                gaVar2.i();
                wvVar.a = xb0Var;
                wvVar.b = qa1Var;
                wvVar.c = vvVar;
                wvVar.d = j2;
                tdVarA.a.prepareToDraw();
                this.d = false;
                this.j = jg0Var.a();
            }
            tdVarA = mh0.a((int) (jCeil >> c), (int) (jCeil & j), i);
            Canvas canvas = ha.a;
            gaVar = new ga();
            gaVar.a = new Canvas(n51.l(tdVarA));
            fg0Var.c = tdVarA;
            fg0Var.d = gaVar;
            fg0Var.a = i;
            fg0Var.b = jCeil;
            xv xvVar2 = (xv) fg0Var.e;
            wv wvVar2 = xvVar2.e;
            long J2 = mc0.J(jCeil);
            xb0 xb0Var2 = wvVar2.a;
            qa1 qa1Var2 = wvVar2.b;
            vv vvVar2 = wvVar2.c;
            ga gaVar3 = gaVar;
            long j3 = wvVar2.d;
            wvVar2.a = jg0Var;
            wvVar2.b = layoutDirection;
            wvVar2.c = gaVar3;
            wvVar2.d = J2;
            gaVar3.l();
            jg0.c0(xvVar2, hz.b, 0L, 0L, 0.0f, null, 0, 62);
            this.m.invoke(xvVar2);
            gaVar3.i();
            wvVar2.a = xb0Var2;
            wvVar2.b = qa1Var2;
            wvVar2.c = vvVar2;
            wvVar2.d = j3;
            tdVarA.a.prepareToDraw();
            this.d = false;
            this.j = jg0Var.a();
        } else {
            td tdVar = (td) fg0Var.c;
            if (i != (tdVar != null ? tdVar.a() : 0)) {
                if (i == 1) {
                    jC = vw0Var.e;
                    int i7 = nh3.a;
                    if (hz.d(jC) != 1.0f) {
                        jC = hz.c(1.0f, jC);
                    }
                    rrVar2 = new rr(5, jC);
                } else {
                    rrVar2 = null;
                }
                this.h = rrVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jg0Var.a() >> 32));
                w52 w52Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((cw2) w52Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) / Float.intBitsToFloat((int) (((cw2) w52Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (jg0Var.a() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L))))) & 4294967295L);
                qa1 layoutDirection2 = jg0Var.getLayoutDirection();
                tdVarA = (td) fg0Var.c;
                ga gaVar4 = (ga) fg0Var.d;
                if (tdVarA != null) {
                    c = ' ';
                    j = 4294967295L;
                    tdVarA = mh0.a((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas2 = ha.a;
                    gaVar4 = new ga();
                    gaVar4.a = new Canvas(n51.l(tdVarA));
                    fg0Var.c = tdVarA;
                    fg0Var.d = gaVar4;
                    fg0Var.a = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    tdVarA = mh0.a((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas3 = ha.a;
                    gaVar4 = new ga();
                    gaVar4.a = new Canvas(n51.l(tdVarA));
                    fg0Var.c = tdVarA;
                    fg0Var.d = gaVar4;
                    fg0Var.a = i;
                }
                fg0Var.b = jCeil2;
                xv xvVar3 = (xv) fg0Var.e;
                wv wvVar3 = xvVar3.e;
                long J3 = mc0.J(jCeil2);
                xb0 xb0Var3 = wvVar3.a;
                qa1 qa1Var3 = wvVar3.b;
                vv vvVar3 = wvVar3.c;
                ga gaVar5 = gaVar4;
                long j4 = wvVar3.d;
                wvVar3.a = jg0Var;
                wvVar3.b = layoutDirection2;
                wvVar3.c = gaVar5;
                wvVar3.d = J3;
                gaVar5.l();
                jg0.c0(xvVar3, hz.b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.invoke(xvVar3);
                gaVar5.i();
                wvVar3.a = xb0Var3;
                wvVar3.b = qa1Var3;
                wvVar3.c = vvVar3;
                wvVar3.d = j4;
                tdVarA.a.prepareToDraw();
                this.d = false;
                this.j = jg0Var.a();
            }
        }
        if (rrVar != null) {
            rrVar3 = rrVar;
        } else {
            rrVar3 = ((rr) w52Var.getValue()) != null ? (rr) w52Var.getValue() : this.h;
        }
        td tdVar2 = (td) fg0Var.c;
        if (tdVar2 == null) {
            p21.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        jg0.q0(jg0Var, tdVar2, fg0Var.b, 0L, f, rrVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        w52 w52Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((cw2) w52Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((cw2) w52Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
