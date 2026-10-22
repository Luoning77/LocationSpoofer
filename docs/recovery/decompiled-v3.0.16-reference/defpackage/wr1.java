package defpackage;

import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wr1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(Object obj, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new wr1((co2) this.g, (ey1) obj2, q60Var, 0);
            case 1:
                return new wr1((is1) this.g, (Context) obj2, q60Var, 1);
            case 2:
                return new wr1((StateFlow) this.g, (mv1) obj2, q60Var, 2);
            case 3:
                wr1 wr1Var = new wr1((dw1) obj2, q60Var, 3);
                wr1Var.g = obj;
                return wr1Var;
            case 4:
                return new wr1((e02) this.g, (pu0) obj2, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new wr1((pu0) this.g, (d62) obj2, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new wr1((TextClassifier) this.g, (pu0) obj2, q60Var, 6);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                wr1 wr1Var2 = new wr1((of) obj2, q60Var, 7);
                wr1Var2.g = obj;
                return wr1Var2;
            case 8:
                return new wr1((String) this.g, (wi2) obj2, q60Var, 8);
            case mc0.b /* 9 */:
                return new wr1((oe0) this.g, (po2) obj2, q60Var, 9);
            case mc0.c /* 10 */:
                return new wr1((zx) this.g, (dj) obj2, q60Var, 10);
            case 11:
                return new wr1((nu2) this.g, (yz2) obj2, q60Var, 11);
            case mc0.d /* 12 */:
                return new wr1((ex2) this.g, (m) obj2, q60Var, 12);
            case 13:
                return new wr1((Flow) this.g, (kc2) obj2, q60Var, 13);
            case 14:
                return new wr1((ax) this.g, (si) obj2, q60Var, 14);
            case a83.e /* 15 */:
                return new wr1((Job) this.g, (tb2) obj2, q60Var, 15);
            case 16:
                return new wr1((ld3) this.g, (au0) obj2, q60Var, 16);
            default:
                return new wr1((ke2) this.g, (View) obj2, q60Var, 17);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 1:
                ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return z70Var;
            case 2:
                ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return z70Var;
            case 3:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 4:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case Logger.WARN /* 5 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 8:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case mc0.b /* 9 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case mc0.c /* 10 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 11:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case mc0.d /* 12 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 13:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 14:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case a83.e /* 15 */:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 16:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            default:
                return ((wr1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x032b A[Catch: all -> 0x0313, PHI: r0 r4
      0x032b: PHI (r0v22 kotlinx.coroutines.CoroutineScope) = 
      (r0v20 kotlinx.coroutines.CoroutineScope)
      (r0v21 kotlinx.coroutines.CoroutineScope)
      (r0v26 kotlinx.coroutines.CoroutineScope)
     binds: [B:182:0x0324, B:190:0x0364, B:174:0x030f] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r4v4 wr1) = (r4v0 wr1), (r4v3 wr1), (r4v0 wr1) binds: [B:182:0x0324, B:190:0x0364, B:174:0x030f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0313, blocks: (B:174:0x030f, B:183:0x032b, B:185:0x0335, B:188:0x0342, B:180:0x031e), top: B:229:0x0305 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0335 A[Catch: all -> 0x0313, TryCatch #0 {all -> 0x0313, blocks: (B:174:0x030f, B:183:0x032b, B:185:0x0335, B:188:0x0342, B:180:0x031e), top: B:229:0x0305 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0341  */
    /* JADX WARN: Code duplicated, block: B:188:0x0342 A[Catch: all -> 0x0313, PHI: r0 r2 r4
      0x0342: PHI (r0v21 kotlinx.coroutines.CoroutineScope) = (r0v22 kotlinx.coroutines.CoroutineScope), (r0v24 kotlinx.coroutines.CoroutineScope) binds: [B:186:0x033f, B:181:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0342: PHI (r2v3 java.lang.Object) = (r2v11 java.lang.Object), (r2v12 java.lang.Object) binds: [B:186:0x033f, B:181:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0342: PHI (r4v1 wr1) = (r4v4 wr1), (r4v0 wr1) binds: [B:186:0x033f, B:181:0x0321] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0313, blocks: (B:174:0x030f, B:183:0x032b, B:185:0x0335, B:188:0x0342, B:180:0x031e), top: B:229:0x0305 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x0364 -> B:183:0x032b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
    }
}
