package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lq2 extends vg2 implements pu0 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq2(q01 q01Var, xv1 xv1Var, s63 s63Var, q60 q60Var) {
        super(2, q60Var);
        this.h = q01Var;
        this.i = xv1Var;
        this.j = s63Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                lq2 lq2Var = new lq2((q01) this.h, (xv1) this.i, (s63) obj2, q60Var);
                lq2Var.g = obj;
                return lq2Var;
            default:
                lq2 lq2Var2 = new lq2((x13) obj2, q60Var);
                lq2Var2.g = obj;
                return lq2Var2;
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
        return ((lq2) create(p33Var, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x027c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0302  */
    /* JADX WARN: Code duplicated, block: B:195:0x033e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0345  */
    /* JADX WARN: Code duplicated, block: B:200:0x0352  */
    /* JADX WARN: Code duplicated, block: B:210:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0106 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0243 -> B:140:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d2 -> B:40:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq2(x13 x13Var, q60 q60Var) {
        super(2, q60Var);
        this.j = x13Var;
    }
}
