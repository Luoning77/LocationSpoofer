package defpackage;

import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lm1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ul1 g;
    public final /* synthetic */ double h;
    public final /* synthetic */ double i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm1(ul1 ul1Var, double d, double d2, Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ul1Var;
        this.h = d;
        this.i = d2;
        this.j = obj;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new lm1(this.g, this.h, this.i, (JSONArray) this.j, q60Var, 0);
            case 1:
                return new lm1(this.g, this.h, this.i, (String) this.j, q60Var, 1);
            default:
                return new lm1(this.g, this.h, this.i, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((lm1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0216  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r2.updateEnvironment(r3, r4, r5, r31) == r6) goto L16;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm1(ul1 ul1Var, double d, double d2, q60 q60Var) {
        super(2, q60Var);
        this.e = 2;
        this.g = ul1Var;
        this.h = d;
        this.i = d2;
    }
}
