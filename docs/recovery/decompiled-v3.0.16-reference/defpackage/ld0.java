package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.text.Layout;
import android.view.inputmethod.ExtractedText;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ld0 {
    public static x01 a;
    public static x01 b;
    public static x01 c;
    public static x01 d;
    public static x01 e;
    public static x01 f;
    public static x01 g;
    public static x01 h;
    public static x01 i;

    public static final boolean A(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean B(float f2, float f3, re reVar) {
        float f4 = f2 - 0.005f;
        float f5 = f3 - 0.005f;
        float f6 = f2 + 0.005f;
        float f7 = f3 + 0.005f;
        re reVarA = ue.a();
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            ue.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = reVarA.b;
        if (rectF == null) {
            rectF = new RectF();
            reVarA.b = rectF;
        }
        rectF.set(f4, f5, f6, f7);
        Path path = reVarA.a;
        RectF rectF2 = reVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        re reVarA2 = ue.a();
        reVarA2.f(reVar, reVarA, 1);
        boolean zIsEmpty = reVarA2.a.isEmpty();
        reVarA2.g();
        reVarA.g();
        return !zIsEmpty;
    }

    public static final boolean C(float f2, float f3, float f4, float f5, long j) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f7 * f7) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static float D(float f2, float f3) {
        float fAbs = Math.abs(f2);
        double dMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        double d2 = f3;
        float fAbs2 = Math.abs((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * d2));
        if (fAbs <= 0.0f) {
            return 0.0f;
        }
        if (fAbs >= fAbs2) {
            fAbs = fAbs2;
        }
        double d3 = d2 - (((double) fAbs) * 3.0d);
        return (float) (d2 - (Math.pow(Math.abs(d3), 0.3333333333333333d) * (Math.signum(d3) * Math.pow(d2, 0.6666666666666666d))));
    }

    public static ox0 E(String... strArr) {
        if (strArr.length % 2 != 0) {
            fo.i("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                fo.i("Headers cannot be null");
                return null;
            }
            strArr2[i3] = l13.D0(str).toString();
        }
        int iU = mc0.u(0, strArr2.length - 1, 2);
        if (iU >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                m(str2);
                n(str3, str2);
                if (i2 == iU) {
                    break;
                }
                i2 += 2;
            }
        }
        return new ox0(strArr2);
    }

    public static final t80 F(dq0 dq0Var, int i2) {
        int iOrdinal = dq0Var.r1().ordinal();
        t80 t80Var = t80.e;
        if (iOrdinal != 0) {
            t80 t80Var2 = t80.f;
            if (iOrdinal == 1) {
                dq0 dq0VarU = vd0.u(dq0Var);
                if (dq0VarU == null) {
                    fo.i("ActiveParent with no focused child");
                    return null;
                }
                t80 t80VarF = F(dq0VarU, i2);
                t80 t80Var3 = t80VarF != t80Var ? t80VarF : null;
                if (t80Var3 != null) {
                    return t80Var3;
                }
                if (dq0Var.u) {
                    return t80Var;
                }
                dq0Var.u = true;
                try {
                    tp0 tp0VarO1 = dq0Var.o1();
                    pv pvVar = new pv(i2);
                    rp0 rp0Var = (rp0) ((db) xp1.P(dq0Var)).getFocusOwner();
                    dq0 dq0VarG = rp0Var.g();
                    tp0VarO1.k.invoke(pvVar);
                    dq0 dq0VarG2 = rp0Var.g();
                    if (pvVar.b) {
                        vp0 vp0Var = vp0.b;
                        return t80Var2;
                    }
                    if (dq0VarG == dq0VarG2 || dq0VarG2 == null) {
                        return t80Var;
                    }
                    return vp0.d == vp0.c ? t80Var2 : t80.g;
                } finally {
                    dq0Var.u = false;
                }
            }
            if (iOrdinal == 2) {
                return t80Var2;
            }
            if (iOrdinal != 3) {
                b81.d();
                return null;
            }
        }
        return t80Var;
    }

    public static final t80 G(dq0 dq0Var, int i2) {
        if (!dq0Var.v) {
            dq0Var.v = true;
            try {
                tp0 tp0VarO1 = dq0Var.o1();
                pv pvVar = new pv(i2);
                rp0 rp0Var = (rp0) ((db) xp1.P(dq0Var)).getFocusOwner();
                dq0 dq0VarG = rp0Var.g();
                tp0VarO1.j.invoke(pvVar);
                dq0 dq0VarG2 = rp0Var.g();
                boolean z = pvVar.b;
                t80 t80Var = t80.f;
                if (z) {
                    vp0 vp0Var = vp0.b;
                    return t80Var;
                }
                if (dq0VarG != dq0VarG2 && dq0VarG2 != null) {
                    return vp0.d == vp0.c ? t80Var : t80.g;
                }
            } finally {
                dq0Var.v = false;
            }
        }
        return t80.e;
    }

    public static final t80 H(dq0 dq0Var, int i2) {
        cv1 cv1VarJ;
        tz1 tz1Var;
        int iOrdinal = dq0Var.r1().ordinal();
        t80 t80Var = t80.e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dq0 dq0VarU = vd0.u(dq0Var);
                if (dq0VarU != null) {
                    return F(dq0VarU, i2);
                }
                fo.i("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b81.d();
                    return null;
                }
                if (!dq0Var.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1 cv1Var = dq0Var.e.i;
                hb1 hb1VarO = xp1.O(dq0Var);
                loop0: while (true) {
                    if (hb1VarO == null) {
                        cv1VarJ = null;
                        break;
                    }
                    if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        while (cv1Var != null) {
                            if ((cv1Var.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                cv1VarJ = cv1Var;
                                gy1 gy1Var = null;
                                while (cv1VarJ != null) {
                                    if (cv1VarJ instanceof dq0) {
                                        break loop0;
                                    }
                                    if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                        int i3 = 0;
                                        for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                            if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cv1VarJ = cv1Var2;
                                                } else {
                                                    if (gy1Var == null) {
                                                        gy1Var = new gy1(new cv1[16]);
                                                    }
                                                    if (cv1VarJ != null) {
                                                        gy1Var.b(cv1VarJ);
                                                        cv1VarJ = null;
                                                    }
                                                    gy1Var.b(cv1Var2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    cv1VarJ = xp1.J(gy1Var);
                                }
                            }
                            cv1Var = cv1Var.i;
                        }
                    }
                    hb1VarO = hb1VarO.u();
                    cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
                }
                dq0 dq0Var2 = (dq0) cv1VarJ;
                if (dq0Var2 == null) {
                    return t80Var;
                }
                int iOrdinal2 = dq0Var2.r1().ordinal();
                if (iOrdinal2 == 0) {
                    return G(dq0Var2, i2);
                }
                if (iOrdinal2 == 1) {
                    return H(dq0Var2, i2);
                }
                if (iOrdinal2 == 2) {
                    return t80.f;
                }
                if (iOrdinal2 != 3) {
                    b81.d();
                    return null;
                }
                t80 t80VarH = H(dq0Var2, i2);
                t80 t80Var2 = t80VarH != t80Var ? t80VarH : null;
                return t80Var2 == null ? G(dq0Var2, i2) : t80Var2;
            }
        }
        return t80Var;
    }

    public static final boolean I(dq0 dq0Var) {
        gy1 gy1Var;
        tz1 tz1Var;
        boolean z;
        tz1 tz1Var2;
        rp0 rp0Var = (rp0) ((db) xp1.P(dq0Var)).getFocusOwner();
        dq0 dq0VarG = rp0Var.g();
        zp0 zp0VarR1 = dq0Var.r1();
        if (dq0VarG == dq0Var) {
            dq0Var.n1(zp0VarR1, zp0VarR1);
            return true;
        }
        if ((dq0VarG == null || dq0VarG.s) && !dq0Var.s && !((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).a.C()) {
            return false;
        }
        if (dq0VarG != null) {
            gy1Var = new gy1(new dq0[16]);
            if (!dq0VarG.e.r) {
                p21.c("visitAncestors called on an unattached node");
            }
            cv1 cv1Var = dq0VarG.e.i;
            hb1 hb1VarO = xp1.O(dq0VarG);
            while (hb1VarO != null) {
                if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    while (cv1Var != null) {
                        if ((cv1Var.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            cv1 cv1VarJ = cv1Var;
                            gy1 gy1Var2 = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof dq0) {
                                    gy1Var.b((dq0) cv1VarJ);
                                } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i2 = 0;
                                    for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                        if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cv1VarJ = cv1Var2;
                                            } else {
                                                if (gy1Var2 == null) {
                                                    gy1Var2 = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var2.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var2.b(cv1Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var2);
                            }
                        }
                        cv1Var = cv1Var.i;
                    }
                }
                hb1VarO = hb1VarO.u();
                cv1Var = (hb1VarO == null || (tz1Var2 = hb1VarO.K) == null) ? null : tz1Var2.e;
            }
        } else {
            gy1Var = null;
        }
        Object[] objArr = new dq0[16];
        Object[] objArr2 = new dq0[16];
        if (!dq0Var.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var3 = dq0Var.e.i;
        hb1 hb1VarO2 = xp1.O(dq0Var);
        boolean z2 = true;
        int i3 = 0;
        int i4 = 0;
        while (hb1VarO2 != null) {
            if ((hb1VarO2.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                while (cv1Var3 != null) {
                    if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        cv1 cv1VarJ2 = cv1Var3;
                        gy1 gy1Var3 = null;
                        while (cv1VarJ2 != null) {
                            if (cv1VarJ2 instanceof dq0) {
                                dq0 dq0Var2 = (dq0) cv1VarJ2;
                                if (o51.f(gy1Var != null ? Boolean.valueOf(gy1Var.j(dq0Var2)) : null, Boolean.TRUE)) {
                                    int i5 = i3 + 1;
                                    if (objArr.length < i5) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i3] = dq0Var2;
                                    i3 = i5;
                                } else {
                                    rp0Var = rp0Var;
                                    int i6 = i4 + 1;
                                    if (objArr2.length < i6) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i4] = dq0Var2;
                                    i4 = i6;
                                }
                                if (dq0Var2 == dq0VarG) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                rp0Var = rp0Var;
                                z = true;
                            }
                            if (z && (cv1VarJ2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ2 instanceof lb0)) {
                                int i7 = 0;
                                for (cv1 cv1Var4 = ((lb0) cv1VarJ2).t; cv1Var4 != null; cv1Var4 = cv1Var4.j) {
                                    if ((cv1Var4.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        int i8 = i7 + 1;
                                        if (i8 == 1) {
                                            cv1VarJ2 = cv1Var4;
                                            i8 = i8;
                                        } else {
                                            gy1 gy1Var4 = gy1Var3 == null ? new gy1(new cv1[16]) : gy1Var3;
                                            if (cv1VarJ2 != null) {
                                                gy1Var4.b(cv1VarJ2);
                                                cv1VarJ2 = null;
                                            }
                                            gy1Var4.b(cv1Var4);
                                            gy1Var3 = gy1Var4;
                                        }
                                        i7 = i8;
                                    }
                                }
                                if (i7 != 1) {
                                    cv1VarJ2 = xp1.J(gy1Var3);
                                }
                            } else {
                                cv1VarJ2 = xp1.J(gy1Var3);
                            }
                        }
                    }
                    cv1Var3 = cv1Var3.i;
                    rp0Var = rp0Var;
                }
            }
            rp0 rp0Var2 = rp0Var;
            hb1VarO2 = hb1VarO2.u();
            cv1Var3 = (hb1VarO2 == null || (tz1Var = hb1VarO2.K) == null) ? null : tz1Var.e;
            rp0Var = rp0Var2;
        }
        rp0 rp0Var3 = rp0Var;
        if (z2 && dq0VarG != null && !o(dq0VarG, false)) {
            return false;
        }
        gh0.H(dq0Var, new ye(dq0Var, 9));
        int iOrdinal = dq0Var.r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).j(dq0Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b81.d();
                    return false;
                }
                ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).j(dq0Var);
            }
        }
        zp0 zp0Var = zp0.g;
        zp0 zp0Var2 = zp0.e;
        if (z2 && dq0VarG != null) {
            dq0VarG.n1(zp0Var2, zp0Var);
        }
        zp0 zp0Var3 = zp0.f;
        if (gy1Var != null) {
            int i9 = gy1Var.g - 1;
            Object[] objArr5 = gy1Var.e;
            if (i9 < objArr5.length) {
                while (i9 >= 0) {
                    dq0 dq0Var3 = (dq0) objArr5[i9];
                    if (rp0Var3.g() != dq0Var) {
                        return false;
                    }
                    dq0Var3.n1(zp0Var3, zp0Var);
                    i9--;
                }
            }
        }
        int i10 = i4 - 1;
        if (i10 < objArr2.length) {
            while (i10 >= 0) {
                dq0 dq0Var4 = (dq0) objArr2[i10];
                if (rp0Var3.g() != dq0Var) {
                    return false;
                }
                dq0Var4.n1(dq0Var4 == dq0VarG ? zp0Var2 : zp0Var, zp0Var3);
                i10--;
            }
        }
        if (rp0Var3.g() != dq0Var) {
            return false;
        }
        dq0Var.n1(zp0VarR1, zp0Var2);
        return rp0Var3.g() == dq0Var;
    }

    public static vt1 J(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            fo.r("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j2; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    vt1 vt1Var = new vt1();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    vt1Var.h = byteBufferDuplicate;
                    vt1Var.e = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    vt1Var.f = i7;
                    vt1Var.g = ((ByteBuffer) vt1Var.h).getShort(i7);
                    return vt1Var;
                }
            }
        }
        fo.r("Cannot read metadata.");
        return null;
    }

    public static final uc0 K(uc0 uc0Var, uc0 uc0Var2) {
        int iOrdinal = uc0Var2.ordinal();
        uc0 uc0Var3 = uc0.e;
        if (iOrdinal != 0) {
            uc0 uc0Var4 = uc0.g;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return uc0Var4;
                }
                b81.d();
                return null;
            }
            int iOrdinal2 = uc0Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return uc0.f;
                }
                if (iOrdinal2 == 2) {
                    return uc0Var4;
                }
                b81.d();
                return null;
            }
        }
        return uc0Var3;
    }

    public static final nf L(pf pfVar, String str) {
        pfVar.getClass();
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(pfVar.a, str);
        renderEffectCreateRuntimeShaderEffect.getClass();
        return new nf(renderEffectCreateRuntimeShaderEffect);
    }

    public static final long M(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final ExtractedText N(f83 f83Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = f83Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = f83Var.b;
        extractedText.selectionStart = f93.f(j);
        extractedText.selectionEnd = f93.e(j);
        extractedText.flags = !l13.d0(f83Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final int O(qd1 qd1Var) {
        List list = qd1Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((rd1) list.get(i3)).m;
        }
        return (i2 / list.size()) + qd1Var.q;
    }

    public static final void a(final ki0 ki0Var, boolean z, au0 au0Var, final iu0 iu0Var, f30 f30Var, int i2) {
        int i3;
        boolean z2;
        au0 au0Var2;
        ov0 ov0Var;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String string;
        String string2;
        String upperCase;
        String str;
        au0Var.getClass();
        iu0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(245125951);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var2.f(ki0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= ov0Var2.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            au0Var2 = au0Var;
            i3 |= ov0Var2.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        } else {
            au0Var2 = au0Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var2.h(iu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = ki0Var != null;
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                if (ki0Var == null || (str = ki0Var.b) == null) {
                    upperCase = "LTE";
                } else {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                objQ = ke0.H(upperCase);
                ov0Var2.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                if (ki0Var == null || (string2 = Integer.valueOf(ki0Var.c).toString()) == null) {
                    string2 = "460";
                }
                objQ2 = ke0.H(string2);
                ov0Var2.m0(objQ2);
            }
            final ey1 ey1Var2 = (ey1) objQ2;
            Object objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                if (ki0Var == null || (string = Integer.valueOf(ki0Var.d).toString()) == null) {
                    string = "0";
                }
                objQ3 = ke0.H(string);
                ov0Var2.m0(objQ3);
            }
            final ey1 ey1Var3 = (ey1) objQ3;
            Object objQ4 = ov0Var2.Q();
            if (objQ4 == c30Var) {
                if (ki0Var != null) {
                    int i4 = ki0Var.e;
                    if (i4 == 0) {
                        i4 = ki0Var.h;
                    }
                    strValueOf3 = String.valueOf(i4);
                } else {
                    strValueOf3 = "28854";
                }
                objQ4 = ke0.H(strValueOf3);
                ov0Var2.m0(objQ4);
            }
            final ey1 ey1Var4 = (ey1) objQ4;
            Object objQ5 = ov0Var2.Q();
            if (objQ5 == c30Var) {
                if (ki0Var != null) {
                    int i5 = ki0Var.f;
                    if (i5 == 0) {
                        i5 = ki0Var.i;
                    }
                    strValueOf2 = String.valueOf(i5);
                } else {
                    strValueOf2 = "1234567";
                }
                objQ5 = ke0.H(strValueOf2);
                ov0Var2.m0(objQ5);
            }
            final ey1 ey1Var5 = (ey1) objQ5;
            Object objQ6 = ov0Var2.Q();
            if (objQ6 == c30Var) {
                if (ki0Var != null) {
                    int i6 = ki0Var.g;
                    if (i6 == 0) {
                        i6 = ki0Var.j;
                    }
                    strValueOf = String.valueOf(i6);
                } else {
                    strValueOf = "123";
                }
                objQ6 = ke0.H(strValueOf);
                ov0Var2.m0(objQ6);
            }
            final ey1 ey1Var6 = (ey1) objQ6;
            Object objQ7 = ov0Var2.Q();
            if (objQ7 == c30Var) {
                t52 t52Var = new t52(ki0Var != null ? ki0Var.o : -85);
                ov0Var2.m0(t52Var);
                objQ7 = t52Var;
            }
            final t52 t52Var2 = (t52) objQ7;
            Object objQ8 = ov0Var2.Q();
            if (objQ8 == c30Var) {
                objQ8 = ke0.H(Boolean.valueOf(ki0Var != null ? ki0Var.p : true));
                ov0Var2.m0(objQ8);
            }
            final ey1 ey1Var7 = (ey1) objQ8;
            Object objQ9 = ov0Var2.Q();
            if (objQ9 == c30Var) {
                objQ9 = ke0.H(Boolean.valueOf(ki0Var != null ? ki0Var.q : true));
                ov0Var2.m0(objQ9);
            }
            final ey1 ey1Var8 = (ey1) objQ9;
            final boolean z4 = z2;
            final au0 au0Var3 = au0Var2;
            final boolean z5 = z3;
            ov0Var = ov0Var2;
            sb.F(au0Var, new qc0(3), sb.a0(-1704246584, new pu0() { // from class: zh0
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dv1 dv1VarC = iw2.c(iw2.e(av1.a, 0.92f), 0.85f);
                        bj2 bj2VarA = cj2.a(24.0f);
                        aw awVarT = ym3.t(((kz) ov0Var3.j(mz.a)).p, 0L, ov0Var3, 0, 14);
                        cw cwVarU = ym3.u(62, 8.0f);
                        final boolean z6 = z4;
                        final au0 au0Var4 = au0Var3;
                        final boolean z7 = z5;
                        final ey1 ey1Var9 = ey1Var;
                        final ey1 ey1Var10 = ey1Var2;
                        final ey1 ey1Var11 = ey1Var3;
                        final ey1 ey1Var12 = ey1Var4;
                        final ey1 ey1Var13 = ey1Var5;
                        final ey1 ey1Var14 = ey1Var6;
                        final t52 t52Var3 = t52Var2;
                        final ey1 ey1Var15 = ey1Var7;
                        final ey1 ey1Var16 = ey1Var8;
                        final ki0 ki0Var2 = ki0Var;
                        final iu0 iu0Var2 = iu0Var;
                        sb.C(dv1VarC, bj2VarA, awVarT, cwVarU, sb.a0(-637289962, new qu0() { // from class: bi0
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ld0.f(z6, au0Var4, z7, ey1Var9, ey1Var10, ey1Var11, ey1Var12, ey1Var13, ey1Var14, t52Var3, ey1Var15, ey1Var16, ki0Var2, iu0Var2, (zz) obj3, (f30) obj4, iIntValue2);
                                return mf3.a;
                            }
                        }, ov0Var3), ov0Var3, 196614, 16);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, ((i3 >> 6) & 14) | 432, 0);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(ki0Var, z, au0Var, iu0Var, i2, 2);
        }
    }

    public static final String b(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final String c(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final String d(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final String e(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0e52  */
    /* JADX WARN: Code duplicated, block: B:219:0x0e56  */
    /* JADX WARN: Code duplicated, block: B:222:0x0e7e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0e83  */
    /* JADX WARN: Code duplicated, block: B:226:0x0e88  */
    /* JADX WARN: Code duplicated, block: B:227:0x0e96  */
    /* JADX WARN: Code duplicated, block: B:71:0x0469  */
    /* JADX WARN: Code duplicated, block: B:74:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x04e7  */
    public static final void f(boolean z, au0 au0Var, boolean z2, final ey1 ey1Var, final ey1 ey1Var2, final ey1 ey1Var3, final ey1 ey1Var4, final ey1 ey1Var5, final ey1 ey1Var6, final t52 t52Var, final ey1 ey1Var7, final ey1 ey1Var8, final ki0 ki0Var, final iu0 iu0Var, zz zzVar, f30 f30Var, int i2) {
        x30 x30Var;
        c30 c30Var;
        or orVar;
        long jC;
        long j;
        float f2;
        long j2;
        float f3;
        long j3;
        float f4;
        long j4;
        float f5;
        long j5;
        float f6;
        c30 c30Var2;
        int i3;
        x30 x30Var2;
        jr0 jr0Var;
        long jC2;
        long jC3;
        boolean zF;
        Object objQ;
        boolean z3;
        x30 x30Var3;
        jr0 jr0Var2;
        long jC4;
        or orVar2 = j9.o;
        u92 u92Var = am1.i;
        or orVar3 = j9.p;
        nr nrVar = j9.r;
        ho hoVar = am1.g;
        pr prVar = j9.j;
        zzVar.getClass();
        ov0 ov0Var = (ov0) f30Var;
        if (!ov0Var.T(i2 & 1, (i2 & 17) != 16)) {
            ov0Var.W();
            return;
        }
        dv1 dv1VarD = zm3.D(iw2.d(), 20.0f);
        yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
        int iHashCode = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ = ov0Var.z();
        dv1 dv1VarH = xp1.H(ov0Var, dv1VarD);
        w20.b.getClass();
        x30 x30Var4 = v20.b;
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var4);
        } else {
            ov0Var.p0();
        }
        gh ghVar = v20.e;
        q73.h(ov0Var, ghVar, yzVarA);
        gh ghVar2 = v20.d;
        q73.h(ov0Var, ghVar2, l72VarZ);
        Integer numValueOf = Integer.valueOf(iHashCode);
        gh ghVar3 = v20.f;
        q73.h(ov0Var, ghVar3, numValueOf);
        wa waVar = v20.g;
        q73.g(ov0Var, waVar);
        gh ghVar4 = v20.c;
        q73.h(ov0Var, ghVar4, dv1VarH);
        av1 av1Var = av1.a;
        dv1 dv1VarE = iw2.e(av1Var, 1.0f);
        kk2 kk2VarA = jk2.a(u92Var, orVar3, ov0Var, 54);
        int iHashCode2 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ2 = ov0Var.z();
        dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE);
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var4);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, kk2VarA);
        q73.h(ov0Var, ghVar2, l72VarZ2);
        az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH2);
        kk2 kk2VarA2 = jk2.a(am1.e, orVar3, ov0Var, 48);
        int iHashCode3 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ3 = ov0Var.z();
        dv1 dv1VarH3 = xp1.H(ov0Var, av1Var);
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var4);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, kk2VarA2);
        q73.h(ov0Var, ghVar2, l72VarZ3);
        az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH3);
        dv1 dv1VarN = xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f));
        long j6 = bk.i;
        dv1 dv1VarL = xp1.l(dv1VarN, hz.c(0.12f, j6));
        er1 er1VarC = ws.c(prVar, false);
        int iHashCode4 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ4 = ov0Var.z();
        dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarL);
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var4);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, er1VarC);
        q73.h(ov0Var, ghVar2, l72VarZ4);
        az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH4);
        t01.a(ks.R(), null, iw2.k(av1Var, 20.0f), j6, ov0Var, 3504, 0);
        ov0Var.r();
        gh0.h(ov0Var, iw2.o(av1Var, 10.0f));
        String strN = ke0.N(z2 ? 2131624404 : 2131624786, ov0Var);
        long jB = v63.b(16.5d);
        jr0 jr0Var3 = jr0.j;
        hh0 hh0Var = mz.a;
        s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
        ov0Var.r();
        dv1 dv1VarA = bk.a(xp1.l(xp1.n(iw2.k(av1Var, 28.0f), cj2.a), z ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b)), au0Var);
        er1 er1VarC2 = ws.c(prVar, false);
        int iHashCode5 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ5 = ov0Var.z();
        dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarA);
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var4);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, er1VarC2);
        q73.h(ov0Var, ghVar2, l72VarZ5);
        az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH5);
        t01.a(k22.u(), ke0.N(2131624114, ov0Var), iw2.k(av1Var, 14.0f), hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).q), ov0Var, 384, 0);
        ov0Var.r();
        ov0Var.r();
        gh0.h(ov0Var, iw2.g(av1Var, 12.0f));
        dv1 dv1VarW = zm3.W(new wb1(1.0f, true), zm3.O(ov0Var));
        yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), nrVar, ov0Var, 6);
        int iHashCode6 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ6 = ov0Var.z();
        dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarW);
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var4);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, yzVarA2);
        q73.h(ov0Var, ghVar2, l72VarZ6);
        az2.s(iHashCode6, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH6);
        dv1 dv1VarE2 = zm3.E(ji2.w(xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b)), 0.8f, hz.c(z ? 0.12f : 0.06f, ((kz) ov0Var.j(hh0Var)).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA3 = wz.a(hoVar, nrVar, ov0Var, 0);
        int iHashCode7 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ7 = ov0Var.z();
        dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarE2);
        ov0Var.g0();
        if (ov0Var.D()) {
            x30Var = x30Var4;
            ov0Var.k(x30Var);
        } else {
            x30Var = r1;
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, yzVarA3);
        q73.h(ov0Var, ghVar2, l72VarZ7);
        az2.s(iHashCode7, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH7);
        s83.b(ke0.N(2131624101, ov0Var), null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), v63.b(11.5d), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
        ov0 ov0Var2 = ov0Var;
        gh0.h(ov0Var2, iw2.g(av1Var, 6.0f));
        dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
        kk2 kk2VarA3 = jk2.a(new jo(6.0f, true, new fo(0)), orVar2, ov0Var2, 6);
        int iHashCode8 = Long.hashCode(ks.U(ov0Var2));
        l72 l72VarZ8 = ov0Var2.z();
        dv1 dv1VarH8 = xp1.H(ov0Var2, dv1VarE3);
        ov0Var2.g0();
        if (ov0Var2.D()) {
            ov0Var2.k(x30Var);
        } else {
            ov0Var2.p0();
        }
        q73.h(ov0Var2, ghVar, kk2VarA3);
        q73.h(ov0Var2, ghVar2, l72VarZ8);
        az2.s(iHashCode8, ov0Var2, ghVar3, ov0Var2, waVar);
        q73.h(ov0Var2, ghVar4, dv1VarH8);
        ov0Var2.c0(1247232277);
        Iterator it = am1.G("LTE", "NR", "GSM", "WCDMA").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c30Var = d30.a;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            boolean zT = s13.T((String) ey1Var.getValue(), str);
            dv1 dv1VarN2 = xp1.n(new wb1(1.0f, true), cj2.a(8.0f));
            if (zT) {
                jC3 = bk.i;
            } else {
                if (z) {
                    jC3 = hz.c(0.06f, hz.c);
                } else {
                    jC3 = hz.c(0.04f, hz.b);
                }
                dv1 dv1VarL2 = xp1.l(dv1VarN2, jC3);
                zF = ov0Var2.f(str);
                objQ = ov0Var2.Q();
                if (!zF || objQ == c30Var) {
                    z3 = false;
                    objQ = new ci0(str, ey1Var, 0);
                    ov0Var2.m0(objQ);
                } else {
                    z3 = false;
                }
                dv1 dv1VarF = zm3.F(bk.a(dv1VarL2, (au0) objQ), 0.0f, 6.0f, 1);
                er1 er1VarC3 = ws.c(prVar, z3);
                int iHashCode9 = Long.hashCode(ks.U(ov0Var2));
                l72 l72VarZ9 = ov0Var2.z();
                dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarF);
                w20.b.getClass();
                x30Var3 = v20.b;
                ov0Var2.g0();
                if (ov0Var2.D()) {
                    ov0Var2.k(x30Var3);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, v20.e, er1VarC3);
                q73.h(ov0Var2, v20.d, l72VarZ9);
                q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode9));
                q73.g(ov0Var2, v20.g);
                q73.h(ov0Var2, v20.c, dv1VarH9);
                long jB2 = v63.b(11.5d);
                if (zT) {
                    jr0Var2 = jr0.j;
                } else {
                    jr0Var2 = jr0.g;
                }
                jr0 jr0Var4 = jr0Var2;
                if (zT) {
                    ov0Var2.c0(425113579);
                    ov0Var2.s();
                    jC4 = hz.c;
                } else {
                    ov0Var2.c0(425115097);
                    jC4 = hz.c(0.75f, ((kz) ov0Var2.j(mz.a)).q);
                    ov0Var2.s();
                }
                ov0 ov0Var3 = ov0Var2;
                s83.b(str, null, jC4, jB2, jr0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262058);
                ov0Var2 = ov0Var3;
                ov0Var2.r();
                it = it;
            }
            dv1 dv1VarL3 = xp1.l(dv1VarN2, jC3);
            zF = ov0Var2.f(str);
            objQ = ov0Var2.Q();
            if (zF) {
                z3 = false;
                objQ = new ci0(str, ey1Var, 0);
                ov0Var2.m0(objQ);
            } else {
                z3 = false;
                objQ = new ci0(str, ey1Var, 0);
                ov0Var2.m0(objQ);
            }
            dv1 dv1VarF2 = zm3.F(bk.a(dv1VarL3, (au0) objQ), 0.0f, 6.0f, 1);
            er1 er1VarC4 = ws.c(prVar, z3);
            int iHashCode10 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ10 = ov0Var2.z();
            dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarF2);
            w20.b.getClass();
            x30Var3 = v20.b;
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var3);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, v20.e, er1VarC4);
            q73.h(ov0Var2, v20.d, l72VarZ10);
            q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode10));
            q73.g(ov0Var2, v20.g);
            q73.h(ov0Var2, v20.c, dv1VarH10);
            long jB3 = v63.b(11.5d);
            if (zT) {
                jr0Var2 = jr0.j;
            } else {
                jr0Var2 = jr0.g;
            }
            jr0 jr0Var5 = jr0Var2;
            if (zT) {
                ov0Var2.c0(425113579);
                ov0Var2.s();
                jC4 = hz.c;
            } else {
                ov0Var2.c0(425115097);
                jC4 = hz.c(0.75f, ((kz) ov0Var2.j(mz.a)).q);
                ov0Var2.s();
            }
            ov0 ov0Var4 = ov0Var2;
            s83.b(str, null, jC4, jB3, jr0Var5, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262058);
            ov0Var2 = ov0Var4;
            ov0Var2.r();
            it = it;
        }
        ov0Var2.s();
        ov0Var2.r();
        ov0Var2.r();
        dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
        kk2 kk2VarA4 = jk2.a(new jo(10.0f, true, new fo(0)), orVar2, ov0Var2, 6);
        int iHashCode11 = Long.hashCode(ks.U(ov0Var2));
        l72 l72VarZ11 = ov0Var2.z();
        dv1 dv1VarH11 = xp1.H(ov0Var2, dv1VarE4);
        w20.b.getClass();
        x30 x30Var5 = v20.b;
        ov0Var2.g0();
        if (ov0Var2.D()) {
            ov0Var2.k(x30Var5);
        } else {
            ov0Var2.p0();
        }
        gh ghVar5 = v20.e;
        q73.h(ov0Var2, ghVar5, kk2VarA4);
        gh ghVar6 = v20.d;
        q73.h(ov0Var2, ghVar6, l72VarZ11);
        Integer numValueOf2 = Integer.valueOf(iHashCode11);
        gh ghVar7 = v20.f;
        q73.h(ov0Var2, ghVar7, numValueOf2);
        wa waVar2 = v20.g;
        q73.g(ov0Var2, waVar2);
        gh ghVar8 = v20.c;
        q73.h(ov0Var2, ghVar8, dv1VarH11);
        lk2 lk2Var = lk2.a;
        dv1 dv1VarN3 = xp1.n(lk2.a(lk2Var, av1Var, 1.0f), cj2.a(14.0f));
        if (z) {
            orVar = orVar2;
            jC = hz.c(0.04f, hz.c);
        } else {
            orVar = orVar2;
            jC = hz.c(0.03f, hz.b);
        }
        pr prVar2 = prVar;
        dv1 dv1VarE5 = zm3.E(ji2.w(xp1.l(dv1VarN3, jC), 0.8f, hz.c(z ? 0.12f : 0.06f, dh0.p(ov0Var2).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA4 = wz.a(hoVar, nrVar, ov0Var2, 0);
        int iHashCode12 = Long.hashCode(ks.U(ov0Var2));
        l72 l72VarZ12 = ov0Var2.z();
        dv1 dv1VarH12 = xp1.H(ov0Var2, dv1VarE5);
        ov0Var2.g0();
        if (ov0Var2.D()) {
            ov0Var2.k(x30Var5);
        } else {
            ov0Var2.p0();
        }
        q73.h(ov0Var2, ghVar5, yzVarA4);
        q73.h(ov0Var2, ghVar6, l72VarZ12);
        az2.s(iHashCode12, ov0Var2, ghVar7, ov0Var2, waVar2);
        q73.h(ov0Var2, ghVar8, dv1VarH12);
        String strN2 = ke0.N(2131624097, ov0Var2);
        ov0 ov0Var5 = ov0Var2;
        long jB4 = v63.b(11.5d);
        long jC5 = hz.c(0.5f, dh0.p(ov0Var5).q);
        jr0 jr0Var6 = jr0.h;
        s83.b(strN2, null, jC5, jB4, jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
        gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
        String str2 = (String) ey1Var2.getValue();
        long jC6 = v63.c(14);
        long j7 = dh0.p(ov0Var5).q;
        jr0 jr0Var7 = jr0.i;
        q93 q93Var = new q93(j7, jC6, jr0Var7, 0L, 0L, 0, 0L, 16777208);
        dv1 dv1VarE6 = iw2.e(av1Var, 1.0f);
        Object objQ2 = ov0Var5.Q();
        if (objQ2 == c30Var) {
            objQ2 = new f4(ey1Var2, 29);
            ov0Var5.m0(objQ2);
        }
        xq.a(str2, (lu0) objQ2, dv1VarE6, false, q93Var, null, null, true, 0, 0, null, null, null, null, null, ov0Var5, 100663728, 0, 65240);
        ov0Var5.r();
        dv1 dv1VarN4 = xp1.n(lk2.a(lk2Var, av1Var, 1.0f), cj2.a(14.0f));
        if (z) {
            j = hz.c;
            f2 = 0.04f;
        } else {
            j = hz.b;
            f2 = 0.03f;
        }
        dv1 dv1VarE7 = zm3.E(ji2.w(xp1.l(dv1VarN4, hz.c(f2, j)), 0.8f, hz.c(z ? 0.12f : 0.06f, dh0.p(ov0Var5).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA5 = wz.a(hoVar, nrVar, ov0Var5, 0);
        int iHashCode13 = Long.hashCode(ks.U(ov0Var5));
        l72 l72VarZ13 = ov0Var5.z();
        dv1 dv1VarH13 = xp1.H(ov0Var5, dv1VarE7);
        ov0Var5.g0();
        if (ov0Var5.D()) {
            ov0Var5.k(x30Var5);
        } else {
            ov0Var5.p0();
        }
        q73.h(ov0Var5, ghVar5, yzVarA5);
        q73.h(ov0Var5, ghVar6, l72VarZ13);
        az2.s(iHashCode13, ov0Var5, ghVar7, ov0Var5, waVar2);
        q73.h(ov0Var5, ghVar8, dv1VarH13);
        s83.b(ke0.N(2131624098, ov0Var5), null, hz.c(0.5f, dh0.p(ov0Var5).q), v63.b(11.5d), jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
        gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
        String strE = e(ey1Var3);
        q93 q93Var2 = new q93(dh0.p(ov0Var5).q, v63.c(14), jr0Var7, 0L, 0L, 0, 0L, 16777208);
        dv1 dv1VarE8 = iw2.e(av1Var, 1.0f);
        Object objQ3 = ov0Var5.Q();
        if (objQ3 == c30Var) {
            objQ3 = new di0(ey1Var3, 0);
            ov0Var5.m0(objQ3);
        }
        xq.a(strE, (lu0) objQ3, dv1VarE8, false, q93Var2, null, null, true, 0, 0, null, null, null, null, null, ov0Var5, 100663728, 0, 65240);
        ov0Var5.r();
        ov0Var5.r();
        dv1 dv1VarN5 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
        if (z) {
            j2 = hz.c;
            f3 = 0.04f;
        } else {
            j2 = hz.b;
            f3 = 0.03f;
        }
        dv1 dv1VarE9 = zm3.E(ji2.w(xp1.l(dv1VarN5, hz.c(f3, j2)), 0.8f, hz.c(z ? 0.12f : 0.06f, dh0.p(ov0Var5).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA6 = wz.a(hoVar, nrVar, ov0Var5, 0);
        int iHashCode14 = Long.hashCode(ks.U(ov0Var5));
        l72 l72VarZ14 = ov0Var5.z();
        dv1 dv1VarH14 = xp1.H(ov0Var5, dv1VarE9);
        ov0Var5.g0();
        if (ov0Var5.D()) {
            ov0Var5.k(x30Var5);
        } else {
            ov0Var5.p0();
        }
        q73.h(ov0Var5, ghVar5, yzVarA6);
        q73.h(ov0Var5, ghVar6, l72VarZ14);
        az2.s(iHashCode14, ov0Var5, ghVar7, ov0Var5, waVar2);
        q73.h(ov0Var5, ghVar8, dv1VarH14);
        s83.b(ke0.N(2131624100, ov0Var5), null, hz.c(0.5f, dh0.p(ov0Var5).q), v63.b(11.5d), jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
        gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
        String strB = b(ey1Var4);
        q93 q93Var3 = new q93(dh0.p(ov0Var5).q, v63.c(14), jr0Var6, 0L, 0L, 0, 0L, 16777208);
        dv1 dv1VarE10 = iw2.e(av1Var, 1.0f);
        Object objQ4 = ov0Var5.Q();
        if (objQ4 == c30Var) {
            objQ4 = new di0(ey1Var4, 1);
            ov0Var5.m0(objQ4);
        }
        xq.a(strB, (lu0) objQ4, dv1VarE10, false, q93Var3, null, null, true, 0, 0, null, null, null, null, null, ov0Var5, 100663728, 0, 65240);
        ov0Var5.r();
        dv1 dv1VarE11 = iw2.e(av1Var, 1.0f);
        or orVar4 = orVar;
        kk2 kk2VarA5 = jk2.a(new jo(10.0f, true, new fo(0)), orVar4, ov0Var5, 6);
        int iHashCode15 = Long.hashCode(ks.U(ov0Var5));
        l72 l72VarZ15 = ov0Var5.z();
        dv1 dv1VarH15 = xp1.H(ov0Var5, dv1VarE11);
        ov0Var5.g0();
        if (ov0Var5.D()) {
            ov0Var5.k(x30Var5);
        } else {
            ov0Var5.p0();
        }
        q73.h(ov0Var5, ghVar5, kk2VarA5);
        q73.h(ov0Var5, ghVar6, l72VarZ15);
        az2.s(iHashCode15, ov0Var5, ghVar7, ov0Var5, waVar2);
        q73.h(ov0Var5, ghVar8, dv1VarH15);
        dv1 dv1VarN6 = xp1.n(lk2.a(lk2Var, av1Var, 1.2f), cj2.a(14.0f));
        if (z) {
            j3 = hz.c;
            f4 = 0.04f;
        } else {
            j3 = hz.b;
            f4 = 0.03f;
        }
        dv1 dv1VarE12 = zm3.E(ji2.w(xp1.l(dv1VarN6, hz.c(f4, j3)), 0.8f, hz.c(z ? 0.12f : 0.06f, dh0.p(ov0Var5).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA7 = wz.a(hoVar, nrVar, ov0Var5, 0);
        int iHashCode16 = Long.hashCode(ks.U(ov0Var5));
        l72 l72VarZ16 = ov0Var5.z();
        dv1 dv1VarH16 = xp1.H(ov0Var5, dv1VarE12);
        ov0Var5.g0();
        if (ov0Var5.D()) {
            ov0Var5.k(x30Var5);
        } else {
            ov0Var5.p0();
        }
        q73.h(ov0Var5, ghVar5, yzVarA7);
        q73.h(ov0Var5, ghVar6, l72VarZ16);
        az2.s(iHashCode16, ov0Var5, ghVar7, ov0Var5, waVar2);
        q73.h(ov0Var5, ghVar8, dv1VarH16);
        s83.b(ke0.N(2131624093, ov0Var5), null, hz.c(0.5f, dh0.p(ov0Var5).q), v63.b(11.5d), jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
        gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
        String strC = c(ey1Var5);
        q93 q93Var4 = new q93(dh0.p(ov0Var5).q, v63.c(14), jr0Var6, 0L, 0L, 0, 0L, 16777208);
        dv1 dv1VarE13 = iw2.e(av1Var, 1.0f);
        Object objQ5 = ov0Var5.Q();
        if (objQ5 == c30Var) {
            objQ5 = new di0(ey1Var5, 2);
            ov0Var5.m0(objQ5);
        }
        xq.a(strC, (lu0) objQ5, dv1VarE13, false, q93Var4, null, null, true, 0, 0, null, null, null, null, null, ov0Var5, 100663728, 0, 65240);
        ov0Var5.r();
        dv1 dv1VarN7 = xp1.n(lk2.a(lk2Var, av1Var, 0.8f), cj2.a(14.0f));
        if (z) {
            j4 = hz.c;
            f5 = 0.04f;
        } else {
            j4 = hz.b;
            f5 = 0.03f;
        }
        lk2 lk2Var2 = lk2Var;
        dv1 dv1VarE14 = zm3.E(ji2.w(xp1.l(dv1VarN7, hz.c(f5, j4)), 0.8f, hz.c(z ? 0.12f : 0.06f, dh0.p(ov0Var5).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA8 = wz.a(hoVar, nrVar, ov0Var5, 0);
        int iHashCode17 = Long.hashCode(ks.U(ov0Var5));
        l72 l72VarZ17 = ov0Var5.z();
        dv1 dv1VarH17 = xp1.H(ov0Var5, dv1VarE14);
        ov0Var5.g0();
        if (ov0Var5.D()) {
            ov0Var5.k(x30Var5);
        } else {
            ov0Var5.p0();
        }
        q73.h(ov0Var5, ghVar5, yzVarA8);
        q73.h(ov0Var5, ghVar6, l72VarZ17);
        az2.s(iHashCode17, ov0Var5, ghVar7, ov0Var5, waVar2);
        q73.h(ov0Var5, ghVar8, dv1VarH17);
        s83.b(ke0.N(2131624099, ov0Var5), null, hz.c(0.5f, dh0.p(ov0Var5).q), v63.b(11.5d), jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
        gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
        String strD = d(ey1Var6);
        q93 q93Var5 = new q93(dh0.p(ov0Var5).q, v63.c(14), jr0Var6, 0L, 0L, 0, 0L, 16777208);
        dv1 dv1VarE15 = iw2.e(av1Var, 1.0f);
        Object objQ6 = ov0Var5.Q();
        if (objQ6 == c30Var) {
            objQ6 = new di0(ey1Var6, 3);
            ov0Var5.m0(objQ6);
        }
        xq.a(strD, (lu0) objQ6, dv1VarE15, false, q93Var5, null, null, true, 0, 0, null, null, null, null, null, ov0Var5, 100663728, 0, 65240);
        ov0Var5.r();
        ov0Var5.r();
        c30 c30Var3 = c30Var;
        dv1 dv1VarE16 = zm3.E(ji2.w(xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b)), 0.8f, hz.c(z ? 0.12f : 0.06f, dh0.p(ov0Var5).A), cj2.a(14.0f)), 14.0f, 10.0f);
        yz yzVarA9 = wz.a(hoVar, nrVar, ov0Var5, 0);
        int iHashCode18 = Long.hashCode(ks.U(ov0Var5));
        l72 l72VarZ18 = ov0Var5.z();
        dv1 dv1VarH18 = xp1.H(ov0Var5, dv1VarE16);
        ov0Var5.g0();
        if (ov0Var5.D()) {
            ov0Var5.k(x30Var5);
        } else {
            ov0Var5.p0();
        }
        q73.h(ov0Var5, ghVar5, yzVarA9);
        q73.h(ov0Var5, ghVar6, l72VarZ18);
        az2.s(iHashCode18, ov0Var5, ghVar7, ov0Var5, waVar2);
        q73.h(ov0Var5, ghVar8, dv1VarH18);
        s83.b(ke0.O(2131624094, new Object[]{Integer.valueOf(t52Var.g())}, ov0Var5), null, hz.c(0.5f, dh0.p(ov0Var5).q), v63.b(11.5d), jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
        ov0 ov0Var6 = ov0Var5;
        gh0.h(ov0Var6, iw2.g(av1Var, 6.0f));
        dv1 dv1VarE17 = iw2.e(av1Var, 1.0f);
        kk2 kk2VarA6 = jk2.a(new jo(6.0f, true, new fo(0)), orVar4, ov0Var6, 6);
        int iHashCode19 = Long.hashCode(ks.U(ov0Var6));
        l72 l72VarZ19 = ov0Var6.z();
        dv1 dv1VarH19 = xp1.H(ov0Var6, dv1VarE17);
        ov0Var6.g0();
        if (ov0Var6.D()) {
            ov0Var6.k(x30Var5);
        } else {
            ov0Var6.p0();
        }
        q73.h(ov0Var6, ghVar5, kk2VarA6);
        q73.h(ov0Var6, ghVar6, l72VarZ19);
        az2.s(iHashCode19, ov0Var6, ghVar7, ov0Var6, waVar2);
        q73.h(ov0Var6, ghVar8, dv1VarH19);
        ov0Var6.c0(-1372029902);
        for (i52 i52Var : am1.G(g83.g(-65, "-65 极强"), g83.g(-80, "-80 良好"), g83.g(-95, "-95 一般"), g83.g(-110, "-110 微弱"))) {
            int iIntValue = ((Number) i52Var.e).intValue();
            String str3 = (String) i52Var.f;
            boolean z4 = t52Var.g() == iIntValue;
            lk2 lk2Var3 = lk2Var2;
            dv1 dv1VarL4 = xp1.l(xp1.n(lk2.a(lk2Var3, av1Var, 1.0f), cj2.a(8.0f)), z4 ? bk.i : z ? hz.c(0.06f, hz.c) : hz.c(0.04f, hz.b));
            boolean zD = ov0Var6.d(iIntValue);
            Object objQ7 = ov0Var6.Q();
            if (zD) {
                c30Var2 = c30Var3;
            } else {
                c30Var2 = c30Var3;
                if (objQ7 != c30Var2) {
                    i3 = 1;
                }
                dv1 dv1VarF3 = zm3.F(bk.a(dv1VarL4, (au0) objQ7), 0.0f, 6.0f, i3);
                pr prVar3 = prVar2;
                er1 er1VarC5 = ws.c(prVar3, false);
                int iHashCode20 = Long.hashCode(ks.U(ov0Var6));
                l72 l72VarZ20 = ov0Var6.z();
                dv1 dv1VarH20 = xp1.H(ov0Var6, dv1VarF3);
                w20.b.getClass();
                x30Var2 = v20.b;
                ov0Var6.g0();
                if (ov0Var6.D()) {
                    ov0Var6.k(x30Var2);
                } else {
                    ov0Var6.p0();
                }
                q73.h(ov0Var6, v20.e, er1VarC5);
                q73.h(ov0Var6, v20.d, l72VarZ20);
                q73.h(ov0Var6, v20.f, Integer.valueOf(iHashCode20));
                q73.g(ov0Var6, v20.g);
                q73.h(ov0Var6, v20.c, dv1VarH20);
                long jB5 = v63.b(10.5d);
                if (z4) {
                    jr0Var = jr0.j;
                } else {
                    jr0Var = jr0.g;
                }
                jr0 jr0Var8 = jr0Var;
                if (z4) {
                    ov0Var6.c0(1085723722);
                    ov0Var6.s();
                    jC2 = hz.c;
                } else {
                    ov0Var6.c0(1085725240);
                    jC2 = hz.c(0.75f, ((kz) ov0Var6.j(mz.a)).q);
                    ov0Var6.s();
                }
                ov0 ov0Var7 = ov0Var6;
                s83.b(str3, null, jC2, jB5, jr0Var8, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 24576, 0, 262058);
                ov0Var6 = ov0Var7;
                ov0Var6.r();
                prVar2 = prVar3;
                c30Var3 = c30Var2;
                lk2Var2 = lk2Var3;
            }
            i3 = 1;
            objQ7 = new yh0(iIntValue, t52Var, 1);
            ov0Var6.m0(objQ7);
            dv1 dv1VarF4 = zm3.F(bk.a(dv1VarL4, (au0) objQ7), 0.0f, 6.0f, i3);
            pr prVar4 = prVar2;
            er1 er1VarC6 = ws.c(prVar4, false);
            int iHashCode21 = Long.hashCode(ks.U(ov0Var6));
            l72 l72VarZ21 = ov0Var6.z();
            dv1 dv1VarH21 = xp1.H(ov0Var6, dv1VarF4);
            w20.b.getClass();
            x30Var2 = v20.b;
            ov0Var6.g0();
            if (ov0Var6.D()) {
                ov0Var6.k(x30Var2);
            } else {
                ov0Var6.p0();
            }
            q73.h(ov0Var6, v20.e, er1VarC6);
            q73.h(ov0Var6, v20.d, l72VarZ21);
            q73.h(ov0Var6, v20.f, Integer.valueOf(iHashCode21));
            q73.g(ov0Var6, v20.g);
            q73.h(ov0Var6, v20.c, dv1VarH21);
            long jB6 = v63.b(10.5d);
            if (z4) {
                jr0Var = jr0.j;
            } else {
                jr0Var = jr0.g;
            }
            jr0 jr0Var9 = jr0Var;
            if (z4) {
                ov0Var6.c0(1085723722);
                ov0Var6.s();
                jC2 = hz.c;
            } else {
                ov0Var6.c0(1085725240);
                jC2 = hz.c(0.75f, ((kz) ov0Var6.j(mz.a)).q);
                ov0Var6.s();
            }
            ov0 ov0Var8 = ov0Var6;
            s83.b(str3, null, jC2, jB6, jr0Var9, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 24576, 0, 262058);
            ov0Var6 = ov0Var8;
            ov0Var6.r();
            prVar2 = prVar4;
            c30Var3 = c30Var2;
            lk2Var2 = lk2Var3;
        }
        c30 c30Var4 = c30Var3;
        lk2 lk2Var4 = lk2Var2;
        pr prVar5 = prVar2;
        ov0Var6.s();
        ov0Var6.r();
        ov0Var6.r();
        dv1 dv1VarL5 = xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b));
        hh0 hh0Var2 = mz.a;
        dv1 dv1VarE18 = zm3.E(ji2.w(dv1VarL5, 0.8f, hz.c(z ? 0.12f : 0.06f, ((kz) ov0Var6.j(hh0Var2)).A), cj2.a(14.0f)), 14.0f, 6.0f);
        yz yzVarA10 = wz.a(hoVar, nrVar, ov0Var6, 0);
        int iHashCode22 = Long.hashCode(ks.U(ov0Var6));
        l72 l72VarZ22 = ov0Var6.z();
        dv1 dv1VarH22 = xp1.H(ov0Var6, dv1VarE18);
        w20.b.getClass();
        x30 x30Var6 = v20.b;
        ov0Var6.g0();
        if (ov0Var6.D()) {
            ov0Var6.k(x30Var6);
        } else {
            ov0Var6.p0();
        }
        gh ghVar9 = v20.e;
        q73.h(ov0Var6, ghVar9, yzVarA10);
        gh ghVar10 = v20.d;
        q73.h(ov0Var6, ghVar10, l72VarZ22);
        Integer numValueOf3 = Integer.valueOf(iHashCode22);
        gh ghVar11 = v20.f;
        q73.h(ov0Var6, ghVar11, numValueOf3);
        wa waVar3 = v20.g;
        q73.g(ov0Var6, waVar3);
        gh ghVar12 = v20.c;
        q73.h(ov0Var6, ghVar12, dv1VarH22);
        dv1 dv1VarF5 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 6.0f, 1);
        kk2 kk2VarA7 = jk2.a(u92Var, orVar3, ov0Var6, 54);
        int iHashCode23 = Long.hashCode(ks.U(ov0Var6));
        l72 l72VarZ23 = ov0Var6.z();
        dv1 dv1VarH23 = xp1.H(ov0Var6, dv1VarF5);
        ov0Var6.g0();
        if (ov0Var6.D()) {
            ov0Var6.k(x30Var6);
        } else {
            ov0Var6.p0();
        }
        q73.h(ov0Var6, ghVar9, kk2VarA7);
        q73.h(ov0Var6, ghVar10, l72VarZ23);
        az2.s(iHashCode23, ov0Var6, ghVar11, ov0Var6, waVar3);
        q73.h(ov0Var6, ghVar12, dv1VarH23);
        ov0 ov0Var9 = ov0Var6;
        s83.b(ke0.N(2131624096, ov0Var6), null, ((kz) ov0Var6.j(hh0Var2)).q, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 24576, 0, 262122);
        boolean zBooleanValue = ((Boolean) ey1Var7.getValue()).booleanValue();
        Object objQ8 = ov0Var9.Q();
        if (objQ8 == c30Var4) {
            objQ8 = new f4(ey1Var7, 27);
            ov0Var9.m0(objQ8);
        }
        lu0 lu0Var = (lu0) objQ8;
        long j8 = hz.c;
        long j9 = bk.i;
        b43.a(zBooleanValue, lu0Var, null, false, mc0.m(j8, j9, 0L, 0L, 0L, 0L, ov0Var9, 65532), ov0Var9, 48, 92);
        ov0Var9.r();
        g(null, 0.0f, hz.c(z ? 0.08f : 0.04f, ((kz) ov0Var9.j(hh0Var2)).A), ov0Var9, 0);
        dv1 dv1VarF6 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 6.0f, 1);
        kk2 kk2VarA8 = jk2.a(u92Var, orVar3, ov0Var9, 54);
        int iHashCode24 = Long.hashCode(ks.U(ov0Var9));
        l72 l72VarZ24 = ov0Var9.z();
        dv1 dv1VarH24 = xp1.H(ov0Var9, dv1VarF6);
        ov0Var9.g0();
        if (ov0Var9.D()) {
            ov0Var9.k(x30Var6);
        } else {
            ov0Var9.p0();
        }
        q73.h(ov0Var9, ghVar9, kk2VarA8);
        q73.h(ov0Var9, ghVar10, l72VarZ24);
        az2.s(iHashCode24, ov0Var9, ghVar11, ov0Var9, waVar3);
        q73.h(ov0Var9, ghVar12, dv1VarH24);
        s83.b(ke0.N(2131624388, ov0Var9), null, ((kz) ov0Var9.j(hh0Var2)).q, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 24576, 0, 262122);
        boolean zBooleanValue2 = ((Boolean) ey1Var8.getValue()).booleanValue();
        Object objQ9 = ov0Var9.Q();
        if (objQ9 == c30Var4) {
            objQ9 = new f4(ey1Var8, 28);
            ov0Var9.m0(objQ9);
        }
        b43.a(zBooleanValue2, (lu0) objQ9, null, false, mc0.m(j8, bk.g, 0L, 0L, 0L, 0L, ov0Var9, 65532), ov0Var9, 48, 92);
        ov0Var9.r();
        ov0Var9.r();
        ov0Var9.r();
        gh0.h(ov0Var9, iw2.g(av1Var, 14.0f));
        dv1 dv1VarE19 = iw2.e(av1Var, 1.0f);
        kk2 kk2VarA9 = jk2.a(new jo(10.0f, true, new fo(0)), orVar3, ov0Var9, 54);
        int iHashCode25 = Long.hashCode(ks.U(ov0Var9));
        l72 l72VarZ25 = ov0Var9.z();
        dv1 dv1VarH25 = xp1.H(ov0Var9, dv1VarE19);
        ov0Var9.g0();
        if (ov0Var9.D()) {
            ov0Var9.k(x30Var6);
        } else {
            ov0Var9.p0();
        }
        q73.h(ov0Var9, ghVar9, kk2VarA9);
        q73.h(ov0Var9, ghVar10, l72VarZ25);
        az2.s(iHashCode25, ov0Var9, ghVar11, ov0Var9, waVar3);
        q73.h(ov0Var9, ghVar12, dv1VarH25);
        dv1 dv1VarN8 = xp1.n(iw2.g(lk2.a(lk2Var4, av1Var, 1.0f), 42.0f), cj2.a(12.0f));
        if (z) {
            j5 = j8;
            f6 = 0.08f;
        } else {
            j5 = hz.b;
            f6 = 0.05f;
        }
        dv1 dv1VarA2 = bk.a(xp1.l(dv1VarN8, hz.c(f6, j5)), au0Var);
        er1 er1VarC7 = ws.c(prVar5, false);
        int iHashCode26 = Long.hashCode(ks.U(ov0Var9));
        l72 l72VarZ26 = ov0Var9.z();
        dv1 dv1VarH26 = xp1.H(ov0Var9, dv1VarA2);
        ov0Var9.g0();
        if (ov0Var9.D()) {
            ov0Var9.k(x30Var6);
        } else {
            ov0Var9.p0();
        }
        q73.h(ov0Var9, ghVar9, er1VarC7);
        q73.h(ov0Var9, ghVar10, l72VarZ26);
        az2.s(iHashCode26, ov0Var9, ghVar11, ov0Var9, waVar3);
        q73.h(ov0Var9, ghVar12, dv1VarH26);
        s83.b(ke0.N(2131624085, ov0Var9), null, 0L, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 24576, 0, 262126);
        ov0Var9.r();
        bj2 bj2VarA = cj2.a(12.0f);
        gu guVarA = hu.a(j9, 0L, 0L, 0L, ov0Var9, 14);
        dv1 dv1VarG = iw2.g(lk2.a(lk2Var4, av1Var, 1.3f), 42.0f);
        boolean zF2 = ov0Var9.f(ki0Var) | ov0Var9.f(iu0Var);
        Object objQ10 = ov0Var9.Q();
        if (zF2 || objQ10 == c30Var4) {
            objQ10 = new au0() { // from class: ai0
                @Override // defpackage.au0
                public final Object invoke() {
                    String str4;
                    Integer numA0 = s13.a0((String) ey1Var2.getValue());
                    int iIntValue2 = numA0 != null ? numA0.intValue() : 460;
                    Integer numA1 = s13.a0((String) ey1Var3.getValue());
                    int iIntValue3 = numA1 != null ? numA1.intValue() : 0;
                    Integer numA2 = s13.a0((String) ey1Var4.getValue());
                    int iIntValue4 = numA2 != null ? numA2.intValue() : 0;
                    Integer numA3 = s13.a0((String) ey1Var5.getValue());
                    int iIntValue5 = numA3 != null ? numA3.intValue() : 0;
                    Integer numA4 = s13.a0((String) ey1Var6.getValue());
                    int iIntValue6 = numA4 != null ? numA4.intValue() : 0;
                    ki0 ki0Var2 = ki0Var;
                    ey1 ey1Var9 = ey1Var;
                    if (ki0Var2 == null || (str4 = ki0Var2.a) == null) {
                        str4 = ((String) ey1Var9.getValue()) + "_" + iIntValue2 + "_" + iIntValue3 + "_" + iIntValue4 + "_" + iIntValue5;
                    }
                    int i4 = (o51.f((String) ey1Var9.getValue(), "GSM") || o51.f((String) ey1Var9.getValue(), "WCDMA")) ? iIntValue4 : 0;
                    int i5 = (o51.f((String) ey1Var9.getValue(), "GSM") || o51.f((String) ey1Var9.getValue(), "WCDMA")) ? iIntValue5 : 0;
                    int i6 = o51.f((String) ey1Var9.getValue(), "WCDMA") ? iIntValue6 : 0;
                    long j10 = o51.f((String) ey1Var9.getValue(), "NR") ? iIntValue5 : 0L;
                    String str5 = (String) ey1Var9.getValue();
                    Integer numValueOf4 = Integer.valueOf(iIntValue2);
                    Integer numValueOf5 = Integer.valueOf(iIntValue3);
                    Integer numValueOf6 = Integer.valueOf(iIntValue4);
                    Integer numValueOf7 = Integer.valueOf(iIntValue5);
                    Integer numValueOf8 = Integer.valueOf(iIntValue6);
                    Integer numValueOf9 = Integer.valueOf(i4);
                    Integer numValueOf10 = Integer.valueOf(i5);
                    Integer numValueOf11 = Integer.valueOf(i6);
                    Long lValueOf = Long.valueOf(j10);
                    Integer numValueOf12 = Integer.valueOf(t52Var.g());
                    Boolean bool = (Boolean) ey1Var7.getValue();
                    bool.booleanValue();
                    Boolean bool2 = (Boolean) ey1Var8.getValue();
                    bool2.booleanValue();
                    iu0Var.e(str4, str5, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, lValueOf, 0, 0, 0, numValueOf12, bool, bool2);
                    return mf3.a;
                }
            };
            ov0Var9.m0(objQ10);
        }
        n51.a((au0) objQ10, dv1VarG, false, bj2VarA, guVarA, null, null, null, ji2.g, ov0Var9, 805306368, 484);
        ov0Var9.r();
        ov0Var9.r();
    }

    public static final void g(dv1 dv1Var, float f2, long j, f30 f30Var, int i2) {
        dv1 dv1Var2;
        float f3;
        dv1 dv1Var3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(75144485);
        int i3 = i2 | 54 | (ov0Var.e(j) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        boolean z = true;
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                f3 = id0.a;
                dv1Var3 = av1.a;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var;
                f3 = f2;
            }
            ov0Var.q();
            dv1 dv1VarG = iw2.g(iw2.e(dv1Var3, 1.0f), f3);
            if ((((i3 & 896) ^ 384) <= 256 || !ov0Var.e(j)) && (i3 & 384) != 256) {
                z = false;
            }
            Object objQ = ov0Var.Q();
            if (z || objQ == d30.a) {
                objQ = new jd0(f3, 0, j);
                ov0Var.m0(objQ);
            }
            ji2.o(dv1VarG, (lu0) objQ, ov0Var, 0);
            dv1Var2 = dv1Var3;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            f3 = f2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kd0(dv1Var2, f3, j, i2, 0);
        }
    }

    public static final void h(dv1 dv1Var, float f2, long j, f30 f30Var, int i2) {
        float f3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1534852205);
        int i3 = i2 | 48 | (ov0Var.e(j) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                f3 = id0.a;
            } else {
                ov0Var.W();
                f3 = f2;
            }
            ov0Var.q();
            dv1 dv1VarO = iw2.o(iw2.c(dv1Var, 1.0f), f3);
            boolean z = (((i3 & 896) ^ 384) > 256 && ov0Var.e(j)) || (i3 & 384) == 256;
            Object objQ = ov0Var.Q();
            if (z || objQ == d30.a) {
                objQ = new jd0(f3, 1, j);
                ov0Var.m0(objQ);
            }
            ji2.o(dv1VarO, (lu0) objQ, ov0Var, 0);
        } else {
            ov0Var.W();
            f3 = f2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kd0(dv1Var, f3, j, i2, 1);
        }
    }

    public static final uc0 i(uc0 uc0Var, uc0 uc0Var2, vq2 vq2Var, long j, wp2 wp2Var) {
        if (wp2Var == null) {
            return K(uc0Var, uc0Var2);
        }
        int iCompare = vq2Var.f.compare(Long.valueOf(wp2Var.c), Long.valueOf(j));
        if (iCompare < 0) {
            return uc0.e;
        }
        return iCompare > 0 ? uc0.g : uc0.f;
    }

    public static final iv0 j(iv0 iv0Var) {
        if (iv0Var == null) {
            iv0Var = null;
        }
        if (iv0Var != null) {
            return iv0Var;
        }
        j30.b("Inconsistent composition");
        fo.d();
        return null;
    }

    public static void k(long j, xt xtVar, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j2;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            fo.i("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((uu) arrayList4.get(i9)).a() < i8) {
                fo.i("Failed requirement.");
                return;
            }
        }
        uu uuVar = (uu) arrayList.get(i3);
        uu uuVar2 = (uu) arrayList4.get(i4 - 1);
        if (i8 == uuVar.a()) {
            int iIntValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            uu uuVar3 = (uu) arrayList4.get(i10);
            i5 = i10;
            i6 = iIntValue;
            uuVar = uuVar3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (uuVar.d(i8) == uuVar2.d(i8)) {
            int iMin = Math.min(uuVar.a(), uuVar2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < iMin && uuVar.d(i12) == uuVar2.d(i12); i12++) {
                i11++;
            }
            long j3 = (xtVar.f / 4) + j + 2 + ((long) i11) + 1;
            xtVar.j0(-i11);
            xtVar.j0(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                xtVar.j0(uuVar.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((uu) arrayList4.get(i5)).a()) {
                    xtVar.j0(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    fo.n("Check failed.");
                    return;
                }
            }
            xt xtVar2 = new xt();
            xtVar.j0(((int) ((xtVar2.f / 4) + j3)) * (-1));
            k(j3, xtVar2, i13, arrayList4, i5, i4, arrayList5);
            xtVar.B(xtVar2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((uu) arrayList4.get(i15 - 1)).d(i8) != ((uu) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j4 = (xtVar.f / 4) + j + 2 + ((long) (i14 * 2));
        xtVar.j0(i14);
        xtVar.j0(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int iD = ((uu) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || iD != ((uu) arrayList4.get(i16 - 1)).d(i8)) {
                xtVar.j0(iD & 255);
            }
        }
        xt xtVar3 = new xt();
        int i17 = i5;
        while (i17 < i4) {
            byte bD = ((uu) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (bD != ((uu) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((uu) arrayList4.get(i17)).a()) {
                xtVar.j0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i7 = i19;
            } else {
                xtVar.j0(((int) ((xtVar3.f / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i7 = i19;
                k(j2, xtVar3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        xtVar.B(xtVar3);
    }

    public static final t20 l(t20 t20Var, t20 t20Var2) {
        if (t20Var == null) {
            return t20Var2;
        }
        RenderEffect renderEffectCreateChainEffect = RenderEffect.createChainEffect(t20Var2.c(), t20Var.c());
        renderEffectCreateChainEffect.getClass();
        return new nf(renderEffectCreateChainEffect);
    }

    public static void m(String str) {
        if (str.length() <= 0) {
            fo.i("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || cCharAt >= 127) {
                fo.f(bh3.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                return;
            }
        }
    }

    public static void n(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                fo.f(bh3.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2).concat(bh3.o(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static final boolean o(dq0 dq0Var, boolean z) {
        int iOrdinal = dq0Var.r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dq0 dq0VarU = vd0.u(dq0Var);
                if (!(dq0VarU != null ? o(dq0VarU, z) : true)) {
                    return false;
                }
                dq0Var.n1(zp0.f, zp0.g);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                b81.d();
                return false;
            }
        }
        return true;
    }

    public static double p(z60 z60Var, List list) {
        z60 z60Var2 = z60Var;
        double d2 = z60Var2.a;
        if (list.isEmpty()) {
            return Double.POSITIVE_INFINITY;
        }
        if (list.size() == 1) {
            return vd0.o(z60Var2, (z60) zy.n0(list));
        }
        Iterator it = zy.O0(list).iterator();
        if (!it.hasNext()) {
            b81.p();
            return 0.0d;
        }
        i52 i52Var = (i52) it.next();
        z60 z60Var3 = (z60) i52Var.e;
        z60 z60Var4 = (z60) i52Var.f;
        i52 i52VarQ = q(z60Var2, z60Var3);
        double dDoubleValue = ((Number) i52VarQ.e).doubleValue();
        double dDoubleValue2 = ((Number) i52VarQ.f).doubleValue();
        double d3 = (z60Var4.a - d2) * 111319.49079327358d;
        double d4 = z60Var4.b - z60Var3.b;
        double d5 = 540.0d;
        double dCos = Math.cos(Math.toRadians(d2)) * (((d4 + 540.0d) % 360.0d) - 180.0d) * 111319.49079327358d;
        double d6 = d3 - dDoubleValue2;
        double d7 = (d6 * d6) + (dCos * dCos);
        double dT = d7 <= 1.0E-6d ? 0.0d : mh0.t((((-dDoubleValue) * dCos) - (dDoubleValue2 * d6)) / d7, 0.0d, 1.0d);
        double dHypot = Math.hypot((dCos * dT) + dDoubleValue, (dT * d6) + dDoubleValue2);
        while (it.hasNext()) {
            i52 i52Var2 = (i52) it.next();
            z60 z60Var5 = (z60) i52Var2.e;
            z60 z60Var6 = (z60) i52Var2.f;
            i52 i52VarQ2 = q(z60Var2, z60Var5);
            double dDoubleValue3 = ((Number) i52VarQ2.e).doubleValue();
            double dDoubleValue4 = ((Number) i52VarQ2.f).doubleValue();
            double d8 = d5;
            double d9 = (z60Var6.a - d2) * 111319.49079327358d;
            double d10 = d2;
            double dCos2 = Math.cos(Math.toRadians(d10)) * ((((z60Var6.b - z60Var5.b) + d8) % 360.0d) - 180.0d) * 111319.49079327358d;
            double d11 = d9 - dDoubleValue4;
            double d12 = (d11 * d11) + (dCos2 * dCos2);
            double dT2 = d12 <= 1.0E-6d ? 0.0d : mh0.t((((-dDoubleValue3) * dCos2) - (dDoubleValue4 * d11)) / d12, 0.0d, 1.0d);
            dHypot = Math.min(dHypot, Math.hypot((dCos2 * dT2) + dDoubleValue3, (dT2 * d11) + dDoubleValue4));
            z60Var2 = z60Var;
            d5 = d8;
            d2 = d10;
        }
        return dHypot;
    }

    public static final i52 q(z60 z60Var, z60 z60Var2) {
        double d2 = ((((z60Var2.b - z60Var.b) + 540.0d) % 360.0d) - 180.0d) * 111319.49079327358d;
        double d3 = z60Var.a;
        return new i52(Double.valueOf(Math.cos(Math.toRadians(d3)) * d2), Double.valueOf((z60Var2.a - d3) * 111319.49079327358d));
    }

    public static void r(lr2 lr2Var, List list, Double d2, Double d3) {
        Iterable<LocationRecord> iterable;
        List<LocationRecord> listL0;
        double lat;
        double dCos;
        lr2Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int iArgb = Color.argb(50, 46, 204, 113);
        int iArgb2 = Color.argb(100, 46, 204, 113);
        if (list.size() > 180) {
            if (d2 != null && d3 != null) {
                listL0 = zy.C0(list, new xo1(d2, d3));
            } else if (list.size() <= 1) {
                listL0 = zy.J0(list);
            } else {
                listL0 = zy.L0(list);
                Collections.reverse(listL0);
            }
            ArrayList arrayList = new ArrayList(180);
            for (LocationRecord locationRecord : listL0) {
                if (arrayList.size() >= 180) {
                    break;
                }
                Iterator it = arrayList.iterator();
                it.getClass();
                do {
                    if (!it.hasNext()) {
                        arrayList.add(locationRecord);
                        break;
                    }
                    Object next = it.next();
                    next.getClass();
                    LocationRecord locationRecord2 = (LocationRecord) next;
                    lat = locationRecord.getLat() - locationRecord2.getLat();
                    dCos = Math.cos(Math.toRadians(locationRecord.getLat())) * (locationRecord.getLng() - locationRecord2.getLng());
                } while ((dCos * dCos) + (lat * lat) >= 7.262666704023671E-8d);
            }
            iterable = arrayList;
        } else {
            iterable = list;
        }
        for (LocationRecord locationRecord3 : iterable) {
            lr2Var.a(locationRecord3.getLat(), locationRecord3.getLng(), 50.0d, iArgb, iArgb2, 2.0f);
        }
    }

    public static final float s(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = z83.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : k11.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float t(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = z83.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? k11.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final x01 u() {
        x01 x01Var = c;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(18.0f, 8.0f);
        nx0Var.i(-1.0f);
        nx0Var.k(17.0f, 6.0f);
        nx0Var.g(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        nx0Var.n(7.0f, 3.24f, 7.0f, 6.0f);
        nx0Var.s(2.0f);
        nx0Var.k(6.0f, 8.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0Var.s(10.0f);
        nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nx0Var.i(12.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0Var.k(20.0f, 10.0f);
        nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.e();
        nx0Var.m(12.0f, 17.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        nx0Var.o(0.9f, -2.0f, 2.0f, -2.0f);
        nx0Var.o(2.0f, 0.9f, 2.0f, 2.0f);
        nx0Var.o(-0.9f, 2.0f, -2.0f, 2.0f);
        nx0Var.e();
        nx0Var.m(9.0f, 8.0f);
        nx0Var.k(9.0f, 6.0f);
        nx0Var.g(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        nx0Var.o(3.0f, 1.34f, 3.0f, 3.0f);
        nx0Var.s(2.0f);
        nx0Var.k(9.0f, 8.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        c = x01VarB;
        return x01VarB;
    }

    public static final int v(long j, x83 x83Var) {
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        sw1 sw1Var = x83Var.b;
        return fIntBitsToFloat >= sw1Var.e ? x83Var.a.a.f.length() : sw1Var.g(j);
    }

    public static final x01 w() {
        x01 x01Var = f;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Route", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(19.0f, 15.18f);
        nx0Var.r(7.0f);
        nx0Var.g(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        nx0Var.o(-4.0f, 1.79f, -4.0f, 4.0f);
        nx0Var.s(10.0f);
        nx0Var.g(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        nx0Var.o(-2.0f, -0.9f, -2.0f, -2.0f);
        nx0Var.r(8.82f);
        nx0Var.f(8.16f, 8.4f, 9.0f, 7.3f, 9.0f, 6.0f);
        nx0Var.g(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        nx0Var.n(3.0f, 4.34f, 3.0f, 6.0f);
        nx0Var.g(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        nx0Var.r(17.0f);
        nx0Var.g(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        nx0Var.o(4.0f, -1.79f, 4.0f, -4.0f);
        nx0Var.r(7.0f);
        nx0Var.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        nx0Var.o(2.0f, 0.9f, 2.0f, 2.0f);
        nx0Var.s(8.18f);
        nx0Var.g(-1.16f, 0.41f, -2.0f, 1.51f, -2.0f, 2.82f);
        nx0Var.g(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        nx0Var.o(3.0f, -1.34f, 3.0f, -3.0f);
        nx0Var.f(21.0f, 16.7f, 20.16f, 15.6f, 19.0f, 15.18f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        f = x01VarB;
        return x01VarB;
    }

    public static final x01 x() {
        x01 x01Var = g;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.SatelliteAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(20.95f, 14.88f);
        nx0VarI.g(-0.4f, 3.18f, -2.89f, 5.67f, -6.07f, 6.07f);
        nx0VarI.f(14.37f, 21.01f, 14.0f, 21.44f, 14.0f, 21.94f);
        nx0VarI.g(0.0f, 0.04f, 0.0f, 0.08f, 0.01f, 0.12f);
        nx0VarI.g(0.07f, 0.55f, 0.57f, 0.94f, 1.12f, 0.87f);
        nx0VarI.g(4.09f, -0.51f, 7.3f, -3.72f, 7.81f, -7.81f);
        nx0VarI.g(0.06f, -0.55f, -0.33f, -1.05f, -0.88f, -1.11f);
        nx0VarI.f(21.51f, 13.94f, 21.01f, 14.33f, 20.95f, 14.88f);
        nx0VarI.e();
        nx0VarI.m(18.84f, 15.26f);
        nx0VarI.g(0.14f, -0.53f, -0.18f, -1.08f, -0.72f, -1.22f);
        nx0VarI.g(-0.54f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f);
        nx0VarI.g(-0.27f, 1.05f, -1.09f, 1.87f, -2.15f, 2.15f);
        nx0VarI.f(14.3f, 17.03f, 14.0f, 17.43f, 14.0f, 17.88f);
        nx0VarI.g(0.0f, 0.08f, 0.01f, 0.17f, 0.03f, 0.25f);
        nx0VarI.g(0.14f, 0.53f, 0.69f, 0.85f, 1.22f, 0.72f);
        nx0VarI.f(17.02f, 18.38f, 18.39f, 17.01f, 18.84f, 15.26f);
        nx0VarI.e();
        nx0VarI.m(21.8f, 4.12f);
        nx0VarI.l(-3.54f, -3.54f);
        nx0VarI.g(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        nx0VarI.l(-3.18f, 3.18f);
        nx0VarI.g(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        nx0VarI.l(1.24f, 1.24f);
        nx0VarI.l(-0.71f, 0.71f);
        nx0VarI.k(11.55f, 7.3f);
        nx0VarI.g(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        nx0VarI.k(7.3f, 8.72f);
        nx0VarI.g(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        nx0VarI.l(1.24f, 1.24f);
        nx0VarI.l(-0.71f, 0.71f);
        nx0VarI.k(6.6f, 12.25f);
        nx0VarI.g(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        nx0VarI.l(-3.18f, 3.18f);
        nx0VarI.g(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        nx0VarI.l(3.54f, 3.54f);
        nx0VarI.g(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        nx0VarI.l(3.18f, -3.18f);
        nx0VarI.g(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        nx0VarI.l(-1.24f, -1.24f);
        nx0VarI.l(0.71f, -0.71f);
        nx0VarI.l(1.24f, 1.24f);
        nx0VarI.g(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        nx0VarI.l(1.41f, -1.41f);
        nx0VarI.g(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        nx0VarI.k(13.84f, 9.6f);
        nx0VarI.l(0.71f, -0.71f);
        nx0VarI.l(1.24f, 1.24f);
        nx0VarI.g(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        nx0VarI.l(3.18f, -3.18f);
        nx0VarI.f(22.58f, 6.17f, 22.58f, 4.9f, 21.8f, 4.12f);
        nx0VarI.e();
        nx0VarI.m(5.54f, 20.38f);
        nx0VarI.k(2.0f, 16.85f);
        nx0VarI.l(1.06f, -1.06f);
        nx0VarI.l(3.54f, 3.54f);
        nx0VarI.k(5.54f, 20.38f);
        nx0VarI.e();
        nx0VarI.m(7.66f, 18.26f);
        nx0VarI.l(-3.54f, -3.54f);
        nx0VarI.l(1.06f, -1.06f);
        nx0VarI.l(3.54f, 3.54f);
        nx0VarI.k(7.66f, 18.26f);
        nx0VarI.e();
        nx0VarI.m(17.2f, 8.72f);
        nx0VarI.l(-3.54f, -3.54f);
        nx0VarI.l(1.06f, -1.06f);
        nx0VarI.l(3.54f, 3.54f);
        nx0VarI.k(17.2f, 8.72f);
        nx0VarI.e();
        nx0VarI.m(19.32f, 6.6f);
        nx0VarI.l(-3.54f, -3.54f);
        nx0VarI.k(16.85f, 2.0f);
        nx0VarI.l(3.54f, 3.54f);
        nx0VarI.k(19.32f, 6.6f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        g = x01VarB;
        return x01VarB;
    }

    public static final x01 y() {
        x01 x01Var = h;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Storage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(4.0f, 20.0f);
        nx0Var.i(16.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0Var.o(-0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.k(4.0f, 16.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0Var.o(0.9f, 2.0f, 2.0f, 2.0f);
        nx0Var.e();
        nx0Var.m(4.0f, 17.0f);
        nx0Var.i(2.0f);
        nx0Var.s(2.0f);
        nx0Var.k(4.0f, 19.0f);
        nx0Var.s(-2.0f);
        nx0Var.e();
        nx0Var.m(2.0f, 6.0f);
        nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nx0Var.i(16.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0Var.o(-0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.k(4.0f, 4.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0Var.e();
        nx0Var.m(6.0f, 7.0f);
        nx0Var.k(4.0f, 7.0f);
        nx0Var.k(4.0f, 5.0f);
        nx0Var.i(2.0f);
        nx0Var.s(2.0f);
        nx0Var.e();
        nx0Var.m(4.0f, 14.0f);
        nx0Var.i(16.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0Var.o(-0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.k(4.0f, 10.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0Var.o(0.9f, 2.0f, 2.0f, 2.0f);
        nx0Var.e();
        nx0Var.m(4.0f, 11.0f);
        nx0Var.i(2.0f);
        nx0Var.s(2.0f);
        nx0Var.k(4.0f, 13.0f);
        nx0Var.s(-2.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        h = x01VarB;
        return x01VarB;
    }

    public static final void z(ya1 ya1Var) {
        xp1.O(ya1Var).D();
    }
}
