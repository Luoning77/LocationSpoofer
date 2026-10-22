package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l20 extends vg2 implements pu0 {
    public int e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ m20 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(m20 m20Var, q60 q60Var) {
        super(2, q60Var);
        this.j = m20Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        l20 l20Var = new l20(this.j, q60Var);
        l20Var.i = obj;
        return l20Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((l20) create((ws2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ws2 ws2Var;
        int i;
        int i2;
        int i3;
        String strL;
        int i4;
        int i5;
        String str;
        m20 m20Var = this.j;
        sx1 sx1Var = m20Var.e;
        fx1 fx1Var = m20Var.g;
        int i6 = this.h;
        if (i6 == 0) {
            ee0.J(obj);
            ws2Var = (ws2) this.i;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.g;
            i2 = this.f;
            i3 = this.e;
            ws2Var = (ws2) this.i;
            ee0.J(obj);
        }
        if (i3 >= Math.min(m20Var.h + 10, fx1Var.b)) {
            return mf3.a;
        }
        int i7 = i3 + 1;
        int iC = fx1Var.c(i3);
        switch (iC) {
            case 0:
                strL = "up";
                break;
            case 1:
                Object objF = sx1Var.f(i2);
                i2++;
                strL = "down " + objF;
                break;
            case 2:
                strL = "remove " + fx1Var.c(i7) + ' ' + fx1Var.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strL = "move " + fx1Var.c(i7) + ' ' + fx1Var.c(i3 + 2) + ' ' + fx1Var.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strL = "clear";
                break;
            case Logger.WARN /* 5 */:
                i4 = i3 + 2;
                int iC2 = fx1Var.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC2 + ' ' + sx1Var.f(i2);
                int i8 = i4;
                strL = str;
                i7 = i8;
                i2 = i5;
                break;
            case Logger.ERROR /* 6 */:
                i4 = i3 + 2;
                int iC3 = fx1Var.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC3 + ' ' + sx1Var.f(i2);
                int i9 = i4;
                strL = str;
                i7 = i9;
                i2 = i5;
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                Object objF2 = sx1Var.f(i2);
                objF2.getClass();
                da0.o(2, objF2);
                i2 += 2;
                strL = "apply " + ((pu0) objF2);
                break;
            case 8:
                strL = "reuse " + m20Var.f.f(i);
                i++;
                break;
            case mc0.b /* 9 */:
                strL = "recompose pending";
                break;
            default:
                strL = p91.l(iC, "unknown op: ");
                break;
        }
        this.i = ws2Var;
        this.e = i7;
        this.f = i2;
        this.g = i;
        this.h = 1;
        ws2Var.a(i3 + ": " + strL, this);
        return z70.e;
    }
}
