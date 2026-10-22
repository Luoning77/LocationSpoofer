package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.service.SpoofingService;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d6 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(int i, t52 t52Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 1;
        this.f = i;
        this.g = t52Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = 2;
        switch (this.e) {
            case 0:
                return new d6((l6) this.g, q60Var, 0);
            case 1:
                return new d6(this.f, (t52) this.g, q60Var);
            case 2:
                return new d6((ConfigManager) this.g, q60Var, i);
            case 3:
                return new d6((d31) this.g, q60Var, 3);
            case 4:
                return new d6((ea0) this.g, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new d6((iq0) this.g, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new d6((StateFlow) this.g, q60Var, 6);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return new d6((yc1) this.g, q60Var, 7);
            case 8:
                return new d6((rk1) this.g, q60Var, 8);
            case mc0.b /* 9 */:
                return new d6((Context) this.g, q60Var, 9);
            case mc0.c /* 10 */:
                return new d6((lo1) this.g, q60Var, 10);
            case 11:
                return new d6((u52) this.g, q60Var, 11);
            case mc0.d /* 12 */:
                return new d6((is1) this.g, q60Var, 12);
            case 13:
                return new d6((fu1) this.g, q60Var, 13);
            case 14:
                return new d6((dw1) this.g, q60Var, 14);
            case a83.e /* 15 */:
                return new d6((zi0) this.g, q60Var, 15);
            case 16:
                d6 d6Var = new d6(i, q60Var);
                d6Var.g = obj;
                return d6Var;
            case 17:
                return new d6((oi2) this.g, q60Var, 17);
            case 18:
                return new d6((CompletableDeferred) this.g, q60Var, 18);
            case 19:
                d6 d6Var2 = new d6((ar2) this.g, q60Var, 19);
                long j = ((c12) obj).a;
                return d6Var2;
            case 20:
                return new d6((SpoofingService) this.g, q60Var, 20);
            case 21:
                return new d6((q33) this.g, q60Var, 21);
            case 22:
                return new d6((m80) this.g, q60Var, 22);
            case 23:
                return new d6((lu0) this.g, q60Var, 23);
            case 24:
                return new d6((cg1) this.g, q60Var, 24);
            case 25:
                return new d6((ka3) this.g, q60Var, 25);
            case 26:
                return new d6((ld3) this.g, q60Var, 26);
            default:
                return new d6((xg3) this.g, q60Var, 27);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 1:
                ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 2:
                ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 3:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 4:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.WARN /* 5 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 8:
                ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case mc0.b /* 9 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.c /* 10 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 11:
                ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case mc0.d /* 12 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 13:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 14:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case a83.e /* 15 */:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 16:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 17:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 18:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 19:
                long j = ((c12) obj).a;
                return new d6((ar2) this.g, (q60) obj2, 19).invokeSuspend(mf3Var);
            case 20:
                ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 21:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 22:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 23:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 24:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 25:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 26:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((d6) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:208:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:349:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x03ca -> B:206:0x03bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x03e6 -> B:216:0x03e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:349:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(int i, q60 q60Var) {
        super(i, q60Var);
        this.e = 16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = obj;
    }
}
