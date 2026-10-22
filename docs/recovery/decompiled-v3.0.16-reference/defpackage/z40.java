package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z40 implements zk2, Mutex {
    public final zk2 e;
    public final Mutex f;
    public y70 g;
    public Throwable h;
    public final y40 i;

    public z40(zk2 zk2Var) {
        Mutex mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
        zk2Var.getClass();
        mutexMutex$default.getClass();
        this.e = zk2Var;
        this.f = mutexMutex$default;
        this.i = new y40(this);
    }

    public final void A(StringBuilder sb) {
        int i;
        if (this.g == null && this.h == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            y70 y70Var = this.g;
            if (y70Var != null) {
                sb.append("\t\tCoroutine: " + y70Var);
                sb.append('\n');
            }
            Throwable th = this.h;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                Iterator it = zy.i0(l13.n0(string), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.i != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            y40 y40Var = this.i;
            synchronized (y40Var.c) {
                i = y40Var.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.zk2
    public final bl2 a0(String str) {
        str.getClass();
        y40 y40Var = this.i;
        if (y40Var == null) {
            return this.e.a0(str);
        }
        Object objC = y40Var.c(str);
        objC.getClass();
        return new x40((bl2) objC);
    }

    @Override // defpackage.zk2
    public final boolean c() {
        return this.e.c();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        y40 y40Var = this.i;
        if (y40Var != null) {
            y40Var.e(-1);
        }
        this.e.close();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final SelectClause2 getOnLock() {
        return this.f.getOnLock();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean holdsLock(Object obj) {
        obj.getClass();
        return this.f.holdsLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean isLocked() {
        return this.f.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object lock(Object obj, q60 q60Var) {
        return this.f.lock(obj, q60Var);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock(Object obj) {
        return this.f.tryLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void unlock(Object obj) {
        this.f.unlock(obj);
    }
}
