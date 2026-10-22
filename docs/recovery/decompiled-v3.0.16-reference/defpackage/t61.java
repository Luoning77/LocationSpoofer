package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class t61 {
    public static final s61 d = new s61(new a71(false, false, false, false, true, "    ", false, "type", true, nx.g, true), xp1.l);
    public final a71 a;
    public final gt2 b;
    public final t1 c = new t1(18);

    public t61(a71 a71Var, gt2 gt2Var) {
        this.a = a71Var;
        this.b = gt2Var;
    }

    public final Object a(y81 y81Var, String str) {
        y81Var.getClass();
        str.getClass();
        fk fkVarN = ee0.n(this, str);
        Object objC = new e13(this, um3.OBJ, fkVarN, y81Var.getDescriptor()).c(y81Var);
        if (fkVarN.f() == 10) {
            return objC;
        }
        fk.n(fkVarN, "Expected EOF after parsing, but had " + ((String) fkVarN.g).charAt(fkVarN.b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(y81 y81Var, Object obj) {
        char[] cArr;
        y81Var.getClass();
        x8 x8Var = new x8(4, (byte) 0);
        nw nwVar = nw.c;
        synchronized (nwVar) {
            mo moVar = nwVar.a;
            cArr = null;
            char[] cArr2 = (char[]) (moVar.isEmpty() ? null : moVar.removeLast());
            if (cArr2 != null) {
                nwVar.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[WorkQueueKt.BUFFER_CAPACITY];
        }
        x8Var.c = cArr;
        try {
            new f13(this.a.d ? new k30(x8Var, this) : new e30(x8Var), this, um3.OBJ, new i71[um3.l.a()]).e(y81Var, obj);
            return x8Var.toString();
        } finally {
            x8Var.i();
        }
    }

    public final JsonElement c(String str) {
        str.getClass();
        return (JsonElement) a(g71.a, str);
    }
}
