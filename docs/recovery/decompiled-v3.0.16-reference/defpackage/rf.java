package defpackage;

import com.vincenthzr.locationspoofer.data.motion.MotionController;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class rf implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ rf(ld1 ld1Var, Object obj, int i, Object obj2, int i2) {
        this.e = 9;
        this.h = ld1Var;
        this.i = obj;
        this.g = i;
        this.f = obj2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        int i2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.i;
        mf3 mf3Var = mf3.a;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ji2.s((f12) obj5, (l9) obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                da0.j((dv1) obj5, (cd2) obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((p10) obj3).h(obj5, obj4, (f30) obj, wc0.m0(i2) | 1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                n60.b((dv1) obj5, (k60) obj4, (lu0) obj3, (f30) obj, wc0.m0(1), this.g);
                break;
            case 4:
                ((Integer) obj2).getClass();
                n60.a((k60) obj5, (dv1) obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                sb.H((au0) obj5, (qc0) obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).intValue();
                eb0.c((k63) obj5, (y53) obj4, (au0) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((Integer) obj2).getClass();
                wo0.e((j52) obj5, (lu0) obj4, (au0) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                wo0.f((MotionController.State) obj5, (j52) obj4, (lu0) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case mc0.b /* 9 */:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(1);
                dh0.e((ld1) obj5, this.i, this.g, this.f, (f30) obj, iM0);
                break;
            case mc0.c /* 10 */:
                ((Integer) obj2).getClass();
                ((be1) obj5).e(obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((rl2) obj5).e(obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((a93) obj5).b((Object[]) obj4, (lu0) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ rf(p10 p10Var, Object obj, Object obj2, int i) {
        this.e = 2;
        this.f = p10Var;
        this.h = obj;
        this.i = obj2;
        this.g = i;
    }

    public /* synthetic */ rf(dv1 dv1Var, k60 k60Var, lu0 lu0Var, int i, int i2) {
        this.e = 3;
        this.h = dv1Var;
        this.i = k60Var;
        this.f = lu0Var;
        this.g = i2;
    }

    public /* synthetic */ rf(Object obj, Object obj2, xu0 xu0Var, int i, int i2) {
        this.e = i2;
        this.h = obj;
        this.i = obj2;
        this.f = xu0Var;
        this.g = i;
    }
}
