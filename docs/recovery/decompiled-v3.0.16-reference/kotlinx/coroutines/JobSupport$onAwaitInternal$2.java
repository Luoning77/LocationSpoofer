package kotlinx.coroutines;

import defpackage.bv0;
import defpackage.qu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends bv0 implements qu0 {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.qu0
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        return jobSupport.onAwaitInternalProcessResFunc(obj, obj2);
    }
}
