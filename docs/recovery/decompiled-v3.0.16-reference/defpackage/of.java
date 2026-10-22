package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class of extends cv1 implements u30, hg0, na1 {
    public boolean A;
    public qh2 C;
    public rh2 D;
    public final ix1 s;
    public final boolean t;
    public final float u;
    public final pb0 v;
    public final ob0 w;
    public ax x;
    public float y;
    public long z = 0;
    public final sx1 B = new sx1();

    public of(ix1 ix1Var, boolean z, float f, pb0 pb0Var, ob0 ob0Var) {
        this.s = ix1Var;
        this.t = z;
        this.u = f;
        this.v = pb0Var;
        this.w = ob0Var;
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.cv1
    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new wr1(this, null, 7), 3, null);
    }

    @Override // defpackage.cv1
    public final void f1() {
        qh2 qh2Var = this.C;
        if (qh2Var != null) {
            this.D = null;
            ig0.z(this);
            z92 z92Var = qh2Var.h;
            rh2 rh2Var = (rh2) ((LinkedHashMap) z92Var.f).get(this);
            if (rh2Var != null) {
                rh2Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) z92Var.f;
                rh2 rh2Var2 = (rh2) linkedHashMap.get(this);
                if (rh2Var2 != null) {
                }
                linkedHashMap.remove(this);
                qh2Var.g.add(rh2Var);
            }
        }
    }

    @Override // defpackage.na1, defpackage.hr1
    public final void h(long j) {
        float fR;
        this.A = true;
        xb0 xb0Var = xp1.O(this).D;
        this.z = mc0.J(j);
        float f = this.u;
        if (Float.isNaN(f)) {
            long j2 = this.z;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fR = c12.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.t) {
                fR += xb0Var.R(10.0f);
            }
        } else {
            fR = xb0Var.R(f);
        }
        this.y = fR;
        sx1 sx1Var = this.B;
        Object[] objArr = sx1Var.a;
        int i = sx1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            m1((xb2) objArr[i2]);
        }
        sx1Var.d();
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        xv xvVar = jb1Var.e;
        jb1Var.c();
        ax axVar = this.x;
        if (axVar != null) {
            float f = this.y;
            long jA = this.v.a();
            float fFloatValue = ((Number) ((oh) axVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jC = hz.c(fFloatValue, jA);
                if (axVar.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (xvVar.a() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L));
                    gn gnVar = xvVar.f;
                    long jR = gnVar.r();
                    gnVar.i().l();
                    try {
                        ((t1) gnVar.a).s(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        jg0.Y(jb1Var, jC, f, 0L, null, 124);
                        p91.v(gnVar, jR);
                    } catch (Throwable th) {
                        p91.v(gnVar, jR);
                        throw th;
                    }
                } else {
                    jg0.Y(jb1Var, jC, f, 0L, null, 124);
                }
            }
        }
        vv vvVarI = xvVar.f.i();
        rh2 rh2Var = this.D;
        if (rh2Var != null) {
            long j = this.z;
            int iP = xq1.P(this.y);
            long jA2 = this.v.a();
            this.w.invoke();
            rh2Var.e(iP, j, jA2);
            rh2Var.draw(ha.a(vvVarI));
        }
    }

    public final void m1(xb2 xb2Var) {
        rh2 rh2Var;
        if (!(xb2Var instanceof vb2)) {
            if (xb2Var instanceof wb2) {
                rh2 rh2Var2 = this.D;
                if (rh2Var2 != null) {
                    rh2Var2.d();
                    return;
                }
                return;
            }
            if (!(xb2Var instanceof ub2) || (rh2Var = this.D) == null) {
                return;
            }
            rh2Var.d();
            return;
        }
        vb2 vb2Var = (vb2) xb2Var;
        long j = this.z;
        float f = this.y;
        qh2 qh2Var = this.C;
        if (qh2Var == null) {
            Object obj = (View) xq1.C(this, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    b81.r(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    qh2 qh2Var2 = new qh2(viewGroup.getContext());
                    viewGroup.addView(qh2Var2);
                    qh2Var = qh2Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof qh2) {
                        qh2Var = (qh2) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.C = qh2Var;
        }
        ArrayList arrayList = qh2Var.f;
        z92 z92Var = qh2Var.h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) z92Var.f;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) z92Var.f;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) z92Var.g;
        rh2 rh2Var3 = (rh2) linkedHashMap.get(this);
        int i2 = 1;
        if (rh2Var3 == null) {
            ArrayList arrayList2 = qh2Var.g;
            arrayList2.getClass();
            rh2Var3 = (rh2) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (rh2Var3 == null) {
                if (qh2Var.i > am1.x(arrayList)) {
                    rh2Var3 = new rh2(qh2Var.getContext());
                    qh2Var.addView(rh2Var3);
                    arrayList.add(rh2Var3);
                } else {
                    rh2Var3 = (rh2) arrayList.get(qh2Var.i);
                    of ofVar = (of) linkedHashMap3.get(rh2Var3);
                    if (ofVar != null) {
                        ofVar.D = null;
                        ig0.z(ofVar);
                        rh2 rh2Var4 = (rh2) linkedHashMap2.get(ofVar);
                        if (rh2Var4 != null) {
                        }
                        linkedHashMap2.remove(ofVar);
                        rh2Var3.c();
                    }
                }
                int i3 = qh2Var.i;
                if (i3 < qh2Var.e - 1) {
                    qh2Var.i = i3 + 1;
                } else {
                    qh2Var.i = 0;
                }
            }
            linkedHashMap2.put(this, rh2Var3);
            linkedHashMap3.put(rh2Var3, this);
        }
        rh2 rh2Var5 = rh2Var3;
        int iP = xq1.P(f);
        long jA = this.v.a();
        this.w.invoke();
        rh2Var5.b(vb2Var, this.t, j, iP, jA, new hd(this, i2));
        this.D = rh2Var5;
        ig0.z(this);
    }
}
