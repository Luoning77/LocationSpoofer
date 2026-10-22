package defpackage;

import kotlinx.coroutines.CoroutineContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ty implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ty(x73 x73Var, boolean z, int i) {
        this.e = 1;
        this.g = x73Var;
        this.f = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        boolean z = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ul1 ul1Var = (ul1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z2 = !z;
                    boolean zH = ov0Var.h(ul1Var);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == d30.a) {
                        t4 t4Var = new t4(0, ul1Var, on1.class, "skipCollectionInfo", "skipCollectionInfo(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 11);
                        ov0Var.m0(t4Var);
                        objQ = t4Var;
                    }
                    n51.j((au0) ((o81) objQ), null, z2, null, null, null, ji2.a, ov0Var, 805306368, 506);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                ((Integer) obj2).getClass();
                k22.h((x73) obj3, z, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 2:
                return CoroutineContextKt.foldCopies$lambda$1((we2) obj3, z, (y70) obj, (w70) obj2);
            case 3:
                ba1 ba1Var = (ba1) obj3;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dv1 dv1VarD = zm3.D(av1.a, 16.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var2, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var2, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var2, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var2, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var2, ghVar4, dv1VarH);
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var2, 0);
                    int iHashCode2 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, wb1Var);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, yzVarA);
                    q73.h(ov0Var2, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH2);
                    String str = ba1Var.c;
                    long jC = v63.c(16);
                    jr0 jr0Var = jr0.h;
                    if (z) {
                        ov0Var2.c0(1018338724);
                        ov0Var2.p(false);
                        j = bk.g;
                    } else {
                        ov0Var2.c0(1018340070);
                        j = ((kz) ov0Var2.j(mz.a)).o;
                        ov0Var2.p(false);
                    }
                    s83.b(str, null, j, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                    s83.b(ba1Var.a, null, hz.c(0.6f, ((kz) ov0Var2.j(mz.a)).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                    ov0Var2.p(true);
                    if (z) {
                        ov0Var2.c0(-1661370013);
                        ig0.c(true, null, false, ke0.q(bk.g, ov0Var2), ov0Var2, 54, 44);
                    } else {
                        ov0Var2.c0(-1666823874);
                    }
                    ov0Var2.p(false);
                    ov0Var2.p(true);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            default:
                jg0 jg0Var = (jg0) obj;
                sw2 sw2Var = sw2.a;
                jg0.Y(jg0Var, ((mw2) obj3).a(z, true), jg0Var.R(sw2.b) / 2.0f, ((c12) obj2).a, null, 120);
                return mf3Var;
        }
    }

    public /* synthetic */ ty(Object obj, boolean z, int i) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }

    public /* synthetic */ ty(boolean z, Object obj, int i) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }
}
