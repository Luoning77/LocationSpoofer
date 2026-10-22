package defpackage;

import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zl1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ au0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl1(ul1 ul1Var, au0 au0Var, long j, String str, String str2, boolean z, q60 q60Var) {
        super(2, q60Var);
        this.f = ul1Var;
        this.g = au0Var;
        this.h = j;
        this.i = str;
        this.j = str2;
        this.k = z;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new zl1(this.f, this.g, this.h, this.i, this.j, this.k, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((zl1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        AppState appState;
        int i = this.e;
        ul1 ul1Var = this.f;
        try {
            if (i == 0) {
                ee0.J(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                yl1 yl1Var = new yl1(this.f, this.h, this.i, this.j, null, 0);
                this.e = 1;
                Object objWithContext = BuildersKt.withContext(io2, yl1Var, this);
                z70 z70Var = z70.e;
                if (objWithContext == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            MutableStateFlow mutableStateFlow = ul1Var.x;
            boolean z = this.k;
            do {
                value2 = mutableStateFlow.getValue();
                appState = (AppState) value2;
            } while (!mutableStateFlow.compareAndSet(value2, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, z ? null : appState.getPendingCollectionRoute(), null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, 2013265919, 134217727, null)));
            this.g.invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            MutableStateFlow mutableStateFlow2 = ul1Var.x;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -134217729, 134217727, null)));
            Toast.makeText(ul1Var.j, 2131624287, 1).show();
        }
        return mf3.a;
    }
}
