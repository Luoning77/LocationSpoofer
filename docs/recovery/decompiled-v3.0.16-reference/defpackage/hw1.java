package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hw1 extends xc2 {
    public static final HashSet z;
    public PointF v;
    public boolean w;
    public float x;
    public final HashMap y;

    static {
        HashSet hashSet = new HashSet();
        z = hashSet;
        hashSet.add(13);
    }

    public hw1(Context context, pd pdVar) {
        super(context, pdVar);
        this.y = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // defpackage.xc2, defpackage.jw1, defpackage.pq
    public final boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HashMap map = this.y;
        if (actionMasked == 0) {
            this.w = true;
            map.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new gw1(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            map.clear();
        } else if (actionMasked == 5) {
            this.w = true;
            map.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new gw1(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 6) {
            this.w = true;
            map.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
        return super.a(motionEvent);
    }

    @Override // defpackage.jw1, defpackage.pq
    public final boolean b(int i) {
        if (!super.b(13)) {
            return false;
        }
        Iterator it = this.y.values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        gw1 gw1Var = (gw1) it.next();
        return Math.abs(gw1Var.d) >= this.x || Math.abs(gw1Var.e) >= this.x;
    }

    @Override // defpackage.jw1
    public final boolean c() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            gw1 gw1Var = (gw1) this.y.get(num);
            MotionEvent motionEvent = this.d;
            float x = motionEvent.getX(motionEvent.findPointerIndex(iIntValue));
            MotionEvent motionEvent2 = this.d;
            float y = motionEvent2.getY(motionEvent2.findPointerIndex(iIntValue));
            float f = gw1Var.c;
            gw1Var.c = x;
            gw1Var.d = gw1Var.a - x;
            gw1Var.e = gw1Var.b - y;
        }
        if (this.q) {
            PointF pointF = this.n;
            PointF pointF2 = this.v;
            float f2 = pointF2.x - pointF.x;
            float f3 = pointF2.y - pointF.y;
            this.v = pointF;
            if (!this.w) {
                ((ap1) this.h).a(f2, f3);
                return true;
            }
            this.w = false;
            ((ap1) this.h).a(0.0f, 0.0f);
            return true;
        }
        if (b(13)) {
            dp1 dp1Var = ((ap1) this.h).a;
            if (dp1Var.c.n) {
                if (dp1Var.d()) {
                    dp1Var.a.a();
                }
                Iterator it = dp1Var.i.iterator();
                if (it.hasNext()) {
                    throw az2.g(it);
                }
                h();
                this.v = this.n;
                this.w = false;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jw1
    public final int d() {
        return 1;
    }

    @Override // defpackage.xc2
    public final void i() {
        super.i();
        dp1 dp1Var = ((ap1) this.h).a;
        dp1Var.c();
        Iterator it = dp1Var.i.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }

    @Override // defpackage.xc2
    public final HashSet j() {
        return z;
    }

    @Override // defpackage.jw1
    public final void g() {
    }
}
