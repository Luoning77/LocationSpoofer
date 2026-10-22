package org.maplibre.android.style.types;

import defpackage.az2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Formatted {
    private final FormattedSection[] formattedSections;

    public Formatted(FormattedSection... formattedSectionArr) {
        formattedSectionArr.getClass();
        this.formattedSections = formattedSectionArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Formatted.class.equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.formattedSections, ((Formatted) obj).formattedSections);
    }

    public final FormattedSection[] getFormattedSections() {
        return this.formattedSections;
    }

    public int hashCode() {
        return Arrays.hashCode(this.formattedSections);
    }

    public final Object[] toArray() {
        FormattedSection[] formattedSectionArr = this.formattedSections;
        Object[] objArr = new Object[formattedSectionArr.length];
        int length = formattedSectionArr.length;
        for (int i = 0; i < length; i++) {
            objArr[i] = this.formattedSections[i].toArray();
        }
        return objArr;
    }

    public String toString() {
        return az2.k("Formatted{formattedSections=", Arrays.toString(this.formattedSections), "}");
    }
}
