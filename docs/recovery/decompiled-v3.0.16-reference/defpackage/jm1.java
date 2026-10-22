package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.EnvironmentAvailabilityKt;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jm1 extends k33 implements pu0 {
    public final /* synthetic */ ul1 e;
    public final /* synthetic */ double f;
    public final /* synthetic */ double g;
    public final /* synthetic */ ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(ul1 ul1Var, double d, double d2, ArrayList arrayList, q60 q60Var) {
        super(2, q60Var);
        this.e = ul1Var;
        this.f = d;
        this.g = d2;
        this.h = arrayList;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new jm1(this.e, this.f, this.g, this.h, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        jm1 jm1Var = (jm1) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        jm1Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object value;
        Object value2;
        ee0.J(obj);
        ul1 ul1Var = this.e;
        if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var.x.getValue(), this.f, this.g)) {
            ArrayList arrayList = this.h;
            boolean zIsEmpty = arrayList.isEmpty();
            ul1 ul1Var2 = this.e;
            if (zIsEmpty) {
                MutableStateFlow mutableStateFlow = ul1Var2.x;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, "{}", "[]", "[]")));
            } else {
                md3 md3VarD = ig0.D(ul1Var2, arrayList, this.f, this.g);
                String str = (String) md3VarD.e;
                String str2 = (String) md3VarD.f;
                String str3 = (String) md3VarD.g;
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value, str, str2, str3)));
            }
        }
        return mf3.a;
    }
}
