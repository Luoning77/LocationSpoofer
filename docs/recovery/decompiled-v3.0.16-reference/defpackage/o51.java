package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteGeometryKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class o51 {
    public static final p10 A;
    public static final p10 B;
    public static final p10 C;
    public static final qd3 C0;
    public static final p10 D;
    public static final qd3 D0;
    public static x01 E0;
    public static final p10 G;
    public static final p10 I;
    public static final p10 J;
    public static final p10 K;
    public static final p10 N;
    public static final p10 O;
    public static final p10 P;
    public static final p10 Q;
    public static final p10 S;
    public static final p10 Y;
    public static final p10 Z;
    public static final go a;
    public static final p10 a0;
    public static final go b;
    public static final p10 b0;
    public static final p10 c;
    public static final p10 c0;
    public static final p10 d;
    public static final p10 e0;
    public static final p10 f;
    public static final p10 f0;
    public static final p10 g;
    public static final p10 h;
    public static final p10 h0;
    public static final p10 i;
    public static final v70 i0;
    public static final p10 j;
    public static final kf j0;
    public static final p10 k;
    public static final p10 l;
    public static final p10 o;
    public static final p10 p;
    public static final iy0 p0;
    public static final gt2 t0;
    public static final p10 u;
    public static final p10 v;
    public static final p10 w;
    public static final qd3 w0;
    public static final qd3 x0;
    public static final p10 y;
    public static final qd3 y0;
    public static final p10 z;
    public static final qd3 z0;
    public static final p10 e = new p10(new q10(6), false, -1367362919);
    public static final p10 m = new p10(new q10(3), false, 1757058355);
    public static final p10 n = new p10(new q10(11), false, -1820165139);
    public static final p10 q = new p10(new q10(25), false, 1347183098);
    public static final p10 r = new p10(new q10(26), false, -775030353);
    public static final p10 s = new p10(new q10(27), false, -417396566);
    public static final p10 t = new p10(new q10(28), false, 161936333);
    public static final p10 x = new p10(new e00(16), false, 326090930);
    public static final p10 E = new p10(new q10(4), false, 1222398483);
    public static final p10 F = new p10(new q10(5), false, 1731177297);
    public static final p10 H = new p10(new q10(7), false, 1257222420);
    public static final p10 L = new p10(new q10(9), false, 1292046357);
    public static final p10 M = new p10(new q10(10), false, 1800825171);
    public static final p10 R = new p10(new e00(25), false, -881826928);
    public static final p10 T = new p10(new q10(16), false, -1931098774);
    public static final p10 U = new p10(new e00(26), false, -16323793);
    public static final p10 V = new p10(new e00(27), false, -1750684160);
    public static final p10 W = new p10(new e00(28), false, -2127401289);
    public static final p10 X = new p10(new e00(29), false, 1766284036);
    public static final p10 d0 = new p10(new c20(25), false, -2116413024);
    public static final p10 g0 = new p10(new d20(16), false, 1651476058);
    public static final zs0 k0 = new zs0(16);
    public static final lz l0 = lz.q;
    public static final float m0 = 3.0f;
    public static final cu2 n0 = cu2.f;
    public static final StackTraceElement[] o0 = new StackTraceElement[0];
    public static final bs2 q0 = new bs2(35.0d, 105.0d);
    public static final bs2 r0 = new bs2(-12.0d, 72.0d);
    public static final bs2 s0 = new bs2(55.0d, 142.0d);
    public static final Object u0 = new Object();
    public static final qd3 v0 = new qd3(new i73(16), new kh3(3));
    public static final qd3 A0 = new qd3(new i73(25), new i73(26));
    public static final qd3 B0 = new qd3(new i73(27), new i73(28));

    static {
        byte b2 = 0;
        a = new go(b2);
        int i2 = 1;
        b = new go(i2);
        int i3 = 12;
        c = new p10(new e00(i3), false, -1974562075);
        int i4 = 14;
        d = new p10(new e00(i4), false, -2031708603);
        int i5 = 13;
        f = new p10(new q10(i5), false, -858653581);
        int i6 = 18;
        g = new p10(new q10(i6), false, -874084211);
        int i7 = 19;
        h = new p10(new q10(i7), false, -1211862640);
        int i8 = 20;
        i = new p10(new q10(i8), false, 944931624);
        int i9 = 21;
        j = new p10(new q10(i9), false, 2010538147);
        int i10 = 22;
        k = new p10(new q10(i10), false, -2144290164);
        int i11 = 23;
        l = new p10(new q10(i11), false, 755554651);
        int i12 = 17;
        o = new p10(new q10(i12), false, 859418582);
        int i13 = 24;
        p = new p10(new q10(i13), false, -842882075);
        u = new p10(new r10(i2), false, 1783533605);
        v = new p10(new e00(i5), false, -1471231752);
        int i14 = 15;
        w = new p10(new e00(i14), false, 2131782286);
        y = new p10(new e00(i12), false, -1547122607);
        z = new p10(new q10(b2), false, -780916789);
        A = new p10(new q10(i2), false, 1187574546);
        int i15 = 2;
        B = new p10(new q10(i15), false, 1696353360);
        C = new p10(new e00(i6), false, -140570901);
        D = new p10(new e00(i7), false, 113818506);
        G = new p10(new e00(i8), false, -105746964);
        int i16 = 8;
        I = new p10(new q10(i16), false, 1766001234);
        J = new p10(new e00(i9), false, -70923027);
        K = new p10(new e00(i10), false, -1256362756);
        N = new p10(new e00(i11), false, -36099090);
        O = new p10(new e00(i13), false, 218290317);
        P = new p10(new q10(i3), false, -1696773687);
        Q = new p10(new q10(i4), false, 739785547);
        S = new p10(new q10(i14), false, 1696486632);
        Y = new p10(new r10(b2), false, -1951073032);
        Z = new p10(new s10(i10), false, -1629795882);
        a0 = new p10(new a20(i16), false, -288219311);
        b0 = new p10(new b20(i7), false, 1149209284);
        c0 = new p10(new b20(i8), false, -634590277);
        e0 = new p10(new d20(i4), false, 1488168927);
        f0 = new p10(new d20(i14), false, -1040366342);
        h0 = new p10(new d20(i12), false, -293882287);
        i0 = new v70(3, b2);
        j0 = new kf(i15);
        p0 = new iy0(i15);
        t0 = new gt2(i15);
        w0 = new qd3(new i73(i12), new i73(18));
        x0 = new qd3(new i73(i7), new i73(i8));
        y0 = new qd3(new i73(i9), new i73(i10));
        z0 = new qd3(new i73(i11), new i73(i13));
        C0 = new qd3(new i73(29), new kh3(b2));
        D0 = new qd3(new kh3(1), new kh3(i15));
    }

    public static void A(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String B(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static mx2 C() {
        return new mx2(0);
    }

    public static yz2 D(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new yz2(f2, f3, obj);
    }

    public static void E() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void F(String str) {
        iv ivVar = new iv(az2.k("lateinit property ", str, " has not been initialized"));
        A(ivVar, o51.class.getName());
        throw ivVar;
    }

    public static String G(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        return i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final boolean H(Throwable th, au0 au0Var) throws IllegalAccessException, InvocationTargetException {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = d61.a;
        oc0 oc0Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = n82.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = uj0.e;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof oc0) {
                return false;
            }
        }
        try {
            s20 s20Var = (s20) au0Var.invoke();
            if (s20Var != null) {
                boolean z3 = s20Var.b;
                List list = s20Var.a;
                if (z3) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((u20) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z2 = true;
                }
            }
            if (z2) {
                s20Var.getClass();
                oc0Var = new oc0(s20Var);
            }
        } catch (Throwable th2) {
            oc0Var = th2;
        }
        if (oc0Var != null) {
            vd0.d(th, oc0Var);
        }
        return z2;
    }

    public static od3 I(int i2, int i3, jh0 jh0Var) {
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            jh0Var = lh0.a;
        }
        return new od3(i2, i4, jh0Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x044c  */
    /* JADX WARN: Code duplicated, block: B:113:0x048a  */
    /* JADX WARN: Code duplicated, block: B:118:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:123:0x0510  */
    /* JADX WARN: Code duplicated, block: B:124:0x0514  */
    /* JADX WARN: Code duplicated, block: B:127:0x053a  */
    /* JADX WARN: Code duplicated, block: B:129:0x056b  */
    /* JADX WARN: Code duplicated, block: B:130:0x056f  */
    /* JADX WARN: Code duplicated, block: B:132:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:135:0x060e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0612  */
    /* JADX WARN: Code duplicated, block: B:139:0x064b  */
    /* JADX WARN: Code duplicated, block: B:140:0x064f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0702  */
    /* JADX WARN: Code duplicated, block: B:144:0x0706  */
    /* JADX WARN: Code duplicated, block: B:146:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0316  */
    /* JADX WARN: Code duplicated, block: B:89:0x0327  */
    /* JADX WARN: Code duplicated, block: B:92:0x0338  */
    /* JADX WARN: Code duplicated, block: B:95:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    public static final void a(final l6 l6Var, au0 au0Var, f30 f30Var, final int i2, final int i3) {
        int i4;
        au0 au0Var2;
        int i5;
        boolean z2;
        final au0 au0Var3;
        ov0 ov0Var;
        ee2 ee2VarT;
        pu0 pu0Var;
        au0 au0Var4;
        ey1 ey1VarS;
        ey1 ey1VarS2;
        boolean z3;
        boolean hasSession;
        iy0 iy0Var;
        av1 av1Var;
        c30 c30Var;
        int i6;
        int i7;
        au0 au0Var5;
        Object objQ;
        ey1 ey1Var;
        Object objQ2;
        ey1 ey1Var2;
        Object objQ3;
        ey1 ey1Var3;
        Object objQ4;
        Object objQ5;
        op0 op0Var;
        u4 u4VarK;
        final boolean z4;
        String failureCode;
        String str;
        String str2;
        op0 op0Var2;
        final l6 l6Var2;
        av1 av1Var2;
        u4 u4Var;
        c30 c30Var2;
        final ey1 ey1Var4;
        int i8;
        final ey1 ey1Var5;
        final ey1 ey1Var6;
        boolean z5;
        ov0 ov0Var2;
        u4 u4Var2;
        op0 op0Var3;
        boolean zF;
        Object objQ6;
        u4 u4Var3;
        op0 op0Var4;
        boolean z6;
        x30 x30Var;
        gh ghVar;
        gh ghVar2;
        gh ghVar3;
        wa waVar;
        gh ghVar4;
        ey1 ey1Var7;
        au0 au0Var6;
        wa waVar2;
        gh ghVar5;
        ?? r9;
        av1 av1Var3;
        gh ghVar6;
        ?? r5;
        ov0 ov0Var3;
        boolean z7;
        ov0 ov0Var4;
        int iJ;
        boolean z8;
        ov0 ov0Var5;
        nr nrVar = j9.s;
        ov0 ov0Var6 = (ov0) f30Var;
        ov0Var6.e0(705656183);
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var6.h(l6Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                au0Var2 = au0Var;
                i4 |= ov0Var6.h(au0Var2) ? 32 : 16;
            }
            i5 = i4;
            if ((i5 & 19) != 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var6.T(i5 & 1, z2)) {
                if (i9 != 0) {
                    au0Var4 = null;
                } else {
                    au0Var4 = au0Var2;
                }
                ey1VarS = ee0.s(l6Var.c, ov0Var6);
                ey1VarS2 = ee0.s(l6Var.p, ov0Var6);
                ey1 ey1VarS3 = ee0.s(l6Var.r, ov0Var6);
                if (!((Boolean) ey1VarS2.getValue()).booleanValue() || ((CloudAccountState) ey1VarS.getValue()).getChecking() || ((CloudAccountState) ey1VarS.getValue()).getInitializing()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                hasSession = ((CloudAccountState) ey1VarS.getValue()).getHasSession();
                iy0Var = p0;
                av1Var = av1.a;
                c30Var = d30.a;
                if (hasSession || ((CloudAccountState) ey1VarS.getValue()).getValidated()) {
                    i6 = 0;
                    i7 = 1;
                    au0Var5 = au0Var4;
                    ov0Var6.c0(-1663238677);
                    ov0Var6.p(false);
                    Object[] objArr = new Object[0];
                    objQ = ov0Var6.Q();
                    if (objQ == c30Var) {
                        objQ = new p4(i6);
                        ov0Var6.m0(objQ);
                    }
                    ey1Var = (ey1) wc0.c0(objArr, (au0) objQ, ov0Var6, 48);
                    Object[] objArr2 = new Object[0];
                    objQ2 = ov0Var6.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new p4(i7);
                        ov0Var6.m0(objQ2);
                    }
                    ey1Var2 = (ey1) wc0.c0(objArr2, (au0) objQ2, ov0Var6, 48);
                    objQ3 = ov0Var6.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = ke0.H("");
                        ov0Var6.m0(objQ3);
                    }
                    ey1Var3 = (ey1) objQ3;
                    objQ4 = ov0Var6.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = ke0.H("");
                        ov0Var6.m0(objQ4);
                    }
                    final ey1 ey1Var8 = (ey1) objQ4;
                    objQ5 = ov0Var6.Q();
                    if (objQ5 == c30Var) {
                        objQ5 = ke0.H(Boolean.FALSE);
                        ov0Var6.m0(objQ5);
                    }
                    final ey1 ey1Var9 = (ey1) objQ5;
                    op0Var = (op0) ov0Var6.j(z30.i);
                    u4VarK = k22.K(((Boolean) ey1Var.getValue()).booleanValue(), z3, l6Var.d, (String) ey1Var2.getValue(), (String) ey1Var3.getValue(), (String) ey1Var8.getValue());
                    z4 = z3;
                    failureCode = (String) ey1VarS3.getValue();
                    if (failureCode == null) {
                        failureCode = ((CloudAccountState) ey1VarS.getValue()).getFailureCode();
                    }
                    str = failureCode;
                    if (z4 && zy.g0(yo.H0(new String[]{"hardware_confirmation_required", "hardware_conflict"}), str)) {
                        ov0Var6.c0(-1659239212);
                        boolean zH = ov0Var6.h(l6Var);
                        Object objQ7 = ov0Var6.Q();
                        if (zH || objQ7 == c30Var) {
                            str2 = str;
                            c30Var2 = c30Var;
                            op0Var2 = op0Var;
                            av1Var2 = av1Var;
                            u4Var = u4VarK;
                            t4 t4Var = new t4(0, l6Var, l6.class, "dismissAccountEntryError", "dismissAccountEntryError()V", 0, 1);
                            ov0Var6.m0(t4Var);
                            objQ7 = t4Var;
                        } else {
                            str2 = str;
                            op0Var2 = op0Var;
                            av1Var2 = av1Var;
                            u4Var = u4VarK;
                            c30Var2 = c30Var;
                        }
                        final int i10 = 0;
                        ey1Var4 = ey1Var;
                        ey1Var5 = ey1Var2;
                        ey1Var6 = ey1Var3;
                        p10 p10VarA0 = sb.a0(-1333436031, new pu0() { // from class: q4
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                int i11 = i10;
                                mf3 mf3Var = mf3.a;
                                c30 c30Var3 = d30.a;
                                switch (i11) {
                                    case 0:
                                        f30 f30Var2 = (f30) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        ov0 ov0Var7 = (ov0) f30Var2;
                                        if (!ov0Var7.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            ov0Var7.W();
                                        } else {
                                            final l6 l6Var3 = l6Var;
                                            boolean zH2 = ov0Var7.h(l6Var3);
                                            final ey1 ey1Var10 = ey1Var5;
                                            boolean zF2 = zH2 | ov0Var7.f(ey1Var10);
                                            final ey1 ey1Var11 = ey1Var4;
                                            boolean zF3 = zF2 | ov0Var7.f(ey1Var11);
                                            Object objQ8 = ov0Var7.Q();
                                            if (zF3 || objQ8 == c30Var3) {
                                                final int i12 = 1;
                                                final ey1 ey1Var12 = ey1Var6;
                                                objQ8 = new au0() { // from class: o4
                                                    @Override // defpackage.au0
                                                    public final Object invoke() {
                                                        int i13 = i12;
                                                        mf3 mf3Var2 = mf3.a;
                                                        ey1 ey1Var13 = ey1Var11;
                                                        ey1 ey1Var14 = ey1Var12;
                                                        ey1 ey1Var15 = ey1Var10;
                                                        switch (i13) {
                                                            case 0:
                                                                l6 l6Var4 = l6Var3;
                                                                l6Var4.e();
                                                                String str3 = (String) ey1Var15.getValue();
                                                                String str4 = (String) ey1Var14.getValue();
                                                                String str5 = ((Boolean) ey1Var13.getValue()).booleanValue() ? "" : null;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                l6Var4.g(new k6(l6Var4, str3, str4, str5, true, null));
                                                                break;
                                                            default:
                                                                l6 l6Var5 = l6Var3;
                                                                l6Var5.e();
                                                                String str6 = (String) ey1Var15.getValue();
                                                                String str7 = (String) ey1Var14.getValue();
                                                                String str8 = ((Boolean) ey1Var13.getValue()).booleanValue() ? "" : null;
                                                                str6.getClass();
                                                                str7.getClass();
                                                                l6Var5.g(new k6(l6Var5, str6, str7, str8, false, null));
                                                                break;
                                                        }
                                                        return mf3Var2;
                                                    }
                                                };
                                                ov0Var7.m0(objQ8);
                                            }
                                            n51.j((au0) objQ8, null, false, null, null, null, n51.g, ov0Var7, 805306368, 510);
                                        }
                                        break;
                                    default:
                                        f30 f30Var3 = (f30) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        ov0 ov0Var8 = (ov0) f30Var3;
                                        if (!ov0Var8.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            ov0Var8.W();
                                        } else {
                                            final l6 l6Var4 = l6Var;
                                            boolean zH3 = ov0Var8.h(l6Var4);
                                            final ey1 ey1Var13 = ey1Var5;
                                            boolean zF4 = zH3 | ov0Var8.f(ey1Var13);
                                            final ey1 ey1Var14 = ey1Var4;
                                            boolean zF5 = zF4 | ov0Var8.f(ey1Var14);
                                            Object objQ9 = ov0Var8.Q();
                                            if (zF5 || objQ9 == c30Var3) {
                                                final int i13 = 0;
                                                final ey1 ey1Var15 = ey1Var6;
                                                objQ9 = new au0() { // from class: o4
                                                    @Override // defpackage.au0
                                                    public final Object invoke() {
                                                        int i14 = i13;
                                                        mf3 mf3Var2 = mf3.a;
                                                        ey1 ey1Var16 = ey1Var14;
                                                        ey1 ey1Var17 = ey1Var15;
                                                        ey1 ey1Var18 = ey1Var13;
                                                        switch (i14) {
                                                            case 0:
                                                                l6 l6Var5 = l6Var4;
                                                                l6Var5.e();
                                                                String str3 = (String) ey1Var18.getValue();
                                                                String str4 = (String) ey1Var17.getValue();
                                                                String str5 = ((Boolean) ey1Var16.getValue()).booleanValue() ? "" : null;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                l6Var5.g(new k6(l6Var5, str3, str4, str5, true, null));
                                                                break;
                                                            default:
                                                                l6 l6Var6 = l6Var4;
                                                                l6Var6.e();
                                                                String str6 = (String) ey1Var18.getValue();
                                                                String str7 = (String) ey1Var17.getValue();
                                                                String str8 = ((Boolean) ey1Var16.getValue()).booleanValue() ? "" : null;
                                                                str6.getClass();
                                                                str7.getClass();
                                                                l6Var6.g(new k6(l6Var6, str6, str7, str8, false, null));
                                                                break;
                                                        }
                                                        return mf3Var2;
                                                    }
                                                };
                                                ov0Var8.m0(objQ9);
                                            }
                                            n51.j((au0) objQ9, null, false, null, null, null, n51.h, ov0Var8, 805306368, 510);
                                        }
                                        break;
                                }
                                return mf3Var;
                            }
                        }, ov0Var6);
                        final int i11 = 1;
                        l6Var2 = l6Var;
                        i8 = -1663238677;
                        xq1.a((au0) ((o81) objQ7), p10VarA0, null, sb.a0(-824657217, new pu0() { // from class: q4
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                int i12 = i11;
                                mf3 mf3Var = mf3.a;
                                c30 c30Var3 = d30.a;
                                switch (i12) {
                                    case 0:
                                        f30 f30Var2 = (f30) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        ov0 ov0Var7 = (ov0) f30Var2;
                                        if (!ov0Var7.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            ov0Var7.W();
                                        } else {
                                            final l6 l6Var3 = l6Var2;
                                            boolean zH2 = ov0Var7.h(l6Var3);
                                            final ey1 ey1Var10 = ey1Var5;
                                            boolean zF2 = zH2 | ov0Var7.f(ey1Var10);
                                            final ey1 ey1Var11 = ey1Var4;
                                            boolean zF3 = zF2 | ov0Var7.f(ey1Var11);
                                            Object objQ8 = ov0Var7.Q();
                                            if (zF3 || objQ8 == c30Var3) {
                                                final int i13 = 1;
                                                final ey1 ey1Var12 = ey1Var6;
                                                objQ8 = new au0() { // from class: o4
                                                    @Override // defpackage.au0
                                                    public final Object invoke() {
                                                        int i14 = i13;
                                                        mf3 mf3Var2 = mf3.a;
                                                        ey1 ey1Var16 = ey1Var11;
                                                        ey1 ey1Var17 = ey1Var12;
                                                        ey1 ey1Var18 = ey1Var10;
                                                        switch (i14) {
                                                            case 0:
                                                                l6 l6Var5 = l6Var3;
                                                                l6Var5.e();
                                                                String str3 = (String) ey1Var18.getValue();
                                                                String str4 = (String) ey1Var17.getValue();
                                                                String str5 = ((Boolean) ey1Var16.getValue()).booleanValue() ? "" : null;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                l6Var5.g(new k6(l6Var5, str3, str4, str5, true, null));
                                                                break;
                                                            default:
                                                                l6 l6Var6 = l6Var3;
                                                                l6Var6.e();
                                                                String str6 = (String) ey1Var18.getValue();
                                                                String str7 = (String) ey1Var17.getValue();
                                                                String str8 = ((Boolean) ey1Var16.getValue()).booleanValue() ? "" : null;
                                                                str6.getClass();
                                                                str7.getClass();
                                                                l6Var6.g(new k6(l6Var6, str6, str7, str8, false, null));
                                                                break;
                                                        }
                                                        return mf3Var2;
                                                    }
                                                };
                                                ov0Var7.m0(objQ8);
                                            }
                                            n51.j((au0) objQ8, null, false, null, null, null, n51.g, ov0Var7, 805306368, 510);
                                        }
                                        break;
                                    default:
                                        f30 f30Var3 = (f30) obj;
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        ov0 ov0Var8 = (ov0) f30Var3;
                                        if (!ov0Var8.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            ov0Var8.W();
                                        } else {
                                            final l6 l6Var4 = l6Var2;
                                            boolean zH3 = ov0Var8.h(l6Var4);
                                            final ey1 ey1Var13 = ey1Var5;
                                            boolean zF4 = zH3 | ov0Var8.f(ey1Var13);
                                            final ey1 ey1Var14 = ey1Var4;
                                            boolean zF5 = zF4 | ov0Var8.f(ey1Var14);
                                            Object objQ9 = ov0Var8.Q();
                                            if (zF5 || objQ9 == c30Var3) {
                                                final int i14 = 0;
                                                final ey1 ey1Var15 = ey1Var6;
                                                objQ9 = new au0() { // from class: o4
                                                    @Override // defpackage.au0
                                                    public final Object invoke() {
                                                        int i15 = i14;
                                                        mf3 mf3Var2 = mf3.a;
                                                        ey1 ey1Var16 = ey1Var14;
                                                        ey1 ey1Var17 = ey1Var15;
                                                        ey1 ey1Var18 = ey1Var13;
                                                        switch (i15) {
                                                            case 0:
                                                                l6 l6Var5 = l6Var4;
                                                                l6Var5.e();
                                                                String str3 = (String) ey1Var18.getValue();
                                                                String str4 = (String) ey1Var17.getValue();
                                                                String str5 = ((Boolean) ey1Var16.getValue()).booleanValue() ? "" : null;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                l6Var5.g(new k6(l6Var5, str3, str4, str5, true, null));
                                                                break;
                                                            default:
                                                                l6 l6Var6 = l6Var4;
                                                                l6Var6.e();
                                                                String str6 = (String) ey1Var18.getValue();
                                                                String str7 = (String) ey1Var17.getValue();
                                                                String str8 = ((Boolean) ey1Var16.getValue()).booleanValue() ? "" : null;
                                                                str6.getClass();
                                                                str7.getClass();
                                                                l6Var6.g(new k6(l6Var6, str6, str7, str8, false, null));
                                                                break;
                                                        }
                                                        return mf3Var2;
                                                    }
                                                };
                                                ov0Var8.m0(objQ9);
                                            }
                                            n51.j((au0) objQ9, null, false, null, null, null, n51.h, ov0Var8, 805306368, 510);
                                        }
                                        break;
                                }
                                return mf3Var;
                            }
                        }, ov0Var6), n51.i, n51.j, null, 0L, 0L, 0L, 0L, null, ov0Var6, 1772592, 16276);
                        ov0Var2 = ov0Var6;
                        z5 = false;
                    } else {
                        str2 = str;
                        op0Var2 = op0Var;
                        l6Var2 = l6Var;
                        av1Var2 = av1Var;
                        u4Var = u4VarK;
                        c30Var2 = c30Var;
                        ey1Var4 = ey1Var;
                        i8 = -1663238677;
                        ey1Var5 = ey1Var2;
                        ey1Var6 = ey1Var3;
                        z5 = false;
                        ov0Var6.c0(-1663238677);
                        ov0Var2 = ov0Var6;
                    }
                    ov0Var2.p(z5);
                    u4Var2 = u4Var;
                    op0Var3 = op0Var2;
                    zF = ov0Var2.f(u4Var2) | ov0Var2.h(op0Var3) | ov0Var2.h(l6Var2) | ov0Var2.f(ey1Var5) | ov0Var2.f(ey1Var4);
                    objQ6 = ov0Var2.Q();
                    if (!zF || objQ6 == c30Var2) {
                        ey1 ey1Var10 = ey1Var4;
                        l6 l6Var3 = l6Var2;
                        u4Var3 = u4Var2;
                        ey1 ey1Var11 = ey1Var6;
                        ey1 ey1Var12 = ey1Var5;
                        d3 d3Var = new d3(u4Var3, op0Var3, l6Var3, ey1Var12, ey1Var11, ey1Var10);
                        op0Var4 = op0Var3;
                        ey1Var5 = ey1Var12;
                        ey1Var6 = ey1Var11;
                        ey1Var4 = ey1Var10;
                        ov0Var2.m0(d3Var);
                        objQ6 = d3Var;
                    } else {
                        u4Var3 = u4Var2;
                        op0Var4 = op0Var3;
                    }
                    final au0 au0Var7 = (au0) objQ6;
                    if (au0Var5 != 0) {
                        ov0Var2.c0(-469134669);
                        z6 = true;
                        xq1.g(z5, au0Var5, ov0Var2, i5 & 112, 1);
                    } else {
                        z6 = true;
                        ov0Var2.c0(i8);
                    }
                    ov0Var2.p(z5);
                    fn0 fn0Var = iw2.c;
                    hh0 hh0Var = mz.a;
                    dv1 dv1VarF = zm3.F(zm3.P(ji2.H(ji2.R(xp1.k(fn0Var, ((kz) ov0Var2.j(hh0Var)).n, iy0Var))), zm3.O(ov0Var2), z6), 24.0f, 0.0f, 2);
                    yz yzVarA = wz.a(am1.g, nrVar, ov0Var2, 48);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarF);
                    w20.b.getClass();
                    x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    ghVar = v20.e;
                    q73.h(ov0Var2, ghVar, yzVarA);
                    ghVar2 = v20.d;
                    q73.h(ov0Var2, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ghVar3 = v20.f;
                    q73.h(ov0Var2, ghVar3, numValueOf);
                    waVar = v20.g;
                    q73.g(ov0Var2, waVar);
                    ghVar4 = v20.c;
                    q73.h(ov0Var2, ghVar4, dv1VarH);
                    if (au0Var5 != 0) {
                        ov0Var2.c0(701267340);
                        av1 av1Var4 = av1Var2;
                        dv1 dv1VarE = iw2.e(av1Var4, 1.0f);
                        kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var2, 0);
                        ey1 ey1Var13 = ey1Var5;
                        int iHashCode2 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL2 = ov0Var2.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA);
                        q73.h(ov0Var2, ghVar2, l72VarL2);
                        az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH2);
                        waVar2 = waVar;
                        ghVar6 = ghVar;
                        ghVar5 = ghVar4;
                        ey1Var7 = ey1Var13;
                        r5 = 0;
                        av1Var3 = av1Var4;
                        xq1.l(au0Var5, null, false, null, null, n51.k, ov0Var2, ((i5 >> 3) & 14) | 1572864, 62);
                        au0Var6 = au0Var5;
                        r9 = 1;
                        ov0Var2.p(true);
                        ov0Var2.p(false);
                    } else {
                        ey1Var7 = ey1Var5;
                        au0Var6 = au0Var5;
                        boolean z9 = z5;
                        waVar2 = waVar;
                        ghVar5 = ghVar4;
                        r9 = 1;
                        av1Var3 = av1Var2;
                        ghVar6 = ghVar;
                        ov0Var2.c0(701272491);
                        gh0.h(ov0Var2, iw2.g(av1Var3, 36.0f));
                        ov0Var2.p(z9);
                        r5 = z9;
                    }
                    dv1 dv1VarE2 = iw2.e(iw2.p(r9, 440.0f), 1.0f);
                    jo joVar = new jo(24.0f, r9, new fo(r5));
                    nr nrVar2 = j9.r;
                    yz yzVarA2 = wz.a(joVar, nrVar2, ov0Var2, 6);
                    int iHashCode3 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL3 = ov0Var2.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarE2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar6, yzVarA2);
                    q73.h(ov0Var2, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar5, dv1VarH3);
                    kk2 kk2VarA2 = jk2.a(new jo(12.0f, true, new fo(r5)), j9.p, ov0Var2, 54);
                    int iHashCode4 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL4 = ov0Var2.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var2, av1Var3);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar6, kk2VarA2);
                    q73.h(ov0Var2, ghVar2, l72VarL4);
                    az2.s(iHashCode4, ov0Var2, ghVar3, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar5, dv1VarH4);
                    String packageName = ((Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b)).getPackageName();
                    packageName.getClass();
                    ks.C(packageName, iw2.k(av1Var3, 56.0f), ov0Var2, 48);
                    String strN = ke0.N(2131624028, ov0Var2);
                    hh0 hh0Var2 = le3.a;
                    q93 q93Var = ((je3) ov0Var2.j(hh0Var2)).g;
                    ov0Var3 = ov0Var2;
                    jr0 jr0Var = jr0.j;
                    s83.b(strN, null, 0L, 0L, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var3, 1572864, 0, 131006);
                    ov0Var3.p(true);
                    yz yzVarA3 = wz.a(new jo(10.0f, true, new fo(r5)), nrVar2, ov0Var3, 6);
                    int iHashCode5 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL5 = ov0Var3.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var3, av1Var3);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar6, yzVarA3);
                    q73.h(ov0Var3, ghVar2, l72VarL5);
                    az2.s(iHashCode5, ov0Var3, ghVar3, ov0Var3, waVar2);
                    q73.h(ov0Var3, ghVar5, dv1VarH5);
                    s83.b(ke0.N(2131623971, ov0Var3), null, 0L, 0L, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var2)).e, ov0Var3, 1572864, 0, 131006);
                    s83.b(ke0.N(2131623969, ov0Var3), null, ((kz) ov0Var3.j(r51)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var2)).k, ov0Var3, 0, 0, 131066);
                    ov0Var3.p(true);
                    final ey1 ey1Var14 = ey1Var6;
                    final String str3 = str2;
                    final op0 op0Var5 = op0Var4;
                    final u4 u4Var4 = u4Var3;
                    final ey1 ey1Var15 = ey1Var4;
                    final ey1 ey1Var16 = ey1Var7;
                    e33.a(null, cj2.a(24.0f), ((kz) ov0Var3.j(hh0Var)).p, 0L, 0.0f, 0.0f, null, sb.a0(-671523010, new pu0() { // from class: r4
                        /* JADX WARN: Code duplicated, block: B:100:0x04d4  */
                        /* JADX WARN: Code duplicated, block: B:103:0x04ec  */
                        /* JADX WARN: Code duplicated, block: B:106:0x04f1  */
                        /* JADX WARN: Code duplicated, block: B:110:0x050e  */
                        /* JADX WARN: Code duplicated, block: B:111:0x0518  */
                        /* JADX WARN: Code duplicated, block: B:114:0x0556  */
                        /* JADX WARN: Code duplicated, block: B:117:0x05b0  */
                        /* JADX WARN: Code duplicated, block: B:119:0x05c0 A[ADDED_TO_REGION] */
                        /* JADX WARN: Code duplicated, block: B:120:0x05c2  */
                        /* JADX WARN: Code duplicated, block: B:123:0x05fa  */
                        /* JADX WARN: Code duplicated, block: B:58:0x02f9  */
                        /* JADX WARN: Code duplicated, block: B:61:0x0368  */
                        /* JADX WARN: Code duplicated, block: B:62:0x036b  */
                        /* JADX WARN: Code duplicated, block: B:65:0x0383  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0385  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0395  */
                        /* JADX WARN: Code duplicated, block: B:72:0x039a  */
                        /* JADX WARN: Code duplicated, block: B:76:0x03b5 A[ADDED_TO_REGION] */
                        /* JADX WARN: Code duplicated, block: B:79:0x03bb  */
                        /* JADX WARN: Code duplicated, block: B:82:0x03dc A[ADDED_TO_REGION] */
                        /* JADX WARN: Code duplicated, block: B:85:0x03e1  */
                        /* JADX WARN: Code duplicated, block: B:88:0x0448  */
                        /* JADX WARN: Code duplicated, block: B:90:0x0450  */
                        /* JADX WARN: Code duplicated, block: B:91:0x0454  */
                        /* JADX WARN: Code duplicated, block: B:94:0x0467  */
                        /* JADX WARN: Code duplicated, block: B:96:0x047c  */
                        /* JADX WARN: Code duplicated, block: B:99:0x04d1  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r14v22 */
                        /* JADX WARN: Type inference failed for: r14v23, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r14v39 */
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z10;
                            final l6 l6Var4;
                            final ey1 ey1Var17;
                            final ey1 ey1Var18;
                            final ey1 ey1Var19;
                            final ey1 ey1Var20;
                            Object obj3;
                            String str4;
                            Object obj4;
                            boolean z11;
                            av1 av1Var5;
                            Object obj5;
                            boolean zH2;
                            Object objQ8;
                            ov0 ov0Var7;
                            Object obj6;
                            av1 av1Var6;
                            u4 u4Var5;
                            boolean z12;
                            ak3 j62Var;
                            int i12;
                            au0 au0Var8;
                            boolean zF2;
                            Object objQ9;
                            Object obj7;
                            boolean zH3;
                            Object objQ10;
                            boolean zH4;
                            Object objQ11;
                            int i13;
                            Object obj8;
                            ov0 ov0Var8;
                            Object obj9;
                            ?? r14;
                            ov0 ov0Var9;
                            ov0 ov0Var10;
                            boolean z13;
                            boolean zH5;
                            Object objQ12;
                            int i14;
                            boolean z14;
                            long j2;
                            ak3 j62Var2;
                            boolean zF3;
                            Object objQ13;
                            Object objQ14;
                            int i15;
                            boolean z15;
                            long j3;
                            boolean z16;
                            long j4;
                            long j5;
                            f30 f30Var2 = (f30) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            b81 b81Var = u92.w;
                            boolean z17 = true;
                            ov0 ov0Var11 = (ov0) f30Var2;
                            if (ov0Var11.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                av1 av1Var7 = av1.a;
                                dv1 dv1VarD = zm3.D(av1Var7, 20.0f);
                                char c2 = 6;
                                yz yzVarA4 = wz.a(new jo(16.0f, true, new fo(0)), j9.r, ov0Var11, 6);
                                int iHashCode6 = Long.hashCode(ov0Var11.T);
                                l72 l72VarL6 = ov0Var11.l();
                                dv1 dv1VarH6 = xp1.H(ov0Var11, dv1VarD);
                                w20.b.getClass();
                                x30 x30Var2 = v20.b;
                                ov0Var11.g0();
                                if (ov0Var11.S) {
                                    ov0Var11.k(x30Var2);
                                } else {
                                    ov0Var11.p0();
                                }
                                gh ghVar7 = v20.e;
                                q73.h(ov0Var11, ghVar7, yzVarA4);
                                gh ghVar8 = v20.d;
                                q73.h(ov0Var11, ghVar8, l72VarL6);
                                Integer numValueOf2 = Integer.valueOf(iHashCode6);
                                gh ghVar9 = v20.f;
                                q73.h(ov0Var11, ghVar9, numValueOf2);
                                wa waVar3 = v20.g;
                                q73.g(ov0Var11, waVar3);
                                gh ghVar10 = v20.c;
                                q73.h(ov0Var11, ghVar10, dv1VarH6);
                                dv1 dv1VarD2 = zm3.D(xp1.k(iw2.e(av1Var7, 1.0f), ((kz) ov0Var11.j(mz.a)).r, cj2.a(14.0f)), 4.0f);
                                kk2 kk2VarA3 = jk2.a(new jo(4.0f, true, new fo(0)), j9.o, ov0Var11, 6);
                                int iHashCode7 = Long.hashCode(ov0Var11.T);
                                l72 l72VarL7 = ov0Var11.l();
                                dv1 dv1VarH7 = xp1.H(ov0Var11, dv1VarD2);
                                ov0Var11.g0();
                                if (ov0Var11.S) {
                                    ov0Var11.k(x30Var2);
                                } else {
                                    ov0Var11.p0();
                                }
                                q73.h(ov0Var11, ghVar7, kk2VarA3);
                                q73.h(ov0Var11, ghVar8, l72VarL7);
                                az2.s(iHashCode7, ov0Var11, ghVar9, ov0Var11, waVar3);
                                q73.h(ov0Var11, ghVar10, dv1VarH7);
                                ov0Var11.c0(1452283171);
                                Iterator it = am1.G(Boolean.FALSE, Boolean.TRUE).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    z10 = z4;
                                    l6Var4 = l6Var;
                                    ey1Var17 = ey1Var15;
                                    ey1Var18 = ey1Var14;
                                    ey1Var19 = ey1Var8;
                                    ey1Var20 = ey1Var9;
                                    obj3 = d30.a;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    final boolean zBooleanValue = ((Boolean) it.next()).booleanValue();
                                    boolean z18 = ((Boolean) ey1Var17.getValue()).booleanValue() == zBooleanValue ? z17 : false;
                                    boolean z19 = !z10;
                                    bj2 bj2VarA = cj2.a(11.0f);
                                    wb1 wb1Var = new wb1(1.0f, z17);
                                    if (z18) {
                                        ov0Var11.c0(-391612038);
                                        j4 = ((kz) ov0Var11.j(mz.a)).a;
                                        z16 = false;
                                        ov0Var11.p(false);
                                    } else {
                                        z16 = false;
                                        ov0Var11.c0(-391611426);
                                        ov0Var11.p(false);
                                        j4 = hz.f;
                                    }
                                    if (z18) {
                                        ov0Var11.c0(-391608228);
                                        j5 = ((kz) ov0Var11.j(mz.a)).b;
                                    } else {
                                        ov0Var11.c0(-391606909);
                                        j5 = ((kz) ov0Var11.j(mz.a)).s;
                                    }
                                    ov0Var11.p(z16);
                                    boolean zH6 = ov0Var11.h(l6Var4) | ov0Var11.f(ey1Var17) | ov0Var11.g(zBooleanValue);
                                    Iterator it2 = it;
                                    Object objQ15 = ov0Var11.Q();
                                    if (zH6 || objQ15 == obj3) {
                                        objQ15 = new au0() { // from class: s4
                                            @Override // defpackage.au0
                                            public final Object invoke() {
                                                l6Var4.e();
                                                ey1Var17.setValue(Boolean.valueOf(zBooleanValue));
                                                ey1Var18.setValue("");
                                                ey1Var19.setValue("");
                                                ey1Var20.setValue(Boolean.FALSE);
                                                return mf3.a;
                                            }
                                        };
                                        ov0Var11.m0(objQ15);
                                    }
                                    byte b2 = 0;
                                    ov0 ov0Var12 = ov0Var11;
                                    e33.b((au0) objQ15, wb1Var, z19, bj2VarA, j4, j5, 0.0f, null, null, sb.a0(-1396336056, new i4(zBooleanValue, b2, b2), ov0Var11), ov0Var12, 0, 960);
                                    c2 = 6;
                                    ov0Var11 = ov0Var12;
                                    it = it2;
                                    b81Var = b81Var;
                                    z17 = true;
                                }
                                b81 b81Var2 = b81Var;
                                ov0Var11.p(false);
                                ov0Var11.p(true);
                                String str5 = str3;
                                if (str5 == null || yo.H0(new String[]{"login_required", "companion_login_required", "device_signed_out", "device_login_required", "session_replaced", "hardware_confirmation_required", "hardware_conflict"}).contains(str5)) {
                                    str4 = "companion_in_use";
                                    obj4 = obj3;
                                    z11 = false;
                                    ov0Var11.c0(-1280344838);
                                } else {
                                    ov0Var11.c0(-1272190133);
                                    boolean zEquals = str5.equals("companion_in_use");
                                    bj2 bj2VarA2 = cj2.a(12.0f);
                                    if (zEquals) {
                                        ov0Var11.c0(-1703601128);
                                        j3 = ((kz) ov0Var11.j(mz.a)).c;
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                        ov0Var11.c0(-1703599594);
                                        j3 = ((kz) ov0Var11.j(mz.a)).y;
                                    }
                                    ov0Var11.p(z15);
                                    ov0 ov0Var13 = ov0Var11;
                                    obj4 = obj3;
                                    str4 = "companion_in_use";
                                    e33.a(null, bj2VarA2, j3, 0L, 0.0f, 0.0f, null, sb.a0(-1288719086, new j4(str5, zEquals), ov0Var11), ov0Var13, 12582912, 121);
                                    ov0Var11 = ov0Var13;
                                    z11 = false;
                                }
                                ov0Var11.p(z11);
                                ey1 ey1Var21 = ey1Var16;
                                String str6 = (String) ey1Var21.getValue();
                                dv1 dv1VarE3 = iw2.e(av1Var7, 1.0f);
                                bj2 bj2VarA3 = cj2.a(14.0f);
                                boolean z20 = !z10;
                                n91 n91Var = new n91(2, 6, 115);
                                final op0 op0Var6 = op0Var5;
                                boolean zH7 = ov0Var11.h(op0Var6);
                                Object objQ16 = ov0Var11.Q();
                                if (zH7) {
                                    av1Var5 = av1Var7;
                                    obj5 = obj4;
                                } else {
                                    av1Var5 = av1Var7;
                                    obj5 = obj4;
                                    if (objQ16 == obj5) {
                                    }
                                    m91 m91Var = new m91(null, (lu0) objQ16, null, 59);
                                    zH2 = ov0Var11.h(l6Var4) | ov0Var11.f(ey1Var21);
                                    objQ8 = ov0Var11.Q();
                                    if (zH2 || objQ8 == obj5) {
                                        objQ8 = new l4(l6Var4, ey1Var21, 0);
                                        ov0Var11.m0(objQ8);
                                    }
                                    ov0Var7 = ov0Var11;
                                    obj6 = obj5;
                                    av1Var6 = av1Var5;
                                    ee0.i(str6, (lu0) objQ8, dv1VarE3, z20, null, n51.l, null, n51.m, null, null, false, null, n91Var, m91Var, true, 0, 0, bj2VarA3, null, ov0Var7, 102236544, 12779520, 6061744);
                                    String str7 = (String) ey1Var18.getValue();
                                    dv1 dv1VarE4 = iw2.e(av1Var6, 1.0f);
                                    bj2 bj2VarA4 = cj2.a(14.0f);
                                    u4Var5 = u4Var4;
                                    z12 = u4Var5.a;
                                    if (((Boolean) r22.getValue()).booleanValue()) {
                                        j62Var = b81Var2;
                                    } else {
                                        j62Var = new j62();
                                    }
                                    if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                        i12 = 6;
                                    } else {
                                        i12 = 7;
                                    }
                                    n91 n91Var2 = new n91(7, i12, 115);
                                    au0Var8 = au0Var7;
                                    zF2 = ov0Var7.f(au0Var8);
                                    objQ9 = ov0Var7.Q();
                                    if (zF2) {
                                        obj7 = obj6;
                                    } else {
                                        obj7 = obj6;
                                        if (objQ9 == obj7) {
                                        }
                                        lu0 lu0Var = (lu0) objQ9;
                                        zH3 = ov0Var7.h(op0Var6);
                                        objQ10 = ov0Var7.Q();
                                        if (zH3 || objQ10 == obj7) {
                                            final int i16 = 1;
                                            objQ10 = new lu0() { // from class: k4
                                                @Override // defpackage.lu0
                                                public final Object invoke(Object obj10) {
                                                    int i17 = i16;
                                                    mf3 mf3Var = mf3.a;
                                                    op0 op0Var7 = op0Var6;
                                                    ((l91) obj10).getClass();
                                                    switch (i17) {
                                                        case 0:
                                                            ((rp0) op0Var7).h(6, true);
                                                            break;
                                                        default:
                                                            ((rp0) op0Var7).h(6, true);
                                                            break;
                                                    }
                                                    return mf3Var;
                                                }
                                            };
                                            ov0Var7.m0(objQ10);
                                        }
                                        m91 m91Var2 = new m91(lu0Var, (lu0) objQ10, null, 58);
                                        zH4 = ov0Var7.h(l6Var4);
                                        objQ11 = ov0Var7.Q();
                                        if (!zH4 || objQ11 == obj7) {
                                            i13 = 1;
                                            objQ11 = new l4(l6Var4, ey1Var18, 1);
                                            ov0Var7.m0(objQ11);
                                        } else {
                                            i13 = 1;
                                        }
                                        obj8 = obj7;
                                        ee0.i(str7, (lu0) objQ11, dv1VarE4, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i13), ov0Var7), null, z12, j62Var, n91Var2, m91Var2, true, 0, 0, bj2VarA4, null, ov0Var7, 907542912, 12582912, 6036656);
                                        ov0Var8 = ov0Var7;
                                        if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                            ov0Var8.c0(-1269726346);
                                            if (z12) {
                                                i14 = 2131623978;
                                            } else {
                                                i14 = 2131624233;
                                            }
                                            String strN2 = ke0.N(i14, ov0Var8);
                                            q93 q93Var2 = ((je3) ov0Var8.j(le3.a)).l;
                                            if (z12) {
                                                ov0Var8.c0(-1703518867);
                                                j2 = ((kz) ov0Var8.j(mz.a)).w;
                                                z14 = false;
                                            } else {
                                                z14 = false;
                                                ov0Var8.c0(-1703517672);
                                                j2 = ((kz) ov0Var8.j(mz.a)).s;
                                            }
                                            ov0Var8.p(z14);
                                            s83.b(strN2, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var2, ov0Var8, 0, 0, 131066);
                                            String str8 = (String) ey1Var19.getValue();
                                            dv1 dv1VarE5 = iw2.e(av1Var6, 1.0f);
                                            bj2 bj2VarA5 = cj2.a(14.0f);
                                            boolean z21 = u4Var5.b;
                                            if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                                j62Var2 = b81Var2;
                                            } else {
                                                j62Var2 = new j62();
                                            }
                                            n91 n91Var3 = new n91(7, 7, 115);
                                            zF3 = ov0Var8.f(au0Var8);
                                            objQ13 = ov0Var8.Q();
                                            if (zF3) {
                                                obj9 = obj8;
                                            } else {
                                                obj9 = obj8;
                                                if (objQ13 == obj9) {
                                                }
                                                m91 m91Var3 = new m91((lu0) objQ13, null, null, 62);
                                                objQ14 = ov0Var8.Q();
                                                if (objQ14 == obj9) {
                                                    i15 = 0;
                                                    objQ14 = new f4(ey1Var19, 0);
                                                    ov0Var8.m0(objQ14);
                                                } else {
                                                    i15 = 0;
                                                }
                                                ee0.i(str8, (lu0) objQ14, dv1VarE5, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z21, j62Var2, n91Var3, m91Var3, true, 0, 0, bj2VarA5, null, ov0Var8, 102236592, 12779904, 6033072);
                                                ov0Var9 = ov0Var8;
                                                r14 = 0;
                                            }
                                            objQ13 = new m4(1, au0Var8);
                                            ov0Var8.m0(objQ13);
                                            m91 m91Var4 = new m91((lu0) objQ13, null, null, 62);
                                            objQ14 = ov0Var8.Q();
                                            if (objQ14 == obj9) {
                                                i15 = 0;
                                                objQ14 = new f4(ey1Var19, 0);
                                                ov0Var8.m0(objQ14);
                                            } else {
                                                i15 = 0;
                                            }
                                            ee0.i(str8, (lu0) objQ14, dv1VarE5, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z21, j62Var2, n91Var3, m91Var4, true, 0, 0, bj2VarA5, null, ov0Var8, 102236592, 12779904, 6033072);
                                            ov0Var9 = ov0Var8;
                                            r14 = 0;
                                        } else {
                                            obj9 = obj8;
                                            r14 = 0;
                                            ov0Var8.c0(-1280344838);
                                            ov0Var9 = ov0Var8;
                                        }
                                        ov0Var9.p(r14);
                                        ov0Var10 = ov0Var9;
                                        n51.a(au0Var8, iw2.h(iw2.e(av1Var6, 1.0f), 52.0f, 0.0f, 2), u4Var5.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var17, z10), ov0Var9), ov0Var10, 805306416, 496);
                                        if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str4, "storage_unavailable"}), str5)) {
                                            ov0Var10.c0(-1267899485);
                                            zH5 = ov0Var10.h(l6Var4);
                                            objQ12 = ov0Var10.Q();
                                            if (zH5 || objQ12 == obj9) {
                                                objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                                ov0Var10.m0(objQ12);
                                            }
                                            n51.j((au0) ((o81) objQ12), new by0(j9.s), z20, null, null, null, n51.r, ov0Var10, 805306368, 504);
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                            ov0Var10.c0(-1280344838);
                                        }
                                        ov0Var10.p(z13);
                                        ov0Var10.p(true);
                                    }
                                    objQ9 = new m4(0, au0Var8);
                                    ov0Var7.m0(objQ9);
                                    lu0 lu0Var2 = (lu0) objQ9;
                                    zH3 = ov0Var7.h(op0Var6);
                                    objQ10 = ov0Var7.Q();
                                    if (zH3) {
                                        final int i17 = 1;
                                        objQ10 = new lu0() { // from class: k4
                                            @Override // defpackage.lu0
                                            public final Object invoke(Object obj10) {
                                                int i18 = i17;
                                                mf3 mf3Var = mf3.a;
                                                op0 op0Var7 = op0Var6;
                                                ((l91) obj10).getClass();
                                                switch (i18) {
                                                    case 0:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                    default:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        };
                                        ov0Var7.m0(objQ10);
                                    } else {
                                        final int i18 = 1;
                                        objQ10 = new lu0() { // from class: k4
                                            @Override // defpackage.lu0
                                            public final Object invoke(Object obj10) {
                                                int i19 = i18;
                                                mf3 mf3Var = mf3.a;
                                                op0 op0Var7 = op0Var6;
                                                ((l91) obj10).getClass();
                                                switch (i19) {
                                                    case 0:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                    default:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        };
                                        ov0Var7.m0(objQ10);
                                    }
                                    m91 m91Var5 = new m91(lu0Var2, (lu0) objQ10, null, 58);
                                    zH4 = ov0Var7.h(l6Var4);
                                    objQ11 = ov0Var7.Q();
                                    if (zH4) {
                                        i13 = 1;
                                        objQ11 = new l4(l6Var4, ey1Var18, 1);
                                        ov0Var7.m0(objQ11);
                                    } else {
                                        i13 = 1;
                                        objQ11 = new l4(l6Var4, ey1Var18, 1);
                                        ov0Var7.m0(objQ11);
                                    }
                                    obj8 = obj7;
                                    ee0.i(str7, (lu0) objQ11, dv1VarE4, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i13), ov0Var7), null, z12, j62Var, n91Var2, m91Var5, true, 0, 0, bj2VarA4, null, ov0Var7, 907542912, 12582912, 6036656);
                                    ov0Var8 = ov0Var7;
                                    if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                        ov0Var8.c0(-1269726346);
                                        if (z12) {
                                            i14 = 2131623978;
                                        } else {
                                            i14 = 2131624233;
                                        }
                                        String strN3 = ke0.N(i14, ov0Var8);
                                        q93 q93Var3 = ((je3) ov0Var8.j(le3.a)).l;
                                        if (z12) {
                                            ov0Var8.c0(-1703518867);
                                            j2 = ((kz) ov0Var8.j(mz.a)).w;
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                            ov0Var8.c0(-1703517672);
                                            j2 = ((kz) ov0Var8.j(mz.a)).s;
                                        }
                                        ov0Var8.p(z14);
                                        s83.b(strN3, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var3, ov0Var8, 0, 0, 131066);
                                        String str9 = (String) ey1Var19.getValue();
                                        dv1 dv1VarE6 = iw2.e(av1Var6, 1.0f);
                                        bj2 bj2VarA6 = cj2.a(14.0f);
                                        boolean z22 = u4Var5.b;
                                        if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                            j62Var2 = b81Var2;
                                        } else {
                                            j62Var2 = new j62();
                                        }
                                        n91 n91Var4 = new n91(7, 7, 115);
                                        zF3 = ov0Var8.f(au0Var8);
                                        objQ13 = ov0Var8.Q();
                                        if (zF3) {
                                            obj9 = obj8;
                                            if (objQ13 == obj9) {
                                            }
                                            m91 m91Var6 = new m91((lu0) objQ13, null, null, 62);
                                            objQ14 = ov0Var8.Q();
                                            if (objQ14 == obj9) {
                                                i15 = 0;
                                                objQ14 = new f4(ey1Var19, 0);
                                                ov0Var8.m0(objQ14);
                                            } else {
                                                i15 = 0;
                                            }
                                            ee0.i(str9, (lu0) objQ14, dv1VarE6, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z22, j62Var2, n91Var4, m91Var6, true, 0, 0, bj2VarA6, null, ov0Var8, 102236592, 12779904, 6033072);
                                            ov0Var9 = ov0Var8;
                                            r14 = 0;
                                        } else {
                                            obj9 = obj8;
                                        }
                                        objQ13 = new m4(1, au0Var8);
                                        ov0Var8.m0(objQ13);
                                        m91 m91Var7 = new m91((lu0) objQ13, null, null, 62);
                                        objQ14 = ov0Var8.Q();
                                        if (objQ14 == obj9) {
                                            i15 = 0;
                                            objQ14 = new f4(ey1Var19, 0);
                                            ov0Var8.m0(objQ14);
                                        } else {
                                            i15 = 0;
                                        }
                                        ee0.i(str9, (lu0) objQ14, dv1VarE6, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z22, j62Var2, n91Var4, m91Var7, true, 0, 0, bj2VarA6, null, ov0Var8, 102236592, 12779904, 6033072);
                                        ov0Var9 = ov0Var8;
                                        r14 = 0;
                                    } else {
                                        obj9 = obj8;
                                        r14 = 0;
                                        ov0Var8.c0(-1280344838);
                                        ov0Var9 = ov0Var8;
                                    }
                                    ov0Var9.p(r14);
                                    ov0Var10 = ov0Var9;
                                    n51.a(au0Var8, iw2.h(iw2.e(av1Var6, 1.0f), 52.0f, 0.0f, 2), u4Var5.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var17, z10), ov0Var9), ov0Var10, 805306416, 496);
                                    if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str4, "storage_unavailable"}), str5)) {
                                        ov0Var10.c0(-1267899485);
                                        zH5 = ov0Var10.h(l6Var4);
                                        objQ12 = ov0Var10.Q();
                                        if (zH5) {
                                            objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                            ov0Var10.m0(objQ12);
                                        } else {
                                            objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                            ov0Var10.m0(objQ12);
                                        }
                                        n51.j((au0) ((o81) objQ12), new by0(j9.s), z20, null, null, null, n51.r, ov0Var10, 805306368, 504);
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                        ov0Var10.c0(-1280344838);
                                    }
                                    ov0Var10.p(z13);
                                    ov0Var10.p(true);
                                }
                                final int i19 = 0;
                                objQ16 = new lu0() { // from class: k4
                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj10) {
                                        int i110 = i19;
                                        mf3 mf3Var = mf3.a;
                                        op0 op0Var7 = op0Var6;
                                        ((l91) obj10).getClass();
                                        switch (i110) {
                                            case 0:
                                                ((rp0) op0Var7).h(6, true);
                                                break;
                                            default:
                                                ((rp0) op0Var7).h(6, true);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var11.m0(objQ16);
                                m91 m91Var8 = new m91(null, (lu0) objQ16, null, 59);
                                zH2 = ov0Var11.h(l6Var4) | ov0Var11.f(ey1Var21);
                                objQ8 = ov0Var11.Q();
                                if (zH2) {
                                    objQ8 = new l4(l6Var4, ey1Var21, 0);
                                    ov0Var11.m0(objQ8);
                                } else {
                                    objQ8 = new l4(l6Var4, ey1Var21, 0);
                                    ov0Var11.m0(objQ8);
                                }
                                ov0Var7 = ov0Var11;
                                obj6 = obj5;
                                av1Var6 = av1Var5;
                                ee0.i(str6, (lu0) objQ8, dv1VarE3, z20, null, n51.l, null, n51.m, null, null, false, null, n91Var, m91Var8, true, 0, 0, bj2VarA3, null, ov0Var7, 102236544, 12779520, 6061744);
                                String str10 = (String) ey1Var18.getValue();
                                dv1 dv1VarE7 = iw2.e(av1Var6, 1.0f);
                                bj2 bj2VarA7 = cj2.a(14.0f);
                                u4Var5 = u4Var4;
                                z12 = u4Var5.a;
                                if (((Boolean) r22.getValue()).booleanValue()) {
                                    j62Var = b81Var2;
                                } else {
                                    j62Var = new j62();
                                }
                                if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                    i12 = 6;
                                } else {
                                    i12 = 7;
                                }
                                n91 n91Var5 = new n91(7, i12, 115);
                                au0Var8 = au0Var7;
                                zF2 = ov0Var7.f(au0Var8);
                                objQ9 = ov0Var7.Q();
                                if (zF2) {
                                    obj7 = obj6;
                                    if (objQ9 == obj7) {
                                    }
                                    lu0 lu0Var3 = (lu0) objQ9;
                                    zH3 = ov0Var7.h(op0Var6);
                                    objQ10 = ov0Var7.Q();
                                    if (zH3) {
                                        final int i110 = 1;
                                        objQ10 = new lu0() { // from class: k4
                                            @Override // defpackage.lu0
                                            public final Object invoke(Object obj10) {
                                                int i111 = i110;
                                                mf3 mf3Var = mf3.a;
                                                op0 op0Var7 = op0Var6;
                                                ((l91) obj10).getClass();
                                                switch (i111) {
                                                    case 0:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                    default:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        };
                                        ov0Var7.m0(objQ10);
                                    } else {
                                        final int i111 = 1;
                                        objQ10 = new lu0() { // from class: k4
                                            @Override // defpackage.lu0
                                            public final Object invoke(Object obj10) {
                                                int i112 = i111;
                                                mf3 mf3Var = mf3.a;
                                                op0 op0Var7 = op0Var6;
                                                ((l91) obj10).getClass();
                                                switch (i112) {
                                                    case 0:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                    default:
                                                        ((rp0) op0Var7).h(6, true);
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        };
                                        ov0Var7.m0(objQ10);
                                    }
                                    m91 m91Var9 = new m91(lu0Var3, (lu0) objQ10, null, 58);
                                    zH4 = ov0Var7.h(l6Var4);
                                    objQ11 = ov0Var7.Q();
                                    if (zH4) {
                                        i13 = 1;
                                        objQ11 = new l4(l6Var4, ey1Var18, 1);
                                        ov0Var7.m0(objQ11);
                                    } else {
                                        i13 = 1;
                                        objQ11 = new l4(l6Var4, ey1Var18, 1);
                                        ov0Var7.m0(objQ11);
                                    }
                                    obj8 = obj7;
                                    ee0.i(str10, (lu0) objQ11, dv1VarE7, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i13), ov0Var7), null, z12, j62Var, n91Var5, m91Var9, true, 0, 0, bj2VarA7, null, ov0Var7, 907542912, 12582912, 6036656);
                                    ov0Var8 = ov0Var7;
                                    if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                        ov0Var8.c0(-1269726346);
                                        if (z12) {
                                            i14 = 2131623978;
                                        } else {
                                            i14 = 2131624233;
                                        }
                                        String strN4 = ke0.N(i14, ov0Var8);
                                        q93 q93Var4 = ((je3) ov0Var8.j(le3.a)).l;
                                        if (z12) {
                                            ov0Var8.c0(-1703518867);
                                            j2 = ((kz) ov0Var8.j(mz.a)).w;
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                            ov0Var8.c0(-1703517672);
                                            j2 = ((kz) ov0Var8.j(mz.a)).s;
                                        }
                                        ov0Var8.p(z14);
                                        s83.b(strN4, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var4, ov0Var8, 0, 0, 131066);
                                        String str11 = (String) ey1Var19.getValue();
                                        dv1 dv1VarE8 = iw2.e(av1Var6, 1.0f);
                                        bj2 bj2VarA8 = cj2.a(14.0f);
                                        boolean z23 = u4Var5.b;
                                        if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                            j62Var2 = b81Var2;
                                        } else {
                                            j62Var2 = new j62();
                                        }
                                        n91 n91Var6 = new n91(7, 7, 115);
                                        zF3 = ov0Var8.f(au0Var8);
                                        objQ13 = ov0Var8.Q();
                                        if (zF3) {
                                            obj9 = obj8;
                                            if (objQ13 == obj9) {
                                            }
                                            m91 m91Var10 = new m91((lu0) objQ13, null, null, 62);
                                            objQ14 = ov0Var8.Q();
                                            if (objQ14 == obj9) {
                                                i15 = 0;
                                                objQ14 = new f4(ey1Var19, 0);
                                                ov0Var8.m0(objQ14);
                                            } else {
                                                i15 = 0;
                                            }
                                            ee0.i(str11, (lu0) objQ14, dv1VarE8, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z23, j62Var2, n91Var6, m91Var10, true, 0, 0, bj2VarA8, null, ov0Var8, 102236592, 12779904, 6033072);
                                            ov0Var9 = ov0Var8;
                                            r14 = 0;
                                        } else {
                                            obj9 = obj8;
                                        }
                                        objQ13 = new m4(1, au0Var8);
                                        ov0Var8.m0(objQ13);
                                        m91 m91Var11 = new m91((lu0) objQ13, null, null, 62);
                                        objQ14 = ov0Var8.Q();
                                        if (objQ14 == obj9) {
                                            i15 = 0;
                                            objQ14 = new f4(ey1Var19, 0);
                                            ov0Var8.m0(objQ14);
                                        } else {
                                            i15 = 0;
                                        }
                                        ee0.i(str11, (lu0) objQ14, dv1VarE8, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z23, j62Var2, n91Var6, m91Var11, true, 0, 0, bj2VarA8, null, ov0Var8, 102236592, 12779904, 6033072);
                                        ov0Var9 = ov0Var8;
                                        r14 = 0;
                                    } else {
                                        obj9 = obj8;
                                        r14 = 0;
                                        ov0Var8.c0(-1280344838);
                                        ov0Var9 = ov0Var8;
                                    }
                                    ov0Var9.p(r14);
                                    ov0Var10 = ov0Var9;
                                    n51.a(au0Var8, iw2.h(iw2.e(av1Var6, 1.0f), 52.0f, 0.0f, 2), u4Var5.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var17, z10), ov0Var9), ov0Var10, 805306416, 496);
                                    if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str4, "storage_unavailable"}), str5)) {
                                        ov0Var10.c0(-1267899485);
                                        zH5 = ov0Var10.h(l6Var4);
                                        objQ12 = ov0Var10.Q();
                                        if (zH5) {
                                            objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                            ov0Var10.m0(objQ12);
                                        } else {
                                            objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                            ov0Var10.m0(objQ12);
                                        }
                                        n51.j((au0) ((o81) objQ12), new by0(j9.s), z20, null, null, null, n51.r, ov0Var10, 805306368, 504);
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                        ov0Var10.c0(-1280344838);
                                    }
                                    ov0Var10.p(z13);
                                    ov0Var10.p(true);
                                } else {
                                    obj7 = obj6;
                                }
                                objQ9 = new m4(0, au0Var8);
                                ov0Var7.m0(objQ9);
                                lu0 lu0Var4 = (lu0) objQ9;
                                zH3 = ov0Var7.h(op0Var6);
                                objQ10 = ov0Var7.Q();
                                if (zH3) {
                                    final int i112 = 1;
                                    objQ10 = new lu0() { // from class: k4
                                        @Override // defpackage.lu0
                                        public final Object invoke(Object obj10) {
                                            int i113 = i112;
                                            mf3 mf3Var = mf3.a;
                                            op0 op0Var7 = op0Var6;
                                            ((l91) obj10).getClass();
                                            switch (i113) {
                                                case 0:
                                                    ((rp0) op0Var7).h(6, true);
                                                    break;
                                                default:
                                                    ((rp0) op0Var7).h(6, true);
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    };
                                    ov0Var7.m0(objQ10);
                                } else {
                                    final int i113 = 1;
                                    objQ10 = new lu0() { // from class: k4
                                        @Override // defpackage.lu0
                                        public final Object invoke(Object obj10) {
                                            int i114 = i113;
                                            mf3 mf3Var = mf3.a;
                                            op0 op0Var7 = op0Var6;
                                            ((l91) obj10).getClass();
                                            switch (i114) {
                                                case 0:
                                                    ((rp0) op0Var7).h(6, true);
                                                    break;
                                                default:
                                                    ((rp0) op0Var7).h(6, true);
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    };
                                    ov0Var7.m0(objQ10);
                                }
                                m91 m91Var12 = new m91(lu0Var4, (lu0) objQ10, null, 58);
                                zH4 = ov0Var7.h(l6Var4);
                                objQ11 = ov0Var7.Q();
                                if (zH4) {
                                    i13 = 1;
                                    objQ11 = new l4(l6Var4, ey1Var18, 1);
                                    ov0Var7.m0(objQ11);
                                } else {
                                    i13 = 1;
                                    objQ11 = new l4(l6Var4, ey1Var18, 1);
                                    ov0Var7.m0(objQ11);
                                }
                                obj8 = obj7;
                                ee0.i(str10, (lu0) objQ11, dv1VarE7, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i13), ov0Var7), null, z12, j62Var, n91Var5, m91Var12, true, 0, 0, bj2VarA7, null, ov0Var7, 907542912, 12582912, 6036656);
                                ov0Var8 = ov0Var7;
                                if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                    ov0Var8.c0(-1269726346);
                                    if (z12) {
                                        i14 = 2131623978;
                                    } else {
                                        i14 = 2131624233;
                                    }
                                    String strN5 = ke0.N(i14, ov0Var8);
                                    q93 q93Var5 = ((je3) ov0Var8.j(le3.a)).l;
                                    if (z12) {
                                        ov0Var8.c0(-1703518867);
                                        j2 = ((kz) ov0Var8.j(mz.a)).w;
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                        ov0Var8.c0(-1703517672);
                                        j2 = ((kz) ov0Var8.j(mz.a)).s;
                                    }
                                    ov0Var8.p(z14);
                                    s83.b(strN5, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var5, ov0Var8, 0, 0, 131066);
                                    String str12 = (String) ey1Var19.getValue();
                                    dv1 dv1VarE9 = iw2.e(av1Var6, 1.0f);
                                    bj2 bj2VarA9 = cj2.a(14.0f);
                                    boolean z24 = u4Var5.b;
                                    if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                        j62Var2 = b81Var2;
                                    } else {
                                        j62Var2 = new j62();
                                    }
                                    n91 n91Var7 = new n91(7, 7, 115);
                                    zF3 = ov0Var8.f(au0Var8);
                                    objQ13 = ov0Var8.Q();
                                    if (zF3) {
                                        obj9 = obj8;
                                        if (objQ13 == obj9) {
                                        }
                                        m91 m91Var13 = new m91((lu0) objQ13, null, null, 62);
                                        objQ14 = ov0Var8.Q();
                                        if (objQ14 == obj9) {
                                            i15 = 0;
                                            objQ14 = new f4(ey1Var19, 0);
                                            ov0Var8.m0(objQ14);
                                        } else {
                                            i15 = 0;
                                        }
                                        ee0.i(str12, (lu0) objQ14, dv1VarE9, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z24, j62Var2, n91Var7, m91Var13, true, 0, 0, bj2VarA9, null, ov0Var8, 102236592, 12779904, 6033072);
                                        ov0Var9 = ov0Var8;
                                        r14 = 0;
                                    } else {
                                        obj9 = obj8;
                                    }
                                    objQ13 = new m4(1, au0Var8);
                                    ov0Var8.m0(objQ13);
                                    m91 m91Var14 = new m91((lu0) objQ13, null, null, 62);
                                    objQ14 = ov0Var8.Q();
                                    if (objQ14 == obj9) {
                                        i15 = 0;
                                        objQ14 = new f4(ey1Var19, 0);
                                        ov0Var8.m0(objQ14);
                                    } else {
                                        i15 = 0;
                                    }
                                    ee0.i(str12, (lu0) objQ14, dv1VarE9, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var5, i15), ov0Var8), z24, j62Var2, n91Var7, m91Var14, true, 0, 0, bj2VarA9, null, ov0Var8, 102236592, 12779904, 6033072);
                                    ov0Var9 = ov0Var8;
                                    r14 = 0;
                                } else {
                                    obj9 = obj8;
                                    r14 = 0;
                                    ov0Var8.c0(-1280344838);
                                    ov0Var9 = ov0Var8;
                                }
                                ov0Var9.p(r14);
                                ov0Var10 = ov0Var9;
                                n51.a(au0Var8, iw2.h(iw2.e(av1Var6, 1.0f), 52.0f, 0.0f, 2), u4Var5.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var17, z10), ov0Var9), ov0Var10, 805306416, 496);
                                if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str4, "storage_unavailable"}), str5)) {
                                    ov0Var10.c0(-1267899485);
                                    zH5 = ov0Var10.h(l6Var4);
                                    objQ12 = ov0Var10.Q();
                                    if (zH5) {
                                        objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                        ov0Var10.m0(objQ12);
                                    } else {
                                        objQ12 = new t4(0, l6Var4, l6.class, "refresh", "refresh()V", 0, 2);
                                        ov0Var10.m0(objQ12);
                                    }
                                    n51.j((au0) ((o81) objQ12), new by0(j9.s), z20, null, null, null, n51.r, ov0Var10, 805306368, 504);
                                    z13 = false;
                                } else {
                                    z13 = false;
                                    ov0Var10.c0(-1280344838);
                                }
                                ov0Var10.p(z13);
                                ov0Var10.p(true);
                            } else {
                                ov0Var11.W();
                            }
                            return mf3.a;
                        }
                    }, ov0Var3), ov0Var3, 12582912, 121);
                    ov0 ov0Var7 = ov0Var3;
                    gh0.h(ov0Var7, iw2.g(av1Var3, 16.0f));
                    ov0Var7.p(true);
                    ov0Var7.p(true);
                    au0Var3 = au0Var6;
                    ov0Var = ov0Var7;
                } else {
                    ov0Var6.c0(-1661090780);
                    fn0 fn0Var2 = iw2.c;
                    hh0 hh0Var3 = mz.a;
                    dv1 dv1VarD = zm3.D(ji2.R(xp1.k(fn0Var2, ((kz) ov0Var6.j(hh0Var3)).n, iy0Var)), 32.0f);
                    yz yzVarA4 = wz.a(am1.h, nrVar, ov0Var6, 54);
                    int iHashCode6 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL6 = ov0Var6.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var6, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var2);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, v20.e, yzVarA4);
                    q73.h(ov0Var6, v20.d, l72VarL6);
                    q73.h(ov0Var6, v20.f, Integer.valueOf(iHashCode6));
                    q73.g(ov0Var6, v20.g);
                    q73.h(ov0Var6, v20.c, dv1VarH6);
                    String packageName2 = ((Context) ov0Var6.j(AndroidCompositionLocals_androidKt.b)).getPackageName();
                    packageName2.getClass();
                    ks.C(packageName2, iw2.k(av1Var, 64.0f), ov0Var6, 48);
                    gh0.h(ov0Var6, iw2.g(av1Var, 24.0f));
                    String strN2 = ke0.N(2131623988, ov0Var6);
                    hh0 hh0Var4 = le3.a;
                    s83.b(strN2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var6.j(hh0Var4)).g, ov0Var6, 0, 0, 131070);
                    ov0 ov0Var8 = ov0Var6;
                    gh0.h(ov0Var8, iw2.g(av1Var, 16.0f));
                    if (((CloudAccountState) ey1VarS.getValue()).getChecking()) {
                        ov0Var8.c0(-1881101885);
                        vc2.a(null, 0L, 0.0f, 0L, 0, 0.0f, ov0Var8, 0, 63);
                        ov0Var4 = ov0Var8;
                        z7 = false;
                    } else {
                        z7 = false;
                        ov0Var8.c0(1812733242);
                        ov0Var4 = ov0Var8;
                    }
                    ov0Var4.p(z7);
                    gh0.h(ov0Var4, iw2.g(av1Var, 20.0f));
                    if (((CloudAccountState) ey1VarS.getValue()).getChecking() || ((CloudAccountState) ey1VarS.getValue()).getFailureCode() == null) {
                        iJ = f(((CloudAccountState) ey1VarS.getValue()).getFailureCode(), "companion_in_use") ? 2131623986 : 2131623987;
                    } else {
                        String failureCode2 = ((CloudAccountState) ey1VarS.getValue()).getFailureCode();
                        failureCode2.getClass();
                        iJ = gh0.j(failureCode2);
                    }
                    ov0 ov0Var9 = ov0Var4;
                    s83.b(ke0.N(iJ, ov0Var4), null, ((kz) ov0Var4.j(hh0Var3)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var4)).k, ov0Var9, 0, 0, 131066);
                    ov0 ov0Var10 = ov0Var9;
                    if (((CloudAccountState) ey1VarS.getValue()).getChecking()) {
                        z8 = true;
                        ov0Var10.c0(1812733242);
                        ov0Var5 = ov0Var10;
                    } else {
                        ov0Var10.c0(1815873852);
                        gh0.h(ov0Var10, iw2.g(av1Var, 20.0f));
                        boolean zH2 = ov0Var10.h(l6Var);
                        Object objQ8 = ov0Var10.Q();
                        if (zH2 || objQ8 == c30Var) {
                            z8 = true;
                            t4 t4Var2 = new t4(0, l6Var, l6.class, "refresh", "refresh()V", 0, 0);
                            ov0Var10.m0(t4Var2);
                            objQ8 = t4Var2;
                        } else {
                            z8 = true;
                        }
                        n51.a((au0) ((o81) objQ8), null, !((Boolean) ey1VarS2.getValue()).booleanValue(), null, null, null, null, null, n51.f, ov0Var10, 805306368, 506);
                        ov0Var5 = ov0Var10;
                    }
                    ov0Var5.p(z7);
                    ov0Var5.p(z8);
                    ov0Var5.p(z7);
                    ee2VarT = ov0Var5.t();
                    if (ee2VarT == null) {
                        return;
                    }
                    final int i12 = 0;
                    final au0 au0Var8 = au0Var4;
                    pu0Var = new pu0() { // from class: n4
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = i12;
                            mf3 mf3Var = mf3.a;
                            int i14 = i3;
                            int i15 = i2;
                            au0 au0Var9 = au0Var8;
                            l6 l6Var4 = l6Var;
                            f30 f30Var2 = (f30) obj;
                            ((Integer) obj2).getClass();
                            switch (i13) {
                                case 0:
                                    o51.a(l6Var4, au0Var9, f30Var2, wc0.m0(i15 | 1), i14);
                                    break;
                                default:
                                    o51.a(l6Var4, au0Var9, f30Var2, wc0.m0(i15 | 1), i14);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                }
                ee2VarT.d = pu0Var;
            }
            ov0Var6.W();
            au0Var3 = au0Var2;
            ov0Var = ov0Var6;
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                final int i13 = 1;
                pu0Var = new pu0() { // from class: n4
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = i13;
                        mf3 mf3Var = mf3.a;
                        int i15 = i3;
                        int i16 = i2;
                        au0 au0Var9 = au0Var3;
                        l6 l6Var4 = l6Var;
                        f30 f30Var2 = (f30) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                o51.a(l6Var4, au0Var9, f30Var2, wc0.m0(i16 | 1), i15);
                                break;
                            default:
                                o51.a(l6Var4, au0Var9, f30Var2, wc0.m0(i16 | 1), i15);
                                break;
                        }
                        return mf3Var;
                    }
                };
                ee2VarT.d = pu0Var;
            }
        }
        i4 |= 48;
        au0Var2 = au0Var;
        i5 = i4;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ov0Var6.T(i5 & 1, z2)) {
            if (i9 != 0) {
                au0Var4 = null;
            } else {
                au0Var4 = au0Var2;
            }
            ey1VarS = ee0.s(l6Var.c, ov0Var6);
            ey1VarS2 = ee0.s(l6Var.p, ov0Var6);
            ey1 ey1VarS4 = ee0.s(l6Var.r, ov0Var6);
            if (((Boolean) ey1VarS2.getValue()).booleanValue()) {
                z3 = true;
            } else {
                z3 = true;
            }
            hasSession = ((CloudAccountState) ey1VarS.getValue()).getHasSession();
            iy0Var = p0;
            av1Var = av1.a;
            c30Var = d30.a;
            if (hasSession) {
            }
            i6 = 0;
            i7 = 1;
            au0Var5 = au0Var4;
            ov0Var6.c0(-1663238677);
            ov0Var6.p(false);
            Object[] objArr3 = new Object[0];
            objQ = ov0Var6.Q();
            if (objQ == c30Var) {
                objQ = new p4(i6);
                ov0Var6.m0(objQ);
            }
            ey1Var = (ey1) wc0.c0(objArr3, (au0) objQ, ov0Var6, 48);
            Object[] objArr4 = new Object[0];
            objQ2 = ov0Var6.Q();
            if (objQ2 == c30Var) {
                objQ2 = new p4(i7);
                ov0Var6.m0(objQ2);
            }
            ey1Var2 = (ey1) wc0.c0(objArr4, (au0) objQ2, ov0Var6, 48);
            objQ3 = ov0Var6.Q();
            if (objQ3 == c30Var) {
                objQ3 = ke0.H("");
                ov0Var6.m0(objQ3);
            }
            ey1Var3 = (ey1) objQ3;
            objQ4 = ov0Var6.Q();
            if (objQ4 == c30Var) {
                objQ4 = ke0.H("");
                ov0Var6.m0(objQ4);
            }
            final ey1 ey1Var17 = (ey1) objQ4;
            objQ5 = ov0Var6.Q();
            if (objQ5 == c30Var) {
                objQ5 = ke0.H(Boolean.FALSE);
                ov0Var6.m0(objQ5);
            }
            final ey1 ey1Var18 = (ey1) objQ5;
            op0Var = (op0) ov0Var6.j(z30.i);
            u4VarK = k22.K(((Boolean) ey1Var.getValue()).booleanValue(), z3, l6Var.d, (String) ey1Var2.getValue(), (String) ey1Var3.getValue(), (String) ey1Var17.getValue());
            z4 = z3;
            failureCode = (String) ey1VarS4.getValue();
            if (failureCode == null) {
                failureCode = ((CloudAccountState) ey1VarS.getValue()).getFailureCode();
            }
            str = failureCode;
            if (z4) {
                str2 = str;
                op0Var2 = op0Var;
                l6Var2 = l6Var;
                av1Var2 = av1Var;
                u4Var = u4VarK;
                c30Var2 = c30Var;
                ey1Var4 = ey1Var;
                i8 = -1663238677;
                ey1Var5 = ey1Var2;
                ey1Var6 = ey1Var3;
                z5 = false;
                ov0Var6.c0(-1663238677);
                ov0Var2 = ov0Var6;
            } else {
                str2 = str;
                op0Var2 = op0Var;
                l6Var2 = l6Var;
                av1Var2 = av1Var;
                u4Var = u4VarK;
                c30Var2 = c30Var;
                ey1Var4 = ey1Var;
                i8 = -1663238677;
                ey1Var5 = ey1Var2;
                ey1Var6 = ey1Var3;
                z5 = false;
                ov0Var6.c0(-1663238677);
                ov0Var2 = ov0Var6;
            }
            ov0Var2.p(z5);
            u4Var2 = u4Var;
            op0Var3 = op0Var2;
            zF = ov0Var2.f(u4Var2) | ov0Var2.h(op0Var3) | ov0Var2.h(l6Var2) | ov0Var2.f(ey1Var5) | ov0Var2.f(ey1Var4);
            objQ6 = ov0Var2.Q();
            if (zF) {
                ey1 ey1Var19 = ey1Var4;
                l6 l6Var4 = l6Var2;
                u4Var3 = u4Var2;
                ey1 ey1Var110 = ey1Var6;
                ey1 ey1Var111 = ey1Var5;
                d3 d3Var2 = new d3(u4Var3, op0Var3, l6Var4, ey1Var111, ey1Var110, ey1Var19);
                op0Var4 = op0Var3;
                ey1Var5 = ey1Var111;
                ey1Var6 = ey1Var110;
                ey1Var4 = ey1Var19;
                ov0Var2.m0(d3Var2);
                objQ6 = d3Var2;
            } else {
                ey1 ey1Var112 = ey1Var4;
                l6 l6Var5 = l6Var2;
                u4Var3 = u4Var2;
                ey1 ey1Var113 = ey1Var6;
                ey1 ey1Var114 = ey1Var5;
                d3 d3Var3 = new d3(u4Var3, op0Var3, l6Var5, ey1Var114, ey1Var113, ey1Var112);
                op0Var4 = op0Var3;
                ey1Var5 = ey1Var114;
                ey1Var6 = ey1Var113;
                ey1Var4 = ey1Var112;
                ov0Var2.m0(d3Var3);
                objQ6 = d3Var3;
            }
            final au0 au0Var9 = (au0) objQ6;
            if (au0Var5 != 0) {
                ov0Var2.c0(-469134669);
                z6 = true;
                xq1.g(z5, au0Var5, ov0Var2, i5 & 112, 1);
            } else {
                z6 = true;
                ov0Var2.c0(i8);
            }
            ov0Var2.p(z5);
            fn0 fn0Var3 = iw2.c;
            hh0 hh0Var5 = mz.a;
            dv1 dv1VarF2 = zm3.F(zm3.P(ji2.H(ji2.R(xp1.k(fn0Var3, ((kz) ov0Var2.j(hh0Var5)).n, iy0Var))), zm3.O(ov0Var2), z6), 24.0f, 0.0f, 2);
            yz yzVarA5 = wz.a(am1.g, nrVar, ov0Var2, 48);
            int iHashCode7 = Long.hashCode(ov0Var2.T);
            l72 l72VarL7 = ov0Var2.l();
            dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarF2);
            w20.b.getClass();
            x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            ghVar = v20.e;
            q73.h(ov0Var2, ghVar, yzVarA5);
            ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL7);
            Integer numValueOf2 = Integer.valueOf(iHashCode7);
            ghVar3 = v20.f;
            q73.h(ov0Var2, ghVar3, numValueOf2);
            waVar = v20.g;
            q73.g(ov0Var2, waVar);
            ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH7);
            if (au0Var5 != 0) {
                ov0Var2.c0(701267340);
                av1 av1Var5 = av1Var2;
                dv1 dv1VarE3 = iw2.e(av1Var5, 1.0f);
                kk2 kk2VarA3 = jk2.a(am1.e, j9.o, ov0Var2, 0);
                ey1 ey1Var115 = ey1Var5;
                int iHashCode8 = Long.hashCode(ov0Var2.T);
                l72 l72VarL8 = ov0Var2.l();
                dv1 dv1VarH8 = xp1.H(ov0Var2, dv1VarE3);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar, kk2VarA3);
                q73.h(ov0Var2, ghVar2, l72VarL8);
                az2.s(iHashCode8, ov0Var2, ghVar3, ov0Var2, waVar);
                q73.h(ov0Var2, ghVar4, dv1VarH8);
                waVar2 = waVar;
                ghVar6 = ghVar;
                ghVar5 = ghVar4;
                ey1Var7 = ey1Var115;
                r5 = 0;
                av1Var3 = av1Var5;
                xq1.l(au0Var5, null, false, null, null, n51.k, ov0Var2, ((i5 >> 3) & 14) | 1572864, 62);
                au0Var6 = au0Var5;
                r9 = 1;
                ov0Var2.p(true);
                ov0Var2.p(false);
            } else {
                ey1Var7 = ey1Var5;
                au0Var6 = au0Var5;
                boolean z10 = z5;
                waVar2 = waVar;
                ghVar5 = ghVar4;
                r9 = 1;
                av1Var3 = av1Var2;
                ghVar6 = ghVar;
                ov0Var2.c0(701272491);
                gh0.h(ov0Var2, iw2.g(av1Var3, 36.0f));
                ov0Var2.p(z10);
                r5 = z10;
            }
            dv1 dv1VarE4 = iw2.e(iw2.p(r9, 440.0f), 1.0f);
            jo joVar2 = new jo(24.0f, r9, new fo(r5));
            nr nrVar3 = j9.r;
            yz yzVarA6 = wz.a(joVar2, nrVar3, ov0Var2, 6);
            int iHashCode9 = Long.hashCode(ov0Var2.T);
            l72 l72VarL9 = ov0Var2.l();
            dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarE4);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar6, yzVarA6);
            q73.h(ov0Var2, ghVar2, l72VarL9);
            az2.s(iHashCode9, ov0Var2, ghVar3, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar5, dv1VarH9);
            kk2 kk2VarA4 = jk2.a(new jo(12.0f, true, new fo(r5)), j9.p, ov0Var2, 54);
            int iHashCode10 = Long.hashCode(ov0Var2.T);
            l72 l72VarL10 = ov0Var2.l();
            dv1 dv1VarH10 = xp1.H(ov0Var2, av1Var3);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar6, kk2VarA4);
            q73.h(ov0Var2, ghVar2, l72VarL10);
            az2.s(iHashCode10, ov0Var2, ghVar3, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar5, dv1VarH10);
            String packageName3 = ((Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b)).getPackageName();
            packageName3.getClass();
            ks.C(packageName3, iw2.k(av1Var3, 56.0f), ov0Var2, 48);
            String strN3 = ke0.N(2131624028, ov0Var2);
            hh0 hh0Var6 = le3.a;
            q93 q93Var2 = ((je3) ov0Var2.j(hh0Var6)).g;
            ov0Var3 = ov0Var2;
            jr0 jr0Var2 = jr0.j;
            s83.b(strN3, null, 0L, 0L, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var2, ov0Var3, 1572864, 0, 131006);
            ov0Var3.p(true);
            yz yzVarA7 = wz.a(new jo(10.0f, true, new fo(r5)), nrVar3, ov0Var3, 6);
            int iHashCode11 = Long.hashCode(ov0Var3.T);
            l72 l72VarL11 = ov0Var3.l();
            dv1 dv1VarH11 = xp1.H(ov0Var3, av1Var3);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar6, yzVarA7);
            q73.h(ov0Var3, ghVar2, l72VarL11);
            az2.s(iHashCode11, ov0Var3, ghVar3, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar5, dv1VarH11);
            s83.b(ke0.N(2131623971, ov0Var3), null, 0L, 0L, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var6)).e, ov0Var3, 1572864, 0, 131006);
            s83.b(ke0.N(2131623969, ov0Var3), null, ((kz) ov0Var3.j(r51)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var6)).k, ov0Var3, 0, 0, 131066);
            ov0Var3.p(true);
            final ey1 ey1Var116 = ey1Var6;
            final String str4 = str2;
            final op0 op0Var6 = op0Var4;
            final u4 u4Var5 = u4Var3;
            final ey1 ey1Var117 = ey1Var4;
            final ey1 ey1Var118 = ey1Var7;
            e33.a(null, cj2.a(24.0f), ((kz) ov0Var3.j(hh0Var5)).p, 0L, 0.0f, 0.0f, null, sb.a0(-671523010, new pu0() { // from class: r4
                /* JADX WARN: Code duplicated, block: B:100:0x04d4  */
                /* JADX WARN: Code duplicated, block: B:103:0x04ec  */
                /* JADX WARN: Code duplicated, block: B:106:0x04f1  */
                /* JADX WARN: Code duplicated, block: B:110:0x050e  */
                /* JADX WARN: Code duplicated, block: B:111:0x0518  */
                /* JADX WARN: Code duplicated, block: B:114:0x0556  */
                /* JADX WARN: Code duplicated, block: B:117:0x05b0  */
                /* JADX WARN: Code duplicated, block: B:119:0x05c0 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:120:0x05c2  */
                /* JADX WARN: Code duplicated, block: B:123:0x05fa  */
                /* JADX WARN: Code duplicated, block: B:58:0x02f9  */
                /* JADX WARN: Code duplicated, block: B:61:0x0368  */
                /* JADX WARN: Code duplicated, block: B:62:0x036b  */
                /* JADX WARN: Code duplicated, block: B:65:0x0383  */
                /* JADX WARN: Code duplicated, block: B:66:0x0385  */
                /* JADX WARN: Code duplicated, block: B:69:0x0395  */
                /* JADX WARN: Code duplicated, block: B:72:0x039a  */
                /* JADX WARN: Code duplicated, block: B:76:0x03b5 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:79:0x03bb  */
                /* JADX WARN: Code duplicated, block: B:82:0x03dc A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:85:0x03e1  */
                /* JADX WARN: Code duplicated, block: B:88:0x0448  */
                /* JADX WARN: Code duplicated, block: B:90:0x0450  */
                /* JADX WARN: Code duplicated, block: B:91:0x0454  */
                /* JADX WARN: Code duplicated, block: B:94:0x0467  */
                /* JADX WARN: Code duplicated, block: B:96:0x047c  */
                /* JADX WARN: Code duplicated, block: B:99:0x04d1  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v22 */
                /* JADX WARN: Type inference failed for: r14v23, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v39 */
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z11;
                    final l6 l6Var6;
                    final ey1 ey1Var119;
                    final ey1 ey1Var120;
                    final ey1 ey1Var121;
                    final ey1 ey1Var20;
                    Object obj3;
                    String str5;
                    Object obj4;
                    boolean z12;
                    av1 av1Var6;
                    Object obj5;
                    boolean zH3;
                    Object objQ9;
                    ov0 ov0Var11;
                    Object obj6;
                    av1 av1Var7;
                    u4 u4Var6;
                    boolean z13;
                    ak3 j62Var;
                    int i14;
                    au0 au0Var10;
                    boolean zF2;
                    Object objQ10;
                    Object obj7;
                    boolean zH4;
                    Object objQ11;
                    boolean zH5;
                    Object objQ12;
                    int i15;
                    Object obj8;
                    ov0 ov0Var12;
                    Object obj9;
                    ?? r14;
                    ov0 ov0Var13;
                    ov0 ov0Var14;
                    boolean z14;
                    boolean zH6;
                    Object objQ13;
                    int i16;
                    boolean z15;
                    long j2;
                    ak3 j62Var2;
                    boolean zF3;
                    Object objQ14;
                    Object objQ15;
                    int i17;
                    boolean z16;
                    long j3;
                    boolean z17;
                    long j4;
                    long j5;
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    b81 b81Var = u92.w;
                    boolean z18 = true;
                    ov0 ov0Var15 = (ov0) f30Var2;
                    if (ov0Var15.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        av1 av1Var8 = av1.a;
                        dv1 dv1VarD2 = zm3.D(av1Var8, 20.0f);
                        char c2 = 6;
                        yz yzVarA8 = wz.a(new jo(16.0f, true, new fo(0)), j9.r, ov0Var15, 6);
                        int iHashCode12 = Long.hashCode(ov0Var15.T);
                        l72 l72VarL12 = ov0Var15.l();
                        dv1 dv1VarH12 = xp1.H(ov0Var15, dv1VarD2);
                        w20.b.getClass();
                        x30 x30Var3 = v20.b;
                        ov0Var15.g0();
                        if (ov0Var15.S) {
                            ov0Var15.k(x30Var3);
                        } else {
                            ov0Var15.p0();
                        }
                        gh ghVar7 = v20.e;
                        q73.h(ov0Var15, ghVar7, yzVarA8);
                        gh ghVar8 = v20.d;
                        q73.h(ov0Var15, ghVar8, l72VarL12);
                        Integer numValueOf3 = Integer.valueOf(iHashCode12);
                        gh ghVar9 = v20.f;
                        q73.h(ov0Var15, ghVar9, numValueOf3);
                        wa waVar3 = v20.g;
                        q73.g(ov0Var15, waVar3);
                        gh ghVar10 = v20.c;
                        q73.h(ov0Var15, ghVar10, dv1VarH12);
                        dv1 dv1VarD3 = zm3.D(xp1.k(iw2.e(av1Var8, 1.0f), ((kz) ov0Var15.j(mz.a)).r, cj2.a(14.0f)), 4.0f);
                        kk2 kk2VarA5 = jk2.a(new jo(4.0f, true, new fo(0)), j9.o, ov0Var15, 6);
                        int iHashCode13 = Long.hashCode(ov0Var15.T);
                        l72 l72VarL13 = ov0Var15.l();
                        dv1 dv1VarH13 = xp1.H(ov0Var15, dv1VarD3);
                        ov0Var15.g0();
                        if (ov0Var15.S) {
                            ov0Var15.k(x30Var3);
                        } else {
                            ov0Var15.p0();
                        }
                        q73.h(ov0Var15, ghVar7, kk2VarA5);
                        q73.h(ov0Var15, ghVar8, l72VarL13);
                        az2.s(iHashCode13, ov0Var15, ghVar9, ov0Var15, waVar3);
                        q73.h(ov0Var15, ghVar10, dv1VarH13);
                        ov0Var15.c0(1452283171);
                        Iterator it = am1.G(Boolean.FALSE, Boolean.TRUE).iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            z11 = z4;
                            l6Var6 = l6Var;
                            ey1Var119 = ey1Var117;
                            ey1Var120 = ey1Var116;
                            ey1Var121 = ey1Var17;
                            ey1Var20 = ey1Var18;
                            obj3 = d30.a;
                            if (!zHasNext) {
                                break;
                            }
                            final boolean zBooleanValue = ((Boolean) it.next()).booleanValue();
                            boolean z19 = ((Boolean) ey1Var119.getValue()).booleanValue() == zBooleanValue ? z18 : false;
                            boolean z110 = !z11;
                            bj2 bj2VarA = cj2.a(11.0f);
                            wb1 wb1Var = new wb1(1.0f, z18);
                            if (z19) {
                                ov0Var15.c0(-391612038);
                                j4 = ((kz) ov0Var15.j(mz.a)).a;
                                z17 = false;
                                ov0Var15.p(false);
                            } else {
                                z17 = false;
                                ov0Var15.c0(-391611426);
                                ov0Var15.p(false);
                                j4 = hz.f;
                            }
                            if (z19) {
                                ov0Var15.c0(-391608228);
                                j5 = ((kz) ov0Var15.j(mz.a)).b;
                            } else {
                                ov0Var15.c0(-391606909);
                                j5 = ((kz) ov0Var15.j(mz.a)).s;
                            }
                            ov0Var15.p(z17);
                            boolean zH7 = ov0Var15.h(l6Var6) | ov0Var15.f(ey1Var119) | ov0Var15.g(zBooleanValue);
                            Iterator it2 = it;
                            Object objQ16 = ov0Var15.Q();
                            if (zH7 || objQ16 == obj3) {
                                objQ16 = new au0() { // from class: s4
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        l6Var6.e();
                                        ey1Var119.setValue(Boolean.valueOf(zBooleanValue));
                                        ey1Var120.setValue("");
                                        ey1Var121.setValue("");
                                        ey1Var20.setValue(Boolean.FALSE);
                                        return mf3.a;
                                    }
                                };
                                ov0Var15.m0(objQ16);
                            }
                            byte b2 = 0;
                            ov0 ov0Var16 = ov0Var15;
                            e33.b((au0) objQ16, wb1Var, z110, bj2VarA, j4, j5, 0.0f, null, null, sb.a0(-1396336056, new i4(zBooleanValue, b2, b2), ov0Var15), ov0Var16, 0, 960);
                            c2 = 6;
                            ov0Var15 = ov0Var16;
                            it = it2;
                            b81Var = b81Var;
                            z18 = true;
                        }
                        b81 b81Var2 = b81Var;
                        ov0Var15.p(false);
                        ov0Var15.p(true);
                        String str6 = str4;
                        if (str6 == null || yo.H0(new String[]{"login_required", "companion_login_required", "device_signed_out", "device_login_required", "session_replaced", "hardware_confirmation_required", "hardware_conflict"}).contains(str6)) {
                            str5 = "companion_in_use";
                            obj4 = obj3;
                            z12 = false;
                            ov0Var15.c0(-1280344838);
                        } else {
                            ov0Var15.c0(-1272190133);
                            boolean zEquals = str6.equals("companion_in_use");
                            bj2 bj2VarA2 = cj2.a(12.0f);
                            if (zEquals) {
                                ov0Var15.c0(-1703601128);
                                j3 = ((kz) ov0Var15.j(mz.a)).c;
                                z16 = false;
                            } else {
                                z16 = false;
                                ov0Var15.c0(-1703599594);
                                j3 = ((kz) ov0Var15.j(mz.a)).y;
                            }
                            ov0Var15.p(z16);
                            ov0 ov0Var17 = ov0Var15;
                            obj4 = obj3;
                            str5 = "companion_in_use";
                            e33.a(null, bj2VarA2, j3, 0L, 0.0f, 0.0f, null, sb.a0(-1288719086, new j4(str6, zEquals), ov0Var15), ov0Var17, 12582912, 121);
                            ov0Var15 = ov0Var17;
                            z12 = false;
                        }
                        ov0Var15.p(z12);
                        ey1 ey1Var21 = ey1Var118;
                        String str7 = (String) ey1Var21.getValue();
                        dv1 dv1VarE5 = iw2.e(av1Var8, 1.0f);
                        bj2 bj2VarA3 = cj2.a(14.0f);
                        boolean z20 = !z11;
                        n91 n91Var = new n91(2, 6, 115);
                        final op0 op0Var7 = op0Var6;
                        boolean zH8 = ov0Var15.h(op0Var7);
                        Object objQ17 = ov0Var15.Q();
                        if (zH8) {
                            av1Var6 = av1Var8;
                            obj5 = obj4;
                        } else {
                            av1Var6 = av1Var8;
                            obj5 = obj4;
                            if (objQ17 == obj5) {
                            }
                            m91 m91Var8 = new m91(null, (lu0) objQ17, null, 59);
                            zH3 = ov0Var15.h(l6Var6) | ov0Var15.f(ey1Var21);
                            objQ9 = ov0Var15.Q();
                            if (zH3 || objQ9 == obj5) {
                                objQ9 = new l4(l6Var6, ey1Var21, 0);
                                ov0Var15.m0(objQ9);
                            }
                            ov0Var11 = ov0Var15;
                            obj6 = obj5;
                            av1Var7 = av1Var6;
                            ee0.i(str7, (lu0) objQ9, dv1VarE5, z20, null, n51.l, null, n51.m, null, null, false, null, n91Var, m91Var8, true, 0, 0, bj2VarA3, null, ov0Var11, 102236544, 12779520, 6061744);
                            String str10 = (String) ey1Var120.getValue();
                            dv1 dv1VarE7 = iw2.e(av1Var7, 1.0f);
                            bj2 bj2VarA7 = cj2.a(14.0f);
                            u4Var6 = u4Var5;
                            z13 = u4Var6.a;
                            if (((Boolean) r22.getValue()).booleanValue()) {
                                j62Var = b81Var2;
                            } else {
                                j62Var = new j62();
                            }
                            if (((Boolean) ey1Var119.getValue()).booleanValue()) {
                                i14 = 6;
                            } else {
                                i14 = 7;
                            }
                            n91 n91Var5 = new n91(7, i14, 115);
                            au0Var10 = au0Var9;
                            zF2 = ov0Var11.f(au0Var10);
                            objQ10 = ov0Var11.Q();
                            if (zF2) {
                                obj7 = obj6;
                            } else {
                                obj7 = obj6;
                                if (objQ10 == obj7) {
                                }
                                lu0 lu0Var4 = (lu0) objQ10;
                                zH4 = ov0Var11.h(op0Var7);
                                objQ11 = ov0Var11.Q();
                                if (zH4 || objQ11 == obj7) {
                                    final int i113 = 1;
                                    objQ11 = new lu0() { // from class: k4
                                        @Override // defpackage.lu0
                                        public final Object invoke(Object obj10) {
                                            int i114 = i113;
                                            mf3 mf3Var = mf3.a;
                                            op0 op0Var8 = op0Var7;
                                            ((l91) obj10).getClass();
                                            switch (i114) {
                                                case 0:
                                                    ((rp0) op0Var8).h(6, true);
                                                    break;
                                                default:
                                                    ((rp0) op0Var8).h(6, true);
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    };
                                    ov0Var11.m0(objQ11);
                                }
                                m91 m91Var12 = new m91(lu0Var4, (lu0) objQ11, null, 58);
                                zH5 = ov0Var11.h(l6Var6);
                                objQ12 = ov0Var11.Q();
                                if (!zH5 || objQ12 == obj7) {
                                    i15 = 1;
                                    objQ12 = new l4(l6Var6, ey1Var120, 1);
                                    ov0Var11.m0(objQ12);
                                } else {
                                    i15 = 1;
                                }
                                obj8 = obj7;
                                ee0.i(str10, (lu0) objQ12, dv1VarE7, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i15), ov0Var11), null, z13, j62Var, n91Var5, m91Var12, true, 0, 0, bj2VarA7, null, ov0Var11, 907542912, 12582912, 6036656);
                                ov0Var12 = ov0Var11;
                                if (((Boolean) ey1Var119.getValue()).booleanValue()) {
                                    ov0Var12.c0(-1269726346);
                                    if (z13) {
                                        i16 = 2131623978;
                                    } else {
                                        i16 = 2131624233;
                                    }
                                    String strN5 = ke0.N(i16, ov0Var12);
                                    q93 q93Var5 = ((je3) ov0Var12.j(le3.a)).l;
                                    if (z13) {
                                        ov0Var12.c0(-1703518867);
                                        j2 = ((kz) ov0Var12.j(mz.a)).w;
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                        ov0Var12.c0(-1703517672);
                                        j2 = ((kz) ov0Var12.j(mz.a)).s;
                                    }
                                    ov0Var12.p(z15);
                                    s83.b(strN5, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var5, ov0Var12, 0, 0, 131066);
                                    String str12 = (String) ey1Var121.getValue();
                                    dv1 dv1VarE9 = iw2.e(av1Var7, 1.0f);
                                    bj2 bj2VarA9 = cj2.a(14.0f);
                                    boolean z24 = u4Var6.b;
                                    if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                        j62Var2 = b81Var2;
                                    } else {
                                        j62Var2 = new j62();
                                    }
                                    n91 n91Var7 = new n91(7, 7, 115);
                                    zF3 = ov0Var12.f(au0Var10);
                                    objQ14 = ov0Var12.Q();
                                    if (zF3) {
                                        obj9 = obj8;
                                    } else {
                                        obj9 = obj8;
                                        if (objQ14 == obj9) {
                                        }
                                        m91 m91Var14 = new m91((lu0) objQ14, null, null, 62);
                                        objQ15 = ov0Var12.Q();
                                        if (objQ15 == obj9) {
                                            i17 = 0;
                                            objQ15 = new f4(ey1Var121, 0);
                                            ov0Var12.m0(objQ15);
                                        } else {
                                            i17 = 0;
                                        }
                                        ee0.i(str12, (lu0) objQ15, dv1VarE9, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z24, j62Var2, n91Var7, m91Var14, true, 0, 0, bj2VarA9, null, ov0Var12, 102236592, 12779904, 6033072);
                                        ov0Var13 = ov0Var12;
                                        r14 = 0;
                                    }
                                    objQ14 = new m4(1, au0Var10);
                                    ov0Var12.m0(objQ14);
                                    m91 m91Var15 = new m91((lu0) objQ14, null, null, 62);
                                    objQ15 = ov0Var12.Q();
                                    if (objQ15 == obj9) {
                                        i17 = 0;
                                        objQ15 = new f4(ey1Var121, 0);
                                        ov0Var12.m0(objQ15);
                                    } else {
                                        i17 = 0;
                                    }
                                    ee0.i(str12, (lu0) objQ15, dv1VarE9, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z24, j62Var2, n91Var7, m91Var15, true, 0, 0, bj2VarA9, null, ov0Var12, 102236592, 12779904, 6033072);
                                    ov0Var13 = ov0Var12;
                                    r14 = 0;
                                } else {
                                    obj9 = obj8;
                                    r14 = 0;
                                    ov0Var12.c0(-1280344838);
                                    ov0Var13 = ov0Var12;
                                }
                                ov0Var13.p(r14);
                                ov0Var14 = ov0Var13;
                                n51.a(au0Var10, iw2.h(iw2.e(av1Var7, 1.0f), 52.0f, 0.0f, 2), u4Var6.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var119, z11), ov0Var13), ov0Var14, 805306416, 496);
                                if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str5, "storage_unavailable"}), str6)) {
                                    ov0Var14.c0(-1267899485);
                                    zH6 = ov0Var14.h(l6Var6);
                                    objQ13 = ov0Var14.Q();
                                    if (zH6 || objQ13 == obj9) {
                                        objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                        ov0Var14.m0(objQ13);
                                    }
                                    n51.j((au0) ((o81) objQ13), new by0(j9.s), z20, null, null, null, n51.r, ov0Var14, 805306368, 504);
                                    z14 = false;
                                } else {
                                    z14 = false;
                                    ov0Var14.c0(-1280344838);
                                }
                                ov0Var14.p(z14);
                                ov0Var14.p(true);
                            }
                            objQ10 = new m4(0, au0Var10);
                            ov0Var11.m0(objQ10);
                            lu0 lu0Var5 = (lu0) objQ10;
                            zH4 = ov0Var11.h(op0Var7);
                            objQ11 = ov0Var11.Q();
                            if (zH4) {
                                final int i114 = 1;
                                objQ11 = new lu0() { // from class: k4
                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj10) {
                                        int i115 = i114;
                                        mf3 mf3Var = mf3.a;
                                        op0 op0Var8 = op0Var7;
                                        ((l91) obj10).getClass();
                                        switch (i115) {
                                            case 0:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                            default:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var11.m0(objQ11);
                            } else {
                                final int i115 = 1;
                                objQ11 = new lu0() { // from class: k4
                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj10) {
                                        int i116 = i115;
                                        mf3 mf3Var = mf3.a;
                                        op0 op0Var8 = op0Var7;
                                        ((l91) obj10).getClass();
                                        switch (i116) {
                                            case 0:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                            default:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var11.m0(objQ11);
                            }
                            m91 m91Var13 = new m91(lu0Var5, (lu0) objQ11, null, 58);
                            zH5 = ov0Var11.h(l6Var6);
                            objQ12 = ov0Var11.Q();
                            if (zH5) {
                                i15 = 1;
                                objQ12 = new l4(l6Var6, ey1Var120, 1);
                                ov0Var11.m0(objQ12);
                            } else {
                                i15 = 1;
                                objQ12 = new l4(l6Var6, ey1Var120, 1);
                                ov0Var11.m0(objQ12);
                            }
                            obj8 = obj7;
                            ee0.i(str10, (lu0) objQ12, dv1VarE7, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i15), ov0Var11), null, z13, j62Var, n91Var5, m91Var13, true, 0, 0, bj2VarA7, null, ov0Var11, 907542912, 12582912, 6036656);
                            ov0Var12 = ov0Var11;
                            if (((Boolean) ey1Var119.getValue()).booleanValue()) {
                                ov0Var12.c0(-1269726346);
                                if (z13) {
                                    i16 = 2131623978;
                                } else {
                                    i16 = 2131624233;
                                }
                                String strN6 = ke0.N(i16, ov0Var12);
                                q93 q93Var6 = ((je3) ov0Var12.j(le3.a)).l;
                                if (z13) {
                                    ov0Var12.c0(-1703518867);
                                    j2 = ((kz) ov0Var12.j(mz.a)).w;
                                    z15 = false;
                                } else {
                                    z15 = false;
                                    ov0Var12.c0(-1703517672);
                                    j2 = ((kz) ov0Var12.j(mz.a)).s;
                                }
                                ov0Var12.p(z15);
                                s83.b(strN6, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var6, ov0Var12, 0, 0, 131066);
                                String str13 = (String) ey1Var121.getValue();
                                dv1 dv1VarE10 = iw2.e(av1Var7, 1.0f);
                                bj2 bj2VarA10 = cj2.a(14.0f);
                                boolean z25 = u4Var6.b;
                                if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                    j62Var2 = b81Var2;
                                } else {
                                    j62Var2 = new j62();
                                }
                                n91 n91Var8 = new n91(7, 7, 115);
                                zF3 = ov0Var12.f(au0Var10);
                                objQ14 = ov0Var12.Q();
                                if (zF3) {
                                    obj9 = obj8;
                                    if (objQ14 == obj9) {
                                    }
                                    m91 m91Var16 = new m91((lu0) objQ14, null, null, 62);
                                    objQ15 = ov0Var12.Q();
                                    if (objQ15 == obj9) {
                                        i17 = 0;
                                        objQ15 = new f4(ey1Var121, 0);
                                        ov0Var12.m0(objQ15);
                                    } else {
                                        i17 = 0;
                                    }
                                    ee0.i(str13, (lu0) objQ15, dv1VarE10, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z25, j62Var2, n91Var8, m91Var16, true, 0, 0, bj2VarA10, null, ov0Var12, 102236592, 12779904, 6033072);
                                    ov0Var13 = ov0Var12;
                                    r14 = 0;
                                } else {
                                    obj9 = obj8;
                                }
                                objQ14 = new m4(1, au0Var10);
                                ov0Var12.m0(objQ14);
                                m91 m91Var17 = new m91((lu0) objQ14, null, null, 62);
                                objQ15 = ov0Var12.Q();
                                if (objQ15 == obj9) {
                                    i17 = 0;
                                    objQ15 = new f4(ey1Var121, 0);
                                    ov0Var12.m0(objQ15);
                                } else {
                                    i17 = 0;
                                }
                                ee0.i(str13, (lu0) objQ15, dv1VarE10, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z25, j62Var2, n91Var8, m91Var17, true, 0, 0, bj2VarA10, null, ov0Var12, 102236592, 12779904, 6033072);
                                ov0Var13 = ov0Var12;
                                r14 = 0;
                            } else {
                                obj9 = obj8;
                                r14 = 0;
                                ov0Var12.c0(-1280344838);
                                ov0Var13 = ov0Var12;
                            }
                            ov0Var13.p(r14);
                            ov0Var14 = ov0Var13;
                            n51.a(au0Var10, iw2.h(iw2.e(av1Var7, 1.0f), 52.0f, 0.0f, 2), u4Var6.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var119, z11), ov0Var13), ov0Var14, 805306416, 496);
                            if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str5, "storage_unavailable"}), str6)) {
                                ov0Var14.c0(-1267899485);
                                zH6 = ov0Var14.h(l6Var6);
                                objQ13 = ov0Var14.Q();
                                if (zH6) {
                                    objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                    ov0Var14.m0(objQ13);
                                } else {
                                    objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                    ov0Var14.m0(objQ13);
                                }
                                n51.j((au0) ((o81) objQ13), new by0(j9.s), z20, null, null, null, n51.r, ov0Var14, 805306368, 504);
                                z14 = false;
                            } else {
                                z14 = false;
                                ov0Var14.c0(-1280344838);
                            }
                            ov0Var14.p(z14);
                            ov0Var14.p(true);
                        }
                        final int i19 = 0;
                        objQ17 = new lu0() { // from class: k4
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj10) {
                                int i116 = i19;
                                mf3 mf3Var = mf3.a;
                                op0 op0Var8 = op0Var7;
                                ((l91) obj10).getClass();
                                switch (i116) {
                                    case 0:
                                        ((rp0) op0Var8).h(6, true);
                                        break;
                                    default:
                                        ((rp0) op0Var8).h(6, true);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var15.m0(objQ17);
                        m91 m91Var9 = new m91(null, (lu0) objQ17, null, 59);
                        zH3 = ov0Var15.h(l6Var6) | ov0Var15.f(ey1Var21);
                        objQ9 = ov0Var15.Q();
                        if (zH3) {
                            objQ9 = new l4(l6Var6, ey1Var21, 0);
                            ov0Var15.m0(objQ9);
                        } else {
                            objQ9 = new l4(l6Var6, ey1Var21, 0);
                            ov0Var15.m0(objQ9);
                        }
                        ov0Var11 = ov0Var15;
                        obj6 = obj5;
                        av1Var7 = av1Var6;
                        ee0.i(str7, (lu0) objQ9, dv1VarE5, z20, null, n51.l, null, n51.m, null, null, false, null, n91Var, m91Var9, true, 0, 0, bj2VarA3, null, ov0Var11, 102236544, 12779520, 6061744);
                        String str11 = (String) ey1Var120.getValue();
                        dv1 dv1VarE8 = iw2.e(av1Var7, 1.0f);
                        bj2 bj2VarA8 = cj2.a(14.0f);
                        u4Var6 = u4Var5;
                        z13 = u4Var6.a;
                        if (((Boolean) r22.getValue()).booleanValue()) {
                            j62Var = b81Var2;
                        } else {
                            j62Var = new j62();
                        }
                        if (((Boolean) ey1Var119.getValue()).booleanValue()) {
                            i14 = 6;
                        } else {
                            i14 = 7;
                        }
                        n91 n91Var6 = new n91(7, i14, 115);
                        au0Var10 = au0Var9;
                        zF2 = ov0Var11.f(au0Var10);
                        objQ10 = ov0Var11.Q();
                        if (zF2) {
                            obj7 = obj6;
                            if (objQ10 == obj7) {
                            }
                            lu0 lu0Var6 = (lu0) objQ10;
                            zH4 = ov0Var11.h(op0Var7);
                            objQ11 = ov0Var11.Q();
                            if (zH4) {
                                final int i116 = 1;
                                objQ11 = new lu0() { // from class: k4
                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj10) {
                                        int i117 = i116;
                                        mf3 mf3Var = mf3.a;
                                        op0 op0Var8 = op0Var7;
                                        ((l91) obj10).getClass();
                                        switch (i117) {
                                            case 0:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                            default:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var11.m0(objQ11);
                            } else {
                                final int i117 = 1;
                                objQ11 = new lu0() { // from class: k4
                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj10) {
                                        int i118 = i117;
                                        mf3 mf3Var = mf3.a;
                                        op0 op0Var8 = op0Var7;
                                        ((l91) obj10).getClass();
                                        switch (i118) {
                                            case 0:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                            default:
                                                ((rp0) op0Var8).h(6, true);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var11.m0(objQ11);
                            }
                            m91 m91Var18 = new m91(lu0Var6, (lu0) objQ11, null, 58);
                            zH5 = ov0Var11.h(l6Var6);
                            objQ12 = ov0Var11.Q();
                            if (zH5) {
                                i15 = 1;
                                objQ12 = new l4(l6Var6, ey1Var120, 1);
                                ov0Var11.m0(objQ12);
                            } else {
                                i15 = 1;
                                objQ12 = new l4(l6Var6, ey1Var120, 1);
                                ov0Var11.m0(objQ12);
                            }
                            obj8 = obj7;
                            ee0.i(str11, (lu0) objQ12, dv1VarE8, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i15), ov0Var11), null, z13, j62Var, n91Var6, m91Var18, true, 0, 0, bj2VarA8, null, ov0Var11, 907542912, 12582912, 6036656);
                            ov0Var12 = ov0Var11;
                            if (((Boolean) ey1Var119.getValue()).booleanValue()) {
                                ov0Var12.c0(-1269726346);
                                if (z13) {
                                    i16 = 2131623978;
                                } else {
                                    i16 = 2131624233;
                                }
                                String strN7 = ke0.N(i16, ov0Var12);
                                q93 q93Var7 = ((je3) ov0Var12.j(le3.a)).l;
                                if (z13) {
                                    ov0Var12.c0(-1703518867);
                                    j2 = ((kz) ov0Var12.j(mz.a)).w;
                                    z15 = false;
                                } else {
                                    z15 = false;
                                    ov0Var12.c0(-1703517672);
                                    j2 = ((kz) ov0Var12.j(mz.a)).s;
                                }
                                ov0Var12.p(z15);
                                s83.b(strN7, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var7, ov0Var12, 0, 0, 131066);
                                String str14 = (String) ey1Var121.getValue();
                                dv1 dv1VarE11 = iw2.e(av1Var7, 1.0f);
                                bj2 bj2VarA11 = cj2.a(14.0f);
                                boolean z26 = u4Var6.b;
                                if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                    j62Var2 = b81Var2;
                                } else {
                                    j62Var2 = new j62();
                                }
                                n91 n91Var9 = new n91(7, 7, 115);
                                zF3 = ov0Var12.f(au0Var10);
                                objQ14 = ov0Var12.Q();
                                if (zF3) {
                                    obj9 = obj8;
                                    if (objQ14 == obj9) {
                                    }
                                    m91 m91Var19 = new m91((lu0) objQ14, null, null, 62);
                                    objQ15 = ov0Var12.Q();
                                    if (objQ15 == obj9) {
                                        i17 = 0;
                                        objQ15 = new f4(ey1Var121, 0);
                                        ov0Var12.m0(objQ15);
                                    } else {
                                        i17 = 0;
                                    }
                                    ee0.i(str14, (lu0) objQ15, dv1VarE11, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z26, j62Var2, n91Var9, m91Var19, true, 0, 0, bj2VarA11, null, ov0Var12, 102236592, 12779904, 6033072);
                                    ov0Var13 = ov0Var12;
                                    r14 = 0;
                                } else {
                                    obj9 = obj8;
                                }
                                objQ14 = new m4(1, au0Var10);
                                ov0Var12.m0(objQ14);
                                m91 m91Var110 = new m91((lu0) objQ14, null, null, 62);
                                objQ15 = ov0Var12.Q();
                                if (objQ15 == obj9) {
                                    i17 = 0;
                                    objQ15 = new f4(ey1Var121, 0);
                                    ov0Var12.m0(objQ15);
                                } else {
                                    i17 = 0;
                                }
                                ee0.i(str14, (lu0) objQ15, dv1VarE11, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z26, j62Var2, n91Var9, m91Var110, true, 0, 0, bj2VarA11, null, ov0Var12, 102236592, 12779904, 6033072);
                                ov0Var13 = ov0Var12;
                                r14 = 0;
                            } else {
                                obj9 = obj8;
                                r14 = 0;
                                ov0Var12.c0(-1280344838);
                                ov0Var13 = ov0Var12;
                            }
                            ov0Var13.p(r14);
                            ov0Var14 = ov0Var13;
                            n51.a(au0Var10, iw2.h(iw2.e(av1Var7, 1.0f), 52.0f, 0.0f, 2), u4Var6.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var119, z11), ov0Var13), ov0Var14, 805306416, 496);
                            if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str5, "storage_unavailable"}), str6)) {
                                ov0Var14.c0(-1267899485);
                                zH6 = ov0Var14.h(l6Var6);
                                objQ13 = ov0Var14.Q();
                                if (zH6) {
                                    objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                    ov0Var14.m0(objQ13);
                                } else {
                                    objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                    ov0Var14.m0(objQ13);
                                }
                                n51.j((au0) ((o81) objQ13), new by0(j9.s), z20, null, null, null, n51.r, ov0Var14, 805306368, 504);
                                z14 = false;
                            } else {
                                z14 = false;
                                ov0Var14.c0(-1280344838);
                            }
                            ov0Var14.p(z14);
                            ov0Var14.p(true);
                        } else {
                            obj7 = obj6;
                        }
                        objQ10 = new m4(0, au0Var10);
                        ov0Var11.m0(objQ10);
                        lu0 lu0Var7 = (lu0) objQ10;
                        zH4 = ov0Var11.h(op0Var7);
                        objQ11 = ov0Var11.Q();
                        if (zH4) {
                            final int i118 = 1;
                            objQ11 = new lu0() { // from class: k4
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj10) {
                                    int i119 = i118;
                                    mf3 mf3Var = mf3.a;
                                    op0 op0Var8 = op0Var7;
                                    ((l91) obj10).getClass();
                                    switch (i119) {
                                        case 0:
                                            ((rp0) op0Var8).h(6, true);
                                            break;
                                        default:
                                            ((rp0) op0Var8).h(6, true);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var11.m0(objQ11);
                        } else {
                            final int i119 = 1;
                            objQ11 = new lu0() { // from class: k4
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj10) {
                                    int i1110 = i119;
                                    mf3 mf3Var = mf3.a;
                                    op0 op0Var8 = op0Var7;
                                    ((l91) obj10).getClass();
                                    switch (i1110) {
                                        case 0:
                                            ((rp0) op0Var8).h(6, true);
                                            break;
                                        default:
                                            ((rp0) op0Var8).h(6, true);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var11.m0(objQ11);
                        }
                        m91 m91Var111 = new m91(lu0Var7, (lu0) objQ11, null, 58);
                        zH5 = ov0Var11.h(l6Var6);
                        objQ12 = ov0Var11.Q();
                        if (zH5) {
                            i15 = 1;
                            objQ12 = new l4(l6Var6, ey1Var120, 1);
                            ov0Var11.m0(objQ12);
                        } else {
                            i15 = 1;
                            objQ12 = new l4(l6Var6, ey1Var120, 1);
                            ov0Var11.m0(objQ12);
                        }
                        obj8 = obj7;
                        ee0.i(str11, (lu0) objQ12, dv1VarE8, z20, null, n51.n, null, n51.o, sb.a0(616796378, new i3(ey1Var20, i15), ov0Var11), null, z13, j62Var, n91Var6, m91Var111, true, 0, 0, bj2VarA8, null, ov0Var11, 907542912, 12582912, 6036656);
                        ov0Var12 = ov0Var11;
                        if (((Boolean) ey1Var119.getValue()).booleanValue()) {
                            ov0Var12.c0(-1269726346);
                            if (z13) {
                                i16 = 2131623978;
                            } else {
                                i16 = 2131624233;
                            }
                            String strN8 = ke0.N(i16, ov0Var12);
                            q93 q93Var8 = ((je3) ov0Var12.j(le3.a)).l;
                            if (z13) {
                                ov0Var12.c0(-1703518867);
                                j2 = ((kz) ov0Var12.j(mz.a)).w;
                                z15 = false;
                            } else {
                                z15 = false;
                                ov0Var12.c0(-1703517672);
                                j2 = ((kz) ov0Var12.j(mz.a)).s;
                            }
                            ov0Var12.p(z15);
                            s83.b(strN8, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var8, ov0Var12, 0, 0, 131066);
                            String str15 = (String) ey1Var121.getValue();
                            dv1 dv1VarE12 = iw2.e(av1Var7, 1.0f);
                            bj2 bj2VarA12 = cj2.a(14.0f);
                            boolean z27 = u4Var6.b;
                            if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                                j62Var2 = b81Var2;
                            } else {
                                j62Var2 = new j62();
                            }
                            n91 n91Var10 = new n91(7, 7, 115);
                            zF3 = ov0Var12.f(au0Var10);
                            objQ14 = ov0Var12.Q();
                            if (zF3) {
                                obj9 = obj8;
                                if (objQ14 == obj9) {
                                }
                                m91 m91Var112 = new m91((lu0) objQ14, null, null, 62);
                                objQ15 = ov0Var12.Q();
                                if (objQ15 == obj9) {
                                    i17 = 0;
                                    objQ15 = new f4(ey1Var121, 0);
                                    ov0Var12.m0(objQ15);
                                } else {
                                    i17 = 0;
                                }
                                ee0.i(str15, (lu0) objQ15, dv1VarE12, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z27, j62Var2, n91Var10, m91Var112, true, 0, 0, bj2VarA12, null, ov0Var12, 102236592, 12779904, 6033072);
                                ov0Var13 = ov0Var12;
                                r14 = 0;
                            } else {
                                obj9 = obj8;
                            }
                            objQ14 = new m4(1, au0Var10);
                            ov0Var12.m0(objQ14);
                            m91 m91Var113 = new m91((lu0) objQ14, null, null, 62);
                            objQ15 = ov0Var12.Q();
                            if (objQ15 == obj9) {
                                i17 = 0;
                                objQ15 = new f4(ey1Var121, 0);
                                ov0Var12.m0(objQ15);
                            } else {
                                i17 = 0;
                            }
                            ee0.i(str15, (lu0) objQ15, dv1VarE12, z20, null, n51.p, null, n51.q, null, sb.a0(1812731375, new g4(u4Var6, i17), ov0Var12), z27, j62Var2, n91Var10, m91Var113, true, 0, 0, bj2VarA12, null, ov0Var12, 102236592, 12779904, 6033072);
                            ov0Var13 = ov0Var12;
                            r14 = 0;
                        } else {
                            obj9 = obj8;
                            r14 = 0;
                            ov0Var12.c0(-1280344838);
                            ov0Var13 = ov0Var12;
                        }
                        ov0Var13.p(r14);
                        ov0Var14 = ov0Var13;
                        n51.a(au0Var10, iw2.h(iw2.e(av1Var7, 1.0f), 52.0f, 0.0f, 2), u4Var6.c, cj2.a(14.0f), null, null, null, null, sb.a0(-1613549288, new h4(r14, ey1Var119, z11), ov0Var13), ov0Var14, 805306416, 496);
                        if (zy.g0(yo.H0(new String[]{"network_error", "service_unavailable", str5, "storage_unavailable"}), str6)) {
                            ov0Var14.c0(-1267899485);
                            zH6 = ov0Var14.h(l6Var6);
                            objQ13 = ov0Var14.Q();
                            if (zH6) {
                                objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                ov0Var14.m0(objQ13);
                            } else {
                                objQ13 = new t4(0, l6Var6, l6.class, "refresh", "refresh()V", 0, 2);
                                ov0Var14.m0(objQ13);
                            }
                            n51.j((au0) ((o81) objQ13), new by0(j9.s), z20, null, null, null, n51.r, ov0Var14, 805306368, 504);
                            z14 = false;
                        } else {
                            z14 = false;
                            ov0Var14.c0(-1280344838);
                        }
                        ov0Var14.p(z14);
                        ov0Var14.p(true);
                    } else {
                        ov0Var15.W();
                    }
                    return mf3.a;
                }
            }, ov0Var3), ov0Var3, 12582912, 121);
            ov0 ov0Var11 = ov0Var3;
            gh0.h(ov0Var11, iw2.g(av1Var3, 16.0f));
            ov0Var11.p(true);
            ov0Var11.p(true);
            au0Var3 = au0Var6;
            ov0Var = ov0Var11;
        } else {
            ov0Var6.W();
            au0Var3 = au0Var2;
            ov0Var = ov0Var6;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final int i14 = 1;
            pu0Var = new pu0() { // from class: n4
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = i14;
                    mf3 mf3Var = mf3.a;
                    int i16 = i3;
                    int i17 = i2;
                    au0 au0Var10 = au0Var3;
                    l6 l6Var6 = l6Var;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            o51.a(l6Var6, au0Var10, f30Var2, wc0.m0(i17 | 1), i16);
                            break;
                        default:
                            o51.a(l6Var6, au0Var10, f30Var2, wc0.m0(i17 | 1), i16);
                            break;
                    }
                    return mf3Var;
                }
            };
            ee2VarT.d = pu0Var;
        }
    }

    public static final void b(l6 l6Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-843406882);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(l6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            a(l6Var, null, ov0Var, i3 & 14, 2);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new e4(l6Var, i2, i4);
        }
    }

    public static final void c(dv1 dv1Var, pu0 pu0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1298353104);
        int i3 = i2 | 6 | (ov0Var.h(pu0Var) ? 32 : 16);
        int i4 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new g23(j9.Y);
                ov0Var.m0(objQ);
            }
            av1 av1Var = av1.a;
            d((g23) objQ, av1Var, pu0Var, ov0Var, (i3 << 3) & 1008);
            dv1Var = av1Var;
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new mc(dv1Var, pu0Var, i2, i4);
        }
    }

    public static final void d(g23 g23Var, dv1 dv1Var, pu0 pu0Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(g23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(pu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(ov0Var.T);
            mv0 mv0VarY = ks.Y(ov0Var);
            dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
            l72 l72VarL = ov0Var.l();
            x30 x30Var = x30.v;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, g23Var.c, g23Var);
            q73.h(ov0Var, g23Var.d, mv0VarY);
            q73.h(ov0Var, g23Var.e, pu0Var);
            w20.b.getClass();
            q73.h(ov0Var, v20.d, l72VarL);
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            ov0Var.p(true);
            if (ov0Var.E()) {
                ov0Var.c0(-1259187287);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-1259245908);
                boolean zH = ov0Var.h(g23Var);
                Object objQ = ov0Var.Q();
                if (zH || objQ == d30.a) {
                    objQ = new ye(g23Var, 24);
                    ov0Var.m0(objQ);
                }
                oi0.i((au0) objQ, ov0Var);
                ov0Var.p(false);
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new hh(g23Var, dv1Var, pu0Var, i2, 1);
        }
    }

    public static boolean e(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static fp g() throws InterruptedException {
        fp fpVar = fp.l;
        fpVar.getClass();
        fp fpVar2 = fpVar.f;
        if (fpVar2 == null) {
            long jNanoTime = System.nanoTime();
            fp.i.await(fp.j, TimeUnit.MILLISECONDS);
            fp fpVar3 = fp.l;
            fpVar3.getClass();
            if (fpVar3.f != null || System.nanoTime() - jNanoTime < fp.k) {
                return null;
            }
            return fp.l;
        }
        long jNanoTime2 = fpVar2.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            fp.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        fp fpVar4 = fp.l;
        fpVar4.getClass();
        fpVar4.f = fpVar2.f;
        fpVar2.f = null;
        return fpVar2;
    }

    public static void h(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            b81.n(p91.s("startIndex: ", ", endIndex: ", i2, i3, ", size: "), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            fo.i(p91.n("startIndex: ", i2, i3, " > endIndex: "));
        }
    }

    public static void i(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            b81.n(p91.s("fromIndex: ", ", toIndex: ", i2, i3, ", size: "), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            fo.i(p91.n("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String j(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void l(gx2 gx2Var, ArrayList arrayList, int i2) {
        boolean zL = gx2Var.l(i2);
        int[] iArr = gx2Var.b;
        if (zL) {
            arrayList.add(gx2Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            l(gx2Var, arrayList, i4);
        }
    }

    public static int m(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int n(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static int o(int i2, int i3, String str, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static void p(lr2 lr2Var, CollectionRouteRecord collectionRouteRecord, int i2) {
        lr2Var.getClass();
        collectionRouteRecord.getClass();
        List<z60> listGeometry = CollectionRouteGeometryKt.geometry(collectionRouteRecord);
        if (listGeometry.size() < 2) {
            return;
        }
        ArrayList arrayList = new ArrayList(az.Y(listGeometry, 10));
        for (z60 z60Var : listGeometry) {
            arrayList.add(new i52(Double.valueOf(z60Var.a), Double.valueOf(z60Var.b)));
        }
        lr2 lr2Var2 = lr2Var;
        lr2Var2.c(arrayList, Color.rgb(59, 130, 246), 9.0f);
        List<i52> listO0 = zy.O0(listGeometry);
        ArrayList arrayList2 = new ArrayList(az.Y(listO0, 10));
        for (i52 i52Var : listO0) {
            arrayList2.add(Double.valueOf(vd0.o((z60) i52Var.e, (z60) i52Var.f)));
        }
        int size = arrayList2.size();
        int i3 = 0;
        double d2 = 0.0d;
        int i4 = 0;
        double dDoubleValue = 0.0d;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            dDoubleValue = ((Number) obj).doubleValue() + dDoubleValue;
        }
        double dMax = Math.max(25.0d, dDoubleValue / ((double) Math.max(1, i2 - 1)));
        int i5 = 0;
        double d3 = 0.0d;
        while (d3 <= dDoubleValue && i3 < i2) {
            double dDoubleValue2 = d2;
            while (i5 < arrayList2.size() - 1 && d3 > ((Number) arrayList2.get(i5)).doubleValue() + dDoubleValue2) {
                dDoubleValue2 = ((Number) arrayList2.get(i5)).doubleValue() + dDoubleValue2;
                i5++;
            }
            z60 z60VarM = vd0.m(listGeometry.get(i5), vd0.g(listGeometry.get(i5), listGeometry.get(i5 + 1)), d3 - dDoubleValue2);
            lr2Var2.a(z60VarM.a, z60VarM.b, collectionRouteRecord.getHalfWidthM(), Color.argb(24, 59, 130, 246), 0, 0.0f);
            d3 += dMax;
            i3++;
            lr2Var2 = lr2Var;
            d2 = dDoubleValue2;
        }
        z60 z60Var2 = (z60) zy.t0(listGeometry);
        lr2Var.a(z60Var2.a, z60Var2.b, collectionRouteRecord.getHalfWidthM(), Color.argb(24, 59, 130, 246), 0, 0.0f);
        lr2Var.b(((z60) zy.n0(listGeometry)).a, ((z60) zy.n0(listGeometry)).b, collectionRouteRecord.getName(), tq1.e);
        lr2Var.b(z60Var2.a, z60Var2.b, collectionRouteRecord.getName(), tq1.f);
    }

    public static dv1 q(dv1 dv1Var, fq fqVar, au0 au0Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, lu0 lu0Var4, int i2) {
        lu0 lu0Var5 = (i2 & 8) != 0 ? null : lu0Var2;
        lu0 lu0Var6 = (i2 & 16) != 0 ? null : lu0Var3;
        dv1Var.getClass();
        fqVar.getClass();
        au0Var.getClass();
        lu0Var.getClass();
        boolean zE = q1.e();
        dv1 dv1VarZ = av1.a;
        if (lu0Var6 != null) {
            dv1VarZ = am1.z(dv1VarZ, lu0Var6);
        }
        return dv1Var.d(dv1VarZ).d(new wf0(fqVar, au0Var, lu0Var, lu0Var5, lu0Var6, i0, lu0Var4, zE));
    }

    public static final int r(List list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iM = m(((x51) list.get(i4)).b, i2);
            if (iM < 0) {
                i3 = i4 + 1;
            } else {
                if (iM <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final Object s(Object obj, Object obj2, Object obj3) {
        r61 r61Var = obj instanceof r61 ? (r61) obj : null;
        if (r61Var == null) {
            return null;
        }
        Object obj4 = r61Var.b;
        Object obj5 = r61Var.a;
        if (f(obj5, obj2) && f(obj4, obj3)) {
            return obj;
        }
        Object objS = s(obj5, obj2, obj3);
        return objS == null ? s(obj4, obj2, obj3) : objS;
    }

    public static final kn2 t(ComponentCallbacks componentCallbacks) {
        if (componentCallbacks instanceof qf) {
            return ((qf) componentCallbacks).getScope();
        }
        if (componentCallbacks instanceof w91) {
            return (kn2) ((mn2) ((w91) componentCallbacks).a().a).h;
        }
        gn gnVar = j9.O;
        if (gnVar != null) {
            return (kn2) ((mn2) gnVar.a).h;
        }
        fo.n("KoinApplication has not been started");
        return null;
    }

    public static d21 u(bh0 bh0Var, uf2 uf2Var, int i2) {
        if ((i2 & 2) != 0) {
            uf2Var = uf2.e;
        }
        return new d21(bh0Var, uf2Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long v(int i2, String str) {
        int iO = o(0, i2, str, false);
        Matcher matcher = t60.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iI0 = -1;
        int i6 = -1;
        int i7 = -1;
        while (iO < i2) {
            int iO2 = o(iO + 1, i2, str, true);
            matcher.region(iO, iO2);
            if (i4 == -1 && matcher.usePattern(t60.m).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(t60.l).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i5 = Integer.parseInt(strGroup4);
            } else if (iI0 == -1) {
                Pattern pattern = t60.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iI0 = l13.i0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 != -1 && matcher.usePattern(t60.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i3 = Integer.parseInt(strGroup6);
                }
            } else if (i3 != -1) {
            }
            iO = o(iO2 + 1, i2, str, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            fo.i("Failed requirement.");
            return 0L;
        }
        if (iI0 == -1) {
            fo.i("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            fo.i("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            fo.i("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            fo.i("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            fo.i("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(bh3.f);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iI0 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final byte[] w(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final ja1 x(f30 f30Var) {
        int i2 = pw0.b;
        ov0 ov0Var = (ov0) f30Var;
        iw0 iw0Var = (iw0) ov0Var.j(z30.g);
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = new jw0(iw0Var);
            ov0Var.m0(objQ);
        }
        kw0 kw0Var = ((jw0) objQ).f;
        ey1 ey1VarL = ke0.L(k0, f30Var);
        boolean zF = ((ov0) f30Var).f(kw0Var);
        ov0 ov0Var2 = (ov0) f30Var;
        Object objQ2 = ov0Var2.Q();
        if (zF || objQ2 == c30Var) {
            objQ2 = new ja1(kw0Var, new di0(ey1VarL, 17));
            ov0Var2.m0(objQ2);
        }
        return (ja1) objQ2;
    }

    public static final void y(kx2 kx2Var, int i2, Object obj) {
        int iG = kx2Var.g(i2);
        Object[] objArr = kx2Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = d30.a;
        if (obj == obj2) {
            return;
        }
        j30.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void z(List list, int i2, int i3) {
        int iR = r(list, i2);
        if (iR < 0) {
            iR = -(iR + 1);
        }
        while (iR < list.size() && ((x51) list.get(iR)).b < i3) {
        }
    }

    public abstract List k(String str, List list);
}
