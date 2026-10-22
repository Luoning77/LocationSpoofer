package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d81 extends vg2 implements qu0 {
    public int e;
    public /* synthetic */ y90 f;
    public final /* synthetic */ f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(f fVar, q60 q60Var) {
        super(3, q60Var);
        this.g = fVar;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d81 d81Var = new d81(this.g, (q60) obj3);
        d81Var.f = (y90) obj;
        return d81Var.invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        f fVar = this.g;
        fk fkVar = (fk) fVar.c;
        y90 y90Var = this.f;
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            byte bU = fkVar.u();
            if (bU == 1) {
                return fVar.g(true);
            }
            if (bU == 0) {
                return fVar.g(false);
            }
            if (bU != 6) {
                if (bU == 8) {
                    return fVar.e();
                }
                fk.n(fkVar, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f = null;
            this.e = 1;
            obj = fVar.f(y90Var, this);
            z70 z70Var = z70.e;
            if (obj == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return (JsonElement) obj;
    }
}
