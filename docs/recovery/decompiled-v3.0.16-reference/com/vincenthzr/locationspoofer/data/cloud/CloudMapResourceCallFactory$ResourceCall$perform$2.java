package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$perform$2", f = "CloudMapResourceClient.kt", l = {383, 247, 250, 254, 255, 256, 263}, m = "invokeSuspend")
public final class CloudMapResourceCallFactory$ResourceCall$perform$2 extends k33 implements pu0 {
    final /* synthetic */ CloudMapResourceCache $cache;
    final /* synthetic */ CloudMapResourceCallFactory.Resource $spec;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ CloudMapResourceCallFactory.ResourceCall this$0;
    final /* synthetic */ CloudMapResourceCallFactory this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMapResourceCallFactory$ResourceCall$perform$2(CloudMapResourceCallFactory.ResourceCall resourceCall, CloudMapResourceCallFactory cloudMapResourceCallFactory, CloudMapResourceCallFactory.Resource resource, CloudMapResourceCache cloudMapResourceCache, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = resourceCall;
        this.this$1 = cloudMapResourceCallFactory;
        this.$spec = resource;
        this.$cache = cloudMapResourceCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 invokeSuspend$lambda$0(CloudMapResourceCallFactory.ResourceCall resourceCall) throws IOException {
        resourceCall.checkCancelled();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 invokeSuspend$lambda$5$lambda$1(CloudMapResourceCallFactory.ResourceCall resourceCall) throws IOException {
        resourceCall.checkCancelled();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 invokeSuspend$lambda$5$lambda$2(CloudMapResourceCallFactory.ResourceCall resourceCall) throws IOException {
        resourceCall.checkCancelled();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 invokeSuspend$lambda$5$lambda$3(CloudMapResourceCallFactory.ResourceCall resourceCall) throws IOException {
        resourceCall.checkCancelled();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 invokeSuspend$lambda$5$lambda$4(CloudMapResourceCallFactory.ResourceCall resourceCall) throws IOException {
        resourceCall.checkCancelled();
        return mf3.a;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new CloudMapResourceCallFactory$ResourceCall$perform$2(this.this$0, this.this$1, this.$spec, this.$cache, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudMapResourceCallFactory$ResourceCall$perform$2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x037d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x03d7 A[Catch: all -> 0x002b, CloudException -> 0x03d4, TRY_ENTER, TryCatch #4 {all -> 0x002b, blocks: (B:7:0x0026, B:123:0x0416, B:101:0x037e, B:102:0x0383, B:105:0x0398, B:108:0x03bf, B:120:0x03f3, B:94:0x0353, B:95:0x0356, B:97:0x035c, B:113:0x03d7, B:114:0x03e8, B:70:0x0295, B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef, B:62:0x0261, B:63:0x0264, B:64:0x0270, B:66:0x0276, B:76:0x02a5, B:77:0x02b6), top: B:133:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03ef A[Catch: all -> 0x002b, CloudException -> 0x0312, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CloudException -> 0x0312, blocks: (B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef), top: B:126:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0256  */
    /* JADX WARN: Code duplicated, block: B:66:0x0276 A[Catch: all -> 0x002b, CloudException -> 0x029f, TRY_LEAVE, TryCatch #4 {all -> 0x002b, blocks: (B:7:0x0026, B:123:0x0416, B:101:0x037e, B:102:0x0383, B:105:0x0398, B:108:0x03bf, B:120:0x03f3, B:94:0x0353, B:95:0x0356, B:97:0x035c, B:113:0x03d7, B:114:0x03e8, B:70:0x0295, B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef, B:62:0x0261, B:63:0x0264, B:64:0x0270, B:66:0x0276, B:76:0x02a5, B:77:0x02b6), top: B:133:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0292  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a5 A[Catch: all -> 0x002b, CloudException -> 0x029f, TRY_ENTER, TryCatch #4 {all -> 0x002b, blocks: (B:7:0x0026, B:123:0x0416, B:101:0x037e, B:102:0x0383, B:105:0x0398, B:108:0x03bf, B:120:0x03f3, B:94:0x0353, B:95:0x0356, B:97:0x035c, B:113:0x03d7, B:114:0x03e8, B:70:0x0295, B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef, B:62:0x0261, B:63:0x0264, B:64:0x0270, B:66:0x0276, B:76:0x02a5, B:77:0x02b6), top: B:133:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02cb A[Catch: all -> 0x002b, CloudException -> 0x0312, TryCatch #0 {CloudException -> 0x0312, blocks: (B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef), top: B:126:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02e2 A[Catch: all -> 0x002b, CloudException -> 0x0312, TRY_LEAVE, TryCatch #0 {CloudException -> 0x0312, blocks: (B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef), top: B:126:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0305  */
    /* JADX WARN: Code duplicated, block: B:89:0x0316  */
    /* JADX WARN: Code duplicated, block: B:93:0x034c  */
    /* JADX WARN: Code duplicated, block: B:97:0x035c A[Catch: all -> 0x002b, CloudException -> 0x03d4, TRY_LEAVE, TryCatch #4 {all -> 0x002b, blocks: (B:7:0x0026, B:123:0x0416, B:101:0x037e, B:102:0x0383, B:105:0x0398, B:108:0x03bf, B:120:0x03f3, B:94:0x0353, B:95:0x0356, B:97:0x035c, B:113:0x03d7, B:114:0x03e8, B:70:0x0295, B:78:0x02b7, B:80:0x02cb, B:82:0x02e2, B:117:0x03ef, B:62:0x0261, B:63:0x0264, B:64:0x0270, B:66:0x0276, B:76:0x02a5, B:77:0x02b6), top: B:133:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0413, code lost:
    
        if (r4.mapRequestFailed$core_data_globalRelease(r0, r3, r27) == r13) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0062: MOVE (r14 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:99), block:B:17:0x0062 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00f1: MOVE (r1 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:242), block:B:30:0x00f1 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Semaphore] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$perform$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
