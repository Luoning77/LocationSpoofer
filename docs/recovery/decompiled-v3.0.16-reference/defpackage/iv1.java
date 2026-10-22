package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iv1 {
    public final String a;
    public final HashSet b;
    public final HashMap c;
    public final HashSet d;
    public final ArrayList e;

    public iv1() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.a = string;
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new ArrayList();
    }

    public final void a(v31 v31Var) {
        ir irVar = v31Var.a;
        this.c.put(zm3.w(irVar.b, irVar.a), v31Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && iv1.class == obj.getClass() && this.a.equals(((iv1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
