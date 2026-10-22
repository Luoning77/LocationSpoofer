package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kd3 extends k33 implements pu0 {
    public w02[] e;
    public ld3 f;
    public xb3 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ w02[] l;
    public final /* synthetic */ ld3 m;
    public final /* synthetic */ xb3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd3(w02[] w02VarArr, ld3 ld3Var, xb3 xb3Var, q60 q60Var) {
        super(2, q60Var);
        this.l = w02VarArr;
        this.m = ld3Var;
        this.n = xb3Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new kd3(this.l, this.m, this.n, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((kd3) create((z52) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.k
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.j
            int r4 = r11.i
            int r5 = r11.h
            xb3 r6 = r11.g
            ld3 r7 = r11.f
            w02[] r8 = r11.e
            defpackage.ee0.J(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r11)
            return r1
        L21:
            defpackage.ee0.J(r12)
            w02[] r12 = r11.l
            int r0 = r12.length
            r4 = 0
            ld3 r5 = r11.m
            xb3 r6 = r11.n
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            z70 r10 = defpackage.z70.e
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.e = r8
            r11.f = r7
            r11.g = r6
            r11.h = r9
            r11.i = r4
            r11.j = r0
            r11.k = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.b81.d()
            return r1
        L5d:
            r11.e = r8
            r11.f = r7
            r11.g = r6
            r11.h = r9
            r11.i = r4
            r11.j = r0
            r11.k = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            mf3 r11 = defpackage.mf3.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
