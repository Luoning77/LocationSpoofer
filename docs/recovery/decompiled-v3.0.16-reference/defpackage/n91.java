package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n91 {
    public static final n91 c = new n91(0, 0, WorkQueueKt.MASK);
    public final int a;
    public final int b;

    public n91(int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n91)) {
            return false;
        }
        n91 n91Var = (n91) obj;
        return this.a == n91Var.a && this.b == n91Var.b;
    }

    public final int hashCode() {
        return p91.b(this.b, p91.b(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) o91.a(this.a)) + ", imeAction=" + ((Object) b11.a(this.b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
