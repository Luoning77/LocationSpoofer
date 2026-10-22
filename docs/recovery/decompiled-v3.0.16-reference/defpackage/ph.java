package defpackage;

import android.bluetooth.le.BluetoothLeScanner;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ph extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(CloudRepository cloudRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, q60 q60Var) {
        super(2, q60Var);
        this.e = 3;
        this.h = cloudRepository;
        this.k = ey1Var;
        this.l = ey1Var2;
        this.g = ey1Var3;
        this.i = ey1Var4;
        this.j = ey1Var5;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                ph phVar = new ph((Channel) this.i, (oh) this.j, (ey1) this.k, (ey1) obj2, q60Var);
                phVar.g = obj;
                return phVar;
            case 1:
                ph phVar2 = new ph((BluetoothLeScanner) this.h, (nl0) this.i, (CopyOnWriteArrayList) this.j, (CancellableContinuationImpl) this.k, (JSONArray) obj2, q60Var, 1);
                phVar2.g = obj;
                return phVar2;
            case 2:
                ph phVar3 = new ph((oi2) obj2, q60Var);
                phVar3.g = obj;
                return phVar3;
            case 3:
                return new ph((CloudRepository) this.h, (ey1) this.k, (ey1) obj2, (ey1) this.g, (ey1) this.i, (ey1) this.j, q60Var);
            default:
                ph phVar4 = new ph((ca2) this.h, (lu0) this.i, (lu0) this.j, (qu0) this.k, (lu0) obj2, q60Var, 4);
                phVar4.g = obj;
                return phVar4;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((ph) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((ph) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((ph) create((ni2) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                return ((ph) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((ph) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0399  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0397 -> B:156:0x0376). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01fc -> B:177:0x01a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(oi2 oi2Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 2;
        this.l = oi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Channel channel, oh ohVar, ey1 ey1Var, ey1 ey1Var2, q60 q60Var) {
        super(2, q60Var);
        this.e = 0;
        this.i = channel;
        this.j = ohVar;
        this.k = ey1Var;
        this.l = ey1Var2;
    }
}
