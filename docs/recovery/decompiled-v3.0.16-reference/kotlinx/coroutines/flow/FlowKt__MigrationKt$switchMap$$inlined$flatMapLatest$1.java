package kotlinx.coroutines.flow;

import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", l = {189, 189}, m = "invokeSuspend")
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends k33 implements qu0 {
    final /* synthetic */ pu0 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pu0 pu0Var, q60 q60Var) {
        super(3, q60Var);
        this.$transform = pu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(FlowCollector<? super R> flowCollector, T t, q60 q60Var) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, q60Var);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = flowCollector;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = t;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r0, (kotlinx.coroutines.flow.Flow) r7, r6) == r4) goto L15;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            z70 r4 = defpackage.z70.e
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.ee0.J(r7)
            goto L43
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            defpackage.ee0.J(r7)
            goto L36
        L1f:
            defpackage.ee0.J(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r7 = r6.L$1
            pu0 r5 = r6.$transform
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r7 = r5.invoke(r7, r6)
            if (r7 != r4) goto L36
            goto L42
        L36:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.emitAll(r0, r7, r6)
            if (r6 != r4) goto L43
        L42:
            return r4
        L43:
            mf3 r6 = defpackage.mf3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
