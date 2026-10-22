package defpackage;

import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class im1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im1(ul1 ul1Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = ul1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                return new im1(ul1Var, q60Var, 0);
            case 1:
                return new im1(ul1Var, q60Var, 1);
            case 2:
                return new im1(ul1Var, q60Var, 2);
            case 3:
                return new im1(ul1Var, q60Var, 3);
            case 4:
                return new im1(ul1Var, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new im1(ul1Var, q60Var, 5);
            default:
                return new im1(ul1Var, q60Var, 6);
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
                ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            case 1:
                ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            case 2:
                return ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 3:
                ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            case 4:
                ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            default:
                ((im1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.e;
        int i2 = 1;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 33554431, null)));
                return mf3Var;
            case 1:
                ee0.J(obj);
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 33554431, null)));
                return mf3Var;
            case 2:
                ee0.J(obj);
                rm1.a(ul1Var);
                return BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new sl1(ul1Var, q60Var, i2), 2, null);
            case 3:
                ee0.J(obj);
                rm1.a(ul1Var);
                return mf3Var;
            case 4:
                ee0.J(obj);
                List<AppInfoItem> allInstalledApps = ul1Var.d.getAllInstalledApps(ul1Var.j);
                MutableStateFlow mutableStateFlow3 = ul1Var.x;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, allInstalledApps, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134216191, null)));
                return mf3Var;
            case Logger.WARN /* 5 */:
                ee0.J(obj);
                Toast.makeText(ul1Var.j, 2131624312, 1).show();
                return mf3Var;
            default:
                ee0.J(obj);
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow4 = ul1Var.x;
                do {
                    value4 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, true, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134216703, null)));
                BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new im1(ul1Var, q60Var, 4), 2, null);
                return mf3Var;
        }
    }
}
