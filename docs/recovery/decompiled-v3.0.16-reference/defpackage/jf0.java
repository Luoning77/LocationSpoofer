package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jf0 extends k33 implements pu0 {
    public final /* synthetic */ int e = 1;
    public we2 f;
    public we2 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ kf0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(we2 we2Var, kf0 kf0Var, q60 q60Var) {
        super(2, q60Var);
        this.g = we2Var;
        this.j = kf0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        kf0 kf0Var = this.j;
        switch (i) {
            case 0:
                jf0 jf0Var = new jf0(this.g, kf0Var, q60Var);
                jf0Var.i = obj;
                return jf0Var;
            default:
                jf0 jf0Var2 = new jf0(kf0Var, q60Var);
                jf0Var2.i = obj;
                return jf0Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((jf0) create((lu0) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((jf0) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[PHI: r0 r3
      0x003a: PHI (r0v13 we2) = (r0v5 we2), (r0v17 we2) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r3v15 kotlinx.coroutines.CoroutineScope) = (r3v13 kotlinx.coroutines.CoroutineScope), (r3v16 kotlinx.coroutines.CoroutineScope) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[PHI: r7
      0x005e: PHI (r7v14 kotlinx.coroutines.CoroutineScope) = 
      (r7v7 kotlinx.coroutines.CoroutineScope)
      (r7v10 kotlinx.coroutines.CoroutineScope)
      (r7v10 kotlinx.coroutines.CoroutineScope)
      (r7v10 kotlinx.coroutines.CoroutineScope)
      (r7v12 kotlinx.coroutines.CoroutineScope)
      (r7v15 kotlinx.coroutines.CoroutineScope)
     binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[Catch: CancellationException -> 0x00c8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0133 -> B:76:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:78:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(kf0 kf0Var, q60 q60Var) {
        super(2, q60Var);
        this.j = kf0Var;
    }
}
