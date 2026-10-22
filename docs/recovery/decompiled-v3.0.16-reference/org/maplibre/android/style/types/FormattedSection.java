package org.maplibre.android.style.types;

import defpackage.az2;
import defpackage.p91;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class FormattedSection {
    private Number fontScale;
    private String[] fontStack;
    private String text;
    private String textColor;

    public FormattedSection(String str, Number number, String[] strArr, String str2) {
        this.text = str;
        this.fontScale = number;
        this.fontStack = strArr;
        this.textColor = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FormattedSection formattedSection = (FormattedSection) obj;
            String str = this.text;
            String str2 = formattedSection.text;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            Number number = this.fontScale;
            Number number2 = formattedSection.fontScale;
            if (number == null ? number2 != null : !number.equals(number2)) {
                return false;
            }
            if (!Arrays.equals(this.fontStack, formattedSection.fontStack)) {
                return false;
            }
            String str3 = this.textColor;
            String str4 = formattedSection.textColor;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public Number getFontScale() {
        return this.fontScale;
    }

    public String[] getFontStack() {
        return this.fontStack;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Number number = this.fontScale;
        int iHashCode2 = (((iHashCode + (number != null ? number.hashCode() : 0)) * 31) + Arrays.hashCode(this.fontStack)) * 31;
        String str2 = this.textColor;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setFontScale(Number number) {
        this.fontScale = number;
    }

    public void setFontStack(String[] strArr) {
        this.fontStack = strArr;
    }

    public void setTextColor(int i) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.###");
        String str = decimalFormat.format(((i >> 24) & 255) / 255.0f);
        StringBuilder sbS = p91.s("rgba(", ", ", (i >> 16) & 255, (i >> 8) & 255, ", ");
        sbS.append(i & 255);
        sbS.append(", ");
        sbS.append(str);
        sbS.append(")");
        this.textColor = sbS.toString();
    }

    public Object[] toArray() {
        HashMap map = new HashMap();
        map.put("font-scale", this.fontScale);
        map.put("text-font", this.fontStack);
        map.put("text-color", this.textColor);
        return new Object[]{this.text, map};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FormattedSection{text='");
        sb.append(this.text);
        sb.append("', fontScale=");
        sb.append(this.fontScale);
        sb.append(", fontStack=");
        sb.append(Arrays.toString(this.fontStack));
        sb.append(", textColor='");
        return az2.p(sb, this.textColor, "'}");
    }

    public FormattedSection(String str) {
        this(str, null, null, null);
    }

    @Deprecated
    public FormattedSection(String str, Number number, String[] strArr) {
        this(str, number, strArr, null);
    }

    @Deprecated
    public FormattedSection(String str, Number number) {
        this(str, number, null, null);
    }

    @Deprecated
    public FormattedSection(String str, String[] strArr) {
        this(str, null, strArr, null);
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setTextColor(Object obj) {
        setTextColor((String) obj);
    }
}
