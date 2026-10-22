package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dw1 extends e02 {
    public final t1 f;
    public final Channel g;
    public Job h;

    public dw1(wo2 wo2Var, t1 t1Var, o10 o10Var, xb0 xb0Var) {
        super(wo2Var, o10Var, xb0Var);
        this.f = t1Var;
        this.g = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(dw1 dw1Var, we2 we2Var, te2 te2Var, wo2 wo2Var, we2 we2Var2, long j, r60 r60Var) {
        cw1 cw1Var;
        te2 te2Var2;
        wo2 wo2Var2;
        we2 we2Var3;
        boolean z;
        if (r60Var instanceof cw1) {
            cw1Var = (cw1) r60Var;
            int i = cw1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cw1Var.k = i - Integer.MIN_VALUE;
            } else {
                cw1Var = new cw1(r60Var);
            }
        } else {
            cw1Var = new cw1(r60Var);
        }
        Object objWithTimeoutOrNull = cw1Var.j;
        int i2 = cw1Var.k;
        q60 q60Var = null;
        if (i2 == 0) {
            ee0.J(objWithTimeoutOrNull);
            if (j < 0) {
                return Boolean.FALSE;
            }
            d6 d6Var = new d6(dw1Var, q60Var, 14);
            cw1Var.e = dw1Var;
            cw1Var.f = we2Var;
            cw1Var.g = te2Var;
            cw1Var.h = wo2Var;
            cw1Var.i = we2Var2;
            cw1Var.k = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, d6Var, cw1Var);
            z70 z70Var = z70.e;
            if (objWithTimeoutOrNull == z70Var) {
                return z70Var;
            }
            te2Var2 = te2Var;
            wo2Var2 = wo2Var;
            we2Var3 = we2Var2;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2 we2Var4 = cw1Var.i;
            wo2 wo2Var3 = cw1Var.h;
            te2Var2 = cw1Var.g;
            we2 we2Var5 = cw1Var.f;
            dw1 dw1Var2 = cw1Var.e;
            ee0.J(objWithTimeoutOrNull);
            we2Var3 = we2Var4;
            wo2Var2 = wo2Var3;
            we2Var = we2Var5;
            dw1Var = dw1Var2;
        }
        zv1 zv1Var = (zv1) objWithTimeoutOrNull;
        if (zv1Var != null) {
            boolean z2 = ((zv1) we2Var.e).c;
            long j2 = zv1Var.a;
            we2Var.e = new zv1(j2, zv1Var.b, z2);
            te2Var2.e = wo2Var2.i(wo2Var2.e(j2));
            we2Var3.e = am1.a(30, 0.0f);
            d31 d31Var = dw1Var.e;
            long j3 = zv1Var.b;
            long j4 = zv1Var.a;
            ((ai3) d31Var.f).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((ai3) d31Var.g).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !wc0.Q(te2Var2.e);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zv1 g(Channel channel) {
        zv1 zv1Var = null;
        vs2 vs2VarV = dh0.v(new nr0(new yv1(channel, 0), 0 == true ? 1 : 0, 2));
        while (vs2VarV.hasNext()) {
            zv1 zv1VarA = (zv1) vs2VarV.next();
            if (zv1Var != null) {
                zv1VarA = zv1Var.a(zv1VarA);
            }
            zv1Var = zv1VarA;
        }
        return zv1Var;
    }

    public final float c(uo2 uo2Var, float f) {
        wo2 wo2Var = this.a;
        long jH = wo2Var.h(wo2Var.d(f));
        wo2 wo2Var2 = uo2Var.a;
        return wo2Var.g(wo2Var.e(wo2Var2.c(wo2Var2.k, jH, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(wo2 wo2Var, zv1 zv1Var, float f, float f2, r60 r60Var) {
        aw1 aw1Var;
        mf3 mf3Var;
        Object obj;
        te2 te2Var;
        float f3;
        wo2 wo2Var2;
        if (r60Var instanceof aw1) {
            aw1Var = (aw1) r60Var;
            int i = aw1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw1Var.j = i - Integer.MIN_VALUE;
            } else {
                aw1Var = new aw1(this, r60Var);
            }
        } else {
            aw1Var = new aw1(this, r60Var);
        }
        aw1 aw1Var2 = aw1Var;
        Object obj2 = aw1Var2.h;
        int i2 = aw1Var2.j;
        d31 d31Var = this.e;
        mf3 mf3Var2 = mf3.a;
        Object obj3 = z70.e;
        if (i2 == 0) {
            we2 we2VarJ = p91.j(obj2);
            we2VarJ.e = zv1Var;
            mf3Var = mf3Var2;
            long j = zv1Var.b;
            long j2 = zv1Var.a;
            ((ai3) d31Var.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((ai3) d31Var.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            zv1 zv1VarG = g(this.g);
            if (zv1VarG != null) {
                long j3 = zv1VarG.b;
                long j4 = zv1VarG.a;
                ((ai3) d31Var.f).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((ai3) d31Var.g).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                we2VarJ.e = ((zv1) we2VarJ.e).a(zv1VarG);
            }
            te2 te2Var2 = new te2();
            float fG = wo2Var.g(wo2Var.e(((zv1) we2VarJ.e).a));
            te2Var2.e = fG;
            if (!wc0.Q(fG)) {
                we2 we2Var = new we2();
                we2Var.e = am1.a(30, 0.0f);
                obj = obj3;
                pu0 bw1Var = new bw1(te2Var2, we2Var, we2VarJ, f, this, f2, wo2Var, null);
                aw1Var2.e = wo2Var;
                aw1Var2.f = te2Var2;
                aw1Var2.g = f2;
                aw1Var2.j = 1;
                if (b(bw1Var, aw1Var2) != obj) {
                    te2Var = te2Var2;
                    f3 = f2;
                    wo2Var2 = wo2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ee0.J(obj2);
                return mf3Var2;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = aw1Var2.g;
        te2Var = aw1Var2.f;
        wo2Var2 = aw1Var2.e;
        ee0.J(obj2);
        obj = obj3;
        mf3Var = mf3Var2;
        long jC = g93.c(((ai3) d31Var.f).b(Float.MAX_VALUE), ((ai3) d31Var.g).b(Float.MAX_VALUE));
        if (jC == 0) {
            float fD = wo2Var2.d(Math.signum(te2Var.e)) * Math.min(Math.abs(te2Var.e) / 100.0f, f3) * 1000.0f;
            if (fD == 0.0f) {
                jC = 0;
            } else {
                jC = wo2Var2.d == x32.f ? g93.c(fD, 0.0f) : g93.c(0.0f, fD);
            }
        }
        yh3 yh3Var = new yh3(jC);
        aw1Var2.e = null;
        aw1Var2.f = null;
        aw1Var2.j = 2;
        return this.b.invoke(yh3Var, aw1Var2) == obj ? obj : mf3Var;
    }

    public final boolean f(p92 p92Var) {
        long j;
        xb0 xb0Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.f;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : xb0Var.R(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : xb0Var.R(64.0f));
        List list = p92Var.a;
        c12 c12Var = new c12(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = c12Var.a;
            if (i2 >= size) {
                break;
            }
            c12Var = new c12(c12.e(j, ((x92) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        wo2 wo2Var = this.a;
        float fI = wo2Var.i(wo2Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            qo2 qo2Var = wo2Var.a;
            zC = fI > 0.0f ? qo2Var.c() : qo2Var.a();
        }
        if (zC) {
            return ChannelResult.m56isSuccessimpl(this.g.mo32trySendJP2dKIU(new zv1(jFloatToRawIntBits, ((x92) zy.n0(p92Var.a)).b, false)));
        }
        return this.d;
    }
}
