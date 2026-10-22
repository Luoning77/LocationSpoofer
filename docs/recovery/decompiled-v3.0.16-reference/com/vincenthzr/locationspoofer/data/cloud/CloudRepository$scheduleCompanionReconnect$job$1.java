package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudRepository$scheduleCompanionReconnect$job$1", f = "CloudRepository.kt", l = {742, 1507, 746}, m = "invokeSuspend")
public final class CloudRepository$scheduleCompanionReconnect$job$1 extends k33 implements pu0 {
    final /* synthetic */ long $stamp;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CloudRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudRepository$scheduleCompanionReconnect$job$1(CloudRepository cloudRepository, long j, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = cloudRepository;
        this.$stamp = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new CloudRepository$scheduleCompanionReconnect$job$1(this.this$0, this.$stamp, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudRepository$scheduleCompanionReconnect$job$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[PHI: r1 r5 r9
      0x0059: PHI (r1v6 java.util.Iterator) = (r1v8 java.util.Iterator), (r1v12 java.util.Iterator) binds: [B:21:0x0086, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r5v3 int) = (r5v5 int), (r5v0 int) binds: [B:21:0x0086, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r9v4 long) = (r9v11 long), (r9v13 long) binds: [B:21:0x0086, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:39:0x0119, B:27:0x00af, B:29:0x00bb, B:31:0x00c1, B:34:0x00d8, B:45:0x0128, B:46:0x012b), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0130: INVOKE (r11 I:kotlinx.coroutines.sync.Mutex), (r7 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:305), block:B:49:0x0130 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0118 -> B:39:0x0119). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.CloudRepository$scheduleCompanionReconnect$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
