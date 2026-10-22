package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ve0 extends vg2 implements pu0 {
    public p92 e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ se2 i;
    public final /* synthetic */ we2 j;
    public final /* synthetic */ we2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve0(se2 se2Var, we2 we2Var, we2 we2Var2, q60 q60Var) {
        super(2, q60Var);
        this.i = se2Var;
        this.j = we2Var;
        this.k = we2Var2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        ve0 ve0Var = new ve0(this.i, this.j, this.k, q60Var);
        ve0Var.h = obj;
        return ve0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ve0) create((p33) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:2: B:16:0x0056->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0069 A[EDGE_INSN: B:74:0x0069->B:22:0x0069 BREAK  A[LOOP:2: B:16:0x0056->B:20:0x0065], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
