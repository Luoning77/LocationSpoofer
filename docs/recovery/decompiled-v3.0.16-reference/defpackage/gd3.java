package defpackage;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gd3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ld3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd3(ld3 ld3Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = ld3Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        ld3 ld3Var = this.h;
        switch (i) {
            case 0:
                gd3 gd3Var = new gd3(ld3Var, q60Var, 0);
                gd3Var.g = obj;
                return gd3Var;
            default:
                gd3 gd3Var2 = new gd3(ld3Var, q60Var, 1);
                gd3Var2.g = obj;
                return gd3Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((gd3) create((z52) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((gd3) create((xb3) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        xb3 xb3Var;
        int i = this.e;
        ld3 ld3Var = this.h;
        z70 z70Var = z70.e;
        q60 q60Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                z52 z52Var = (z52) this.g;
                this.f = 1;
                Object objA = ld3Var.a(z52Var, this);
                return objA == z70Var ? z70Var : objA;
            default:
                int i3 = this.f;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            xb3Var = (xb3) this.g;
                            ee0.J(obj);
                        } else {
                            if (i3 != 2) {
                                fo.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ee0.J(obj);
                        }
                        return (Set) obj;
                    }
                    ee0.J(obj);
                    xb3Var = (xb3) this.g;
                    this.g = xb3Var;
                    this.f = 1;
                    obj = xb3Var.c(this);
                    if (obj == z70Var) {
                        return z70Var;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wb3 wb3Var = wb3.f;
                        gd3 gd3Var = new gd3(ld3Var, q60Var, 0);
                        this.g = null;
                        this.f = 2;
                        obj = xb3Var.a(wb3Var, gd3Var, this);
                        if (obj == z70Var) {
                            return z70Var;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return zj0.e;
        }
    }
}
