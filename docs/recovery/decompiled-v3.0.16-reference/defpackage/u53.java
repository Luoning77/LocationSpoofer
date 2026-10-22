package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u53 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public u53(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u53)) {
            return false;
        }
        u53 u53Var = (u53) obj;
        return o51.f(this.a, u53Var.a) && f93.b(this.b, u53Var.b) && o51.f(this.c, u53Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = f93.c;
        return this.c.hashCode() + p91.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) f93.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
