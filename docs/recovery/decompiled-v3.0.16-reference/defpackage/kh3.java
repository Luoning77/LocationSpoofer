package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kh3 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ kh3(int i) {
        this.e = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                vi viVar = (vi) obj;
                int iRound = Math.round(viVar.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(viVar.b);
                return new p41((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 1:
                pe2 pe2Var = (pe2) obj;
                return new xi(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d);
            case 2:
                xi xiVar = (xi) obj;
                return new pe2(xiVar.a, xiVar.b, xiVar.c, xiVar.d);
            case 3:
                return Float.valueOf(((ui) obj).a);
            case 4:
                iv1 iv1Var = (iv1) obj;
                iv1Var.getClass();
                yg3 yg3Var = new yg3(1);
                ox oxVarA = xe2.a(is1.class);
                j13 j13Var = mn2.i;
                t91 t91Var = t91.f;
                iv1Var.a(new nm0(new ir(j13Var, oxVarA, yg3Var, t91Var)));
                iv1Var.a(new nm0(new ir(j13Var, xe2.a(l6.class), new yg3(2), t91Var)));
                iv1Var.a(new nm0(new ir(j13Var, xe2.a(ul1.class), new yg3(3), t91Var)));
                iv1Var.a(new nm0(new ir(j13Var, xe2.a(xg3.class), new yg3(4), t91Var)));
                iv1Var.a(new nm0(new ir(j13Var, xe2.a(lo1.class), new yg3(5), t91Var)));
                return mf3.a;
            case Logger.WARN /* 5 */:
                return ((ul3) obj).l;
            case Logger.ERROR /* 6 */:
                return ((ul3) obj).f;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((ul3) obj).c;
            case 8:
                return ((ul3) obj).e;
            default:
                bm3 bm3Var = (bm3) obj;
                bm3Var.getClass();
                return bm3Var;
        }
    }
}
