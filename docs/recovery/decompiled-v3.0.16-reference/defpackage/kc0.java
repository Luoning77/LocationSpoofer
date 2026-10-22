package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kc0 implements SensorEventListener {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ se2 c;
    public final /* synthetic */ te2 d;
    public final /* synthetic */ te2 e;
    public final /* synthetic */ te2 f;
    public final /* synthetic */ te2 g;
    public final /* synthetic */ ey1 h;

    public kc0(float[] fArr, float[] fArr2, se2 se2Var, te2 te2Var, te2 te2Var2, te2 te2Var3, te2 te2Var4, ey1 ey1Var) {
        this.a = fArr;
        this.b = fArr2;
        this.c = se2Var;
        this.d = te2Var;
        this.e = te2Var2;
        this.f = te2Var3;
        this.g = te2Var4;
        this.h = ey1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] fArr3 = this.b;
        SensorManager.getOrientation(fArr2, fArr3);
        float f = -fArr2[6];
        float f2 = -fArr2[7];
        se2 se2Var = this.c;
        boolean z = se2Var.e;
        te2 te2Var = this.g;
        te2 te2Var2 = this.f;
        te2 te2Var3 = this.e;
        te2 te2Var4 = this.d;
        if (z) {
            float f3 = te2Var4.e;
            te2Var4.e = ((fArr3[1] - f3) * 0.15f) + f3;
            float f4 = te2Var3.e;
            te2Var3.e = ((fArr3[2] - f4) * 0.15f) + f4;
            float f5 = te2Var2.e;
            te2Var2.e = ((f - f5) * 0.15f) + f5;
            float f6 = te2Var.e;
            f2 = ((f2 - f6) * 0.15f) + f6;
            te2Var.e = f2;
        } else {
            te2Var4.e = fArr3[1];
            te2Var3.e = fArr3[2];
            te2Var2.e = f;
            te2Var.e = f2;
            se2Var.e = true;
        }
        this.h.setValue(new hc0(te2Var4.e, te2Var3.e, te2Var2.e, f2));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
