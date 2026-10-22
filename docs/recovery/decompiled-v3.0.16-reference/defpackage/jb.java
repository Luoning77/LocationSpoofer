package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jb extends c1 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final fx1 R;
    public final Channel A;
    public boolean B;
    public fb C;
    public gx1 D;
    public final hx1 E;
    public final ex1 F;
    public final ex1 G;
    public final String H;
    public final String I;
    public final gn J;
    public final gx1 K;
    public ks2 L;
    public boolean M;
    public final ex1 N;
    public final w O;
    public final ArrayList P;
    public final ib Q;
    public final db h;
    public int i = Integer.MIN_VALUE;
    public final ib j = new ib(this, 0);
    public final AccessibilityManager k;
    public long l;
    public List m;
    public final eb n;
    public int o;
    public int p;
    public r1 q;
    public r1 r;
    public boolean s;
    public final gx1 t;
    public final gx1 u;
    public final yy2 v;
    public final yy2 w;
    public int x;
    public Integer y;
    public final vo z;

    static {
        int[] iArr = {2131230727, 2131230728, 2131230739, 2131230750, 2131230753, 2131230754, 2131230755, 2131230756, 2131230757, 2131230758, 2131230729, 2131230730, 2131230731, 2131230732, 2131230733, 2131230734, 2131230735, 2131230736, 2131230737, 2131230738, 2131230740, 2131230741, 2131230742, 2131230743, 2131230744, 2131230745, 2131230746, 2131230747, 2131230748, 2131230749, 2131230751, 2131230752};
        fx1 fx1Var = e41.a;
        fx1 fx1Var2 = new fx1(32);
        int i = fx1Var2.b;
        if (i < 0) {
            fo.p("");
            return;
        }
        int i2 = i + 32;
        fx1Var2.b(i2);
        int[] iArr2 = fx1Var2.a;
        int i3 = fx1Var2.b;
        if (i != i3) {
            yo.k0(i2, i, i3, iArr2, iArr2);
        }
        yo.o0(i, 0, 12, iArr, iArr2);
        fx1Var2.b += 32;
        R = fx1Var2;
    }

    public jb(db dbVar) {
        this.h = dbVar;
        Object systemService = dbVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.k = (AccessibilityManager) systemService;
        this.l = 100L;
        new Handler(Looper.getMainLooper());
        this.n = new eb(this);
        this.o = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.t = new gx1();
        this.u = new gx1();
        this.v = new yy2(0);
        this.w = new yy2(0);
        this.x = -1;
        this.z = new vo(0);
        this.A = ChannelKt.Channel$default(1, null, null, 6, null);
        this.B = true;
        gx1 gx1Var = g41.a;
        gx1Var.getClass();
        this.D = gx1Var;
        this.E = new hx1();
        this.F = new ex1();
        this.G = new ex1();
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.J = new gn(20);
        this.K = new gx1();
        this.L = new ks2(dbVar.getSemanticsOwner().a(), gx1Var);
        int i = d41.a;
        this.N = new ex1();
        dbVar.addOnAttachStateChangeListener(this);
        this.O = new w(this, 2);
        this.P = new ArrayList();
        this.Q = new ib(this, 1);
    }

    public static Rect G(vd0 vd0Var, float f, float f2) {
        if (!(vd0Var instanceof a42) && !(vd0Var instanceof b42)) {
            return null;
        }
        pe2 pe2VarV = vd0Var.v();
        return new Rect((int) (pe2VarV.a + f), (int) (pe2VarV.b + f2), (int) (pe2VarV.c + f), (int) (pe2VarV.d + f2));
    }

    public static float[] I(vd0 vd0Var) {
        if (!(vd0Var instanceof b42)) {
            return null;
        }
        aj2 aj2Var = ((b42) vd0Var).i;
        long j = aj2Var.h;
        long j2 = aj2Var.g;
        long j3 = aj2Var.f;
        long j4 = aj2Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region J(vd0 vd0Var, float f, float f2) {
        if (vd0Var instanceof z32) {
            z32 z32Var = (z32) vd0Var;
            pe2 pe2VarI = z32Var.v().i(f, f2);
            Region region = new Region(new Rect((int) (pe2VarI.a + 0.0f), (int) (pe2VarI.b + 0.0f), (int) (pe2VarI.c + 0.0f), (int) (pe2VarI.d + 0.0f)));
            Region region2 = new Region();
            re reVar = z32Var.i;
            if (reVar instanceof re) {
                Path path = reVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            b81.s("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String o(js2 js2Var) {
        dj djVar;
        if (js2Var != null) {
            es2 es2Var = js2Var.d;
            zx1 zx1Var = es2Var.e;
            rs2 rs2Var = os2.a;
            if (zx1Var.c(rs2Var)) {
                return xg1.a((List) es2Var.c(rs2Var), ",", null, 62);
            }
            rs2 rs2Var2 = os2.G;
            if (zx1Var.c(rs2Var2)) {
                Object objG = zx1Var.g(rs2Var2);
                if (objG == null) {
                    objG = null;
                }
                dj djVar2 = (dj) objG;
                if (djVar2 != null) {
                    return djVar2.f;
                }
            } else {
                Object objG2 = zx1Var.g(os2.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (djVar = (dj) zy.o0(list)) != null) {
                    return djVar.f;
                }
            }
        }
        return null;
    }

    public static final boolean s(on2 on2Var, float f) {
        au0 au0Var = on2Var.a;
        if (f >= 0.0f || ((Number) au0Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) au0Var.invoke()).floatValue() < ((Number) on2Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean t(on2 on2Var) {
        au0 au0Var = on2Var.a;
        if (((Number) au0Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) au0Var.invoke()).floatValue();
        ((Number) on2Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean u(on2 on2Var) {
        au0 au0Var = on2Var.a;
        if (((Number) au0Var.invoke()).floatValue() < ((Number) on2Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) au0Var.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(jb jbVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        jbVar.y(i, i2, num, null);
    }

    public final void A(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventJ = j(v(i), 32);
        accessibilityEventJ.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i) {
        fb fbVar = this.C;
        if (fbVar != null) {
            js2 js2Var = fbVar.a;
            if (i != js2Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - fbVar.f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(js2Var.f), 131072);
                accessibilityEventJ.setFromIndex(fbVar.d);
                accessibilityEventJ.setToIndex(fbVar.e);
                accessibilityEventJ.setAction(fbVar.b);
                accessibilityEventJ.setMovementGranularity(fbVar.c);
                accessibilityEventJ.getText().add(o(js2Var));
                x(accessibilityEventJ);
            }
        }
        this.C = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0251  */
    /* JADX WARN: Code duplicated, block: B:102:0x025e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0287  */
    /* JADX WARN: Code duplicated, block: B:109:0x0298  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:138:0x0303 A[LOOP:4: B:133:0x02f2->B:138:0x0303, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0311  */
    /* JADX WARN: Code duplicated, block: B:146:0x0325 A[LOOP:5: B:141:0x030d->B:146:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x034b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0355  */
    /* JADX WARN: Code duplicated, block: B:163:0x037d  */
    /* JADX WARN: Code duplicated, block: B:167:0x039e  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:172:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:174:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:182:0x0428  */
    /* JADX WARN: Code duplicated, block: B:186:0x0437  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:236:0x0504  */
    /* JADX WARN: Code duplicated, block: B:239:0x0515 A[LOOP:6: B:235:0x0502->B:239:0x0515, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0522  */
    /* JADX WARN: Code duplicated, block: B:246:0x052f  */
    /* JADX WARN: Code duplicated, block: B:249:0x053c A[PHI: r0 r7 r8 r13 r14 r15 r28 r38 r41 r53
      0x053c: PHI (r0v18 jb) = (r0v10 jb), (r0v10 jb), (r0v10 jb), (r0v10 jb), (r0v19 jb) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r7v31 int) = (r7v14 int), (r7v14 int), (r7v14 int), (r7v14 int), (r7v32 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r8v41 java.lang.Integer) = 
      (r8v25 java.lang.Integer)
      (r8v25 java.lang.Integer)
      (r8v25 java.lang.Integer)
      (r8v25 java.lang.Integer)
      (r8v42 java.lang.Integer)
     binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r13v54 int) = (r13v42 int), (r13v42 int), (r13v42 int), (r13v42 int), (r13v55 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r14v41 zx1) = (r14v30 zx1), (r14v30 zx1), (r14v30 zx1), (r14v30 zx1), (r14v42 zx1) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r15v37 hb1) = (r15v36 hb1), (r15v36 hb1), (r15v36 hb1), (r15v36 hb1), (r15v38 hb1) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r28v3 int) = (r28v2 int), (r28v2 int), (r28v2 int), (r28v2 int), (r28v4 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r38v12 int) = (r38v7 int), (r38v9 int), (r38v10 int), (r38v7 int), (r38v13 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r41v6 js2) = (r41v4 js2), (r41v4 js2), (r41v4 js2), (r41v4 js2), (r41v7 js2) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x053c: PHI (r53v16 java.lang.Integer) = 
      (r53v12 java.lang.Integer)
      (r53v12 java.lang.Integer)
      (r53v12 java.lang.Integer)
      (r53v12 java.lang.Integer)
      (r53v17 java.lang.Integer)
     binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x053e  */
    /* JADX WARN: Code duplicated, block: B:275:0x060e  */
    /* JADX WARN: Code duplicated, block: B:297:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x030c A[EDGE_INSN: B:298:0x030c->B:140:0x030c BREAK  A[LOOP:4: B:133:0x02f2->B:138:0x0303], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x032a A[EDGE_INSN: B:299:0x032a->B:148:0x032a BREAK  A[LOOP:5: B:141:0x030d->B:146:0x0325], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0219  */
    /* JADX WARN: Code duplicated, block: B:89:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x023a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0242  */
    /* JADX WARN: Code duplicated, block: B:96:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x024c  */
    public final void C(f41 f41Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        es2 es2Var;
        js2 js2Var;
        int i8;
        int i9;
        int i10;
        int i11;
        zx1 zx1Var;
        hb1 hb1Var;
        int i12;
        es2 es2Var2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i13;
        hb1 hb1Var2;
        int i14;
        Integer num6;
        int i15;
        zn2 zn2Var;
        boolean z;
        rs2 rs2Var;
        int i16;
        rs2 rs2Var2;
        rs2 rs2Var3;
        String str;
        rs2 rs2Var4;
        int size;
        int i17;
        zn2 zn2Var2;
        Object objG;
        Object objG2;
        xu0 xu0Var;
        int i18;
        Object objG3;
        dj djVar;
        String str2;
        Object objG4;
        dj djVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceK;
        int length;
        int length2;
        int i19;
        Integer num7;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zC;
        boolean z2;
        boolean z3;
        AccessibilityEvent accessibilityEventK;
        Object objG6;
        vh2 vh2Var;
        Object objG7;
        AccessibilityEvent accessibilityEventJ;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i24;
        jb jbVar = this;
        f41 f41Var2 = f41Var;
        Integer num8 = 64;
        ArrayList arrayList4 = jbVar.P;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = f41Var2.b;
        long[] jArr3 = f41Var2.a;
        int i25 = 2;
        int length3 = jArr3.length - 2;
        int i26 = 0;
        Integer num9 = 0;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        ks2 ks2Var = (ks2) jbVar.K.b(i33);
                        if (ks2Var == null) {
                            i3 = i32;
                            num3 = num8;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num9;
                            i7 = i30;
                        } else {
                            es2 es2Var3 = ks2Var.a;
                            zx1 zx1Var2 = es2Var3.e;
                            ls2 ls2Var = (ls2) f41Var2.b(i33);
                            int i34 = i30;
                            js2 js2Var2 = ls2Var != null ? ls2Var.a : null;
                            if (js2Var2 == null) {
                                throw az2.e("no value for specified key");
                            }
                            hb1 hb1Var3 = js2Var2.c;
                            es2 es2Var4 = js2Var2.d;
                            iArr2 = iArr3;
                            int i35 = js2Var2.f;
                            jArr2 = jArr3;
                            zx1 zx1Var3 = es2Var4.e;
                            i6 = i27;
                            Object[] objArr = zx1Var3.b;
                            Object[] objArr2 = zx1Var3.c;
                            long[] jArr4 = zx1Var3.a;
                            i3 = i32;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                hb1 hb1Var4 = hb1Var3;
                                i4 = i31;
                                int i36 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i36];
                                    js2Var = js2Var2;
                                    int i37 = i36;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length4;
                                                Object obj2 = objArr2[i40];
                                                es2Var2 = es2Var3;
                                                rs2 rs2Var5 = (rs2) obj;
                                                j = j4;
                                                rs2 rs2Var6 = os2.v;
                                                if (o51.f(rs2Var5, rs2Var6) || o51.f(rs2Var5, os2.w)) {
                                                    int size2 = arrayList5.size();
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size2) {
                                                            zn2Var = null;
                                                            break;
                                                        }
                                                        int i43 = size2;
                                                        if (((zn2) arrayList5.get(i42)).e == i33) {
                                                            zn2Var = (zn2) arrayList5.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size2 = i43;
                                                        }
                                                    }
                                                    if (zn2Var != null) {
                                                        z = false;
                                                    } else {
                                                        zn2Var = new zn2(i33, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(zn2Var);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    rs2Var = os2.d;
                                                    if (o51.f(rs2Var5, rs2Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = zx1Var2.c(rs2Var);
                                                        i24 = i34;
                                                        if (zC2) {
                                                            jbVar.A(i33, i24, str3);
                                                        }
                                                    } else {
                                                        i16 = i34;
                                                        if (o51.f(rs2Var5, os2.b)) {
                                                            z(jbVar, jbVar.v(i33), 2048, num8, i16);
                                                            z(jbVar, jbVar.v(i33), 2048, num9, i16);
                                                        } else if (o51.f(rs2Var5, os2.K)) {
                                                            z(jbVar, jbVar.v(i33), 2048, 8192, 8);
                                                            z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                        } else if (o51.f(rs2Var5, os2.M)) {
                                                            z(jbVar, jbVar.v(i33), 2048, 3072, 8);
                                                        } else if (o51.f(rs2Var5, os2.c)) {
                                                            z(jbVar, jbVar.v(i33), 2048, num8, 8);
                                                            z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                        } else {
                                                            rs2Var2 = os2.J;
                                                            arrayList3 = arrayList5;
                                                            if (o51.f(rs2Var5, rs2Var2)) {
                                                                objG6 = zx1Var3.g(os2.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                vh2Var = (vh2) objG6;
                                                                if (vh2Var == null && vh2Var.a == 4) {
                                                                    objG7 = zx1Var3.g(rs2Var2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (o51.f(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventJ = jbVar.j(jbVar.v(i33), 4);
                                                                        js2 js2Var3 = js2Var;
                                                                        hb1Var2 = hb1Var4;
                                                                        js2 js2Var4 = new js2(js2Var3.a, true, hb1Var2, es2Var4);
                                                                        objG8 = js2Var4.k().e.g(os2.a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        js2Var = js2Var3;
                                                                        strA = list2 != null ? xg1.a(list2, ",", null, 62) : null;
                                                                        objG9 = js2Var4.k().e.g(os2.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        i13 = i38;
                                                                        if (list != null) {
                                                                            strA2 = xg1.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventJ.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventJ.getText().add(strA2);
                                                                        }
                                                                        jbVar.x(accessibilityEventJ);
                                                                    } else {
                                                                        i13 = i38;
                                                                        hb1Var2 = hb1Var4;
                                                                        z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    hb1Var2 = hb1Var4;
                                                                    z(jbVar, jbVar.v(i33), 2048, num8, 8);
                                                                    z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                                }
                                                            } else {
                                                                i13 = i38;
                                                                hb1Var2 = hb1Var4;
                                                                if (o51.f(rs2Var5, os2.a)) {
                                                                    int iV = jbVar.v(i33);
                                                                    obj2.getClass();
                                                                    jbVar.y(iV, 2048, 4, (List) obj2);
                                                                } else {
                                                                    rs2Var3 = os2.G;
                                                                    str = "";
                                                                    if (o51.f(rs2Var5, rs2Var3)) {
                                                                        if (zx1Var3.c(ds2.k)) {
                                                                            objG4 = zx1Var2.g(rs2Var3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            djVar2 = (dj) objG4;
                                                                            if (djVar2 == null) {
                                                                                djVar2 = "";
                                                                            }
                                                                            objG5 = zx1Var3.g(rs2Var3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (dj) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceK = K(charSequence);
                                                                            length = djVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i19 = length2;
                                                                            } else {
                                                                                i19 = length;
                                                                            }
                                                                            num7 = num9;
                                                                            i20 = 0;
                                                                            while (true) {
                                                                                num5 = num8;
                                                                                if (i20 < i19) {
                                                                                    i21 = length;
                                                                                    break;
                                                                                }
                                                                                i21 = length;
                                                                                if (djVar2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                length = i21;
                                                                                num8 = num5;
                                                                            }
                                                                            i22 = 0;
                                                                            while (true) {
                                                                                if (i22 < i19 - i20) {
                                                                                    i23 = i22;
                                                                                    break;
                                                                                }
                                                                                i23 = i22;
                                                                                if (djVar2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i21 - i23) - i20;
                                                                            int i45 = (length2 - i23) - i20;
                                                                            rs2 rs2Var7 = os2.L;
                                                                            boolean zC3 = zx1Var2.c(rs2Var7);
                                                                            boolean zC4 = zx1Var3.c(rs2Var7);
                                                                            zC = zx1Var2.c(os2.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (!z2 || z3) {
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                                accessibilityEventK = jbVar.k(jbVar.v(i33), num9, num7, Integer.valueOf(length2), charSequenceK);
                                                                            } else {
                                                                                accessibilityEventK = jbVar.j(jbVar.v(i33), 16);
                                                                                accessibilityEventK.setFromIndex(i20);
                                                                                accessibilityEventK.setRemovedCount(i44);
                                                                                accessibilityEventK.setAddedCount(i45);
                                                                                accessibilityEventK.setBeforeText(djVar2);
                                                                                accessibilityEventK.getText().add(charSequenceK);
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                            }
                                                                            accessibilityEventK.setClassName("android.widget.EditText");
                                                                            jbVar.x(accessibilityEventK);
                                                                            if (z2 || z3) {
                                                                                long j5 = ((f93) es2Var4.c(os2.H)).a;
                                                                                accessibilityEventK.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventK.setToIndex((int) (j5 & 4294967295L));
                                                                                jbVar.x(accessibilityEventK);
                                                                            }
                                                                        } else {
                                                                            i15 = i33;
                                                                            zx1Var2 = zx1Var2;
                                                                            num5 = num8;
                                                                            z(jbVar, jbVar.v(i15), 2048, Integer.valueOf(i28), 8);
                                                                        }
                                                                        num6 = num9;
                                                                        i14 = i41;
                                                                    } else {
                                                                        i15 = i33;
                                                                        zx1Var2 = zx1Var2;
                                                                        num5 = num8;
                                                                        i14 = i41;
                                                                        rs2Var4 = os2.H;
                                                                        if (o51.f(rs2Var5, rs2Var4)) {
                                                                            objG3 = zx1Var3.g(rs2Var3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            djVar = (dj) objG3;
                                                                            if (djVar != null && (str2 = djVar.f) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((f93) es2Var4.c(rs2Var4)).a;
                                                                            num6 = num9;
                                                                            jbVar = this;
                                                                            jbVar.x(jbVar.k(jbVar.v(i15), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), K(str)));
                                                                            jbVar.B(i35);
                                                                        } else {
                                                                            num6 = num9;
                                                                            if (!o51.f(rs2Var5, rs2Var6) || o51.f(rs2Var5, os2.w)) {
                                                                                jbVar.r(hb1Var2);
                                                                                size = arrayList4.size();
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 >= size) {
                                                                                        zn2Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((zn2) arrayList4.get(i17)).e == i15) {
                                                                                            zn2Var2 = (zn2) arrayList4.get(i17);
                                                                                            break;
                                                                                        }
                                                                                        i17++;
                                                                                    }
                                                                                }
                                                                                zn2Var2.getClass();
                                                                                objG = zx1Var3.g(rs2Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                zn2Var2.i = (on2) objG;
                                                                                objG2 = zx1Var3.g(os2.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                zn2Var2.j = (on2) objG2;
                                                                                if (zn2Var2.f.contains(zn2Var2)) {
                                                                                    jbVar.h.getSnapshotObserver().a.c(zn2Var2, jbVar.Q, new ta(1, zn2Var2, jbVar));
                                                                                }
                                                                            } else if (o51.f(rs2Var5, os2.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i18 = 8;
                                                                                    jbVar.x(jbVar.j(jbVar.v(i35), 8));
                                                                                } else {
                                                                                    i18 = 8;
                                                                                }
                                                                                z(jbVar, jbVar.v(i35), 2048, num6, i18);
                                                                            } else {
                                                                                rs2 rs2Var8 = ds2.x;
                                                                                if (o51.f(rs2Var5, rs2Var8)) {
                                                                                    List list3 = (List) es2Var4.c(rs2Var8);
                                                                                    Object objG10 = zx1Var2.g(rs2Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        ay1 ay1Var = in2.a;
                                                                                        ay1 ay1Var2 = new ay1();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            b81.u();
                                                                                            return;
                                                                                        }
                                                                                        ay1 ay1Var3 = new ay1();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            b81.u();
                                                                                            return;
                                                                                        }
                                                                                        i10 = !ay1Var2.equals(ay1Var3) ? 1 : 0;
                                                                                    } else if (!list3.isEmpty()) {
                                                                                        i10 = 1;
                                                                                    }
                                                                                } else if (obj2 instanceof z0) {
                                                                                    z0 z0Var = (z0) obj2;
                                                                                    Object objG11 = zx1Var2.g(rs2Var5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (z0Var != objG11) {
                                                                                        if (objG11 instanceof z0) {
                                                                                            String str4 = z0Var.a;
                                                                                            z0 z0Var2 = (z0) objG11;
                                                                                            xu0 xu0Var2 = z0Var2.b;
                                                                                            if (o51.f(str4, z0Var2.a) && (((xu0Var = z0Var.b) != null || xu0Var2 == null) && (xu0Var == null || xu0Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        i10 = 1;
                                                                                    }
                                                                                    i10 = 0;
                                                                                } else {
                                                                                    i10 = 1;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num9;
                                                            i15 = i33;
                                                            zx1Var2 = zx1Var2;
                                                            num5 = num8;
                                                            i14 = i41;
                                                        }
                                                    }
                                                    i15 = i33;
                                                    num5 = num8;
                                                    arrayList3 = arrayList5;
                                                    i13 = i38;
                                                    hb1Var2 = hb1Var4;
                                                    i14 = i41;
                                                    num6 = num9;
                                                    zx1Var2 = zx1Var2;
                                                } else {
                                                    Object objG12 = zx1Var2.g(rs2Var5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (o51.f(obj2, objG12)) {
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        hb1Var2 = hb1Var4;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        zx1Var2 = zx1Var2;
                                                    } else {
                                                        rs2Var = os2.d;
                                                        if (o51.f(rs2Var5, rs2Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = zx1Var2.c(rs2Var);
                                                            i24 = i34;
                                                            if (zC2) {
                                                                jbVar.A(i33, i24, str3);
                                                            }
                                                        } else {
                                                            i16 = i34;
                                                            if (o51.f(rs2Var5, os2.b)) {
                                                                z(jbVar, jbVar.v(i33), 2048, num8, i16);
                                                                z(jbVar, jbVar.v(i33), 2048, num9, i16);
                                                            } else if (o51.f(rs2Var5, os2.K)) {
                                                                z(jbVar, jbVar.v(i33), 2048, 8192, 8);
                                                                z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                            } else if (o51.f(rs2Var5, os2.M)) {
                                                                z(jbVar, jbVar.v(i33), 2048, 3072, 8);
                                                            } else if (o51.f(rs2Var5, os2.c)) {
                                                                z(jbVar, jbVar.v(i33), 2048, num8, 8);
                                                                z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                            } else {
                                                                rs2Var2 = os2.J;
                                                                arrayList3 = arrayList5;
                                                                if (o51.f(rs2Var5, rs2Var2)) {
                                                                    objG6 = zx1Var3.g(os2.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    vh2Var = (vh2) objG6;
                                                                    if (vh2Var == null) {
                                                                        i13 = i38;
                                                                        hb1Var2 = hb1Var4;
                                                                        z(jbVar, jbVar.v(i33), 2048, num8, 8);
                                                                        z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                                    } else {
                                                                        objG7 = zx1Var3.g(rs2Var2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (o51.f(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventJ = jbVar.j(jbVar.v(i33), 4);
                                                                            js2 js2Var5 = js2Var;
                                                                            hb1Var2 = hb1Var4;
                                                                            js2 js2Var6 = new js2(js2Var5.a, true, hb1Var2, es2Var4);
                                                                            objG8 = js2Var6.k().e.g(os2.a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            js2Var = js2Var5;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = js2Var6.k().e.g(os2.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            i13 = i38;
                                                                            if (list != null) {
                                                                                strA2 = xg1.a(list, ",", null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventJ.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventJ.getText().add(strA2);
                                                                            }
                                                                            jbVar.x(accessibilityEventJ);
                                                                        } else {
                                                                            i13 = i38;
                                                                            hb1Var2 = hb1Var4;
                                                                            z(jbVar, jbVar.v(i33), 2048, num9, 8);
                                                                        }
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    hb1Var2 = hb1Var4;
                                                                    if (o51.f(rs2Var5, os2.a)) {
                                                                        int iV2 = jbVar.v(i33);
                                                                        obj2.getClass();
                                                                        jbVar.y(iV2, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        rs2Var3 = os2.G;
                                                                        str = "";
                                                                        if (o51.f(rs2Var5, rs2Var3)) {
                                                                            if (zx1Var3.c(ds2.k)) {
                                                                                objG4 = zx1Var2.g(rs2Var3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                djVar2 = (dj) objG4;
                                                                                if (djVar2 == null) {
                                                                                    djVar2 = "";
                                                                                }
                                                                                objG5 = zx1Var3.g(rs2Var3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (dj) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceK = K(charSequence);
                                                                                length = djVar2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i19 = length2;
                                                                                } else {
                                                                                    i19 = length;
                                                                                }
                                                                                num7 = num9;
                                                                                i20 = 0;
                                                                                while (true) {
                                                                                    num5 = num8;
                                                                                    if (i20 < i19) {
                                                                                        i21 = length;
                                                                                        break;
                                                                                    }
                                                                                    i21 = length;
                                                                                    if (djVar2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i20++;
                                                                                        length = i21;
                                                                                        num8 = num5;
                                                                                    }
                                                                                }
                                                                                i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 < i19 - i20) {
                                                                                        i23 = i22;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i22;
                                                                                    if (djVar2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                                int i46 = (i21 - i23) - i20;
                                                                                int i47 = (length2 - i23) - i20;
                                                                                rs2 rs2Var9 = os2.L;
                                                                                boolean zC5 = zx1Var2.c(rs2Var9);
                                                                                boolean zC6 = zx1Var3.c(rs2Var9);
                                                                                zC = zx1Var2.c(os2.G);
                                                                                if (zC) {
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (z2) {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventK = jbVar.k(jbVar.v(i33), num9, num7, Integer.valueOf(length2), charSequenceK);
                                                                                } else {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventK = jbVar.k(jbVar.v(i33), num9, num7, Integer.valueOf(length2), charSequenceK);
                                                                                }
                                                                                accessibilityEventK.setClassName("android.widget.EditText");
                                                                                jbVar.x(accessibilityEventK);
                                                                                if (z2) {
                                                                                    long j7 = ((f93) es2Var4.c(os2.H)).a;
                                                                                    accessibilityEventK.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventK.setToIndex((int) (j7 & 4294967295L));
                                                                                    jbVar.x(accessibilityEventK);
                                                                                } else {
                                                                                    long j8 = ((f93) es2Var4.c(os2.H)).a;
                                                                                    accessibilityEventK.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventK.setToIndex((int) (j8 & 4294967295L));
                                                                                    jbVar.x(accessibilityEventK);
                                                                                }
                                                                            } else {
                                                                                i15 = i33;
                                                                                zx1Var2 = zx1Var2;
                                                                                num5 = num8;
                                                                                z(jbVar, jbVar.v(i15), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            num6 = num9;
                                                                            i14 = i41;
                                                                        } else {
                                                                            i15 = i33;
                                                                            zx1Var2 = zx1Var2;
                                                                            num5 = num8;
                                                                            i14 = i41;
                                                                            rs2Var4 = os2.H;
                                                                            if (o51.f(rs2Var5, rs2Var4)) {
                                                                                objG3 = zx1Var3.g(rs2Var3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                djVar = (dj) objG3;
                                                                                if (djVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((f93) es2Var4.c(rs2Var4)).a;
                                                                                num6 = num9;
                                                                                jbVar = this;
                                                                                jbVar.x(jbVar.k(jbVar.v(i15), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), K(str)));
                                                                                jbVar.B(i35);
                                                                            } else {
                                                                                num6 = num9;
                                                                                if (o51.f(rs2Var5, rs2Var6)) {
                                                                                    jbVar.r(hb1Var2);
                                                                                    size = arrayList4.size();
                                                                                    i17 = 0;
                                                                                    while (true) {
                                                                                        if (i17 >= size) {
                                                                                            zn2Var2 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((zn2) arrayList4.get(i17)).e == i15) {
                                                                                                zn2Var2 = (zn2) arrayList4.get(i17);
                                                                                                break;
                                                                                            }
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    zn2Var2.getClass();
                                                                                    objG = zx1Var3.g(rs2Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    zn2Var2.i = (on2) objG;
                                                                                    objG2 = zx1Var3.g(os2.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    zn2Var2.j = (on2) objG2;
                                                                                    if (zn2Var2.f.contains(zn2Var2)) {
                                                                                        jbVar.h.getSnapshotObserver().a.c(zn2Var2, jbVar.Q, new ta(1, zn2Var2, jbVar));
                                                                                    }
                                                                                } else {
                                                                                    jbVar.r(hb1Var2);
                                                                                    size = arrayList4.size();
                                                                                    i17 = 0;
                                                                                    while (true) {
                                                                                        if (i17 >= size) {
                                                                                            zn2Var2 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((zn2) arrayList4.get(i17)).e == i15) {
                                                                                                zn2Var2 = (zn2) arrayList4.get(i17);
                                                                                                break;
                                                                                            }
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    zn2Var2.getClass();
                                                                                    objG = zx1Var3.g(rs2Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    zn2Var2.i = (on2) objG;
                                                                                    objG2 = zx1Var3.g(os2.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    zn2Var2.j = (on2) objG2;
                                                                                    if (zn2Var2.f.contains(zn2Var2)) {
                                                                                        jbVar.h.getSnapshotObserver().a.c(zn2Var2, jbVar.Q, new ta(1, zn2Var2, jbVar));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num9;
                                                                i15 = i33;
                                                                zx1Var2 = zx1Var2;
                                                                num5 = num8;
                                                                i14 = i41;
                                                            }
                                                        }
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        hb1Var2 = hb1Var4;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        zx1Var2 = zx1Var2;
                                                    }
                                                }
                                            } else {
                                                es2Var2 = es2Var3;
                                                num5 = num8;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i13 = i38;
                                                i39 = i39;
                                                hb1Var2 = hb1Var4;
                                                i14 = length4;
                                                num6 = num9;
                                                i15 = i33;
                                                zx1Var2 = zx1Var2;
                                            }
                                            i34 = 8;
                                            i33 = i15;
                                            hb1Var4 = hb1Var2;
                                            es2Var3 = es2Var2;
                                            j4 = j >> 8;
                                            i39++;
                                            length4 = i14;
                                            num9 = num6;
                                            zx1Var2 = zx1Var2;
                                            i38 = i13;
                                            arrayList5 = arrayList3;
                                            num8 = num5;
                                        }
                                        i9 = i33;
                                        es2Var = es2Var3;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        hb1Var = hb1Var4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                        int i48 = i38;
                                        zx1Var = zx1Var2;
                                        if (i48 != i34) {
                                            break;
                                        }
                                    } else {
                                        i9 = i33;
                                        es2Var = es2Var3;
                                        zx1Var = zx1Var2;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        hb1Var = hb1Var4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                    }
                                    if (i37 == i12) {
                                        break;
                                    }
                                    num9 = num4;
                                    i33 = i9;
                                    zx1Var2 = zx1Var;
                                    hb1Var4 = hb1Var;
                                    js2Var2 = js2Var;
                                    es2Var3 = es2Var;
                                    arrayList5 = arrayList2;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    length4 = i12;
                                    num8 = num3;
                                }
                            } else {
                                es2Var = es2Var3;
                                num3 = num8;
                                arrayList2 = arrayList5;
                                i4 = i31;
                                js2Var = js2Var2;
                                i8 = 1;
                                num4 = num9;
                                i9 = i33;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = es2Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    }
                                    if (!js2Var.k().e.c((rs2) ((Map.Entry) it.next()).getKey())) {
                                        i11 = i8;
                                        break;
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                int iV3 = jbVar.v(i9);
                                i7 = 8;
                                z(jbVar, iV3, 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    } else {
                        i3 = i32;
                        num3 = num8;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i31;
                        i5 = i26;
                        i6 = i27;
                        num4 = num9;
                        i7 = i30;
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    f41Var2 = f41Var;
                    i26 = i5;
                    num9 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList5 = arrayList2;
                    num8 = num3;
                }
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i49 = i27;
                num2 = num9;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num9;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            f41Var2 = f41Var;
            length3 = i29;
            i26 = i;
            num9 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num8 = num;
        }
    }

    public final void D(hb1 hb1Var, hx1 hx1Var) {
        es2 es2VarW;
        if (hb1Var.G() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(hb1Var)) {
            hb1 hb1Var2 = null;
            if (!hb1Var.K.c(8)) {
                hb1Var = hb1Var.u();
                while (true) {
                    if (hb1Var == null) {
                        hb1Var = null;
                        break;
                    } else if (hb1Var.K.c(8)) {
                        break;
                    } else {
                        hb1Var = hb1Var.u();
                    }
                }
            }
            if (hb1Var == null || (es2VarW = hb1Var.w()) == null) {
                return;
            }
            if (!es2VarW.g) {
                for (hb1 hb1VarU = hb1Var.u(); hb1VarU != null; hb1VarU = hb1VarU.u()) {
                    es2 es2VarW2 = hb1VarU.w();
                    if (es2VarW2 != null && es2VarW2.g) {
                        hb1Var2 = hb1VarU;
                        break;
                    }
                }
                if (hb1Var2 != null) {
                    hb1Var = hb1Var2;
                }
            }
            int i = hb1Var.f;
            if (hx1Var.a(i)) {
                z(this, v(i), 2048, 1, 8);
            }
        }
    }

    public final void E(hb1 hb1Var) {
        if (hb1Var.G() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(hb1Var)) {
            int i = hb1Var.f;
            on2 on2Var = (on2) this.t.b(i);
            on2 on2Var2 = (on2) this.u.b(i);
            if (on2Var == null && on2Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i, 4096);
            if (on2Var != null) {
                accessibilityEventJ.setScrollX((int) ((Number) on2Var.a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) on2Var.b.invoke()).floatValue());
            }
            if (on2Var2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) on2Var2.a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) on2Var2.b.invoke()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(js2 js2Var, int i, int i2, boolean z) {
        String strO;
        es2 es2Var = js2Var.d;
        int i3 = js2Var.f;
        rs2 rs2Var = ds2.j;
        if (es2Var.e.c(rs2Var) && ym3.x(js2Var)) {
            qu0 qu0Var = (qu0) ((z0) js2Var.d.c(rs2Var)).b;
            if (qu0Var != null) {
                return ((Boolean) qu0Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.x) && (strO = o(js2Var)) != null) {
            if (i < 0 || i != i2 || i2 > strO.length()) {
                i = -1;
            }
            this.x = i;
            boolean z2 = strO.length() > 0;
            x(k(v(i3), z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(strO.length()) : null, strO));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        db dbVar = this.h;
        long jQ = dbVar.q(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jQ2 = dbVar.q((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ2 >> 32);
        int i3 = (int) (jQ & 4294967295L);
        int i4 = (int) (jQ2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        ks2 ks2Var;
        hx1 hx1Var = new hx1();
        hx1 hx1Var2 = this.E;
        int[] iArr = hx1Var2.b;
        long[] jArr3 = hx1Var2.a;
        int length = jArr3.length - 2;
        gx1 gx1Var = this.K;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            ls2 ls2Var = (ls2) n().b(i6);
                            Object obj = null;
                            js2 js2Var = ls2Var != null ? ls2Var.a : null;
                            if (js2Var != null) {
                                if (!js2Var.d.e.c(os2.d)) {
                                    hx1Var.a(i6);
                                    ks2Var = (ks2) gx1Var.b(i6);
                                    if (ks2Var != null) {
                                        Object objG = ks2Var.a.e.g(os2.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    A(i6, 32, obj);
                                }
                            } else {
                                hx1Var.a(i6);
                                ks2Var = (ks2) gx1Var.b(i6);
                                if (ks2Var != null) {
                                    Object objG2 = ks2Var.a.e.g(os2.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                A(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = hx1Var.b;
        long[] jArr4 = hx1Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & WorkQueueKt.MASK;
                            int i13 = hx1Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = hx1Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (hx1Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                hx1Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        gx1Var.c();
        f41 f41VarN = n();
        int[] iArr3 = f41VarN.b;
        Object[] objArr = f41VarN.c;
        long[] jArr6 = f41VarN.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            js2 js2Var2 = ((ls2) objArr[i25]).a;
                            es2 es2Var = js2Var2.d;
                            rs2 rs2Var = os2.d;
                            if (es2Var.e.c(rs2Var) && hx1Var2.a(i26)) {
                                A(i26, 16, (String) js2Var2.d.c(rs2Var));
                            }
                            gx1Var.h(i26, new ks2(js2Var2, n()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.L = new ks2(this.h.getSemanticsOwner().a(), n());
    }

    @Override // defpackage.c1
    public final t1 a(View view) {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, r1 r1Var, String str, Bundle bundle) {
        js2 js2Var;
        pe2 pe2Var;
        db dbVar;
        RectF rectF;
        pe2 pe2VarF;
        AccessibilityNodeInfo accessibilityNodeInfo = r1Var.a;
        ls2 ls2Var = (ls2) n().b(i);
        if (ls2Var == null || (js2Var = ls2Var.a) == null) {
            return;
        }
        hb1 hb1Var = js2Var.c;
        es2 es2Var = js2Var.d;
        zx1 zx1Var = es2Var.e;
        String strO = o(js2Var);
        if (o51.f(str, this.H)) {
            int iD = this.F.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (o51.f(str, this.I)) {
            int iD2 = this.G.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = zx1Var.c(ds2.a);
        db dbVar2 = this.h;
        xz1 xz1Var = null;
        if (zC && bundle != null && o51.f(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strO != null ? strO.length() : Integer.MAX_VALUE)) {
                    x83 x83VarX = ig0.x(es2Var);
                    if (x83VarX == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= x83VarX.a.a.f.length()) {
                            arrayList.add(xz1Var);
                            i2 = i2;
                            i3 = i3;
                            dbVar = dbVar2;
                        } else {
                            pe2 pe2VarB = x83VarX.b(i5);
                            xz1 xz1VarD = js2Var.d();
                            long jH0 = 0;
                            if (xz1VarD != null) {
                                if (!xz1VarD.t1().r) {
                                    xz1VarD = xz1Var;
                                }
                                if (xz1VarD != null) {
                                    jH0 = xz1VarD.h0(0L);
                                }
                            }
                            pe2 pe2VarJ = pe2VarB.j(jH0);
                            pe2 pe2VarG = js2Var.g();
                            if (pe2VarJ.h(pe2VarG)) {
                                pe2VarF = pe2VarJ.f(pe2VarG);
                            } else {
                                pe2Var = xz1Var;
                            }
                            if (pe2Var != 0) {
                                pe2Var = pe2VarF;
                                long jQ = dbVar2.q((((long) Float.floatToRawIntBits(pe2Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(pe2Var.a)) << 32));
                                dbVar = dbVar2;
                                long jQ2 = dbVar.q((((long) Float.floatToRawIntBits(pe2Var.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(pe2Var.c)) << 32));
                                int i6 = (int) (jQ >> 32);
                                int i7 = (int) (jQ2 >> 32);
                                int i8 = (int) (jQ & 4294967295L);
                                int i9 = (int) (jQ2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                pe2Var = pe2VarF;
                                dbVar = dbVar2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        i3 = i3;
                        dbVar2 = dbVar;
                        i2 = i2;
                        xz1Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        rs2 rs2Var = os2.A;
        if (zx1Var.c(rs2Var) && bundle != null && o51.f(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = zx1Var.g(rs2Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (o51.f(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, js2Var.f);
            return;
        }
        if (o51.f(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = zx1Var.g(os2.Q);
            au2 au2Var = (au2) (objG2 == null ? null : objG2);
            if (au2Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                pe2 pe2VarP = p(js2Var, rect, au2Var);
                float f = pe2VarP.b;
                float f2 = pe2VarP.a;
                vd0 vd0VarA = au2Var.a(pe2VarP.d(), hb1Var.E, dbVar2.getDensity());
                if (vd0VarA instanceof a42) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(vd0VarA, f2, f));
                    return;
                } else if (vd0VarA instanceof b42) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(vd0VarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I(vd0VarA));
                    return;
                } else if (!(vd0VarA instanceof z32)) {
                    b81.d();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", J(vd0VarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (o51.f(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = zx1Var.g(os2.Q);
            au2 au2Var2 = (au2) (objG3 == null ? null : objG3);
            if (au2Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                pe2 pe2VarP2 = p(js2Var, rect2, au2Var2);
                Rect rectG = G(au2Var2.a(pe2VarP2.d(), hb1Var.E, dbVar2.getDensity()), pe2VarP2.a, pe2VarP2.b);
                if (rectG != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
                    return;
                }
                return;
            }
            return;
        }
        if (o51.f(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = zx1Var.g(os2.Q);
            au2 au2Var3 = (au2) (objG4 == null ? null : objG4);
            if (au2Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrI = I(au2Var3.a(p(js2Var, rect3, au2Var3).d(), hb1Var.E, dbVar2.getDensity()));
                if (fArrI != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI);
                    return;
                }
                return;
            }
            return;
        }
        if (o51.f(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = zx1Var.g(os2.Q);
            au2 au2Var4 = (au2) (objG5 == null ? null : objG5);
            if (au2Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                pe2 pe2VarP3 = p(js2Var, rect4, au2Var4);
                Region regionJ = J(au2Var4.a(pe2VarP3.d(), hb1Var.E, dbVar2.getDensity()), pe2VarP3.a, pe2VarP3.b);
                if (regionJ != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionJ);
                }
            }
        }
    }

    public final Rect f(ls2 ls2Var) {
        l41 l41Var = ls2Var.b;
        return H(l41Var.a, l41Var.b, l41Var.c, l41Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[Catch: all -> 0x0037, LOOP:0: B:33:0x007e->B:34:0x0080, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x0080, B:35:0x008f, B:37:0x0097, B:20:0x0046, B:23:0x004d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f2 -> B:51:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.r60 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.g(r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean h(int i, long j, boolean z) {
        rs2 rs2Var;
        int i2;
        if (o51.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            f41 f41VarN = n();
            if (!c12.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    rs2Var = os2.w;
                } else {
                    if (z) {
                        b81.d();
                        return false;
                    }
                    rs2Var = os2.v;
                }
                Object[] objArr = f41VarN.c;
                long[] jArr = f41VarN.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    ls2 ls2Var = (ls2) objArr[(i3 << 3) + i6];
                                    l41 l41Var = ls2Var.b;
                                    float f = l41Var.a;
                                    i2 = i4;
                                    float f2 = l41Var.b;
                                    float f3 = l41Var.c;
                                    float f4 = l41Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = ls2Var.a.d.e.g(rs2Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        on2 on2Var = (on2) objG;
                                        if (on2Var != null) {
                                            au0 au0Var = on2Var.a;
                                            if (i < 0) {
                                                if (((Number) au0Var.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) au0Var.invoke()).floatValue() < ((Number) on2Var.b.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.h.getSemanticsOwner().a(), this.L);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        ls2 ls2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        db dbVar = this.h;
        accessibilityEventObtain.setPackageName(dbVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(dbVar, i);
        if (q() && (ls2Var = (ls2) n().b(i)) != null) {
            js2 js2Var = ls2Var.a;
            accessibilityEventObtain.setPassword(js2Var.d.e.c(os2.L));
            Object objG = js2Var.d.e.g(os2.o);
            if (objG == null) {
                objG = null;
            }
            boolean zF = o51.f(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                d1.j(accessibilityEventObtain, zF);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int l(js2 js2Var) {
        es2 es2Var = js2Var.d;
        if (!es2Var.e.c(os2.a)) {
            rs2 rs2Var = os2.H;
            if (es2Var.e.c(rs2Var)) {
                return (int) (((f93) es2Var.c(rs2Var)).a & 4294967295L);
            }
        }
        return this.x;
    }

    public final int m(js2 js2Var) {
        es2 es2Var = js2Var.d;
        if (!es2Var.e.c(os2.a)) {
            rs2 rs2Var = os2.H;
            if (es2Var.e.c(rs2Var)) {
                return (int) (((f93) es2Var.c(rs2Var)).a >> 32);
            }
        }
        return this.x;
    }

    public final f41 n() {
        if (this.B) {
            this.B = false;
            db dbVar = this.h;
            this.D = am1.r(dbVar.getSemanticsOwner(), wa.h);
            if (q()) {
                gx1 gx1Var = this.D;
                Resources resources = dbVar.getContext().getResources();
                ex1 ex1Var = this.F;
                ex1Var.a();
                ex1 ex1Var2 = this.G;
                ex1Var2.a();
                ls2 ls2Var = (ls2) gx1Var.b(-1);
                js2 js2Var = ls2Var != null ? ls2Var.a : null;
                js2Var.getClass();
                ArrayList arrayListB = ts2.b(js2Var, new q9(gx1Var, 3), new q9(resources, 4), am1.F(js2Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((js2) arrayListB.get(i - 1)).f;
                        int i3 = ((js2) arrayListB.get(i)).f;
                        ex1Var.f(i2, i3);
                        ex1Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.D;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            this.m = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.h.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.O);
        AccessibilityManager accessibilityManager = this.k;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    public final pe2 p(js2 js2Var, Rect rect, au2 au2Var) {
        hb hbVar = new hb(au2Var);
        hb1 hb1Var = js2Var.c;
        cv1 cv1Var = hb1Var.K.f;
        kb0 kb0Var = null;
        if ((cv1Var.h & 8) != 0) {
            loop0: while (cv1Var != null) {
                if ((cv1Var.g & 8) == 0) {
                    if ((cv1Var.h & 8) != 0) {
                        break;
                        break;
                    }
                    cv1Var = cv1Var.j;
                } else {
                    cv1 cv1VarJ = cv1Var;
                    gy1 gy1Var = null;
                    while (cv1VarJ != null) {
                        if (cv1VarJ instanceof hs2) {
                            ((hs2) cv1VarJ).J0(hbVar);
                            if (hbVar.e) {
                                kb0Var = cv1VarJ;
                                break loop0;
                            }
                        } else if ((cv1VarJ.g & 8) != 0 && (cv1VarJ instanceof lb0)) {
                            int i = 0;
                            for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                if ((cv1Var2.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        cv1VarJ = xp1.J(gy1Var);
                    }
                    if ((cv1Var.h & 8) != 0) {
                        break;
                    }
                    cv1Var = cv1Var.j;
                }
            }
        }
        kb0 kb0Var2 = (hs2) kb0Var;
        if (kb0Var2 == null || !((cv1) kb0Var2).e.r) {
            return wc0.x(hb1Var.K.d, false);
        }
        xz1 xz1VarN = xp1.N(kb0Var2);
        pe2 pe2VarD0 = wc0.F(xz1VarN).d0(xz1VarN, false);
        Rect rectH = H(pe2VarD0.a, pe2VarD0.b, pe2VarD0.c, pe2VarD0.d);
        float f = rectH.left - rect.left;
        float f2 = rectH.top - rect.top;
        return new pe2(f, f2, rectH.width() + f, rectH.height() + f2);
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.k;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.m;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.m = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void r(hb1 hb1Var) {
        if (this.z.add(hb1Var)) {
            this.A.mo32trySendJP2dKIU(mf3.a);
        }
    }

    public final int v(int i) {
        if (i == this.h.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void w(js2 js2Var, ks2 ks2Var) {
        int[] iArr = o41.a;
        hx1 hx1Var = new hx1();
        List listJ = js2.j(4, js2Var);
        hb1 hb1Var = js2Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            js2 js2Var2 = (js2) listJ.get(i);
            f41 f41VarN = n();
            int i2 = js2Var2.f;
            if (f41VarN.a(i2)) {
                if (!ks2Var.b.b(i2)) {
                    r(hb1Var);
                    return;
                }
                hx1Var.a(i2);
            }
        }
        hx1 hx1Var2 = ks2Var.b;
        int[] iArr2 = hx1Var2.b;
        long[] jArr = hx1Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !hx1Var.b(iArr2[(i3 << 3) + i5])) {
                            r(hb1Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = js2.j(4, js2Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            js2 js2Var3 = (js2) listJ2.get(i6);
            ks2 ks2Var2 = (ks2) this.K.b(js2Var3.f);
            if (ks2Var2 != null && n().a(js2Var3.f)) {
                w(js2Var3, ks2Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.s = true;
        }
        try {
            return ((Boolean) this.j.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.s = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i, i2);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(xg1.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
