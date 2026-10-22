package defpackage;

import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lc0 implements dd0 {
    public final /* synthetic */ xe1 a;
    public final /* synthetic */ ic0 b;
    public final /* synthetic */ se2 c;
    public final /* synthetic */ SensorManager d;
    public final /* synthetic */ kc0 e;
    public final /* synthetic */ se2 f;

    public lc0(xe1 xe1Var, ic0 ic0Var, se2 se2Var, SensorManager sensorManager, kc0 kc0Var, se2 se2Var2) {
        this.a = xe1Var;
        this.b = ic0Var;
        this.c = se2Var;
        this.d = sensorManager;
        this.e = kc0Var;
        this.f = se2Var2;
    }

    @Override // defpackage.dd0
    public final void dispose() {
        this.a.b(this.b);
        se2 se2Var = this.c;
        if (se2Var.e) {
            this.d.unregisterListener(this.e);
            se2Var.e = false;
            this.f.e = false;
        }
    }
}
