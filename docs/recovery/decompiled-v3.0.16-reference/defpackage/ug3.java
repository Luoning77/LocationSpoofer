package defpackage;

import com.vincenthzr.locationspoofer.data.update.AccountUpdates;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ug3 extends k33 implements pu0 {
    public final /* synthetic */ int e = 0;
    public AccountUpdates f;
    public int g;
    public final /* synthetic */ xg3 h;
    public boolean i;
    public final /* synthetic */ long j;
    public String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug3(xg3 xg3Var, boolean z, long j, String str, q60 q60Var) {
        super(2, q60Var);
        this.h = xg3Var;
        this.i = z;
        this.j = j;
        this.k = str;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new ug3(this.h, this.j, q60Var);
            default:
                return new ug3(this.h, this.i, this.j, this.k, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ug3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0238, code lost:
    
        if (r0 == r11) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        if (r0 == r11) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.vincenthzr.locationspoofer.data.update.AccountUpdates, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.vincenthzr.locationspoofer.data.update.AccountUpdates, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug3(xg3 xg3Var, long j, q60 q60Var) {
        super(2, q60Var);
        this.h = xg3Var;
        this.j = j;
    }
}
