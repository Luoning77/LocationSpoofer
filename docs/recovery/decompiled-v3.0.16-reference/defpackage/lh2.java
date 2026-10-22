package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lh2 extends vg2 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh2(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                lh2 lh2Var = new lh2((lu0) obj2, q60Var, 0);
                lh2Var.g = obj;
                return lh2Var;
            case 1:
                lh2 lh2Var2 = new lh2((lu0) obj2, q60Var, 1);
                lh2Var2.g = obj;
                return lh2Var2;
            default:
                lh2 lh2Var3 = new lh2((rc) obj2, q60Var, 2);
                lh2Var3.g = obj;
                return lh2Var3;
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
                return ((lh2) create(p33Var, q60Var)).invokeSuspend(mf3Var);
            case 1:
                ((lh2) create(p33Var, q60Var)).invokeSuspend(mf3Var);
                return z70.e;
            default:
                return ((lh2) create(p33Var, q60Var)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0058 -> B:18:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e3 -> B:49:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:40:0x00be
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
