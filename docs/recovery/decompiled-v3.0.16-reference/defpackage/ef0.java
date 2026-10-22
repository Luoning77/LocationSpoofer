package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ef0 extends vg2 implements pu0 {
    public x92 e;
    public p33 f;
    public pu0 g;
    public p33 h;
    public ve2 i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ lu0 r;
    public final /* synthetic */ pu0 s;
    public final /* synthetic */ au0 t;
    public final /* synthetic */ lu0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(lu0 lu0Var, pu0 pu0Var, au0 au0Var, lu0 lu0Var2, q60 q60Var) {
        super(2, q60Var);
        this.r = lu0Var;
        this.s = pu0Var;
        this.t = au0Var;
        this.u = lu0Var2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        ef0 ef0Var = new ef0(this.r, this.s, this.t, this.u, q60Var);
        ef0Var.q = obj;
        return ef0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ef0) create((p33) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120 A[LOOP:0: B:40:0x0103->B:44:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0131 A[EDGE_INSN: B:81:0x0131->B:46:0x0131 BREAK  A[LOOP:0: B:40:0x0103->B:44:0x0120], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f3 -> B:39:0x00f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
