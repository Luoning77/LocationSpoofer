package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.annotations.Marker;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a4 extends k33 implements pu0 {
    public final /* synthetic */ int e = 3;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(AppState appState, Double d, Double d2, lr2 lr2Var, Context context, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.i = appState;
        this.j = d;
        this.g = d2;
        this.h = lr2Var;
        this.k = context;
        this.f = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                return new a4((String) obj6, (AccountBenefitsRepository) obj5, this.f, (CoroutineScope) obj2, (ey1) obj4, (ey1) obj3, q60Var);
            case 1:
                return new a4((List) obj6, (GithubRelease) obj5, (ul1) obj2, this.f, (ey1) obj4, (ey1) obj3, q60Var);
            case 2:
                return new a4((l6) obj6, this.f, (ey1) obj4, (ey1) obj3, (ey1) obj5, (ey1) obj2, q60Var);
            default:
                return new a4((AppState) obj6, (Double) obj5, (Double) obj4, (lr2) obj3, (Context) obj2, this.f, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((a4) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((a4) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 2:
                ((a4) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((a4) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Marker marker;
        int i = this.e;
        kr2 kr2VarB = null;
        Object[] objArr = 0;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.k;
        Object obj3 = this.i;
        Object obj4 = this.j;
        Object obj5 = this.g;
        Object obj6 = this.h;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                String str = (String) obj3;
                if (str != null) {
                    AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) obj4;
                    xq1.q(str, (CoroutineScope) obj2, (ey1) obj5, (ey1) obj6, accountBenefitsRepository, new m(accountBenefitsRepository, ey1Var, objArr == true ? 1 : 0, 1));
                }
                break;
            case 1:
                ee0.J(obj);
                if (!((Boolean) ey1Var.getValue()).booleanValue() && !((og3) ((ey1) obj5).getValue()).a && !((List) obj3).isEmpty()) {
                    GithubRelease githubRelease = (GithubRelease) obj4;
                    if (githubRelease != null) {
                        String versionName = githubRelease.getVersionName();
                        ul1 ul1Var = (ul1) obj2;
                        ul1Var.getClass();
                        String ignoredVersion = ul1Var.c.getIgnoredVersion();
                        if (mc0.y(versionName) && !versionName.equals(ignoredVersion)) {
                            ((ey1) obj6).setValue(Boolean.TRUE);
                        }
                    }
                    ey1Var.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                ee0.J(obj);
                ey1Var.setValue("");
                ((ey1) obj5).setValue("");
                Boolean bool = Boolean.FALSE;
                ((ey1) obj6).setValue(bool);
                ((ey1) obj4).setValue(null);
                ((ey1) obj2).setValue(bool);
                ((l6) obj3).f();
                break;
            default:
                lr2 lr2Var = (lr2) obj6;
                Double d = (Double) obj5;
                Double d2 = (Double) obj4;
                ee0.J(obj);
                AppState appState = (AppState) obj3;
                if (appState.isSpoofingActive() && d2 != null && d != null) {
                    if (appState.getRoutePlanStage() != RoutePlanStage.RUNNING && lr2Var != null) {
                        lr2Var.d(d2.doubleValue(), d.doubleValue(), null);
                    }
                    if (((kr2) ey1Var.getValue()) == null) {
                        if (lr2Var != null) {
                            double dDoubleValue = d2.doubleValue();
                            double dDoubleValue2 = d.doubleValue();
                            String string = ((Context) obj2).getString(2131624360);
                            string.getClass();
                            kr2VarB = lr2Var.b(dDoubleValue, dDoubleValue2, string, tq1.g);
                        }
                        ey1Var.setValue(kr2VarB);
                    } else {
                        kr2 kr2Var = (kr2) ey1Var.getValue();
                        if (kr2Var != null) {
                            double dDoubleValue3 = d2.doubleValue();
                            double dDoubleValue4 = d.doubleValue();
                            if (!kr2Var.a.i && (marker = kr2Var.b) != null) {
                                marker.c(lr2.j(dDoubleValue3, dDoubleValue4));
                            }
                        }
                    }
                }
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(l6 l6Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, q60 q60Var) {
        super(2, q60Var);
        this.i = l6Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
        this.j = ey1Var4;
        this.k = ey1Var5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(String str, AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var, CoroutineScope coroutineScope, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.i = str;
        this.j = accountBenefitsRepository;
        this.f = ey1Var;
        this.k = coroutineScope;
        this.g = ey1Var2;
        this.h = ey1Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(List list, GithubRelease githubRelease, ul1 ul1Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.i = list;
        this.j = githubRelease;
        this.k = ul1Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
    }
}
