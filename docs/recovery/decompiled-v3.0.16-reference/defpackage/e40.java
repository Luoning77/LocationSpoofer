package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.utils.ConfigManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class e40 implements ru0 {
    public final /* synthetic */ int e;

    public /* synthetic */ e40(int i) {
        this.e = i;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                return Double.valueOf(ConfigManager.geocodeState$lambda$0(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) obj3).doubleValue(), ((Double) obj4).doubleValue()));
            default:
                return new d92((y70) obj, (Context) obj2, (vp2) obj3, (sh1) obj4);
        }
    }
}
