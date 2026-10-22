package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.widget.TextView;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class x63 {
    public static final long a(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = ac3.c;
        return jFloatToRawIntBits;
    }

    public static final c80 b(pj3 pj3Var, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.d0(19932612);
        c80 defaultViewModelCreationExtras = pj3Var instanceof lx0 ? ((lx0) pj3Var).getDefaultViewModelCreationExtras() : b80.b;
        ov0Var.p(false);
        return defaultViewModelCreationExtras;
    }

    public static fb2 c(mm mmVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new fb2(ad0.j(mmVar));
        }
        TextPaint textPaint = new TextPaint(mmVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = mmVar.getBreakStrategy();
        int hyphenationFrequency = mmVar.getHyphenationFrequency();
        if (mmVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (mmVar.getInputType() & 15) != 3) {
            boolean z = mmVar.getLayoutDirection() == 1;
            switch (mmVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case Logger.WARN /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case Logger.ERROR /* 6 */:
                    break;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ad0.d(DecimalFormatSymbols.getInstance(mmVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new fb2(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        fo.i(p91.l(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final boolean e(int i, KeyEvent keyEvent) {
        return ((int) (mh0.I(keyEvent) >> 32)) == i;
    }

    public static void f(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ad0.l(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void g(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static final double h(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static ActionMode.Callback i(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof y93) || callback == null) ? callback : new y93(callback, textView);
    }
}
