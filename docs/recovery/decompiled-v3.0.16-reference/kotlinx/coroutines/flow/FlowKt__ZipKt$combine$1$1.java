package kotlinx.coroutines.flow;

import defpackage.k33;
import defpackage.mf3;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combine$1$1 extends k33 implements qu0 {
    final /* synthetic */ qu0 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(qu0 qu0Var, q60 q60Var) {
        super(3, q60Var);
        this.$transform = qu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, q60 q60Var) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, q60Var);
        flowKt__ZipKt$combine$1$1.L$0 = flowCollector;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r8, r7) == r4) goto L15;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            z70 r4 = defpackage.z70.e
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.ee0.J(r8)
            goto L48
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r1
        L17:
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            defpackage.ee0.J(r8)
            goto L3d
        L1f:
            defpackage.ee0.J(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r8 = r7.L$1
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            qu0 r5 = r7.$transform
            r6 = 0
            r6 = r8[r6]
            r8 = r8[r3]
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = r5.invoke(r6, r8, r7)
            if (r8 != r4) goto L3d
            goto L47
        L3d:
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r4) goto L48
        L47:
            return r4
        L48:
            mf3 r7 = defpackage.mf3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
