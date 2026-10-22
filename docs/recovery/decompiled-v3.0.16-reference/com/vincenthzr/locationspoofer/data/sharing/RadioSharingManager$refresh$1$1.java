package com.vincenthzr.locationspoofer.data.sharing;

import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager$refresh$1$1", f = "RadioSharingManager.kt", l = {71}, m = "invokeSuspend")
public final class RadioSharingManager$refresh$1$1 extends k33 implements pu0 {
    final /* synthetic */ SharingTicket $ticket;
    int label;
    final /* synthetic */ RadioSharingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioSharingManager$refresh$1$1(RadioSharingManager radioSharingManager, SharingTicket sharingTicket, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = radioSharingManager;
        this.$ticket = sharingTicket;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new RadioSharingManager$refresh$1$1(this.this$0, this.$ticket, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((RadioSharingManager$refresh$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object value;
        SharingUiState sharingUiState;
        String code;
        Object value2;
        Object objStatus;
        Object value3;
        z70 z70Var = z70.e;
        int i = this.label;
        try {
            if (i == 0) {
                ee0.J(obj);
                Object obj2 = this.this$0.lock;
                RadioSharingManager radioSharingManager = this.this$0;
                SharingTicket sharingTicket = this.$ticket;
                synchronized (obj2) {
                    if (!radioSharingManager.valid(sharingTicket)) {
                        throw new CancellationException();
                    }
                    MutableStateFlow mutableStateFlow = radioSharingManager.mutable;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, SharingUiState.copy$default((SharingUiState) value2, false, false, false, null, true, false, null, 111, null)));
                }
                RadioSharingSource radioSharingSource = this.this$0.source;
                String strAccountId = this.this$0.accountId(this.$ticket);
                this.label = 1;
                objStatus = radioSharingSource.status(strAccountId, this);
                if (objStatus == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                objStatus = obj;
            }
            SharingStatus sharingStatus = (SharingStatus) objStatus;
            Object obj3 = this.this$0.lock;
            RadioSharingManager radioSharingManager2 = this.this$0;
            SharingTicket sharingTicket2 = this.$ticket;
            synchronized (obj3) {
                if (radioSharingManager2.valid(sharingTicket2)) {
                    MutableStateFlow mutableStateFlow2 = radioSharingManager2.mutable;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, SharingUiState.copy$default((SharingUiState) value3, false, sharingStatus.getCanContribute(), sharingStatus.getEnabled(), sharingStatus.getCounts(), false, false, null, 33, null)));
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Object obj4 = this.this$0.lock;
            RadioSharingManager radioSharingManager3 = this.this$0;
            SharingTicket sharingTicket3 = this.$ticket;
            synchronized (obj4) {
                try {
                    if (radioSharingManager3.valid(sharingTicket3)) {
                        MutableStateFlow mutableStateFlow3 = radioSharingManager3.mutable;
                        do {
                            value = mutableStateFlow3.getValue();
                            sharingUiState = (SharingUiState) value;
                            CloudException cloudException = e2 instanceof CloudException ? (CloudException) e2 : null;
                            if (cloudException == null || (code = cloudException.getCode()) == null) {
                                code = "sharing_network_failed";
                            }
                        } while (!mutableStateFlow3.compareAndSet(value, SharingUiState.copy$default(sharingUiState, false, false, false, null, false, false, code, 47, null)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mf3.a;
    }
}
