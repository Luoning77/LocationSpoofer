package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hs1 extends k33 implements pu0 {
    public String e;
    public long f;
    public long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ is1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs1(is1 is1Var, q60 q60Var) {
        super(2, q60Var);
        this.j = is1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        hs1 hs1Var = new hs1(this.j, q60Var);
        hs1Var.i = obj;
        return hs1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((hs1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:48|(6:51|82|52|(2:54|94)(1:95)|55|49)|93|58|59|84|60|61|76|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:78|42|(1:44)(3:45|46|(10:48|(6:51|82|52|(2:54|94)(1:95)|55|49)|93|58|59|84|60|61|76|62)(6:68|66|16|(1:18)|71|72))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:51|82|52|(2:54|94)(1:95)|55|49) */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[Catch: Exception -> 0x011c, CancellationException -> 0x015b, TryCatch #1 {Exception -> 0x011c, blocks: (B:42:0x00b2, B:46:0x00cc, B:48:0x00d8, B:49:0x00fb, B:51:0x0101), top: B:78:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101 A[Catch: Exception -> 0x011c, CancellationException -> 0x015b, TRY_LEAVE, TryCatch #1 {Exception -> 0x011c, blocks: (B:42:0x00b2, B:46:0x00cc, B:48:0x00d8, B:49:0x00fb, B:51:0x0101), top: B:78:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        if (r0.f(r1, r2, r3, r5) == r12) goto L64;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0053 -> B:23:0x0057). Please report as a decompilation issue!!! */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
