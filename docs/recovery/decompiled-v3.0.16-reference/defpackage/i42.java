package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i42 implements pu0 {
    public final /* synthetic */ dv1 e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ t63 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ lu0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ q93 l;
    public final /* synthetic */ n91 m;
    public final /* synthetic */ m91 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ ak3 r;
    public final /* synthetic */ ix1 s;
    public final /* synthetic */ pu0 t;
    public final /* synthetic */ pu0 u;
    public final /* synthetic */ pu0 v;
    public final /* synthetic */ pu0 w;
    public final /* synthetic */ au2 x;

    public i42(dv1 dv1Var, pu0 pu0Var, boolean z, t63 t63Var, String str, lu0 lu0Var, boolean z2, q93 q93Var, n91 n91Var, m91 m91Var, boolean z3, int i, int i2, ak3 ak3Var, ix1 ix1Var, pu0 pu0Var2, pu0 pu0Var3, pu0 pu0Var4, pu0 pu0Var5, au2 au2Var) {
        this.e = dv1Var;
        this.f = pu0Var;
        this.g = z;
        this.h = t63Var;
        this.i = str;
        this.j = lu0Var;
        this.k = z2;
        this.l = q93Var;
        this.m = n91Var;
        this.n = m91Var;
        this.o = z3;
        this.p = i;
        this.q = i2;
        this.r = ak3Var;
        this.s = ix1Var;
        this.t = pu0Var2;
        this.u = pu0Var3;
        this.v = pu0Var4;
        this.w = pu0Var5;
        this.x = au2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            pu0 pu0Var = this.f;
            dv1 dv1VarG = av1.a;
            if (pu0Var != null) {
                ov0Var.c0(-903490605);
                Object objQ = ov0Var.Q();
                if (objQ == d30.a) {
                    objQ = new yk1(18);
                    ov0Var.m0(objQ);
                }
                dv1 dv1VarA = gs2.a(dv1VarG, true, (lu0) objQ);
                long j = ((je3) ov0Var.j(le3.a)).l.b.c;
                long j2 = yd3.l;
                if ((1095216660480L & j) != 4294967296L) {
                    j = j2;
                }
                dv1VarG = zm3.G(dv1VarA, 0.0f, ((xb0) ov0Var.j(z30.h)).e0(j) / 2.0f, 0.0f, 0.0f, 13);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-903106918);
                ov0Var.p(false);
            }
            dv1 dv1VarD = this.e.d(dv1VarG);
            ov0Var.j(AndroidCompositionLocals_androidKt.a);
            String string = ((Context) ov0Var.j(AndroidCompositionLocals_androidKt.b)).getResources().getString(2131624375);
            if (this.g) {
                dv1VarD = gs2.a(dv1VarD, false, new z90(string, 5));
            }
            dv1 dv1VarA2 = iw2.a(dv1VarD, 280.0f, 56.0f);
            t63 t63Var = this.h;
            boolean z = this.g;
            qy2 qy2Var = new qy2(z ? t63Var.j : t63Var.i);
            pu0 pu0Var2 = this.w;
            au2 au2Var = this.x;
            String str = this.i;
            boolean z2 = this.k;
            boolean z3 = this.o;
            ak3 ak3Var = this.r;
            ix1 ix1Var = this.s;
            xq.a(str, this.j, dv1VarA2, z2, this.l, this.m, this.n, z3, this.p, this.q, ak3Var, null, ix1Var, qy2Var, sb.a0(-1189274459, new h42(str, z2, z3, ak3Var, ix1Var, z, this.f, this.t, this.u, this.v, pu0Var2, t63Var, au2Var), ov0Var), ov0Var, 0, 196608, 4096);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
