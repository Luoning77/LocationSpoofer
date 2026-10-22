package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fw0 extends lb0 implements hg0 {
    public final /* synthetic */ int u = 1;
    public final rc v;
    public final qh0 w;
    public Object x;

    public fw0(q33 q33Var, rc rcVar, qh0 qh0Var, b52 b52Var) {
        this.v = rcVar;
        this.w = qh0Var;
        this.x = b52Var;
        m1(q33Var);
    }

    public static boolean p1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean q1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        boolean zQ1;
        long j;
        char c;
        boolean z;
        boolean zP1;
        int i = this.u;
        rc rcVar = this.v;
        qh0 qh0Var = this.w;
        switch (i) {
            case 0:
                b52 b52Var = (b52) this.x;
                xv xvVar = jb1Var.e;
                rcVar.l(xvVar.a());
                if (cw2.c(xvVar.a())) {
                    jb1Var.c();
                    return;
                }
                jb1Var.c();
                rcVar.d.getValue();
                Canvas canvasA = ha.a(xvVar.f.i());
                if (qh0.f(qh0Var.f)) {
                    zQ1 = q1(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(jb1Var.R(b52Var.a(jb1Var.getLayoutDirection())))) & 4294967295L), qh0Var.c(), canvasA);
                } else {
                    zQ1 = false;
                }
                if (qh0.f(qh0Var.d)) {
                    EdgeEffect edgeEffectE = qh0Var.e();
                    zQ1 = q1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(jb1Var.R(b52Var.b))) & 4294967295L), edgeEffectE, canvasA) || zQ1;
                }
                if (qh0.f(qh0Var.g)) {
                    EdgeEffect edgeEffectD = qh0Var.d();
                    zQ1 = q1(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(jb1Var.R(b52Var.b(jb1Var.getLayoutDirection())) + (-((float) xq1.P(Float.intBitsToFloat((int) (xvVar.a() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zQ1;
                }
                if (qh0.f(qh0Var.e)) {
                    EdgeEffect edgeEffectB = qh0Var.b();
                    float fR = jb1Var.R(b52Var.d);
                    zQ1 = q1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (xvVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (xvVar.a() & 4294967295L))) + fR)) & 4294967295L), edgeEffectB, canvasA) || zQ1;
                }
                if (zQ1) {
                    rcVar.g();
                    return;
                }
                return;
            default:
                xv xvVar2 = jb1Var.e;
                rcVar.l(xvVar2.a());
                Canvas canvasA2 = ha.a(xvVar2.f.i());
                rcVar.d.getValue();
                if (cw2.c(xvVar2.a())) {
                    jb1Var.c();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = qh0Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = qh0Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = qh0Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = qh0Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = qh0Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = qh0Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = qh0Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = qh0Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    jb1Var.c();
                    return;
                }
                float fR2 = jb1Var.R(30.0f);
                boolean z2 = qh0.f(qh0Var.d) || qh0.g(qh0Var.h) || qh0.f(qh0Var.e) || qh0.g(qh0Var.i);
                boolean z3 = qh0.f(qh0Var.f) || qh0.g(qh0Var.j) || qh0.f(qh0Var.g) || qh0.g(qh0Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    r1().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        r1().setPosition(0, 0, (xq1.P(fR2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            jb1Var.c();
                            return;
                        }
                        r1().setPosition(0, 0, canvasA2.getWidth(), (xq1.P(fR2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = r1().beginRecording();
                boolean zG = qh0.g(qh0Var.j);
                x32 x32Var = x32.f;
                if (zG) {
                    EdgeEffect edgeEffectA = qh0Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = qh0Var.a(x32Var);
                        qh0Var.j = edgeEffectA;
                    }
                    p1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (qh0.f(qh0Var.f)) {
                    EdgeEffect edgeEffectC = qh0Var.c();
                    zP1 = p1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (qh0.g(qh0Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (rcVar.f() & j));
                        EdgeEffect edgeEffectA2 = qh0Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = qh0Var.a(x32Var);
                            qh0Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fD = i2 >= 31 ? vb.d(edgeEffectC) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            vb.g(edgeEffectA2, fD, f);
                        } else {
                            edgeEffectA2.onPull(fD, f);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zP1 = false;
                }
                boolean zG2 = qh0.g(qh0Var.h);
                x32 x32Var2 = x32.e;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = qh0Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = qh0Var.a(x32Var2);
                        qh0Var.h = edgeEffectA3;
                    }
                    p1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (qh0.f(qh0Var.d)) {
                    EdgeEffect edgeEffectE2 = qh0Var.e();
                    zP1 = p1(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zP1;
                    if (qh0.g(qh0Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rcVar.f() >> c));
                        EdgeEffect edgeEffectA4 = qh0Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = qh0Var.a(x32Var2);
                            qh0Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fD2 = i3 >= 31 ? vb.d(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            vb.g(edgeEffectA4, fD2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fD2, fIntBitsToFloat2);
                        }
                    }
                }
                if (qh0.g(qh0Var.k)) {
                    EdgeEffect edgeEffectA5 = qh0Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = qh0Var.a(x32Var);
                        qh0Var.k = edgeEffectA5;
                    }
                    p1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (qh0.f(qh0Var.g)) {
                    EdgeEffect edgeEffectD2 = qh0Var.d();
                    zP1 = p1(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zP1;
                    if (qh0.g(qh0Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (rcVar.f() & j));
                        EdgeEffect edgeEffectA6 = qh0Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = qh0Var.a(x32Var);
                            qh0Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fD3 = i4 >= 31 ? vb.d(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            vb.g(edgeEffectA6, fD3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fD3, fIntBitsToFloat3);
                        }
                    }
                }
                if (qh0.g(qh0Var.i)) {
                    EdgeEffect edgeEffectA7 = qh0Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = qh0Var.a(x32Var2);
                        qh0Var.i = edgeEffectA7;
                    }
                    p1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (qh0.f(qh0Var.e)) {
                    EdgeEffect edgeEffectB2 = qh0Var.b();
                    boolean z4 = p1(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zP1;
                    if (qh0.g(qh0Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (rcVar.f() >> c));
                        EdgeEffect edgeEffectA8 = qh0Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = qh0Var.a(x32Var2);
                            qh0Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fD4 = i5 >= 31 ? vb.d(edgeEffectB2) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            vb.g(edgeEffectA8, fD4, f2);
                        } else {
                            edgeEffectA8.onPull(fD4, f2);
                        }
                    }
                    zP1 = z4;
                }
                if (zP1) {
                    rcVar.g();
                }
                float f3 = z ? 0.0f : fR2;
                float f4 = z2 ? 0.0f : fR2;
                qa1 layoutDirection = jb1Var.getLayoutDirection();
                ga gaVar = new ga();
                gaVar.a = recordingCanvasBeginRecording;
                long jA = xvVar2.a();
                xb0 xb0VarL = xvVar2.f.l();
                qa1 qa1VarQ = xvVar2.f.q();
                vv vvVarI = xvVar2.f.i();
                long jR = xvVar2.f.r();
                gn gnVar = xvVar2.f;
                kw0 kw0Var = (kw0) gnVar.b;
                gnVar.D(jb1Var);
                gnVar.E(layoutDirection);
                gnVar.C(gaVar);
                gnVar.F(jA);
                gnVar.b = null;
                gaVar.l();
                try {
                    ((t1) xvVar2.f.a).D(f3, f4);
                    try {
                        jb1Var.c();
                        float f5 = -f3;
                        float f6 = -f4;
                        ((t1) xvVar2.f.a).D(f5, f6);
                        gaVar.i();
                        gn gnVar2 = xvVar2.f;
                        gnVar2.D(xb0VarL);
                        gnVar2.E(qa1VarQ);
                        gnVar2.C(vvVarI);
                        gnVar2.F(jR);
                        gnVar2.b = kw0Var;
                        r1().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f5, f6);
                        canvasA2.drawRenderNode(r1());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((t1) xvVar2.f.a).D(-f3, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    gaVar.i();
                    gn gnVar3 = xvVar2.f;
                    gnVar3.D(xb0VarL);
                    gnVar3.E(qa1VarQ);
                    gnVar3.C(vvVarI);
                    gnVar3.F(jR);
                    gnVar3.b = kw0Var;
                    throw th2;
                }
        }
    }

    public RenderNode r1() {
        RenderNode renderNode = (RenderNode) this.x;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeC = za2.c();
        this.x = renderNodeC;
        return renderNodeC;
    }

    public fw0(q33 q33Var, rc rcVar, qh0 qh0Var) {
        this.v = rcVar;
        this.w = qh0Var;
        m1(q33Var);
    }
}
