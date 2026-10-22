package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ee3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final mn2 b;
    public volatile int c = 0;

    public ee3(mn2 mn2Var, int i) {
        this.b = mn2Var;
        this.a = i;
    }

    public final int a(int i) {
        ut1 ut1VarB = b();
        int iA = ut1VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ut1VarB.h;
        int i2 = iA + ut1VarB.e;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final ut1 b() {
        ThreadLocal threadLocal = d;
        ut1 ut1Var = (ut1) threadLocal.get();
        if (ut1Var == null) {
            ut1Var = new ut1();
            threadLocal.set(ut1Var);
        }
        vt1 vt1Var = (vt1) this.b.e;
        int iA = vt1Var.a(6);
        if (iA != 0) {
            int i = iA + vt1Var.e;
            int i2 = (this.a * 4) + ((ByteBuffer) vt1Var.h).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) vt1Var.h).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) vt1Var.h;
            ut1Var.h = byteBuffer;
            if (byteBuffer != null) {
                ut1Var.e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ut1Var.f = i4;
                ut1Var.g = ((ByteBuffer) ut1Var.h).getShort(i4);
                return ut1Var;
            }
            ut1Var.e = 0;
            ut1Var.f = 0;
            ut1Var.g = 0;
        }
        return ut1Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ut1 ut1VarB = b();
        int iA = ut1VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) ut1VarB.h).getInt(iA + ut1VarB.e) : 0));
        sb.append(", codepoints:");
        ut1 ut1VarB2 = b();
        int iA2 = ut1VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + ut1VarB2.e;
            i = ((ByteBuffer) ut1VarB2.h).getInt(((ByteBuffer) ut1VarB2.h).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
