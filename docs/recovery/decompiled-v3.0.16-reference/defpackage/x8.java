package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x8 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public x8(Context context) {
        this.a = 0;
        int iF = y8.f(context, 0);
        this.c = new t8(new ContextThemeWrapper(context, y8.f(context, iF)));
        this.b = iF;
    }

    public static x8 d(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int i2;
        int i3;
        int color;
        float f;
        float f2;
        int i4;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        int i5;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            i2 = 1;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new x8(rz.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i2, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = gd2.d;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i3 = 0;
            color = typedArrayObtainAttributes.getColor(1, 0);
        } else {
            i3 = 0;
            color = 0;
        }
        int i7 = 1;
        int i8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, i3) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i7) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = gd2.e;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i5 = 0;
                } else {
                    i5 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i5);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i7 = 1;
        }
        av avVar = arrayList2.size() > 0 ? new av(arrayList2, arrayList) : null;
        if (avVar == null) {
            avVar = z ? new av(color2, color3, color) : new av(color2, color);
        }
        if (i6 != 1) {
            if (i6 != 2) {
                int[] iArr3 = avVar.a;
                float[] fArr = avVar.b;
                if (i8 != 1) {
                    tileMode2 = i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f, f2, f5, f6, iArr3, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, avVar.a, avVar.b);
            }
            i4 = 1;
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr4 = avVar.a;
            float[] fArr2 = avVar.b;
            i4 = 1;
            if (i8 != 1) {
                tileMode = i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr4, fArr2, tileMode);
        }
        return new x8(0, i4, radialGradient);
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = o51.m(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.b;
        long[] jArrCopyOf = (long[]) this.c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public boolean b(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public y8 c() {
        t8 t8Var = (t8) this.c;
        ContextThemeWrapper contextThemeWrapper = t8Var.a;
        y8 y8Var = new y8(contextThemeWrapper, this.b);
        View view = t8Var.e;
        w8 w8Var = y8Var.j;
        if (view != null) {
            w8Var.n = view;
        } else {
            CharSequence charSequence = t8Var.d;
            if (charSequence != null) {
                w8Var.d = charSequence;
                TextView textView = w8Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = t8Var.c;
            if (drawable != null) {
                w8Var.j = drawable;
                ImageView imageView = w8Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    w8Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (t8Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) t8Var.b.inflate(w8Var.r, (ViewGroup) null);
            int i = t8Var.i ? w8Var.s : w8Var.t;
            ListAdapter v8Var = t8Var.g;
            if (v8Var == null) {
                v8Var = new v8(contextThemeWrapper, i, R.id.text1, null);
            }
            w8Var.o = v8Var;
            w8Var.p = t8Var.j;
            if (t8Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new s8(t8Var, w8Var));
            }
            if (t8Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            w8Var.e = alertController$RecycleListView;
        }
        y8Var.setCancelable(true);
        y8Var.setCanceledOnTouchOutside(true);
        y8Var.setOnCancelListener(null);
        y8Var.setOnDismissListener(null);
        os1 os1Var = t8Var.f;
        if (os1Var != null) {
            y8Var.setOnKeyListener(os1Var);
        }
        return y8Var;
    }

    public void f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public boolean g() {
        return this.b < ((ArrayList) this.c).size();
    }

    public void h(rt0 rt0Var, int i, int i2) {
        ((bi2) this.c).d(new r23(rt0Var), i, i2);
    }

    public void i() {
        nw nwVar = nw.c;
        char[] cArr = (char[]) this.c;
        nwVar.getClass();
        cArr.getClass();
        synchronized (nwVar) {
            int i = nwVar.b;
            if (cArr.length + i < uo.a) {
                nwVar.b = i + cArr.length;
                nwVar.a.addLast(cArr);
            }
        }
    }

    public void j(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public void k(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x8(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public x8(bi2 bi2Var, int i) {
        this.a = 7;
        this.c = bi2Var;
        this.a = 7;
        this.b = i;
    }

    public /* synthetic */ x8(int i, byte b) {
        this.a = i;
    }

    public x8() {
        this.a = 2;
        this.b = 1;
        this.c = Collections.singletonList(null);
    }

    public x8(int i, ArrayList arrayList) {
        this.a = i;
        switch (i) {
            case 8:
                this.c = arrayList;
                break;
            default:
                this.b = 0;
                this.c = arrayList;
                break;
        }
    }
}
