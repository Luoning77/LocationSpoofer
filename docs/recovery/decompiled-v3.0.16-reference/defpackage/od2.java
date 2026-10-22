package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class od2 {
    public static final o0 e;

    static {
        Integer num = e61.a;
        e = (num == null || num.intValue() >= 34) ? new l92() : new pm0();
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract int c(int i);

    public int d(int i, int i2) {
        int iB;
        int i3;
        int iA;
        if (i2 <= i) {
            b81.t("Random range is empty: [", Integer.valueOf(i), ", ", Integer.valueOf(i2), ").");
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iB = b() >>> 1;
                    i3 = iB % i4;
                } while ((i4 - 1) + (iB - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i2) {
                return iB2;
            }
        }
    }
}
