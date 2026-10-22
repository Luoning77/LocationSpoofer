package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vi1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;

    public /* synthetic */ vi1(int i, lu0 lu0Var) {
        this.e = i;
        this.f = lu0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        ml1 ml1Var = ml1.f;
        ml1 ml1Var2 = ml1.h;
        ml1 ml1Var3 = ml1.g;
        mf3 mf3Var = mf3.a;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                lu0Var.invoke(new jz2(true));
                break;
            case 1:
                lu0Var.invoke(new iz2(true));
                break;
            case 2:
                lu0Var.invoke(new nz2(true));
                break;
            case 3:
                lu0Var.invoke(new kz2(true));
                break;
            case 4:
                lu0Var.invoke(new lz2(true));
                break;
            case Logger.WARN /* 5 */:
                lu0Var.invoke(new kz2(false));
                break;
            case Logger.ERROR /* 6 */:
                lu0Var.invoke(new kz2(true));
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                lu0Var.invoke(new lz2(true));
                break;
            case 8:
                lu0Var.invoke(new jz2(false));
                break;
            case mc0.b /* 9 */:
                lu0Var.invoke(new nz2(false));
                break;
            case mc0.c /* 10 */:
                lu0Var.invoke(new iz2(false));
                break;
            case 11:
                lu0Var.invoke(ml1Var3);
                break;
            case mc0.d /* 12 */:
                lu0Var.invoke(ml1Var);
                break;
            case 13:
                lu0Var.invoke(ml1Var3);
                break;
            case 14:
                lu0Var.invoke(ml1Var2);
                break;
            case a83.e /* 15 */:
                lu0Var.invoke(ml1Var);
                break;
            case 16:
                lu0Var.invoke(ml1Var2);
                break;
            case 17:
                lu0Var.invoke(ml1Var3);
                break;
            case 18:
                lu0Var.invoke(ml1Var3);
                break;
            case 19:
                lu0Var.invoke(ml1.p);
                break;
            case 20:
                lu0Var.invoke(ml1.q);
                break;
            case 21:
                lu0Var.invoke(ml1.n);
                break;
            case 22:
                lu0Var.invoke(ml1Var3);
                break;
            case 23:
                lu0Var.invoke(ml1Var2);
                break;
            case 24:
                lu0Var.invoke(ml1.j);
                break;
            case 25:
                lu0Var.invoke(ml1.k);
                break;
            case 26:
                lu0Var.invoke(ml1.l);
                break;
            case 27:
                lu0Var.invoke(ml1.m);
                break;
            case 28:
                lu0Var.invoke(ml1.u);
                break;
            default:
                lu0Var.invoke(ml1.t);
                break;
        }
        return mf3Var;
    }
}
