package defpackage;

import android.location.Location;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class g80 implements lu0 {
    public final /* synthetic */ long e;
    public final /* synthetic */ ve2 f;
    public final /* synthetic */ d31 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ ProducerScope i;

    public /* synthetic */ g80(long j, ve2 ve2Var, d31 d31Var, String str, ProducerScope producerScope) {
        this.e = j;
        this.f = ve2Var;
        this.g = d31Var;
        this.h = str;
        this.i = producerScope;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        ve2 ve2Var = this.f;
        d31 d31Var = this.g;
        String str = this.h;
        ProducerScope producerScope = this.i;
        try {
            if (this.e == ve2Var.e && d31Var.r().contains(str) && d31.w((Location) obj)) {
                producerScope.mo32trySendJP2dKIU(obj);
            }
        } catch (Exception e) {
            producerScope.close(e);
        }
        return mf3.a;
    }
}
