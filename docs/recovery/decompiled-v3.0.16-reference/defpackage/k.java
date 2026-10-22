package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import com.vincenthzr.locationspoofer.service.BootCompletedReceiver;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q60 q60Var, lu0 lu0Var, ii2 ii2Var) {
        super(2, q60Var);
        this.e = 19;
        this.g = ii2Var;
        this.h = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new k((ix1) this.g, (ly0) obj2, q60Var, 0);
            case 1:
                return new k((ix1) this.g, (my0) obj2, q60Var, 1);
            case 2:
                return new k((lu0) this.g, (l6) obj2, q60Var, 2);
            case 3:
                k kVar = new k((j90) this.g, (lu0) obj2, q60Var, 3);
                kVar.f = ((Number) obj).intValue();
                return kVar;
            case 4:
                return new k((oh) this.g, (c12) obj2, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new k((zd) this.g, (d31) obj2, q60Var, 5);
            case Logger.ERROR /* 6 */:
                k kVar2 = new k((af) obj2, q60Var, 6);
                kVar2.g = obj;
                return kVar2;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                k kVar3 = new k((ya2) obj2, q60Var, 7);
                kVar3.g = obj;
                return kVar3;
            case 8:
                return new k((BootCompletedReceiver) this.g, (Context) obj2, q60Var, 8);
            case mc0.b /* 9 */:
                return new k((ct) this.g, (pe2) obj2, q60Var, 9);
            case mc0.c /* 10 */:
                return new k((lt) this.g, (a6) obj2, q60Var, 10);
            case 11:
                return new k((q20) this.g, (Runnable) obj2, q60Var, 11);
            case mc0.d /* 12 */:
                k kVar4 = new k((ConfigManager) obj2, q60Var, 12);
                kVar4.g = obj;
                return kVar4;
            case 13:
                return new k((pu0) this.g, (ua2) obj2, q60Var, 13);
            case 14:
                return new k((pu0) this.g, (we2) obj2, q60Var, 14);
            case a83.e /* 15 */:
                k kVar5 = new k((wi2) obj2, q60Var, 15);
                kVar5.g = obj;
                return kVar5;
            case 16:
                return new k((ca2) this.g, (x73) obj2, q60Var, 16);
            case 17:
                return new k((Job) this.g, (m80) obj2, q60Var, 17);
            case 18:
                return new k((ii2) this.g, (m4) obj2, q60Var, 18);
            case 19:
                return new k(q60Var, (lu0) obj2, (ii2) this.g);
            case 20:
                k kVar6 = new k((j90) obj2, q60Var, 20);
                kVar6.g = obj;
                return kVar6;
            case 21:
                return new k((ha0) this.g, (m) obj2, q60Var, 21);
            case 22:
                return new k((ul0) obj2, q60Var, 22);
            case 23:
                return new k((TelephonyManager) this.g, (ul0) obj2, q60Var, 23);
            case 24:
                return new k((FloatingJoystickService) this.g, (String) obj2, q60Var, 24);
            case 25:
                return new k((z41) this.g, (x92) obj2, q60Var, 25);
            case 26:
                return new k((ge1) this.g, (t3) obj2, q60Var, 26);
            case 27:
                return new k((ul1) this.g, (Long) obj2, q60Var, 27);
            case 28:
                return new k((ul1) this.g, (SavedRoute) obj2, q60Var, 28);
            default:
                return new k((ul1) this.g, (LinkedHashMap) obj2, q60Var, 29);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                ((k) create(Integer.valueOf(((Number) obj).intValue()), (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 4:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.WARN /* 5 */:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                ((k) create((e31) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 8:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.b /* 9 */:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.c /* 10 */:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 11:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.d /* 12 */:
                ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 13:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 14:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case a83.e /* 15 */:
                return ((k) create((String) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 16:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 17:
                ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 18:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 19:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 20:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 21:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 22:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 23:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 24:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 25:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 26:
                ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 27:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 28:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((k) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:300:0x0592  */
    /* JADX WARN: Code duplicated, block: B:302:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:304:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:308:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:310:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:313:0x05d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [q60] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.bluetooth.le.BluetoothLeScanner] */
    /* JADX WARN: Type inference failed for: r3v25, types: [android.bluetooth.le.BluetoothLeScanner, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x03de -> B:200:0x03e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:303:0x05b0 -> B:305:0x05b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
