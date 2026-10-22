package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class fk {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public fk() {
        this.a = 1;
        this.c = new gy0[32];
        this.d = new float[32];
        this.e = new byte[32];
        ay1 ay1Var = in2.a;
        this.f = new ay1();
        this.g = new ay1();
    }

    public static /* synthetic */ void n(fk fkVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = fkVar.b;
        }
        fkVar.m(i, str, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public boolean A() {
        int iZ = z();
        String str = (String) this.g;
        if (iZ >= str.length() || iZ == -1 || str.charAt(iZ) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean B(boolean z) {
        int iV = v(z());
        String str = (String) this.g;
        int length = str.length() - iV;
        if (length >= 4 && iV != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == str.charAt(iV + i)) {
                }
            }
            if (length <= 4 || n51.o(str.charAt(iV + 4)) != 0) {
                if (z) {
                    this.b = iV + 4;
                }
                return true;
            }
        }
        return false;
    }

    public void C(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strK = k();
                this.b = i;
                if (o51.f(strK, "null")) {
                    m(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strY = n51.y(n51.o(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        n(this, az2.l("Expected ", strY, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, 4);
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (o(charSequence, i + 3) + (o(charSequence, i) << 12) + (o(charSequence, i + 1) << 8) + (o(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.b);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public void b() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((u40) this.e) != null) {
                u40 u40Var = (u40) this.g;
                if (u40Var == null) {
                    u40Var = new u40();
                    this.g = u40Var;
                }
                u40Var.c = null;
                u40Var.b = false;
                u40Var.d = null;
                u40Var.a = false;
                WeakHashMap weakHashMap = yi3.a;
                ColorStateList colorStateListC = ri3.c(view);
                if (colorStateListC != null) {
                    u40Var.b = true;
                    u40Var.c = colorStateListC;
                }
                PorterDuff.Mode modeD = ri3.d(view);
                if (modeD != null) {
                    u40Var.a = true;
                    u40Var.d = modeD;
                }
                if (u40Var.b || u40Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = cl.b;
                    kg2.i(background, u40Var, drawableState);
                    return;
                }
            }
            u40 u40Var2 = (u40) this.f;
            if (u40Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = cl.b;
                kg2.i(background, u40Var2, drawableState2);
            } else {
                u40 u40Var3 = (u40) this.e;
                if (u40Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = cl.b;
                    kg2.i(background, u40Var3, drawableState3);
                }
            }
        }
    }

    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public void d(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String e() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        h('\"');
        int i = this.b;
        int iH0 = l13.h0(str, '\"', i, 4);
        if (iH0 == -1) {
            k();
            int i2 = this.b;
            n(this, az2.k("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iH0) {
            if (str.charAt(i3) == '\\') {
                int iV = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iV, i3);
                        int iV2 = v(i3 + 1);
                        if (iV2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iA = iV2 + 1;
                        char cCharAt2 = str.charAt(iV2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? pw.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iV = v(iA);
                        if (iV == -1) {
                            n(this, "Unexpected EOF", iV, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iV, i3);
                            iV = v(i3);
                            if (iV == -1) {
                                n(this, "Unexpected EOF", iV, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iV;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iV, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iV, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iH0 + 1;
        return str.substring(i, iH0);
    }

    public byte f() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return n51.o(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte g(byte b) {
        String str = (String) this.g;
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        String strY = n51.y(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        n(this, az2.l("Expected ", strY, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
        throw null;
    }

    public void h(char c) {
        int i = this.b;
        if (i == -1) {
            C(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                C(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        C(c);
        throw null;
    }

    public long i() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iV = v(z());
        String str = (String) this.g;
        if (iV >= str.length() || iV == -1) {
            n(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iV) == '\"') {
            iV++;
            if (iV == str.length()) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iV;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            j3 = j3;
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                z2 = z;
                if (cCharAt == '-' && z4) {
                    if (i == iV) {
                        n(this, "Unexpected symbol '-' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    if (cCharAt != '-') {
                        if (n51.o(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j4 = (j4 * 10) - ((long) i3);
                            if (j4 > j3) {
                                n(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                        }
                        z = z2;
                        i = i2;
                    } else {
                        if (i != iV) {
                            n(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = true;
                    }
                } else {
                    if (i == iV) {
                        n(this, "Unexpected symbol '+' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z3 = true;
                }
            } else {
                if (i == iV) {
                    n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                    throw null;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iV;
        if (iV == i || (z5 && iV == i - 1)) {
            n(this, "Expected numeric literal", i, 4);
            throw null;
        }
        if (z2) {
            if (!z6) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                n(this, "Expected closing quotation mark", i, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j5 = j4;
        if (z4) {
            double d = j5;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    b81.d();
                    return j3;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                n(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                n(this, "Can't convert " + d2 + " to Long", 0, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j5;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        n(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    public String j() {
        String str = (String) this.e;
        if (str == null) {
            return e();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public String k() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iZ = z();
        if (iZ >= str.length() || iZ == -1) {
            n(this, "EOF", iZ, 4);
            throw null;
        }
        byte bO = n51.o(str.charAt(iZ));
        if (bO == 1) {
            return j();
        }
        if (bO != 0) {
            n(this, "Expected beginning of the string, but got " + str.charAt(iZ), 0, 6);
            throw null;
        }
        boolean z = false;
        while (n51.o(str.charAt(iZ)) == 0) {
            iZ++;
            if (iZ >= str.length()) {
                sb.append((CharSequence) str, this.b, iZ);
                int iV = v(iZ);
                if (iV == -1) {
                    this.b = iZ;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iZ = iV;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iZ);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iZ).toString();
        }
        this.b = iZ;
        return string;
    }

    public String l() {
        String strK = k();
        if (!o51.f(strK, "null") || ((String) this.g).charAt(this.b - 1) == '\"') {
            return strK;
        }
        n(this, "Unexpected 'null' value instead of string literal", 0, 6);
        throw null;
    }

    public void m(int i, String str, String str2) {
        String strA = ((je) this.d).a();
        String str3 = (String) this.g;
        str3.getClass();
        throw new c71(ce0.t(str, strA, i, str2, ((a71) this.c).k ? ce0.J(str3, i).toString() : null));
    }

    public int o(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public ColorStateList p() {
        u40 u40Var = (u40) this.f;
        if (u40Var != null) {
            return (ColorStateList) u40Var.c;
        }
        return null;
    }

    public PorterDuff.Mode q() {
        u40 u40Var = (u40) this.f;
        if (u40Var != null) {
            return (PorterDuff.Mode) u40Var.d;
        }
        return null;
    }

    public void r(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = jd2.z;
        gn gnVarY = gn.y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        View view2 = (View) this.c;
        yi3.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) gnVarY.a, i);
        try {
            if (typedArray.hasValue(0)) {
                this.b = typedArray.getResourceId(0, -1);
                cl clVar = (cl) this.d;
                Context context2 = view.getContext();
                int i2 = this.b;
                synchronized (clVar) {
                    colorStateListG = clVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    w(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                ri3.e(view, gnVarY.j(1));
            }
            if (typedArray.hasValue(2)) {
                ri3.f(view, pg0.b(typedArray.getInt(2, -1), null));
            }
            gnVarY.A();
        } catch (Throwable th) {
            gnVarY.A();
            throw th;
        }
    }

    public void s() {
        this.b = -1;
        w(null);
        b();
    }

    public void t(int i) {
        ColorStateList colorStateListG;
        this.b = i;
        cl clVar = (cl) this.d;
        if (clVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (clVar) {
                colorStateListG = clVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        w(colorStateListG);
        b();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return az2.o(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public byte u() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int iV = v(i);
            if (iV == -1) {
                this.b = iV;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iV);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iV;
                return n51.o(cCharAt);
            }
            i = iV + 1;
        }
    }

    public int v(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public void w(ColorStateList colorStateList) {
        if (colorStateList != null) {
            u40 u40Var = (u40) this.e;
            if (u40Var == null) {
                u40Var = new u40();
                this.e = u40Var;
            }
            u40Var.c = colorStateList;
            u40Var.b = true;
        } else {
            this.e = null;
        }
        b();
    }

    public void x(ColorStateList colorStateList) {
        u40 u40Var = (u40) this.f;
        if (u40Var == null) {
            u40Var = new u40();
            this.f = u40Var;
        }
        u40Var.c = colorStateList;
        u40Var.b = true;
        b();
    }

    public void y(PorterDuff.Mode mode) {
        u40 u40Var = (u40) this.f;
        if (u40Var == null) {
            u40Var = new u40();
            this.f = u40Var;
        }
        u40Var.d = mode;
        u40Var.a = true;
        b();
    }

    public int z() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public fk(String str, a71 a71Var) {
        this.a = 2;
        str.getClass();
        this.c = a71Var;
        this.d = new je(a71Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    public fk(View view) {
        this.a = 0;
        this.b = -1;
        this.c = view;
        this.d = cl.a();
    }
}
