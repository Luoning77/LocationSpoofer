package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fi2 extends k33 implements pu0 {
    public String[] e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String[] k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi2(boolean z, String[] strArr, q60 q60Var) {
        super(2, q60Var);
        this.j = z;
        this.k = strArr;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        fi2 fi2Var = new fi2(this.j, this.k, q60Var);
        fi2Var.i = obj;
        return fi2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((fi2) create((z52) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (defpackage.v63.a(r0, "PRAGMA defer_foreign_keys = TRUE", r9) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.v63.a(r6, r10, r9) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.h
            r1 = 2
            r2 = 1
            z70 r3 = defpackage.z70.e
            if (r0 == 0) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1a
            int r0 = r9.g
            int r4 = r9.f
            java.lang.String[] r5 = r9.e
            java.lang.Object r6 = r9.i
            z52 r6 = (defpackage.z52) r6
            defpackage.ee0.J(r10)
            goto L67
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r9)
            r9 = 0
            return r9
        L21:
            java.lang.Object r0 = r9.i
            z52 r0 = (defpackage.z52) r0
            defpackage.ee0.J(r10)
            goto L42
        L29:
            defpackage.ee0.J(r10)
            java.lang.Object r10 = r9.i
            r0 = r10
            z52 r0 = (defpackage.z52) r0
            boolean r10 = r9.j
            if (r10 == 0) goto L42
            r9.i = r0
            r9.h = r2
            java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
            java.lang.Object r10 = defpackage.v63.a(r0, r10, r9)
            if (r10 != r3) goto L42
            goto L66
        L42:
            java.lang.String[] r10 = r9.k
            int r4 = r10.length
            r5 = 0
            r6 = r0
            r0 = r4
            r4 = r5
            r5 = r10
        L4a:
            if (r4 >= r0) goto L69
            r10 = r5[r4]
            java.lang.String r7 = "DELETE FROM `"
            r8 = 96
            java.lang.String r10 = defpackage.p91.p(r7, r10, r8)
            r9.i = r6
            r9.e = r5
            r9.f = r4
            r9.g = r0
            r9.h = r1
            java.lang.Object r10 = defpackage.v63.a(r6, r10, r9)
            if (r10 != r3) goto L67
        L66:
            return r3
        L67:
            int r4 = r4 + r2
            goto L4a
        L69:
            mf3 r9 = defpackage.mf3.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
