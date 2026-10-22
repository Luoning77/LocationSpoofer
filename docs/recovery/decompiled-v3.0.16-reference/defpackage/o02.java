package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o02 implements sd3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ rd3 f;

    public /* synthetic */ o02(rd3 rd3Var, int i) {
        this.e = i;
        this.f = rd3Var;
    }

    @Override // defpackage.sd3
    public final rd3 create(zw0 zw0Var, zd3 zd3Var) {
        int i = this.e;
        rd3 rd3Var = this.f;
        switch (i) {
            case 0:
                if (zd3Var.a == Number.class) {
                    return (p02) rd3Var;
                }
                return null;
            default:
                Class cls = zd3Var.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (p02) rd3Var;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((p02) this.f) + "]";
            default:
                return super.toString();
        }
    }
}
