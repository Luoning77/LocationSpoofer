package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sv2 extends xc2 {
    public static final HashSet y;
    public float v;
    public float w;
    public float x;

    static {
        HashSet hashSet = new HashSet();
        y = hashSet;
        hashSet.add(14);
    }

    @Override // defpackage.jw1, defpackage.pq
    public final boolean b(int i) {
        return Math.abs(this.x) >= this.w && super.b(14);
    }

    @Override // defpackage.jw1
    public final boolean c() {
        MotionEvent motionEvent = this.e;
        ArrayList arrayList = this.l;
        float x = motionEvent.getX(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.e;
        float x2 = (motionEvent2.getX(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x) / 2.0f;
        MotionEvent motionEvent3 = this.d;
        float x3 = motionEvent3.getX(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.d;
        float x4 = ((motionEvent4.getX(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x3) / 2.0f) - x2;
        this.x += x4;
        if (this.q && x4 != 0.0f) {
            throw p91.k(this.h);
        }
        if (b(14)) {
            throw p91.k(this.h);
        }
        return false;
    }

    @Override // defpackage.jw1
    public final boolean e() {
        if (!super.e()) {
            ArrayList arrayList = this.l;
            iw1 iw1Var = (iw1) this.m.get(new o92((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            if (Math.abs(Math.toDegrees(Math.abs(Math.atan2(iw1Var.d, iw1Var.c))) - 90.0d) <= this.v) {
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
        throw p91.k(this.h);
    }

    @Override // defpackage.xc2
    public final HashSet j() {
        return y;
    }
}
