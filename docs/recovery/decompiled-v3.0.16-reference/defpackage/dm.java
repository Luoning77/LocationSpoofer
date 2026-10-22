package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dm {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public dm(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            q21.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            q21.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new qw(charSequence, i));
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new na(this, i));
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbS = p91.s("Invalid offset: ", ". Valid range is [", i, i2, " , ");
        sbS.append(i3);
        sbS.append(']');
        q21.a(sbS.toString());
    }

    public int c() {
        jv0 jv0Var = (jv0) this.e;
        String str = (String) this.d;
        if (jv0Var == null) {
            return str.length();
        }
        return (jv0Var.b - jv0Var.a()) + (str.length() - (this.c - this.b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!wi0.d()) {
                    return false;
                }
                wi0 wi0VarA = wi0.a();
                if (wi0VarA.c() != 1 || wi0VarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return u83.g(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (o51.f(unicodeBlockOf, unicodeBlock) && o51.f(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return o51.f(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && o51.f(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!wi0.d()) {
                return false;
            }
            wi0 wi0VarA = wi0.a();
            if (wi0VarA.c() != 1 || wi0VarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return u83.g(Character.codePointAt((CharSequence) this.d, i));
    }

    public int j(int i) {
        b(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (h(iFollowing + (-1)) && h(iFollowing) && !g(iFollowing)) ? j(iFollowing) : iFollowing;
    }

    public void k(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = im.a(typeface, i, (this.c & 2) != 0);
        }
        jm jmVar = (jm) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (jmVar.m) {
            jmVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = yi3.a;
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = jmVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new em(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public int l(int i) {
        b(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (h(iPreceding) && d(iPreceding) && !g(iPreceding)) ? l(iPreceding) : iPreceding;
    }

    public void m(int i, int i2, String str) {
        if (i > i2) {
            q21.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            q21.a("start must be non-negative, but was " + i);
        }
        jv0 jv0Var = (jv0) this.e;
        if (jv0Var == null) {
            int iMax = Math.max(255, str.length() + WorkQueueKt.BUFFER_CAPACITY);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            jv0 jv0Var2 = new jv0();
            jv0Var2.b = iMax;
            jv0Var2.e = cArr;
            jv0Var2.c = length;
            jv0Var2.d = i4;
            this.e = jv0Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > jv0Var.b - jv0Var.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            m(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > jv0Var.a()) {
            int iA = length2 - jv0Var.a();
            int i9 = jv0Var.b;
            do {
                i9 *= 2;
            } while (i9 - jv0Var.b < iA);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) jv0Var.e, 0, cArr2, 0, jv0Var.c);
            int i10 = jv0Var.b;
            int i11 = jv0Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) jv0Var.e, i11, cArr2, i13, (i12 + i11) - i11);
            jv0Var.e = cArr2;
            jv0Var.b = i9;
            jv0Var.d = i13;
        }
        int i14 = jv0Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) jv0Var.e;
            System.arraycopy(cArr3, i8, cArr3, jv0Var.d - i15, i15);
            jv0Var.c = i7;
            jv0Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = jv0Var.a() + i7;
            int iA3 = jv0Var.a() + i8;
            int i16 = jv0Var.d;
            int i17 = iA2 - i16;
            char[] cArr4 = (char[]) jv0Var.e;
            System.arraycopy(cArr4, i16, cArr4, jv0Var.c, i17);
            i7 = jv0Var.c + i17;
            jv0Var.c = i7;
            jv0Var.d = iA3;
        } else {
            jv0Var.d = jv0Var.a() + i8;
            jv0Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) jv0Var.e, i7);
        jv0Var.c = str.length() + jv0Var.c;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                jv0 jv0Var = (jv0) this.e;
                String str = (String) this.d;
                if (jv0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) jv0Var.e, 0, jv0Var.c);
                char[] cArr = (char[]) jv0Var.e;
                int i = jv0Var.d;
                sb.append(cArr, i, jv0Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dm() {
    }

    public dm(jm jmVar, int i, int i2, WeakReference weakReference) {
        this.e = jmVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
