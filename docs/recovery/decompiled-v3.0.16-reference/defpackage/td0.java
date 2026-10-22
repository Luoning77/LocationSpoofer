package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class td0 implements Comparable {
    public final float e;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.e, ((td0) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td0) {
            return Float.compare(this.e, ((td0) obj).e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e);
    }

    public final String toString() {
        return c(this.e);
    }
}
