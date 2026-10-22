package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rr {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public rr(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            fa.g();
            porterDuffColorFilter = fa.c(xp1.T(j), k22.I(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(xp1.T(j), k22.J(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr)) {
            return false;
        }
        rr rrVar = (rr) obj;
        long j = rrVar.b;
        int i = hz.h;
        return ye3.a(this.b, j) && this.c == rrVar.c;
    }

    public final int hashCode() {
        int i = hz.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        p91.u(this.b, sb, ", blendMode=");
        sb.append((Object) o51.G(this.c));
        sb.append(')');
        return sb.toString();
    }
}
