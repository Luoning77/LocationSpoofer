package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ne2 implements InputConnection {
    public final t1 a;
    public final boolean b;
    public final me1 c;
    public final x73 d;
    public final aj3 e;
    public int f;
    public f83 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public ne2(f83 f83Var, t1 t1Var, boolean z, me1 me1Var, x73 x73Var, aj3 aj3Var) {
        this.a = t1Var;
        this.b = z;
        this.c = me1Var;
        this.d = x73Var;
        this.e = aj3Var;
        this.g = f83Var;
    }

    public final void a(ei0 ei0Var) {
        this.f++;
        try {
            this.j.add(ei0Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((ne1) this.a.f).c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((ne1) this.a.f).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (o51.f(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new h00(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new sb0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new tb0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new kn0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        f83 f83Var = this.g;
        return TextUtils.getCapsMode(f83Var.a.f, f93.f(f83Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ld0.N(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (f93.c(this.g.b)) {
            return null;
        }
        return g83.c(this.g).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return g83.d(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return g83.e(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new ot2(0, this.g.a.f.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case Logger.WARN /* 5 */:
                        i2 = 6;
                        break;
                    case Logger.ERROR /* 6 */:
                        i2 = 7;
                        break;
                    case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((ne1) this.a.f).d.invoke(new b11(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0268  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[PHI: r6
      0x001b: PHI (r6v38 int) = (r6v0 int), (r6v0 int), (r6v13 int) binds: [B:7:0x0019, B:16:0x0033, B:150:0x0352] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        long jH;
        int i;
        int i2;
        int i3;
        String string;
        y83 y83VarD;
        y83 y83VarD2;
        w83 w83Var;
        if (Build.VERSION.SDK_INT >= 34) {
            int iE = 1;
            ge2 ge2Var = new ge2(this, iE);
            me1 me1Var = this.c;
            final int i4 = 3;
            if (me1Var != null) {
                dj djVar = me1Var.j;
                if (djVar == null) {
                    iE = i4;
                } else {
                    y83 y83VarD3 = me1Var.d();
                    if (djVar.equals((y83VarD3 == null || (w83Var = y83VarD3.a.a) == null) ? null : w83Var.a)) {
                        boolean zQ = ud.q(handwritingGesture);
                        x73 x73Var = this.d;
                        if (zQ) {
                            SelectGesture selectGestureK = ud.k(handwritingGesture);
                            long jC = hd0.C(me1Var, vd0.J(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() == 1 ? 1 : 0);
                            if (f93.c(jC)) {
                                iE = wc0.E(hx0.m(selectGestureK), ge2Var);
                            } else {
                                ge2Var.invoke(new ot2((int) (jC >> 32), (int) (jC & 4294967295L)));
                                if (x73Var != null) {
                                    x73Var.e(true);
                                }
                            }
                        } else if (hx0.x(handwritingGesture)) {
                            DeleteGesture deleteGestureK = hx0.k(handwritingGesture);
                            int i5 = deleteGestureK.getGranularity() != 1 ? 0 : 1;
                            long jC2 = hd0.C(me1Var, vd0.J(deleteGestureK.getDeletionArea()), i5);
                            if (f93.c(jC2)) {
                                iE = wc0.E(hx0.m(deleteGestureK), ge2Var);
                            } else {
                                wc0.Y(jC2, djVar, i5 == 1, ge2Var);
                            }
                        } else if (hx0.y(handwritingGesture)) {
                            SelectRangeGesture selectRangeGestureP = hx0.p(handwritingGesture);
                            long jD = hd0.D(me1Var, vd0.J(selectRangeGestureP.getSelectionStartArea()), vd0.J(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() == 1 ? 1 : 0);
                            if (f93.c(jD)) {
                                iE = wc0.E(hx0.m(selectRangeGestureP), ge2Var);
                            } else {
                                ge2Var.invoke(new ot2((int) (jD >> 32), (int) (jD & 4294967295L)));
                                if (x73Var != null) {
                                    x73Var.e(true);
                                }
                            }
                        } else if (hx0.z(handwritingGesture)) {
                            DeleteRangeGesture deleteRangeGestureL = hx0.l(handwritingGesture);
                            int i6 = deleteRangeGestureL.getGranularity() != 1 ? 0 : 1;
                            long jD2 = hd0.D(me1Var, vd0.J(deleteRangeGestureL.getDeletionStartArea()), vd0.J(deleteRangeGestureL.getDeletionEndArea()), i6);
                            if (f93.c(jD2)) {
                                iE = wc0.E(hx0.m(deleteRangeGestureL), ge2Var);
                            } else {
                                wc0.Y(jD2, djVar, i6 == 1, ge2Var);
                            }
                        } else {
                            boolean zT = hx0.t(handwritingGesture);
                            aj3 aj3Var = this.e;
                            if (zT) {
                                JoinOrSplitGesture joinOrSplitGestureN = hx0.n(handwritingGesture);
                                if (aj3Var == null) {
                                    iE = wc0.E(hx0.w(joinOrSplitGestureN), ge2Var);
                                } else {
                                    int iA = hd0.A(me1Var, hd0.Q(joinOrSplitGestureN.getJoinOrSplitPoint()), aj3Var);
                                    if (iA == -1 || ((y83VarD2 = me1Var.d()) != null && hd0.H(y83VarD2.a, iA))) {
                                        iE = wc0.E(hx0.m(joinOrSplitGestureN), ge2Var);
                                    } else {
                                        int iCharCount = iA;
                                        while (iCharCount > 0) {
                                            int iCodePointBefore = Character.codePointBefore(djVar, iCharCount);
                                            if (!hd0.L(iCodePointBefore)) {
                                                break;
                                            } else {
                                                iCharCount -= Character.charCount(iCodePointBefore);
                                            }
                                        }
                                        while (iA < djVar.f.length()) {
                                            int iCodePointAt = Character.codePointAt(djVar, iA);
                                            if (!hd0.L(iCodePointAt)) {
                                                break;
                                            } else {
                                                iA += Character.charCount(iCodePointAt);
                                            }
                                        }
                                        long jA = g93.a(iCharCount, iA);
                                        if (f93.c(jA)) {
                                            int i7 = (int) (jA >> 32);
                                            ge2Var.invoke(new ix0(new ei0[]{new ot2(i7, i7), new h00(" ", 1)}));
                                        } else {
                                            wc0.Y(jA, djVar, false, ge2Var);
                                        }
                                    }
                                }
                            } else if (ud.v(handwritingGesture)) {
                                InsertGesture insertGestureJ = ud.j(handwritingGesture);
                                if (aj3Var == null) {
                                    iE = wc0.E(hx0.w(insertGestureJ), ge2Var);
                                } else {
                                    int iA2 = hd0.A(me1Var, hd0.Q(insertGestureJ.getInsertionPoint()), aj3Var);
                                    if (iA2 == -1 || ((y83VarD = me1Var.d()) != null && hd0.H(y83VarD.a, iA2))) {
                                        iE = wc0.E(hx0.m(insertGestureJ), ge2Var);
                                    } else {
                                        ge2Var.invoke(new ix0(new ei0[]{new ot2(iA2, iA2), new h00(insertGestureJ.getTextToInsert(), 1)}));
                                    }
                                }
                            } else if (ud.x(handwritingGesture)) {
                                RemoveSpaceGesture removeSpaceGestureO = hx0.o(handwritingGesture);
                                y83 y83VarD4 = me1Var.d();
                                x83 x83Var = y83VarD4 != null ? y83VarD4.a : null;
                                long jQ = hd0.Q(removeSpaceGestureO.getStartPoint());
                                long jQ2 = hd0.Q(removeSpaceGestureO.getEndPoint());
                                pa1 pa1VarC = me1Var.c();
                                if (x83Var != null) {
                                    sw1 sw1Var = x83Var.b;
                                    if (pa1VarC == null) {
                                        jH = f93.b;
                                    } else {
                                        long jT = pa1VarC.T(jQ);
                                        long jT2 = pa1VarC.T(jQ2);
                                        int iZ = hd0.z(sw1Var, jT, aj3Var);
                                        int iZ2 = hd0.z(sw1Var, jT2, aj3Var);
                                        if (iZ != -1) {
                                            if (iZ2 != -1) {
                                                iZ = Math.min(iZ, iZ2);
                                            }
                                            iZ2 = iZ;
                                        } else if (iZ2 == -1) {
                                            jH = f93.b;
                                        }
                                        float fB = (sw1Var.b(iZ2) + sw1Var.f(iZ2)) / 2.0f;
                                        int i8 = (int) (jT >> 32);
                                        int i9 = (int) (jT2 >> 32);
                                        jH = sw1Var.h(new pe2(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), fB - 0.1f, Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), fB + 0.1f), 0, u92.t);
                                    }
                                } else {
                                    jH = f93.b;
                                }
                                if (f93.c(jH)) {
                                    iE = wc0.E(hx0.m(removeSpaceGestureO), ge2Var);
                                } else {
                                    String str = djVar.subSequence(f93.f(jH), f93.e(jH)).f;
                                    Pattern patternCompile = Pattern.compile("\\s+");
                                    patternCompile.getClass();
                                    str.getClass();
                                    Matcher matcher = patternCompile.matcher(str);
                                    matcher.getClass();
                                    vq1 vq1VarO = dh0.o(matcher, 0, str);
                                    if (vq1VarO == null) {
                                        string = str.toString();
                                        i2 = -1;
                                        i = -1;
                                    } else {
                                        int length = str.length();
                                        StringBuilder sb = new StringBuilder(length);
                                        int i10 = 0;
                                        i = -1;
                                        while (true) {
                                            sb.append((CharSequence) str, i10, vq1VarO.b().e);
                                            if (i == -1) {
                                                i = vq1VarO.b().e;
                                            }
                                            i2 = vq1VarO.b().f + 1;
                                            sb.append((CharSequence) "");
                                            i3 = vq1VarO.b().f + 1;
                                            vq1VarO = vq1VarO.c();
                                            if (i3 >= length || vq1VarO == null) {
                                                break;
                                            } else {
                                                i10 = i3;
                                            }
                                        }
                                        if (i3 < length) {
                                            sb.append((CharSequence) str, i3, length);
                                        }
                                        string = sb.toString();
                                    }
                                    if (i == -1 || i2 == -1) {
                                        iE = wc0.E(hx0.m(removeSpaceGestureO), ge2Var);
                                    } else {
                                        int i11 = (int) (jH >> 32);
                                        String strSubstring = string.substring(i, string.length() - (f93.d(jH) - i2));
                                        ot2 ot2Var = new ot2(i11 + i, i11 + i2);
                                        i4 = 1;
                                        ge2Var.invoke(new ix0(new ei0[]{ot2Var, new h00(strSubstring, 1)}));
                                        iE = i4;
                                    }
                                }
                            } else {
                                iE = 2;
                            }
                        }
                    } else {
                        iE = i4;
                    }
                }
                i4 = iE;
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tj
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(i4);
                    }
                });
            } else {
                intConsumer.accept(i4);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        me1 me1Var;
        dj djVar;
        w83 w83Var;
        if (Build.VERSION.SDK_INT >= 34 && (me1Var = this.c) != null && (djVar = me1Var.j) != null) {
            y83 y83VarD = me1Var.d();
            if (djVar.equals((y83VarD == null || (w83Var = y83VarD.a.a) == null) ? null : w83Var.a)) {
                boolean zQ = ud.q(previewableHandwritingGesture);
                int i = 1;
                dx0 dx0Var = dx0.e;
                x73 x73Var = this.d;
                if (zQ) {
                    SelectGesture selectGestureK = ud.k(previewableHandwritingGesture);
                    if (x73Var != null) {
                        long jC = hd0.C(me1Var, vd0.J(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        me1 me1Var2 = x73Var.d;
                        if (me1Var2 != null) {
                            me1Var2.f(jC);
                        }
                        me1 me1Var3 = x73Var.d;
                        if (me1Var3 != null) {
                            me1Var3.e(f93.b);
                        }
                        if (!f93.c(jC)) {
                            x73Var.u(false);
                            x73Var.r(dx0Var);
                        }
                    }
                } else if (hx0.x(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureK = hx0.k(previewableHandwritingGesture);
                    if (x73Var != null) {
                        long jC2 = hd0.C(me1Var, vd0.J(deleteGestureK.getDeletionArea()), deleteGestureK.getGranularity() != 1 ? 0 : 1);
                        me1 me1Var4 = x73Var.d;
                        if (me1Var4 != null) {
                            me1Var4.e(jC2);
                        }
                        me1 me1Var5 = x73Var.d;
                        if (me1Var5 != null) {
                            me1Var5.f(f93.b);
                        }
                        if (!f93.c(jC2)) {
                            x73Var.u(false);
                            x73Var.r(dx0Var);
                        }
                    }
                } else if (hx0.y(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureP = hx0.p(previewableHandwritingGesture);
                    if (x73Var != null) {
                        long jD = hd0.D(me1Var, vd0.J(selectRangeGestureP.getSelectionStartArea()), vd0.J(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        me1 me1Var6 = x73Var.d;
                        if (me1Var6 != null) {
                            me1Var6.f(jD);
                        }
                        me1 me1Var7 = x73Var.d;
                        if (me1Var7 != null) {
                            me1Var7.e(f93.b);
                        }
                        if (!f93.c(jD)) {
                            x73Var.u(false);
                            x73Var.r(dx0Var);
                        }
                    }
                } else if (hx0.z(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureL = hx0.l(previewableHandwritingGesture);
                    if (x73Var != null) {
                        long jD2 = hd0.D(me1Var, vd0.J(deleteRangeGestureL.getDeletionStartArea()), vd0.J(deleteRangeGestureL.getDeletionEndArea()), deleteRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        me1 me1Var8 = x73Var.d;
                        if (me1Var8 != null) {
                            me1Var8.e(jD2);
                        }
                        me1 me1Var9 = x73Var.d;
                        if (me1Var9 != null) {
                            me1Var9.f(f93.b);
                        }
                        if (!f93.c(jD2)) {
                            x73Var.u(false);
                            x73Var.r(dx0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new r20(x73Var, i));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        he1 he1Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            he1Var = ((ne1) this.a.f).m;
            synchronized (he1Var.c) {
                try {
                    he1Var.f = z2;
                    he1Var.g = z3;
                    he1Var.h = z5;
                    he1Var.i = z;
                    if (z6) {
                        he1Var.e = true;
                        if (he1Var.j != null) {
                            he1Var.a();
                        }
                    }
                    he1Var.d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        he1Var = ((ne1) this.a.f).m;
        synchronized (he1Var.c) {
            he1Var.f = z2;
            he1Var.g = z3;
            he1Var.h = z5;
            he1Var.i = z;
            if (z6) {
                he1Var.e = true;
                if (he1Var.j != null) {
                    he1Var.a();
                }
            }
            he1Var.d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((ne1) this.a.f).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new mt2(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new nt2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new ot2(i, i2));
        return true;
    }
}
