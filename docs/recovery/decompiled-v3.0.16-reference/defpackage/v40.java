package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v40 {
    public static final v40 e;
    public static final v40 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        lx lxVar = lx.r;
        lx lxVar2 = lx.s;
        lx lxVar3 = lx.t;
        lx lxVar4 = lx.l;
        lx lxVar5 = lx.n;
        lx lxVar6 = lx.m;
        lx lxVar7 = lx.o;
        lx lxVar8 = lx.q;
        lx lxVar9 = lx.p;
        lx[] lxVarArr = {lxVar, lxVar2, lxVar3, lxVar4, lxVar5, lxVar6, lxVar7, lxVar8, lxVar9};
        lx[] lxVarArr2 = {lxVar, lxVar2, lxVar3, lxVar4, lxVar5, lxVar6, lxVar7, lxVar8, lxVar9, lx.j, lx.k, lx.h, lx.i, lx.f, lx.g, lx.e};
        u40 u40Var = new u40();
        u40Var.b((lx[]) Arrays.copyOf(lxVarArr, 9));
        sa3 sa3Var = sa3.f;
        sa3 sa3Var2 = sa3.g;
        u40Var.d(sa3Var, sa3Var2);
        u40Var.b = true;
        u40Var.a();
        u40 u40Var2 = new u40();
        u40Var2.b((lx[]) Arrays.copyOf(lxVarArr2, 16));
        u40Var2.d(sa3Var, sa3Var2);
        u40Var2.b = true;
        e = u40Var2.a();
        u40 u40Var3 = new u40();
        u40Var3.b((lx[]) Arrays.copyOf(lxVarArr2, 16));
        u40Var3.d(sa3Var, sa3Var2, sa3.h, sa3.i);
        u40Var3.b = true;
        u40Var3.a();
        f = new v40(false, false, null, null);
    }

    public v40(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(lx.b.m(str));
        }
        return zy.J0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !bh3.h(strArr, sSLSocket.getEnabledProtocols(), uy1.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || bh3.h(strArr2, sSLSocket.getEnabledCipherSuites(), lx.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(v83.h(str));
        }
        return zy.J0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v40)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        v40 v40Var = (v40) obj;
        boolean z = v40Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, v40Var.c) && Arrays.equals(this.d, v40Var.d) && this.b == v40Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
