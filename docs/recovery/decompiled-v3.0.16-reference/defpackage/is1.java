package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudDeviceSlot;
import com.vincenthzr.locationspoofer.data.cloud.CloudEntitlements;
import com.vincenthzr.locationspoofer.data.cloud.MembershipCatalog;
import com.vincenthzr.locationspoofer.data.cloud.MembershipOrder;
import com.vincenthzr.locationspoofer.data.cloud.MembershipPlan;
import com.vincenthzr.locationspoofer.data.cloud.MembershipRepository;
import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class is1 extends hj3 {
    public final MembershipRepository b;
    public final MutableStateFlow c;
    public final StateFlow d;
    public final StateFlow e;
    public final MutableSharedFlow f;
    public final SharedFlow g;
    public Job h;
    public Job i;
    public boolean j;
    public long k;
    public long l;
    public bs1 m;
    public String n;

    /* JADX WARN: Multi-variable type inference failed */
    public is1(MembershipRepository membershipRepository) {
        this.b = membershipRepository;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new cs1(null, 2047));
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        this.e = membershipRepository.getAccountState();
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.f = mutableSharedFlowMutableSharedFlow$default;
        this.g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new d6((Object) this, (q60) (0 == true ? 1 : 0), 12), 3, null);
    }

    public final void e() {
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(cs1.a((cs1) mutableStateFlow.getValue(), null, null, null, false, null, null, null, null, null, null, 1983));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(MembershipOrder membershipOrder, String str, long j, r60 r60Var) {
        fs1 fs1Var;
        String str2;
        long j2;
        String str3;
        CloudEntitlements cloudEntitlements;
        Object objCatalog;
        CloudEntitlements cloudEntitlements2;
        String str4;
        MembershipOrder membershipOrder2;
        MembershipOrder membershipOrder3 = membershipOrder;
        if (r60Var instanceof fs1) {
            fs1Var = (fs1) r60Var;
            int i = fs1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fs1Var.k = i - Integer.MIN_VALUE;
            } else {
                fs1Var = new fs1(this, r60Var);
            }
        } else {
            fs1Var = new fs1(this, r60Var);
        }
        Object obj = fs1Var.i;
        int i2 = fs1Var.k;
        MembershipRepository membershipRepository = this.b;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            if (o51.f(membershipOrder3 != null ? membershipOrder3.getStatus() : null, "PAID") && !o51.f(this.n, membershipOrder3.getId())) {
                fs1Var.e = membershipOrder3;
                str2 = str;
                fs1Var.f = str2;
                j2 = j;
                fs1Var.h = j2;
                fs1Var.k = 1;
                if (membershipRepository.refreshAccount(fs1Var) != z70Var) {
                }
                return z70Var;
            }
            return mf3.a;
        }
        if (i2 == 1) {
            j2 = fs1Var.h;
            String str5 = fs1Var.f;
            MembershipOrder membershipOrder4 = fs1Var.e;
            ee0.J(obj);
            str2 = str5;
            membershipOrder3 = membershipOrder4;
        } else {
            if (i2 == 2) {
                j2 = fs1Var.h;
                String str6 = fs1Var.f;
                MembershipOrder membershipOrder5 = fs1Var.e;
                ee0.J(obj);
                str3 = str6;
                membershipOrder3 = membershipOrder5;
                cloudEntitlements = (CloudEntitlements) obj;
                g(str3, j2);
                fs1Var.e = membershipOrder3;
                fs1Var.f = str3;
                fs1Var.g = cloudEntitlements;
                fs1Var.h = j2;
                fs1Var.k = 3;
                objCatalog = membershipRepository.catalog(str3, fs1Var);
                if (objCatalog != z70Var) {
                    cloudEntitlements2 = cloudEntitlements;
                    obj = objCatalog;
                    str4 = str3;
                    membershipOrder2 = membershipOrder3;
                }
                return z70Var;
            }
            if (i2 != 3) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = fs1Var.h;
            CloudEntitlements cloudEntitlements3 = fs1Var.g;
            str4 = fs1Var.f;
            membershipOrder2 = fs1Var.e;
            ee0.J(obj);
            cloudEntitlements2 = cloudEntitlements3;
        }
        g(str4, j2);
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(cs1.a((cs1) mutableStateFlow.getValue(), (MembershipCatalog) obj, null, null, false, null, null, null, null, cloudEntitlements2, null, 1534));
        this.n = membershipOrder2.getId();
        return mf3.a;
        g(str2, j2);
        fs1Var.e = membershipOrder3;
        fs1Var.f = str2;
        fs1Var.h = j2;
        fs1Var.k = 2;
        Object objEntitlements = membershipRepository.entitlements(str2, fs1Var);
        if (objEntitlements != z70Var) {
            str3 = str2;
            obj = objEntitlements;
            cloudEntitlements = (CloudEntitlements) obj;
            g(str3, j2);
            fs1Var.e = membershipOrder3;
            fs1Var.f = str3;
            fs1Var.g = cloudEntitlements;
            fs1Var.h = j2;
            fs1Var.k = 3;
            objCatalog = membershipRepository.catalog(str3, fs1Var);
            if (objCatalog != z70Var) {
                cloudEntitlements2 = cloudEntitlements;
                obj = objCatalog;
                str4 = str3;
                membershipOrder2 = membershipOrder3;
                g(str4, j2);
                MutableStateFlow mutableStateFlow2 = this.c;
                mutableStateFlow2.setValue(cs1.a((cs1) mutableStateFlow2.getValue(), (MembershipCatalog) obj, null, null, false, null, null, null, null, cloudEntitlements2, null, 1534));
                this.n = membershipOrder2.getId();
                return mf3.a;
            }
        }
        return z70Var;
    }

    public final void g(String str, long j) {
        if (this.k == j) {
            CloudAccount account = ((CloudAccountState) this.e.getValue()).getAccount();
            if (o51.f(account != null ? account.getId() : null, str)) {
                return;
            }
        }
        throw new CancellationException("账号已切换");
    }

    public final void h() {
        if (((cs1) this.c.getValue()).d) {
            return;
        }
        j(new gs1(this, null));
    }

    public final void i(String str) {
        str.getClass();
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(cs1.a((cs1) mutableStateFlow.getValue(), null, null, null, false, null, str, null, null, null, null, 1983));
    }

    public final void j(qu0 qu0Var) {
        MutableStateFlow mutableStateFlow = this.c;
        String str = ((cs1) mutableStateFlow.getValue()).f;
        if (str == null) {
            return;
        }
        long j = this.k;
        Job job = this.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.l++;
        mutableStateFlow.setValue(cs1.a((cs1) mutableStateFlow.getValue(), null, null, null, true, null, null, null, null, null, null, 2023));
        this.h = BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new n(qu0Var, str, j, this, (q60) null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    public final void k(String str) {
        MembershipCatalog membershipCatalog;
        List<MembershipPlan> plans;
        String str2;
        MembershipPlan membershipPlan;
        List<MembershipPlan> plans2;
        Object next;
        str.getClass();
        MutableStateFlow mutableStateFlow = this.c;
        if (((cs1) mutableStateFlow.getValue()).d || (membershipCatalog = ((cs1) mutableStateFlow.getValue()).a) == null || (plans = membershipCatalog.getPlans()) == null || plans.isEmpty()) {
            return;
        }
        Iterator<T> it = plans.iterator();
        while (it.hasNext()) {
            if (o51.f(((MembershipPlan) it.next()).getId(), str)) {
                this.m = null;
                cs1 cs1Var = (cs1) mutableStateFlow.getValue();
                String str3 = ((cs1) mutableStateFlow.getValue()).i;
                if (str3 == null) {
                    str2 = null;
                } else {
                    MembershipCatalog membershipCatalog2 = ((cs1) mutableStateFlow.getValue()).a;
                    if (membershipCatalog2 == null || (plans2 = membershipCatalog2.getPlans()) == null) {
                        membershipPlan = null;
                    } else {
                        Iterator<T> it2 = plans2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!o51.f(((MembershipPlan) next).getId(), str));
                        membershipPlan = (MembershipPlan) next;
                    }
                    List<RewardCoupon> list = ((cs1) mutableStateFlow.getValue()).h;
                    if (list == null || !list.isEmpty()) {
                        for (RewardCoupon rewardCoupon : list) {
                            if (o51.f(rewardCoupon.getId(), str3)) {
                                if (rewardCoupon.getMinimumCents() <= (membershipPlan != null ? membershipPlan.getPriceCents() : 0)) {
                                    str2 = str3;
                                }
                            }
                        }
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                }
                mutableStateFlow.setValue(cs1.a(cs1Var, null, null, str, false, null, null, null, str2, null, null, 747));
                return;
            }
        }
    }

    public final void l(String str) {
        MutableStateFlow mutableStateFlow = this.c;
        if (((cs1) mutableStateFlow.getValue()).d) {
            return;
        }
        if (str != null) {
            List list = ((cs1) mutableStateFlow.getValue()).h;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (o51.f(((RewardCoupon) it.next()).getId(), str)) {
                    }
                }
                return;
            }
            return;
        }
        this.m = null;
        mutableStateFlow.setValue(cs1.a((cs1) mutableStateFlow.getValue(), null, null, null, false, null, null, null, str, null, null, 1775));
    }

    public final void m(String str) {
        List<CloudDeviceSlot> slots;
        MutableStateFlow mutableStateFlow = this.c;
        if (((cs1) mutableStateFlow.getValue()).d) {
            return;
        }
        if (str != null) {
            CloudEntitlements cloudEntitlements = ((cs1) mutableStateFlow.getValue()).j;
            if (cloudEntitlements == null || (slots = cloudEntitlements.getSlots()) == null || slots.isEmpty()) {
                return;
            }
            Iterator<T> it = slots.iterator();
            while (it.hasNext()) {
                if (o51.f(((CloudDeviceSlot) it.next()).getId(), str)) {
                }
            }
            return;
        }
        this.m = null;
        mutableStateFlow.setValue(cs1.a((cs1) mutableStateFlow.getValue(), null, null, null, false, null, null, null, null, null, str, 1007));
    }

    public final void n(boolean z) {
        this.j = z;
        if (!z) {
            Job job = this.i;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.i = null;
            return;
        }
        h();
        Job job2 = this.i;
        if (job2 == null || !job2.isActive()) {
            this.i = BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new hs1(this, null), 3, null);
        }
    }
}
