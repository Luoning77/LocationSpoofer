package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.io.IOException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bn implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final Object g;

    public bn(lz0 lz0Var, oz0 oz0Var) {
        this.e = 2;
        this.f = lz0Var;
        this.g = oz0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((ey1) obj2).setValue((u60) obj);
                return mf3Var;
            case 1:
                ((ey1) obj2).setValue((AppInfoItem) obj);
                return mf3Var;
            case 2:
                lz0 lz0Var = (lz0) obj2;
                oz0 oz0Var = (oz0) obj;
                try {
                    if (!oz0Var.A(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (oz0Var.A(false, this)) {
                    }
                    lz0Var.A(1, 9, null);
                    bh3.c(oz0Var);
                    return mf3Var;
                } catch (IOException e) {
                    lz0Var.A(2, 2, e);
                } catch (Throwable th) {
                    lz0Var.A(3, 3, null);
                    bh3.c(oz0Var);
                    throw th;
                }
                break;
            case 3:
                ((lu0) obj).invoke((CompleteCollectionRoute) obj2);
                return mf3Var;
            case 4:
                ((lu0) obj).invoke((CompleteLocation) obj2);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ul1 ul1Var = (ul1) obj;
                SavedRoute savedRoute = (SavedRoute) obj2;
                ul1Var.getClass();
                savedRoute.getClass();
                BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new k(ul1Var, savedRoute, q60Var, 28), 2, null);
                return mf3Var;
            default:
                ((ey1) obj2).setValue((o43) obj);
                return mf3Var;
        }
    }

    public /* synthetic */ bn(int i, Object obj, Object obj2) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }
}
