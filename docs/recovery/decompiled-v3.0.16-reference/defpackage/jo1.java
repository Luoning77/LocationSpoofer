package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jo1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ lo1 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo1(String str, String str2, int i, String str3, String str4, lo1 lo1Var, long j, int i2, boolean z, boolean z2, q60 q60Var) {
        super(2, q60Var);
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = str3;
        this.j = str4;
        this.k = lo1Var;
        this.l = j;
        this.m = i2;
        this.n = z;
        this.o = z2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new jo1(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((jo1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013a, code lost:
    
        if (r1.updateSelectedWifi(r21, r2, r25) == r15) goto L39;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
