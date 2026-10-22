package com.vincenthzr.locationspoofer.data.sharing;

import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager$withdraw$1$1", f = "RadioSharingManager.kt", l = {102, 103}, m = "invokeSuspend")
public final class RadioSharingManager$withdraw$1$1 extends k33 implements pu0 {
    final /* synthetic */ SharingTicket $ticket;
    int label;
    final /* synthetic */ RadioSharingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioSharingManager$withdraw$1$1(RadioSharingManager radioSharingManager, SharingTicket sharingTicket, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = radioSharingManager;
        this.$ticket = sharingTicket;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new RadioSharingManager$withdraw$1$1(this.this$0, this.$ticket, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((RadioSharingManager$withdraw$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r2 == r0) goto L27;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager$withdraw$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
