package defpackage;

import android.database.SQLException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sk0 {
    public final rk0 a;
    public final qk0 b;

    public sk0(rk0 rk0Var, qk0 qk0Var) {
        this.a = rk0Var;
        this.b = qk0Var;
    }

    public final void a(zk2 zk2Var, Object obj) {
        try {
            this.a.insert(zk2Var, obj);
        } catch (SQLException e) {
            String message = e.getMessage();
            if (message == null) {
                throw e;
            }
            if (!l13.c0(message, "unique", true) && !l13.c0(message, "2067", false) && !l13.c0(message, "1555", false)) {
                throw e;
            }
            this.b.handle(zk2Var, obj);
        }
    }
}
