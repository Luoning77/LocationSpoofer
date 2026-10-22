package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class gr {
    public static final hh0 a = new hh0(1, new p4(10));
    public static Boolean b;

    public static final void a(final dj djVar, final q93 q93Var, final lq0 lq0Var, final List list, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        Executor executor = (Executor) ov0Var.j(a);
        if (executor == null || !b(djVar.f.length())) {
            ov0Var.c0(-517090505);
            ov0Var.p(false);
            return;
        }
        ov0Var.c0(-518737659);
        final qa1 qa1Var = (qa1) ov0Var.j(z30.n);
        final xb0 xb0Var = (xb0) ov0Var.j(z30.h);
        try {
            executor.execute(new Runnable() { // from class: er
                @Override // java.lang.Runnable
                public final void run() {
                    dy1 dy1VarC;
                    q93 q93Var2 = q93Var;
                    qa1 qa1Var2 = qa1Var;
                    dj djVar2 = djVar;
                    xb0 xb0Var2 = xb0Var;
                    lq0 lq0Var2 = lq0Var;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        nx2 nx2VarH = tx2.h();
                        dy1 dy1Var = nx2VarH instanceof dy1 ? (dy1) nx2VarH : null;
                        if (dy1Var == null || (dy1VarC = dy1Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            nx2 nx2VarJ = dy1VarC.j();
                            try {
                                q93 q93VarC = r93.c(q93Var2, qa1Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = uj0.e;
                                }
                                xp xpVar = new xp(djVar2, q93VarC, list2, xb0Var2, lq0Var2);
                                xpVar.c();
                                xpVar.a();
                                nx2.q(nx2VarJ);
                                dy1VarC.w().n();
                                dy1VarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                nx2.q(nx2VarJ);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                dy1VarC.c();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        ov0Var.p(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
