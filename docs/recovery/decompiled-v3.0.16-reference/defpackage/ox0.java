package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ox0 implements Iterable, p81 {
    public final String[] e;

    public ox0(String[] strArr) {
        this.e = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.e;
        int length = strArr.length - 2;
        int iU = mc0.u(length, 0, -2);
        if (iU > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iU) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.e[i * 2];
    }

    public final nx0 c() {
        nx0 nx0Var = new nx0(0);
        fz.a0(nx0Var.a, this.e);
        return nx0Var;
    }

    public final String d(int i) {
        return this.e[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ox0) {
            return Arrays.equals(this.e, ((ox0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        i52[] i52VarArr = new i52[size];
        for (int i = 0; i < size; i++) {
            i52VarArr[i] = new i52(b(i), d(i));
        }
        return new d0(i52VarArr);
    }

    public final int size() {
        return this.e.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strD = d(i);
            sb.append(strB);
            sb.append(": ");
            if (bh3.o(strB)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
