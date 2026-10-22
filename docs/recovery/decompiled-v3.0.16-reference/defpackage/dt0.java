package defpackage;

import android.content.SharedPreferences;
import com.vincenthzr.locationspoofer.xposed.utils.FrameworkConfigReceiver;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dt0 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dt0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                FrameworkConfigReceiver.listener$lambda$4((FrameworkConfigReceiver) obj, sharedPreferences, str);
                break;
            default:
                ProducerScope producerScope = (ProducerScope) obj;
                if (zy.g0(tt2.c, str) || zy.g0(yo.H0(new String[]{"saved_locations", "saved_routes", "sync_enabled", "sync_categories"}), str)) {
                    producerScope.mo32trySendJP2dKIU(mf3.a);
                }
                break;
        }
    }
}
