package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bw1 extends k33 implements pu0 {
    public se2 e;
    public se2 f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ te2 j;
    public final /* synthetic */ we2 k;
    public final /* synthetic */ we2 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ dw1 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ wo2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(te2 te2Var, we2 we2Var, we2 we2Var2, float f, dw1 dw1Var, float f2, wo2 wo2Var, q60 q60Var) {
        super(2, q60Var);
        this.j = te2Var;
        this.k = we2Var;
        this.l = we2Var2;
        this.m = f;
        this.n = dw1Var;
        this.o = f2;
        this.p = wo2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        bw1 bw1Var = new bw1(this.j, this.k, this.l, this.m, this.n, this.o, this.p, q60Var);
        bw1Var.i = obj;
        return bw1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((bw1) create((uo2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x009a  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:26:0x0156  */
    /* JADX WARN: Code duplicated, block: B:28:0x015a  */
    /* JADX WARN: Code duplicated, block: B:29:0x015d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0163  */
    /* JADX WARN: Code duplicated, block: B:35:0x0186  */
    /* JADX WARN: Code duplicated, block: B:39:0x0199  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0186 -> B:36:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0199 -> B:38:0x0194). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
