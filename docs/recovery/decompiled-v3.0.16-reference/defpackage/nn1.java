package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.LinkedHashSet;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nn1 extends k33 implements pu0 {
    public LinkedHashSet e;
    public we2 f;
    public Object g;
    public long h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ AppState l;
    public final /* synthetic */ ul1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn1(AppState appState, ul1 ul1Var, q60 q60Var) {
        super(2, q60Var);
        this.l = appState;
        this.m = ul1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        nn1 nn1Var = new nn1(this.l, this.m, q60Var);
        nn1Var.k = obj;
        return nn1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((nn1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0370  */
    /* JADX WARN: Code duplicated, block: B:123:0x037f A[LOOP:0: B:79:0x01b5->B:123:0x037f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0383  */
    /* JADX WARN: Code duplicated, block: B:146:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x013d A[Catch: all -> 0x0048, Exception -> 0x004c, CancellationException -> 0x0050, TRY_LEAVE, TryCatch #13 {CancellationException -> 0x0050, Exception -> 0x004c, all -> 0x0048, blocks: (B:14:0x0041, B:58:0x0137, B:60:0x013d, B:43:0x00a0), top: B:141:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0290 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0292 A[Catch: all -> 0x01ab, Exception -> 0x01ad, CancellationException -> 0x01af, TRY_ENTER, TryCatch #15 {CancellationException -> 0x01af, Exception -> 0x01ad, all -> 0x01ab, blocks: (B:66:0x0177, B:84:0x0292, B:85:0x02ba, B:87:0x02c0, B:88:0x02dd), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02c0 A[Catch: all -> 0x01ab, Exception -> 0x01ad, CancellationException -> 0x01af, LOOP:1: B:85:0x02ba->B:87:0x02c0, LOOP_END, TryCatch #15 {CancellationException -> 0x01af, Exception -> 0x01ad, all -> 0x01ab, blocks: (B:66:0x0177, B:84:0x0292, B:85:0x02ba, B:87:0x02c0, B:88:0x02dd), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [we2] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [we2] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [we2] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42, types: [we2] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v6, types: [we2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [we2] */
    /* JADX WARN: Type inference failed for: r36v2, types: [i52] */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v10, types: [we2] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [we2] */
    /* JADX WARN: Type inference failed for: r9v10, types: [i52] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0370 -> B:116:0x0371). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:84:0x0292
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r123) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
