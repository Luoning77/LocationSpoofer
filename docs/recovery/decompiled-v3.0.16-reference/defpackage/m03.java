package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.maplibre.android.maps.n;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m03 extends xc2 {
    public static final HashSet H;
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public boolean F;
    public float G;
    public final GestureDetector v;
    public boolean w;
    public PointF x;
    public float y;
    public float z;

    static {
        HashSet hashSet = new HashSet();
        H = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public m03(Context context, pd pdVar) {
        super(context, pdVar);
        this.v = new GestureDetector(context, new l03(this));
    }

    @Override // defpackage.xc2, defpackage.jw1, defpackage.pq
    public final boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.w) {
            if (actionMasked == 5 || actionMasked == 3) {
                boolean z = this.q;
                if (!z) {
                    this.w = false;
                } else if (z) {
                    this.r = true;
                }
            } else if (!this.q && actionMasked == 1) {
                this.w = false;
            }
        }
        return this.v.onTouchEvent(motionEvent) | super.a(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0234  */
    /* JADX WARN: Code duplicated, block: B:117:0x0243  */
    /* JADX WARN: Code duplicated, block: B:118:0x0250  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    @Override // defpackage.jw1
    public final boolean c() {
        float f;
        float f2;
        Iterator it;
        boolean z = this.q;
        ArrayList arrayList = this.l;
        boolean z2 = false;
        if (z && this.w && arrayList.size() > 1) {
            i();
            return false;
        }
        PointF pointF = this.w ? this.x : this.n;
        this.A = 0.0f;
        this.B = 0.0f;
        int i = 0;
        while (true) {
            int size = arrayList.size();
            f = this.A;
            if (i >= size) {
                break;
            }
            this.A = Math.abs(this.d.getX(i) - pointF.x) + f;
            this.B = Math.abs(this.d.getY(i) - pointF.y) + this.B;
            i++;
        }
        float f3 = f * 2.0f;
        this.A = f3;
        float fHypot = this.B * 2.0f;
        this.B = fHypot;
        if (this.w) {
            this.z = fHypot;
        } else {
            fHypot = (float) Math.hypot(f3, fHypot);
            this.z = fHypot;
        }
        float f4 = this.y;
        if (f4 == 0.0f) {
            this.y = fHypot;
            f4 = fHypot;
        }
        this.D = Math.abs(f4 - fHypot);
        if (this.w) {
            boolean z3 = (this.d.getY() < this.x.y && this.z < this.C) || (this.d.getY() > this.x.y && this.z > this.C);
            float fAbs = Math.abs(1.0f - (this.z / this.C)) * 0.5f;
            if (this.C <= 0.0f) {
                f2 = 1.0f;
            } else {
                f2 = z3 ? fAbs + 1.0f : 1.0f - fAbs;
            }
        } else {
            float f5 = this.C;
            if (f5 > 0.0f) {
                f2 = this.z / f5;
            } else {
                f2 = 1.0f;
            }
        }
        this.G = f2;
        this.F = f2 < 1.0f;
        if (!this.q || this.z <= 0.0f) {
            if (b(this.w ? 15 : 1) && this.D >= this.E) {
                bp1 bp1Var = (bp1) this.h;
                dp1 dp1Var = bp1Var.i;
                n nVar = dp1Var.a;
                jf3 jf3Var = dp1Var.c;
                boolean z4 = arrayList.size() == 1;
                bp1Var.e = z4;
                if (jf3Var.m) {
                    if (!z4) {
                        float f6 = this.C;
                        if (f6 > 0.0f) {
                            float f7 = this.z;
                            double eventTime = this.d.getEventTime();
                            double eventTime2 = this.e.getEventTime();
                            if (eventTime != eventTime2) {
                                double dAbs = ((double) Math.abs(f7 - f6)) / (eventTime - eventTime2);
                                if (dAbs >= bp1Var.a) {
                                    zi2 zi2Var = dp1Var.o.e;
                                    if (zi2Var.q) {
                                        bp1Var.g = Resources.getSystem().getDisplayMetrics().heightPixels;
                                        bp1Var.h = nVar.c();
                                        if (dp1Var.d()) {
                                            nVar.a();
                                        }
                                        it = dp1Var.k.iterator();
                                        if (it.hasNext()) {
                                            throw az2.g(it);
                                        }
                                        bp1Var.f = Math.abs(this.z - this.C);
                                        z2 = true;
                                    } else if (Math.abs(zi2Var.x) <= 0.4d || dAbs >= bp1Var.b) {
                                        if (jf3Var.u) {
                                            zi2 zi2Var2 = dp1Var.o.e;
                                            zi2Var2.g = false;
                                            if (zi2Var2.q) {
                                                zi2Var2.r = true;
                                            }
                                        }
                                        bp1Var.g = Resources.getSystem().getDisplayMetrics().heightPixels;
                                        bp1Var.h = nVar.c();
                                        if (dp1Var.d()) {
                                            nVar.a();
                                        }
                                        it = dp1Var.k.iterator();
                                        if (it.hasNext()) {
                                            throw az2.g(it);
                                        }
                                        bp1Var.f = Math.abs(this.z - this.C);
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    } else if (jf3Var.q) {
                        hw1 hw1Var = dp1Var.o.h;
                        hw1Var.g = false;
                        if (hw1Var.q) {
                            hw1Var.r = true;
                        }
                        bp1Var.g = Resources.getSystem().getDisplayMetrics().heightPixels;
                        bp1Var.h = nVar.c();
                        if (dp1Var.d()) {
                            nVar.a();
                        }
                        it = dp1Var.k.iterator();
                        if (it.hasNext()) {
                            throw az2.g(it);
                        }
                        bp1Var.f = Math.abs(this.z - this.C);
                        z2 = true;
                    }
                }
                if (z2) {
                    h();
                }
            }
        } else {
            bp1 bp1Var2 = (bp1) this.h;
            dp1 dp1Var2 = bp1Var2.i;
            kv kvVar = dp1Var2.e;
            n nVar2 = dp1Var2.a;
            jf3 jf3Var2 = dp1Var2.c;
            kvVar.c(1);
            PointF pointFA = bp1Var2.a(this);
            if (bp1Var2.e) {
                double dAbs2 = Math.abs(this.d.getY() - dp1Var2.n.y);
                z2 = this.d.getY() < dp1Var2.n.y;
                double d = (((dAbs2 - 0.0d) / (bp1Var2.g - 0.0d)) * 4.0d) + 0.0d;
                double d2 = bp1Var2.h;
                nVar2.g((z2 ? d2 - d : d2 + d) * ((double) jf3Var2.w), pointFA);
            } else {
                nVar2.h((Math.log(this.G) / Math.log(1.5707963267948966d)) * 0.6499999761581421d * ((double) jf3Var2.w), pointFA);
            }
            Iterator it2 = dp1Var2.k.iterator();
            if (it2.hasNext()) {
                throw az2.g(it2);
            }
            bp1Var2.f = Math.abs(this.z - this.C);
            z2 = true;
        }
        this.C = this.z;
        return z2;
    }

    @Override // defpackage.jw1
    public final int d() {
        return (!this.q || this.w) ? 1 : 2;
    }

    @Override // defpackage.jw1
    public final boolean e() {
        if (super.e()) {
            return true;
        }
        return !this.w && this.l.size() < 2;
    }

    @Override // defpackage.jw1
    public final void g() {
        this.y = 0.0f;
        this.D = 0.0f;
        this.z = 0.0f;
        this.C = 0.0f;
        this.G = 1.0f;
    }

    @Override // defpackage.xc2
    public final void i() {
        super.i();
        bp1 bp1Var = (bp1) this.h;
        float f = this.t;
        float f2 = this.u;
        boolean z = bp1Var.e;
        dp1 dp1Var = bp1Var.i;
        pd pdVar = dp1Var.o;
        if (z) {
            pdVar.h.g = true;
        } else {
            pdVar.e.g = true;
        }
        Iterator it = dp1Var.k.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
        float fAbs = Math.abs(f2) + Math.abs(f);
        if (!dp1Var.c.r || fAbs < bp1Var.c || bp1Var.f / fAbs < bp1Var.d) {
            dp1Var.c();
        } else {
            boolean z2 = this.F;
            double dMax = Math.max(0.0d, Math.min(2.5d, ((double) fAbs) * 2.5d * 1.0E-4d));
            if (z2) {
                dMax = -dMax;
            }
            double d = dMax;
            dp1Var.p = dp1Var.b(dp1Var.a.c(), d, bp1Var.a(this), (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d)) + 2.0d) * 150.0d));
            dp1Var.e(dp1Var.p);
        }
        this.w = false;
    }

    @Override // defpackage.xc2
    public final HashSet j() {
        return H;
    }
}
