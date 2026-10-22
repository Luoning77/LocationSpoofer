package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.maplibre.android.maps.e;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qv2 extends xc2 {
    public static final HashSet y;
    public float v;
    public float w;
    public float x;

    static {
        HashSet hashSet = new HashSet();
        y = hashSet;
        hashSet.add(3);
    }

    @Override // defpackage.jw1, defpackage.pq
    public final boolean b(int i) {
        return Math.abs(this.x) >= this.w && super.b(3);
    }

    @Override // defpackage.jw1
    public final boolean c() {
        MotionEvent motionEvent = this.e;
        ArrayList arrayList = this.l;
        float y2 = motionEvent.getY(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.e;
        float y3 = (motionEvent2.getY(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y2) / 2.0f;
        MotionEvent motionEvent3 = this.d;
        float y4 = motionEvent3.getY(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.d;
        float y5 = ((motionEvent4.getY(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y4) / 2.0f) - y3;
        this.x += y5;
        if (this.q && y5 != 0.0f) {
            ((e) this.h).a(y5);
            return true;
        }
        if (b(3)) {
            dp1 dp1Var = ((e) this.h).a;
            if (dp1Var.c.l) {
                if (dp1Var.d()) {
                    dp1Var.a.a();
                }
                hw1 hw1Var = dp1Var.o.h;
                hw1Var.g = false;
                if (hw1Var.q) {
                    hw1Var.r = true;
                }
                Iterator it = dp1Var.l.iterator();
                if (it.hasNext()) {
                    throw az2.g(it);
                }
                h();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jw1
    public final boolean e() {
        if (!super.e()) {
            ArrayList arrayList = this.l;
            iw1 iw1Var = (iw1) this.m.get(new o92((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            double degrees = Math.toDegrees(Math.abs(Math.atan2(iw1Var.d, iw1Var.c)));
            double d = this.v;
            if (degrees <= d || 180.0d - degrees <= d) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jw1
    public final void g() {
        this.x = 0.0f;
    }

    @Override // defpackage.xc2
    public final void i() {
        super.i();
        dp1 dp1Var = ((e) this.h).a;
        dp1Var.c();
        dp1Var.o.h.g = true;
        Iterator it = dp1Var.l.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }

    @Override // defpackage.xc2
    public final HashSet j() {
        return y;
    }
}
