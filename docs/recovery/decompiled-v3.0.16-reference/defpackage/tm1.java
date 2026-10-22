package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tm1 implements SensorEventListener {
    public final /* synthetic */ ArrayList a;

    public tm1(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            long j = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            arrayList.add(new y0(j, fArr[0], fArr[1], fArr[2]));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
