package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.ArchivePage;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import com.vincenthzr.locationspoofer.data.cloud.ContributionStatus;
import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import com.vincenthzr.locationspoofer.data.cloud.RewardDevice;
import com.vincenthzr.locationspoofer.data.cloud.RewardEntry;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xq1 {
    public static x01 I;
    public static x01 J;
    public static final p10 a = new p10(new r10(4), false, -513339229);
    public static final p10 b = new p10(new z10(0), false, 636288403);
    public static final p10 c = new p10(new z10(1), false, -1357803046);
    public static final p10 d = new p10(new b20(1), false, -1420737179);
    public static final p10 e = new p10(new a20(14), false, 1038658168);
    public static final p10 f = new p10(new a20(16), false, -1735670642);
    public static final p10 g = new p10(new a20(17), false, -1635099527);
    public static final p10 h = new p10(new b20(2), false, 848706016);
    public static final p10 i = new p10(new b20(3), false, 19057023);
    public static final p10 j = new p10(new b20(4), false, 1627097647);
    public static final p10 k = new p10(new b20(5), false, 201574168);
    public static final p10 l = new p10(new a20(18), false, 1006453421);
    public static final p10 m = new p10(new a20(20), false, 99931539);
    public static final p10 n = new p10(new a20(19), false, -251471328);
    public static final p10 o = new p10(new a20(21), false, -1241284206);
    public static final p10 p = new p10(new a20(22), false, -257235730);
    public static final p10 q = new p10(new a20(23), false, -2669467);
    public static final p10 r = new p10(new a20(24), false, 759075483);
    public static final p10 s = new p10(new a20(25), false, -1206911271);
    public static final p10 t = new p10(new b20(6), false, 1272230132);
    public static final p10 u = new p10(new b20(7), false, 289236755);
    public static final p10 v = new p10(new a20(26), false, -2100161949);
    public static final p10 w = new p10(new a20(13), false, 1792141694);
    public static final p10 x = new p10(new a20(15), false, -708887683);
    public static final p10 y = new p10(new c20(28), false, 448290619);
    public static final p10 z = new p10(new b20(21), false, 295249600);
    public static final int[] A = new int[0];
    public static final long[] B = new long[0];
    public static final Object[] C = new Object[0];
    public static final d11 D = new d11(false);
    public static final kf E = new kf(3);
    public static final bt2[] F = new bt2[0];
    public static final long[] G = new long[0];
    public static final nn0 H = new nn0();

    public static final Set A(bt2 bt2Var) {
        bt2Var.getClass();
        if (bt2Var instanceof yu) {
            return ((yu) bt2Var).f();
        }
        HashSet hashSet = new HashSet(bt2Var.d());
        int iD = bt2Var.d();
        for (int i2 = 0; i2 < iD; i2++) {
            hashSet.add(bt2Var.e(i2));
        }
        return hashSet;
    }

    public static final bt2[] B(List list) {
        bt2[] bt2VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (bt2VarArr = (bt2[]) list.toArray(new bt2[0])) == null) ? F : bt2VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object C(u30 u30Var, cd2 cd2Var) {
        if (!((cv1) u30Var).e.r) {
            p21.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        l72 l72Var = (l72) xp1.O(u30Var).G;
        l72Var.getClass();
        return ji2.P(l72Var, cd2Var);
    }

    public static final boolean D(long j2, long j3) {
        return j2 == j3;
    }

    public static z60 E(double d2, double d3) {
        if (M(d2, d3)) {
            return new z60(d2, d3);
        }
        double d4 = d2;
        double d5 = d3;
        for (int i2 = 0; i2 < 3; i2++) {
            z60 z60VarS = S(d4, d5);
            d4 -= z60VarS.a - d2;
            d5 -= z60VarS.b - d3;
        }
        return new z60(d4, d5);
    }

    public static final x01 F() {
        x01 x01Var = I;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.BookmarkAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(21.0f, 6.0f);
        nx0VarI.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        nx0VarI.i(-1.0f);
        nx0VarI.s(1.0f);
        nx0VarI.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        nx0VarI.o(-1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.r(7.0f);
        nx0VarI.i(-1.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.o(0.45f, -1.0f, 1.0f, -1.0f);
        nx0VarI.i(1.0f);
        nx0VarI.r(4.0f);
        nx0VarI.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        nx0VarI.o(1.0f, 0.45f, 1.0f, 1.0f);
        nx0VarI.s(1.0f);
        nx0VarI.i(1.0f);
        nx0VarI.f(20.55f, 5.0f, 21.0f, 5.45f, 21.0f, 6.0f);
        nx0VarI.e();
        nx0VarI.m(19.0f, 19.48f);
        nx0VarI.g(0.0f, 0.72f, -0.73f, 1.2f, -1.39f, 0.92f);
        nx0VarI.k(12.0f, 18.0f);
        nx0VarI.l(-5.61f, 2.4f);
        nx0VarI.f(5.73f, 20.69f, 5.0f, 20.2f, 5.0f, 19.48f);
        nx0VarI.r(5.0f);
        nx0VarI.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        nx0VarI.l(7.0f, 0.0f);
        nx0VarI.g(-0.63f, 0.84f, -1.0f, 1.87f, -1.0f, 3.0f);
        nx0VarI.g(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        nx0VarI.g(0.34f, 0.0f, 0.68f, -0.03f, 1.0f, -0.1f);
        nx0VarI.r(19.48f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        I = x01VarB;
        return x01VarB;
    }

    public static final x01 G() {
        x01 x01Var = J;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 2.0f);
        nx0VarI.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        nx0VarI.o(4.48f, 10.0f, 10.0f, 10.0f);
        nx0VarI.o(10.0f, -4.48f, 10.0f, -10.0f);
        nx0VarI.n(17.52f, 2.0f, 12.0f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(9.29f, 16.29f);
        nx0VarI.k(5.7f, 12.7f);
        nx0VarI.g(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        nx0VarI.g(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nx0VarI.k(10.0f, 14.17f);
        nx0VarI.l(6.88f, -6.88f);
        nx0VarI.g(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nx0VarI.g(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        nx0VarI.l(-7.59f, 7.59f);
        nx0VarI.g(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        J = x01VarB;
        return x01VarB;
    }

    public static final Paint H(je jeVar) {
        if (jeVar == null) {
            o21.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + xe2.a(jeVar.getClass()).b());
        }
        return (Paint) jeVar.c;
    }

    public static final nv I(CameraPosition cameraPosition) {
        cameraPosition.getClass();
        return new nv(cameraPosition.target, cameraPosition.bearing, cameraPosition.centerAltitude, cameraPosition.tilt, cameraPosition.roll, cameraPosition.fov, cameraPosition.zoom, cameraPosition.padding);
    }

    public static final nv J(LatLng latLng) {
        latLng.getClass();
        return new nv(latLng, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, null);
    }

    public static final dv1 K(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new g12(lu0Var));
    }

    public static void L(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static boolean M(double d2, double d3) {
        return (-12.0d <= d2 && d2 <= 7.0d && 92.0d <= d3 && d3 <= 142.0d) || d3 < 72.004d || d3 > 137.8347d || d2 < 0.8293d || d2 > 55.8271d;
    }

    public static final View N(kb0 kb0Var) {
        if (!((cv1) kb0Var).e.r) {
            p21.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) kb1.a(xp1.O(kb0Var));
    }

    public static final bj3 O(hb1 hb1Var) {
        bj3 bj3Var = hb1Var.t;
        if (bj3Var != null) {
            return bj3Var;
        }
        throw az2.e("Required value was null.");
    }

    public static int P(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        fo.i("Cannot round NaN value.");
        return 0;
    }

    public static long Q(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        fo.i("Cannot round NaN value.");
        return 0L;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.yx R(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static z60 S(double d2, double d3) {
        if (M(d2, d3)) {
            return new z60(d2, d3);
        }
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double d6 = d4 * 2.0d;
        double d7 = d5 * 0.2d * d5;
        double d8 = d4 * 0.1d;
        double d9 = d8 * d5;
        double dSqrt = Math.sqrt(Math.abs(d4)) * 0.2d;
        double d10 = 6.0d * d4 * 3.141592653589793d;
        double d11 = d6 * 3.141592653589793d;
        double dSin = ((((Math.sin(d11) * 20.0d) + (Math.sin(d10) * 20.0d)) * 2.0d) / 3.0d) + dSqrt + d9 + d7 + (d5 * 3.0d) + (-100.0d) + d6;
        double d12 = d5 * 3.141592653589793d;
        double dSin2 = ((((Math.sin(d12 / 30.0d) * 320.0d) + (Math.sin((d5 / 12.0d) * 3.141592653589793d) * 160.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d5 / 3.0d) * 3.141592653589793d) * 40.0d) + (Math.sin(d12) * 20.0d)) * 2.0d) / 3.0d) + dSin;
        double d13 = d8 * d4;
        double dSin3 = ((((Math.sin((d4 / 30.0d) * 3.141592653589793d) * 300.0d) + (Math.sin((d4 / 12.0d) * 3.141592653589793d) * 150.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d4 / 3.0d) * 3.141592653589793d) * 40.0d) + (Math.sin(d4 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d11) * 20.0d) + (Math.sin(d10) * 20.0d)) * 2.0d) / 3.0d) + (Math.sqrt(Math.abs(d4)) * 0.1d) + d13 + (d5 * 2.0d) + d4 + 300.0d + d9;
        double d14 = (d2 / 180.0d) * 3.141592653589793d;
        double dSin4 = Math.sin(d14);
        double d15 = 1.0d - ((0.00669342162296594d * dSin4) * dSin4);
        double dSqrt2 = Math.sqrt(d15);
        return new z60(((dSin2 * 180.0d) / ((6335552.717000426d / (d15 * dSqrt2)) * 3.141592653589793d)) + d2, ((dSin3 * 180.0d) / ((Math.cos(d14) * (6378245.0d / dSqrt2)) * 3.141592653589793d)) + d3);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x015d  */
    /* JADX WARN: Code duplicated, block: B:114:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0177  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    public static final void a(au0 au0Var, p10 p10Var, dv1 dv1Var, pu0 pu0Var, pu0 pu0Var2, pu0 pu0Var3, au2 au2Var, long j2, long j3, long j4, long j5, qc0 qc0Var, f30 f30Var, int i2, int i3) {
        int i4;
        p10 p10Var2;
        dv1 dv1Var2;
        int i5;
        long jD;
        int i6;
        long jD2;
        int i7;
        int i8;
        boolean z2;
        ov0 ov0Var;
        au2 au2Var2;
        qc0 qc0Var2;
        long j6;
        long j7;
        dv1 dv1Var3;
        long j8;
        long j9;
        ee2 ee2VarT;
        dv1 dv1Var4;
        int i9;
        long jD3;
        int i10;
        long j10;
        dv1 dv1Var5;
        long j11;
        au2 au2Var3;
        long j12;
        long j13;
        qc0 qc0Var3;
        int i11;
        int i12;
        int i13;
        int i14;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(94478519);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var2.h(au0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            p10Var2 = p10Var;
            i4 |= ov0Var2.h(p10Var2) ? 32 : 16;
        } else {
            p10Var2 = p10Var;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i2 & 384) == 0) {
                dv1Var2 = dv1Var;
                i4 |= ov0Var2.f(dv1Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
            }
            if ((i2 & 3072) != 0) {
                if (ov0Var2.h(pu0Var)) {
                    i14 = 2048;
                } else {
                    i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i14;
            }
            i5 = i4 | 24576;
            if ((196608 & i2) != 0) {
                if (ov0Var2.h(pu0Var2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            if ((1572864 & i2) != 0) {
                if (ov0Var2.h(pu0Var3)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i5 |= i12;
            }
            if ((12582912 & i2) == 0) {
                i5 |= 4194304;
            }
            if ((100663296 & i2) != 0) {
                if ((i3 & 256) == 0 || !ov0Var2.e(j2)) {
                    i11 = 33554432;
                } else {
                    i11 = 67108864;
                }
                i5 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                i5 |= 268435456;
            }
            jD = j4;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !ov0Var2.e(jD)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            jD2 = j5;
            if ((i3 & 2048) == 0 || !ov0Var2.e(jD2)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i8 = i6 | i7 | 3456;
            if ((306783379 & i5) == 306783378 || (i8 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var2.T(i5 & 1, z2)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0 || ov0Var2.B()) {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    au2 au2VarA = hu2.a(sb.N, ov0Var2);
                    i9 = i5 & (-29360129);
                    if ((i3 & 256) != 0) {
                        jD3 = mz.d(sb.M, ov0Var2);
                        i9 = i5 & (-264241153);
                    } else {
                        jD3 = j2;
                    }
                    long jD4 = mz.d(sb.S, ov0Var2);
                    i10 = i9 & (-1879048193);
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        jD = mz.d(sb.O, ov0Var2);
                        i8 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        jD2 = mz.d(sb.Q, ov0Var2);
                        i8 &= -113;
                    }
                    j10 = jD2;
                    dv1Var5 = dv1Var4;
                    j11 = jD;
                    au2Var3 = au2VarA;
                    j12 = jD3;
                    j13 = jD4;
                    qc0Var3 = new qc0(7);
                } else {
                    ov0Var2.W();
                    int i16 = i5 & (-29360129);
                    if ((i3 & 256) != 0) {
                        i16 = i5 & (-264241153);
                    }
                    i10 = i16 & (-1879048193);
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i8 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        i8 &= -113;
                    }
                    au2Var3 = au2Var;
                    qc0Var3 = qc0Var;
                    j10 = jD2;
                    j11 = jD;
                    dv1Var5 = dv1Var2;
                    j12 = j2;
                    j13 = j3;
                }
                ov0Var2.q();
                ov0Var = ov0Var2;
                i9.c(au0Var, p10Var2, dv1Var5, pu0Var, pu0Var2, pu0Var3, au2Var3, j12, j13, j11, j10, qc0Var3, ov0Var, i10 & 2147483646, i8 & 8190);
                dv1Var3 = dv1Var5;
                au2Var2 = au2Var3;
                j8 = j12;
                j9 = j13;
                j7 = j11;
                j6 = j10;
                qc0Var2 = qc0Var3;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                au2Var2 = au2Var;
                qc0Var2 = qc0Var;
                j6 = jD2;
                j7 = jD;
                dv1Var3 = dv1Var2;
                j8 = j2;
                j9 = j3;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new z8(au0Var, p10Var, dv1Var3, pu0Var, pu0Var2, pu0Var3, au2Var2, j8, j9, j7, j6, qc0Var2, i2, i3, 1);
            }
        }
        i4 |= 384;
        dv1Var2 = dv1Var;
        if ((i2 & 3072) != 0) {
            if (ov0Var2.h(pu0Var)) {
                i14 = 2048;
            } else {
                i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 |= i14;
        }
        i5 = i4 | 24576;
        if ((196608 & i2) != 0) {
            if (ov0Var2.h(pu0Var2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i5 |= i13;
        }
        if ((1572864 & i2) != 0) {
            if (ov0Var2.h(pu0Var3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((12582912 & i2) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i2) != 0) {
            if ((i3 & 256) == 0) {
                i11 = 33554432;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= 268435456;
        }
        jD = j4;
        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            i6 = 2;
        } else {
            i6 = 2;
        }
        jD2 = j5;
        if ((i3 & 2048) == 0) {
            i7 = 16;
        } else {
            i7 = 16;
        }
        i8 = i6 | i7 | 3456;
        if ((306783379 & i5) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (ov0Var2.T(i5 & 1, z2)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                au2 au2VarA2 = hu2.a(sb.N, ov0Var2);
                i9 = i5 & (-29360129);
                if ((i3 & 256) != 0) {
                    jD3 = mz.d(sb.M, ov0Var2);
                    i9 = i5 & (-264241153);
                } else {
                    jD3 = j2;
                }
                long jD5 = mz.d(sb.S, ov0Var2);
                i10 = i9 & (-1879048193);
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    jD = mz.d(sb.O, ov0Var2);
                    i8 &= -15;
                }
                if ((i3 & 2048) != 0) {
                    jD2 = mz.d(sb.Q, ov0Var2);
                    i8 &= -113;
                }
                j10 = jD2;
                dv1Var5 = dv1Var4;
                j11 = jD;
                au2Var3 = au2VarA2;
                j12 = jD3;
                j13 = jD5;
                qc0Var3 = new qc0(7);
            } else {
                if (i15 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                au2 au2VarA3 = hu2.a(sb.N, ov0Var2);
                i9 = i5 & (-29360129);
                if ((i3 & 256) != 0) {
                    jD3 = mz.d(sb.M, ov0Var2);
                    i9 = i5 & (-264241153);
                } else {
                    jD3 = j2;
                }
                long jD6 = mz.d(sb.S, ov0Var2);
                i10 = i9 & (-1879048193);
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    jD = mz.d(sb.O, ov0Var2);
                    i8 &= -15;
                }
                if ((i3 & 2048) != 0) {
                    jD2 = mz.d(sb.Q, ov0Var2);
                    i8 &= -113;
                }
                j10 = jD2;
                dv1Var5 = dv1Var4;
                j11 = jD;
                au2Var3 = au2VarA3;
                j12 = jD3;
                j13 = jD6;
                qc0Var3 = new qc0(7);
            }
            ov0Var2.q();
            ov0Var = ov0Var2;
            i9.c(au0Var, p10Var2, dv1Var5, pu0Var, pu0Var2, pu0Var3, au2Var3, j12, j13, j11, j10, qc0Var3, ov0Var, i10 & 2147483646, i8 & 8190);
            dv1Var3 = dv1Var5;
            au2Var2 = au2Var3;
            j8 = j12;
            j9 = j13;
            j7 = j11;
            j6 = j10;
            qc0Var2 = qc0Var3;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            au2Var2 = au2Var;
            qc0Var2 = qc0Var;
            j6 = jD2;
            j7 = jD;
            dv1Var3 = dv1Var2;
            j8 = j2;
            j9 = j3;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new z8(au0Var, p10Var, dv1Var3, pu0Var, pu0Var2, pu0Var3, au2Var2, j8, j9, j7, j6, qc0Var2, i2, i3, 1);
        }
    }

    public static final void b(lu0 lu0Var, dv1 dv1Var, lu0 lu0Var2, f30 f30Var, int i2) {
        int i3;
        df1 df1Var;
        int i4;
        wa waVar = wa.s;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-180024211);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(lu0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= ov0Var.h(waVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i5 |= ov0Var.h(lu0Var2) ? 16384 : 8192;
        }
        if (ov0Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(ov0Var.T);
            dv1 dv1VarH = xp1.H(ov0Var, dv1Var.d(gp0.a).d(cq0.a).d(eq0.a).d(aq0.a));
            xb0 xb0Var = (xb0) ov0Var.j(z30.h);
            qa1 qa1Var = (qa1) ov0Var.j(z30.n);
            l72 l72VarL = ov0Var.l();
            df1 df1Var2 = (df1) ov0Var.j(kh1.a);
            tm2 tm2Var = (tm2) ov0Var.j(oh1.a);
            ov0Var.c0(1314774735);
            int i6 = i5 & 14;
            int iHashCode2 = Long.hashCode(ov0Var.T);
            Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            mv0 mv0VarY = ks.Y(ov0Var);
            tl2 tl2Var = (tl2) ov0Var.j(vl2.a);
            View view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
            boolean zH = ov0Var.h(context) | ((((i6 & 14) ^ 6) > 4 && ov0Var.f(lu0Var)) || (i6 & 6) == 4) | ov0Var.h(mv0VarY) | ov0Var.h(tl2Var) | ov0Var.d(iHashCode2) | ov0Var.h(view);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                df1Var = df1Var2;
                i4 = iHashCode;
                ih ihVar = new ih(context, lu0Var, mv0VarY, tl2Var, iHashCode2, view);
                ov0Var.m0(ihVar);
                objQ = ihVar;
            } else {
                i4 = iHashCode;
                df1Var = df1Var2;
            }
            au0 au0Var = (au0) objQ;
            ov0Var.X(125, 1, null, null);
            ov0Var.r = true;
            if (ov0Var.S) {
                ov0Var.k(au0Var);
            } else {
                ov0Var.p0();
            }
            w20.b.getClass();
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, gh.i, dv1VarH);
            q73.h(ov0Var, gh.j, xb0Var);
            q73.h(ov0Var, gh.k, df1Var);
            q73.h(ov0Var, gh.l, tm2Var);
            q73.h(ov0Var, gh.m, qa1Var);
            q73.h(ov0Var, v20.f, Integer.valueOf(i4));
            q73.h(ov0Var, gh.g, lu0Var2);
            q73.h(ov0Var, gh.h, waVar);
            ov0Var.p(true);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new hh(lu0Var, dv1Var, lu0Var2, i2, 0);
        }
    }

    public static final void c(lu0 lu0Var, dv1 dv1Var, lu0 lu0Var2, f30 f30Var, int i2, int i3) {
        int i4;
        wa waVar = wa.s;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var.h(lu0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= ov0Var.h(lu0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                lu0Var2 = waVar;
            }
            b(lu0Var, dv1Var, lu0Var2, ov0Var, (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 6) & 57344));
        } else {
            ov0Var.W();
        }
        lu0 lu0Var3 = lu0Var2;
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new jc(lu0Var, dv1Var, lu0Var3, i2, i3, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    public static final void d(CloudAccountState cloudAccountState, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        String id;
        Context context;
        ey1 ey1Var;
        final CoroutineScope coroutineScope;
        final ey1 ey1Var2;
        ey1 ey1Var3;
        final ey1 ey1Var4;
        boolean z3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-917286459);
        int i3 = i2 | (ov0Var.h(cloudAccountState) ? 4 : 2) | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ov0Var.d0(414512006);
            kn2 kn2VarA = v91.a(ov0Var);
            ov0Var.d0(1274527078);
            ov0Var.p(false);
            ov0Var.d0(511388516);
            boolean zF = ov0Var.f(null) | ov0Var.f(kn2VarA);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = kn2VarA.a(xe2.a(AccountBenefitsRepository.class), null);
                ov0Var.m0(objQ);
            }
            ov0Var.p(false);
            ov0Var.p(false);
            final AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) objQ;
            ov0Var.d0(414512006);
            kn2 kn2VarA2 = v91.a(ov0Var);
            ov0Var.d0(1274527078);
            ov0Var.p(false);
            ov0Var.d0(511388516);
            boolean zF2 = ov0Var.f(null) | ov0Var.f(kn2VarA2);
            Object objQ2 = ov0Var.Q();
            if (zF2 || objQ2 == c30Var) {
                objQ2 = kn2VarA2.a(xe2.a(AccountSyncManager.class), null);
                ov0Var.m0(objQ2);
            }
            ov0Var.p(false);
            ov0Var.p(false);
            final AccountSyncManager accountSyncManager = (AccountSyncManager) objQ2;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = oi0.j(ov0Var);
                ov0Var.m0(objQ3);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objQ3;
            CloudAccount account = cloudAccountState.getAccount();
            if (account == null) {
                id = null;
            } else {
                if (!cloudAccountState.getValidated() || account.isGuest()) {
                    account = null;
                }
                if (account != null) {
                    id = account.getId();
                } else {
                    id = null;
                }
            }
            Object objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                objQ4 = ke0.H("history");
                ov0Var.m0(objQ4);
            }
            ey1 ey1Var5 = (ey1) objQ4;
            Object objQ5 = ov0Var.Q();
            if (objQ5 == c30Var) {
                objQ5 = ke0.H(null);
                ov0Var.m0(objQ5);
            }
            ey1 ey1Var6 = (ey1) objQ5;
            Object objQ6 = ov0Var.Q();
            if (objQ6 == c30Var) {
                objQ6 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ6);
            }
            final ey1 ey1Var7 = (ey1) objQ6;
            Object objQ7 = ov0Var.Q();
            if (objQ7 == c30Var) {
                objQ7 = ke0.H(null);
                ov0Var.m0(objQ7);
            }
            final ey1 ey1Var8 = (ey1) objQ7;
            Object objQ8 = ov0Var.Q();
            if (objQ8 == c30Var) {
                objQ8 = ke0.H(vj0.e);
                ov0Var.m0(objQ8);
            }
            ey1 ey1Var9 = (ey1) objQ8;
            Object objQ9 = ov0Var.Q();
            zj0 zj0Var = zj0.e;
            if (objQ9 == c30Var) {
                objQ9 = ke0.H(zj0Var);
                ov0Var.m0(objQ9);
            }
            final ey1 ey1Var10 = (ey1) objQ9;
            Object objQ10 = ov0Var.Q();
            if (objQ10 == c30Var) {
                objQ10 = ke0.H(zj0Var);
                ov0Var.m0(objQ10);
            }
            ey1 ey1Var11 = (ey1) objQ10;
            Object objQ11 = ov0Var.Q();
            if (objQ11 == c30Var) {
                objQ11 = ke0.H(UUID.randomUUID().toString());
                ov0Var.m0(objQ11);
            }
            final ey1 ey1Var12 = (ey1) objQ11;
            Object objQ12 = ov0Var.Q();
            if (objQ12 == c30Var) {
                objQ12 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ12);
            }
            final ey1 ey1Var13 = (ey1) objQ12;
            Context context2 = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            Object objQ13 = ov0Var.Q();
            if (objQ13 == c30Var) {
                objQ13 = ke0.H(null);
                ov0Var.m0(objQ13);
            }
            final ey1 ey1Var14 = (ey1) objQ13;
            v7 v7Var = new v7("application/json");
            boolean zF3 = ov0Var.f(id) | ov0Var.h(accountBenefitsRepository) | ov0Var.h(coroutineScope2) | ov0Var.h(context2);
            Object objQ14 = ov0Var.Q();
            if (zF3 || objQ14 == c30Var) {
                x2 x2Var = new x2(id, accountBenefitsRepository, coroutineScope2, ey1Var14, context2, ey1Var8);
                context = context2;
                ov0Var.m0(x2Var);
                objQ14 = x2Var;
            } else {
                context = context2;
            }
            final no1 no1VarB0 = sb.b0(v7Var, (lu0) objQ14, ov0Var);
            String str = (String) ey1Var5.getValue();
            boolean zF4 = ov0Var.f(id) | ov0Var.h(coroutineScope2) | ov0Var.h(accountBenefitsRepository);
            Object objQ15 = ov0Var.Q();
            if (zF4 || objQ15 == c30Var) {
                ey1Var = ey1Var9;
                k3 k3Var = new k3(id, ey1Var6, ey1Var, ey1Var11, accountBenefitsRepository, ey1Var5, coroutineScope2, ey1Var7, ey1Var8, null);
                coroutineScope = coroutineScope2;
                ey1Var2 = ey1Var6;
                ey1Var3 = ey1Var5;
                ey1Var4 = ey1Var11;
                ov0Var.m0(k3Var);
                objQ15 = k3Var;
            } else {
                coroutineScope = coroutineScope2;
                ey1Var3 = ey1Var5;
                ey1Var4 = ey1Var11;
                ey1Var2 = ey1Var6;
                ey1Var = ey1Var9;
            }
            oi0.f(id, str, (pu0) objQ15, ov0Var);
            final String strW = w((String) ey1Var8.getValue(), ov0Var);
            final String str2 = id;
            final ey1 ey1Var15 = ey1Var;
            final ey1 ey1Var16 = ey1Var3;
            final long jD = z2 ? xp1.d(4280428334L) : hz.c;
            h(ke0.N(2131624123, ov0Var), z2, au0Var, sb.a0(-1200553341, new qu0() { // from class: c3
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
                        jo joVar = new jo(12.0f, true, new fo(0));
                        final String str3 = str2;
                        boolean zF5 = ov0Var2.f(str3);
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        boolean zH = zF5 | ov0Var2.h(coroutineScope3);
                        final AccountBenefitsRepository accountBenefitsRepository2 = accountBenefitsRepository;
                        boolean zH2 = zH | ov0Var2.h(accountBenefitsRepository2);
                        final String str4 = strW;
                        boolean zF6 = zH2 | ov0Var2.f(str4);
                        final long j2 = jD;
                        boolean zE = zF6 | ov0Var2.e(j2);
                        Object objQ16 = ov0Var2.Q();
                        if (zE || objQ16 == d30.a) {
                            final ey1 ey1Var17 = ey1Var16;
                            final ey1 ey1Var18 = ey1Var7;
                            final ey1 ey1Var19 = ey1Var2;
                            final ey1 ey1Var20 = ey1Var4;
                            final ey1 ey1Var21 = ey1Var8;
                            final ey1 ey1Var22 = ey1Var15;
                            final ey1 ey1Var23 = ey1Var10;
                            final ey1 ey1Var24 = ey1Var12;
                            lu0 lu0Var = new lu0() { // from class: m2
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj4) {
                                    List<CloudArchive> items;
                                    kd1 kd1Var = (kd1) obj4;
                                    kd1Var.getClass();
                                    kd1Var.a(null, null, ks.c);
                                    final String str5 = str3;
                                    if (str5 == null) {
                                        kd1Var.a(null, null, ks.d);
                                    } else {
                                        final int i4 = 0;
                                        final ey1 ey1Var25 = ey1Var17;
                                        final ey1 ey1Var26 = ey1Var18;
                                        final ey1 ey1Var27 = ey1Var19;
                                        final ey1 ey1Var28 = ey1Var20;
                                        final ey1 ey1Var29 = ey1Var21;
                                        final AccountBenefitsRepository accountBenefitsRepository3 = accountBenefitsRepository2;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        kd1Var.a(null, null, new p10(new qu0() { // from class: v2
                                            /* JADX WARN: Code duplicated, block: B:28:0x00f5  */
                                            /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
                                            @Override // defpackage.qu0
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                final ey1 ey1Var30;
                                                Object obj8;
                                                ey1 ey1Var31;
                                                ey1 ey1Var32;
                                                AccountBenefitsRepository accountBenefitsRepository4;
                                                String str6;
                                                CoroutineScope coroutineScope5;
                                                boolean z4;
                                                final ey1 ey1Var33;
                                                final ey1 ey1Var34;
                                                boolean z5;
                                                int i5 = i4;
                                                mf3 mf3Var = mf3.a;
                                                av1 av1Var = av1.a;
                                                c30 c30Var2 = d30.a;
                                                switch (i5) {
                                                    case 0:
                                                        f30 f30Var3 = (f30) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        ((bc1) obj5).getClass();
                                                        ov0 ov0Var3 = (ov0) f30Var3;
                                                        if (!ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            ov0Var3.W();
                                                        } else {
                                                            kk2 kk2VarA = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var3, 6);
                                                            int iHashCode = Long.hashCode(ov0Var3.T);
                                                            l72 l72VarL = ov0Var3.l();
                                                            dv1 dv1VarH = xp1.H(ov0Var3, av1Var);
                                                            w20.b.getClass();
                                                            x30 x30Var = v20.b;
                                                            ov0Var3.g0();
                                                            if (ov0Var3.S) {
                                                                ov0Var3.k(x30Var);
                                                            } else {
                                                                ov0Var3.p0();
                                                            }
                                                            q73.h(ov0Var3, v20.e, kk2VarA);
                                                            q73.h(ov0Var3, v20.d, l72VarL);
                                                            q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                                                            q73.g(ov0Var3, v20.g);
                                                            q73.h(ov0Var3, v20.c, dv1VarH);
                                                            Object objQ17 = ov0Var3.Q();
                                                            final ey1 ey1Var35 = ey1Var25;
                                                            if (objQ17 == c30Var2) {
                                                                objQ17 = new s2(ey1Var35, 1);
                                                                ov0Var3.m0(objQ17);
                                                            }
                                                            au0 au0Var2 = (au0) objQ17;
                                                            ey1 ey1Var36 = ey1Var26;
                                                            n51.a(au0Var2, null, !xq1.e(ey1Var36), null, xq1.z(ov0Var3), null, null, null, ks.e, ov0Var3, 805306374, 490);
                                                            Object objQ18 = ov0Var3.Q();
                                                            if (objQ18 == c30Var2) {
                                                                objQ18 = new s2(ey1Var35, 2);
                                                                ov0Var3.m0(objQ18);
                                                            }
                                                            n51.a((au0) objQ18, null, !((Boolean) ey1Var36.getValue()).booleanValue(), null, xq1.z(ov0Var3), null, null, null, ks.f, ov0Var3, 805306374, 490);
                                                            final String str7 = str5;
                                                            boolean zF7 = ov0Var3.f(str7);
                                                            final CoroutineScope coroutineScope6 = coroutineScope4;
                                                            boolean zH3 = zF7 | ov0Var3.h(coroutineScope6);
                                                            final AccountBenefitsRepository accountBenefitsRepository5 = accountBenefitsRepository3;
                                                            boolean zH4 = zH3 | ov0Var3.h(accountBenefitsRepository5);
                                                            Object objQ19 = ov0Var3.Q();
                                                            if (zH4 || objQ19 == c30Var2) {
                                                                final int i6 = 0;
                                                                final ey1 ey1Var37 = ey1Var27;
                                                                final ey1 ey1Var38 = ey1Var28;
                                                                final ey1 ey1Var39 = ey1Var29;
                                                                ey1Var30 = ey1Var36;
                                                                objQ19 = new au0() { // from class: e3
                                                                    @Override // defpackage.au0
                                                                    public final Object invoke() {
                                                                        int i7 = i6;
                                                                        mf3 mf3Var2 = mf3.a;
                                                                        switch (i7) {
                                                                            case 0:
                                                                                ey1 ey1Var40 = ey1Var37;
                                                                                ArchivePage archivePage = (ArchivePage) ey1Var40.getValue();
                                                                                int page = archivePage != null ? archivePage.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository6 = accountBenefitsRepository5;
                                                                                xq1.f(str7, coroutineScope6, ey1Var30, ey1Var39, accountBenefitsRepository6, new y3(accountBenefitsRepository6, page, ey1Var35, ey1Var40, ey1Var38, null));
                                                                                break;
                                                                            case 1:
                                                                                ey1 ey1Var41 = ey1Var37;
                                                                                ArchivePage archivePage2 = (ArchivePage) ey1Var41.getValue();
                                                                                int page2 = archivePage2 != null ? archivePage2.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository7 = accountBenefitsRepository5;
                                                                                xq1.f(str7, coroutineScope6, ey1Var30, ey1Var39, accountBenefitsRepository7, new y3(accountBenefitsRepository7, page2 - 1, ey1Var35, ey1Var41, ey1Var38, null));
                                                                                break;
                                                                            default:
                                                                                ey1 ey1Var42 = ey1Var37;
                                                                                ArchivePage archivePage3 = (ArchivePage) ey1Var42.getValue();
                                                                                int page3 = archivePage3 != null ? archivePage3.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository8 = accountBenefitsRepository5;
                                                                                xq1.f(str7, coroutineScope6, ey1Var30, ey1Var39, accountBenefitsRepository8, new y3(accountBenefitsRepository8, page3 + 1, ey1Var35, ey1Var42, ey1Var38, null));
                                                                                break;
                                                                        }
                                                                        return mf3Var2;
                                                                    }
                                                                };
                                                                ov0Var3.m0(objQ19);
                                                            } else {
                                                                ey1Var30 = ey1Var36;
                                                            }
                                                            boolean z6 = !((Boolean) ey1Var30.getValue()).booleanValue();
                                                            b52 b52Var2 = hu.a;
                                                            n51.j((au0) objQ19, null, z6, null, hu.f(bk.g, ov0Var3), null, ks.g, ov0Var3, 805306368, 490);
                                                            ov0Var3.p(true);
                                                        }
                                                        break;
                                                    default:
                                                        f30 f30Var4 = (f30) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ((bc1) obj5).getClass();
                                                        ov0 ov0Var4 = (ov0) f30Var4;
                                                        if (!ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            ov0Var4.W();
                                                        } else {
                                                            kk2 kk2VarA2 = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var4, 6);
                                                            int iHashCode2 = Long.hashCode(ov0Var4.T);
                                                            l72 l72VarL2 = ov0Var4.l();
                                                            dv1 dv1VarH2 = xp1.H(ov0Var4, av1Var);
                                                            w20.b.getClass();
                                                            x30 x30Var2 = v20.b;
                                                            ov0Var4.g0();
                                                            if (ov0Var4.S) {
                                                                ov0Var4.k(x30Var2);
                                                            } else {
                                                                ov0Var4.p0();
                                                            }
                                                            q73.h(ov0Var4, v20.e, kk2VarA2);
                                                            q73.h(ov0Var4, v20.d, l72VarL2);
                                                            q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode2));
                                                            q73.g(ov0Var4, v20.g);
                                                            q73.h(ov0Var4, v20.c, dv1VarH2);
                                                            final String str8 = str5;
                                                            boolean zF8 = ov0Var4.f(str8);
                                                            final CoroutineScope coroutineScope7 = coroutineScope4;
                                                            boolean zH5 = zF8 | ov0Var4.h(coroutineScope7);
                                                            final AccountBenefitsRepository accountBenefitsRepository6 = accountBenefitsRepository3;
                                                            boolean zH6 = zH5 | ov0Var4.h(accountBenefitsRepository6);
                                                            Object objQ20 = ov0Var4.Q();
                                                            final ey1 ey1Var40 = ey1Var25;
                                                            final ey1 ey1Var41 = ey1Var26;
                                                            final ey1 ey1Var42 = ey1Var27;
                                                            final ey1 ey1Var43 = ey1Var28;
                                                            final ey1 ey1Var44 = ey1Var29;
                                                            if (zH6 || objQ20 == c30Var2) {
                                                                final int i7 = 1;
                                                                obj8 = new au0() { // from class: e3
                                                                    @Override // defpackage.au0
                                                                    public final Object invoke() {
                                                                        int i8 = i7;
                                                                        mf3 mf3Var2 = mf3.a;
                                                                        switch (i8) {
                                                                            case 0:
                                                                                ey1 ey1Var45 = ey1Var40;
                                                                                ArchivePage archivePage = (ArchivePage) ey1Var45.getValue();
                                                                                int page = archivePage != null ? archivePage.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository7 = accountBenefitsRepository6;
                                                                                xq1.f(str8, coroutineScope7, ey1Var43, ey1Var44, accountBenefitsRepository7, new y3(accountBenefitsRepository7, page, ey1Var41, ey1Var45, ey1Var42, null));
                                                                                break;
                                                                            case 1:
                                                                                ey1 ey1Var46 = ey1Var40;
                                                                                ArchivePage archivePage2 = (ArchivePage) ey1Var46.getValue();
                                                                                int page2 = archivePage2 != null ? archivePage2.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository8 = accountBenefitsRepository6;
                                                                                xq1.f(str8, coroutineScope7, ey1Var43, ey1Var44, accountBenefitsRepository8, new y3(accountBenefitsRepository8, page2 - 1, ey1Var41, ey1Var46, ey1Var42, null));
                                                                                break;
                                                                            default:
                                                                                ey1 ey1Var47 = ey1Var40;
                                                                                ArchivePage archivePage3 = (ArchivePage) ey1Var47.getValue();
                                                                                int page3 = archivePage3 != null ? archivePage3.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository9 = accountBenefitsRepository6;
                                                                                xq1.f(str8, coroutineScope7, ey1Var43, ey1Var44, accountBenefitsRepository9, new y3(accountBenefitsRepository9, page3 + 1, ey1Var41, ey1Var47, ey1Var42, null));
                                                                                break;
                                                                        }
                                                                        return mf3Var2;
                                                                    }
                                                                };
                                                                ey1Var31 = ey1Var43;
                                                                ey1Var32 = ey1Var44;
                                                                accountBenefitsRepository4 = accountBenefitsRepository6;
                                                                str6 = str8;
                                                                coroutineScope5 = coroutineScope7;
                                                                ov0Var4.m0(obj8);
                                                            } else {
                                                                ey1Var32 = ey1Var44;
                                                                str6 = str8;
                                                                coroutineScope5 = coroutineScope7;
                                                                accountBenefitsRepository4 = accountBenefitsRepository6;
                                                                ey1Var31 = ey1Var43;
                                                                obj8 = objQ20;
                                                            }
                                                            au0 au0Var3 = (au0) obj8;
                                                            if (xq1.e(ey1Var31)) {
                                                                z4 = false;
                                                            } else {
                                                                ArchivePage archivePage = (ArchivePage) ey1Var40.getValue();
                                                                if ((archivePage != null ? archivePage.getPage() : 1) > 1) {
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                            }
                                                            n51.j(au0Var3, null, z4, null, null, null, ks.l, ov0Var4, 805306368, 506);
                                                            ArchivePage archivePage2 = (ArchivePage) ey1Var40.getValue();
                                                            s83.b(String.valueOf(archivePage2 != null ? archivePage2.getPage() : 1), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262142);
                                                            boolean zF9 = ov0Var4.f(str6) | ov0Var4.h(coroutineScope5) | ov0Var4.h(accountBenefitsRepository4);
                                                            Object objQ21 = ov0Var4.Q();
                                                            if (zF9 || objQ21 == c30Var2) {
                                                                final int i8 = 2;
                                                                final String str9 = str6;
                                                                final CoroutineScope coroutineScope8 = coroutineScope5;
                                                                final AccountBenefitsRepository accountBenefitsRepository7 = accountBenefitsRepository4;
                                                                ey1Var33 = ey1Var40;
                                                                ey1Var34 = ey1Var31;
                                                                final ey1 ey1Var45 = ey1Var32;
                                                                au0 au0Var4 = new au0() { // from class: e3
                                                                    @Override // defpackage.au0
                                                                    public final Object invoke() {
                                                                        int i9 = i8;
                                                                        mf3 mf3Var2 = mf3.a;
                                                                        switch (i9) {
                                                                            case 0:
                                                                                ey1 ey1Var46 = ey1Var33;
                                                                                ArchivePage archivePage3 = (ArchivePage) ey1Var46.getValue();
                                                                                int page = archivePage3 != null ? archivePage3.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository8 = accountBenefitsRepository7;
                                                                                xq1.f(str9, coroutineScope8, ey1Var34, ey1Var45, accountBenefitsRepository8, new y3(accountBenefitsRepository8, page, ey1Var41, ey1Var46, ey1Var42, null));
                                                                                break;
                                                                            case 1:
                                                                                ey1 ey1Var47 = ey1Var33;
                                                                                ArchivePage archivePage4 = (ArchivePage) ey1Var47.getValue();
                                                                                int page2 = archivePage4 != null ? archivePage4.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository9 = accountBenefitsRepository7;
                                                                                xq1.f(str9, coroutineScope8, ey1Var34, ey1Var45, accountBenefitsRepository9, new y3(accountBenefitsRepository9, page2 - 1, ey1Var41, ey1Var47, ey1Var42, null));
                                                                                break;
                                                                            default:
                                                                                ey1 ey1Var48 = ey1Var33;
                                                                                ArchivePage archivePage5 = (ArchivePage) ey1Var48.getValue();
                                                                                int page3 = archivePage5 != null ? archivePage5.getPage() : 1;
                                                                                AccountBenefitsRepository accountBenefitsRepository10 = accountBenefitsRepository7;
                                                                                xq1.f(str9, coroutineScope8, ey1Var34, ey1Var45, accountBenefitsRepository10, new y3(accountBenefitsRepository10, page3 + 1, ey1Var41, ey1Var48, ey1Var42, null));
                                                                                break;
                                                                        }
                                                                        return mf3Var2;
                                                                    }
                                                                };
                                                                ov0Var4.m0(au0Var4);
                                                                objQ21 = au0Var4;
                                                            } else {
                                                                ey1Var33 = ey1Var40;
                                                                ey1Var34 = ey1Var31;
                                                            }
                                                            au0 au0Var5 = (au0) objQ21;
                                                            if (((Boolean) ey1Var34.getValue()).booleanValue()) {
                                                                z5 = false;
                                                            } else {
                                                                ArchivePage archivePage3 = (ArchivePage) ey1Var33.getValue();
                                                                int page = (archivePage3 != null ? archivePage3.getPage() : 1) * 30;
                                                                ArchivePage archivePage4 = (ArchivePage) ey1Var33.getValue();
                                                                if (page < (archivePage4 != null ? archivePage4.getTotal() : 0)) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                            }
                                                            n51.j(au0Var5, null, z5, null, null, null, ks.m, ov0Var4, 805306368, 506);
                                                            ov0Var4.p(true);
                                                        }
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        }, true, 1387304426));
                                        if (xq1.e(ey1Var26)) {
                                            kd1Var.a(null, null, ks.h);
                                        }
                                        String str6 = str4;
                                        if (str6 != null) {
                                            kd1Var.a(null, null, new p10(new w2(str6, 0), true, -609536246));
                                        }
                                        ArchivePage archivePage = (ArchivePage) ey1Var27.getValue();
                                        if (archivePage != null && (items = archivePage.getItems()) != null && items.isEmpty()) {
                                            kd1Var.a(null, null, ks.i);
                                        }
                                        ArchivePage archivePage2 = (ArchivePage) ey1Var27.getValue();
                                        List<CloudArchive> items2 = archivePage2 != null ? archivePage2.getItems() : null;
                                        if (items2 == null) {
                                            items2 = uj0.e;
                                        }
                                        v1 v1Var = new v1(2);
                                        int size = items2.size();
                                        l3 l3Var = new l3(2, v1Var, items2);
                                        u3 u3Var = new u3(items2, 0);
                                        long j3 = j2;
                                        final ey1 ey1Var30 = ey1Var22;
                                        final ey1 ey1Var31 = ey1Var23;
                                        final ey1 ey1Var32 = ey1Var24;
                                        v3 v3Var = new v3(items2, j3, str5, coroutineScope4, accountBenefitsRepository3, ey1Var25, ey1Var28, ey1Var26, ey1Var30, ey1Var31, ey1Var32, ey1Var29);
                                        final ey1 ey1Var33 = ey1Var26;
                                        final String str7 = str5;
                                        final CoroutineScope coroutineScope5 = coroutineScope4;
                                        final AccountBenefitsRepository accountBenefitsRepository4 = accountBenefitsRepository3;
                                        final ey1 ey1Var34 = ey1Var29;
                                        kd1Var.c(size, l3Var, u3Var, new p10(v3Var, true, 802480018));
                                        if (o51.f((String) ey1Var25.getValue(), "trash") && !((Set) ey1Var28.getValue()).isEmpty()) {
                                            qu0 qu0Var = new qu0() { // from class: y2
                                                @Override // defpackage.qu0
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    ey1 ey1Var35;
                                                    f30 f30Var3 = (f30) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((bc1) obj5).getClass();
                                                    ov0 ov0Var3 = (ov0) f30Var3;
                                                    if (ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        String str8 = str7;
                                                        boolean zF7 = ov0Var3.f(str8);
                                                        CoroutineScope coroutineScope6 = coroutineScope5;
                                                        boolean zH3 = zF7 | ov0Var3.h(coroutineScope6);
                                                        AccountBenefitsRepository accountBenefitsRepository5 = accountBenefitsRepository4;
                                                        boolean zH4 = zH3 | ov0Var3.h(accountBenefitsRepository5);
                                                        Object objQ17 = ov0Var3.Q();
                                                        ey1 ey1Var36 = ey1Var33;
                                                        if (zH4 || objQ17 == d30.a) {
                                                            ey1Var35 = ey1Var36;
                                                            objQ17 = new n2(ey1Var28, ey1Var25, ey1Var30, ey1Var31, ey1Var32, ey1Var35, ey1Var34, accountBenefitsRepository5, str8, coroutineScope6);
                                                            ov0Var3.m0(objQ17);
                                                        } else {
                                                            ey1Var35 = ey1Var36;
                                                        }
                                                        n51.a((au0) objQ17, null, !xq1.e(ey1Var35), null, xq1.z(ov0Var3), null, null, null, ks.k, ov0Var3, 805306368, 490);
                                                    } else {
                                                        ov0Var3.W();
                                                    }
                                                    return mf3.a;
                                                }
                                            };
                                            ey1Var33 = ey1Var33;
                                            ey1Var34 = ey1Var34;
                                            accountBenefitsRepository4 = accountBenefitsRepository4;
                                            str7 = str7;
                                            coroutineScope5 = coroutineScope5;
                                            kd1Var.a(null, null, new p10(qu0Var, true, -1054883913));
                                        }
                                        ArchivePage archivePage3 = (ArchivePage) ey1Var27.getValue();
                                        if ((archivePage3 != null ? archivePage3.getTotal() : 0) > 30) {
                                            final int i5 = 1;
                                            final ey1 ey1Var35 = ey1Var33;
                                            kd1Var.a(null, null, new p10(new qu0() { // from class: v2
                                                /* JADX WARN: Code duplicated, block: B:28:0x00f5  */
                                                /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
                                                @Override // defpackage.qu0
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    final ey1 ey1Var36;
                                                    Object obj8;
                                                    ey1 ey1Var37;
                                                    ey1 ey1Var38;
                                                    AccountBenefitsRepository accountBenefitsRepository5;
                                                    String str8;
                                                    CoroutineScope coroutineScope6;
                                                    boolean z4;
                                                    final ey1 ey1Var39;
                                                    final ey1 ey1Var310;
                                                    boolean z5;
                                                    int i6 = i5;
                                                    mf3 mf3Var = mf3.a;
                                                    av1 av1Var = av1.a;
                                                    c30 c30Var2 = d30.a;
                                                    switch (i6) {
                                                        case 0:
                                                            f30 f30Var3 = (f30) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((bc1) obj5).getClass();
                                                            ov0 ov0Var3 = (ov0) f30Var3;
                                                            if (!ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                ov0Var3.W();
                                                            } else {
                                                                kk2 kk2VarA = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var3, 6);
                                                                int iHashCode = Long.hashCode(ov0Var3.T);
                                                                l72 l72VarL = ov0Var3.l();
                                                                dv1 dv1VarH = xp1.H(ov0Var3, av1Var);
                                                                w20.b.getClass();
                                                                x30 x30Var = v20.b;
                                                                ov0Var3.g0();
                                                                if (ov0Var3.S) {
                                                                    ov0Var3.k(x30Var);
                                                                } else {
                                                                    ov0Var3.p0();
                                                                }
                                                                q73.h(ov0Var3, v20.e, kk2VarA);
                                                                q73.h(ov0Var3, v20.d, l72VarL);
                                                                q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                                                                q73.g(ov0Var3, v20.g);
                                                                q73.h(ov0Var3, v20.c, dv1VarH);
                                                                Object objQ17 = ov0Var3.Q();
                                                                final ey1 ey1Var311 = ey1Var27;
                                                                if (objQ17 == c30Var2) {
                                                                    objQ17 = new s2(ey1Var311, 1);
                                                                    ov0Var3.m0(objQ17);
                                                                }
                                                                au0 au0Var2 = (au0) objQ17;
                                                                ey1 ey1Var312 = ey1Var25;
                                                                n51.a(au0Var2, null, !xq1.e(ey1Var312), null, xq1.z(ov0Var3), null, null, null, ks.e, ov0Var3, 805306374, 490);
                                                                Object objQ18 = ov0Var3.Q();
                                                                if (objQ18 == c30Var2) {
                                                                    objQ18 = new s2(ey1Var311, 2);
                                                                    ov0Var3.m0(objQ18);
                                                                }
                                                                n51.a((au0) objQ18, null, !((Boolean) ey1Var312.getValue()).booleanValue(), null, xq1.z(ov0Var3), null, null, null, ks.f, ov0Var3, 805306374, 490);
                                                                final String str9 = str7;
                                                                boolean zF7 = ov0Var3.f(str9);
                                                                final CoroutineScope coroutineScope7 = coroutineScope5;
                                                                boolean zH3 = zF7 | ov0Var3.h(coroutineScope7);
                                                                final AccountBenefitsRepository accountBenefitsRepository6 = accountBenefitsRepository4;
                                                                boolean zH4 = zH3 | ov0Var3.h(accountBenefitsRepository6);
                                                                Object objQ19 = ov0Var3.Q();
                                                                if (zH4 || objQ19 == c30Var2) {
                                                                    final int i7 = 0;
                                                                    final ey1 ey1Var313 = ey1Var28;
                                                                    final ey1 ey1Var314 = ey1Var35;
                                                                    final ey1 ey1Var315 = ey1Var34;
                                                                    ey1Var36 = ey1Var312;
                                                                    objQ19 = new au0() { // from class: e3
                                                                        @Override // defpackage.au0
                                                                        public final Object invoke() {
                                                                            int i9 = i7;
                                                                            mf3 mf3Var2 = mf3.a;
                                                                            switch (i9) {
                                                                                case 0:
                                                                                    ey1 ey1Var46 = ey1Var313;
                                                                                    ArchivePage archivePage4 = (ArchivePage) ey1Var46.getValue();
                                                                                    int page = archivePage4 != null ? archivePage4.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository8 = accountBenefitsRepository6;
                                                                                    xq1.f(str9, coroutineScope7, ey1Var36, ey1Var315, accountBenefitsRepository8, new y3(accountBenefitsRepository8, page, ey1Var311, ey1Var46, ey1Var314, null));
                                                                                    break;
                                                                                case 1:
                                                                                    ey1 ey1Var47 = ey1Var313;
                                                                                    ArchivePage archivePage5 = (ArchivePage) ey1Var47.getValue();
                                                                                    int page2 = archivePage5 != null ? archivePage5.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository9 = accountBenefitsRepository6;
                                                                                    xq1.f(str9, coroutineScope7, ey1Var36, ey1Var315, accountBenefitsRepository9, new y3(accountBenefitsRepository9, page2 - 1, ey1Var311, ey1Var47, ey1Var314, null));
                                                                                    break;
                                                                                default:
                                                                                    ey1 ey1Var48 = ey1Var313;
                                                                                    ArchivePage archivePage6 = (ArchivePage) ey1Var48.getValue();
                                                                                    int page3 = archivePage6 != null ? archivePage6.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository10 = accountBenefitsRepository6;
                                                                                    xq1.f(str9, coroutineScope7, ey1Var36, ey1Var315, accountBenefitsRepository10, new y3(accountBenefitsRepository10, page3 + 1, ey1Var311, ey1Var48, ey1Var314, null));
                                                                                    break;
                                                                            }
                                                                            return mf3Var2;
                                                                        }
                                                                    };
                                                                    ov0Var3.m0(objQ19);
                                                                } else {
                                                                    ey1Var36 = ey1Var312;
                                                                }
                                                                boolean z6 = !((Boolean) ey1Var36.getValue()).booleanValue();
                                                                b52 b52Var2 = hu.a;
                                                                n51.j((au0) objQ19, null, z6, null, hu.f(bk.g, ov0Var3), null, ks.g, ov0Var3, 805306368, 490);
                                                                ov0Var3.p(true);
                                                            }
                                                            break;
                                                        default:
                                                            f30 f30Var4 = (f30) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((bc1) obj5).getClass();
                                                            ov0 ov0Var4 = (ov0) f30Var4;
                                                            if (!ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                ov0Var4.W();
                                                            } else {
                                                                kk2 kk2VarA2 = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var4, 6);
                                                                int iHashCode2 = Long.hashCode(ov0Var4.T);
                                                                l72 l72VarL2 = ov0Var4.l();
                                                                dv1 dv1VarH2 = xp1.H(ov0Var4, av1Var);
                                                                w20.b.getClass();
                                                                x30 x30Var2 = v20.b;
                                                                ov0Var4.g0();
                                                                if (ov0Var4.S) {
                                                                    ov0Var4.k(x30Var2);
                                                                } else {
                                                                    ov0Var4.p0();
                                                                }
                                                                q73.h(ov0Var4, v20.e, kk2VarA2);
                                                                q73.h(ov0Var4, v20.d, l72VarL2);
                                                                q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode2));
                                                                q73.g(ov0Var4, v20.g);
                                                                q73.h(ov0Var4, v20.c, dv1VarH2);
                                                                final String str10 = str7;
                                                                boolean zF8 = ov0Var4.f(str10);
                                                                final CoroutineScope coroutineScope8 = coroutineScope5;
                                                                boolean zH5 = zF8 | ov0Var4.h(coroutineScope8);
                                                                final AccountBenefitsRepository accountBenefitsRepository7 = accountBenefitsRepository4;
                                                                boolean zH6 = zH5 | ov0Var4.h(accountBenefitsRepository7);
                                                                Object objQ20 = ov0Var4.Q();
                                                                final ey1 ey1Var40 = ey1Var27;
                                                                final ey1 ey1Var41 = ey1Var25;
                                                                final ey1 ey1Var42 = ey1Var28;
                                                                final ey1 ey1Var43 = ey1Var35;
                                                                final ey1 ey1Var44 = ey1Var34;
                                                                if (zH6 || objQ20 == c30Var2) {
                                                                    final int i8 = 1;
                                                                    obj8 = new au0() { // from class: e3
                                                                        @Override // defpackage.au0
                                                                        public final Object invoke() {
                                                                            int i9 = i8;
                                                                            mf3 mf3Var2 = mf3.a;
                                                                            switch (i9) {
                                                                                case 0:
                                                                                    ey1 ey1Var46 = ey1Var40;
                                                                                    ArchivePage archivePage4 = (ArchivePage) ey1Var46.getValue();
                                                                                    int page = archivePage4 != null ? archivePage4.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository8 = accountBenefitsRepository7;
                                                                                    xq1.f(str10, coroutineScope8, ey1Var43, ey1Var44, accountBenefitsRepository8, new y3(accountBenefitsRepository8, page, ey1Var41, ey1Var46, ey1Var42, null));
                                                                                    break;
                                                                                case 1:
                                                                                    ey1 ey1Var47 = ey1Var40;
                                                                                    ArchivePage archivePage5 = (ArchivePage) ey1Var47.getValue();
                                                                                    int page2 = archivePage5 != null ? archivePage5.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository9 = accountBenefitsRepository7;
                                                                                    xq1.f(str10, coroutineScope8, ey1Var43, ey1Var44, accountBenefitsRepository9, new y3(accountBenefitsRepository9, page2 - 1, ey1Var41, ey1Var47, ey1Var42, null));
                                                                                    break;
                                                                                default:
                                                                                    ey1 ey1Var48 = ey1Var40;
                                                                                    ArchivePage archivePage6 = (ArchivePage) ey1Var48.getValue();
                                                                                    int page3 = archivePage6 != null ? archivePage6.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository10 = accountBenefitsRepository7;
                                                                                    xq1.f(str10, coroutineScope8, ey1Var43, ey1Var44, accountBenefitsRepository10, new y3(accountBenefitsRepository10, page3 + 1, ey1Var41, ey1Var48, ey1Var42, null));
                                                                                    break;
                                                                            }
                                                                            return mf3Var2;
                                                                        }
                                                                    };
                                                                    ey1Var37 = ey1Var43;
                                                                    ey1Var38 = ey1Var44;
                                                                    accountBenefitsRepository5 = accountBenefitsRepository7;
                                                                    str8 = str10;
                                                                    coroutineScope6 = coroutineScope8;
                                                                    ov0Var4.m0(obj8);
                                                                } else {
                                                                    ey1Var38 = ey1Var44;
                                                                    str8 = str10;
                                                                    coroutineScope6 = coroutineScope8;
                                                                    accountBenefitsRepository5 = accountBenefitsRepository7;
                                                                    ey1Var37 = ey1Var43;
                                                                    obj8 = objQ20;
                                                                }
                                                                au0 au0Var3 = (au0) obj8;
                                                                if (xq1.e(ey1Var37)) {
                                                                    z4 = false;
                                                                } else {
                                                                    ArchivePage archivePage4 = (ArchivePage) ey1Var40.getValue();
                                                                    if ((archivePage4 != null ? archivePage4.getPage() : 1) > 1) {
                                                                        z4 = true;
                                                                    } else {
                                                                        z4 = false;
                                                                    }
                                                                }
                                                                n51.j(au0Var3, null, z4, null, null, null, ks.l, ov0Var4, 805306368, 506);
                                                                ArchivePage archivePage5 = (ArchivePage) ey1Var40.getValue();
                                                                s83.b(String.valueOf(archivePage5 != null ? archivePage5.getPage() : 1), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262142);
                                                                boolean zF9 = ov0Var4.f(str8) | ov0Var4.h(coroutineScope6) | ov0Var4.h(accountBenefitsRepository5);
                                                                Object objQ21 = ov0Var4.Q();
                                                                if (zF9 || objQ21 == c30Var2) {
                                                                    final int i9 = 2;
                                                                    final String str11 = str8;
                                                                    final CoroutineScope coroutineScope9 = coroutineScope6;
                                                                    final AccountBenefitsRepository accountBenefitsRepository8 = accountBenefitsRepository5;
                                                                    ey1Var39 = ey1Var40;
                                                                    ey1Var310 = ey1Var37;
                                                                    final ey1 ey1Var45 = ey1Var38;
                                                                    au0 au0Var4 = new au0() { // from class: e3
                                                                        @Override // defpackage.au0
                                                                        public final Object invoke() {
                                                                            int i10 = i9;
                                                                            mf3 mf3Var2 = mf3.a;
                                                                            switch (i10) {
                                                                                case 0:
                                                                                    ey1 ey1Var46 = ey1Var39;
                                                                                    ArchivePage archivePage6 = (ArchivePage) ey1Var46.getValue();
                                                                                    int page = archivePage6 != null ? archivePage6.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository9 = accountBenefitsRepository8;
                                                                                    xq1.f(str11, coroutineScope9, ey1Var310, ey1Var45, accountBenefitsRepository9, new y3(accountBenefitsRepository9, page, ey1Var41, ey1Var46, ey1Var42, null));
                                                                                    break;
                                                                                case 1:
                                                                                    ey1 ey1Var47 = ey1Var39;
                                                                                    ArchivePage archivePage7 = (ArchivePage) ey1Var47.getValue();
                                                                                    int page2 = archivePage7 != null ? archivePage7.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository10 = accountBenefitsRepository8;
                                                                                    xq1.f(str11, coroutineScope9, ey1Var310, ey1Var45, accountBenefitsRepository10, new y3(accountBenefitsRepository10, page2 - 1, ey1Var41, ey1Var47, ey1Var42, null));
                                                                                    break;
                                                                                default:
                                                                                    ey1 ey1Var48 = ey1Var39;
                                                                                    ArchivePage archivePage8 = (ArchivePage) ey1Var48.getValue();
                                                                                    int page3 = archivePage8 != null ? archivePage8.getPage() : 1;
                                                                                    AccountBenefitsRepository accountBenefitsRepository11 = accountBenefitsRepository8;
                                                                                    xq1.f(str11, coroutineScope9, ey1Var310, ey1Var45, accountBenefitsRepository11, new y3(accountBenefitsRepository11, page3 + 1, ey1Var41, ey1Var48, ey1Var42, null));
                                                                                    break;
                                                                            }
                                                                            return mf3Var2;
                                                                        }
                                                                    };
                                                                    ov0Var4.m0(au0Var4);
                                                                    objQ21 = au0Var4;
                                                                } else {
                                                                    ey1Var39 = ey1Var40;
                                                                    ey1Var310 = ey1Var37;
                                                                }
                                                                au0 au0Var5 = (au0) objQ21;
                                                                if (((Boolean) ey1Var310.getValue()).booleanValue()) {
                                                                    z5 = false;
                                                                } else {
                                                                    ArchivePage archivePage6 = (ArchivePage) ey1Var39.getValue();
                                                                    int page = (archivePage6 != null ? archivePage6.getPage() : 1) * 30;
                                                                    ArchivePage archivePage7 = (ArchivePage) ey1Var39.getValue();
                                                                    if (page < (archivePage7 != null ? archivePage7.getTotal() : 0)) {
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                }
                                                                n51.j(au0Var5, null, z5, null, null, null, ks.m, ov0Var4, 805306368, 506);
                                                                ov0Var4.p(true);
                                                            }
                                                            break;
                                                    }
                                                    return mf3Var;
                                                }
                                            }, true, -1296581226));
                                        }
                                    }
                                    return mf3.a;
                                }
                            };
                            ov0Var2.m0(lu0Var);
                            objQ16 = lu0Var;
                        }
                        ke0.d(dv1VarC, null, b52Var, joVar, null, null, false, null, (lu0) objQ16, ov0Var2, 24960, 490);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, (i3 & 896) | (i3 & 112) | 3072);
            if (((Map) ey1Var15.getValue()).isEmpty()) {
                z3 = false;
                ov0Var.c0(1993050205);
            } else {
                ov0Var.c0(-1043795720);
                Object objQ16 = ov0Var.Q();
                if (objQ16 == c30Var) {
                    objQ16 = new f3(ey1Var7, ey1Var15, ey1Var13, 0);
                    ov0Var.m0(objQ16);
                }
                final ey1 ey1Var17 = ey1Var2;
                final Context context3 = context;
                a((au0) objQ16, sb.a0(-242740648, new pu0() { // from class: g3
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        final ey1 ey1Var18;
                        final ey1 ey1Var19;
                        f30 f30Var2 = (f30) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        ov0 ov0Var2 = (ov0) f30Var2;
                        if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final String str3 = str2;
                            boolean zF5 = ov0Var2.f(str3);
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            boolean zH = zF5 | ov0Var2.h(coroutineScope3);
                            final AccountBenefitsRepository accountBenefitsRepository2 = accountBenefitsRepository;
                            boolean zH2 = zH | ov0Var2.h(accountBenefitsRepository2);
                            final AccountSyncManager accountSyncManager2 = accountSyncManager;
                            boolean zH3 = zH2 | ov0Var2.h(accountSyncManager2);
                            final Context context4 = context3;
                            boolean zH4 = zH3 | ov0Var2.h(context4);
                            Object objQ17 = ov0Var2.Q();
                            ey1 ey1Var20 = ey1Var10;
                            ey1 ey1Var21 = ey1Var7;
                            if (zH4 || objQ17 == d30.a) {
                                final ey1 ey1Var22 = ey1Var13;
                                final ey1 ey1Var23 = ey1Var16;
                                final ey1 ey1Var24 = ey1Var15;
                                final ey1 ey1Var25 = ey1Var12;
                                final ey1 ey1Var26 = ey1Var4;
                                final ey1 ey1Var27 = ey1Var17;
                                final ey1 ey1Var28 = ey1Var8;
                                ey1Var18 = ey1Var20;
                                ey1Var19 = ey1Var21;
                                au0 au0Var2 = new au0() { // from class: l2
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        ey1 ey1Var29 = ey1Var22;
                                        if (((Boolean) ey1Var29.getValue()).booleanValue()) {
                                            AccountSyncManager accountSyncManager3 = accountSyncManager2;
                                            AccountBenefitsRepository accountBenefitsRepository3 = accountBenefitsRepository2;
                                            xq1.f(str3, coroutineScope3, ey1Var19, ey1Var28, accountBenefitsRepository3, new r3(accountSyncManager3, accountBenefitsRepository3, context4, ey1Var23, ey1Var24, ey1Var18, ey1Var25, ey1Var29, ey1Var26, ey1Var27, null));
                                        } else {
                                            ey1Var29.setValue(Boolean.TRUE);
                                        }
                                        return mf3.a;
                                    }
                                };
                                ov0Var2.m0(au0Var2);
                                objQ17 = au0Var2;
                            } else {
                                ey1Var18 = ey1Var20;
                                ey1Var19 = ey1Var21;
                            }
                            au0 au0Var3 = (au0) objQ17;
                            boolean z4 = (xq1.e(ey1Var19) || ((Set) ey1Var18.getValue()).isEmpty()) ? false : true;
                            b52 b52Var = hu.a;
                            n51.j(au0Var3, null, z4, null, hu.f(bk.g, ov0Var2), null, ks.n, ov0Var2, 805306368, 490);
                        } else {
                            ov0Var2.W();
                        }
                        return mf3.a;
                    }
                }, ov0Var), null, sb.a0(-1073394282, new pu0() { // from class: h3
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        f30 f30Var2 = (f30) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        ov0 ov0Var2 = (ov0) f30Var2;
                        if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var2, 0);
                            int iHashCode = Long.hashCode(ov0Var2.T);
                            l72 l72VarL = ov0Var2.l();
                            dv1 dv1VarH = xp1.H(ov0Var2, av1.a);
                            w20.b.getClass();
                            x30 x30Var = v20.b;
                            ov0Var2.g0();
                            if (ov0Var2.S) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, v20.e, kk2VarA);
                            q73.h(ov0Var2, v20.d, l72VarL);
                            q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                            q73.g(ov0Var2, v20.g);
                            q73.h(ov0Var2, v20.c, dv1VarH);
                            no1 no1Var = no1VarB0;
                            boolean zH = ov0Var2.h(no1Var);
                            Object objQ17 = ov0Var2.Q();
                            ey1 ey1Var18 = ey1Var15;
                            ey1 ey1Var19 = ey1Var10;
                            c30 c30Var2 = d30.a;
                            if (zH || objQ17 == c30Var2) {
                                q2 q2Var = new q2((Object) no1Var, (Object) ey1Var18, (Object) ey1Var19, (Object) ey1Var14, 0);
                                ov0Var2.m0(q2Var);
                                objQ17 = q2Var;
                            }
                            au0 au0Var2 = (au0) objQ17;
                            ey1 ey1Var20 = ey1Var7;
                            boolean z4 = (xq1.e(ey1Var20) || ((Set) ey1Var19.getValue()).isEmpty()) ? false : true;
                            b52 b52Var = hu.a;
                            n51.j(au0Var2, null, z4, null, hu.f(bk.g, ov0Var2), null, ks.o, ov0Var2, 805306368, 490);
                            Object objQ18 = ov0Var2.Q();
                            if (objQ18 == c30Var2) {
                                objQ18 = new h2(ey1Var18, ey1Var13, 1);
                                ov0Var2.m0(objQ18);
                            }
                            n51.j((au0) objQ18, null, !((Boolean) ey1Var20.getValue()).booleanValue(), null, null, null, ks.p, ov0Var2, 805306374, 506);
                            ov0Var2.p(true);
                        } else {
                            ov0Var2.W();
                        }
                        return mf3.a;
                    }
                }, ov0Var), sb.a0(-1904047916, new i3(ey1Var13, 0), ov0Var), sb.a0(1975592563, new j3(ey1Var8, ey1Var13, ey1Var15, ey1Var10, ey1Var7, 0), ov0Var), null, jD, 0L, 0L, 0L, null, ov0Var, 1772598, 16020);
                ov0Var = ov0Var;
                z3 = false;
            }
            ov0Var.p(z3);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new f2(cloudAccountState, z2, au0Var, i2, 1);
        }
    }

    public static final boolean e(ey1 ey1Var) {
        return ((Boolean) ey1Var.getValue()).booleanValue();
    }

    public static final void f(String str, CoroutineScope coroutineScope, ey1 ey1Var, ey1 ey1Var2, AccountBenefitsRepository accountBenefitsRepository, pu0 pu0Var) {
        if (str == null || e(ey1Var)) {
            return;
        }
        ey1Var.setValue(Boolean.TRUE);
        ey1Var2.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new z3(pu0Var, str, accountBenefitsRepository, ey1Var2, ey1Var, null, 0), 3, null);
    }

    public static final void g(boolean z2, au0 au0Var, f30 f30Var, int i2, int i3) {
        int i4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-361453782);
        int i5 = i3 & 1;
        int i6 = 2;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (ov0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var.f(au0Var) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && ov0Var.E()) {
            ov0Var.W();
        } else {
            if (i5 != 0) {
                z2 = true;
            }
            ey1 ey1VarL = ke0.L(au0Var, ov0Var);
            ov0Var.d0(-971159753);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new bq(ey1VarL, z2);
                ov0Var.m0(objQ);
            }
            bq bqVar = (bq) objQ;
            ov0Var.p(false);
            ov0Var.d0(-971159481);
            boolean zF = ov0Var.f(bqVar) | ov0Var.g(z2);
            Object objQ2 = ov0Var.Q();
            if (zF || objQ2 == c30Var) {
                objQ2 = new zp(bqVar, z2);
                ov0Var.m0(objQ2);
            }
            ov0Var.p(false);
            oi0.i((au0) objQ2, ov0Var);
            hh0 hh0Var = lh1.a;
            ov0Var.d0(-2068013981);
            y12 y12Var = (y12) ov0Var.j(lh1.a);
            ov0Var.d0(1680121597);
            if (y12Var == null) {
                View view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
                view.getClass();
                y12Var = (y12) xs2.P(xs2.S(xs2.Q(ik0.I, view), ik0.J));
            }
            ov0Var.p(false);
            if (y12Var == null) {
                Object baseContext = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof y12) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                y12Var = (y12) baseContext;
            }
            ov0Var.p(false);
            if (y12Var == null) {
                fo.n("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            x12 onBackPressedDispatcher = y12Var.getOnBackPressedDispatcher();
            df1 df1Var = (df1) ov0Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ov0Var.d0(-971159120);
            boolean zF2 = ov0Var.f(onBackPressedDispatcher) | ov0Var.f(df1Var) | ov0Var.f(bqVar);
            Object objQ3 = ov0Var.Q();
            if (zF2 || objQ3 == c30Var) {
                objQ3 = new ah(onBackPressedDispatcher, df1Var, bqVar, i6);
                ov0Var.m0(objQ3);
            }
            ov0Var.p(false);
            oi0.b(df1Var, onBackPressedDispatcher, (lu0) objQ3, ov0Var);
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new aq(z2, au0Var, i2, i3);
        }
    }

    public static final void h(String str, boolean z2, au0 au0Var, p10 p10Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1600987034);
        int i3 = i2 | (ov0Var2.f(str) ? 4 : 2) | (ov0Var2.g(z2) ? 32 : 16) | (ov0Var2.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i4 = 0;
        if (ov0Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            g(false, au0Var, ov0Var2, (i3 >> 3) & 112, 1);
            ov0Var = ov0Var2;
            wc0.n(null, sb.a0(-1736472022, new o2(i4, au0Var, str, z2), ov0Var2), null, null, null, 0, z2 ? bk.a : bk.d, 0L, null, p10Var, ov0Var, 805306416, 445);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(str, z2, au0Var, p10Var, i2, 0);
        }
    }

    public static final void i(x01 x01Var, String str, String str2, boolean z2, f30 f30Var, int i2) {
        str.getClass();
        str2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1668063355);
        int i3 = i2 | (ov0Var.f(x01Var) ? 4 : 2) | (ov0Var.f(str) ? 32 : 16) | (ov0Var.f(str2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.g(z2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            long j2 = z2 ? bk.c : bk.f;
            fn0 fn0Var = iw2.c;
            hh0 hh0Var = mz.a;
            long j3 = ((kz) ov0Var.j(hh0Var)).n;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarD = zm3.D(xp1.k(fn0Var, j3, iy0Var), 32.0f);
            pr prVar = j9.j;
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarD);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.s, ov0Var, 54);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            av1 av1Var = av1.a;
            dv1 dv1VarH2 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            dv1 dv1VarK = xp1.k(xp1.n(iw2.k(av1Var, 80.0f), cj2.a), hz.c(0.12f, ((kz) ov0Var.j(hh0Var)).w), iy0Var);
            er1 er1VarC2 = ws.c(prVar, false);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarK);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            t01.a(x01Var, null, iw2.k(av1Var, 40.0f), ((kz) ov0Var.j(hh0Var)).w, ov0Var, (i3 & 14) | 432, 0);
            ov0Var.p(true);
            s83.b(str, null, ((kz) ov0Var.j(hh0Var)).o, v63.c(18), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i3 >> 3) & 14) | 1597440, 0, 262058);
            s83.b(str2, null, j2, v63.c(13), null, null, 0L, null, new m53(3), v63.c(20), 0, false, 0, 0, null, ov0Var, ((i3 >> 6) & 14) | 24576, 48, 259050);
            ov0Var = ov0Var;
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new jj2(x01Var, str, str2, z2, i2);
        }
    }

    public static final void j(CloudAccountState cloudAccountState, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        cloudAccountState.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-18199141);
        int i3 = (ov0Var.h(cloudAccountState) ? 4 : 2) | i2 | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            CloudAccount account = cloudAccountState.getAccount();
            ov0Var.a0(-309501827, ov0Var.H(account != null ? account.getId() : null, Boolean.valueOf(cloudAccountState.getValidated())));
            d(cloudAccountState, z2, au0Var, ov0Var, i3 & 1022);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new f2(cloudAccountState, z2, au0Var, i2, 0);
        }
    }

    public static final void k(CloudAccountState cloudAccountState, boolean z2, au0 au0Var, au0 au0Var2, f30 f30Var, int i2) {
        cloudAccountState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(330484885);
        int i3 = i2 | (ov0Var.h(cloudAccountState) ? 4 : 2) | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            CloudAccount account = cloudAccountState.getAccount();
            ov0Var.a0(-231601021, ov0Var.H(account != null ? account.getId() : null, Boolean.valueOf(cloudAccountState.getValidated())));
            o(cloudAccountState, z2, au0Var, au0Var2, ov0Var, i3 & 8190);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new k2(cloudAccountState, z2, au0Var, au0Var2, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void l(final au0 au0Var, dv1 dv1Var, boolean z2, o01 o01Var, au2 au2Var, final pu0 pu0Var, f30 f30Var, final int i2, final int i3) {
        int i4;
        final dv1 dv1Var2;
        int i5;
        int i6;
        boolean z3;
        final boolean z4;
        final o01 o01Var2;
        final au2 au2Var2;
        ee2 ee2VarT;
        dv1 dv1Var3;
        long j2;
        kz kzVar;
        o01 o01Var3;
        long j3;
        long jC;
        int i7;
        long j4;
        long j5;
        int i8;
        au2 au2VarA;
        o01 o01Var4;
        boolean z5;
        dv1 dv1Var4;
        int i9;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1413012038);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var.h(au0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 == 0) {
            if ((i2 & 48) == 0) {
                dv1Var2 = dv1Var;
                i4 |= ov0Var.f(dv1Var2) ? 32 : 16;
            }
            i5 = i4 | 384;
            if ((i2 & 3072) == 0) {
                i5 = i4 | 1408;
            }
            i6 = i5 | 24576;
            if ((196608 & i2) == 0) {
                i6 = 90112 | i5;
            }
            if ((1572864 & i2) == 0) {
                if (ov0Var.h(pu0Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i6 |= i9;
            }
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var.T(i6 & 1, z3)) {
                ov0Var.Y();
                if ((i2 & 1) != 0 || ov0Var.B()) {
                    if (i10 != 0) {
                        dv1Var3 = av1.a;
                    } else {
                        dv1Var3 = dv1Var2;
                    }
                    j2 = ((hz) ov0Var.j(v50.a)).a;
                    kzVar = (kz) ov0Var.j(mz.a);
                    o01Var3 = kzVar.d0;
                    if (o01Var3 == null) {
                        long j6 = hz.f;
                        o01 o01Var5 = new o01(j6, j2, j6, hz.c(0.38f, j2));
                        kzVar.d0 = o01Var5;
                        o01Var3 = o01Var5;
                    }
                    j3 = o01Var3.b;
                    if (ye3.a(j3, j2)) {
                        i7 = -465921;
                    } else {
                        jC = hz.c(0.38f, j2);
                        long j7 = o01Var3.a;
                        i7 = -465921;
                        long j8 = o01Var3.c;
                        if (j2 != 16) {
                            j4 = j2;
                        } else {
                            j4 = j3;
                        }
                        if (jC != 16) {
                            j5 = jC;
                        } else {
                            j5 = o01Var3.d;
                        }
                        o01Var3 = new o01(j7, j4, j8, j5);
                    }
                    i8 = i6 & i7;
                    au2VarA = hu2.a(ji2.v, ov0Var);
                    o01Var4 = o01Var3;
                    z5 = true;
                    dv1Var4 = dv1Var3;
                } else {
                    ov0Var.W();
                    i8 = i6 & (-465921);
                    z5 = z2;
                    o01Var4 = o01Var;
                    au2VarA = au2Var;
                    dv1Var4 = dv1Var2;
                }
                ov0Var.q();
                int i11 = i8 << 3;
                m(dv1Var4, au0Var, z5, au2VarA, o01Var4, pu0Var, ov0Var, ((i8 >> 3) & 14) | (i11 & 112) | (i8 & 896) | (i11 & 458752) | (i8 & 3670016));
                dv1Var2 = dv1Var4;
                z4 = z5;
                au2Var2 = au2VarA;
                o01Var2 = o01Var4;
            } else {
                ov0Var.W();
                z4 = z2;
                o01Var2 = o01Var;
                au2Var2 = au2Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: p01
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xq1.l(au0Var, dv1Var2, z4, o01Var2, au2Var2, pu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        i4 |= 48;
        dv1Var2 = dv1Var;
        i5 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i5 = i4 | 1408;
        }
        i6 = i5 | 24576;
        if ((196608 & i2) == 0) {
            i6 = 90112 | i5;
        }
        if ((1572864 & i2) == 0) {
            if (ov0Var.h(pu0Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((599187 & i6) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ov0Var.T(i6 & 1, z3)) {
            ov0Var.Y();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    dv1Var3 = av1.a;
                } else {
                    dv1Var3 = dv1Var2;
                }
                j2 = ((hz) ov0Var.j(v50.a)).a;
                kzVar = (kz) ov0Var.j(mz.a);
                o01Var3 = kzVar.d0;
                if (o01Var3 == null) {
                    long j9 = hz.f;
                    o01 o01Var6 = new o01(j9, j2, j9, hz.c(0.38f, j2));
                    kzVar.d0 = o01Var6;
                    o01Var3 = o01Var6;
                }
                j3 = o01Var3.b;
                if (ye3.a(j3, j2)) {
                    i7 = -465921;
                } else {
                    jC = hz.c(0.38f, j2);
                    long j10 = o01Var3.a;
                    i7 = -465921;
                    long j11 = o01Var3.c;
                    if (j2 != 16) {
                        j4 = j2;
                    } else {
                        j4 = j3;
                    }
                    if (jC != 16) {
                        j5 = jC;
                    } else {
                        j5 = o01Var3.d;
                    }
                    o01Var3 = new o01(j10, j4, j11, j5);
                }
                i8 = i6 & i7;
                au2VarA = hu2.a(ji2.v, ov0Var);
                o01Var4 = o01Var3;
                z5 = true;
                dv1Var4 = dv1Var3;
            } else {
                if (i10 != 0) {
                    dv1Var3 = av1.a;
                } else {
                    dv1Var3 = dv1Var2;
                }
                j2 = ((hz) ov0Var.j(v50.a)).a;
                kzVar = (kz) ov0Var.j(mz.a);
                o01Var3 = kzVar.d0;
                if (o01Var3 == null) {
                    long j12 = hz.f;
                    o01 o01Var7 = new o01(j12, j2, j12, hz.c(0.38f, j2));
                    kzVar.d0 = o01Var7;
                    o01Var3 = o01Var7;
                }
                j3 = o01Var3.b;
                if (ye3.a(j3, j2)) {
                    i7 = -465921;
                } else {
                    jC = hz.c(0.38f, j2);
                    long j13 = o01Var3.a;
                    i7 = -465921;
                    long j14 = o01Var3.c;
                    if (j2 != 16) {
                        j4 = j2;
                    } else {
                        j4 = j3;
                    }
                    if (jC != 16) {
                        j5 = jC;
                    } else {
                        j5 = o01Var3.d;
                    }
                    o01Var3 = new o01(j13, j4, j14, j5);
                }
                i8 = i6 & i7;
                au2VarA = hu2.a(ji2.v, ov0Var);
                o01Var4 = o01Var3;
                z5 = true;
                dv1Var4 = dv1Var3;
            }
            ov0Var.q();
            int i12 = i8 << 3;
            m(dv1Var4, au0Var, z5, au2VarA, o01Var4, pu0Var, ov0Var, ((i8 >> 3) & 14) | (i12 & 112) | (i8 & 896) | (i12 & 458752) | (i8 & 3670016));
            dv1Var2 = dv1Var4;
            z4 = z5;
            au2Var2 = au2VarA;
            o01Var2 = o01Var4;
        } else {
            ov0Var.W();
            z4 = z2;
            o01Var2 = o01Var;
            au2Var2 = au2Var;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: p01
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xq1.l(au0Var, dv1Var2, z4, o01Var2, au2Var2, pu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public static final void m(dv1 dv1Var, au0 au0Var, boolean z2, au2 au2Var, o01 o01Var, pu0 pu0Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var.f(au2Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ov0Var.f(o01Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ov0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ov0Var.h(pu0Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (ov0Var.T(i4 & 1, (599187 & i4) != 599186)) {
            ov0Var.c0(977045485);
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new ix1();
                ov0Var.m0(objQ);
            }
            ix1 ix1Var = (ix1) objQ;
            ov0Var.p(false);
            dy0 dy0Var = v41.a;
            dv1 dv1VarD = dv1Var.d(au1.a);
            float f2 = ji2.w;
            long jA = vd0.a(ji2.x + f2 + f2, 40.0f);
            fn0 fn0Var = iw2.a;
            dv1 dv1VarP = n51.p(zm3.l(xp1.k(xp1.n(iw2.l(dv1VarD, xd0.b(jA), xd0.a(jA)), au2Var), z2 ? o01Var.a : o01Var.c, au2Var), ix1Var, sh2.a(false, 0.0f, 7), z2, new vh2(0), au0Var, 8));
            er1 er1VarC = ws.c(j9.j, false);
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarP);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            gh ghVar = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar);
            }
            q73.h(ov0Var, v20.c, dv1VarH);
            k22.b(v50.a.a(new hz(z2 ? o01Var.b : o01Var.d)), pu0Var, ov0Var, ((i4 >> 15) & 112) | 8);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new bd(dv1Var, au0Var, z2, au2Var, o01Var, pu0Var, i2);
        }
    }

    public static final je n() {
        return new je(new Paint(7));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    public static final void o(CloudAccountState cloudAccountState, boolean z2, au0 au0Var, final au0 au0Var2, f30 f30Var, int i2) {
        String id;
        CoroutineScope coroutineScope;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-805773926);
        int i3 = i2 | (ov0Var.h(cloudAccountState) ? 4 : 2) | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ov0Var.d0(414512006);
            kn2 kn2VarA = v91.a(ov0Var);
            ov0Var.d0(1274527078);
            ov0Var.p(false);
            ov0Var.d0(511388516);
            boolean zF = ov0Var.f(null) | ov0Var.f(kn2VarA);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = kn2VarA.a(xe2.a(AccountBenefitsRepository.class), null);
                ov0Var.m0(objQ);
            }
            ov0Var.p(false);
            ov0Var.p(false);
            final AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = oi0.j(ov0Var);
                ov0Var.m0(objQ2);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objQ2;
            CloudAccount account = cloudAccountState.getAccount();
            if (account == null) {
                id = null;
            } else {
                if (!cloudAccountState.getValidated() || account.isGuest()) {
                    account = null;
                }
                if (account != null) {
                    id = account.getId();
                } else {
                    id = null;
                }
            }
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = ke0.H(null);
                ov0Var.m0(objQ3);
            }
            final ey1 ey1Var = (ey1) objQ3;
            Object objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                objQ4 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ4);
            }
            final ey1 ey1Var2 = (ey1) objQ4;
            Object objQ5 = ov0Var.Q();
            if (objQ5 == c30Var) {
                objQ5 = ke0.H(null);
                ov0Var.m0(objQ5);
            }
            final ey1 ey1Var3 = (ey1) objQ5;
            Object objQ6 = ov0Var.Q();
            if (objQ6 == c30Var) {
                CloudAccount account2 = cloudAccountState.getAccount();
                String deviceId = account2 != null ? account2.getDeviceId() : null;
                if (deviceId == null) {
                    deviceId = "";
                }
                objQ6 = ke0.H(deviceId);
                ov0Var.m0(objQ6);
            }
            final ey1 ey1Var4 = (ey1) objQ6;
            Object objQ7 = ov0Var.Q();
            if (objQ7 == c30Var) {
                objQ7 = ke0.H(null);
                ov0Var.m0(objQ7);
            }
            final ey1 ey1Var5 = (ey1) objQ7;
            Object objQ8 = ov0Var.Q();
            if (objQ8 == c30Var) {
                objQ8 = ke0.H(UUID.randomUUID().toString());
                ov0Var.m0(objQ8);
            }
            final ey1 ey1Var6 = (ey1) objQ8;
            boolean zF2 = ov0Var.f(id) | ov0Var.h(coroutineScope2) | ov0Var.h(accountBenefitsRepository);
            Object objQ9 = ov0Var.Q();
            if (zF2 || objQ9 == c30Var) {
                coroutineScope = coroutineScope2;
                a4 a4Var = new a4(id, accountBenefitsRepository, ey1Var, coroutineScope, ey1Var2, ey1Var3, (q60) null);
                ov0Var.m0(a4Var);
                objQ9 = a4Var;
            } else {
                coroutineScope = coroutineScope2;
            }
            oi0.e(ov0Var, (pu0) objQ9, id);
            final String strW = w((String) ey1Var3.getValue(), ov0Var);
            boolean z3 = false;
            final String str = id;
            final long jD = z2 ? xp1.d(4280428334L) : hz.c;
            final CoroutineScope coroutineScope3 = coroutineScope;
            int i4 = 1;
            h(ke0.N(2131624348, ov0Var), z2, au0Var, sb.a0(1573069468, new qu0() { // from class: g2
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
                        jo joVar = new jo(12.0f, true, new fo(0));
                        final String str2 = str;
                        boolean zF3 = ov0Var2.f(str2);
                        final CoroutineScope coroutineScope4 = coroutineScope3;
                        boolean zH = zF3 | ov0Var2.h(coroutineScope4);
                        final AccountBenefitsRepository accountBenefitsRepository2 = accountBenefitsRepository;
                        boolean zH2 = zH | ov0Var2.h(accountBenefitsRepository2);
                        final String str3 = strW;
                        boolean zF4 = zH2 | ov0Var2.f(str3);
                        final long j2 = jD;
                        boolean zE = zF4 | ov0Var2.e(j2);
                        final au0 au0Var3 = au0Var2;
                        boolean zF5 = zE | ov0Var2.f(au0Var3);
                        Object objQ10 = ov0Var2.Q();
                        if (zF5 || objQ10 == d30.a) {
                            final ey1 ey1Var7 = ey1Var;
                            final ey1 ey1Var8 = ey1Var2;
                            final ey1 ey1Var9 = ey1Var3;
                            final ey1 ey1Var10 = ey1Var4;
                            final ey1 ey1Var11 = ey1Var5;
                            final ey1 ey1Var12 = ey1Var6;
                            lu0 lu0Var = new lu0() { // from class: r2
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj4) {
                                    kd1 kd1Var = (kd1) obj4;
                                    kd1Var.getClass();
                                    kd1Var.a(null, null, ks.q);
                                    String str4 = str2;
                                    if (str4 == null) {
                                        kd1Var.a(null, null, ks.r);
                                    } else {
                                        CoroutineScope coroutineScope5 = coroutineScope4;
                                        AccountBenefitsRepository accountBenefitsRepository3 = accountBenefitsRepository2;
                                        ey1 ey1Var13 = ey1Var7;
                                        ey1 ey1Var14 = ey1Var8;
                                        z2 z2Var = new z2(str4, coroutineScope5, accountBenefitsRepository3, ey1Var13, ey1Var14, ey1Var9, 0);
                                        int i5 = 1;
                                        kd1Var.a(null, null, new p10(z2Var, true, 1340437269));
                                        if (xq1.p(ey1Var14)) {
                                            kd1Var.a(null, null, ks.t);
                                        }
                                        String str5 = str3;
                                        if (str5 != null) {
                                            kd1Var.a(null, null, new p10(new w2(str5, 1), true, -109177355));
                                        }
                                        ContributionStatus contributionStatus = (ContributionStatus) ey1Var13.getValue();
                                        if (contributionStatus != null) {
                                            long j3 = j2;
                                            kd1Var.a(null, null, new p10(new kl2(2, j3, contributionStatus), true, 1341524541));
                                            kd1Var.a(null, null, new p10(new a3(contributionStatus, 0), true, 651050150));
                                            List<RewardDevice> devices = contributionStatus.getDevices();
                                            v1 v1Var = new v1(4);
                                            int size = devices.size();
                                            l3 l3Var = new l3(6, v1Var, devices);
                                            u3 u3Var = new u3(devices, 2);
                                            ey1 ey1Var15 = ey1Var10;
                                            kd1Var.c(size, l3Var, u3Var, new p10(new x3(devices, ey1Var15, ey1Var14, i5), true, 802480018));
                                            ey1 ey1Var16 = ey1Var11;
                                            ey1 ey1Var17 = ey1Var12;
                                            kd1Var.a(null, null, new p10(new b3(contributionStatus, ey1Var16, ey1Var17, ey1Var14, ey1Var15, 0), true, -53810171));
                                            kd1Var.a(null, null, new p10(new oc1(contributionStatus, ey1Var16, ey1Var17, ey1Var14), true, -758670492));
                                            List<RewardCoupon> coupons = contributionStatus.getCoupons();
                                            kd1Var.c(coupons.size(), new l3(7, new v1(5), coupons), new u3(coupons, 3), new p10(new d4(coupons, j3, au0Var3), true, 802480018));
                                            kd1Var.a(null, null, ks.x);
                                            List<RewardEntry> ledger = contributionStatus.getLedger();
                                            kd1Var.c(ledger.size(), new l3(5, new v1(6), ledger), new u3(ledger, 1), new p10(new c4(ledger), true, 802480018));
                                        }
                                    }
                                    return mf3.a;
                                }
                            };
                            ov0Var2.m0(lu0Var);
                            objQ10 = lu0Var;
                        }
                        ke0.d(dv1VarC, null, b52Var, joVar, null, null, false, null, (lu0) objQ10, ov0Var2, 24960, 490);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, (i3 & 896) | (i3 & 112) | 3072);
            final String str2 = (String) ey1Var5.getValue();
            if (str2 == null) {
                ov0Var.c0(-234340681);
            } else {
                ov0Var.c0(-234340680);
                Object objQ10 = ov0Var.Q();
                if (objQ10 == c30Var) {
                    objQ10 = new h2(ey1Var2, ey1Var5, z3 ? 1 : 0);
                    ov0Var.m0(objQ10);
                }
                a((au0) objQ10, sb.a0(160606608, new pu0() { // from class: i2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ey1 ey1Var7;
                        f30 f30Var2 = (f30) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        ov0 ov0Var2 = (ov0) f30Var2;
                        if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String str3 = str;
                            boolean zF3 = ov0Var2.f(str3);
                            CoroutineScope coroutineScope4 = coroutineScope3;
                            boolean zH = zF3 | ov0Var2.h(coroutineScope4);
                            AccountBenefitsRepository accountBenefitsRepository2 = accountBenefitsRepository;
                            boolean zH2 = zH | ov0Var2.h(accountBenefitsRepository2);
                            String str4 = str2;
                            boolean zF4 = zH2 | ov0Var2.f(str4);
                            Object objQ11 = ov0Var2.Q();
                            ey1 ey1Var8 = ey1Var2;
                            if (zF4 || objQ11 == d30.a) {
                                ey1Var7 = ey1Var8;
                                n2 n2Var = new n2(ey1Var4, ey1Var6, ey1Var, ey1Var5, ey1Var7, ey1Var3, accountBenefitsRepository2, str4, str3, coroutineScope4);
                                ov0Var2.m0(n2Var);
                                objQ11 = n2Var;
                            } else {
                                ey1Var7 = ey1Var8;
                            }
                            boolean z4 = !xq1.p(ey1Var7);
                            b52 b52Var = hu.a;
                            n51.j((au0) objQ11, null, z4, null, hu.f(bk.g, ov0Var2), null, ks.y, ov0Var2, 805306368, 490);
                        } else {
                            ov0Var2.W();
                        }
                        return mf3.a;
                    }
                }, ov0Var), null, sb.a0(1051681230, new j2(z3 ? 1 : 0, ey1Var5, ey1Var2), ov0Var), ks.A, sb.a0(-1906674133, new j2(str2, ey1Var3, i4), ov0Var), null, jD, 0L, 0L, 0L, null, ov0Var, 1772598, 16020);
                ov0Var = ov0Var;
                z3 = false;
            }
            ov0Var.p(z3);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new k2(cloudAccountState, z2, au0Var, au0Var2, i2, 0);
        }
    }

    public static final boolean p(ey1 ey1Var) {
        return ((Boolean) ey1Var.getValue()).booleanValue();
    }

    public static final void q(String str, CoroutineScope coroutineScope, ey1 ey1Var, ey1 ey1Var2, AccountBenefitsRepository accountBenefitsRepository, pu0 pu0Var) {
        if (str == null || p(ey1Var)) {
            return;
        }
        ey1Var.setValue(Boolean.TRUE);
        ey1Var2.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new z3(pu0Var, str, accountBenefitsRepository, ey1Var2, ey1Var, null, 1), 3, null);
    }

    public static final void r(ul1 ul1Var, AppState appState, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        ul1 ul1Var2;
        AppState appState2;
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1417720093);
        int i3 = i2 | (ov0Var.h(ul1Var) ? 4 : 2) | (ov0Var.h(appState) ? 32 : 16) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i2 & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            g(false, au0Var, ov0Var, (i3 >> 6) & 112, 1);
            fn0 fn0Var = iw2.c;
            long j2 = z2 ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j2, iy0Var);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarU = ji2.U(fn0Var);
            ho hoVar = am1.g;
            nr nrVar = j9.r;
            yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarU);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 16.0f, 10.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            dv1 dv1VarK2 = iw2.k(av1Var, 44.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarA = bk.a(ji2.w(xp1.k(xp1.n(hd0.O(dv1VarK2, 6.0f, bj2Var, 0L, 0L, 24), bj2Var), z2 ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, z2 ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), bj2Var), au0Var);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iHashCode4 = Long.hashCode(ov0Var.T);
            l72 l72VarL4 = ov0Var.l();
            dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarA);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH4);
            t01.a(n51.u(), ke0.N(2131624056, ov0Var), iw2.k(av1Var, 21.0f), z2 ? hz.c : xp1.d(4279901472L), ov0Var, 384, 0);
            az2.t(ov0Var, true, av1Var, 14.0f, ov0Var);
            yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var, 0);
            int iHashCode5 = Long.hashCode(ov0Var.T);
            l72 l72VarL5 = ov0Var.l();
            dv1 dv1VarH5 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA2);
            q73.h(ov0Var, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH5);
            String strN = ke0.N(2131624890, ov0Var);
            long jC = v63.c(18);
            jr0 jr0Var = jr0.j;
            hh0 hh0Var = mz.a;
            s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).o, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
            s83.b(ke0.N(2131624885, ov0Var), null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
            ov0Var.p(true);
            ov0Var.p(true);
            dv1 dv1VarE2 = iw2.e(new wb1(1.0f, true), 1.0f);
            int i4 = 0;
            er1 er1VarC3 = ws.c(prVar, false);
            int iHashCode6 = Long.hashCode(ov0Var.T);
            l72 l72VarL6 = ov0Var.l();
            dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarE2);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC3);
            q73.h(ov0Var, ghVar2, l72VarL6);
            az2.s(iHashCode6, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH6);
            dv1 dv1VarE3 = zm3.E(zm3.P(fn0Var, zm3.O(ov0Var), true), 16.0f, 8.0f);
            yz yzVarA3 = wz.a(new jo(14.0f, true, new fo(i4)), nrVar, ov0Var, 6);
            int iHashCode7 = Long.hashCode(ov0Var.T);
            l72 l72VarL7 = ov0Var.l();
            dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarE3);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA3);
            q73.h(ov0Var, ghVar2, l72VarL7);
            az2.s(iHashCode7, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH7);
            ul1Var2 = ul1Var;
            appState2 = appState;
            zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(-1229876980, new pi2(z2, appState2, ul1Var2), ov0Var), ov0Var, 25014, 8);
            ov0Var = ov0Var;
            gh0.h(ov0Var, iw2.g(av1Var, 16.0f));
            ov0Var.p(true);
            ws.a(xp1.j(k22.k(iw2.g(iw2.e(av1Var, 1.0f), 18.0f), j9.g), u92.p(am1.G(new hz(z2 ? bk.a : bk.d), new hz(hz.c(0.85f, z2 ? bk.a : bk.d)), new hz(hz.c(0.4f, z2 ? bk.a : bk.d)), new hz(hz.f)))), ov0Var, 0);
            ov0Var.p(true);
            ov0Var.p(true);
            ov0Var.p(true);
            RootSetupTestResult rootSetupTestResult = appState2.getRootSetupTestResult();
            c30 c30Var = d30.a;
            if (rootSetupTestResult != null) {
                ov0Var.c0(1423050442);
                boolean zH = ov0Var.h(ul1Var2);
                Object objQ = ov0Var.Q();
                if (zH || objQ == c30Var) {
                    objQ = new m6(ul1Var2, 7);
                    ov0Var.m0(objQ);
                }
                gh0.f(rootSetupTestResult, z2, (au0) objQ, ov0Var, (i3 >> 3) & 112);
            } else {
                ov0Var.c0(1406893087);
            }
            ov0Var.p(false);
            List<AppInfoItem> hookedAppsToRestart = appState2.getHookedAppsToRestart();
            if (hookedAppsToRestart != null) {
                ov0Var.c0(1423325381);
                boolean zH2 = ov0Var.h(ul1Var2);
                Object objQ2 = ov0Var.Q();
                if (zH2 || objQ2 == c30Var) {
                    objQ2 = new m6(ul1Var2, 8);
                    ov0Var.m0(objQ2);
                }
                au0 au0Var2 = (au0) objQ2;
                boolean zH3 = ov0Var.h(ul1Var2) | ov0Var.h(context);
                Object objQ3 = ov0Var.Q();
                if (zH3 || objQ3 == c30Var) {
                    objQ3 = new qi2(i4, ul1Var2, context);
                    ov0Var.m0(objQ3);
                }
                gh0.e(hookedAppsToRestart, z2, au0Var2, (au0) objQ3, ov0Var, (i3 >> 3) & 112);
            } else {
                ov0Var.c0(1406893087);
            }
            ov0Var.p(false);
        } else {
            ul1Var2 = ul1Var;
            appState2 = appState;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ea1(ul1Var2, appState2, z2, au0Var, i2, 1);
        }
    }

    public static final void s(AppInfoItem appInfoItem, boolean z2, boolean z3, lu0 lu0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(36313738);
        int i3 = (ov0Var.h(appInfoItem) ? 4 : 2) | i2 | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.g(z3) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objQ = ov0Var.Q();
            if (z4 || objQ == d30.a) {
                objQ = new xw(lu0Var, z2, 1);
                ov0Var.m0(objQ);
            }
            zm3.b(bk.a(dv1VarE, (au0) objQ), 16.0f, new b52(14.0f, 12.0f, 14.0f, 12.0f), sb.a0(1647945529, new ym(z3, z2, lu0Var, appInfoItem), ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new q6(appInfoItem, z2, z3, lu0Var, i2);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ov0, new type: ov0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    public static final void t(final ul1 ul1Var, final AppState appState, au0 au0Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        Object mVar;
        yd1 yd1Var;
        char c2;
        boolean zIsSystem;
        Object obj;
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-996624122);
        int i3 = i2 | (ov0Var2.h(ul1Var) ? 4 : 2) | (ov0Var2.h(appState) ? 32 : 16) | (ov0Var2.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        boolean z2 = true;
        if (ov0Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objQ = ov0Var2.Q();
            Object obj2 = d30.a;
            if (objQ == obj2) {
                objQ = new oi1(27);
                ov0Var2.m0(objQ);
            }
            final ey1 ey1Var = (ey1) wc0.c0(objArr, (au0) objQ, ov0Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == obj2) {
                objQ2 = new oi1(28);
                ov0Var2.m0(objQ2);
            }
            final ey1 ey1Var2 = (ey1) wc0.c0(objArr2, (au0) objQ2, ov0Var2, 48);
            final boolean zW = n51.w(ov0Var2);
            yd1 yd1VarA = ae1.a(ov0Var2);
            WeakHashMap weakHashMap = ul3.w;
            kh khVar = q73.b(ov0Var2).c;
            boolean z3 = khVar.e().d > 0;
            boolean zF = ov0Var2.f(ey1Var) | ov0Var2.f(ey1Var2) | ov0Var2.f(yd1VarA);
            Object objQ3 = ov0Var2.Q();
            q60 q60Var = null;
            if (zF || objQ3 == obj2) {
                mVar = new m(ey1Var, ey1Var2, yd1VarA, q60Var, 27);
                yd1Var = yd1VarA;
                ov0Var2.m0(mVar);
            } else {
                mVar = objQ3;
                yd1Var = yd1VarA;
            }
            mf3 mf3Var = mf3.a;
            oi0.e(ov0Var2, (pu0) mVar, mf3Var);
            g(false, au0Var, ov0Var2, (i3 >> 3) & 112, 1);
            boolean zH = ov0Var2.h(ul1Var);
            Object objQ4 = ov0Var2.Q();
            if (zH || objQ4 == obj2) {
                objQ4 = new im1(ul1Var, q60Var, 6);
                ov0Var2.m0(objQ4);
            }
            oi0.e(ov0Var2, (pu0) objQ4, mf3Var);
            boolean zF2 = ov0Var2.f(appState.getInstalledAppsForSystemHook()) | ov0Var2.f((String) ey1Var.getValue()) | ov0Var2.d(((o43) ey1Var2.getValue()).ordinal()) | ov0Var2.f(appState.getSystemHookPackages());
            Object objQ5 = ov0Var2.Q();
            Object obj3 = objQ5;
            if (zF2 || objQ5 == obj2) {
                List<AppInfoItem> installedAppsForSystemHook = appState.getInstalledAppsForSystemHook();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : installedAppsForSystemHook) {
                    AppInfoItem appInfoItem = (AppInfoItem) obj4;
                    if (l13.k0((String) ey1Var.getValue()) || l13.c0(appInfoItem.getAppName(), (String) ey1Var.getValue(), z2) || l13.c0(appInfoItem.getPackageName(), (String) ey1Var.getValue(), z2)) {
                        boolean zContains = appState.getSystemHookPackages().contains(appInfoItem.getPackageName());
                        int iOrdinal = ((o43) ey1Var2.getValue()).ordinal();
                        if (iOrdinal == 0) {
                            c2 = 3;
                        } else if (iOrdinal == z2) {
                            c2 = 3;
                            zIsSystem = zContains;
                        } else if (iOrdinal == 2) {
                            c2 = 3;
                            if (appInfoItem.isSystem()) {
                                zIsSystem = false;
                            }
                        } else if (iOrdinal != 3) {
                            b81.d();
                            return;
                        } else {
                            zIsSystem = appInfoItem.isSystem();
                            c2 = 3;
                        }
                        zIsSystem = true;
                    } else {
                        zIsSystem = false;
                        c2 = 3;
                    }
                    if (zIsSystem) {
                        arrayList.add(obj4);
                    }
                    z2 = true;
                }
                ov0Var2.m0(arrayList);
                obj3 = arrayList;
            }
            final List list = (List) obj3;
            fn0 fn0Var = iw2.c;
            long j2 = zW ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j2, iy0Var);
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var2, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var2, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var2, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH);
            dv1 dv1VarU = ji2.U(fn0Var);
            ho hoVar = am1.g;
            nr nrVar = j9.r;
            final boolean z4 = z3;
            yz yzVarA = wz.a(hoVar, nrVar, ov0Var2, 0);
            int iHashCode2 = Long.hashCode(ov0Var2.T);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarU);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, yzVarA);
            q73.h(ov0Var2, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH2);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 16.0f, 10.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
            int iHashCode3 = Long.hashCode(ov0Var2.T);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarE);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, kk2VarA);
            q73.h(ov0Var2, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH3);
            dv1 dv1VarK2 = iw2.k(av1Var, 44.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarA = bk.a(ji2.w(xp1.k(xp1.n(hd0.O(dv1VarK2, 6.0f, bj2Var, 0L, 0L, 24), bj2Var), zW ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, zW ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), bj2Var), au0Var);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iHashCode4 = Long.hashCode(ov0Var2.T);
            l72 l72VarL4 = ov0Var2.l();
            dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarA);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, er1VarC2);
            q73.h(ov0Var2, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH4);
            t01.a(n51.u(), ke0.N(2131624056, ov0Var2), iw2.k(av1Var, 21.0f), zW ? hz.c : xp1.d(4279901472L), ov0Var2, 384, 0);
            az2.t(ov0Var2, true, av1Var, 14.0f, ov0Var2);
            yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var2, 0);
            int iHashCode5 = Long.hashCode(ov0Var2.T);
            l72 l72VarL5 = ov0Var2.l();
            dv1 dv1VarH5 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, yzVarA2);
            q73.h(ov0Var2, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH5);
            String strN = ke0.N(2131625091, ov0Var2);
            long jC = v63.c(18);
            jr0 jr0Var = jr0.j;
            hh0 hh0Var = mz.a;
            s83.b(strN, null, ((kz) ov0Var2.j(hh0Var)).o, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
            s83.b(ke0.N(2131625090, ov0Var2), null, hz.c(0.5f, ((kz) ov0Var2.j(hh0Var)).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
            ov0Var2.p(true);
            ov0Var2.p(true);
            dv1 dv1VarJ = ji2.J(ji2.H(iw2.e(new wb1(1.0f, true), 1.0f)));
            b52 b52Var = new b52(16.0f, 4.0f, 16.0f, 24.0f);
            jo joVar = new jo(8.0f, true, new fo(0));
            boolean zH2 = ov0Var2.h(appState) | ov0Var2.g(zW) | ov0Var2.h(ul1Var) | ov0Var2.f(ey1Var) | ov0Var2.f(ey1Var2) | ov0Var2.g(z4) | ov0Var2.h(list);
            Object objQ6 = ov0Var2.Q();
            if (zH2 || objQ6 == obj2) {
                obj = new lu0() { // from class: m43
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj5) {
                        kd1 kd1Var = (kd1) obj5;
                        kd1Var.getClass();
                        final AppState appState2 = appState;
                        final boolean z5 = zW;
                        final ul1 ul1Var2 = ul1Var;
                        kd1Var.a("global_mode", "header", new p10(new pi2(appState2, z5, ul1Var2, 2), true, -717283627));
                        final ey1 ey1Var3 = ey1Var2;
                        final boolean z6 = z4;
                        final ey1 ey1Var4 = ey1Var;
                        final p10 p10Var = new p10(new ru0() { // from class: n43
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v16 */
                            /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r14v33 */
                            /* JADX WARN: Type inference failed for: r8v12 */
                            /* JADX WARN: Type inference failed for: r8v13, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r8v41 */
                            @Override // defpackage.ru0
                            public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                float f2;
                                long jC2;
                                gh ghVar5;
                                ?? r8;
                                ?? r14;
                                boolean z7;
                                boolean z8;
                                ov0 ov0Var3;
                                ov0 ov0Var4;
                                ((Integer) obj7).getClass();
                                f30 f30Var2 = (f30) obj8;
                                int iIntValue = ((Integer) obj9).intValue();
                                ((bc1) obj6).getClass();
                                ov0 ov0Var5 = (ov0) f30Var2;
                                if (ov0Var5.T(iIntValue & 1, (iIntValue & 129) != 128)) {
                                    av1 av1Var2 = av1.a;
                                    dv1 dv1VarE2 = iw2.e(av1Var2, 1.0f);
                                    boolean z9 = z5;
                                    long j3 = z9 ? bk.a : bk.d;
                                    iy0 iy0Var2 = o51.p0;
                                    dv1 dv1VarK3 = xp1.k(dv1VarE2, j3, iy0Var2);
                                    yz yzVarA3 = wz.a(am1.g, j9.r, ov0Var5, 0);
                                    int iHashCode6 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL6 = ov0Var5.l();
                                    dv1 dv1VarH6 = xp1.H(ov0Var5, dv1VarK3);
                                    w20.b.getClass();
                                    au0 au0Var2 = v20.b;
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(au0Var2);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    gh ghVar6 = v20.e;
                                    q73.h(ov0Var5, ghVar6, yzVarA3);
                                    gh ghVar7 = v20.d;
                                    q73.h(ov0Var5, ghVar7, l72VarL6);
                                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                                    gh ghVar8 = v20.f;
                                    q73.h(ov0Var5, ghVar8, numValueOf2);
                                    wa waVar2 = v20.g;
                                    q73.g(ov0Var5, waVar2);
                                    gh ghVar9 = v20.c;
                                    q73.h(ov0Var5, ghVar9, dv1VarH6);
                                    dv1 dv1VarF = zm3.F(iw2.e(av1Var2, 1.0f), 0.0f, 4.0f, 1);
                                    er1 er1VarC3 = ws.c(j9.f, false);
                                    int iHashCode7 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL7 = ov0Var5.l();
                                    dv1 dv1VarH7 = xp1.H(ov0Var5, dv1VarF);
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(au0Var2);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    q73.h(ov0Var5, ghVar6, er1VarC3);
                                    q73.h(ov0Var5, ghVar7, l72VarL7);
                                    az2.s(iHashCode7, ov0Var5, ghVar8, ov0Var5, waVar2);
                                    q73.h(ov0Var5, ghVar9, dv1VarH7);
                                    dv1 dv1VarK4 = xp1.k(xp1.n(iw2.g(iw2.e(av1Var2, 1.0f), 44.0f), cj2.a(14.0f)), z9 ? xp1.d(4280428334L) : hz.c, iy0Var2);
                                    if (z9) {
                                        jC2 = hz.c(0.1f, hz.c);
                                        f2 = 14.0f;
                                    } else {
                                        f2 = 14.0f;
                                        jC2 = hz.c(0.05f, hz.b);
                                    }
                                    dv1 dv1VarF2 = zm3.F(ji2.w(dv1VarK4, 0.8f, jC2, cj2.a(f2)), f2, 0.0f, 2);
                                    or orVar = j9.p;
                                    kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var5, 48);
                                    int iHashCode8 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL8 = ov0Var5.l();
                                    dv1 dv1VarH8 = xp1.H(ov0Var5, dv1VarF2);
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(au0Var2);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    q73.h(ov0Var5, ghVar6, kk2VarA2);
                                    q73.h(ov0Var5, ghVar7, l72VarL8);
                                    az2.s(iHashCode8, ov0Var5, ghVar8, ov0Var5, waVar2);
                                    q73.h(ov0Var5, ghVar9, dv1VarH8);
                                    t01.a(dh0.s(), null, iw2.k(av1Var2, 18.0f), bk.g, ov0Var5, 3504, 0);
                                    gh0.h(ov0Var5, iw2.o(av1Var2, 10.0f));
                                    ey1 ey1Var5 = ey1Var4;
                                    String str = (String) ey1Var5.getValue();
                                    long jB = v63.b(13.5d);
                                    cd2 cd2Var = mz.a;
                                    q93 q93Var = new q93(((kz) ov0Var5.j(cd2Var)).q, jB, jr0.h, 0L, 0L, 0, 0L, 16777208);
                                    wb1 wb1Var = new wb1(1.0f, true);
                                    boolean zF3 = ov0Var5.f(ey1Var5);
                                    Object objQ7 = ov0Var5.Q();
                                    Object obj10 = d30.a;
                                    if (zF3 || objQ7 == obj10) {
                                        objQ7 = new vu1(ey1Var5, 19);
                                        ov0Var5.m0(objQ7);
                                    }
                                    xq.a(str, (lu0) objQ7, wb1Var, false, q93Var, null, null, true, 0, 0, null, null, null, null, sb.a0(1583059046, new h5(ey1Var5, 13), ov0Var5), ov0Var5, 100663296, 196608, 32472);
                                    if (((String) ey1Var5.getValue()).length() > 0) {
                                        ov0Var5.c0(573389976);
                                        dv1 dv1VarK5 = xp1.k(xp1.n(iw2.k(av1Var2, 20.0f), cj2.a), hz.c(0.1f, ((kz) ov0Var5.j(cd2Var)).q), iy0Var2);
                                        boolean zF4 = ov0Var5.f(ey1Var5);
                                        Object objQ8 = ov0Var5.Q();
                                        if (zF4 || objQ8 == obj10) {
                                            objQ8 = new xj2(ey1Var5, 18);
                                            ov0Var5.m0(objQ8);
                                        }
                                        dv1 dv1VarA2 = bk.a(dv1VarK5, (au0) objQ8);
                                        er1 er1VarC4 = ws.c(j9.j, false);
                                        int iHashCode9 = Long.hashCode(ov0Var5.T);
                                        l72 l72VarL9 = ov0Var5.l();
                                        dv1 dv1VarH9 = xp1.H(ov0Var5, dv1VarA2);
                                        ov0Var5.g0();
                                        if (ov0Var5.S) {
                                            ov0Var5.k(au0Var2);
                                        } else {
                                            ov0Var5.p0();
                                        }
                                        q73.h(ov0Var5, ghVar6, er1VarC4);
                                        q73.h(ov0Var5, ghVar7, l72VarL9);
                                        ghVar5 = ghVar8;
                                        az2.s(iHashCode9, ov0Var5, ghVar5, ov0Var5, waVar2);
                                        q73.h(ov0Var5, ghVar9, dv1VarH9);
                                        t01.a(k22.u(), null, iw2.k(av1Var2, 12.0f), hz.c(0.6f, ((kz) ov0Var5.j(cd2Var)).q), ov0Var5, 432, 0);
                                        r14 = 1;
                                        ov0Var5.p(true);
                                        r8 = 0;
                                    } else {
                                        ghVar5 = ghVar8;
                                        r8 = 0;
                                        r14 = 1;
                                        ov0Var5.c0(556924729);
                                    }
                                    ov0Var5.p(r8);
                                    ov0Var5.p(r14);
                                    ov0Var5.p(r14);
                                    dv1 dv1VarF3 = zm3.F(iw2.e(av1Var2, 1.0f), 0.0f, 8.0f, r14);
                                    b52 b52Var2 = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                                    jo joVar2 = new jo(8.0f, r14, new fo(r8));
                                    ey1 ey1Var6 = ey1Var3;
                                    boolean zF5 = ov0Var5.f(ey1Var6);
                                    AppState appState3 = appState2;
                                    boolean zH3 = zF5 | ov0Var5.h(appState3) | ov0Var5.g(z9);
                                    Object objQ9 = ov0Var5.Q();
                                    if (zH3 || objQ9 == obj10) {
                                        objQ9 = new d43(appState3, z9, ey1Var6);
                                        ov0Var5.m0(objQ9);
                                    }
                                    gh ghVar10 = ghVar5;
                                    ke0.e(dv1VarF3, null, b52Var2, joVar2, null, null, false, null, (lu0) objQ9, ov0Var5, 24966);
                                    ov0 ov0Var6 = ov0Var5;
                                    if (z6) {
                                        z7 = false;
                                        z8 = true;
                                        ov0Var6.c0(895438339);
                                        ov0Var3 = ov0Var6;
                                    } else {
                                        ov0Var6.c0(-663219677);
                                        dv1 dv1VarF4 = zm3.F(iw2.e(av1Var2, 1.0f), 0.0f, 2.0f, 1);
                                        kk2 kk2VarA3 = jk2.a(am1.i, orVar, ov0Var6, 54);
                                        int iHashCode10 = Long.hashCode(ov0Var6.T);
                                        l72 l72VarL10 = ov0Var6.l();
                                        dv1 dv1VarH10 = xp1.H(ov0Var6, dv1VarF4);
                                        ov0Var6.g0();
                                        if (ov0Var6.S) {
                                            ov0Var6.k(au0Var2);
                                        } else {
                                            ov0Var6.p0();
                                        }
                                        q73.h(ov0Var6, ghVar6, kk2VarA3);
                                        q73.h(ov0Var6, ghVar7, l72VarL10);
                                        az2.s(iHashCode10, ov0Var6, ghVar10, ov0Var6, r30);
                                        q73.h(ov0Var6, ghVar9, dv1VarH10);
                                        s83.b(ke0.O(2131624973, new Object[]{Integer.valueOf(appState3.getSystemHookPackages().size())}, ov0Var6), null, hz.c(0.55f, ((kz) ov0Var6.j(cd2Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                                        kk2 kk2VarA4 = jk2.a(new jo(4.0f, true, new fo(0)), j9.o, ov0Var6, 6);
                                        int iHashCode11 = Long.hashCode(ov0Var6.T);
                                        l72 l72VarL11 = ov0Var6.l();
                                        dv1 dv1VarH11 = xp1.H(ov0Var6, av1Var2);
                                        ov0Var6.g0();
                                        if (ov0Var6.S) {
                                            ov0Var6.k(au0Var2);
                                        } else {
                                            ov0Var6.p0();
                                        }
                                        q73.h(ov0Var6, ghVar6, kk2VarA4);
                                        q73.h(ov0Var6, ghVar7, l72VarL11);
                                        az2.s(iHashCode11, ov0Var6, ghVar10, ov0Var6, waVar2);
                                        q73.h(ov0Var6, ghVar9, dv1VarH11);
                                        ul1 ul1Var3 = ul1Var2;
                                        boolean zH4 = ov0Var6.h(ul1Var3);
                                        Object objQ10 = ov0Var6.Q();
                                        if (zH4 || objQ10 == obj10) {
                                            objQ10 = new m6(ul1Var3, 19);
                                            ov0Var6.m0(objQ10);
                                        }
                                        n51.j((au0) objQ10, null, false, null, null, new b52(8.0f, 2.0f, 8.0f, 2.0f), o51.e0, ov0Var6, 817889280, 382);
                                        ov0 ov0Var7 = ov0Var6;
                                        if (appState3.getSystemHookPackages().isEmpty()) {
                                            z7 = false;
                                            ov0Var7.c0(-937988288);
                                            ov0Var4 = ov0Var7;
                                        } else {
                                            ov0Var7.c0(-917012262);
                                            boolean zH5 = ov0Var7.h(ul1Var3);
                                            Object objQ11 = ov0Var7.Q();
                                            if (zH5 || objQ11 == obj10) {
                                                objQ11 = new m6(ul1Var3, 20);
                                                ov0Var7.m0(objQ11);
                                            }
                                            n51.j((au0) objQ11, null, false, null, null, new b52(8.0f, 2.0f, 8.0f, 2.0f), o51.f0, ov0Var7, 817889280, 382);
                                            ov0Var4 = ov0Var7;
                                            z7 = false;
                                        }
                                        ov0Var4.p(z7);
                                        z8 = true;
                                        ov0Var4.p(true);
                                        ov0Var4.p(true);
                                        ov0Var3 = ov0Var4;
                                    }
                                    ov0Var3.p(z7);
                                    ov0Var3.p(z8);
                                } else {
                                    ov0Var5.W();
                                }
                                return mf3.a;
                            }
                        }, true, 1984445001);
                        q01 q01Var = kd1Var.a;
                        fx1 fx1Var = kd1Var.b;
                        if (fx1Var == null) {
                            fx1Var = new fx1();
                            kd1Var.b = fx1Var;
                        }
                        fx1Var.a(q01Var.b);
                        final int i4 = q01Var.b;
                        kd1Var.a("search_filters", null, new p10(new qu0() { // from class: jd1
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                bc1 bc1Var = (bc1) obj6;
                                f30 f30Var2 = (f30) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((ov0) f30Var2).f(bc1Var) ? 4 : 2;
                                }
                                ov0 ov0Var3 = (ov0) f30Var2;
                                if (ov0Var3.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    p10Var.invoke(bc1Var, Integer.valueOf(i4), ov0Var3, Integer.valueOf(iIntValue & 14));
                                } else {
                                    ov0Var3.W();
                                }
                                return mf3.a;
                            }
                        }, true, -1588696110));
                        if (appState2.isLoadingInstalledApps() && appState2.getInstalledAppsForSystemHook().isEmpty()) {
                            kd1Var.a("loading", "status", o51.g0);
                        } else {
                            List list2 = list;
                            if (list2.isEmpty()) {
                                kd1Var.a("empty", "status", o51.h0);
                            } else {
                                kd1Var.c(list2.size(), new l3(21, new ym2(26), list2), new l3(22, new ym2(27), list2), new p10(new en(list2, appState2, z5, ul1Var2, 2), true, 802480018));
                            }
                        }
                        return mf3.a;
                    }
                };
                ov0Var2.m0(obj);
            } else {
                obj = objQ6;
            }
            ke0.d(dv1VarJ, yd1Var, b52Var, joVar, null, null, false, null, (lu0) obj, ov0Var2, 24576, 488);
            ov0 ov0Var3 = ov0Var2;
            ov0Var3.p(r10);
            ov0Var3.p(true);
            ov0Var = ov0Var3;
        } else {
            ov0Var2.W();
            ov0Var = ov0Var2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xm(ul1Var, appState, au0Var, i2, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x003f A[RETURN] */
    public static final String u(String str) {
        switch (str) {
            case "collection":
                return "采集路线";
            case "route":
                return "路线";
            case "favorite":
                return "收藏";
            case "location":
                return "采集点位";
            case "setting":
                return "设置";
            default:
                return str;
        }
    }

    public static final String v(long j2) {
        return DateFormat.getDateTimeInstance(3, 3).format(new Date(j2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    public static final String w(String str, f30 f30Var) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        if (str == null) {
            ov0Var.c0(-1849122474);
            ov0Var.p(false);
            return null;
        }
        ov0Var.c0(-1849122473);
        switch (str) {
            case "archive_not_found":
                i2 = 2131624038;
                break;
            case "reward_points_insufficient":
                i2 = 2131624873;
                break;
            case "reward_monthly_limit":
                i2 = 2131624874;
                break;
            case "sync_revision_conflict":
                i2 = 2131624036;
                break;
            case "registered_account_required":
                i2 = 2131624042;
                break;
            default:
                i2 = 2131624062;
                break;
        }
        String strN = ke0.N(i2, ov0Var);
        ov0Var.p(false);
        return strN;
    }

    public static final int x(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int y(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final gu z(ov0 ov0Var) {
        b52 b52Var = hu.a;
        return hu.a(bk.g, hz.c, 0L, 0L, ov0Var, 12);
    }
}
