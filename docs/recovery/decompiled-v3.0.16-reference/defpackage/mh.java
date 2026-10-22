package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mh extends k33 implements lu0 {
    public final /* synthetic */ int e = 0;
    public Object f;
    public long g;
    public int h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(oh ohVar, Object obj, h53 h53Var, long j, lu0 lu0Var, q60 q60Var) {
        super(1, q60Var);
        this.k = ohVar;
        this.f = obj;
        this.l = h53Var;
        this.g = j;
        this.m = lu0Var;
    }

    private final Object f(Object obj) {
        oh ohVar;
        ti tiVar;
        se2 se2Var;
        CancellationException cancellationException;
        h53 h53Var = (h53) this.l;
        oh ohVar2 = (oh) this.k;
        int i = this.h;
        if (i == 0) {
            ee0.J(obj);
            try {
                ohVar2.c.g = (yi) ohVar2.a.a.invoke(this.f);
                ohVar2.e.setValue(h53Var.c);
                ohVar2.d.setValue(Boolean.TRUE);
                ti tiVar2 = ohVar2.c;
                ti tiVar3 = new ti(tiVar2.e, tiVar2.f.getValue(), xp1.r(tiVar2.g), tiVar2.h, Long.MIN_VALUE, tiVar2.j);
                se2 se2Var2 = new se2();
                long j = this.g;
                lh lhVar = new lh(ohVar2, tiVar3, (lu0) this.m, se2Var2, 0);
                ohVar = ohVar2;
                try {
                    this.i = tiVar3;
                    this.j = se2Var2;
                    this.h = 1;
                    Object objL = gh0.l(tiVar3, h53Var, j, lhVar, this);
                    z70 z70Var = z70.e;
                    if (objL == z70Var) {
                        return z70Var;
                    }
                    tiVar = tiVar3;
                    se2Var = se2Var2;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    ohVar.c();
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                ohVar = ohVar2;
                cancellationException = e;
                ohVar.c();
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            se2Var = (se2) this.j;
            tiVar = (ti) this.i;
            try {
                ee0.J(obj);
                ohVar = ohVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                ohVar = ohVar2;
                ohVar.c();
                throw cancellationException;
            }
        }
        pi piVar = se2Var.e ? pi.e : pi.f;
        ohVar.c();
        return new qi(tiVar, piVar);
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                return new mh((oh) obj3, this.f, (h53) obj2, this.g, (lu0) obj, q60Var);
            default:
                return new mh((ul1) this.i, (CloudAccountState) this.j, (AppState) obj3, (Double) obj2, (Double) obj, q60Var);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((mh) create(q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[PHI: r1 r2 r3 r5 r10
      0x006a: PHI (r1v20 z70) = (r1v18 z70), (r1v21 z70) binds: [B:87:0x02d3, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r2v16 com.vincenthzr.locationspoofer.data.model.AppState) = (r2v13 com.vincenthzr.locationspoofer.data.model.AppState), (r2v21 com.vincenthzr.locationspoofer.data.model.AppState) binds: [B:87:0x02d3, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r3v28 ul1) = (r3v26 ul1), (r3v29 ul1) binds: [B:87:0x02d3, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r5v9 mh) = (r5v8 mh), (r5v0 mh) binds: [B:87:0x02d3, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r10v7 long) = (r10v5 long), (r10v8 long) binds: [B:87:0x02d3, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x019e A[Catch: all -> 0x003b, Exception -> 0x0054, CancellationException -> 0x0059, TryCatch #7 {all -> 0x003b, blocks: (B:8:0x0035, B:13:0x0043, B:16:0x004d, B:25:0x0064, B:29:0x0073, B:30:0x007b, B:66:0x020a, B:31:0x0080, B:63:0x01f4, B:32:0x0085, B:58:0x01d6, B:60:0x01de, B:33:0x008c, B:51:0x01b4, B:53:0x01ba, B:55:0x01c0, B:34:0x0091, B:46:0x0196, B:48:0x019e, B:39:0x016f, B:41:0x0178, B:43:0x017e), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b4 A[Catch: all -> 0x003b, Exception -> 0x0054, CancellationException -> 0x0059, TryCatch #7 {all -> 0x003b, blocks: (B:8:0x0035, B:13:0x0043, B:16:0x004d, B:25:0x0064, B:29:0x0073, B:30:0x007b, B:66:0x020a, B:31:0x0080, B:63:0x01f4, B:32:0x0085, B:58:0x01d6, B:60:0x01de, B:33:0x008c, B:51:0x01b4, B:53:0x01ba, B:55:0x01c0, B:34:0x0091, B:46:0x0196, B:48:0x019e, B:39:0x016f, B:41:0x0178, B:43:0x017e), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba A[Catch: all -> 0x003b, Exception -> 0x0054, CancellationException -> 0x0059, TryCatch #7 {all -> 0x003b, blocks: (B:8:0x0035, B:13:0x0043, B:16:0x004d, B:25:0x0064, B:29:0x0073, B:30:0x007b, B:66:0x020a, B:31:0x0080, B:63:0x01f4, B:32:0x0085, B:58:0x01d6, B:60:0x01de, B:33:0x008c, B:51:0x01b4, B:53:0x01ba, B:55:0x01c0, B:34:0x0091, B:46:0x0196, B:48:0x019e, B:39:0x016f, B:41:0x0178, B:43:0x017e), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01de A[Catch: all -> 0x003b, Exception -> 0x0054, CancellationException -> 0x0059, TryCatch #7 {all -> 0x003b, blocks: (B:8:0x0035, B:13:0x0043, B:16:0x004d, B:25:0x0064, B:29:0x0073, B:30:0x007b, B:66:0x020a, B:31:0x0080, B:63:0x01f4, B:32:0x0085, B:58:0x01d6, B:60:0x01de, B:33:0x008c, B:51:0x01b4, B:53:0x01ba, B:55:0x01c0, B:34:0x0091, B:46:0x0196, B:48:0x019e, B:39:0x016f, B:41:0x0178, B:43:0x017e), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f4 A[Catch: all -> 0x003b, Exception -> 0x0054, CancellationException -> 0x0059, TryCatch #7 {all -> 0x003b, blocks: (B:8:0x0035, B:13:0x0043, B:16:0x004d, B:25:0x0064, B:29:0x0073, B:30:0x007b, B:66:0x020a, B:31:0x0080, B:63:0x01f4, B:32:0x0085, B:58:0x01d6, B:60:0x01de, B:33:0x008c, B:51:0x01b4, B:53:0x01ba, B:55:0x01c0, B:34:0x0091, B:46:0x0196, B:48:0x019e, B:39:0x016f, B:41:0x0178, B:43:0x017e), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0209  */
    /* JADX WARN: Code duplicated, block: B:66:0x020a A[Catch: all -> 0x003b, Exception -> 0x0054, CancellationException -> 0x0059, TRY_LEAVE, TryCatch #7 {all -> 0x003b, blocks: (B:8:0x0035, B:13:0x0043, B:16:0x004d, B:25:0x0064, B:29:0x0073, B:30:0x007b, B:66:0x020a, B:31:0x0080, B:63:0x01f4, B:32:0x0085, B:58:0x01d6, B:60:0x01de, B:33:0x008c, B:51:0x01b4, B:53:0x01ba, B:55:0x01c0, B:34:0x0091, B:46:0x0196, B:48:0x019e, B:39:0x016f, B:41:0x0178, B:43:0x017e), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x028f  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a7 A[Catch: all -> 0x02bd, Exception -> 0x02c0, CancellationException -> 0x02c3, TryCatch #11 {all -> 0x02bd, blocks: (B:116:0x04b4, B:125:0x058e, B:94:0x02ed, B:95:0x02f4, B:97:0x03bc, B:113:0x04a6, B:121:0x0580, B:89:0x02d7, B:91:0x02dd, B:75:0x0292, B:77:0x02a7, B:79:0x02af, B:86:0x02c6), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x02dd A[Catch: all -> 0x02bd, Exception -> 0x02c0, CancellationException -> 0x02c3, TryCatch #11 {all -> 0x02bd, blocks: (B:116:0x04b4, B:125:0x058e, B:94:0x02ed, B:95:0x02f4, B:97:0x03bc, B:113:0x04a6, B:121:0x0580, B:89:0x02d7, B:91:0x02dd, B:75:0x0292, B:77:0x02a7, B:79:0x02af, B:86:0x02c6), top: B:133:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02eb  */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x058a, code lost:
    
        if (defpackage.on1.h(r3, r5) == r1) goto L123;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r132) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(ul1 ul1Var, CloudAccountState cloudAccountState, AppState appState, Double d, Double d2, q60 q60Var) {
        super(1, q60Var);
        this.i = ul1Var;
        this.j = cloudAccountState;
        this.k = appState;
        this.l = d;
        this.m = d2;
    }
}
