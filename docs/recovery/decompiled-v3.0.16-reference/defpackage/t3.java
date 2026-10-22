package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.view.ScrollCaptureSession;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.service.BootCompletedReceiver;
import com.vincenthzr.locationspoofer.service.SpoofingControlReceiver;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(ul1 ul1Var, Context context, ey1 ey1Var, ey1 ey1Var2, q60 q60Var) {
        super(2, q60Var);
        this.e = 12;
        this.h = ul1Var;
        this.g = context;
        this.j = ey1Var;
        this.i = ey1Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext((defpackage.y70) r13, r2, r12) == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.i
            r5 = r0
            int[] r5 = (int[]) r5
            java.lang.Object r0 = r12.h
            r7 = r0
            ld3 r7 = (defpackage.ld3) r7
            int r0 = r12.f
            r8 = 0
            r9 = 3
            r1 = 2
            r2 = 1
            z70 r10 = defpackage.z70.e
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L34
            if (r0 == r1) goto L2c
            if (r0 == r9) goto L20
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r12)
            return r8
        L20:
            defpackage.ee0.J(r13)     // Catch: java.lang.Throwable -> L29
            iv r12 = new iv     // Catch: java.lang.Throwable -> L29
            r12.<init>()     // Catch: java.lang.Throwable -> L29
            throw r12     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            r12 = r0
            goto L8d
        L2c:
            java.lang.Object r0 = r12.g
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            defpackage.ee0.J(r13)
            goto L70
        L34:
            java.lang.Object r0 = r12.g
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            defpackage.ee0.J(r13)
            goto L5c
        L3c:
            defpackage.ee0.J(r13)
            java.lang.Object r13 = r12.g
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            x02 r0 = r7.h
            boolean r0 = r0.a(r5)
            if (r0 == 0) goto L72
            com.vincenthzr.locationspoofer.data.db.AppDatabase_Impl r0 = r7.a
            r12.g = r13
            r12.f = r2
            r2 = 0
            y70 r0 = defpackage.ks.S(r0, r2, r12)
            if (r0 != r10) goto L59
            goto L6f
        L59:
            r11 = r0
            r0 = r13
            r13 = r11
        L5c:
            y70 r13 = (defpackage.y70) r13
            d6 r2 = new d6
            r3 = 26
            r2.<init>(r7, r8, r3)
            r12.g = r0
            r12.f = r1
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r2, r12)
            if (r13 != r10) goto L70
        L6f:
            return r10
        L70:
            r3 = r0
            goto L73
        L72:
            r3 = r13
        L73:
            we2 r2 = new we2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            us1 r13 = r7.i     // Catch: java.lang.Throwable -> L29
            k70 r1 = new k70     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r12.j     // Catch: java.lang.Throwable -> L29
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L29
            r6 = 2
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L29
            r12.g = r8     // Catch: java.lang.Throwable -> L29
            r12.f = r9     // Catch: java.lang.Throwable -> L29
            r13.i(r1, r12)     // Catch: java.lang.Throwable -> L29
            return r10
        L8d:
            x02 r13 = r7.h
            r13.b(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3.f(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new t3((Context) this.g, (Uri) this.h, (String) this.i, (ey1) obj2, q60Var, 0);
            case 1:
                t3 t3Var = new t3((lu0) this.h, (zd) this.i, (ge1) obj2, q60Var, 1);
                t3Var.g = obj;
                return t3Var;
            case 2:
                return new t3(this.g, (oh) this.h, (ey1) obj2, (ey1) this.i, q60Var);
            case 3:
                return new t3((Intent) this.h, (BroadcastReceiver.PendingResult) this.i, (BootCompletedReceiver) obj2, (Context) this.g, q60Var);
            case 4:
                return new t3((q20) this.g, (ScrollCaptureSession) this.h, (Rect) this.i, (Consumer) obj2, q60Var, 4);
            case Logger.WARN /* 5 */:
                t3 t3Var2 = new t3((ConfigManager) obj2, q60Var, 5);
                t3Var2.i = obj;
                return t3Var2;
            case Logger.ERROR /* 6 */:
                t3 t3Var3 = new t3((we2) this.h, (ul0) this.i, (WifiManager) obj2, q60Var, 6);
                t3Var3.g = obj;
                return t3Var3;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                t3 t3Var4 = new t3((ey1) obj2, (g21) this.i, q60Var);
                t3Var4.h = obj;
                return t3Var4;
            case 8:
                return new t3((we2) this.h, (ul1) this.i, (CollectionRouteRecord) obj2, q60Var, 8);
            case mc0.b /* 9 */:
                t3 t3Var5 = new t3((String) this.i, (ey1) obj2, q60Var, 9);
                t3Var5.h = obj;
                return t3Var5;
            case mc0.c /* 10 */:
                return new t3((d92) this.i, (pu0) obj2, q60Var, 10);
            case 11:
                t3 t3Var6 = new t3((ii2) this.h, (CancellableContinuationImpl) this.i, (w80) obj2, q60Var, 11);
                t3Var6.g = obj;
                return t3Var6;
            case mc0.d /* 12 */:
                return new t3((ul1) this.h, (Context) this.g, (ey1) obj2, (ey1) this.i, q60Var);
            case 13:
                return new t3((ar2) this.g, (we2) this.h, (we2) this.i, (ve2) obj2, q60Var, 13);
            case 14:
                return new t3((CloudRepository) this.g, (ey1) obj2, (ey1) this.h, (ey1) this.i, q60Var);
            case a83.e /* 15 */:
                t3 t3Var7 = new t3((lu0) this.h, (AtomicReference) this.i, (pu0) obj2, q60Var, 15);
                t3Var7.g = obj;
                return t3Var7;
            case 16:
                return new t3((Intent) this.h, (SpoofingControlReceiver) this.i, (Context) this.g, (BroadcastReceiver.PendingResult) obj2, q60Var);
            case 17:
                t3 t3Var8 = new t3((ub3) obj2, q60Var, 17);
                t3Var8.i = obj;
                return t3Var8;
            case 18:
                t3 t3Var9 = new t3((ld3) this.h, (int[]) this.i, (String[]) obj2, q60Var, 18);
                t3Var9.g = obj;
                return t3Var9;
            default:
                return new t3((we2) this.g, (ke2) this.h, (df1) this.i, (jm3) obj2, q60Var, 19);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                ((t3) create((af) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 2:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 4:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.WARN /* 5 */:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 8:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.b /* 9 */:
                return ((t3) create((kc2) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.c /* 10 */:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 11:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.d /* 12 */:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 13:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 14:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case a83.e /* 15 */:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 16:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 17:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 18:
                ((t3) create((FlowCollector) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            default:
                return ((t3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:320:0x060f  */
    /* JADX WARN: Code duplicated, block: B:323:0x0620  */
    /* JADX WARN: Code duplicated, block: B:326:0x0634  */
    /* JADX WARN: Code duplicated, block: B:329:0x0647 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:282:0x054c -> B:276:0x0517). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x0568 -> B:276:0x0517). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:326:0x0634 -> B:423:0x0635). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ec -> B:44:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(ey1 ey1Var, g21 g21Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 7;
        this.j = ey1Var;
        this.i = g21Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Intent intent, BroadcastReceiver.PendingResult pendingResult, BootCompletedReceiver bootCompletedReceiver, Context context, q60 q60Var) {
        super(2, q60Var);
        this.e = 3;
        this.h = intent;
        this.i = pendingResult;
        this.j = bootCompletedReceiver;
        this.g = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Intent intent, SpoofingControlReceiver spoofingControlReceiver, Context context, BroadcastReceiver.PendingResult pendingResult, q60 q60Var) {
        super(2, q60Var);
        this.e = 16;
        this.h = intent;
        this.i = spoofingControlReceiver;
        this.g = context;
        this.j = pendingResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(CloudRepository cloudRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.e = 14;
        this.g = cloudRepository;
        this.j = ey1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Object obj, oh ohVar, ey1 ey1Var, ey1 ey1Var2, q60 q60Var) {
        super(2, q60Var);
        this.e = 2;
        this.g = obj;
        this.h = ohVar;
        this.j = ey1Var;
        this.i = ey1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, Object obj2, Object obj3, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, Object obj2, Object obj3, Object obj4, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
