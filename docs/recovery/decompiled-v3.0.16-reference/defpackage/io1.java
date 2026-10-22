package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class io1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ lo1 t;
    public final /* synthetic */ long u;
    public final /* synthetic */ int v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io1(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10, int i11, lo1 lo1Var, long j2, int i12, boolean z, boolean z2, q60 q60Var) {
        super(2, q60Var);
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
        this.o = i8;
        this.p = j;
        this.q = i9;
        this.r = i10;
        this.s = i11;
        this.t = lo1Var;
        this.u = j2;
        this.v = i12;
        this.w = z;
        this.x = z2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new io1(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((io1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (r1.updateSelectedCell(r26.u, r2, r26) == r8) goto L27;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
