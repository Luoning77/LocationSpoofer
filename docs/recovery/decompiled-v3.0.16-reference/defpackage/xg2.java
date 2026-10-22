package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xg2 implements Serializable {
    public final Object e;

    public static final Throwable a(Object obj) {
        if (obj instanceof wg2) {
            return ((wg2) obj).e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xg2) {
            return this.e.equals(((xg2) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        Object obj = this.e;
        if (obj instanceof wg2) {
            return ((wg2) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
