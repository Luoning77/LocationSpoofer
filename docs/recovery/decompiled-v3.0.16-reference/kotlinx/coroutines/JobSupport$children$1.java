package kotlinx.coroutines;

import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.vg2;
import defpackage.ws2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
public final class JobSupport$children$1 extends vg2 implements pu0 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = jobSupport;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, q60Var);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(ws2 ws2Var, q60 q60Var) {
        return ((JobSupport$children$1) create(ws2Var, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:25:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            z70 r3 = defpackage.z70.e
            if (r0 == 0) goto L27
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r5.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            java.lang.Object r2 = r5.L$1
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r2
            java.lang.Object r4 = r5.L$0
            ws2 r4 = (defpackage.ws2) r4
            defpackage.ee0.J(r6)
            goto L76
        L1c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r5)
            r5 = 0
            return r5
        L23:
            defpackage.ee0.J(r6)
            goto L7b
        L27:
            defpackage.ee0.J(r6)
            java.lang.Object r6 = r5.L$0
            ws2 r6 = (defpackage.ws2) r6
            kotlinx.coroutines.JobSupport r0 = r5.this$0
            java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
            boolean r4 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r4 == 0) goto L42
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            kotlinx.coroutines.ChildJob r0 = r0.childJob
            r5.label = r2
            r6.a(r0, r5)
            return r3
        L42:
            boolean r2 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r2 == 0) goto L7b
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r0 = r0.getList()
            if (r0 == 0) goto L7b
            java.lang.Object r2 = r0.getNext()
            r2.getClass()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r4 = r2
            r2 = r0
            r0 = r4
            r4 = r6
        L5b:
            boolean r6 = defpackage.o51.f(r0, r2)
            if (r6 != 0) goto L7b
            boolean r6 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r6 == 0) goto L76
            r6 = r0
            kotlinx.coroutines.ChildHandleNode r6 = (kotlinx.coroutines.ChildHandleNode) r6
            kotlinx.coroutines.ChildJob r6 = r6.childJob
            r5.L$0 = r4
            r5.L$1 = r2
            r5.L$2 = r0
            r5.label = r1
            r4.a(r6, r5)
            return r3
        L76:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L5b
        L7b:
            mf3 r5 = defpackage.mf3.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
