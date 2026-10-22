package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class by1 extends vg2 implements pu0 {
    public vv0 e;
    public cy1 f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ cy1 o;
    public final /* synthetic */ vv0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by1(cy1 cy1Var, vv0 vv0Var, q60 q60Var) {
        super(2, q60Var);
        this.o = cy1Var;
        this.p = vv0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        by1 by1Var = new by1(this.o, this.p, q60Var);
        by1Var.n = obj;
        return by1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((by1) create((ws2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.m
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.k
            int r5 = r0.j
            long r6 = r0.l
            int r8 = r0.i
            int r9 = r0.h
            long[] r10 = r0.g
            cy1 r11 = r0.f
            vv0 r12 = r0.e
            java.lang.Object r13 = r0.n
            ws2 r13 = (defpackage.ws2) r13
            defpackage.ee0.J(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.ee0.J(r21)
            java.lang.Object r1 = r0.n
            ws2 r1 = (defpackage.ws2) r1
            cy1 r5 = r0.o
            ay1 r6 = r5.f
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            vv0 r8 = r0.p
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f = r2
            ay1 r3 = r11.f
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.n = r13
            r0.e = r12
            r0.f = r11
            r0.g = r10
            r0.h = r9
            r0.i = r8
            r0.l = r6
            r0.j = r5
            r0.k = r1
            r0.m = r4
            r13.a(r2, r0)
            z70 r0 = defpackage.z70.e
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            mf3 r0 = defpackage.mf3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
