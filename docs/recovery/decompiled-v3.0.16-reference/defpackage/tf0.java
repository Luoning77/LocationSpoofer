package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tf0 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public long f;
    public int g;
    public Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(long j, ul1 ul1Var, pz2 pz2Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 3;
        this.f = j;
        this.h = ul1Var;
        this.i = pz2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                tf0 tf0Var = new tf0((uf0) this.i, this.f, q60Var);
                tf0Var.h = obj;
                return tf0Var;
            case 1:
                return new tf0(2, q60Var);
            case 2:
                return new tf0((ul1) this.h, this.f, (CloudAccountState) this.i, q60Var, 2);
            case 3:
                return new tf0(this.f, (ul1) this.h, (pz2) this.i, q60Var);
            case 4:
                return new tf0((ew2) this.h, this.f, (gw2) this.i, q60Var, 4);
            default:
                return new tf0((xg3) this.h, (i52) this.i, this.f, q60Var);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((tf0) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:93|120|94|95|122|96|(1:98)) */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d5  */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a2, code lost:
    
        r104 = r1;
        r1 = r0;
        r0 = r104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r0 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02d7, code lost:
    
        r104 = r1;
        r1 = r0;
        r0 = r104;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r107) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf0(int i, q60 q60Var) {
        super(i, q60Var);
        this.e = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(uf0 uf0Var, long j, q60 q60Var) {
        super(2, q60Var);
        this.e = 0;
        this.i = uf0Var;
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(xg3 xg3Var, i52 i52Var, long j, q60 q60Var) {
        super(2, q60Var);
        this.e = 5;
        this.h = xg3Var;
        this.i = i52Var;
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf0(Object obj, long j, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
        this.f = j;
        this.i = obj2;
    }
}
