package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jz0 extends i53 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz0(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.i53
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                lz0 lz0Var = (lz0) this.f;
                lz0Var.getClass();
                try {
                    lz0Var.A.c0(2, 0, false);
                    break;
                } catch (IOException e) {
                    lz0Var.A(2, 2, e);
                }
                return -1L;
            case 1:
                fg0 fg0Var = (fg0) this.f;
                long jNanoTime = System.nanoTime();
                long j = Long.MIN_VALUE;
                ae2 ae2Var = null;
                int i2 = 0;
                for (ae2 ae2Var2 : (ConcurrentLinkedQueue) fg0Var.e) {
                    ae2Var2.getClass();
                    synchronized (ae2Var2) {
                        if (fg0Var.b(ae2Var2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - ae2Var2.q;
                            if (j2 > j) {
                                ae2Var = ae2Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = fg0Var.b;
                if (j < j3 && i <= fg0Var.a) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                ae2Var.getClass();
                synchronized (ae2Var) {
                    if (!ae2Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (ae2Var.q + j != jNanoTime) {
                        return 0L;
                    }
                    ae2Var.j = true;
                    ((ConcurrentLinkedQueue) fg0Var.e).remove(ae2Var);
                    Socket socket = ae2Var.d;
                    socket.getClass();
                    bh3.d(socket);
                    if (!((ConcurrentLinkedQueue) fg0Var.e).isEmpty()) {
                        return 0L;
                    }
                    ((j53) fg0Var.c).a();
                    return 0L;
                }
            default:
                ((au0) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(fg0 fg0Var, String str) {
        super(str, true);
        this.e = 1;
        this.f = fg0Var;
    }
}
