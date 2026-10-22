package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nr0 extends vg2 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr0(Object obj, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                nr0 nr0Var = new nr0((y70) this.h, (pu0) obj2, q60Var, 0);
                nr0Var.g = obj;
                return nr0Var;
            case 1:
                nr0 nr0Var2 = new nr0((s63) obj2, q60Var, 1);
                nr0Var2.g = obj;
                return nr0Var2;
            case 2:
                nr0 nr0Var3 = new nr0((au0) obj2, q60Var, 2);
                nr0Var3.h = obj;
                return nr0Var3;
            case 3:
                nr0 nr0Var4 = new nr0((ar2) this.h, (bq2) obj2, q60Var, 3);
                nr0Var4.g = obj;
                return nr0Var4;
            default:
                nr0 nr0Var5 = new nr0((q92) this.h, (we2) obj2, q60Var, 4);
                nr0Var5.g = obj;
                return nr0Var5;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((nr0) create((p33) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((nr0) create((p33) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((nr0) create((ws2) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                return ((nr0) create((p33) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((nr0) create((p33) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0231 A[Catch: CancellationException -> 0x0217, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0217, blocks: (B:121:0x0231, B:124:0x023f, B:111:0x0212, B:116:0x021f), top: B:139:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x023e  */
    /* JADX WARN: Code duplicated, block: B:124:0x023f A[Catch: CancellationException -> 0x0217, PHI: r5
      0x023f: PHI (r5v3 p33) = (r5v34 p33), (r5v35 p33) binds: [B:122:0x023c, B:116:0x021f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0217, blocks: (B:121:0x0231, B:124:0x023f, B:111:0x0212, B:116:0x021f), top: B:139:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0248 -> B:119:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x025a -> B:119:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:34:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016a -> B:75:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01c2 -> B:92:0x01c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:123:0x023e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr0(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
    }
}
