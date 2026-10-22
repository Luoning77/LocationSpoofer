package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ug {
    public final XmlPullParser a;
    public int b = 0;
    public final k8 c;

    public ug(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        k8 k8Var = new k8();
        k8Var.b = new float[64];
        this.c = k8Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    public final x8 a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        x8 x8Var;
        if (g93.e(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    x8Var = x8.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    x8Var = null;
                }
                if (x8Var == null) {
                    x8Var = new x8(0, 1, null);
                }
            } else {
                x8Var = new x8(typedValue.data, 1, null);
            }
        } else {
            x8Var = new x8(0, 1, null);
        }
        c(typedArray.getChangingConfigurations());
        return x8Var;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (g93.e(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return o51.f(this.a, ugVar.a) && this.b == ugVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return az2.o(sb, this.b, ')');
    }
}
