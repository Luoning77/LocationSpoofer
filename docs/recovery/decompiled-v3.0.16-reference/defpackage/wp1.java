package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wp1 extends k33 implements pu0 {
    public ey1 e;
    public int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ CloudRepository h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(boolean z, CloudRepository cloudRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.g = z;
        this.h = cloudRepository;
        this.i = ey1Var;
        this.j = ey1Var2;
        this.k = ey1Var3;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new wp1(this.g, this.h, this.i, this.j, this.k, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((wp1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ey1 ey1Var;
        int i = this.f;
        ey1 ey1Var2 = this.j;
        ey1 ey1Var3 = this.k;
        try {
            try {
                if (i == 0) {
                    ee0.J(obj);
                    ey1 ey1Var4 = this.i;
                    ey1Var4.setValue(null);
                    ey1Var2.setValue(Boolean.FALSE);
                    if (this.g) {
                        ey1Var3.setValue(Boolean.TRUE);
                        CloudRepository cloudRepository = this.h;
                        this.e = ey1Var4;
                        this.f = 1;
                        Object objSatelliteManifest = cloudRepository.satelliteManifest(this);
                        z70 z70Var = z70.e;
                        if (objSatelliteManifest == z70Var) {
                            return z70Var;
                        }
                        obj = objSatelliteManifest;
                        ey1Var = ey1Var4;
                    }
                    return mf3.a;
                }
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ey1Var = this.e;
                ee0.J(obj);
                ey1Var.setValue((String) obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                ey1Var2.setValue(Boolean.TRUE);
            }
            ey1Var3.setValue(Boolean.FALSE);
            return mf3.a;
        } catch (Throwable th) {
            ey1Var3.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
