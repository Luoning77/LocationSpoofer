package defpackage;

import android.os.Build;
import android.view.DragEvent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.RouteTravelMode;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.sharing.SharingCounts;
import com.vincenthzr.locationspoofer.data.sharing.SharingUiState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ee0 {
    public static x01 a;
    public static x01 b;
    public static x01 c;
    public static x01 d;
    public static x01 e;
    public static x01 f;

    public static final long A(t1 t1Var) {
        DragEvent dragEvent = (DragEvent) t1Var.f;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final x01 B() {
        x01 x01Var = e;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.RadioButtonChecked", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        long j = hz.b;
        qy2 qy2Var = new qy2(j);
        nx0 nx0VarI = p91.i(12.0f, 2.0f);
        nx0VarI.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        nx0VarI.o(4.48f, 10.0f, 10.0f, 10.0f);
        nx0VarI.o(10.0f, -4.48f, 10.0f, -10.0f);
        nx0VarI.n(17.52f, 2.0f, 12.0f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 20.0f);
        nx0VarI.g(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        nx0VarI.o(3.58f, -8.0f, 8.0f, -8.0f);
        nx0VarI.o(8.0f, 3.58f, 8.0f, 8.0f);
        nx0VarI.o(-3.58f, 8.0f, -8.0f, 8.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        qy2 qy2Var2 = new qy2(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q62(12.0f, 12.0f));
        arrayList.add(new y62(-5.0f, 0.0f));
        arrayList.add(new u62(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f));
        arrayList.add(new u62(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f));
        w01.a(w01Var, arrayList, qy2Var2);
        x01 x01VarB = w01Var.b();
        e = x01VarB;
        return x01VarB;
    }

    public static final void C(hs2 hs2Var) {
        xp1.O(hs2Var).E();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0299  */
    /* JADX WARN: Code duplicated, block: B:167:0x0374  */
    /* JADX WARN: Code duplicated, block: B:174:0x0388  */
    /* JADX WARN: Code duplicated, block: B:179:0x0392  */
    /* JADX WARN: Code duplicated, block: B:184:0x039b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bb A[LOOP:5: B:192:0x03b9->B:193:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:207:0x040a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0410  */
    /* JADX WARN: Code duplicated, block: B:212:0x0195 A[EDGE_INSN: B:212:0x0195->B:68:0x0195 BREAK  A[LOOP:0: B:7:0x003c->B:66:0x0173], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0171 A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0171: PHI (r6v14 zb) = (r6v13 zb), (r6v15 zb) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r21v7 xa3) = (r21v6 xa3), (r21v8 xa3) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r22v5 dj) = (r22v4 dj), (r22v6 dj) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r23v5 tc) = (r23v4 tc), (r23v6 tc) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r24v6 i60) = (r24v5 i60), (r24v7 i60) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r26v8 vh2) = (r26v7 vh2), (r26v9 vh2) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:8:0x004b, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0173 A[LOOP:0: B:7:0x003c->B:66:0x0173, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(ViewStructure viewStructure, hb1 hb1Var, AutofillId autofillId, String str, re2 re2Var) {
        long j;
        long j2;
        char c2;
        long j3;
        boolean zBooleanValue;
        xa3 xa3Var;
        dj djVar;
        tc tcVar;
        vh2 vh2Var;
        zb zbVar;
        boolean z;
        i60 i60Var;
        Boolean bool;
        boolean z2;
        Integer num;
        int i;
        List list;
        Integer numValueOf;
        boolean z3;
        String[] strArrS;
        boolean z4;
        boolean z5;
        boolean z6;
        String strJ;
        int size;
        String strQ;
        int i2;
        String[] strArrS2;
        String[] strArrS3;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        xa3 xa3Var2;
        dj djVar2;
        tc tcVar2;
        vh2 vh2Var2;
        rs2 rs2Var = os2.a;
        rs2 rs2Var2 = ds2.a;
        es2 es2VarW = hb1Var.w();
        int i4 = 8;
        if (es2VarW != null) {
            zx1 zx1Var = es2VarW.e;
            Object[] objArr3 = zx1Var.b;
            j = 128;
            Object[] objArr4 = zx1Var.c;
            long[] jArr3 = zx1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                zbVar = null;
                j2 = 255;
                z = false;
                xa3Var2 = null;
                djVar2 = null;
                tcVar2 = null;
                i60Var = null;
                bool = null;
                vh2Var2 = null;
                z2 = false;
                num = null;
                c2 = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i5 != length) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                rs2 rs2Var3 = (rs2) obj;
                                if (o51.f(rs2Var3, os2.s)) {
                                    obj2.getClass();
                                    zbVar = (zb) obj2;
                                } else if (o51.f(rs2Var3, os2.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) zy.o0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (o51.f(rs2Var3, os2.r)) {
                                    obj2.getClass();
                                    i60Var = (i60) obj2;
                                } else if (o51.f(rs2Var3, os2.t)) {
                                    obj2.getClass();
                                    tcVar2 = (tc) obj2;
                                } else if (o51.f(rs2Var3, os2.G)) {
                                    obj2.getClass();
                                    djVar2 = (dj) obj2;
                                } else if (o51.f(rs2Var3, os2.l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (o51.f(rs2Var3, os2.P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (o51.f(rs2Var3, os2.L)) {
                                    z2 = true;
                                } else if (o51.f(rs2Var3, os2.o)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (o51.f(rs2Var3, os2.z)) {
                                    obj2.getClass();
                                    vh2Var2 = (vh2) obj2;
                                } else if (o51.f(rs2Var3, os2.J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (o51.f(rs2Var3, os2.K)) {
                                    obj2.getClass();
                                    xa3Var2 = (xa3) obj2;
                                } else if (o51.f(rs2Var3, ds2.b)) {
                                    viewStructure.setClickable(true);
                                } else if (o51.f(rs2Var3, ds2.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (o51.f(rs2Var3, ds2.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (o51.f(rs2Var3, ds2.k)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                j2 = 255;
                c2 = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                zbVar = null;
                z = false;
                xa3Var2 = null;
                djVar2 = null;
                tcVar2 = null;
                i60Var = null;
                bool = null;
                vh2Var2 = null;
                z2 = false;
                num = null;
            }
            xa3Var = xa3Var2;
            djVar = djVar2;
            tcVar = tcVar2;
            vh2Var = vh2Var2;
        } else {
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            xa3Var = null;
            djVar = null;
            tcVar = null;
            vh2Var = null;
            zbVar = null;
            z = false;
            i60Var = null;
            bool = null;
            z2 = false;
            num = null;
        }
        es2 es2VarW2 = hb1Var.w();
        if (es2VarW2 != null && es2VarW2.g && !es2VarW2.h) {
            es2VarW2 = es2VarW2.b();
            sx1 sx1Var = new sx1(((gy1) ((qx1) hb1Var.n()).f).g);
            sx1Var.c(hb1Var.n());
            while (sx1Var.i()) {
                hb1 hb1Var2 = (hb1) sx1Var.k(sx1Var.b - 1);
                es2 es2VarW3 = hb1Var2.w();
                if (es2VarW3 != null && !es2VarW3.g) {
                    es2VarW2.d(es2VarW3);
                    if (!es2VarW3.h) {
                        sx1Var.c(hb1Var2.n());
                    }
                }
            }
        }
        if (es2VarW2 != null) {
            zx1 zx1Var2 = es2VarW2.e;
            Object[] objArr5 = zx1Var2.b;
            Object[] objArr6 = zx1Var2.c;
            long[] jArr4 = zx1Var2.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                i = 1;
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c2) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                rs2 rs2Var4 = (rs2) obj3;
                                objArr2 = objArr5;
                                if (o51.f(rs2Var4, os2.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (o51.f(rs2Var4, os2.C)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            } else {
                i = 1;
                list = null;
            }
        } else {
            i = 1;
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(hb1Var.f);
        if (hb1Var.u() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (zbVar != null) {
            numValueOf = Integer.valueOf(zbVar.a);
        } else if (z) {
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = xa3Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (djVar != null) {
            String strB0 = djVar.f;
            if (strB0.length() >= 5000) {
                strB0 = (Character.isHighSurrogate(strB0.charAt(4999)) && Character.isLowSurrogate(strB0.charAt(5000))) ? l13.B0(4999, strB0) : l13.B0(5000, strB0);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(strB0));
        }
        if (tcVar != null) {
            viewStructure.setAutofillValue(tcVar.a);
        }
        if (i60Var != null && (strArrS3 = zm3.s(i60Var)) != null) {
            viewStructure.setAutofillHints(strArrS3);
        }
        re2Var.b.l(hb1Var.f, new wa2(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (xa3Var == null) {
            if (bool != null && (vh2Var == null || vh2Var.a != 4)) {
                z3 = true;
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            i60.a.getClass();
            strArrS = zm3.s(h60.b);
            strArrS.getClass();
            if (strArrS.length != 0) {
                b81.y("Array is empty.");
                return;
            }
            String str2 = strArrS[0];
            if (i60Var != null || (strArrS2 = zm3.s(i60Var)) == null || yo.y0(strArrS2, str2) < 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (!z2 || z4) {
                z5 = z3;
            } else {
                z5 = false;
            }
            if (!z5 || zBooleanValue) {
                z6 = z3;
            } else {
                z6 = false;
            }
            viewStructure.setDataIsSensitive(z6);
            viewStructure.setVisibility(hb1Var.K.d.B1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strQ = "";
                for (i2 = 0; i2 < size; i2++) {
                    strQ = p91.q(new StringBuilder(strQ), ((dj) list.get(i2)).f, '\n');
                }
                viewStructure.setText(strQ);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((qx1) hb1Var.n()).isEmpty() && vh2Var != null && (strJ = ig0.J(vh2Var.a)) != null) {
                viewStructure.setClassName(strJ);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z5) {
                    viewStructure.setInputType(129);
                }
            }
        }
        viewStructure.setCheckable(i);
        viewStructure.setChecked(xa3Var == xa3.e);
        z3 = true;
        i60.a.getClass();
        strArrS = zm3.s(h60.b);
        strArrS.getClass();
        if (strArrS.length != 0) {
            b81.y("Array is empty.");
            return;
        }
        String str3 = strArrS[0];
        if (i60Var != null) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z2) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        if (z5) {
            z6 = z3;
        } else {
            z6 = z3;
        }
        viewStructure.setDataIsSensitive(z6);
        viewStructure.setVisibility(hb1Var.K.d.B1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strQ = "";
            while (i2 < size) {
                strQ = p91.q(new StringBuilder(strQ), ((dj) list.get(i2)).f, '\n');
            }
            viewStructure.setText(strQ);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((qx1) hb1Var.n()).isEmpty()) {
            viewStructure.setClassName(strJ);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z5) {
                viewStructure.setInputType(129);
            }
        }
    }

    public static final g21 E(f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (objQ == d30.a) {
            objQ = new g21();
            ov0Var.m0(objQ);
        }
        g21 g21Var = (g21) objQ;
        g21Var.a(0, ov0Var);
        return g21Var;
    }

    public static final rl2 F(f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.c0(1967007413);
        Object[] objArr = new Object[0];
        Object objQ = ov0Var.Q();
        if (objQ == d30.a) {
            objQ = new oi1(19);
            ov0Var.m0(objQ);
        }
        rl2 rl2Var = (rl2) wc0.d0(objArr, rl2.i, (au0) objQ, ov0Var, 384);
        rl2Var.g = (tl2) ov0Var.j(vl2.a);
        ov0Var.p(false);
        return rl2Var;
    }

    public static final hj3 G(ox oxVar, oj3 oj3Var, c80 c80Var, kn2 kn2Var) {
        String strK;
        oj3Var.getClass();
        c80Var.getClass();
        kn2Var.getClass();
        Class clsR = ig0.r(oxVar);
        mn2 mn2Var = new mn2(oj3Var, new x91(oxVar, kn2Var), c80Var);
        boolean z = kn2Var.c;
        if (z) {
            strK = null;
        } else {
            strK = az2.k("", "", !z ? kn2Var.b : "");
        }
        if (strK != null) {
            return mn2Var.r(xe2.a(clsR), strK);
        }
        ox oxVarA = xe2.a(clsR);
        String strB = oxVarA.b();
        if (strB != null) {
            return mn2Var.r(oxVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        fo.i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final vj2 H(MapEngine mapEngine, RoutePoint routePoint, RouteTravelMode routeTravelMode) {
        mapEngine.getClass();
        routePoint.getClass();
        routeTravelMode.getClass();
        return new vj2(routeTravelMode.getWireValue());
    }

    public static final Flow I(au0 au0Var) {
        return FlowKt.flow(new yd(au0Var, (q60) null, 8));
    }

    public static final void J(Object obj) {
        if (obj instanceof wg2) {
            throw ((wg2) obj).e;
        }
    }

    public static final void K(js2 js2Var, int i, pn2 pn2Var) {
        gy1 gy1Var = new gy1(new js2[16]);
        List listI = js2Var.i(false, false);
        while (true) {
            gy1Var.d(listI, gy1Var.g);
            while (true) {
                int i2 = gy1Var.g;
                if (i2 == 0) {
                    return;
                }
                js2 js2Var2 = (js2) gy1Var.k(i2 - 1);
                boolean zC = am1.C(js2Var2);
                es2 es2Var = js2Var2.d;
                zx1 zx1Var = es2Var.e;
                if (!zC && !zx1Var.c(os2.j)) {
                    xz1 xz1VarD = js2Var2.d();
                    if (xz1VarD == null) {
                        throw az2.e("Expected semantics node to have a coordinator.");
                    }
                    l41 l41VarX = mh0.X(wc0.x(xz1VarD, true));
                    if (l41VarX.a < l41VarX.c && l41VarX.b < l41VarX.d) {
                        Object objG = es2Var.e.g(ds2.e);
                        if (objG == null) {
                            objG = null;
                        }
                        pu0 pu0Var = (pu0) objG;
                        Object objG2 = zx1Var.g(os2.w);
                        on2 on2Var = (on2) (objG2 != null ? objG2 : null);
                        if (pu0Var == null || on2Var == null || ((Number) on2Var.b.invoke()).floatValue() <= 0.0f) {
                            listI = js2Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            pn2Var.invoke(new rn2(js2Var2, i3, l41VarX, xz1VarD));
                            K(js2Var2, i3, pn2Var);
                        }
                    }
                }
            }
        }
    }

    public static final long a(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final void b(boolean z, f30 f30Var, int i) throws XmlPullParserException, IOException {
        x30 x30Var;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1090665646);
        int i2 = 2;
        int i3 = i | (ov0Var.g(z) ? 4 : 2);
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            av1 av1Var = av1.a;
            dv1 dv1VarG = zm3.G(iw2.e(av1Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            u92 u92Var = am1.h;
            or orVar = j9.p;
            kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var, 54);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarG);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, kk2VarA);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            tg tgVar = (tg) ov0Var.j(z30.t);
            dv1 dv1VarN = xp1.n(av1Var, cj2.a(22.0f));
            long jD = xp1.d(4280559918L);
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(dv1VarN, jD, iy0Var);
            boolean zH = ov0Var.h(tgVar);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                objQ = new vp1(tgVar, i2);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarE = zm3.E(bk.a(dv1VarK, (au0) objQ), 16.0f, 9.0f);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            go goVar = am1.e;
            kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var, 48);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA2);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            f52 f52VarF = ig0.F(2131165278, ov0Var);
            String strN = ke0.N(2131624066, ov0Var);
            long j = hz.c;
            t01.b(f52VarF, strN, iw2.k(av1Var, 16.0f), j, ov0Var, 3464);
            String strI = az2.i(av1Var, 8.0f, ov0Var, 2131624066, ov0Var);
            long jB = v63.b(12.5d);
            jr0 jr0Var = jr0.h;
            s83.b(strI, null, j, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
            ov0Var.p(true);
            ov0Var.p(true);
            gh0.h(ov0Var, iw2.o(av1Var, 16.0f));
            dv1 dv1VarK2 = xp1.k(xp1.n(av1Var, cj2.a(22.0f)), z ? hz.c(0.22f, xp1.d(4280590814L)) : xp1.d(4293457146L), iy0Var);
            boolean zH2 = ov0Var.h(tgVar);
            Object objQ2 = ov0Var.Q();
            if (zH2 || objQ2 == c30Var) {
                objQ2 = new vp1(tgVar, 3);
                ov0Var.m0(objQ2);
            }
            dv1 dv1VarE2 = zm3.E(bk.a(dv1VarK2, (au0) objQ2), 16.0f, 9.0f);
            er1 er1VarC2 = ws.c(prVar, false);
            int iHashCode4 = Long.hashCode(ov0Var.T);
            l72 l72VarL4 = ov0Var.l();
            dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarE2);
            ov0Var.g0();
            if (ov0Var.S) {
                x30Var = x30Var2;
                ov0Var.k(x30Var);
            } else {
                x30Var = x30Var2;
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH4);
            kk2 kk2VarA3 = jk2.a(goVar, orVar, ov0Var, 48);
            int iHashCode5 = Long.hashCode(ov0Var.T);
            l72 l72VarL5 = ov0Var.l();
            dv1 dv1VarH5 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA3);
            q73.h(ov0Var, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH5);
            t01.b(ig0.F(2131165281, ov0Var), ke0.N(2131624067, ov0Var), iw2.k(av1Var, 16.0f), hz.g, ov0Var, 3464);
            s83.b(az2.i(av1Var, 8.0f, ov0Var, 2131624067, ov0Var), null, xp1.d(4280590814L), v63.b(12.5d), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
            ov0Var = ov0Var;
            ov0Var.p(true);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new i4(i, z);
        }
    }

    public static final void c(boolean z, au0 au0Var, au0 au0Var2, f30 f30Var, int i) {
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1799566235);
        int i2 = (ov0Var.g(z) ? 4 : 2) | i | (ov0Var.h(au0Var) ? 32 : 16) | (ov0Var.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            zm3.b(iw2.e(av1.a, 1.0f), 16.0f, new b52(16.0f, 14.0f, 16.0f, 14.0f), sb.a0(-1509425590, new gl1(z, au0Var, au0Var2), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new o2(z, au0Var, au0Var2, i);
        }
    }

    public static n71 d(lu0 lu0Var) {
        s61 s61Var = t61.d;
        s61Var.getClass();
        y61 y61Var = new y61();
        a71 a71Var = s61Var.a;
        y61Var.a = a71Var.a;
        y61Var.b = a71Var.e;
        y61Var.c = a71Var.b;
        y61Var.d = a71Var.c;
        y61Var.e = a71Var.d;
        String str = a71Var.f;
        y61Var.f = str;
        y61Var.g = a71Var.g;
        y61Var.h = a71Var.h;
        y61Var.i = a71Var.j;
        y61Var.j = a71Var.i;
        y61Var.k = s61Var.b;
        y61Var.l = a71Var.k;
        lu0Var.invoke(y61Var);
        if (y61Var.e) {
            if (!str.equals("    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        fo.f("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!str.equals("    ")) {
            fo.i("Indent should not be specified when default printing mode is used");
            return null;
        }
        a71 a71Var2 = new a71(y61Var.a, y61Var.c, y61Var.d, y61Var.e, y61Var.b, y61Var.f, y61Var.g, y61Var.h, y61Var.j, y61Var.i, y61Var.l);
        gt2 gt2Var = y61Var.k;
        gt2Var.getClass();
        return new n71(a71Var2, gt2Var);
    }

    public static final void e(p10 p10Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(441837433);
        int i2 = 0;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            Object objQ = ov0Var.Q();
            Object obj = d30.a;
            if (objQ == obj) {
                objQ = new kk1();
                ov0Var.m0(objQ);
            }
            Object obj2 = (kk1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == obj) {
                objQ2 = x30.y;
                ov0Var.m0(objQ2);
            }
            au0 au0Var = (au0) objQ2;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(au0Var);
            } else {
                ov0Var.p0();
            }
            if (ov0Var.S) {
                ov0Var.b(mf3.a, new yg3(i2));
            }
            q73.h(ov0Var, gh.y, obj2);
            p10Var.invoke(obj2, ov0Var, 48);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lk1(p10Var, i, i2);
        }
    }

    public static final void f(boolean z, au0 au0Var, f30 f30Var, int i) {
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(596984955);
        int i2 = (ov0Var.g(z) ? 4 : 2) | i | (ov0Var.h(au0Var) ? 32 : 16);
        int i3 = 18;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            boolean z2 = (i2 & 112) == 32;
            Object objQ = ov0Var.Q();
            if (z2 || objQ == d30.a) {
                objQ = new o6(i3, au0Var);
                ov0Var.m0(objQ);
            }
            zm3.b(bk.a(dv1VarE, (au0) objQ), 16.0f, new b52(16.0f, 14.0f, 16.0f, 14.0f), sb.a0(390810922, new z5(5, z), ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new o5(z, au0Var, i);
        }
    }

    public static final void g(au0 au0Var, f30 f30Var, int i) {
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(209601999);
        int i2 = 4;
        int i3 = (ov0Var.h(au0Var) ? 4 : 2) | i;
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            xq1.g(false, au0Var, ov0Var, (i3 << 3) & 112, 1);
            ov0Var.d0(414512006);
            kn2 kn2VarA = v91.a(ov0Var);
            ov0Var.d0(1274527078);
            ov0Var.p(false);
            ov0Var.d0(511388516);
            boolean zF = ov0Var.f(null) | ov0Var.f(kn2VarA);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = kn2VarA.a(xe2.a(CloudRepository.class), null);
                ov0Var.m0(objQ);
            }
            ov0Var.p(false);
            ov0Var.p(false);
            CloudRepository cloudRepository = (CloudRepository) objQ;
            ey1 ey1VarS = s(cloudRepository.getState(), ov0Var);
            tg tgVar = (tg) ov0Var.j(z30.t);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = ke0.H(null);
                ov0Var.m0(objQ2);
            }
            ey1 ey1Var = (ey1) objQ2;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ3);
            }
            ey1 ey1Var2 = (ey1) objQ3;
            Object objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                objQ4 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ4);
            }
            ey1 ey1Var3 = (ey1) objQ4;
            Object objQ5 = ov0Var.Q();
            if (objQ5 == c30Var) {
                objQ5 = new t52(0);
                ov0Var.m0(objQ5);
            }
            t52 t52Var = (t52) objQ5;
            boolean z = ((CloudAccountState) ey1VarS.getValue()).getValidated() && cloudRepository.satelliteAvailable();
            Boolean boolValueOf = Boolean.valueOf(z);
            Integer numValueOf = Integer.valueOf(t52Var.g());
            boolean zG = ov0Var.g(z) | ov0Var.h(cloudRepository);
            Object objQ6 = ov0Var.Q();
            if (zG || objQ6 == c30Var) {
                wp1 wp1Var = new wp1(z, cloudRepository, ey1Var, ey1Var2, ey1Var3, null);
                ey1Var3 = ey1Var3;
                ov0Var.m0(wp1Var);
                objQ6 = wp1Var;
            }
            oi0.f(boolValueOf, numValueOf, (pu0) objQ6, ov0Var);
            wc0.n(null, sb.a0(-154294637, new u2(i2, au0Var), ov0Var), null, null, null, 0, 0L, 0L, null, sb.a0(-389515682, new up1(tgVar, ey1Var3, ey1Var, ey1Var2, t52Var, 0), ov0Var), ov0Var, 805306416, 509);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new u2(i, 5, au0Var);
        }
    }

    public static final void h(uz uzVar, s93 s93Var, p10 p10Var, f30 f30Var, int i) {
        s93 s93Var2;
        w52 w52Var;
        w52 w52Var2;
        w52 w52Var3 = uzVar.u;
        w52 w52Var4 = uzVar.t;
        w52 w52Var5 = uzVar.s;
        w52 w52Var6 = uzVar.r;
        w52 w52Var7 = uzVar.q;
        w52 w52Var8 = uzVar.p;
        w52 w52Var9 = uzVar.o;
        w52 w52Var10 = uzVar.n;
        w52 w52Var11 = uzVar.m;
        w52 w52Var12 = uzVar.l;
        w52 w52Var13 = uzVar.k;
        w52 w52Var14 = uzVar.j;
        w52 w52Var15 = uzVar.i;
        w52 w52Var16 = uzVar.h;
        w52 w52Var17 = uzVar.g;
        w52 w52Var18 = uzVar.f;
        w52 w52Var19 = uzVar.e;
        w52 w52Var20 = uzVar.d;
        w52 w52Var21 = uzVar.c;
        w52 w52Var22 = uzVar.b;
        w52 w52Var23 = uzVar.a;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1384429948);
        int i2 = i | (ov0Var.f(uzVar) ? 4 : 2) | 16;
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                s93Var2 = (s93) ov0Var.j(t93.a);
            } else {
                ov0Var.W();
                s93Var2 = s93Var;
            }
            ov0Var.q();
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                w52Var = w52Var7;
                w52Var2 = w52Var8;
                objQ = new uz(((hz) w52Var23.getValue()).a, ((hz) w52Var22.getValue()).a, ((hz) w52Var21.getValue()).a, ((hz) w52Var20.getValue()).a, ((hz) w52Var19.getValue()).a, ((hz) w52Var18.getValue()).a, ((hz) w52Var17.getValue()).a, ((hz) w52Var16.getValue()).a, ((hz) w52Var15.getValue()).a, ((hz) w52Var14.getValue()).a, ((hz) w52Var13.getValue()).a, ((hz) w52Var12.getValue()).a, ((hz) w52Var11.getValue()).a, ((hz) w52Var10.getValue()).a, ((hz) w52Var9.getValue()).a, ((hz) w52Var2.getValue()).a, ((hz) w52Var.getValue()).a, ((hz) w52Var6.getValue()).a, ((hz) w52Var5.getValue()).a, ((hz) w52Var4.getValue()).a, ((hz) w52Var3.getValue()).a, ((hz) uzVar.v.getValue()).a, ((hz) uzVar.w.getValue()).a, ((hz) uzVar.x.getValue()).a, ((hz) uzVar.y.getValue()).a, ((hz) uzVar.z.getValue()).a, ((hz) uzVar.A.getValue()).a, ((hz) uzVar.B.getValue()).a, ((hz) uzVar.C.getValue()).a, ((hz) uzVar.D.getValue()).a, ((hz) uzVar.E.getValue()).a, ((hz) uzVar.F.getValue()).a, ((hz) uzVar.G.getValue()).a, ((hz) uzVar.H.getValue()).a, ((hz) uzVar.I.getValue()).a, ((hz) uzVar.J.getValue()).a, ((hz) uzVar.K.getValue()).a, ((hz) uzVar.L.getValue()).a, ((hz) uzVar.M.getValue()).a, ((hz) uzVar.N.getValue()).a, ((hz) uzVar.O.getValue()).a, ((hz) uzVar.P.getValue()).a, ((hz) uzVar.Q.getValue()).a, ((hz) uzVar.R.getValue()).a, ((hz) uzVar.S.getValue()).a, ((hz) uzVar.T.getValue()).a, ((hz) uzVar.U.getValue()).a, ((hz) uzVar.V.getValue()).a, ((hz) uzVar.W.getValue()).a, ((hz) uzVar.X.getValue()).a, ((hz) uzVar.Y.getValue()).a, ((hz) uzVar.Z.getValue()).a, ((hz) uzVar.a0.getValue()).a);
                ov0Var.m0(objQ);
            } else {
                w52Var = w52Var7;
                w52Var2 = w52Var8;
            }
            uz uzVar2 = (uz) objQ;
            hh0 hh0Var = vz.a;
            uzVar2.getClass();
            w52 w52Var24 = uzVar2.F;
            hz hzVar = (hz) w52Var23.getValue();
            long j = hzVar.a;
            uzVar2.a.setValue(hzVar);
            hz hzVar2 = (hz) w52Var22.getValue();
            long j2 = hzVar2.a;
            uzVar2.b.setValue(hzVar2);
            hz hzVar3 = (hz) w52Var21.getValue();
            long j3 = hzVar3.a;
            uzVar2.c.setValue(hzVar3);
            hz hzVar4 = (hz) w52Var20.getValue();
            long j4 = hzVar4.a;
            uzVar2.d.setValue(hzVar4);
            hz hzVar5 = (hz) w52Var19.getValue();
            long j5 = hzVar5.a;
            uzVar2.e.setValue(hzVar5);
            hz hzVar6 = (hz) w52Var18.getValue();
            long j6 = hzVar6.a;
            uzVar2.f.setValue(hzVar6);
            hz hzVar7 = (hz) w52Var17.getValue();
            long j7 = hzVar7.a;
            uzVar2.g.setValue(hzVar7);
            hz hzVar8 = (hz) w52Var16.getValue();
            long j8 = hzVar8.a;
            uzVar2.h.setValue(hzVar8);
            hz hzVar9 = (hz) w52Var15.getValue();
            long j9 = hzVar9.a;
            uzVar2.i.setValue(hzVar9);
            hz hzVar10 = (hz) w52Var14.getValue();
            long j10 = hzVar10.a;
            uzVar2.j.setValue(hzVar10);
            hz hzVar11 = (hz) w52Var13.getValue();
            long j11 = hzVar11.a;
            uzVar2.k.setValue(hzVar11);
            hz hzVar12 = (hz) w52Var12.getValue();
            long j12 = hzVar12.a;
            uzVar2.l.setValue(hzVar12);
            hz hzVar13 = (hz) w52Var11.getValue();
            long j13 = hzVar13.a;
            uzVar2.m.setValue(hzVar13);
            hz hzVar14 = (hz) w52Var10.getValue();
            long j14 = hzVar14.a;
            uzVar2.n.setValue(hzVar14);
            hz hzVar15 = (hz) w52Var9.getValue();
            long j15 = hzVar15.a;
            uzVar2.o.setValue(hzVar15);
            hz hzVar16 = (hz) w52Var2.getValue();
            long j16 = hzVar16.a;
            uzVar2.p.setValue(hzVar16);
            hz hzVar17 = (hz) w52Var.getValue();
            long j17 = hzVar17.a;
            uzVar2.q.setValue(hzVar17);
            hz hzVar18 = (hz) w52Var6.getValue();
            long j18 = hzVar18.a;
            uzVar2.r.setValue(hzVar18);
            hz hzVar19 = (hz) w52Var5.getValue();
            long j19 = hzVar19.a;
            uzVar2.s.setValue(hzVar19);
            hz hzVar20 = (hz) w52Var4.getValue();
            long j20 = hzVar20.a;
            uzVar2.t.setValue(hzVar20);
            hz hzVar21 = (hz) w52Var3.getValue();
            long j21 = hzVar21.a;
            uzVar2.u.setValue(hzVar21);
            hz hzVar22 = (hz) uzVar.v.getValue();
            long j22 = hzVar22.a;
            uzVar2.v.setValue(hzVar22);
            hz hzVar23 = (hz) uzVar.w.getValue();
            long j23 = hzVar23.a;
            uzVar2.w.setValue(hzVar23);
            hz hzVar24 = (hz) uzVar.x.getValue();
            long j24 = hzVar24.a;
            uzVar2.x.setValue(hzVar24);
            hz hzVar25 = (hz) uzVar.y.getValue();
            long j25 = hzVar25.a;
            uzVar2.y.setValue(hzVar25);
            hz hzVar26 = (hz) uzVar.z.getValue();
            long j26 = hzVar26.a;
            uzVar2.z.setValue(hzVar26);
            hz hzVar27 = (hz) uzVar.A.getValue();
            long j27 = hzVar27.a;
            uzVar2.A.setValue(hzVar27);
            hz hzVar28 = (hz) uzVar.B.getValue();
            long j28 = hzVar28.a;
            uzVar2.B.setValue(hzVar28);
            hz hzVar29 = (hz) uzVar.C.getValue();
            long j29 = hzVar29.a;
            uzVar2.C.setValue(hzVar29);
            hz hzVar30 = (hz) uzVar.D.getValue();
            long j30 = hzVar30.a;
            uzVar2.D.setValue(hzVar30);
            hz hzVar31 = (hz) uzVar.E.getValue();
            long j31 = hzVar31.a;
            uzVar2.E.setValue(hzVar31);
            hz hzVar32 = (hz) uzVar.F.getValue();
            long j32 = hzVar32.a;
            w52Var24.setValue(hzVar32);
            hz hzVar33 = (hz) uzVar.G.getValue();
            long j33 = hzVar33.a;
            uzVar2.G.setValue(hzVar33);
            hz hzVar34 = (hz) uzVar.H.getValue();
            long j34 = hzVar34.a;
            uzVar2.H.setValue(hzVar34);
            hz hzVar35 = (hz) uzVar.I.getValue();
            long j35 = hzVar35.a;
            uzVar2.I.setValue(hzVar35);
            hz hzVar36 = (hz) uzVar.J.getValue();
            long j36 = hzVar36.a;
            uzVar2.J.setValue(hzVar36);
            hz hzVar37 = (hz) uzVar.K.getValue();
            long j37 = hzVar37.a;
            uzVar2.K.setValue(hzVar37);
            hz hzVar38 = (hz) uzVar.L.getValue();
            long j38 = hzVar38.a;
            uzVar2.L.setValue(hzVar38);
            hz hzVar39 = (hz) uzVar.M.getValue();
            long j39 = hzVar39.a;
            uzVar2.M.setValue(hzVar39);
            hz hzVar40 = (hz) uzVar.N.getValue();
            long j40 = hzVar40.a;
            uzVar2.N.setValue(hzVar40);
            hz hzVar41 = (hz) uzVar.O.getValue();
            long j41 = hzVar41.a;
            uzVar2.O.setValue(hzVar41);
            hz hzVar42 = (hz) uzVar.P.getValue();
            long j42 = hzVar42.a;
            uzVar2.P.setValue(hzVar42);
            hz hzVar43 = (hz) uzVar.Q.getValue();
            long j43 = hzVar43.a;
            uzVar2.Q.setValue(hzVar43);
            hz hzVar44 = (hz) uzVar.R.getValue();
            long j44 = hzVar44.a;
            uzVar2.R.setValue(hzVar44);
            hz hzVar45 = (hz) uzVar.S.getValue();
            long j45 = hzVar45.a;
            uzVar2.S.setValue(hzVar45);
            hz hzVar46 = (hz) uzVar.T.getValue();
            long j46 = hzVar46.a;
            uzVar2.T.setValue(hzVar46);
            hz hzVar47 = (hz) uzVar.U.getValue();
            long j47 = hzVar47.a;
            uzVar2.U.setValue(hzVar47);
            hz hzVar48 = (hz) uzVar.V.getValue();
            long j48 = hzVar48.a;
            uzVar2.V.setValue(hzVar48);
            hz hzVar49 = (hz) uzVar.W.getValue();
            long j49 = hzVar49.a;
            uzVar2.W.setValue(hzVar49);
            hz hzVar50 = (hz) uzVar.X.getValue();
            long j50 = hzVar50.a;
            uzVar2.X.setValue(hzVar50);
            hz hzVar51 = (hz) uzVar.Y.getValue();
            long j51 = hzVar51.a;
            uzVar2.Y.setValue(hzVar51);
            hz hzVar52 = (hz) uzVar.Z.getValue();
            long j52 = hzVar52.a;
            uzVar2.Z.setValue(hzVar52);
            hz hzVar53 = (hz) uzVar.a0.getValue();
            long j53 = hzVar53.a;
            uzVar2.a0.setValue(hzVar53);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                q93 q93Var = (q93) s93Var2.a.getValue();
                q93 q93Var2 = (q93) s93Var2.b.getValue();
                q93 q93Var3 = (q93) s93Var2.c.getValue();
                q93 q93Var4 = (q93) s93Var2.d.getValue();
                q93 q93Var5 = (q93) s93Var2.e.getValue();
                q93 q93Var6 = (q93) s93Var2.f.getValue();
                q93 q93Var7 = (q93) s93Var2.g.getValue();
                q93 q93Var8 = (q93) s93Var2.h.getValue();
                q93 q93Var9 = (q93) s93Var2.i.getValue();
                q93 q93Var10 = (q93) s93Var2.j.getValue();
                q93 q93Var11 = (q93) s93Var2.k.getValue();
                q93 q93Var12 = (q93) s93Var2.l.getValue();
                q93 q93Var13 = (q93) s93Var2.m.getValue();
                q93 q93Var14 = (q93) s93Var2.n.getValue();
                q93Var.getClass();
                q93Var2.getClass();
                q93Var3.getClass();
                q93Var4.getClass();
                q93Var5.getClass();
                q93Var6.getClass();
                q93Var7.getClass();
                q93Var8.getClass();
                q93Var9.getClass();
                q93Var10.getClass();
                q93Var11.getClass();
                q93Var12.getClass();
                q93Var13.getClass();
                q93Var14.getClass();
                s93 s93Var3 = new s93(q93Var, q93Var2, q93Var3, q93Var4, q93Var5, q93Var6, q93Var7, q93Var8, q93Var9, q93Var10, q93Var11, q93Var12, q93Var13, q93Var14);
                ov0Var.m0(s93Var3);
                objQ2 = s93Var3;
            }
            s93 s93Var4 = (s93) objQ2;
            hh0 hh0Var2 = t93.a;
            s93Var4.getClass();
            s93Var2.getClass();
            q93 q93Var15 = (q93) s93Var2.a.getValue();
            q93Var15.getClass();
            s93Var4.a.setValue(q93Var15);
            q93 q93Var16 = (q93) s93Var2.b.getValue();
            q93Var16.getClass();
            s93Var4.b.setValue(q93Var16);
            q93 q93Var17 = (q93) s93Var2.c.getValue();
            q93Var17.getClass();
            s93Var4.c.setValue(q93Var17);
            q93 q93Var18 = (q93) s93Var2.d.getValue();
            q93Var18.getClass();
            s93Var4.d.setValue(q93Var18);
            q93 q93Var19 = (q93) s93Var2.e.getValue();
            q93Var19.getClass();
            s93Var4.e.setValue(q93Var19);
            q93 q93Var20 = (q93) s93Var2.f.getValue();
            q93Var20.getClass();
            s93Var4.f.setValue(q93Var20);
            q93 q93Var21 = (q93) s93Var2.g.getValue();
            q93Var21.getClass();
            s93Var4.g.setValue(q93Var21);
            q93 q93Var22 = (q93) s93Var2.h.getValue();
            q93Var22.getClass();
            s93Var4.h.setValue(q93Var22);
            q93 q93Var23 = (q93) s93Var2.i.getValue();
            q93Var23.getClass();
            s93Var4.i.setValue(q93Var23);
            q93 q93Var24 = (q93) s93Var2.j.getValue();
            q93Var24.getClass();
            s93Var4.j.setValue(q93Var24);
            q93 q93Var25 = (q93) s93Var2.k.getValue();
            q93Var25.getClass();
            s93Var4.k.setValue(q93Var25);
            q93 q93Var26 = (q93) s93Var2.l.getValue();
            q93Var26.getClass();
            s93Var4.l.setValue(q93Var26);
            q93 q93Var27 = (q93) s93Var2.m.getValue();
            q93Var27.getClass();
            s93Var4.m.setValue(q93Var27);
            q93 q93Var28 = (q93) s93Var2.n.getValue();
            q93Var28.getClass();
            s93Var4.n.setValue(q93Var28);
            boolean zE = ov0Var.e(((hz) w52Var24.getValue()).a);
            Object objQ3 = ov0Var.Q();
            if (zE || objQ3 == c30Var) {
                objQ3 = new gu1(((hz) w52Var24.getValue()).a);
                ov0Var.m0(objQ3);
            }
            k22.c(new kk[]{vz.a.a(uzVar2), t93.a.a(s93Var4), m11.a.a((gu1) objQ3), r42.a.a(qu1.a)}, sb.a0(-1273259580, new c9(p10Var, 4), ov0Var), ov0Var, 48);
        } else {
            ov0Var.W();
            s93Var2 = s93Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new f5(uzVar, s93Var2, p10Var, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:105:0x0155  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0166  */
    /* JADX WARN: Code duplicated, block: B:109:0x0169  */
    /* JADX WARN: Code duplicated, block: B:113:0x0174  */
    /* JADX WARN: Code duplicated, block: B:114:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x017f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188  */
    /* JADX WARN: Code duplicated, block: B:123:0x0190  */
    /* JADX WARN: Code duplicated, block: B:124:0x0195  */
    /* JADX WARN: Code duplicated, block: B:127:0x019e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01de  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:165:0x020a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0213  */
    /* JADX WARN: Code duplicated, block: B:171:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x0234  */
    /* JADX WARN: Code duplicated, block: B:180:0x023e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0245  */
    /* JADX WARN: Code duplicated, block: B:186:0x0270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0272  */
    /* JADX WARN: Code duplicated, block: B:189:0x0277  */
    /* JADX WARN: Code duplicated, block: B:192:0x027d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0286  */
    /* JADX WARN: Code duplicated, block: B:196:0x028a  */
    /* JADX WARN: Code duplicated, block: B:198:0x028d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0290  */
    /* JADX WARN: Code duplicated, block: B:201:0x0292  */
    /* JADX WARN: Code duplicated, block: B:203:0x0296  */
    /* JADX WARN: Code duplicated, block: B:204:0x0298  */
    /* JADX WARN: Code duplicated, block: B:207:0x029d  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:213:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:215:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:225:0x02c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:234:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:239:0x0308  */
    /* JADX WARN: Code duplicated, block: B:242:0x0330  */
    /* JADX WARN: Code duplicated, block: B:246:0x034f  */
    /* JADX WARN: Code duplicated, block: B:248:0x035f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0364  */
    /* JADX WARN: Code duplicated, block: B:251:0x0367 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0369  */
    /* JADX WARN: Code duplicated, block: B:253:0x036c  */
    /* JADX WARN: Code duplicated, block: B:256:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:259:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:0x011a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    public static final void i(final String str, final lu0 lu0Var, dv1 dv1Var, boolean z, q93 q93Var, pu0 pu0Var, pu0 pu0Var2, pu0 pu0Var3, pu0 pu0Var4, pu0 pu0Var5, boolean z2, ak3 ak3Var, n91 n91Var, m91 m91Var, boolean z3, int i, int i2, au2 au2Var, t63 t63Var, f30 f30Var, final int i3, final int i4, final int i5) {
        dv1 dv1Var2;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        q93 q93Var2;
        int i10;
        pu0 pu0Var6;
        int i11;
        int i12;
        pu0 pu0Var7;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        char c2;
        int i35;
        int i36;
        boolean z5;
        final pu0 pu0Var8;
        final pu0 pu0Var9;
        final boolean z6;
        ak3 ak3Var2;
        final n91 n91Var2;
        final boolean z7;
        final int i37;
        final int i38;
        final au2 au2Var2;
        t63 t63Var2;
        final boolean z8;
        final q93 q93Var3;
        final pu0 pu0Var10;
        final pu0 pu0Var11;
        final pu0 pu0Var12;
        final m91 m91Var2;
        ee2 ee2VarT;
        q93 q93Var4;
        pu0 pu0Var13;
        pu0 pu0Var14;
        pu0 pu0Var15;
        boolean z9;
        ak3 ak3Var3;
        n91 n91Var3;
        m91 m91Var3;
        boolean z10;
        int i39;
        int i40;
        au2 au2VarA;
        q93 q93Var5;
        boolean z11;
        dv1 dv1Var3;
        boolean z12;
        pu0 pu0Var16;
        q93 q93Var6;
        pu0 pu0Var17;
        pu0 pu0Var18;
        au2 au2Var3;
        pu0 pu0Var19;
        pu0 pu0Var20;
        t63 t63VarJ;
        n91 n91Var4;
        Object objQ;
        ix1 ix1Var;
        boolean z13;
        long jB;
        boolean zBooleanValue;
        int i41;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1901501544);
        int i42 = (ov0Var.f(str) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i42 |= ov0Var.h(lu0Var) ? 32 : 16;
        }
        int i43 = i5 & 4;
        if (i43 == 0) {
            if ((i3 & 384) == 0) {
                dv1Var2 = dv1Var;
                i42 |= ov0Var.f(dv1Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
            }
            i6 = i5 & 8;
            if (i6 != 0) {
                i8 = i42 | 3072;
                z4 = z;
            } else {
                z4 = z;
                if (ov0Var.g(z4)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i8 = i42 | i7;
            }
            i9 = i8 | 24576;
            if ((i3 & 196608) == 0) {
                q93Var2 = q93Var;
                if ((i5 & 32) == 0 || !ov0Var.f(q93Var2)) {
                    i41 = 65536;
                } else {
                    i41 = 131072;
                }
                i9 |= i41;
            } else {
                q93Var2 = q93Var;
            }
            i10 = i5 & 64;
            if (i10 != 0) {
                i9 |= 1572864;
                pu0Var6 = pu0Var;
            } else {
                pu0Var6 = pu0Var;
                if ((i3 & 1572864) == 0) {
                    if (ov0Var.h(pu0Var6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i9 |= i11;
                }
            }
            i12 = i5 & WorkQueueKt.BUFFER_CAPACITY;
            if (i12 != 0) {
                i9 |= 12582912;
                pu0Var7 = pu0Var2;
            } else {
                pu0Var7 = pu0Var2;
                if ((i3 & 12582912) == 0) {
                    if (ov0Var.h(pu0Var7)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i9 |= i13;
                }
            }
            i14 = i5 & 256;
            i15 = 33554432;
            if (i14 != 0) {
                i9 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (ov0Var.h(pu0Var3)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i9 |= i16;
            }
            i17 = i5 & 512;
            if (i17 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (ov0Var.h(pu0Var4)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i9 |= i18;
                }
                i19 = i4 | 54;
                i20 = i5 & 4096;
                if (i20 != 0) {
                    i21 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ov0Var.h(pu0Var5)) {
                            i22 = 256;
                        } else {
                            i22 = WorkQueueKt.BUFFER_CAPACITY;
                        }
                        i19 |= i22;
                    }
                    i21 = i19;
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                    i25 = i21 | 3072;
                } else {
                    int i44 = i21;
                    if (ov0Var.g(z2)) {
                        i24 = 2048;
                    } else {
                        i24 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i25 = i44 | i24;
                }
                i26 = i5 & 16384;
                if (i26 != 0) {
                    i28 = i25 | 24576;
                } else {
                    int i45 = i25;
                    if (ov0Var.f(ak3Var)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i28 = i45 | i27;
                }
                i29 = i5 & 32768;
                if (i29 != 0) {
                    i28 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (ov0Var.f(n91Var)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i28 |= i30;
                }
                i31 = i5 & 65536;
                if (i31 != 0) {
                    i32 = i28 | 1572864;
                } else {
                    i32 = i28 | (ov0Var.f(m91Var) ? 1048576 : 524288);
                }
                i33 = i5 & 131072;
                if (i33 != 0) {
                    i32 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i32 |= ov0Var.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) != 0) {
                    if ((i5 & 262144) == 0 && ov0Var.d(i)) {
                        i15 = 67108864;
                    }
                    i32 |= i15;
                }
                i34 = i5 & 524288;
                if (i34 != 0) {
                    i32 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i32 |= ov0Var.d(i2) ? 536870912 : 268435456;
                }
                if ((i5 & 2097152) == 0 || !ov0Var.f(au2Var)) {
                    c2 = 16;
                } else {
                    c2 = ' ';
                }
                int i46 = 6 | c2;
                if ((i5 & 4194304) == 0 || !ov0Var.f(t63Var)) {
                    i35 = WorkQueueKt.BUFFER_CAPACITY;
                } else {
                    i35 = 256;
                }
                int i47 = i46 | i35;
                i36 = i9;
                if ((i9 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && (i47 & 147) == 146) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (ov0Var.T(i36 & 1, z5)) {
                    ov0Var.Y();
                    if ((i3 & 1) != 0 || ov0Var.B()) {
                        if (i43 != 0) {
                            dv1Var2 = av1.a;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i5 & 32) != 0) {
                            q93Var4 = (q93) ov0Var.j(s83.a);
                        } else {
                            q93Var4 = q93Var2;
                        }
                        if (i10 != 0) {
                            pu0Var6 = null;
                        }
                        if (i12 != 0) {
                            pu0Var7 = null;
                        }
                        if (i14 != 0) {
                            pu0Var13 = null;
                        } else {
                            pu0Var13 = pu0Var3;
                        }
                        if (i17 != 0) {
                            pu0Var14 = null;
                        } else {
                            pu0Var14 = pu0Var4;
                        }
                        pu0Var15 = i20 == 0 ? pu0Var5 : null;
                        if (i23 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i26 != 0) {
                            ak3Var3 = u92.w;
                        } else {
                            ak3Var3 = ak3Var;
                        }
                        if (i29 != 0) {
                            n91Var3 = n91.c;
                        } else {
                            n91Var3 = n91Var;
                        }
                        if (i31 != 0) {
                            m91Var3 = m91.d;
                        } else {
                            m91Var3 = m91Var;
                        }
                        if (i33 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 262144) == 0) {
                            i39 = i;
                        } else if (z10) {
                            i39 = 1;
                        } else {
                            i39 = Integer.MAX_VALUE;
                        }
                        i40 = i34 == 0 ? i2 : 1;
                        if ((i5 & 2097152) != 0) {
                            au2VarA = hu2.a(ym3.z, ov0Var);
                        } else {
                            au2VarA = au2Var;
                        }
                        q93Var5 = q93Var4;
                        if ((i5 & 4194304) != 0) {
                            dv1 dv1Var4 = dv1Var2;
                            z11 = z4;
                            dv1Var3 = dv1Var4;
                            pu0 pu0Var21 = pu0Var6;
                            z12 = z9;
                            pu0Var16 = pu0Var21;
                            pu0Var17 = pu0Var15;
                            pu0Var18 = pu0Var13;
                            au2Var3 = au2VarA;
                            pu0Var19 = pu0Var14;
                            ak3Var2 = ak3Var3;
                            pu0Var20 = pu0Var7;
                            t63VarJ = j9.j(6, ov0Var);
                            n91Var4 = n91Var3;
                            q93Var6 = q93Var5;
                        } else {
                            dv1 dv1Var5 = dv1Var2;
                            z11 = z4;
                            dv1Var3 = dv1Var5;
                            pu0 pu0Var22 = pu0Var6;
                            z12 = z9;
                            pu0Var16 = pu0Var22;
                            q93Var6 = q93Var5;
                            pu0Var17 = pu0Var15;
                            pu0Var18 = pu0Var13;
                            au2Var3 = au2VarA;
                            pu0Var19 = pu0Var14;
                            ak3Var2 = ak3Var3;
                            pu0Var20 = pu0Var7;
                            t63VarJ = t63Var;
                            n91Var4 = n91Var3;
                        }
                    } else {
                        ov0Var.W();
                        dv1 dv1Var6 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var6;
                        pu0Var18 = pu0Var3;
                        pu0Var19 = pu0Var4;
                        pu0Var17 = pu0Var5;
                        ak3Var2 = ak3Var;
                        m91Var3 = m91Var;
                        z10 = z3;
                        i39 = i;
                        i40 = i2;
                        au2Var3 = au2Var;
                        t63VarJ = t63Var;
                        q93Var6 = q93Var2;
                        pu0Var16 = pu0Var6;
                        pu0Var20 = pu0Var7;
                        z12 = z2;
                        n91Var4 = n91Var;
                    }
                    ov0Var.q();
                    ov0Var.c0(1310051731);
                    objQ = ov0Var.Q();
                    if (objQ == d30.a) {
                        objQ = new ix1();
                        ov0Var.m0(objQ);
                    }
                    ix1Var = (ix1) objQ;
                    z13 = false;
                    ov0Var.p(false);
                    ov0Var.c0(1981927842);
                    jB = q93Var6.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var, 0).getValue()).booleanValue();
                        if (!z11) {
                            jB = t63VarJ.c;
                        } else if (z12) {
                            jB = t63VarJ.d;
                        } else if (zBooleanValue) {
                            jB = t63VarJ.a;
                        } else {
                            jB = t63VarJ.b;
                        }
                        z13 = false;
                    }
                    ov0Var.p(z13);
                    int i48 = i40;
                    k22.b(j93.a.a(t63VarJ.k), sb.a0(1874034984, new i42(dv1Var3, pu0Var16, z12, t63VarJ, str, lu0Var, z11, q93Var6.d(new q93(jB, 0L, null, 0L, 0L, 0, 0L, 16777214)), n91Var4, m91Var3, z10, i39, i48, ak3Var2, ix1Var, pu0Var20, pu0Var18, pu0Var19, pu0Var17, au2Var3), ov0Var), ov0Var, 56);
                    q93Var3 = q93Var6;
                    z6 = z12;
                    t63Var2 = t63VarJ;
                    z8 = z11;
                    n91Var2 = n91Var4;
                    m91Var2 = m91Var3;
                    z7 = z10;
                    i37 = i39;
                    i38 = i48;
                    pu0Var12 = pu0Var18;
                    pu0Var8 = pu0Var19;
                    pu0Var9 = pu0Var17;
                    au2Var2 = au2Var3;
                    dv1Var2 = dv1Var3;
                    pu0Var10 = pu0Var16;
                    pu0Var11 = pu0Var20;
                } else {
                    ov0Var.W();
                    pu0Var8 = pu0Var4;
                    pu0Var9 = pu0Var5;
                    z6 = z2;
                    ak3Var2 = ak3Var;
                    n91Var2 = n91Var;
                    z7 = z3;
                    i37 = i;
                    i38 = i2;
                    au2Var2 = au2Var;
                    t63Var2 = t63Var;
                    z8 = z4;
                    q93Var3 = q93Var2;
                    pu0Var10 = pu0Var6;
                    pu0Var11 = pu0Var7;
                    pu0Var12 = pu0Var3;
                    m91Var2 = m91Var;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    final dv1 dv1Var7 = dv1Var2;
                    final ak3 ak3Var4 = ak3Var2;
                    final t63 t63Var3 = t63Var2;
                    ee2VarT.d = new pu0() { // from class: e42
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM0 = wc0.m0(i3 | 1);
                            int iM1 = wc0.m0(i4);
                            ee0.i(str, lu0Var, dv1Var7, z8, q93Var3, pu0Var10, pu0Var11, pu0Var12, pu0Var8, pu0Var9, z6, ak3Var4, n91Var2, m91Var2, z7, i37, i38, au2Var2, t63Var3, (f30) obj, iM0, iM1, i5);
                            return mf3.a;
                        }
                    };
                }
            }
            i9 |= 805306368;
            i19 = i4 | 54;
            i20 = i5 & 4096;
            if (i20 != 0) {
                i21 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (ov0Var.h(pu0Var5)) {
                        i22 = 256;
                    } else {
                        i22 = WorkQueueKt.BUFFER_CAPACITY;
                    }
                    i19 |= i22;
                }
                i21 = i19;
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
                i25 = i21 | 3072;
            } else {
                int i49 = i21;
                if (ov0Var.g(z2)) {
                    i24 = 2048;
                } else {
                    i24 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i25 = i49 | i24;
            }
            i26 = i5 & 16384;
            if (i26 != 0) {
                i28 = i25 | 24576;
            } else {
                int i410 = i25;
                if (ov0Var.f(ak3Var)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i28 = i410 | i27;
            }
            i29 = i5 & 32768;
            if (i29 != 0) {
                i28 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (ov0Var.f(n91Var)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i5 & 65536;
            if (i31 != 0) {
                i32 = i28 | 1572864;
            } else {
                i32 = i28 | (ov0Var.f(m91Var) ? 1048576 : 524288);
            }
            i33 = i5 & 131072;
            if (i33 != 0) {
                i32 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i32 |= ov0Var.g(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) != 0) {
                if ((i5 & 262144) == 0) {
                    i15 = 67108864;
                }
                i32 |= i15;
            }
            i34 = i5 & 524288;
            if (i34 != 0) {
                i32 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i32 |= ov0Var.d(i2) ? 536870912 : 268435456;
            }
            if ((i5 & 2097152) == 0) {
                c2 = 16;
            } else {
                c2 = 16;
            }
            int i411 = 6 | c2;
            if ((i5 & 4194304) == 0) {
                i35 = WorkQueueKt.BUFFER_CAPACITY;
            } else {
                i35 = WorkQueueKt.BUFFER_CAPACITY;
            }
            int i412 = i411 | i35;
            i36 = i9;
            if ((i9 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (ov0Var.T(i36 & 1, z5)) {
                ov0Var.Y();
                if ((i3 & 1) != 0) {
                    if (i43 != 0) {
                        dv1Var2 = av1.a;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        q93Var4 = (q93) ov0Var.j(s83.a);
                    } else {
                        q93Var4 = q93Var2;
                    }
                    if (i10 != 0) {
                        pu0Var6 = null;
                    }
                    if (i12 != 0) {
                        pu0Var7 = null;
                    }
                    if (i14 != 0) {
                        pu0Var13 = null;
                    } else {
                        pu0Var13 = pu0Var3;
                    }
                    if (i17 != 0) {
                        pu0Var14 = null;
                    } else {
                        pu0Var14 = pu0Var4;
                    }
                    if (i20 == 0) {
                    }
                    if (i23 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i26 != 0) {
                        ak3Var3 = u92.w;
                    } else {
                        ak3Var3 = ak3Var;
                    }
                    if (i29 != 0) {
                        n91Var3 = n91.c;
                    } else {
                        n91Var3 = n91Var;
                    }
                    if (i31 != 0) {
                        m91Var3 = m91.d;
                    } else {
                        m91Var3 = m91Var;
                    }
                    if (i33 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i39 = i;
                    } else if (z10) {
                        i39 = 1;
                    } else {
                        i39 = Integer.MAX_VALUE;
                    }
                    if (i34 == 0) {
                    }
                    if ((i5 & 2097152) != 0) {
                        au2VarA = hu2.a(ym3.z, ov0Var);
                    } else {
                        au2VarA = au2Var;
                    }
                    q93Var5 = q93Var4;
                    if ((i5 & 4194304) != 0) {
                        dv1 dv1Var8 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var8;
                        pu0 pu0Var23 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var23;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = j9.j(6, ov0Var);
                        n91Var4 = n91Var3;
                        q93Var6 = q93Var5;
                    } else {
                        dv1 dv1Var9 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var9;
                        pu0 pu0Var24 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var24;
                        q93Var6 = q93Var5;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = t63Var;
                        n91Var4 = n91Var3;
                    }
                } else {
                    if (i43 != 0) {
                        dv1Var2 = av1.a;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        q93Var4 = (q93) ov0Var.j(s83.a);
                    } else {
                        q93Var4 = q93Var2;
                    }
                    if (i10 != 0) {
                        pu0Var6 = null;
                    }
                    if (i12 != 0) {
                        pu0Var7 = null;
                    }
                    if (i14 != 0) {
                        pu0Var13 = null;
                    } else {
                        pu0Var13 = pu0Var3;
                    }
                    if (i17 != 0) {
                        pu0Var14 = null;
                    } else {
                        pu0Var14 = pu0Var4;
                    }
                    if (i20 == 0) {
                    }
                    if (i23 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i26 != 0) {
                        ak3Var3 = u92.w;
                    } else {
                        ak3Var3 = ak3Var;
                    }
                    if (i29 != 0) {
                        n91Var3 = n91.c;
                    } else {
                        n91Var3 = n91Var;
                    }
                    if (i31 != 0) {
                        m91Var3 = m91.d;
                    } else {
                        m91Var3 = m91Var;
                    }
                    if (i33 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i39 = i;
                    } else if (z10) {
                        i39 = 1;
                    } else {
                        i39 = Integer.MAX_VALUE;
                    }
                    if (i34 == 0) {
                    }
                    if ((i5 & 2097152) != 0) {
                        au2VarA = hu2.a(ym3.z, ov0Var);
                    } else {
                        au2VarA = au2Var;
                    }
                    q93Var5 = q93Var4;
                    if ((i5 & 4194304) != 0) {
                        dv1 dv1Var10 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var10;
                        pu0 pu0Var25 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var25;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = j9.j(6, ov0Var);
                        n91Var4 = n91Var3;
                        q93Var6 = q93Var5;
                    } else {
                        dv1 dv1Var11 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var11;
                        pu0 pu0Var26 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var26;
                        q93Var6 = q93Var5;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = t63Var;
                        n91Var4 = n91Var3;
                    }
                }
                ov0Var.q();
                ov0Var.c0(1310051731);
                objQ = ov0Var.Q();
                if (objQ == d30.a) {
                    objQ = new ix1();
                    ov0Var.m0(objQ);
                }
                ix1Var = (ix1) objQ;
                z13 = false;
                ov0Var.p(false);
                ov0Var.c0(1981927842);
                jB = q93Var6.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var, 0).getValue()).booleanValue();
                    if (!z11) {
                        jB = t63VarJ.c;
                    } else if (z12) {
                        jB = t63VarJ.d;
                    } else if (zBooleanValue) {
                        jB = t63VarJ.a;
                    } else {
                        jB = t63VarJ.b;
                    }
                    z13 = false;
                }
                ov0Var.p(z13);
                int i413 = i40;
                k22.b(j93.a.a(t63VarJ.k), sb.a0(1874034984, new i42(dv1Var3, pu0Var16, z12, t63VarJ, str, lu0Var, z11, q93Var6.d(new q93(jB, 0L, null, 0L, 0L, 0, 0L, 16777214)), n91Var4, m91Var3, z10, i39, i413, ak3Var2, ix1Var, pu0Var20, pu0Var18, pu0Var19, pu0Var17, au2Var3), ov0Var), ov0Var, 56);
                q93Var3 = q93Var6;
                z6 = z12;
                t63Var2 = t63VarJ;
                z8 = z11;
                n91Var2 = n91Var4;
                m91Var2 = m91Var3;
                z7 = z10;
                i37 = i39;
                i38 = i413;
                pu0Var12 = pu0Var18;
                pu0Var8 = pu0Var19;
                pu0Var9 = pu0Var17;
                au2Var2 = au2Var3;
                dv1Var2 = dv1Var3;
                pu0Var10 = pu0Var16;
                pu0Var11 = pu0Var20;
            } else {
                ov0Var.W();
                pu0Var8 = pu0Var4;
                pu0Var9 = pu0Var5;
                z6 = z2;
                ak3Var2 = ak3Var;
                n91Var2 = n91Var;
                z7 = z3;
                i37 = i;
                i38 = i2;
                au2Var2 = au2Var;
                t63Var2 = t63Var;
                z8 = z4;
                q93Var3 = q93Var2;
                pu0Var10 = pu0Var6;
                pu0Var11 = pu0Var7;
                pu0Var12 = pu0Var3;
                m91Var2 = m91Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                final dv1 dv1Var12 = dv1Var2;
                final ak3 ak3Var5 = ak3Var2;
                final t63 t63Var4 = t63Var2;
                ee2VarT.d = new pu0() { // from class: e42
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(i3 | 1);
                        int iM1 = wc0.m0(i4);
                        ee0.i(str, lu0Var, dv1Var12, z8, q93Var3, pu0Var10, pu0Var11, pu0Var12, pu0Var8, pu0Var9, z6, ak3Var5, n91Var2, m91Var2, z7, i37, i38, au2Var2, t63Var4, (f30) obj, iM0, iM1, i5);
                        return mf3.a;
                    }
                };
            }
        }
        i42 |= 384;
        dv1Var2 = dv1Var;
        i6 = i5 & 8;
        if (i6 != 0) {
            i8 = i42 | 3072;
            z4 = z;
        } else {
            z4 = z;
            if (ov0Var.g(z4)) {
                i7 = 2048;
            } else {
                i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i8 = i42 | i7;
        }
        i9 = i8 | 24576;
        if ((i3 & 196608) == 0) {
            q93Var2 = q93Var;
            if ((i5 & 32) == 0) {
                i41 = 65536;
            } else {
                i41 = 65536;
            }
            i9 |= i41;
        } else {
            q93Var2 = q93Var;
        }
        i10 = i5 & 64;
        if (i10 != 0) {
            i9 |= 1572864;
            pu0Var6 = pu0Var;
        } else {
            pu0Var6 = pu0Var;
            if ((i3 & 1572864) == 0) {
                if (ov0Var.h(pu0Var6)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i9 |= i11;
            }
        }
        i12 = i5 & WorkQueueKt.BUFFER_CAPACITY;
        if (i12 != 0) {
            i9 |= 12582912;
            pu0Var7 = pu0Var2;
        } else {
            pu0Var7 = pu0Var2;
            if ((i3 & 12582912) == 0) {
                if (ov0Var.h(pu0Var7)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i9 |= i13;
            }
        }
        i14 = i5 & 256;
        i15 = 33554432;
        if (i14 != 0) {
            i9 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (ov0Var.h(pu0Var3)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i9 |= i16;
        }
        i17 = i5 & 512;
        if (i17 != 0) {
            if ((i3 & 805306368) == 0) {
                if (ov0Var.h(pu0Var4)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i9 |= i18;
            }
            i19 = i4 | 54;
            i20 = i5 & 4096;
            if (i20 != 0) {
                i21 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (ov0Var.h(pu0Var5)) {
                        i22 = 256;
                    } else {
                        i22 = WorkQueueKt.BUFFER_CAPACITY;
                    }
                    i19 |= i22;
                }
                i21 = i19;
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
                i25 = i21 | 3072;
            } else {
                int i414 = i21;
                if (ov0Var.g(z2)) {
                    i24 = 2048;
                } else {
                    i24 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i25 = i414 | i24;
            }
            i26 = i5 & 16384;
            if (i26 != 0) {
                i28 = i25 | 24576;
            } else {
                int i415 = i25;
                if (ov0Var.f(ak3Var)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i28 = i415 | i27;
            }
            i29 = i5 & 32768;
            if (i29 != 0) {
                i28 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (ov0Var.f(n91Var)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i28 |= i30;
            }
            i31 = i5 & 65536;
            if (i31 != 0) {
                i32 = i28 | 1572864;
            } else {
                i32 = i28 | (ov0Var.f(m91Var) ? 1048576 : 524288);
            }
            i33 = i5 & 131072;
            if (i33 != 0) {
                i32 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i32 |= ov0Var.g(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) != 0) {
                if ((i5 & 262144) == 0) {
                    i15 = 67108864;
                }
                i32 |= i15;
            }
            i34 = i5 & 524288;
            if (i34 != 0) {
                i32 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i32 |= ov0Var.d(i2) ? 536870912 : 268435456;
            }
            if ((i5 & 2097152) == 0) {
                c2 = 16;
            } else {
                c2 = 16;
            }
            int i416 = 6 | c2;
            if ((i5 & 4194304) == 0) {
                i35 = WorkQueueKt.BUFFER_CAPACITY;
            } else {
                i35 = WorkQueueKt.BUFFER_CAPACITY;
            }
            int i417 = i416 | i35;
            i36 = i9;
            if ((i9 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (ov0Var.T(i36 & 1, z5)) {
                ov0Var.Y();
                if ((i3 & 1) != 0) {
                    if (i43 != 0) {
                        dv1Var2 = av1.a;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        q93Var4 = (q93) ov0Var.j(s83.a);
                    } else {
                        q93Var4 = q93Var2;
                    }
                    if (i10 != 0) {
                        pu0Var6 = null;
                    }
                    if (i12 != 0) {
                        pu0Var7 = null;
                    }
                    if (i14 != 0) {
                        pu0Var13 = null;
                    } else {
                        pu0Var13 = pu0Var3;
                    }
                    if (i17 != 0) {
                        pu0Var14 = null;
                    } else {
                        pu0Var14 = pu0Var4;
                    }
                    if (i20 == 0) {
                    }
                    if (i23 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i26 != 0) {
                        ak3Var3 = u92.w;
                    } else {
                        ak3Var3 = ak3Var;
                    }
                    if (i29 != 0) {
                        n91Var3 = n91.c;
                    } else {
                        n91Var3 = n91Var;
                    }
                    if (i31 != 0) {
                        m91Var3 = m91.d;
                    } else {
                        m91Var3 = m91Var;
                    }
                    if (i33 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i39 = i;
                    } else if (z10) {
                        i39 = 1;
                    } else {
                        i39 = Integer.MAX_VALUE;
                    }
                    if (i34 == 0) {
                    }
                    if ((i5 & 2097152) != 0) {
                        au2VarA = hu2.a(ym3.z, ov0Var);
                    } else {
                        au2VarA = au2Var;
                    }
                    q93Var5 = q93Var4;
                    if ((i5 & 4194304) != 0) {
                        dv1 dv1Var13 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var13;
                        pu0 pu0Var27 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var27;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = j9.j(6, ov0Var);
                        n91Var4 = n91Var3;
                        q93Var6 = q93Var5;
                    } else {
                        dv1 dv1Var14 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var14;
                        pu0 pu0Var28 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var28;
                        q93Var6 = q93Var5;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = t63Var;
                        n91Var4 = n91Var3;
                    }
                } else {
                    if (i43 != 0) {
                        dv1Var2 = av1.a;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        q93Var4 = (q93) ov0Var.j(s83.a);
                    } else {
                        q93Var4 = q93Var2;
                    }
                    if (i10 != 0) {
                        pu0Var6 = null;
                    }
                    if (i12 != 0) {
                        pu0Var7 = null;
                    }
                    if (i14 != 0) {
                        pu0Var13 = null;
                    } else {
                        pu0Var13 = pu0Var3;
                    }
                    if (i17 != 0) {
                        pu0Var14 = null;
                    } else {
                        pu0Var14 = pu0Var4;
                    }
                    if (i20 == 0) {
                    }
                    if (i23 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i26 != 0) {
                        ak3Var3 = u92.w;
                    } else {
                        ak3Var3 = ak3Var;
                    }
                    if (i29 != 0) {
                        n91Var3 = n91.c;
                    } else {
                        n91Var3 = n91Var;
                    }
                    if (i31 != 0) {
                        m91Var3 = m91.d;
                    } else {
                        m91Var3 = m91Var;
                    }
                    if (i33 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i39 = i;
                    } else if (z10) {
                        i39 = 1;
                    } else {
                        i39 = Integer.MAX_VALUE;
                    }
                    if (i34 == 0) {
                    }
                    if ((i5 & 2097152) != 0) {
                        au2VarA = hu2.a(ym3.z, ov0Var);
                    } else {
                        au2VarA = au2Var;
                    }
                    q93Var5 = q93Var4;
                    if ((i5 & 4194304) != 0) {
                        dv1 dv1Var15 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var15;
                        pu0 pu0Var29 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var29;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = j9.j(6, ov0Var);
                        n91Var4 = n91Var3;
                        q93Var6 = q93Var5;
                    } else {
                        dv1 dv1Var16 = dv1Var2;
                        z11 = z4;
                        dv1Var3 = dv1Var16;
                        pu0 pu0Var210 = pu0Var6;
                        z12 = z9;
                        pu0Var16 = pu0Var210;
                        q93Var6 = q93Var5;
                        pu0Var17 = pu0Var15;
                        pu0Var18 = pu0Var13;
                        au2Var3 = au2VarA;
                        pu0Var19 = pu0Var14;
                        ak3Var2 = ak3Var3;
                        pu0Var20 = pu0Var7;
                        t63VarJ = t63Var;
                        n91Var4 = n91Var3;
                    }
                }
                ov0Var.q();
                ov0Var.c0(1310051731);
                objQ = ov0Var.Q();
                if (objQ == d30.a) {
                    objQ = new ix1();
                    ov0Var.m0(objQ);
                }
                ix1Var = (ix1) objQ;
                z13 = false;
                ov0Var.p(false);
                ov0Var.c0(1981927842);
                jB = q93Var6.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var, 0).getValue()).booleanValue();
                    if (!z11) {
                        jB = t63VarJ.c;
                    } else if (z12) {
                        jB = t63VarJ.d;
                    } else if (zBooleanValue) {
                        jB = t63VarJ.a;
                    } else {
                        jB = t63VarJ.b;
                    }
                    z13 = false;
                }
                ov0Var.p(z13);
                int i418 = i40;
                k22.b(j93.a.a(t63VarJ.k), sb.a0(1874034984, new i42(dv1Var3, pu0Var16, z12, t63VarJ, str, lu0Var, z11, q93Var6.d(new q93(jB, 0L, null, 0L, 0L, 0, 0L, 16777214)), n91Var4, m91Var3, z10, i39, i418, ak3Var2, ix1Var, pu0Var20, pu0Var18, pu0Var19, pu0Var17, au2Var3), ov0Var), ov0Var, 56);
                q93Var3 = q93Var6;
                z6 = z12;
                t63Var2 = t63VarJ;
                z8 = z11;
                n91Var2 = n91Var4;
                m91Var2 = m91Var3;
                z7 = z10;
                i37 = i39;
                i38 = i418;
                pu0Var12 = pu0Var18;
                pu0Var8 = pu0Var19;
                pu0Var9 = pu0Var17;
                au2Var2 = au2Var3;
                dv1Var2 = dv1Var3;
                pu0Var10 = pu0Var16;
                pu0Var11 = pu0Var20;
            } else {
                ov0Var.W();
                pu0Var8 = pu0Var4;
                pu0Var9 = pu0Var5;
                z6 = z2;
                ak3Var2 = ak3Var;
                n91Var2 = n91Var;
                z7 = z3;
                i37 = i;
                i38 = i2;
                au2Var2 = au2Var;
                t63Var2 = t63Var;
                z8 = z4;
                q93Var3 = q93Var2;
                pu0Var10 = pu0Var6;
                pu0Var11 = pu0Var7;
                pu0Var12 = pu0Var3;
                m91Var2 = m91Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                final dv1 dv1Var17 = dv1Var2;
                final ak3 ak3Var6 = ak3Var2;
                final t63 t63Var5 = t63Var2;
                ee2VarT.d = new pu0() { // from class: e42
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(i3 | 1);
                        int iM1 = wc0.m0(i4);
                        ee0.i(str, lu0Var, dv1Var17, z8, q93Var3, pu0Var10, pu0Var11, pu0Var12, pu0Var8, pu0Var9, z6, ak3Var6, n91Var2, m91Var2, z7, i37, i38, au2Var2, t63Var5, (f30) obj, iM0, iM1, i5);
                        return mf3.a;
                    }
                };
            }
        }
        i9 |= 805306368;
        i19 = i4 | 54;
        i20 = i5 & 4096;
        if (i20 != 0) {
            i21 = i4 | 438;
        } else {
            if ((i4 & 384) != 0) {
                if (ov0Var.h(pu0Var5)) {
                    i22 = 256;
                } else {
                    i22 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i19 |= i22;
            }
            i21 = i19;
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
            i25 = i21 | 3072;
        } else {
            int i419 = i21;
            if (ov0Var.g(z2)) {
                i24 = 2048;
            } else {
                i24 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i25 = i419 | i24;
        }
        i26 = i5 & 16384;
        if (i26 != 0) {
            i28 = i25 | 24576;
        } else {
            int i4110 = i25;
            if (ov0Var.f(ak3Var)) {
                i27 = 16384;
            } else {
                i27 = 8192;
            }
            i28 = i4110 | i27;
        }
        i29 = i5 & 32768;
        if (i29 != 0) {
            i28 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (ov0Var.f(n91Var)) {
                i30 = 131072;
            } else {
                i30 = 65536;
            }
            i28 |= i30;
        }
        i31 = i5 & 65536;
        if (i31 != 0) {
            i32 = i28 | 1572864;
        } else {
            i32 = i28 | (ov0Var.f(m91Var) ? 1048576 : 524288);
        }
        i33 = i5 & 131072;
        if (i33 != 0) {
            i32 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i32 |= ov0Var.g(z3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) != 0) {
            if ((i5 & 262144) == 0) {
                i15 = 67108864;
            }
            i32 |= i15;
        }
        i34 = i5 & 524288;
        if (i34 != 0) {
            i32 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            i32 |= ov0Var.d(i2) ? 536870912 : 268435456;
        }
        if ((i5 & 2097152) == 0) {
            c2 = 16;
        } else {
            c2 = 16;
        }
        int i4111 = 6 | c2;
        if ((i5 & 4194304) == 0) {
            i35 = WorkQueueKt.BUFFER_CAPACITY;
        } else {
            i35 = WorkQueueKt.BUFFER_CAPACITY;
        }
        int i4112 = i4111 | i35;
        i36 = i9;
        if ((i9 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (ov0Var.T(i36 & 1, z5)) {
            ov0Var.Y();
            if ((i3 & 1) != 0) {
                if (i43 != 0) {
                    dv1Var2 = av1.a;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i5 & 32) != 0) {
                    q93Var4 = (q93) ov0Var.j(s83.a);
                } else {
                    q93Var4 = q93Var2;
                }
                if (i10 != 0) {
                    pu0Var6 = null;
                }
                if (i12 != 0) {
                    pu0Var7 = null;
                }
                if (i14 != 0) {
                    pu0Var13 = null;
                } else {
                    pu0Var13 = pu0Var3;
                }
                if (i17 != 0) {
                    pu0Var14 = null;
                } else {
                    pu0Var14 = pu0Var4;
                }
                if (i20 == 0) {
                }
                if (i23 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i26 != 0) {
                    ak3Var3 = u92.w;
                } else {
                    ak3Var3 = ak3Var;
                }
                if (i29 != 0) {
                    n91Var3 = n91.c;
                } else {
                    n91Var3 = n91Var;
                }
                if (i31 != 0) {
                    m91Var3 = m91.d;
                } else {
                    m91Var3 = m91Var;
                }
                if (i33 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 262144) == 0) {
                    i39 = i;
                } else if (z10) {
                    i39 = 1;
                } else {
                    i39 = Integer.MAX_VALUE;
                }
                if (i34 == 0) {
                }
                if ((i5 & 2097152) != 0) {
                    au2VarA = hu2.a(ym3.z, ov0Var);
                } else {
                    au2VarA = au2Var;
                }
                q93Var5 = q93Var4;
                if ((i5 & 4194304) != 0) {
                    dv1 dv1Var18 = dv1Var2;
                    z11 = z4;
                    dv1Var3 = dv1Var18;
                    pu0 pu0Var211 = pu0Var6;
                    z12 = z9;
                    pu0Var16 = pu0Var211;
                    pu0Var17 = pu0Var15;
                    pu0Var18 = pu0Var13;
                    au2Var3 = au2VarA;
                    pu0Var19 = pu0Var14;
                    ak3Var2 = ak3Var3;
                    pu0Var20 = pu0Var7;
                    t63VarJ = j9.j(6, ov0Var);
                    n91Var4 = n91Var3;
                    q93Var6 = q93Var5;
                } else {
                    dv1 dv1Var19 = dv1Var2;
                    z11 = z4;
                    dv1Var3 = dv1Var19;
                    pu0 pu0Var212 = pu0Var6;
                    z12 = z9;
                    pu0Var16 = pu0Var212;
                    q93Var6 = q93Var5;
                    pu0Var17 = pu0Var15;
                    pu0Var18 = pu0Var13;
                    au2Var3 = au2VarA;
                    pu0Var19 = pu0Var14;
                    ak3Var2 = ak3Var3;
                    pu0Var20 = pu0Var7;
                    t63VarJ = t63Var;
                    n91Var4 = n91Var3;
                }
            } else {
                if (i43 != 0) {
                    dv1Var2 = av1.a;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i5 & 32) != 0) {
                    q93Var4 = (q93) ov0Var.j(s83.a);
                } else {
                    q93Var4 = q93Var2;
                }
                if (i10 != 0) {
                    pu0Var6 = null;
                }
                if (i12 != 0) {
                    pu0Var7 = null;
                }
                if (i14 != 0) {
                    pu0Var13 = null;
                } else {
                    pu0Var13 = pu0Var3;
                }
                if (i17 != 0) {
                    pu0Var14 = null;
                } else {
                    pu0Var14 = pu0Var4;
                }
                if (i20 == 0) {
                }
                if (i23 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i26 != 0) {
                    ak3Var3 = u92.w;
                } else {
                    ak3Var3 = ak3Var;
                }
                if (i29 != 0) {
                    n91Var3 = n91.c;
                } else {
                    n91Var3 = n91Var;
                }
                if (i31 != 0) {
                    m91Var3 = m91.d;
                } else {
                    m91Var3 = m91Var;
                }
                if (i33 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 262144) == 0) {
                    i39 = i;
                } else if (z10) {
                    i39 = 1;
                } else {
                    i39 = Integer.MAX_VALUE;
                }
                if (i34 == 0) {
                }
                if ((i5 & 2097152) != 0) {
                    au2VarA = hu2.a(ym3.z, ov0Var);
                } else {
                    au2VarA = au2Var;
                }
                q93Var5 = q93Var4;
                if ((i5 & 4194304) != 0) {
                    dv1 dv1Var110 = dv1Var2;
                    z11 = z4;
                    dv1Var3 = dv1Var110;
                    pu0 pu0Var213 = pu0Var6;
                    z12 = z9;
                    pu0Var16 = pu0Var213;
                    pu0Var17 = pu0Var15;
                    pu0Var18 = pu0Var13;
                    au2Var3 = au2VarA;
                    pu0Var19 = pu0Var14;
                    ak3Var2 = ak3Var3;
                    pu0Var20 = pu0Var7;
                    t63VarJ = j9.j(6, ov0Var);
                    n91Var4 = n91Var3;
                    q93Var6 = q93Var5;
                } else {
                    dv1 dv1Var111 = dv1Var2;
                    z11 = z4;
                    dv1Var3 = dv1Var111;
                    pu0 pu0Var214 = pu0Var6;
                    z12 = z9;
                    pu0Var16 = pu0Var214;
                    q93Var6 = q93Var5;
                    pu0Var17 = pu0Var15;
                    pu0Var18 = pu0Var13;
                    au2Var3 = au2VarA;
                    pu0Var19 = pu0Var14;
                    ak3Var2 = ak3Var3;
                    pu0Var20 = pu0Var7;
                    t63VarJ = t63Var;
                    n91Var4 = n91Var3;
                }
            }
            ov0Var.q();
            ov0Var.c0(1310051731);
            objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new ix1();
                ov0Var.m0(objQ);
            }
            ix1Var = (ix1) objQ;
            z13 = false;
            ov0Var.p(false);
            ov0Var.c0(1981927842);
            jB = q93Var6.b();
            if (jB == 16) {
                zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var, 0).getValue()).booleanValue();
                if (!z11) {
                    jB = t63VarJ.c;
                } else if (z12) {
                    jB = t63VarJ.d;
                } else if (zBooleanValue) {
                    jB = t63VarJ.a;
                } else {
                    jB = t63VarJ.b;
                }
                z13 = false;
            }
            ov0Var.p(z13);
            int i4113 = i40;
            k22.b(j93.a.a(t63VarJ.k), sb.a0(1874034984, new i42(dv1Var3, pu0Var16, z12, t63VarJ, str, lu0Var, z11, q93Var6.d(new q93(jB, 0L, null, 0L, 0L, 0, 0L, 16777214)), n91Var4, m91Var3, z10, i39, i4113, ak3Var2, ix1Var, pu0Var20, pu0Var18, pu0Var19, pu0Var17, au2Var3), ov0Var), ov0Var, 56);
            q93Var3 = q93Var6;
            z6 = z12;
            t63Var2 = t63VarJ;
            z8 = z11;
            n91Var2 = n91Var4;
            m91Var2 = m91Var3;
            z7 = z10;
            i37 = i39;
            i38 = i4113;
            pu0Var12 = pu0Var18;
            pu0Var8 = pu0Var19;
            pu0Var9 = pu0Var17;
            au2Var2 = au2Var3;
            dv1Var2 = dv1Var3;
            pu0Var10 = pu0Var16;
            pu0Var11 = pu0Var20;
        } else {
            ov0Var.W();
            pu0Var8 = pu0Var4;
            pu0Var9 = pu0Var5;
            z6 = z2;
            ak3Var2 = ak3Var;
            n91Var2 = n91Var;
            z7 = z3;
            i37 = i;
            i38 = i2;
            au2Var2 = au2Var;
            t63Var2 = t63Var;
            z8 = z4;
            q93Var3 = q93Var2;
            pu0Var10 = pu0Var6;
            pu0Var11 = pu0Var7;
            pu0Var12 = pu0Var3;
            m91Var2 = m91Var;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final dv1 dv1Var112 = dv1Var2;
            final ak3 ak3Var7 = ak3Var2;
            final t63 t63Var6 = t63Var2;
            ee2VarT.d = new pu0() { // from class: e42
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i3 | 1);
                    int iM1 = wc0.m0(i4);
                    ee0.i(str, lu0Var, dv1Var112, z8, q93Var3, pu0Var10, pu0Var11, pu0Var12, pu0Var8, pu0Var9, z6, ak3Var7, n91Var2, m91Var2, z7, i37, i38, au2Var2, t63Var6, (f30) obj, iM0, iM1, i5);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x027e  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:182:0x0316  */
    /* JADX WARN: Code duplicated, block: B:183:0x031a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0335  */
    /* JADX WARN: Code duplicated, block: B:191:0x0353  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367  */
    /* JADX WARN: Code duplicated, block: B:196:0x036d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0373  */
    /* JADX WARN: Code duplicated, block: B:201:0x0379  */
    /* JADX WARN: Code duplicated, block: B:203:0x037e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0384  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:209:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:216:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:218:0x040c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0448  */
    /* JADX WARN: Code duplicated, block: B:221:0x044c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0467  */
    /* JADX WARN: Code duplicated, block: B:229:0x0487  */
    /* JADX WARN: Code duplicated, block: B:232:0x049e  */
    /* JADX WARN: Code duplicated, block: B:233:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:236:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:239:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:240:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:243:0x0506  */
    /* JADX WARN: Code duplicated, block: B:244:0x050a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0525  */
    /* JADX WARN: Code duplicated, block: B:252:0x053e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0549  */
    /* JADX WARN: Code duplicated, block: B:256:0x054d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0556  */
    /* JADX WARN: Code duplicated, block: B:261:0x055a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0563  */
    /* JADX WARN: Code duplicated, block: B:267:0x0567  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:274:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:276:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:278:0x05de  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:282:0x0627  */
    /* JADX WARN: Code duplicated, block: B:283:0x062b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0646  */
    /* JADX WARN: Code duplicated, block: B:290:0x0662  */
    public static final void j(final pu0 pu0Var, qu0 qu0Var, pu0 pu0Var2, final pu0 pu0Var3, final pu0 pu0Var4, final pu0 pu0Var5, pu0 pu0Var6, final boolean z, final l73 l73Var, final g73 g73Var, final lu0 lu0Var, final p10 p10Var, pu0 pu0Var7, z42 z42Var, f30 f30Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        pu0 pu0Var8;
        qu0 qu0Var2;
        final pu0 pu0Var9;
        final pu0 pu0Var10;
        ov0 ov0Var;
        float f2;
        ov0 ov0Var2;
        pr prVar;
        gh ghVar;
        au1 au1Var;
        boolean z3;
        float fI;
        float fG;
        float f3;
        float f4;
        pr prVar2;
        pu0 pu0Var11;
        float f5;
        float f6;
        dv1 dv1VarG;
        qu0 qu0Var3;
        int iT;
        pu0 pu0Var12;
        pu0 pu0Var13;
        boolean z4;
        int iT2;
        g73 g73Var2;
        boolean z5;
        Object objQ;
        int iT3;
        int iT4;
        int iT5;
        float f7;
        int iT6;
        int iT7;
        pu0 pu0Var14 = pu0Var2;
        pu0 pu0Var15 = pu0Var6;
        z42 z42Var2 = z42Var;
        pr prVar3 = j9.j;
        pr prVar4 = j9.f;
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(753699262);
        int i5 = i & 6;
        av1 av1Var = av1.a;
        if (i5 == 0) {
            i3 = i | (ov0Var3.f(av1Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ov0Var3.h(pu0Var) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = WorkQueueKt.BUFFER_CAPACITY;
        if (i6 == 0) {
            i3 |= ov0Var3.h(qu0Var) ? 256 : 128;
        }
        int i8 = i & 3072;
        int i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i8 == 0) {
            i3 |= ov0Var3.h(pu0Var14) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ov0Var3.h(pu0Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ov0Var3.h(pu0Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ov0Var3.h(pu0Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ov0Var3.h(pu0Var15) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= ov0Var3.g(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        if ((i & 805306368) == 0) {
            i3 |= ov0Var3.f(l73Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? ov0Var3.f(g73Var) : ov0Var3.h(g73Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var3.h(lu0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (ov0Var3.h(p10Var)) {
                i7 = 256;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (ov0Var3.h(pu0Var7)) {
                i9 = 2048;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ov0Var3.f(z42Var2) ? 16384 : 8192;
        }
        int i10 = i4;
        if (ov0Var3.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i10 & 9363) == 9362) ? false : true)) {
            float f8 = ((td0) ov0Var3.j(v41.c)).e;
            if (Float.isNaN(f8)) {
                f8 = 0.0f;
            }
            float f9 = (f8 - ji2.x) / 2.0f;
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            int i11 = i10 & 14;
            boolean zC = ((i3 & 234881024) == 67108864) | ((i10 & 112) == 32) | ((i3 & 1879048192) == 536870912) | (i11 == 4 || ((i10 & 8) != 0 && ov0Var3.f(g73Var))) | ((i10 & 57344) == 16384) | ov0Var3.c(f9);
            Object objQ2 = ov0Var3.Q();
            c30 c30Var = d30.a;
            if (zC || objQ2 == c30Var) {
                ov0 ov0Var4 = ov0Var3;
                f2 = f9;
                k42 k42Var = new k42(lu0Var, z2, l73Var, g73Var, z42Var2, f2);
                ov0Var4.m0(k42Var);
                objQ2 = k42Var;
                ov0Var2 = ov0Var4;
            } else {
                ov0Var2 = ov0Var3;
                f2 = f9;
            }
            k42 k42Var2 = (k42) objQ2;
            qa1 qa1Var = (qa1) ov0Var2.j(z30.n);
            int iT8 = ks.T(ov0Var2);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, r21);
            w20.b.getClass();
            float f10 = f2;
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            gh ghVar2 = v20.e;
            q73.h(ov0Var2, ghVar2, k42Var2);
            gh ghVar3 = v20.d;
            q73.h(ov0Var2, ghVar3, l72VarL);
            gh ghVar4 = v20.f;
            if (ov0Var2.S) {
                prVar = r17;
            } else {
                prVar = prVar4;
                if (!o51.f(ov0Var2.Q(), Integer.valueOf(iT8))) {
                }
                ghVar = v20.c;
                q73.h(ov0Var2, ghVar, dv1VarH);
                p10Var.invoke(ov0Var2, Integer.valueOf((i10 >> 6) & 14));
                au1Var = au1.a;
                if (pu0Var3 != null) {
                    ov0Var2.c0(2145628269);
                    dv1 dv1VarD = xp1.E(av1Var, "Leading").d(au1Var);
                    er1 er1VarC = ws.c(prVar3, false);
                    iT7 = ks.T(ov0Var2);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarD);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC);
                    q73.h(ov0Var2, ghVar3, l72VarL2);
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT7))) {
                        az2.r(iT7, ov0Var2, iT7, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH2);
                    pu0Var3.invoke(ov0Var2, Integer.valueOf((i3 >> 12) & 14));
                    ov0Var2.p(true);
                    z3 = false;
                    ov0Var2.p(false);
                } else {
                    z3 = false;
                    ov0Var2.c0(2145874285);
                    ov0Var2.p(false);
                }
                if (pu0Var4 != null) {
                    ov0Var2.c0(2145917003);
                    dv1 dv1VarD2 = xp1.E(r21, "Trailing").d(au1Var);
                    er1 er1VarC2 = ws.c(r16, z3);
                    iT6 = ks.T(ov0Var2);
                    l72 l72VarL3 = ov0Var2.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarD2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC2);
                    q73.h(ov0Var2, ghVar3, l72VarL3);
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT6))) {
                        az2.r(iT6, ov0Var2, iT6, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH3);
                    pu0Var4.invoke(ov0Var2, Integer.valueOf((i3 >> 15) & 14));
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                } else {
                    ov0Var2.c0(2146164941);
                    ov0Var2.p(z3);
                }
                z42Var2 = z42Var;
                fI = zm3.i(z42Var2, qa1Var);
                fG = zm3.g(z42Var2, qa1Var);
                if (pu0Var3 != null) {
                    fI -= f10;
                    if (fI < 0.0f) {
                        fI = 0.0f;
                    }
                }
                f3 = fI;
                if (pu0Var4 != null) {
                    f7 = fG - f10;
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    f4 = f7;
                } else {
                    f4 = fG;
                }
                if (pu0Var5 != null) {
                    ov0Var2.c0(2146868920);
                    dv1 dv1VarG2 = zm3.G(iw2.q(iw2.h(xp1.E(r21, "Prefix"), 24.0f, 0.0f, 2)), f3, 0.0f, 2.0f, 0.0f, 10);
                    prVar2 = prVar;
                    er1 er1VarC3 = ws.c(prVar2, false);
                    iT5 = ks.T(ov0Var2);
                    l72 l72VarL4 = ov0Var2.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarG2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC3);
                    q73.h(ov0Var2, ghVar3, l72VarL4);
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT5))) {
                        az2.r(iT5, ov0Var2, iT5, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH4);
                    pu0Var5.invoke(ov0Var2, Integer.valueOf((i3 >> 18) & 14));
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                } else {
                    prVar2 = prVar;
                    ov0Var2.c0(2147196621);
                    ov0Var2.p(false);
                }
                if (pu0Var6 != null) {
                    ov0Var2.c0(2147239866);
                    dv1 dv1VarG3 = zm3.G(iw2.q(iw2.h(xp1.E(r21, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f4, 0.0f, 10);
                    er1 er1VarC4 = ws.c(prVar2, false);
                    iT4 = ks.T(ov0Var2);
                    l72 l72VarL5 = ov0Var2.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var2, dv1VarG3);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC4);
                    q73.h(ov0Var2, ghVar3, l72VarL5);
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT4))) {
                        az2.r(iT4, ov0Var2, iT4, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH5);
                    pu0 pu0Var16 = pu0Var6;
                    pu0Var16.invoke(ov0Var2, Integer.valueOf((i3 >> 21) & 14));
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                    pu0Var11 = pu0Var16;
                } else {
                    pu0Var11 = pu0Var6;
                    ov0Var2.c0(-2147401651);
                    ov0Var2.p(false);
                }
                dv1 dv1VarQ = iw2.q(iw2.h(r21, 24.0f, 0.0f, 2));
                if (pu0Var5 == null) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                if (pu0Var11 == null) {
                    f6 = f4;
                } else {
                    f6 = 0.0f;
                }
                dv1VarG = zm3.G(dv1VarQ, f5, 0.0f, f6, 0.0f, 10);
                if (qu0Var != null) {
                    ov0Var2.c0(-2147031666);
                    qu0 qu0Var4 = qu0Var;
                    qu0Var4.invoke(xp1.E(r21, "Hint").d(dv1VarG), ov0Var2, Integer.valueOf((i3 >> 3) & 112));
                    ov0Var2.p(false);
                    qu0Var3 = qu0Var4;
                } else {
                    qu0Var3 = qu0Var;
                    ov0Var2.c0(-2146940371);
                    ov0Var2.p(false);
                }
                dv1 dv1VarD3 = xp1.E(r21, "TextField").d(dv1VarG);
                er1 er1VarC5 = ws.c(prVar2, true);
                iT = ks.T(ov0Var2);
                l72 l72VarL6 = ov0Var2.l();
                dv1 dv1VarH6 = xp1.H(ov0Var2, dv1VarD3);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC5);
                q73.h(ov0Var2, ghVar3, l72VarL6);
                if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT))) {
                    az2.r(iT, ov0Var2, iT, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH6);
                pu0Var.invoke(ov0Var2, Integer.valueOf((i3 >> 3) & 14));
                ov0Var2.p(true);
                if (pu0Var2 != null) {
                    ov0Var2.c0(-2146287790);
                    if (i11 != 4) {
                        if ((i10 & 8) != 0) {
                            g73Var2 = g73Var;
                            if (ov0Var2.h(g73Var2)) {
                            }
                            objQ = ov0Var2.Q();
                            if (z5 || objQ == c30Var) {
                                objQ = new hd(g73Var2, 25);
                                ov0Var2.m0(objQ);
                            }
                            dv1 dv1VarD4 = xp1.E(iw2.q(k22.A(r21, new ak(7, (au0) objQ))), "Label").d(r21);
                            er1 er1VarC6 = ws.c(prVar2, false);
                            iT3 = ks.T(ov0Var2);
                            l72 l72VarL7 = ov0Var2.l();
                            dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarD4);
                            ov0Var2.g0();
                            if (ov0Var2.S) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar2, er1VarC6);
                            q73.h(ov0Var2, ghVar3, l72VarL7);
                            if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT3))) {
                                az2.r(iT3, ov0Var2, iT3, ghVar4);
                            }
                            q73.h(ov0Var2, ghVar, dv1VarH7);
                            pu0 pu0Var17 = pu0Var2;
                            pu0Var17.invoke(ov0Var2, Integer.valueOf((i3 >> 9) & 14));
                            ov0Var2.p(true);
                            ov0Var2.p(false);
                            pu0Var12 = pu0Var17;
                        } else {
                            g73Var2 = g73Var;
                        }
                        z5 = false;
                        objQ = ov0Var2.Q();
                        if (z5) {
                            objQ = new hd(g73Var2, 25);
                            ov0Var2.m0(objQ);
                        } else {
                            objQ = new hd(g73Var2, 25);
                            ov0Var2.m0(objQ);
                        }
                        dv1 dv1VarD5 = xp1.E(iw2.q(k22.A(r21, new ak(7, (au0) objQ))), "Label").d(r21);
                        er1 er1VarC7 = ws.c(prVar2, false);
                        iT3 = ks.T(ov0Var2);
                        l72 l72VarL8 = ov0Var2.l();
                        dv1 dv1VarH8 = xp1.H(ov0Var2, dv1VarD5);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar2, er1VarC7);
                        q73.h(ov0Var2, ghVar3, l72VarL8);
                        if (ov0Var2.S) {
                            az2.r(iT3, ov0Var2, iT3, ghVar4);
                        } else {
                            az2.r(iT3, ov0Var2, iT3, ghVar4);
                        }
                        q73.h(ov0Var2, ghVar, dv1VarH8);
                        pu0 pu0Var18 = pu0Var2;
                        pu0Var18.invoke(ov0Var2, Integer.valueOf((i3 >> 9) & 14));
                        ov0Var2.p(true);
                        ov0Var2.p(false);
                        pu0Var12 = pu0Var18;
                    } else {
                        g73Var2 = g73Var;
                    }
                    z5 = true;
                    objQ = ov0Var2.Q();
                    if (z5) {
                        objQ = new hd(g73Var2, 25);
                        ov0Var2.m0(objQ);
                    } else {
                        objQ = new hd(g73Var2, 25);
                        ov0Var2.m0(objQ);
                    }
                    dv1 dv1VarD6 = xp1.E(iw2.q(k22.A(r21, new ak(7, (au0) objQ))), "Label").d(r21);
                    er1 er1VarC8 = ws.c(prVar2, false);
                    iT3 = ks.T(ov0Var2);
                    l72 l72VarL9 = ov0Var2.l();
                    dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarD6);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC8);
                    q73.h(ov0Var2, ghVar3, l72VarL9);
                    if (ov0Var2.S) {
                        az2.r(iT3, ov0Var2, iT3, ghVar4);
                    } else {
                        az2.r(iT3, ov0Var2, iT3, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH9);
                    pu0 pu0Var19 = pu0Var2;
                    pu0Var19.invoke(ov0Var2, Integer.valueOf((i3 >> 9) & 14));
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                    pu0Var12 = pu0Var19;
                } else {
                    pu0Var12 = pu0Var2;
                    ov0Var2.c0(-2145892819);
                    ov0Var2.p(false);
                }
                if (pu0Var7 != null) {
                    ov0Var2.c0(-2145844304);
                    dv1 dv1VarC = zm3.C(iw2.q(iw2.h(xp1.E(r21, "Supporting"), 16.0f, 0.0f, 2)), new b52(16.0f, 4.0f, 16.0f, 0.0f));
                    er1 er1VarC9 = ws.c(prVar2, false);
                    iT2 = ks.T(ov0Var2);
                    l72 l72VarL10 = ov0Var2.l();
                    dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarC);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC9);
                    q73.h(ov0Var2, ghVar3, l72VarL10);
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT2))) {
                        az2.r(iT2, ov0Var2, iT2, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH10);
                    pu0 pu0Var20 = pu0Var7;
                    pu0Var20.invoke(ov0Var2, Integer.valueOf((i10 >> 9) & 14));
                    z4 = true;
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                    pu0Var13 = pu0Var20;
                } else {
                    pu0Var13 = pu0Var7;
                    z4 = true;
                    ov0Var2.c0(-2145508915);
                    ov0Var2.p(false);
                }
                ov0Var2.p(z4);
                ov0Var = ov0Var2;
                pu0Var10 = pu0Var12;
                pu0Var9 = pu0Var11;
                qu0Var2 = qu0Var3;
                pu0Var8 = pu0Var13;
            }
            az2.r(iT8, ov0Var2, iT8, ghVar4);
            ghVar = v20.c;
            q73.h(ov0Var2, ghVar, dv1VarH);
            p10Var.invoke(ov0Var2, Integer.valueOf((i10 >> 6) & 14));
            au1Var = au1.a;
            if (pu0Var3 != null) {
                ov0Var2.c0(2145628269);
                dv1 dv1VarD7 = xp1.E(av1Var, "Leading").d(au1Var);
                er1 er1VarC10 = ws.c(prVar3, false);
                iT7 = ks.T(ov0Var2);
                l72 l72VarL11 = ov0Var2.l();
                dv1 dv1VarH11 = xp1.H(ov0Var2, dv1VarD7);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC10);
                q73.h(ov0Var2, ghVar3, l72VarL11);
                if (ov0Var2.S) {
                    az2.r(iT7, ov0Var2, iT7, ghVar4);
                } else {
                    az2.r(iT7, ov0Var2, iT7, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH11);
                pu0Var3.invoke(ov0Var2, Integer.valueOf((i3 >> 12) & 14));
                ov0Var2.p(true);
                z3 = false;
                ov0Var2.p(false);
            } else {
                z3 = false;
                ov0Var2.c0(2145874285);
                ov0Var2.p(false);
            }
            if (pu0Var4 != null) {
                ov0Var2.c0(2145917003);
                dv1 dv1VarD8 = xp1.E(r21, "Trailing").d(au1Var);
                er1 er1VarC11 = ws.c(r16, z3);
                iT6 = ks.T(ov0Var2);
                l72 l72VarL12 = ov0Var2.l();
                dv1 dv1VarH12 = xp1.H(ov0Var2, dv1VarD8);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC11);
                q73.h(ov0Var2, ghVar3, l72VarL12);
                if (ov0Var2.S) {
                    az2.r(iT6, ov0Var2, iT6, ghVar4);
                } else {
                    az2.r(iT6, ov0Var2, iT6, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH12);
                pu0Var4.invoke(ov0Var2, Integer.valueOf((i3 >> 15) & 14));
                ov0Var2.p(true);
                ov0Var2.p(false);
            } else {
                ov0Var2.c0(2146164941);
                ov0Var2.p(z3);
            }
            z42Var2 = z42Var;
            fI = zm3.i(z42Var2, qa1Var);
            fG = zm3.g(z42Var2, qa1Var);
            if (pu0Var3 != null) {
                fI -= f10;
                if (fI < 0.0f) {
                    fI = 0.0f;
                }
            }
            f3 = fI;
            if (pu0Var4 != null) {
                f7 = fG - f10;
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                f4 = f7;
            } else {
                f4 = fG;
            }
            if (pu0Var5 != null) {
                ov0Var2.c0(2146868920);
                dv1 dv1VarG4 = zm3.G(iw2.q(iw2.h(xp1.E(r21, "Prefix"), 24.0f, 0.0f, 2)), f3, 0.0f, 2.0f, 0.0f, 10);
                prVar2 = prVar;
                er1 er1VarC12 = ws.c(prVar2, false);
                iT5 = ks.T(ov0Var2);
                l72 l72VarL13 = ov0Var2.l();
                dv1 dv1VarH13 = xp1.H(ov0Var2, dv1VarG4);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC12);
                q73.h(ov0Var2, ghVar3, l72VarL13);
                if (ov0Var2.S) {
                    az2.r(iT5, ov0Var2, iT5, ghVar4);
                } else {
                    az2.r(iT5, ov0Var2, iT5, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH13);
                pu0Var5.invoke(ov0Var2, Integer.valueOf((i3 >> 18) & 14));
                ov0Var2.p(true);
                ov0Var2.p(false);
            } else {
                prVar2 = prVar;
                ov0Var2.c0(2147196621);
                ov0Var2.p(false);
            }
            if (pu0Var6 != null) {
                ov0Var2.c0(2147239866);
                dv1 dv1VarG5 = zm3.G(iw2.q(iw2.h(xp1.E(r21, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f4, 0.0f, 10);
                er1 er1VarC13 = ws.c(prVar2, false);
                iT4 = ks.T(ov0Var2);
                l72 l72VarL14 = ov0Var2.l();
                dv1 dv1VarH14 = xp1.H(ov0Var2, dv1VarG5);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC13);
                q73.h(ov0Var2, ghVar3, l72VarL14);
                if (ov0Var2.S) {
                    az2.r(iT4, ov0Var2, iT4, ghVar4);
                } else {
                    az2.r(iT4, ov0Var2, iT4, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH14);
                pu0 pu0Var110 = pu0Var6;
                pu0Var110.invoke(ov0Var2, Integer.valueOf((i3 >> 21) & 14));
                ov0Var2.p(true);
                ov0Var2.p(false);
                pu0Var11 = pu0Var110;
            } else {
                pu0Var11 = pu0Var6;
                ov0Var2.c0(-2147401651);
                ov0Var2.p(false);
            }
            dv1 dv1VarQ2 = iw2.q(iw2.h(r21, 24.0f, 0.0f, 2));
            if (pu0Var5 == null) {
                f5 = f3;
            } else {
                f5 = 0.0f;
            }
            if (pu0Var11 == null) {
                f6 = f4;
            } else {
                f6 = 0.0f;
            }
            dv1VarG = zm3.G(dv1VarQ2, f5, 0.0f, f6, 0.0f, 10);
            if (qu0Var != null) {
                ov0Var2.c0(-2147031666);
                qu0 qu0Var5 = qu0Var;
                qu0Var5.invoke(xp1.E(r21, "Hint").d(dv1VarG), ov0Var2, Integer.valueOf((i3 >> 3) & 112));
                ov0Var2.p(false);
                qu0Var3 = qu0Var5;
            } else {
                qu0Var3 = qu0Var;
                ov0Var2.c0(-2146940371);
                ov0Var2.p(false);
            }
            dv1 dv1VarD9 = xp1.E(r21, "TextField").d(dv1VarG);
            er1 er1VarC14 = ws.c(prVar2, true);
            iT = ks.T(ov0Var2);
            l72 l72VarL15 = ov0Var2.l();
            dv1 dv1VarH15 = xp1.H(ov0Var2, dv1VarD9);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar2, er1VarC14);
            q73.h(ov0Var2, ghVar3, l72VarL15);
            if (ov0Var2.S) {
                az2.r(iT, ov0Var2, iT, ghVar4);
            } else {
                az2.r(iT, ov0Var2, iT, ghVar4);
            }
            q73.h(ov0Var2, ghVar, dv1VarH15);
            pu0Var.invoke(ov0Var2, Integer.valueOf((i3 >> 3) & 14));
            ov0Var2.p(true);
            if (pu0Var2 != null) {
                ov0Var2.c0(-2146287790);
                if (i11 != 4) {
                    if ((i10 & 8) != 0) {
                        g73Var2 = g73Var;
                        if (ov0Var2.h(g73Var2)) {
                        }
                        objQ = ov0Var2.Q();
                        if (z5) {
                            objQ = new hd(g73Var2, 25);
                            ov0Var2.m0(objQ);
                        } else {
                            objQ = new hd(g73Var2, 25);
                            ov0Var2.m0(objQ);
                        }
                        dv1 dv1VarD10 = xp1.E(iw2.q(k22.A(r21, new ak(7, (au0) objQ))), "Label").d(r21);
                        er1 er1VarC15 = ws.c(prVar2, false);
                        iT3 = ks.T(ov0Var2);
                        l72 l72VarL16 = ov0Var2.l();
                        dv1 dv1VarH16 = xp1.H(ov0Var2, dv1VarD10);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar2, er1VarC15);
                        q73.h(ov0Var2, ghVar3, l72VarL16);
                        if (ov0Var2.S) {
                            az2.r(iT3, ov0Var2, iT3, ghVar4);
                        } else {
                            az2.r(iT3, ov0Var2, iT3, ghVar4);
                        }
                        q73.h(ov0Var2, ghVar, dv1VarH16);
                        pu0 pu0Var111 = pu0Var2;
                        pu0Var111.invoke(ov0Var2, Integer.valueOf((i3 >> 9) & 14));
                        ov0Var2.p(true);
                        ov0Var2.p(false);
                        pu0Var12 = pu0Var111;
                    } else {
                        g73Var2 = g73Var;
                    }
                    z5 = false;
                    objQ = ov0Var2.Q();
                    if (z5) {
                        objQ = new hd(g73Var2, 25);
                        ov0Var2.m0(objQ);
                    } else {
                        objQ = new hd(g73Var2, 25);
                        ov0Var2.m0(objQ);
                    }
                    dv1 dv1VarD11 = xp1.E(iw2.q(k22.A(r21, new ak(7, (au0) objQ))), "Label").d(r21);
                    er1 er1VarC16 = ws.c(prVar2, false);
                    iT3 = ks.T(ov0Var2);
                    l72 l72VarL17 = ov0Var2.l();
                    dv1 dv1VarH17 = xp1.H(ov0Var2, dv1VarD11);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar2, er1VarC16);
                    q73.h(ov0Var2, ghVar3, l72VarL17);
                    if (ov0Var2.S) {
                        az2.r(iT3, ov0Var2, iT3, ghVar4);
                    } else {
                        az2.r(iT3, ov0Var2, iT3, ghVar4);
                    }
                    q73.h(ov0Var2, ghVar, dv1VarH17);
                    pu0 pu0Var112 = pu0Var2;
                    pu0Var112.invoke(ov0Var2, Integer.valueOf((i3 >> 9) & 14));
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                    pu0Var12 = pu0Var112;
                } else {
                    g73Var2 = g73Var;
                }
                z5 = true;
                objQ = ov0Var2.Q();
                if (z5) {
                    objQ = new hd(g73Var2, 25);
                    ov0Var2.m0(objQ);
                } else {
                    objQ = new hd(g73Var2, 25);
                    ov0Var2.m0(objQ);
                }
                dv1 dv1VarD12 = xp1.E(iw2.q(k22.A(r21, new ak(7, (au0) objQ))), "Label").d(r21);
                er1 er1VarC17 = ws.c(prVar2, false);
                iT3 = ks.T(ov0Var2);
                l72 l72VarL18 = ov0Var2.l();
                dv1 dv1VarH18 = xp1.H(ov0Var2, dv1VarD12);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC17);
                q73.h(ov0Var2, ghVar3, l72VarL18);
                if (ov0Var2.S) {
                    az2.r(iT3, ov0Var2, iT3, ghVar4);
                } else {
                    az2.r(iT3, ov0Var2, iT3, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH18);
                pu0 pu0Var113 = pu0Var2;
                pu0Var113.invoke(ov0Var2, Integer.valueOf((i3 >> 9) & 14));
                ov0Var2.p(true);
                ov0Var2.p(false);
                pu0Var12 = pu0Var113;
            } else {
                pu0Var12 = pu0Var2;
                ov0Var2.c0(-2145892819);
                ov0Var2.p(false);
            }
            if (pu0Var7 != null) {
                ov0Var2.c0(-2145844304);
                dv1 dv1VarC2 = zm3.C(iw2.q(iw2.h(xp1.E(r21, "Supporting"), 16.0f, 0.0f, 2)), new b52(16.0f, 4.0f, 16.0f, 0.0f));
                er1 er1VarC18 = ws.c(prVar2, false);
                iT2 = ks.T(ov0Var2);
                l72 l72VarL19 = ov0Var2.l();
                dv1 dv1VarH19 = xp1.H(ov0Var2, dv1VarC2);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar2, er1VarC18);
                q73.h(ov0Var2, ghVar3, l72VarL19);
                if (ov0Var2.S) {
                    az2.r(iT2, ov0Var2, iT2, ghVar4);
                } else {
                    az2.r(iT2, ov0Var2, iT2, ghVar4);
                }
                q73.h(ov0Var2, ghVar, dv1VarH19);
                pu0 pu0Var21 = pu0Var7;
                pu0Var21.invoke(ov0Var2, Integer.valueOf((i10 >> 9) & 14));
                z4 = true;
                ov0Var2.p(true);
                ov0Var2.p(false);
                pu0Var13 = pu0Var21;
            } else {
                pu0Var13 = pu0Var7;
                z4 = true;
                ov0Var2.c0(-2145508915);
                ov0Var2.p(false);
            }
            ov0Var2.p(z4);
            ov0Var = ov0Var2;
            pu0Var10 = pu0Var12;
            pu0Var9 = pu0Var11;
            qu0Var2 = qu0Var3;
            pu0Var8 = pu0Var13;
        } else {
            pu0Var8 = pu0Var7;
            qu0Var2 = qu0Var;
            ov0 ov0Var5 = ov0Var3;
            ov0Var5.W();
            ov0Var = ov0Var5;
            pu0Var10 = pu0Var14;
            pu0Var9 = pu0Var15;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final qu0 qu0Var6 = qu0Var2;
            final z42 z42Var3 = z42Var2;
            final pu0 pu0Var22 = pu0Var8;
            ee2VarT.d = new pu0() { // from class: f42
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    int iM1 = wc0.m0(i2);
                    ee0.j(pu0Var, qu0Var6, pu0Var10, pu0Var3, pu0Var4, pu0Var5, pu0Var9, z, l73Var, g73Var, lu0Var, p10Var, pu0Var22, z42Var3, (f30) obj, iM0, iM1);
                    return mf3.a;
                }
            };
        }
    }

    public static final void k(int i, f30 f30Var, au0 au0Var, AppState appState, boolean z) {
        appState.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-893718130);
        int i2 = 16;
        int i3 = (ov0Var.g(z) ? 4 : 2) | i | (ov0Var.h(appState) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = ov0Var.Q();
            if (z2 || objQ == d30.a) {
                objQ = new o6(i2, au0Var);
                ov0Var.m0(objQ);
            }
            zm3.b(bk.a(dv1VarE, (au0) objQ), 16.0f, new b52(16.0f, 14.0f, 16.0f, 14.0f), sb.a0(-310231617, new vy1(appState, z), ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new wy1(z, appState, au0Var, i);
        }
    }

    public static final void l(x01 x01Var, String str, boolean z, f30 f30Var, int i) {
        str.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-274814303);
        int i2 = (ov0Var.f(x01Var) ? 4 : 2) | i | (ov0Var.f(str) ? 32 : 16) | (ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            long j = z ? bk.c : bk.f;
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            av1 av1Var = av1.a;
            dv1 dv1VarH = xp1.H(ov0Var, av1Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, kk2VarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            t01.a(x01Var, null, iw2.k(av1Var, 15.0f), j, ov0Var, (i2 & 14) | 432, 0);
            gh0.h(ov0Var, iw2.o(av1Var, 6.0f));
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            s83.b(upperCase, null, j, v63.b(11.5d), jr0.i, null, v63.b(0.8d), null, null, 0L, 0, false, 0, 0, null, ov0Var, 102260736, 0, 261802);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new o2(x01Var, str, z, i);
        }
    }

    public static final void m(final CloudAccountState cloudAccountState, final boolean z, final au0 au0Var, f30 f30Var, int i) {
        boolean z2;
        ey1 ey1Var;
        cloudAccountState.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-287765487);
        int i2 = i | (ov0Var.h(cloudAccountState) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            ov0Var.d0(414512006);
            kn2 kn2VarA = v91.a(ov0Var);
            ov0Var.d0(1274527078);
            ov0Var.p(false);
            ov0Var.d0(511388516);
            q60 q60Var = null;
            boolean zF = ov0Var.f(null) | ov0Var.f(kn2VarA);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = kn2VarA.a(xe2.a(RadioSharingManager.class), null);
                ov0Var.m0(objQ);
            }
            ov0Var.p(false);
            ov0Var.p(false);
            final RadioSharingManager radioSharingManager = (RadioSharingManager) objQ;
            final ey1 ey1VarS = s(radioSharingManager.getState(), ov0Var);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ2);
            }
            final ey1 ey1Var2 = (ey1) objQ2;
            long j = z ? bk.a : bk.d;
            long jD = z ? xp1.d(4280428334L) : hz.c;
            final long jD2 = xp1.d(z ? 4293455348L : 4280297523L);
            final long jD3 = xp1.d(z ? 4289377474L : 4285101703L);
            CloudAccount account = cloudAccountState.getAccount();
            String id = account != null ? account.getId() : null;
            Boolean boolValueOf = Boolean.valueOf(cloudAccountState.getValidated());
            boolean zH = ov0Var.h(radioSharingManager);
            Object objQ3 = ov0Var.Q();
            if (zH || objQ3 == c30Var) {
                objQ3 = new p00(radioSharingManager, q60Var, 7);
                ov0Var.m0(objQ3);
            }
            oi0.f(id, boolValueOf, (pu0) objQ3, ov0Var);
            xq1.g(false, au0Var, ov0Var, (i2 >> 3) & 112, 1);
            final long j2 = j;
            final long j3 = jD;
            wc0.n(null, sb.a0(-846325299, new pu0() { // from class: ev2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 1;
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j4 = jD2;
                        zj.b(sb.a0(-269248111, new p80(7, j4), ov0Var2), null, sb.a0(-1583077997, new s80(au0Var, j4, i3), ov0Var2), null, 0.0f, null, k93.k(j2, ov0Var2), ov0Var2, 390, 186);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), null, null, null, 0, j2, 0L, null, sb.a0(-2027620382, new qu0() { // from class: lv2
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z42 z42Var = (z42) obj;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z42Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((ov0) f30Var2).f(z42Var) ? 4 : 2;
                    }
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        dv1 dv1VarC = zm3.C(iw2.c, z42Var);
                        b52 b52Var = new b52(16.0f, 16.0f, 16.0f, 16.0f);
                        jo joVar = new jo(16.0f, true, new fo(0));
                        final long j4 = j3;
                        boolean zE = ov0Var2.e(j4);
                        final long j5 = jD2;
                        boolean zE2 = zE | ov0Var2.e(j5);
                        final s03 s03Var = ey1VarS;
                        boolean zF2 = zE2 | ov0Var2.f(s03Var);
                        final long j6 = jD3;
                        boolean zE3 = zF2 | ov0Var2.e(j6);
                        final RadioSharingManager radioSharingManager2 = radioSharingManager;
                        boolean zH2 = zE3 | ov0Var2.h(radioSharingManager2);
                        final CloudAccountState cloudAccountState2 = cloudAccountState;
                        boolean zH3 = zH2 | ov0Var2.h(cloudAccountState2);
                        final boolean z3 = z;
                        boolean zG = zH3 | ov0Var2.g(z3);
                        Object objQ4 = ov0Var2.Q();
                        if (zG || objQ4 == d30.a) {
                            final ey1 ey1Var3 = ey1Var2;
                            lu0 lu0Var = new lu0() { // from class: fv2
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj4) {
                                    kd1 kd1Var = (kd1) obj4;
                                    kd1Var.getClass();
                                    final long j7 = j4;
                                    final long j8 = j5;
                                    final long j9 = j6;
                                    final RadioSharingManager radioSharingManager3 = radioSharingManager2;
                                    final CloudAccountState cloudAccountState3 = cloudAccountState2;
                                    final s03 s03Var2 = s03Var;
                                    kd1Var.a(null, null, new p10(new qu0() { // from class: gv2
                                        @Override // defpackage.qu0
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            f30 f30Var3 = (f30) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((bc1) obj5).getClass();
                                            ov0 ov0Var3 = (ov0) f30Var3;
                                            if (ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                aw awVarT = ym3.t(j7, j8, ov0Var3, 0, 12);
                                                final long j10 = j9;
                                                final RadioSharingManager radioSharingManager4 = radioSharingManager3;
                                                final CloudAccountState cloudAccountState4 = cloudAccountState3;
                                                final s03 s03Var3 = s03Var2;
                                                sb.C(null, null, awVarT, null, sb.a0(-2045315671, new qu0() { // from class: kv2
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // defpackage.qu0
                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                        long j11;
                                                        f30 f30Var4 = (f30) obj9;
                                                        int iIntValue3 = ((Integer) obj10).intValue();
                                                        ((zz) obj8).getClass();
                                                        int i3 = 0;
                                                        ov0 ov0Var4 = (ov0) f30Var4;
                                                        if (ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            av1 av1Var = av1.a;
                                                            float f2 = 1.0f;
                                                            dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 18.0f);
                                                            yz yzVarA = wz.a(new jo(14.0f, true, new fo(0)), j9.r, ov0Var4, 6);
                                                            int iHashCode = Long.hashCode(ov0Var4.T);
                                                            l72 l72VarL = ov0Var4.l();
                                                            dv1 dv1VarH = xp1.H(ov0Var4, dv1VarD);
                                                            w20.b.getClass();
                                                            au0 au0Var2 = v20.b;
                                                            ov0Var4.g0();
                                                            if (ov0Var4.S) {
                                                                ov0Var4.k(au0Var2);
                                                            } else {
                                                                ov0Var4.p0();
                                                            }
                                                            gh ghVar = v20.e;
                                                            q73.h(ov0Var4, ghVar, yzVarA);
                                                            gh ghVar2 = v20.d;
                                                            q73.h(ov0Var4, ghVar2, l72VarL);
                                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                                            gh ghVar3 = v20.f;
                                                            q73.h(ov0Var4, ghVar3, numValueOf);
                                                            wa waVar = v20.g;
                                                            q73.g(ov0Var4, waVar);
                                                            gh ghVar4 = v20.c;
                                                            q73.h(ov0Var4, ghVar4, dv1VarH);
                                                            s83.b(ke0.N(2131625003, ov0Var4), null, 0L, 0L, jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(le3.a)).h, ov0Var4, 1572864, 0, 131006);
                                                            ov0 ov0Var5 = ov0Var4;
                                                            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                                                            float f3 = 8.0f;
                                                            kk2 kk2VarA = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var5, 6);
                                                            int iHashCode2 = Long.hashCode(ov0Var5.T);
                                                            l72 l72VarL2 = ov0Var5.l();
                                                            dv1 dv1VarH2 = xp1.H(ov0Var5, dv1VarE);
                                                            ov0Var5.g0();
                                                            if (ov0Var5.S) {
                                                                ov0Var5.k(au0Var2);
                                                            } else {
                                                                ov0Var5.p0();
                                                            }
                                                            q73.h(ov0Var5, ghVar, kk2VarA);
                                                            q73.h(ov0Var5, ghVar2, l72VarL2);
                                                            az2.s(iHashCode2, ov0Var5, ghVar3, ov0Var5, waVar);
                                                            q73.h(ov0Var5, ghVar4, dv1VarH2);
                                                            x01 x01VarI = k93.i();
                                                            s03 s03Var4 = s03Var3;
                                                            List listG = am1.G(new md3(x01VarI, 2131625011, Long.valueOf(((SharingUiState) s03Var4.getValue()).getCounts().getWifi())), new md3(am1.v(), 2131624991, Long.valueOf(((SharingUiState) s03Var4.getValue()).getCounts().getBluetooth())), new md3(ks.R(), 2131624992, Long.valueOf(((SharingUiState) s03Var4.getValue()).getCounts().getCells())));
                                                            ov0Var5.c0(-793294381);
                                                            Iterator it = listG.iterator();
                                                            ov0 ov0Var6 = ov0Var5;
                                                            while (true) {
                                                                boolean zHasNext = it.hasNext();
                                                                j11 = j10;
                                                                if (!zHasNext) {
                                                                    break;
                                                                }
                                                                md3 md3Var = (md3) it.next();
                                                                x01 x01Var = (x01) md3Var.e;
                                                                int iIntValue4 = ((Number) md3Var.f).intValue();
                                                                long jLongValue = ((Number) md3Var.g).longValue();
                                                                wb1 wb1Var = new wb1(f2, true);
                                                                yz yzVarA2 = wz.a(new jo(f3, true, new fo(i3)), j9.s, ov0Var6, 54);
                                                                int iHashCode3 = Long.hashCode(ov0Var6.T);
                                                                l72 l72VarL3 = ov0Var6.l();
                                                                dv1 dv1VarH3 = xp1.H(ov0Var6, wb1Var);
                                                                w20.b.getClass();
                                                                au0 au0Var3 = v20.b;
                                                                ov0Var6.g0();
                                                                if (ov0Var6.S) {
                                                                    ov0Var6.k(au0Var3);
                                                                } else {
                                                                    ov0Var6.p0();
                                                                }
                                                                q73.h(ov0Var6, v20.e, yzVarA2);
                                                                q73.h(ov0Var6, v20.d, l72VarL3);
                                                                q73.h(ov0Var6, v20.f, Integer.valueOf(iHashCode3));
                                                                q73.g(ov0Var6, v20.g);
                                                                q73.h(ov0Var6, v20.c, dv1VarH3);
                                                                s03 s03Var5 = s03Var4;
                                                                t01.a(x01Var, null, null, bk.g, ov0Var6, 3120, 4);
                                                                String strValueOf = ((SharingUiState) s03Var5.getValue()).getAvailable() ? String.valueOf(jLongValue) : "—";
                                                                cd2 cd2Var = le3.a;
                                                                ov0 ov0Var7 = ov0Var6;
                                                                s83.b(strValueOf, null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var6.j(cd2Var)).g, ov0Var7, 1572864, 0, 131006);
                                                                s83.b(ke0.N(iIntValue4, ov0Var7), null, j11, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var7.j(cd2Var)).l, ov0Var7, 0, 0, 131066);
                                                                ov0 ov0Var8 = ov0Var7;
                                                                ov0Var8.p(true);
                                                                s03Var4 = s03Var5;
                                                                f3 = 8.0f;
                                                                f2 = 1.0f;
                                                                i3 = 0;
                                                                ov0Var6 = ov0Var8;
                                                            }
                                                            boolean z4 = i3;
                                                            s03 s03Var6 = s03Var4;
                                                            ov0Var6.p(z4);
                                                            ov0Var6.p(true);
                                                            ov0 ov0Var9 = ov0Var6;
                                                            s83.b(ke0.N(2131624995, ov0Var6), null, j11, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var6.j(le3.a)).l, ov0Var9, 0, 0, 131066);
                                                            Object obj11 = radioSharingManager4;
                                                            boolean zH4 = ov0Var9.h(obj11);
                                                            Object objQ5 = ov0Var9.Q();
                                                            if (zH4 || objQ5 == d30.a) {
                                                                Object w12Var = new w12(0, obj11, RadioSharingManager.class, "refresh", "refresh()V", 0, 13);
                                                                ov0Var9.m0(w12Var);
                                                                objQ5 = w12Var;
                                                            }
                                                            au0 au0Var4 = (au0) ((o81) objQ5);
                                                            boolean z5 = (!cloudAccountState4.getValidated() || ((SharingUiState) s03Var6.getValue()).getLoading() || ((SharingUiState) s03Var6.getValue()).getUploading()) ? z4 ? 1 : 0 : true;
                                                            b52 b52Var2 = hu.a;
                                                            n51.h(au0Var4, null, z5, null, hu.e(0L, bk.g, ov0Var9, 13), null, null, ym3.k, ov0Var9, 805306368, 490);
                                                            ov0Var9.p(true);
                                                        } else {
                                                            ov0Var4.W();
                                                        }
                                                        return mf3.a;
                                                    }
                                                }, ov0Var3), ov0Var3, 196608, 27);
                                            } else {
                                                ov0Var3.W();
                                            }
                                            return mf3.a;
                                        }
                                    }, true, -922505545));
                                    final boolean z4 = z3;
                                    kd1Var.a(null, null, new p10(new qu0() { // from class: hv2
                                        @Override // defpackage.qu0
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            f30 f30Var3 = (f30) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((bc1) obj5).getClass();
                                            ov0 ov0Var3 = (ov0) f30Var3;
                                            if (ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                aw awVarT = ym3.t(j7, j8, ov0Var3, 0, 12);
                                                final long j10 = j9;
                                                final RadioSharingManager radioSharingManager4 = radioSharingManager3;
                                                final boolean z5 = z4;
                                                final s03 s03Var3 = s03Var2;
                                                sb.C(null, null, awVarT, null, sb.a0(1366660448, new qu0() { // from class: jv2
                                                    @Override // defpackage.qu0
                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                        f30 f30Var4 = (f30) obj9;
                                                        int iIntValue3 = ((Integer) obj10).intValue();
                                                        ((zz) obj8).getClass();
                                                        ov0 ov0Var4 = (ov0) f30Var4;
                                                        if (ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            av1 av1Var = av1.a;
                                                            dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 18.0f);
                                                            jo joVar2 = new jo(10.0f, true, new fo(0));
                                                            nr nrVar = j9.r;
                                                            yz yzVarA = wz.a(joVar2, nrVar, ov0Var4, 6);
                                                            int iHashCode = Long.hashCode(ov0Var4.T);
                                                            l72 l72VarL = ov0Var4.l();
                                                            dv1 dv1VarH = xp1.H(ov0Var4, dv1VarD);
                                                            w20.b.getClass();
                                                            x30 x30Var = v20.b;
                                                            ov0Var4.g0();
                                                            if (ov0Var4.S) {
                                                                ov0Var4.k(x30Var);
                                                            } else {
                                                                ov0Var4.p0();
                                                            }
                                                            gh ghVar = v20.e;
                                                            q73.h(ov0Var4, ghVar, yzVarA);
                                                            gh ghVar2 = v20.d;
                                                            q73.h(ov0Var4, ghVar2, l72VarL);
                                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                                            gh ghVar3 = v20.f;
                                                            q73.h(ov0Var4, ghVar3, numValueOf);
                                                            wa waVar = v20.g;
                                                            q73.g(ov0Var4, waVar);
                                                            gh ghVar4 = v20.c;
                                                            q73.h(ov0Var4, ghVar4, dv1VarH);
                                                            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var4, 48);
                                                            int iHashCode2 = Long.hashCode(ov0Var4.T);
                                                            l72 l72VarL2 = ov0Var4.l();
                                                            dv1 dv1VarH2 = xp1.H(ov0Var4, av1Var);
                                                            ov0Var4.g0();
                                                            if (ov0Var4.S) {
                                                                ov0Var4.k(x30Var);
                                                            } else {
                                                                ov0Var4.p0();
                                                            }
                                                            q73.h(ov0Var4, ghVar, kk2VarA);
                                                            q73.h(ov0Var4, ghVar2, l72VarL2);
                                                            az2.s(iHashCode2, ov0Var4, ghVar3, ov0Var4, waVar);
                                                            q73.h(ov0Var4, ghVar4, dv1VarH2);
                                                            dv1 dv1VarG = zm3.G(new wb1(1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
                                                            boolean z6 = false;
                                                            yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var4, 0);
                                                            int iHashCode3 = Long.hashCode(ov0Var4.T);
                                                            l72 l72VarL3 = ov0Var4.l();
                                                            dv1 dv1VarH3 = xp1.H(ov0Var4, dv1VarG);
                                                            ov0Var4.g0();
                                                            if (ov0Var4.S) {
                                                                ov0Var4.k(x30Var);
                                                            } else {
                                                                ov0Var4.p0();
                                                            }
                                                            q73.h(ov0Var4, ghVar, yzVarA2);
                                                            q73.h(ov0Var4, ghVar2, l72VarL3);
                                                            az2.s(iHashCode3, ov0Var4, ghVar3, ov0Var4, waVar);
                                                            q73.h(ov0Var4, ghVar4, dv1VarH3);
                                                            String strN = ke0.N(2131624997, ov0Var4);
                                                            hh0 hh0Var = le3.a;
                                                            s83.b(strN, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var)).h, ov0Var4, 0, 0, 131070);
                                                            String strN2 = ke0.N(2131625007, ov0Var4);
                                                            q93 q93Var = ((je3) ov0Var4.j(hh0Var)).l;
                                                            long j11 = j10;
                                                            s83.b(strN2, null, j11, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var4, 0, 0, 131066);
                                                            ov0Var4.p(true);
                                                            s03 s03Var4 = s03Var3;
                                                            boolean enabled = ((SharingUiState) s03Var4.getValue()).getEnabled();
                                                            RadioSharingManager radioSharingManager5 = radioSharingManager4;
                                                            boolean zH4 = ov0Var4.h(radioSharingManager5);
                                                            Object objQ5 = ov0Var4.Q();
                                                            if (zH4 || objQ5 == d30.a) {
                                                                l lVar = new l(1, radioSharingManager5, RadioSharingManager.class, "setEnabled", "setEnabled(Z)V", 0, 23);
                                                                ov0Var4.m0(lVar);
                                                                objQ5 = lVar;
                                                            }
                                                            lu0 lu0Var2 = (lu0) ((o81) objQ5);
                                                            if (((SharingUiState) s03Var4.getValue()).getEnabled() || (((SharingUiState) s03Var4.getValue()).getEligible() && ((SharingUiState) s03Var4.getValue()).getAvailable() && !((SharingUiState) s03Var4.getValue()).getLoading())) {
                                                                z6 = true;
                                                            }
                                                            long j12 = hz.c;
                                                            long j13 = bk.g;
                                                            boolean z7 = z5;
                                                            b43.a(enabled, lu0Var2, null, z6, mc0.m(j12, j13, j11, xp1.d(z7 ? 4282073674L : 4293126383L), hz.f, xp1.d(z7 ? 4281349694L : 4293586932L), ov0Var4, 57228), ov0Var4, 0, 76);
                                                            ov0Var4.p(true);
                                                            s83.b(ke0.N(2131624993, ov0Var4), null, j11, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var)).k, ov0Var4, 0, 0, 131066);
                                                            ov0Var4.p(true);
                                                        } else {
                                                            ov0Var4.W();
                                                        }
                                                        return mf3.a;
                                                    }
                                                }, ov0Var3), ov0Var3, 196608, 27);
                                            } else {
                                                ov0Var3.W();
                                            }
                                            return mf3.a;
                                        }
                                    }, true, -1944567058));
                                    kd1Var.a(null, null, new p10(new iv2(cloudAccountState3, j9, s03Var2), true, 486183407));
                                    if (((SharingUiState) s03Var2.getValue()).getEligible() && ((SharingUiState) s03Var2.getValue()).getAvailable()) {
                                        SharingCounts counts = ((SharingUiState) s03Var2.getValue()).getCounts();
                                        if (counts.getWifi() > 0 || counts.getBluetooth() > 0 || counts.getCells() > 0) {
                                            kd1Var.a(null, null, new p10(new bu(9, ey1Var3, s03Var2), true, -2095412974));
                                        }
                                    }
                                    return mf3.a;
                                }
                            };
                            ov0Var2.m0(lu0Var);
                            objQ4 = lu0Var;
                        }
                        ke0.d(dv1VarC, null, b52Var, joVar, null, null, false, null, (lu0) objQ4, ov0Var2, 24960, 490);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 805306416, 445);
            if (((Boolean) ey1Var2.getValue()).booleanValue()) {
                ov0Var.c0(-1664512571);
                Object objQ4 = ov0Var.Q();
                if (objQ4 == c30Var) {
                    ey1Var = ey1Var2;
                    objQ4 = new xj2(ey1Var, 15);
                    ov0Var.m0(objQ4);
                } else {
                    ey1Var = ey1Var2;
                }
                xq1.a((au0) objQ4, sb.a0(1685368670, new j2(radioSharingManager, ey1Var, 22), ov0Var), null, sb.a0(869321440, new bc(1, jD3, ey1Var), ov0Var), ym3.o, ym3.p, null, jD, 0L, jD2, jD3, null, ov0Var, 1772598, 12948);
                ov0Var = ov0Var;
                z2 = false;
            } else {
                z2 = false;
                ov0Var.c0(-68054095);
            }
            ov0Var.p(z2);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new f2(cloudAccountState, z, au0Var, i, 2);
        }
    }

    public static final fk n(t61 t61Var, String str) {
        t61Var.getClass();
        str.getClass();
        return new fk(str, t61Var.a);
    }

    public static final void o(int i, f30 f30Var, au0 au0Var, AppState appState, boolean z) {
        appState.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1962429918);
        int i2 = (ov0Var.h(appState) ? 4 : 2) | i | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objQ = ov0Var.Q();
            if (z2 || objQ == d30.a) {
                objQ = new o6(17, au0Var);
                ov0Var.m0(objQ);
            }
            zm3.b(bk.a(dv1VarE, (au0) objQ), 16.0f, new b52(16.0f, 14.0f, 16.0f, 14.0f), sb.a0(1876349135, new vy1(z, appState), ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new wy1(appState, z, au0Var, i);
        }
    }

    public static final e21 p(g21 g21Var, float f2, float f3, d21 d21Var, f30 f30Var) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = new e21(g21Var, fValueOf, fValueOf2, d21Var);
            ov0Var.m0(objQ);
        }
        e21 e21Var = (e21) objQ;
        boolean zH = ov0Var.h(d21Var);
        Object objQ2 = ov0Var.Q();
        if (zH || objQ2 == c30Var) {
            objQ2 = new q2(fValueOf, e21Var, fValueOf2, d21Var, 9);
            ov0Var.m0(objQ2);
        }
        oi0.i((au0) objQ2, ov0Var);
        boolean zH2 = ov0Var.h(g21Var);
        Object objQ3 = ov0Var.Q();
        if (zH2 || objQ3 == c30Var) {
            objQ3 = new j(24, g21Var, e21Var);
            ov0Var.m0(objQ3);
        }
        oi0.a(e21Var, (lu0) objQ3, ov0Var);
        return e21Var;
    }

    public static final void q(hj3 hj3Var, qm2 qm2Var, xe1 xe1Var) {
        qm2Var.getClass();
        xe1Var.getClass();
        km2 km2Var = (km2) hj3Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (km2Var == null || km2Var.g) {
            return;
        }
        km2Var.c0(qm2Var, xe1Var);
        we1 we1Var = ((ff1) xe1Var).d;
        if (we1Var == we1.f || we1Var.compareTo(we1.h) >= 0) {
            qm2Var.d();
        } else {
            xe1Var.a(new ta0(1, xe1Var, qm2Var));
        }
    }

    public static final ey1 r(Flow flow, Object obj, f30 f30Var, int i, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        sj0 sj0Var = sj0.e;
        boolean zH = ov0Var.h(sj0Var) | ov0Var.h(flow);
        Object objQ = ov0Var.Q();
        if (zH || objQ == d30.a) {
            objQ = new m(sj0Var, flow, null, 26);
            ov0Var.m0(objQ);
        }
        return ce0.R(obj, flow, sj0Var, (pu0) objQ, ov0Var, i & 896);
    }

    public static final ey1 s(StateFlow stateFlow, f30 f30Var) {
        return r(stateFlow, stateFlow.getValue(), f30Var, 0, 0);
    }

    public static final wg2 t(Throwable th) {
        th.getClass();
        return new wg2(th);
    }

    public static final pe2 u(cv1 cv1Var, boolean z, boolean z2) {
        if (!cv1Var.e.r) {
            return pe2.e;
        }
        if (z) {
            return xp1.L(cv1Var, 8).P1();
        }
        xz1 xz1VarL = xp1.L(cv1Var, 8);
        return wc0.F(xz1VarL).d0(xz1VarL, z2);
    }

    public static final long v(long j, boolean z, int i, float f2) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && l50.d(j)) ? l50.h(j) : Integer.MAX_VALUE;
        if (l50.j(j) != iH) {
            iH = mh0.v(gh0.p(f2), l50.j(j), iH);
        }
        return da0.t(0, iH, 0, l50.g(j));
    }

    public static Object w(Class cls) {
        ox oxVarA = xe2.a(cls);
        gn gnVar = j9.O;
        if (gnVar != null) {
            return ((kn2) ((mn2) gnVar.a).h).a(oxVarA, null);
        }
        fo.n("KoinApplication has not been started");
        return null;
    }

    public static void x(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }

    public static final x01 y() {
        x01 x01Var = c;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(20.0f, 6.0f);
        nx0Var.i(-8.0f);
        nx0Var.l(-1.41f, -1.41f);
        nx0Var.f(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
        nx0Var.k(4.0f, 4.0f);
        nx0Var.g(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        nx0Var.k(2.0f, 18.0f);
        nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nx0Var.i(16.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0Var.k(22.0f, 8.0f);
        nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.e();
        nx0Var.m(19.0f, 18.0f);
        nx0Var.k(5.0f, 18.0f);
        nx0Var.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0Var.k(4.0f, 9.0f);
        nx0Var.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        nx0Var.i(14.0f);
        nx0Var.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        nx0Var.s(8.0f);
        nx0Var.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        c = x01VarB;
        return x01VarB;
    }

    public static final x01 z() {
        x01 x01Var = d;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Place", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 2.0f);
        nx0VarI.g(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        nx0VarI.g(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f);
        nx0VarI.g(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        nx0VarI.f(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        nx0VarI.f(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 12.0f);
        nx0VarI.g(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        nx0VarI.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        nx0VarI.g(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        nx0VarI.f(14.0f, 11.1f, 13.1f, 12.0f, 12.0f, 12.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        d = x01VarB;
        return x01VarB;
    }
}
