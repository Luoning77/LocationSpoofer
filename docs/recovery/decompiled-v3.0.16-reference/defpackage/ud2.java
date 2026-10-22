package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ud2 implements Runnable {
    public final gv e;
    public volatile AtomicInteger f = new AtomicInteger(0);
    public final /* synthetic */ xd2 g;

    public ud2(xd2 xd2Var, gv gvVar) {
        this.g = xd2Var;
        this.e = gvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k12 k12Var;
        String strConcat = "OkHttp ".concat(this.g.f.a.j());
        xd2 xd2Var = this.g;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            xd2Var.i.i();
            boolean z = false;
            try {
                try {
                    try {
                        this.e.onResponse(xd2Var, xd2Var.d());
                        k12Var = xd2Var.e;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            l82 l82Var = l82.a;
                            l82 l82Var2 = l82.a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((xd2Var.s ? "canceled " : "") + "call to " + xd2Var.f.a.j());
                            String string = sb.toString();
                            l82Var2.getClass();
                            l82.i(string, 4, e);
                        } else {
                            this.e.onFailure(xd2Var, e);
                        }
                        k12Var = xd2Var.e;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        xd2Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            vd0.d(iOException, th);
                            this.e.onFailure(xd2Var, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    xd2Var.e.e.b(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            k12Var.e.b(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
