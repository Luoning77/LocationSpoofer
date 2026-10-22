package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mq1 extends qq1 {
    public final int a;
    public final String b;
    public final String c;

    public mq1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq1)) {
            return false;
        }
        mq1 mq1Var = (mq1) obj;
        return this.a == mq1Var.a && this.b.equals(mq1Var.b) && this.c.equals(mq1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p91.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(level=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", category=");
        return az2.p(sb, this.c, ")");
    }
}
