package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wa extends aa1 implements lu0 {
    public static final wa A;
    public static final wa B;
    public static final wa C;
    public static final wa D;
    public static final wa E;
    public static final wa F;
    public static final wa G;
    public static final wa H;
    public static final wa I;
    public static final wa J;
    public static final wa g;
    public static final wa h;
    public static final wa i;
    public static final wa j;
    public static final wa k;
    public static final wa l;
    public static final wa m;
    public static final wa n;
    public static final wa o;
    public static final wa p;
    public static final wa q;
    public static final wa r;
    public static final wa s;
    public static final wa t;
    public static final wa u;
    public static final wa v;
    public static final wa w;
    public static final wa x;
    public static final wa y;
    public static final wa z;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new wa(i2, 0);
        h = new wa(i2, 1);
        i = new wa(i2, 2);
        j = new wa(i2, 3);
        k = new wa(i2, 4);
        l = new wa(i2, 5);
        m = new wa(i2, 6);
        n = new wa(i2, 7);
        o = new wa(i2, 8);
        p = new wa(i2, 9);
        q = new wa(i2, 10);
        r = new wa(i2, 11);
        s = new wa(i2, 12);
        t = new wa(i2, 13);
        u = new wa(i2, 14);
        v = new wa(i2, 15);
        w = new wa(i2, 16);
        x = new wa(i2, 17);
        y = new wa(i2, 18);
        z = new wa(i2, 19);
        A = new wa(i2, 20);
        B = new wa(i2, 21);
        C = new wa(i2, 22);
        D = new wa(i2, 23);
        E = new wa(i2, 24);
        F = new wa(i2, 25);
        G = new wa(i2, 26);
        H = new wa(i2, 27);
        I = new wa(i2, 28);
        J = new wa(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i2 = this.f;
        mf3 mf3Var = mf3.a;
        switch (i2) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((js2) obj).k().e.c(os2.B));
            case 2:
                l72 l72Var = (l72) obj;
                hh0 hh0Var = AndroidCompositionLocals_androidKt.a;
                l72Var.getClass();
                ji2.P(l72Var, hh0Var);
                return ((Context) ji2.P(l72Var, AndroidCompositionLocals_androidKt.b)).getResources();
            case 3:
                return Boolean.valueOf(((js2) obj).k().e.c(os2.B));
            case 4:
                x81[] x81VarArr = qs2.a;
                ((ss2) obj).a(os2.y, mf3Var);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((Number) obj).longValue();
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                x81[] x81VarArr2 = qs2.a;
                ((ss2) obj).a(os2.x, mf3Var);
                return mf3Var;
            case 8:
                return mf3Var;
            case mc0.b /* 9 */:
                eh ehVar = (eh) obj;
                ehVar.getHandler().post(new ma(4, ehVar.v));
                return mf3Var;
            case mc0.c /* 10 */:
                return mf3Var;
            case 11:
                return mf3Var;
            case mc0.d /* 12 */:
                return mf3Var;
            case 13:
                return obj;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case a83.e /* 15 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 16:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 17:
                l81 l81Var = (l81) obj;
                l81Var.getClass();
                return m81.a(l81Var);
            case 18:
                long jB = hz.b(((hz) obj).a, qz.x);
                return new xi(hz.d(jB), hz.h(jB), hz.g(jB), hz.e(jB));
            case 19:
                ((Number) obj).longValue();
                return mf3Var;
            case 20:
                w20 w20Var = (w20) obj;
                hb1 hb1Var = w20Var instanceof hb1 ? (hb1) w20Var : null;
                if (hb1Var != null && hb1Var.V) {
                    p21.c("Apply is called on deactivated node " + w20Var);
                }
                return mf3Var;
            case 21:
                return Boolean.valueOf(!(((bv1) obj) instanceof b30));
            case 22:
                l72 l72Var2 = (l72) obj;
                hh0 hh0Var2 = z30.o;
                l72Var2.getClass();
                return (rh1) zy.m0((Iterable) ji2.P(l72Var2, hh0Var2));
            case 23:
                float[] fArr = ((yq1) obj).a;
                return mf3Var;
            case 24:
                float[] fArr2 = ((yq1) obj).a;
                return mf3Var;
            case 25:
                return Boolean.valueOf(ks.K(obj));
            case 26:
                long j2 = ((ac3) obj).a;
                return new vi(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 27:
                vi viVar = (vi) obj;
                return new ac3(x63.a(viVar.a, viVar.b));
            case 28:
                return o51.D(0.0f, 0.0f, null, 7);
            default:
                long j3 = ((p41) obj).a;
                return new p41(0L);
        }
    }
}
