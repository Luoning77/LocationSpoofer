package defpackage;

import com.vincenthzr.locationspoofer.MainActivity;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;
import com.vincenthzr.locationspoofer.data.model.RootSolution;
import io.github.libxposed.service.XposedService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l80 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(Object obj, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                l80 l80Var = new l80((m80) obj2, q60Var, 0);
                l80Var.f = obj;
                return l80Var;
            case 1:
                l80 l80Var2 = new l80(q60Var, (m4) obj2, 1);
                l80Var2.f = obj;
                return l80Var2;
            case 2:
                l80 l80Var3 = new l80(q60Var, (lu0) obj2, 2);
                l80Var3.f = obj;
                return l80Var3;
            case 3:
                l80 l80Var4 = new l80((j90) obj2, q60Var, 3);
                l80Var4.f = obj;
                return l80Var4;
            case 4:
                l80 l80Var5 = new l80((ye1) obj2, q60Var, 4);
                l80Var5.f = obj;
                return l80Var5;
            case Logger.WARN /* 5 */:
                return new l80((MainActivity) this.f, (s03) obj2, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new l80((l6) this.f, (t52) obj2, q60Var, 6);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return new l80((ml1) this.f, (ey1) obj2, q60Var, 7);
            case 8:
                return new l80((di0) this.f, (ImportExportCounts) obj2, q60Var, 8);
            case mc0.b /* 9 */:
                return new l80((lu0) this.f, (LocationSpooferDataPackage) obj2, q60Var, 9);
            case mc0.c /* 10 */:
                return new l80((l90) this.f, (List) obj2, q60Var, 10);
            case 11:
                return new l80((wi2) this.f, (String) obj2, q60Var, 11);
            case mc0.d /* 12 */:
                return new l80((List) this.f, (wi2) obj2, q60Var, 12);
            case 13:
                return new l80((wi2) this.f, (RootSolution) obj2, q60Var, 13);
            case 14:
                return new l80((lr2) this.f, (AppState) obj2, q60Var, 14);
            case a83.e /* 15 */:
                l80 l80Var6 = new l80((pu0) obj2, q60Var, 15);
                l80Var6.f = obj;
                return l80Var6;
            case 16:
                return new l80((nu2) this.f, (pu2) obj2, q60Var, 16);
            default:
                return new l80((xg3) this.f, (s03) obj2, q60Var, 17);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((l80) create((z52) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((l80) create((z52) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 4:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 8:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case mc0.b /* 9 */:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case mc0.c /* 10 */:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 11:
                return ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.d /* 12 */:
                return ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 13:
                return ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 14:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case a83.e /* 15 */:
                return ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 16:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            default:
                ((l80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String strK;
        boolean z2;
        int i = this.e;
        boolean z3 = false;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ee0.J(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f;
                m80 m80Var = (m80) obj2;
                Job job = (Job) m80Var.b.getAndSet(null);
                AtomicReference atomicReference = m80Var.b;
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k(job, m80Var, q60Var, 17), 3, null);
                while (!atomicReference.compareAndSet(null, jobLaunch$default)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = true;
                return Boolean.valueOf(z3);
            case 1:
                ee0.J(obj);
                z52 z52Var = (z52) this.f;
                z52Var.getClass();
                return ((m4) obj2).invoke(z52Var.b());
            case 2:
                ee0.J(obj);
                z52 z52Var2 = (z52) this.f;
                z52Var2.getClass();
                return ((lu0) obj2).invoke(z52Var2.b());
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f;
                ee0.J(obj);
                j90 j90Var = (j90) obj2;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new kd(j90Var, q60Var, 2), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new kd(j90Var, q60Var, 3), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new kd(j90Var, q60Var, 4), 3, null);
                return mf3Var;
            case 4:
                ee0.J(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f;
                ye1 ye1Var = (ye1) obj2;
                xe1 xe1Var = ye1Var.e;
                if (((ff1) xe1Var).d.compareTo(we1.f) >= 0) {
                    xe1Var.a(ye1Var);
                } else {
                    JobKt__JobKt.cancel$default(coroutineScope3.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                ee0.J(obj);
                if (MainActivity.onCreate$lambda$10$lambda$9$lambda$0((s03) obj2).getValidated()) {
                    ((MainActivity) this.f).checkAndRequestPermissions();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ee0.J(obj);
                if (((t52) obj2).g() == js.Personal.ordinal()) {
                    ((l6) this.f).f();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ee0.J(obj);
                ml1 ml1Var = (ml1) this.f;
                if (ml1Var != ml1.e) {
                    ((ey1) obj2).setValue(ml1Var);
                }
                return mf3Var;
            case 8:
                ee0.J(obj);
                ((di0) this.f).invoke((ImportExportCounts) obj2);
                return mf3Var;
            case mc0.b /* 9 */:
                ee0.J(obj);
                ((lu0) this.f).invoke((LocationSpooferDataPackage) obj2);
                return mf3Var;
            case mc0.c /* 10 */:
                ee0.J(obj);
                ((l90) this.f).invoke(new Integer(((List) obj2).size()));
                return mf3Var;
            case 11:
                ee0.J(obj);
                return wi2.a((String) obj2, new Long(10000L));
            case mc0.d /* 12 */:
                ee0.J(obj);
                List<String> list = (List) this.f;
                wi2 wi2Var = (wi2) obj2;
                ArrayList arrayList = new ArrayList(az.Y(list, 10));
                for (String str : list) {
                    wi2Var.getClass();
                    arrayList.add(new i52(str, Boolean.valueOf(!wi2.a("am force-stop " + str, null).equals("ERROR"))));
                }
                return arrayList;
            case 13:
                ee0.J(obj);
                ((wi2) this.f).getClass();
                String strA = wi2.a("id", null);
                vm3 vm3Var = vm3.a;
                XposedService xposedService = (XposedService) vm3.d.getValue();
                if (xposedService != null) {
                    try {
                        boolean z4 = xposedService.getRemotePreferences("locationspoofer_config").getString("snapshot", null) != null;
                        z = z4;
                        strK = z4 ? "Configuration published; check Hook status for receiver confirmation" : "Framework ready; no configuration published yet";
                        z2 = true;
                    } catch (Exception e) {
                        z = false;
                        strK = az2.k(e.getClass().getSimpleName(), ": ", e.getMessage());
                        z2 = false;
                    }
                } else {
                    strK = "Framework disconnected";
                    z2 = false;
                    z = false;
                }
                return new RootSetupTestResult(l13.c0(strA, "uid=0(root)", false), strA, (RootSolution) obj2, xposedService != null, z2, z, strK);
            case 14:
                ee0.J(obj);
                lr2 lr2Var = (lr2) this.f;
                if (lr2Var != null) {
                    lr2Var.l(((AppState) obj2).getMapType());
                }
                return mf3Var;
            case a83.e /* 15 */:
                ee0.J(obj);
                w70 w70Var = ((CoroutineScope) this.f).getCoroutineContext().get(j9.B);
                w70Var.getClass();
                s60 s60Var = (s60) w70Var;
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                BuildersKt.launch(GlobalScope.INSTANCE, s60Var, CoroutineStart.UNDISPATCHED, new m(completableDeferredCompletableDeferred$default, (pu0) obj2, q60Var, 22));
                while (!completableDeferredCompletableDeferred$default.isCompleted()) {
                    try {
                        return BuildersKt.runBlocking(s60Var, new d6(completableDeferredCompletableDeferred$default, q60Var, 18));
                    } catch (InterruptedException unused) {
                    }
                }
                return completableDeferredCompletableDeferred$default.getCompleted();
            case 16:
                ee0.J(obj);
                nu2 nu2Var = (nu2) this.f;
                if (nu2Var.b().isEmpty()) {
                    nu2Var.b.l.remove(nu2Var.a);
                }
                return mf3Var;
            default:
                ee0.J(obj);
                if (((og3) ((s03) obj2).getValue()).c.isEmpty()) {
                    ((xg3) this.f).g();
                }
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(q60 q60Var, lu0 lu0Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = lu0Var;
    }
}
