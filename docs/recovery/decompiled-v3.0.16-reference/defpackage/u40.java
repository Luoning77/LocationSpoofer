package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u40 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public v40 a() {
        return new v40(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(lx... lxVarArr) {
        if (!this.a) {
            fo.i("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(lxVarArr.length);
        for (lx lxVar : lxVarArr) {
            arrayList.add(lxVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            fo.i("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            fo.i("At least one cipher suite is required");
        }
    }

    public void d(sa3... sa3VarArr) {
        if (!this.a) {
            fo.i("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(sa3VarArr.length);
        for (sa3 sa3Var : sa3VarArr) {
            arrayList.add(sa3Var.e);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            fo.i("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            fo.i("At least one TLS version is required");
        }
    }
}
