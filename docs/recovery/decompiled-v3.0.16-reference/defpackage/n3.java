package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(AccountBenefitsRepository accountBenefitsRepository, Object obj, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = accountBenefitsRepository;
        this.m = obj;
        this.i = ey1Var;
        this.j = ey1Var2;
        this.k = ey1Var3;
        this.l = ey1Var4;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.m;
        switch (i) {
            case 0:
                n3 n3Var = new n3((AccountBenefitsRepository) this.h, (CloudArchive) obj6, (ey1) obj5, (ey1) obj4, (ey1) obj3, (ey1) obj2, q60Var, 0);
                n3Var.g = obj;
                return n3Var;
            case 1:
                n3 n3Var2 = new n3((AccountBenefitsRepository) this.h, (String) obj6, (ey1) obj5, (ey1) obj4, (ey1) obj3, (ey1) obj2, q60Var, 1);
                n3Var2.g = obj;
                return n3Var2;
            case 2:
                return new n3((oi2) obj6, (ni2) obj5, (d31) obj4, (we2) obj3, (we2) obj2, q60Var, 2);
            default:
                n3 n3Var3 = new n3((ContentResolver) obj6, (Uri) obj5, (h80) obj4, (Channel) obj3, (Context) obj2, q60Var, 3);
                n3Var3.g = obj;
                return n3Var3;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((n3) create((String) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((n3) create((String) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((n3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((n3) create((FlowCollector) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0285  */
    /* JADX WARN: Code duplicated, block: B:106:0x029a  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:173:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x002e, B:19:0x005e, B:23:0x0070, B:25:0x0078, B:15:0x0046, B:18:0x0058), top: B:168:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    /* JADX WARN: Code duplicated, block: B:84:0x0220  */
    /* JADX WARN: Code duplicated, block: B:91:0x0260  */
    /* JADX WARN: Code duplicated, block: B:96:0x0277  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x035a, code lost:
    
        if (r0 == r10) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03db, code lost:
    
        if (r0 == r10) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r1.emit(r3, r19) == r10) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:10:0x0031). Please report as a decompilation issue!!! */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws org.json.JSONException, com.vincenthzr.locationspoofer.data.cloud.CloudException {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.m = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
    }
}
