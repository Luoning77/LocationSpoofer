package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qk2 {
    public final String a;
    public final pk2 b;
    public final Set c;
    public final long d;
    public final long e;

    public qk2(String str, pk2 pk2Var, Set set, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = pk2Var;
        this.c = set;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk2)) {
            return false;
        }
        qk2 qk2Var = (qk2) obj;
        return o51.f(this.a, qk2Var.a) && this.b.equals(qk2Var.b) && this.c.equals(qk2Var.c) && this.d == qk2Var.d && this.e == qk2Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + p91.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "RuntimePermitClaims(keyId=" + this.a + ", binding=" + this.b + ", capabilities=" + this.c + ", issuedAt=" + this.d + ", expiresAt=" + this.e + ")";
    }
}
