package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q3 extends k33 implements pu0 {
    public AccountBenefitsRepository e;
    public ey1 f;
    public Map g;
    public Iterator h;
    public Map i;
    public Object j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ AccountBenefitsRepository o;
    public final /* synthetic */ ey1 p;
    public final /* synthetic */ ey1 q;
    public final /* synthetic */ ey1 r;
    public final /* synthetic */ ey1 s;
    public final /* synthetic */ ey1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, q60 q60Var) {
        super(2, q60Var);
        this.o = accountBenefitsRepository;
        this.p = ey1Var;
        this.q = ey1Var2;
        this.r = ey1Var3;
        this.s = ey1Var4;
        this.t = ey1Var5;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        q3 q3Var = new q3(this.o, this.p, this.q, this.r, this.s, this.t, q60Var);
        q3Var.n = obj;
        return q3Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((q3) create((String) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:18:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
