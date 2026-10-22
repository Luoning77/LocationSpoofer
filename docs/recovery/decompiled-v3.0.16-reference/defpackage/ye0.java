package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ye0 extends vg2 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ xu0 j;
    public final /* synthetic */ xu0 k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(qe0 qe0Var, sv svVar, pu0 pu0Var, au0 au0Var, m4 m4Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 0;
        this.h = qe0Var;
        this.i = svVar;
        this.j = pu0Var;
        this.k = au0Var;
        this.l = m4Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.l;
        xu0 xu0Var = this.k;
        xu0 xu0Var2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ye0 ye0Var = new ye0((qe0) this.h, (sv) obj3, (pu0) xu0Var2, (au0) xu0Var, (m4) obj2, q60Var);
                ye0Var.g = obj;
                return ye0Var;
            case 1:
                ye0 ye0Var2 = new ye0((my) obj3, (uo0) xu0Var2, (dd) xu0Var, (qe0) obj2, q60Var, 1);
                ye0Var2.g = obj;
                return ye0Var2;
            case 2:
                ye0 ye0Var3 = new ye0((ci1) obj3, (s5) xu0Var2, (a6) xu0Var, (hd) obj2, q60Var, 2);
                ye0Var3.g = obj;
                return ye0Var3;
            default:
                ye0 ye0Var4 = new ye0((CoroutineScope) obj3, (ds1) xu0Var2, (vu1) xu0Var, (tb2) obj2, q60Var, 3);
                ye0Var4.g = obj;
                return ye0Var4;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        p33 p33Var = (p33) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((ye0) create(p33Var, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r4 == r10) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0162, code lost:
    
        if (r0 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0205, code lost:
    
        if (r0 == r10) goto L73;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye0(Object obj, xu0 xu0Var, xu0 xu0Var2, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
        this.j = xu0Var;
        this.k = xu0Var2;
        this.l = obj2;
    }
}
