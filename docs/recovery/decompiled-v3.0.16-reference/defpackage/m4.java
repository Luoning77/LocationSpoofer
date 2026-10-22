package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class m4 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ au0 f;

    public /* synthetic */ m4(int i, au0 au0Var) {
        this.e = i;
        this.f = au0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.f;
        switch (i) {
            case 0:
                ((l91) obj).getClass();
                au0Var.invoke();
                return mf3Var;
            case 1:
                ((l91) obj).getClass();
                au0Var.invoke();
                return mf3Var;
            case 2:
                ow0 ow0Var = (ow0) obj;
                ow0Var.getClass();
                float fFloatValue = ((Number) au0Var.invoke()).floatValue();
                ow0Var.l(fFloatValue);
                ow0Var.r(fFloatValue);
                return mf3Var;
            case 3:
                ((ow0) obj).d(((Number) au0Var.invoke()).floatValue());
                return mf3Var;
            case 4:
                au0Var.invoke();
                return mf3Var;
            case Logger.WARN /* 5 */:
                au0Var.invoke();
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ss2 ss2Var = (ss2) obj;
                Object objInvoke = au0Var.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                oc2 oc2Var = new oc2(f != null ? f.floatValue() : 0.0f, new fy(0.0f, 1.0f), 0);
                x81[] x81VarArr = qs2.a;
                rs2 rs2Var = os2.c;
                x81 x81Var = qs2.a[1];
                ss2Var.a(rs2Var, oc2Var);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((zk2) obj).getClass();
                return au0Var.invoke();
            case 8:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case mc0.b /* 9 */:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case mc0.c /* 10 */:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case 11:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case mc0.d /* 12 */:
                return (c12) au0Var.invoke();
            case 13:
                ((l91) obj).getClass();
                au0Var.invoke();
                return mf3Var;
            case 14:
                zp0 zp0Var = (zp0) obj;
                zp0Var.getClass();
                if (zp0Var.b()) {
                    au0Var.invoke();
                }
                return mf3Var;
            case a83.e /* 15 */:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case 16:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case 17:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case 18:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            case 19:
                ((Boolean) obj).booleanValue();
                au0Var.invoke();
                return mf3Var;
            default:
                return (c12) au0Var.invoke();
        }
    }
}
