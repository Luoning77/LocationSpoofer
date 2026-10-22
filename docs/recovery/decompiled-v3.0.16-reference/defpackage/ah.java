package defpackage;

import android.graphics.Canvas;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ah extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(bj3 bj3Var, hb1 hb1Var, bj3 bj3Var2) {
        super(1);
        this.f = 0;
        this.g = bj3Var;
        this.i = hb1Var;
        this.h = bj3Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) throws Throwable {
        hg0 hg0Var;
        int i = this.f;
        ac3Var = null;
        ac3 ac3Var = null;
        mf3 mf3Var = mf3.a;
        boolean zBooleanValue = false;
        Object[] objArr = 0;
        Object obj2 = this.h;
        Object obj3 = this.i;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                bj3 bj3Var = (bj3) obj4;
                hb1 hb1Var = (hb1) obj3;
                bj3 bj3Var2 = (bj3) obj2;
                vv vvVarI = ((jg0) obj).X().i();
                if (bj3Var.getView().getVisibility() != 8) {
                    bj3Var.C = true;
                    t42 t42Var = hb1Var.s;
                    db dbVar = t42Var instanceof db ? (db) t42Var : null;
                    if (dbVar != null) {
                        Canvas canvasA = ha.a(vvVarI);
                        dbVar.getAndroidViewsHandler$ui().getClass();
                        bj3Var2.draw(canvasA);
                    }
                    bj3Var.C = false;
                }
                return mf3Var;
            case 1:
                return new sh((fy2) obj4, obj2, (ei) obj3, objArr == true ? 1 : 0);
            case 2:
                bq bqVar = (bq) obj3;
                ((x12) obj4).a((df1) obj2, bqVar);
                return new h8(bqVar, 4);
            case 3:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((ps) obj4).b.d.getValue()).booleanValue() ? (pe2) obj2 : (pe2) obj3;
            case 4:
                tc3 tc3Var = (tc3) obj;
                be0 be0Var = (be0) tc3Var;
                if (!((oc) ((db) xp1.P((be0) obj2)).m17getDragAndDropManager()).b.contains(be0Var) || !ce0.l(be0Var, ee0.A((t1) obj3))) {
                    return sc3.e;
                }
                ((we2) obj4).e = tc3Var;
                return sc3.g;
            case Logger.WARN /* 5 */:
                ow0 ow0Var = (ow0) obj;
                s03 s03Var = (s03) obj2;
                s03 s03Var2 = (s03) obj4;
                ow0Var.d(s03Var2 != null ? ((Number) s03Var2.getValue()).floatValue() : 1.0f);
                ow0Var.l(s03Var != null ? ((Number) s03Var.getValue()).floatValue() : 1.0f);
                ow0Var.r(s03Var != null ? ((Number) s03Var.getValue()).floatValue() : 1.0f);
                s03 s03Var3 = (s03) obj3;
                ow0Var.o0(s03Var3 != null ? ((ac3) s03Var3.getValue()).a : ac3.b);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                lm0 lm0Var = (lm0) obj3;
                int iOrdinal = ((ck0) obj).ordinal();
                if (iOrdinal == 0) {
                    nc3 nc3Var = lm0Var.a;
                } else if (iOrdinal == 1) {
                    ac3Var = (ac3) obj4;
                } else {
                    if (iOrdinal != 2) {
                        b81.d();
                        return null;
                    }
                    nc3 nc3Var2 = lm0Var.a;
                }
                return new ac3(ac3Var != null ? ac3Var.a : ac3.b);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                dq0 dq0Var = (dq0) obj;
                if (!o51.f(dq0Var, (dq0) obj4)) {
                    if (o51.f(dq0Var, ((rp0) obj2).c)) {
                        fo.n("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((lu0) obj3).invoke(dq0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 8:
                jg0 jg0Var = (jg0) obj;
                jb1 jb1Var = (jb1) obj4;
                xv xvVar = jb1Var.e;
                hg0 hg0Var2 = jb1Var.f;
                jb1Var.f = (hg0) obj2;
                try {
                    xb0 xb0VarL = jg0Var.X().l();
                    qa1 qa1VarQ = jg0Var.X().q();
                    vv vvVarI2 = jg0Var.X().i();
                    long jR = jg0Var.X().r();
                    kw0 kw0Var = (kw0) jg0Var.X().b;
                    lu0 lu0Var = (lu0) obj3;
                    xb0 xb0VarL2 = xvVar.f.l();
                    qa1 qa1VarQ2 = xvVar.f.q();
                    vv vvVarI3 = xvVar.f.i();
                    long jR2 = xvVar.f.r();
                    gn gnVar = xvVar.f;
                    try {
                        kw0 kw0Var2 = (kw0) gnVar.b;
                        gnVar.D(xb0VarL);
                        gnVar.E(qa1VarQ);
                        gnVar.C(vvVarI2);
                        gnVar.F(jR);
                        gnVar.b = kw0Var;
                        vvVarI2.l();
                        try {
                            lu0Var.invoke(jb1Var);
                            vvVarI2.i();
                            gn gnVar2 = xvVar.f;
                            gnVar2.D(xb0VarL2);
                            gnVar2.E(qa1VarQ2);
                            gnVar2.C(vvVarI3);
                            gnVar2.F(jR2);
                            gnVar2.b = kw0Var2;
                            jb1Var.f = hg0Var2;
                            return mf3Var;
                        } catch (Throwable th) {
                            hg0Var = hg0Var2;
                            try {
                                vvVarI2.i();
                                gn gnVar3 = xvVar.f;
                                gnVar3.D(xb0VarL2);
                                gnVar3.E(qa1VarQ2);
                                gnVar3.C(vvVarI3);
                                gnVar3.F(jR2);
                                gnVar3.b = kw0Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                jb1Var.f = hg0Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        hg0Var = hg0Var2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    hg0Var = hg0Var2;
                }
                break;
            default:
                g82 g82Var = (g82) obj;
                pa1 pa1VarH = g82Var.h();
                if (pa1VarH != null) {
                    boolean zJ = ((gr1) obj4).J();
                    wu2 wu2Var = ((bv2) obj2).s;
                    if (zJ) {
                        wu2Var.j = pa1VarH;
                    } else {
                        wu2Var.i = pa1VarH;
                    }
                }
                g82.z(g82Var, (h82) obj3, 0, 0);
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
