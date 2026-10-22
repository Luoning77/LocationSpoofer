package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class vd0 {
    public static x01 a;
    public static x01 b;
    public static x01 c;
    public static x01 d;
    public static x01 e;
    public static x01 f;
    public static x01 g;
    public static x01 h;

    public static final boolean A(dq0 dq0Var) {
        hb1 hb1Var;
        xz1 xz1Var;
        hb1 hb1Var2;
        xz1 xz1Var2 = dq0Var.l;
        return (xz1Var2 == null || (hb1Var = xz1Var2.s) == null || !hb1Var.H() || (xz1Var = dq0Var.l) == null || (hb1Var2 = xz1Var.s) == null || !hb1Var2.G()) ? false : true;
    }

    public static final boolean B(hb1 hb1Var) {
        if (hb1Var.m == null) {
            return false;
        }
        hb1 hb1VarU = hb1Var.u();
        return (hb1VarU != null ? hb1VarU.m : null) == null || hb1Var.L.b;
    }

    public static cs2 C(String str) {
        int i;
        int iIntValue = 0;
        Object obj = 0;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = l13.D0(l13.q0(lowerCase, "v")).toString();
        int iH0 = l13.h0(string, '-', 0, 6);
        if (iH0 < 0) {
            iH0 = l13.h0(string, '_', 0, 6);
        }
        String strSubstring = iH0 >= 0 ? string.substring(0, iH0) : string;
        String strSubstring2 = iH0 >= 0 ? string.substring(iH0 + 1) : "";
        List listU0 = l13.u0(strSubstring, new char[]{'.'}, 6);
        ArrayList arrayList = new ArrayList(az.Y(listU0, 10));
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            Integer numA0 = s13.a0((String) it.next());
            arrayList.add(Integer.valueOf(numA0 != null ? numA0.intValue() : 0));
        }
        int iIntValue2 = ((Number) (arrayList.size() > 0 ? arrayList.get(0) : obj)).intValue();
        int iIntValue3 = ((Number) (1 < arrayList.size() ? arrayList.get(1) : obj)).intValue();
        int iIntValue4 = ((Number) (2 < arrayList.size() ? arrayList.get(2) : 0)).intValue();
        boolean zC0 = l13.c0(strSubstring2, "beta", false);
        if (zC0) {
            Pattern patternCompile = Pattern.compile("\\d+");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(strSubstring2);
            matcher.getClass();
            vq1 vq1VarO = dh0.o(matcher, 0, strSubstring2);
            if (vq1VarO != null) {
                String strGroup = vq1VarO.a.group();
                strGroup.getClass();
                Integer numA1 = s13.a0(strGroup);
                if (numA1 != null) {
                    iIntValue = numA1.intValue();
                    i = iIntValue;
                }
            }
            i = 1;
        } else {
            i = iIntValue;
        }
        return new cs2(zC0, iIntValue2, iIntValue3, iIntValue4, i);
    }

    public static u43 D(String str, zk2 zk2Var) throws Exception {
        long j;
        Map mapB;
        lt2 lt2Var;
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (bl2VarA0.R()) {
                int iP = hd0.p(bl2VarA0, "name");
                int iP2 = hd0.p(bl2VarA0, "type");
                int iP3 = hd0.p(bl2VarA0, "notnull");
                int iP4 = hd0.p(bl2VarA0, "pk");
                int iP5 = hd0.p(bl2VarA0, "dflt_value");
                so1 so1Var = new so1();
                while (true) {
                    String strM = bl2VarA0.m(iP);
                    j = j2;
                    so1Var.put(strM, new r43(strM, bl2VarA0.m(iP2), bl2VarA0.getLong(iP3) != j2, (int) bl2VarA0.getLong(iP4), bl2VarA0.isNull(iP5) ? null : bl2VarA0.m(iP5), 2));
                    if (!bl2VarA0.R()) {
                        break;
                    }
                    j2 = j;
                }
                mapB = so1Var.b();
                am1.j(bl2VarA0, null);
            } else {
                mapB = vj0.e;
                am1.j(bl2VarA0, null);
                j = 0;
            }
            bl2 bl2VarA1 = zk2Var.a0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iP6 = hd0.p(bl2VarA1, "id");
                int iP7 = hd0.p(bl2VarA1, "seq");
                int iP8 = hd0.p(bl2VarA1, "table");
                int iP9 = hd0.p(bl2VarA1, "on_delete");
                int iP10 = hd0.p(bl2VarA1, "on_update");
                List listE = E(bl2VarA1);
                bl2VarA1.reset();
                lt2 lt2Var2 = new lt2();
                while (bl2VarA1.R()) {
                    if (bl2VarA1.getLong(iP7) == j) {
                        int i = (int) bl2VarA1.getLong(iP6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iP6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listE) {
                            int i3 = iP7;
                            List list = listE;
                            if (((or0) obj).e == i) {
                                arrayList3.add(obj);
                            }
                            iP7 = i3;
                            listE = list;
                        }
                        int i4 = iP7;
                        List list2 = listE;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            or0 or0Var = (or0) obj2;
                            arrayList.add(or0Var.g);
                            arrayList2.add(or0Var.h);
                            arrayList3 = arrayList3;
                        }
                        lt2Var2.add(new s43(bl2VarA1.m(iP8), bl2VarA1.m(iP9), bl2VarA1.m(iP10), arrayList, arrayList2));
                        iP6 = i2;
                        iP7 = i4;
                        listE = list2;
                    }
                }
                lt2 lt2VarL = mc0.l(lt2Var2);
                am1.j(bl2VarA1, null);
                bl2 bl2VarA2 = zk2Var.a0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iP11 = hd0.p(bl2VarA2, "name");
                    int iP12 = hd0.p(bl2VarA2, "origin");
                    int iP13 = hd0.p(bl2VarA2, "unique");
                    if (iP11 == -1 || iP12 == -1 || iP13 == -1) {
                        am1.j(bl2VarA2, null);
                        lt2Var = null;
                    } else {
                        lt2 lt2Var3 = new lt2();
                        while (bl2VarA2.R()) {
                            if ("c".equals(bl2VarA2.m(iP12))) {
                                t43 t43VarF = F(zk2Var, bl2VarA2.m(iP11), bl2VarA2.getLong(iP13) == 1);
                                if (t43VarF == null) {
                                    am1.j(bl2VarA2, null);
                                    lt2Var = null;
                                } else {
                                    lt2Var3.add(t43VarF);
                                }
                            }
                        }
                        lt2 lt2VarL2 = mc0.l(lt2Var3);
                        am1.j(bl2VarA2, null);
                        lt2Var = lt2VarL2;
                    }
                    return new u43(str, mapB, lt2VarL, lt2Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        am1.j(bl2VarA2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    am1.j(bl2VarA1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                am1.j(bl2VarA0, th5);
                throw th6;
            }
        }
    }

    public static final List E(bl2 bl2Var) {
        int iP = hd0.p(bl2Var, "id");
        int iP2 = hd0.p(bl2Var, "seq");
        int iP3 = hd0.p(bl2Var, "from");
        int iP4 = hd0.p(bl2Var, "to");
        mg1 mg1VarN = am1.n();
        while (bl2Var.R()) {
            mg1VarN.add(new or0(bl2Var.m(iP3), (int) bl2Var.getLong(iP), (int) bl2Var.getLong(iP2), bl2Var.m(iP4)));
        }
        return zy.B0(am1.f(mg1VarN));
    }

    public static final t43 F(zk2 zk2Var, String str, boolean z) throws Exception {
        bl2 bl2VarA0 = zk2Var.a0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iP = hd0.p(bl2VarA0, "seqno");
            int iP2 = hd0.p(bl2VarA0, "cid");
            int iP3 = hd0.p(bl2VarA0, "name");
            int iP4 = hd0.p(bl2VarA0, "desc");
            if (iP != -1 && iP2 != -1 && iP3 != -1 && iP4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (bl2VarA0.R()) {
                    if (((int) bl2VarA0.getLong(iP2)) >= 0) {
                        int i = (int) bl2VarA0.getLong(iP);
                        String strM = bl2VarA0.m(iP3);
                        String str2 = bl2VarA0.getLong(iP4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strM);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listC0 = zy.C0(linkedHashMap.entrySet(), new gq0(15));
                ArrayList arrayList = new ArrayList(az.Y(listC0, 10));
                Iterator it = listC0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listJ0 = zy.J0(arrayList);
                List listC1 = zy.C0(linkedHashMap2.entrySet(), new gq0(16));
                ArrayList arrayList2 = new ArrayList(az.Y(listC1, 10));
                Iterator it2 = listC1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                t43 t43Var = new t43(z, listJ0, zy.J0(arrayList2), str);
                am1.j(bl2VarA0, null);
                return t43Var;
            }
            am1.j(bl2VarA0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:24:0x007f, B:26:0x0089), top: B:42:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00af -> B:46:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object G(defpackage.vz2 r8, float r9, float r10, defpackage.lu0 r11, defpackage.au0 r12, defpackage.r60 r13) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd0.G(vz2, float, float, lu0, au0, r60):java.lang.Object");
    }

    public static final Rect H(l41 l41Var) {
        return new Rect(l41Var.a, l41Var.b, l41Var.c, l41Var.d);
    }

    public static final RectF I(pe2 pe2Var) {
        return new RectF(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d);
    }

    public static final pe2 J(RectF rectF) {
        return new pe2(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void K(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            s21.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        s21.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final long a(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void b(p10 p10Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-709502251);
        int i2 = 2;
        byte b2 = 0;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            hh0 hh0Var = vl2.a;
            tl2 tl2Var = (tl2) ov0Var.j(hh0Var);
            rl2 rl2VarF = ee0.F(ov0Var);
            Object[] objArr = {tl2Var};
            z92 z92Var = new z92(i2, new v70(8, b2), new j(26, tl2Var, rl2VarF));
            boolean zH = ov0Var.h(tl2Var) | ov0Var.h(rl2VarF);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                objQ = new m5(19, tl2Var, rl2VarF);
                ov0Var.m0(objQ);
            }
            be1 be1Var = (be1) wc0.d0(objArr, z92Var, (au0) objQ, ov0Var, 0);
            k22.b(hh0Var.a(be1Var), sb.a0(-412824043, new j2(17, p10Var, be1Var), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new c9(p10Var, i, i2);
        }
    }

    public static final void c(final String str, final boolean z, final lu0 lu0Var, final au0 au0Var, f30 f30Var, int i) {
        str.getClass();
        lu0Var.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-867673411);
        int i2 = i | (ov0Var.f(str) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i3 = 0;
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H("");
                ov0Var.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new vp0();
                ov0Var.m0(objQ2);
            }
            final vp0 vp0Var = (vp0) objQ2;
            long j = z ? bk.c : bk.f;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new ll2(vp0Var, null, i3);
                ov0Var.m0(objQ3);
            }
            oi0.e(ov0Var, (pu0) objQ3, mf3.a);
            final long j2 = j;
            sb.F(au0Var, new qc0(3), sb.a0(-381184250, new pu0() { // from class: il2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zm3.b(ji2.H(zm3.F(iw2.e(av1.a, 0.9f), 0.0f, 20.0f, 1)), 24.0f, new b52(20.0f, 20.0f, 20.0f, 20.0f), sb.a0(-1820866891, new jl2(z, str, j2, lu0Var, vp0Var, ey1Var, au0Var), ov0Var2), ov0Var2, 25008, 8);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, ((i2 >> 9) & 14) | 432, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(str, z, lu0Var, au0Var, i, 11);
        }
    }

    public static void d(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = d61.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = n82.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final e13 e(w90 w90Var) {
        w90Var.getClass();
        e13 e13Var = w90Var instanceof e13 ? (e13) w90Var : null;
        if (e13Var != null) {
            return e13Var;
        }
        b81.i(xe2.a(w90Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void f(ak0 ak0Var) {
        ak0Var.getClass();
        if ((ak0Var instanceof i71 ? (i71) ak0Var : null) != null) {
            return;
        }
        b81.i(xe2.a(ak0Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static float g(z60 z60Var, z60 z60Var2) {
        z60Var.getClass();
        z60Var2.getClass();
        double radians = Math.toRadians(z60Var.a);
        double radians2 = Math.toRadians(z60Var2.a);
        double radians3 = Math.toRadians(z60Var2.b - z60Var.b);
        return (float) ((Math.toDegrees(Math.atan2(Math.cos(radians2) * Math.sin(radians3), (Math.sin(radians2) * Math.cos(radians)) - (Math.cos(radians3) * (Math.cos(radians2) * Math.sin(radians))))) + 360.0d) % 360.0d);
    }

    public static final int h(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static String i(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i10][i11];
                    byte[] bArr3 = bh3.a;
                    int i13 = b2 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b3 = bArr[i7 + i12];
                byte[] bArr4 = bh3.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static final void j(t61 t61Var, y81 y81Var, y81 y81Var2, String str) {
        bt2 descriptor = y81Var2.getDescriptor();
        descriptor.getClass();
        t61Var.getClass();
        ym3.J(t61Var, descriptor);
        if (xq1.A(descriptor).contains(str)) {
            String strB = y81Var.getDescriptor().b();
            String strB2 = y81Var2.getDescriptor().b();
            throw new j71(az2.p(p91.t("Class '", strB2, "' cannot be serialized ", (t61Var.a.j == nx.f && o51.f(strB, strB2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : p91.p("as base class '", strB, '\''), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static final void k(mh0 mh0Var) {
        mh0Var.getClass();
        if (mh0Var instanceof ft2) {
            fo.n("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (mh0Var instanceof bc2) {
            fo.n("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (mh0Var instanceof ja2) {
            fo.n("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String l(t61 t61Var, bt2 bt2Var) {
        bt2Var.getClass();
        t61Var.getClass();
        for (Annotation annotation : bt2Var.getAnnotations()) {
            if (annotation instanceof z61) {
                return ((z61) annotation).discriminator();
            }
        }
        return t61Var.a.h;
    }

    public static z60 m(z60 z60Var, double d2, double d3) {
        z60Var.getClass();
        double d4 = d3 / 6378137.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(z60Var.a);
        double radians3 = Math.toRadians(z60Var.b);
        double dAsin = Math.asin((Math.cos(radians) * Math.sin(d4) * Math.cos(radians2)) + (Math.cos(d4) * Math.sin(radians2)));
        return new z60(Math.toDegrees(dAsin), Math.toDegrees(Math.atan2(Math.cos(radians2) * Math.sin(d4) * Math.sin(radians), Math.cos(d4) - (Math.sin(dAsin) * Math.sin(radians2))) + radians3));
    }

    public static final Object n(ca2 ca2Var, s63 s63Var, q60 q60Var) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new s3(ca2Var, s63Var, null), q60Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }

    public static double o(z60 z60Var, z60 z60Var2) {
        z60Var.getClass();
        z60Var2.getClass();
        double d2 = z60Var2.a;
        double d3 = z60Var.a;
        double radians = Math.toRadians(d2 - d3);
        double radians2 = Math.toRadians(z60Var2.b - z60Var.b);
        double dPow = (Math.pow(Math.sin(radians2 / 2.0d), 2.0d) * Math.cos(Math.toRadians(d2)) * Math.cos(Math.toRadians(d3))) + Math.pow(Math.sin(radians / 2.0d), 2.0d);
        return Math.atan2(Math.sqrt(dPow), Math.sqrt(1.0d - dPow)) * 1.2756274E7d;
    }

    public static final dq0 p(dq0 dq0Var) {
        dq0 dq0VarG = ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).g();
        if (dq0VarG == null || !dq0VarG.r) {
            return null;
        }
        return dq0VarG;
    }

    public static final int q(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int r(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final pe2 s(dq0 dq0Var) {
        xz1 xz1Var;
        if (dq0Var.r && (xz1Var = dq0Var.l) != null) {
            pa1 pa1VarF = wc0.F(xz1Var);
            if (!pa1VarF.U()) {
                pa1VarF = null;
            }
            if (pa1VarF != null) {
                return dq0Var.p1(pa1VarF);
            }
        }
        return pe2.e;
    }

    public static yt1 t(yt1 yt1Var, qa1 qa1Var, q93 q93Var, xb0 xb0Var, lq0 lq0Var) {
        if (yt1Var != null && qa1Var == yt1Var.a && r93.c(q93Var, qa1Var).equals(yt1Var.b) && xb0Var.g() == yt1Var.c.e && lq0Var == yt1Var.d) {
            return yt1Var;
        }
        yt1 yt1Var2 = yt1.h;
        if (yt1Var2 != null && qa1Var == yt1Var2.a && r93.c(q93Var, qa1Var).equals(yt1Var2.b) && xb0Var.g() == yt1Var2.c.e && lq0Var == yt1Var2.d) {
            return yt1Var2;
        }
        yt1 yt1Var3 = new yt1(qa1Var, r93.c(q93Var, qa1Var), new ac0(xb0Var.g(), xb0Var.D()), lq0Var);
        yt1.h = yt1Var3;
        return yt1Var3;
    }

    public static final dq0 u(dq0 dq0Var) {
        boolean z = dq0Var.e.r;
        if (z) {
            if (!z) {
                p21.c("visitChildren called on an unattached node");
            }
            gy1 gy1Var = new gy1(new cv1[16]);
            cv1 cv1Var = dq0Var.e;
            cv1 cv1Var2 = cv1Var.j;
            if (cv1Var2 == null) {
                xp1.h(gy1Var, cv1Var);
            } else {
                gy1Var.b(cv1Var2);
            }
            while (true) {
                int i = gy1Var.g;
                if (i == 0) {
                    break;
                }
                cv1 cv1VarJ = (cv1) gy1Var.k(i - 1);
                if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                    xp1.h(gy1Var, cv1VarJ);
                } else {
                    while (cv1VarJ != null) {
                        if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            gy1 gy1Var2 = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof dq0) {
                                    dq0 dq0Var2 = (dq0) cv1VarJ;
                                    if (dq0Var2.e.r) {
                                        int iOrdinal = dq0Var2.r1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return dq0Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            b81.d();
                                            return null;
                                        }
                                    }
                                } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i2 = 0;
                                    for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                        if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cv1VarJ = cv1Var3;
                                            } else {
                                                if (gy1Var2 == null) {
                                                    gy1Var2 = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var2.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var2.b(cv1Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var2);
                            }
                            break;
                        }
                        cv1VarJ = cv1VarJ.j;
                    }
                }
            }
        }
        return null;
    }

    public static final x01 w() {
        x01 x01Var = a;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(3.0f, 17.46f);
        nx0Var.s(3.04f);
        nx0Var.g(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        nx0Var.i(3.04f);
        nx0Var.g(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        nx0Var.k(17.81f, 9.94f);
        nx0Var.l(-3.75f, -3.75f);
        nx0Var.k(3.15f, 17.1f);
        nx0Var.g(-0.1f, 0.1f, -0.15f, 0.22f, -0.15f, 0.36f);
        nx0Var.e();
        nx0Var.m(20.71f, 7.04f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0Var.l(-2.34f, -2.34f);
        nx0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0Var.l(-1.83f, 1.83f);
        nx0Var.l(3.75f, 3.75f);
        nx0Var.l(1.83f, -1.83f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        a = x01VarB;
        return x01VarB;
    }

    public static final x01 x() {
        x01 x01Var = c;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Map", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(14.65f, 4.98f);
        nx0Var.l(-5.0f, -1.75f);
        nx0Var.g(-0.42f, -0.15f, -0.88f, -0.15f, -1.3f, -0.01f);
        nx0Var.k(4.36f, 4.56f);
        nx0Var.f(3.55f, 4.84f, 3.0f, 5.6f, 3.0f, 6.46f);
        nx0Var.s(11.85f);
        nx0Var.g(0.0f, 1.41f, 1.41f, 2.37f, 2.72f, 1.86f);
        nx0Var.l(2.93f, -1.14f);
        nx0Var.g(0.22f, -0.09f, 0.47f, -0.09f, 0.69f, -0.01f);
        nx0Var.l(5.0f, 1.75f);
        nx0Var.g(0.42f, 0.15f, 0.88f, 0.15f, 1.3f, 0.01f);
        nx0Var.l(3.99f, -1.34f);
        nx0Var.g(0.81f, -0.27f, 1.36f, -1.04f, 1.36f, -1.9f);
        nx0Var.r(5.69f);
        nx0Var.g(0.0f, -1.41f, -1.41f, -2.37f, -2.72f, -1.86f);
        nx0Var.l(-2.93f, 1.14f);
        nx0Var.g(-0.22f, 0.08f, -0.46f, 0.09f, -0.69f, 0.01f);
        nx0Var.e();
        nx0Var.m(15.0f, 18.89f);
        nx0Var.l(-6.0f, -2.11f);
        nx0Var.r(5.11f);
        nx0Var.l(6.0f, 2.11f);
        nx0Var.s(11.67f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        c = x01VarB;
        return x01VarB;
    }

    public static final x01 y() {
        x01 x01Var = d;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.MyLocation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 8.0f);
        nx0VarI.g(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        nx0VarI.o(1.79f, 4.0f, 4.0f, 4.0f);
        nx0VarI.o(4.0f, -1.79f, 4.0f, -4.0f);
        nx0VarI.o(-1.79f, -4.0f, -4.0f, -4.0f);
        nx0VarI.e();
        nx0VarI.m(20.94f, 11.0f);
        nx0VarI.g(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        nx0VarI.k(13.0f, 2.0f);
        nx0VarI.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        nx0VarI.o(-1.0f, 0.45f, -1.0f, 1.0f);
        nx0VarI.s(1.06f);
        nx0VarI.f(6.83f, 3.52f, 3.52f, 6.83f, 3.06f, 11.0f);
        nx0VarI.k(2.0f, 11.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        nx0VarI.o(0.45f, 1.0f, 1.0f, 1.0f);
        nx0VarI.i(1.06f);
        nx0VarI.g(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        nx0VarI.k(11.0f, 22.0f);
        nx0VarI.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        nx0VarI.o(1.0f, -0.45f, 1.0f, -1.0f);
        nx0VarI.s(-1.06f);
        nx0VarI.g(4.17f, -0.46f, 7.48f, -3.77f, 7.94f, -7.94f);
        nx0VarI.k(22.0f, 13.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0VarI.o(-0.45f, -1.0f, -1.0f, -1.0f);
        nx0VarI.i(-1.06f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 19.0f);
        nx0VarI.g(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        nx0VarI.o(3.13f, -7.0f, 7.0f, -7.0f);
        nx0VarI.o(7.0f, 3.13f, 7.0f, 7.0f);
        nx0VarI.o(-3.13f, 7.0f, -7.0f, 7.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        d = x01VarB;
        return x01VarB;
    }

    public static final x01 z() {
        x01 x01Var = h;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(18.0f, 16.08f);
        nx0VarI.g(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        nx0VarI.k(8.91f, 12.7f);
        nx0VarI.g(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        nx0VarI.o(-0.04f, -0.47f, -0.09f, -0.7f);
        nx0VarI.l(7.05f, -4.11f);
        nx0VarI.g(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        nx0VarI.g(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        nx0VarI.o(-1.34f, -3.0f, -3.0f, -3.0f);
        nx0VarI.o(-3.0f, 1.34f, -3.0f, 3.0f);
        nx0VarI.g(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        nx0VarI.k(8.04f, 9.81f);
        nx0VarI.f(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        nx0VarI.g(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        nx0VarI.o(1.34f, 3.0f, 3.0f, 3.0f);
        nx0VarI.g(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        nx0VarI.l(7.12f, 4.16f);
        nx0VarI.g(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        nx0VarI.g(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        nx0VarI.o(2.92f, -1.31f, 2.92f, -2.92f);
        nx0VarI.o(-1.31f, -2.92f, -2.92f, -2.92f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        h = x01VarB;
        return x01VarB;
    }

    public abstract pe2 v();
}
