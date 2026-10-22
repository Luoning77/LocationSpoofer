package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fe3 extends ReplacementSpan {
    public final ee3 f;
    public TextPaint i;
    public final Paint.FontMetricsInt e = new Paint.FontMetricsInt();
    public short g = -1;
    public float h = 1.0f;

    public fe3(ee3 ee3Var) {
        ig0.l(ee3Var, "rasterizer cannot be null");
        this.f = ee3Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.i;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.i = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.g, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        wi0.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        ee3 ee3Var = this.f;
        mn2 mn2Var = ee3Var.b;
        Typeface typeface = (Typeface) mn2Var.h;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) mn2Var.f, ee3Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.e;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        ee3 ee3Var = this.f;
        ut1 ut1VarB = ee3Var.b();
        int iA = ut1VarB.a(14);
        this.h = fAbs / (iA != 0 ? ((ByteBuffer) ut1VarB.h).getShort(iA + ut1VarB.e) : (short) 0);
        ut1 ut1VarB2 = ee3Var.b();
        int iA2 = ut1VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) ut1VarB2.h).getShort(iA2 + ut1VarB2.e);
        }
        ut1 ut1VarB3 = ee3Var.b();
        int iA3 = ut1VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) ut1VarB3.h).getShort(iA3 + ut1VarB3.e) : (short) 0) * this.h);
        this.g = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
