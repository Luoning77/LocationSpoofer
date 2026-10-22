package com.vincenthzr.locationspoofer.data.sharing;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import defpackage.au0;
import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.i52;
import defpackage.k33;
import defpackage.l13;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RadioSharingManager {
    private i52 binding;
    private final SharingConsentStore consent;
    private long generation;
    private final Object lock;
    private final MutableStateFlow<SharingUiState> mutable;
    private final CoroutineScope scope;
    private final au0 simulating;
    private final RadioSharingSource source;
    private final StateFlow<SharingUiState> state;
    private Job statusJob;
    private Job uploadJob;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager$1", f = "RadioSharingManager.kt", l = {25}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        int label;

        public AnonymousClass1(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return RadioSharingManager.this.new AnonymousClass1(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                StateFlow<CloudAccountState> accountState = RadioSharingManager.this.source.getAccountState();
                final RadioSharingManager radioSharingManager = RadioSharingManager.this;
                FlowCollector<? super CloudAccountState> flowCollector = new FlowCollector() { // from class: com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(CloudAccountState cloudAccountState, q60 q60Var) {
                        Job job;
                        Object obj2 = radioSharingManager.lock;
                        RadioSharingManager radioSharingManager2 = radioSharingManager;
                        synchronized (obj2) {
                            try {
                                i52 i52VarCurrentBinding = radioSharingManager2.currentBinding();
                                if (!o51.f(i52VarCurrentBinding, radioSharingManager2.binding)) {
                                    radioSharingManager2.generation++;
                                    Job job2 = radioSharingManager2.uploadJob;
                                    if (job2 != null) {
                                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                    }
                                    Job job3 = radioSharingManager2.statusJob;
                                    if (job3 != null) {
                                        Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                    }
                                    radioSharingManager2.uploadJob = null;
                                    radioSharingManager2.statusJob = null;
                                    radioSharingManager2.binding = i52VarCurrentBinding;
                                    radioSharingManager2.mutable.setValue(new SharingUiState(i52VarCurrentBinding != null && radioSharingManager2.consent.enabled((String) i52VarCurrentBinding.e), false, false, null, false, false, null, 126, null));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (radioSharingManager.binding != null && !radioSharingManager.getState().getValue().getAvailable() && ((job = radioSharingManager.statusJob) == null || !job.isActive())) {
                            radioSharingManager.refresh();
                        }
                        return mf3.a;
                    }
                };
                this.label = 1;
                Object objCollect = accountState.collect(flowCollector, this);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            fo.d();
            return null;
        }
    }

    public RadioSharingManager(RadioSharingSource radioSharingSource, SharingConsentStore sharingConsentStore, au0 au0Var, CoroutineScope coroutineScope) {
        radioSharingSource.getClass();
        sharingConsentStore.getClass();
        au0Var.getClass();
        coroutineScope.getClass();
        this.source = radioSharingSource;
        this.consent = sharingConsentStore;
        this.simulating = au0Var;
        this.scope = coroutineScope;
        this.lock = new Object();
        MutableStateFlow<SharingUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new SharingUiState(false, false, false, null, false, false, null, WorkQueueKt.MASK, null));
        this.mutable = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String accountId(SharingTicket sharingTicket) {
        return l13.z0(sharingTicket.getIdentity$core_data_globalRelease(), ':');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i52 currentBinding() {
        CloudAccountState value = this.source.getAccountState().getValue();
        CloudAccount account = value.getAccount();
        if (account == null || !value.getValidated() || l13.k0(account.getId()) || l13.k0(account.getDeviceId()) || l13.k0(account.getSessionId())) {
            return null;
        }
        return new i52(account.getId() + ":" + account.getDeviceId(), account.getSessionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean valid(SharingTicket sharingTicket) {
        return o51.f(this.binding, new i52(sharingTicket.getIdentity$core_data_globalRelease(), sharingTicket.getSession$core_data_globalRelease())) && this.generation == sharingTicket.getGeneration$core_data_globalRelease() && o51.f(currentBinding(), this.binding);
    }

    public final SharingTicket beginCollection() {
        synchronized (this.lock) {
            i52 i52Var = this.binding;
            if (i52Var == null) {
                return null;
            }
            if (o51.f(currentBinding(), this.binding) && this.state.getValue().getEnabled() && this.state.getValue().getEligible() && this.state.getValue().getAvailable() && !((Boolean) this.simulating.invoke()).booleanValue()) {
                return new SharingTicket((String) i52Var.e, (String) i52Var.f, this.generation);
            }
            return null;
        }
    }

    public final StateFlow<SharingUiState> getState() {
        return this.state;
    }

    public final void refresh() {
        Job job;
        synchronized (this.lock) {
            try {
                i52 i52Var = this.binding;
                if (i52Var != null && o51.f(currentBinding(), this.binding) && ((job = this.statusJob) == null || !job.isActive())) {
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new RadioSharingManager$refresh$1$1(this, new SharingTicket((String) i52Var.e, (String) i52Var.f, this.generation), null), 1, null);
                    jobLaunch$default.start();
                    this.statusJob = jobLaunch$default;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setEnabled(boolean z) {
        boolean z2;
        SharingUiState value;
        MutableStateFlow<SharingUiState> mutableStateFlow;
        boolean z3 = z;
        synchronized (this.lock) {
            try {
                i52 i52Var = this.binding;
                if (i52Var != null && (!z3 || (this.state.getValue().getEligible() && this.state.getValue().getAvailable() && o51.f(currentBinding(), this.binding)))) {
                    try {
                        this.consent.setEnabled((String) i52Var.e, z3);
                        z2 = true;
                        while (true) {
                            SharingUiState value2 = mutableStateFlow.getValue();
                            if (mutableStateFlow.compareAndSet(value2, SharingUiState.copy$default(value2, z3, false, false, null, false, false, z2 ? null : "sharing_save_failed", 14, null))) {
                                break;
                            } else {
                                z3 = z;
                            }
                        }
                    } catch (Exception unused) {
                        if (z3) {
                            MutableStateFlow<SharingUiState> mutableStateFlow2 = this.mutable;
                            do {
                                value = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.compareAndSet(value, SharingUiState.copy$default(value, false, false, false, null, false, false, "sharing_save_failed", 63, null)));
                        } else {
                            z2 = false;
                        }
                    }
                    this.generation++;
                    Job job = this.uploadJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    Job job2 = this.statusJob;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    this.uploadJob = null;
                    this.statusJob = null;
                    mutableStateFlow = this.mutable;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void share(SharingTicket sharingTicket, RadioContributionDraft radioContributionDraft) {
        Job job;
        synchronized (this.lock) {
            if (sharingTicket != null && radioContributionDraft != null) {
                try {
                    if (valid(sharingTicket) && this.state.getValue().getEnabled() && this.state.getValue().getEligible() && !((Boolean) this.simulating.invoke()).booleanValue() && ((job = this.uploadJob) == null || !job.isActive())) {
                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new RadioSharingManager$share$1$1(this, radioContributionDraft, sharingTicket, null), 1, null);
                        jobLaunch$default.start();
                        this.uploadJob = jobLaunch$default;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void withdraw() {
        synchronized (this.lock) {
            i52 i52Var = this.binding;
            if (i52Var != null) {
                setEnabled(false);
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new RadioSharingManager$withdraw$1$1(this, new SharingTicket((String) i52Var.e, (String) i52Var.f, this.generation), null), 1, null);
                jobLaunch$default.start();
                this.statusJob = jobLaunch$default;
            }
        }
    }

    public /* synthetic */ RadioSharingManager(RadioSharingSource radioSharingSource, SharingConsentStore sharingConsentStore, au0 au0Var, CoroutineScope coroutineScope, int i, ca0 ca0Var) {
        this(radioSharingSource, sharingConsentStore, au0Var, (i & 8) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())) : coroutineScope);
    }
}
