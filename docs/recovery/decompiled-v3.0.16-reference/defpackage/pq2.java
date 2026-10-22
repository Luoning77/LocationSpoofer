package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pq2 extends vg2 implements pu0 {
    public final /* synthetic */ int e = 0;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq2(long j, ve2 ve2Var, q60 q60Var) {
        super(2, q60Var);
        this.f = j;
        this.i = ve2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                pq2 pq2Var = new pq2(this.f, (ve2) obj2, q60Var);
                pq2Var.h = obj;
                return pq2Var;
            default:
                pq2 pq2Var2 = new pq2((x92) obj2, q60Var);
                pq2Var2.h = obj;
                return pq2Var2;
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
        }
        return ((pq2) create(p33Var, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.e
            java.lang.Object r1 = r9.i
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            z70 r4 = defpackage.z70.e
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.g
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.f
            java.lang.Object r2 = r9.h
            p33 r2 = (defpackage.p33) r2
            defpackage.ee0.J(r10)
            goto L47
        L1d:
            defpackage.fo.n(r3)
            goto L50
        L21:
            defpackage.ee0.J(r10)
            java.lang.Object r10 = r9.h
            p33 r10 = (defpackage.p33) r10
            x92 r1 = (defpackage.x92) r1
            long r0 = r1.b
            aj3 r2 = r10.s()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.h = r2
            r9.f = r0
            r9.g = r5
            r10 = 3
            java.lang.Object r10 = defpackage.g53.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            x92 r10 = (defpackage.x92) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            ve2 r1 = (defpackage.ve2) r1
            int r0 = r9.g
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.h
            p33 r9 = (defpackage.p33) r9
            defpackage.ee0.J(r10)
            goto L84
        L61:
            defpackage.fo.n(r3)
            goto Lb6
        L65:
            defpackage.ee0.J(r10)
            java.lang.Object r10 = r9.h
            p33 r10 = (defpackage.p33) r10
            long r2 = r9.f
            s5 r0 = new s5
            r6 = 26
            r0.<init>(r1, r6)
            r9.h = r10
            r9.g = r5
            java.lang.Object r9 = defpackage.df0.e(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            x92 r10 = (defpackage.x92) r10
            if (r10 == 0) goto L9c
            long r0 = r1.e
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            rd0 r2 = defpackage.rd0.f
            goto Lb6
        L9c:
            q33 r9 = r9.i
            p92 r9 = r9.w
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.zy.n0(r9)
            x92 r9 = (defpackage.x92) r9
            boolean r10 = defpackage.mh0.r(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            rd0 r2 = defpackage.rd0.e
            goto Lb6
        Lb4:
            rd0 r2 = defpackage.rd0.h
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq2(x92 x92Var, q60 q60Var) {
        super(2, q60Var);
        this.i = x92Var;
    }
}
