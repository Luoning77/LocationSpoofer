package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class le {
    public final pe a;
    public final int b;
    public final long c;
    public final t83 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0213  */
    /* JADX WARN: Code duplicated, block: B:139:0x0216  */
    /* JADX WARN: Code duplicated, block: B:141:0x0230  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:145:0x024e A[LOOP:1: B:144:0x024c->B:145:0x024e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x0279  */
    /* JADX WARN: Code duplicated, block: B:149:0x027d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0295  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:187:0x032a  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x024a, please report this as an issue */
    public le(pe peVar, int i, int i2, long j) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        t83 t83VarA;
        int i9;
        le leVar;
        int i10;
        Layout layout;
        Spanned spanned;
        vt2[] vt2VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i11;
        List list;
        int spanEnd;
        int iG;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int i13;
        CharSequence charSequence2 = peVar.h;
        this.a = peVar;
        this.b = i;
        this.c = j;
        if (l50.i(j) != 0 || l50.j(j) != 0) {
            q21.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            q21.a("maxLines should be greater than 0");
        }
        q93 q93Var = peVar.b;
        if (i2 == 2) {
            i3 = 0;
            if (!w93.a(q93Var.a.h, v63.c(0)) && !w93.a(q93Var.a.h, w93.c) && (i13 = q93Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!mc0.x(spannableString, j11.class)) {
                    spannableString.setSpan(new j11(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        p52 p52Var = q93Var.b;
        uy2 uy2Var = q93Var.a;
        int i14 = p52Var.a;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        Throwable th = null;
        int i17 = p52Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = p52Var.g;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                i8 = i17;
                truncateAt = TextUtils.TruncateAt.START;
                c = ' ';
            } else {
                i8 = i17;
                uy2Var = uy2Var;
                truncateAt = null;
                c = ' ';
            }
            t83VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = t83VarA.f;
            if (Build.VERSION.SDK_INT < 35 || peVar.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                leVar = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                leVar = this;
                i10 = i;
                t83VarA = leVar.a(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = t83VarA.g;
            if (i2 == i9 || t83VarA.a() <= l50.g(j) || i10 <= 1) {
                leVar.d = t83VarA;
            } else {
                int iG2 = l50.g(j);
                for (int i23 = 0; i23 < i22; i23++) {
                    if (t83VarA.e(i23) > iG2) {
                        i22 = i23;
                        break;
                    }
                }
                if (i22 >= 0 && i22 != leVar.b) {
                    t83VarA = leVar.a(i15, i16, truncateAt, i22 < 1 ? 1 : i22, i8, i4, i5, i7, leVar.e);
                }
                leVar.d = t83VarA;
            }
            uy2 uy2Var2 = uy2Var;
            leVar.a.g.c(uy2Var2.a.b(), (((long) Float.floatToRawIntBits(leVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(leVar.d())) << c), uy2Var2.a.s());
            layout = t83VarA.f;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned = (Spanned) text;
                if (spanned.nextSpanTransition(-1, spanned.length(), vt2.class) != spanned.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    vt2VarArr = (vt2[]) ((Spanned) text2).getSpans(0, layout.getText().length(), vt2.class);
                } else {
                    vt2VarArr = null;
                }
            } else {
                vt2VarArr = null;
            }
            if (vt2VarArr != null) {
                for (vt2 vt2Var : vt2VarArr) {
                    vt2Var.g.setValue(new cw2((((long) Float.floatToRawIntBits(leVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(leVar.d())) << c)));
                }
            }
            charSequence = leVar.e;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                spans = spanned2.getSpans(0, charSequence.length(), k82.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i11 = 0;
                while (i11 < length) {
                    k82 k82Var = (k82) spans[i11];
                    int spanStart = spanned2.getSpanStart(k82Var);
                    spanEnd = spanned2.getSpanEnd(k82Var);
                    iG = leVar.d.g(spanStart);
                    if (iG >= leVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (leVar.d.f.getEllipsisCount(iG) > 0 || spanEnd <= leVar.d.f.getEllipsisStart(iG) + leVar.d.f.getLineStart(iG)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > leVar.d.f(iG)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3) {
                        if (!z) {
                            boolean z4 = leVar.d.f.getParagraphDirection(iG) == 1;
                            boolean zIsRtlCharAt = leVar.d.f.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                leVar.d.i(spanStart, false);
                                k82Var.b();
                                throw th;
                            }
                            if (z4 && zIsRtlCharAt) {
                                leVar.d.j(spanStart, false);
                                k82Var.b();
                                throw th;
                            }
                            t83 t83Var = leVar.d;
                            if (zIsRtlCharAt) {
                                t83Var.i(spanStart, false);
                                k82Var.b();
                                throw th;
                            }
                            t83Var.j(spanStart, false);
                            k82Var.b();
                            throw th;
                        }
                    }
                    arrayList.add(th);
                    i11++;
                    th = th;
                }
                list = arrayList;
            } else {
                list = uj0.e;
            }
            leVar.f = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        t83VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = t83VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            leVar = this;
            i10 = i;
        } else {
            i9 = 2;
            leVar = this;
            i10 = i;
        }
        int i24 = t83VarA.g;
        if (i2 == i9) {
            leVar.d = t83VarA;
        } else {
            leVar.d = t83VarA;
        }
        uy2 uy2Var3 = uy2Var;
        leVar.a.g.c(uy2Var3.a.b(), (((long) Float.floatToRawIntBits(leVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(leVar.d())) << c), uy2Var3.a.s());
        layout = t83VarA.f;
        if (layout.getText() instanceof Spanned) {
            vt2VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), vt2.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                vt2VarArr = (vt2[]) ((Spanned) text4).getSpans(0, layout.getText().length(), vt2.class);
            } else {
                vt2VarArr = null;
            }
        }
        if (vt2VarArr != null) {
            while (i12 < r2) {
                vt2Var.g.setValue(new cw2((((long) Float.floatToRawIntBits(leVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(leVar.d())) << c)));
            }
        }
        charSequence = leVar.e;
        if (charSequence instanceof Spanned) {
            list = uj0.e;
        } else {
            spanned2 = (Spanned) charSequence;
            spans = spanned2.getSpans(0, charSequence.length(), k82.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i11 = 0;
            while (i11 < length) {
                k82 k82Var2 = (k82) spans[i11];
                int spanStart2 = spanned2.getSpanStart(k82Var2);
                spanEnd = spanned2.getSpanEnd(k82Var2);
                iG = leVar.d.g(spanStart2);
                if (iG >= leVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (leVar.d.f.getEllipsisCount(iG) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > leVar.d.f(iG)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(th);
                i11++;
                th = th;
            }
            list = arrayList;
        }
        leVar.f = list;
    }

    public final t83 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        w82 w82Var;
        float fD = d();
        pe peVar = this.a;
        mg mgVar = peVar.g;
        int i8 = peVar.l;
        va1 va1Var = peVar.i;
        q93 q93Var = peVar.b;
        me meVar = ne.a;
        k92 k92Var = q93Var.c;
        return new t83(charSequence, fD, mgVar, i, truncateAt, i8, (k92Var == null || (w82Var = k92Var.b) == null) ? false : w82Var.a, i3, i5, i6, i7, i4, i2, va1Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    public final long c(pe2 pe2Var, int i, b81 b81Var) {
        kp2 gw0Var;
        int i2;
        int[] iArrE;
        RectF rectFI = vd0.I(pe2Var);
        int i3 = 1;
        int i4 = (i != 0 && i == 1) ? 1 : 0;
        s5 s5Var = new s5(b81Var, i3);
        t83 t83Var = this.d;
        Layout layout = t83Var.f;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            iArrE = d1.e(t83Var, rectFI, i4, s5Var);
        } else {
            xp xpVarC = t83Var.c();
            if (i4 == 1) {
                gw0Var = new z92(11, layout.getText(), t83Var.k());
            } else {
                CharSequence text = layout.getText();
                gw0Var = i5 >= 29 ? new gw0(text, t83Var.a) : new hw0(text);
            }
            kp2 kp2Var = gw0Var;
            int lineForVertical = layout.getLineForVertical((int) rectFI.top);
            if (rectFI.top <= t83Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < t83Var.g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFI.bottom);
                if (lineForVertical2 != 0 || rectFI.bottom >= t83Var.h(0)) {
                    int iF = u83.f(t83Var, layout, xpVarC, i6, rectFI, kp2Var, s5Var, true);
                    while (true) {
                        i2 = i6;
                        if (iF != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iF = u83.f(t83Var, layout, xpVarC, i6, rectFI, kp2Var, s5Var, true);
                    }
                    if (iF == -1) {
                        iArrE = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iF2 = u83.f(t83Var, layout, xpVarC, i7, rectFI, kp2Var, s5Var, false);
                        while (iF2 == -1 && i2 < i7) {
                            i7--;
                            iF2 = u83.f(t83Var, layout, xpVarC, i7, rectFI, kp2Var, s5Var, false);
                        }
                        if (iF2 == -1) {
                            iArrE = null;
                        } else {
                            iArrE = new int[]{kp2Var.a(iF + 1), kp2Var.b(iF2 - 1)};
                        }
                    }
                } else {
                    iArrE = null;
                }
            } else {
                iArrE = null;
            }
        }
        return iArrE == null ? f93.b : g93.a(iArrE[0], iArrE[1]);
    }

    public final float d() {
        return l50.h(this.c);
    }

    public final void e(vv vvVar) {
        Canvas canvasA = ha.a(vvVar);
        t83 t83Var = this.d;
        if (t83Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = t83Var.h;
        if (canvasA.getClipBounds(t83Var.o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = z83.a;
            Object o53Var = threadLocal.get();
            if (o53Var == null) {
                o53Var = new o53();
                threadLocal.set(o53Var);
            }
            o53 o53Var2 = (o53) o53Var;
            o53Var2.a = canvasA;
            try {
                t83Var.f.draw(o53Var2);
                o53Var2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                o53Var2.a = null;
                throw th;
            }
        }
        if (t83Var.d) {
            canvasA.restore();
        }
    }

    public final void f(vv vvVar, long j, xt2 xt2Var, p63 p63Var, kg0 kg0Var) {
        mg mgVar = this.a.g;
        int i = mgVar.c;
        mgVar.d(j);
        mgVar.f(xt2Var);
        mgVar.g(p63Var);
        mgVar.e(kg0Var);
        mgVar.b(3);
        e(vvVar);
        mgVar.b(i);
    }

    public final void g(vv vvVar, st stVar, float f, xt2 xt2Var, p63 p63Var, kg0 kg0Var) {
        mg mgVar = this.a.g;
        int i = mgVar.c;
        float fD = d();
        mgVar.c(stVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        mgVar.f(xt2Var);
        mgVar.g(p63Var);
        mgVar.e(kg0Var);
        mgVar.b(3);
        e(vvVar);
        mgVar.b(i);
    }
}
