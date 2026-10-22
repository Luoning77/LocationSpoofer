package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h1 extends e1 {
    public static h1 c;

    @Override // defpackage.e1
    public final int[] e(int i) {
        int length = i().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && i().charAt(i) == '\n' && (i().charAt(i) == '\n' || (i != 0 && i().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m(i2)) {
            i2++;
        }
        return h(i, i2);
    }

    @Override // defpackage.e1
    public final int[] k(int i) {
        int length = i().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && i().charAt(i - 1) == '\n' && !m(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (i().charAt(i2) == '\n' || (i2 != 0 && i().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return h(i2, i);
    }

    public final boolean m(int i) {
        if (i <= 0 || i().charAt(i - 1) == '\n') {
            return false;
        }
        return i == i().length() || i().charAt(i) == '\n';
    }
}
