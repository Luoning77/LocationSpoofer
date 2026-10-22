package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ma2 {
    public final int a;
    public final au0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final z40[] f;
    public final Semaphore g;
    public final mo h;

    public ma2(int i, au0 au0Var) {
        this.a = i;
        this.b = au0Var;
        this.f = new z40[i];
        this.g = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        this.h = new mo(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(r60 r60Var) {
        ka2 ka2Var;
        mo moVar = this.h;
        if (r60Var instanceof ka2) {
            ka2Var = (ka2) r60Var;
            int i = ka2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ka2Var.g = i - Integer.MIN_VALUE;
            } else {
                ka2Var = new ka2(this, r60Var);
            }
        } else {
            ka2Var = new ka2(this, r60Var);
        }
        Object obj = ka2Var.e;
        int i2 = ka2Var.g;
        Semaphore semaphore = this.g;
        if (i2 == 0) {
            ee0.J(obj);
            ka2Var.g = 1;
            Object objAcquire = semaphore.acquire(ka2Var);
            z70 z70Var = z70.e;
            if (objAcquire == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    mh0.d0(21, "Connection pool is closed");
                    throw null;
                }
                if (moVar.isEmpty() && this.d < this.a) {
                    z40 z40Var = new z40((zk2) this.b.invoke());
                    z40[] z40VarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    z40VarArr[i3] = z40Var;
                    moVar.addLast(z40Var);
                }
                z40 z40Var2 = (z40) moVar.removeLast();
                reentrantLock.unlock();
                return z40Var2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            semaphore.release();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:29:0x0065, B:31:0x0069, B:35:0x0071, B:39:0x0078), top: B:48:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071 A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:29:0x0065, B:31:0x0069, B:35:0x0071, B:39:0x0078), top: B:48:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #2 {all -> 0x006d, blocks: (B:29:0x0065, B:31:0x0069, B:35:0x0071, B:39:0x0078), top: B:48:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0054 -> B:25:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0054
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r7, defpackage.sy r9, defpackage.r60 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.la2
            if (r0 == 0) goto L13
            r0 = r10
            la2 r0 = (defpackage.la2) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            la2 r0 = new la2
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.h
            int r1 = r0.j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r7 = r0.e
            we2 r9 = r0.g
            au0 r1 = r0.f
            defpackage.ee0.J(r10)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r10 = move-exception
            goto L60
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r3
        L34:
            defpackage.ee0.J(r10)
        L37:
            we2 r10 = new we2
            r10.<init>()
            m r1 = new m     // Catch: java.lang.Throwable -> L5b
            r4 = 20
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0.f = r9     // Catch: java.lang.Throwable -> L5b
            r0.g = r10     // Catch: java.lang.Throwable -> L5b
            r0.e = r7     // Catch: java.lang.Throwable -> L5b
            r0.j = r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = kotlinx.coroutines.TimeoutKt.m30withTimeoutKLykuaI(r7, r1, r0)     // Catch: java.lang.Throwable -> L5b
            z70 r4 = defpackage.z70.e
            if (r1 != r4) goto L54
            return r4
        L54:
            r1 = r9
            r9 = r10
        L56:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L65
        L5b:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L60:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L65:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L6f
            r9.invoke()     // Catch: java.lang.Throwable -> L6d
            goto L76
        L6d:
            r7 = move-exception
            goto L79
        L6f:
            if (r0 != 0) goto L78
            java.lang.Object r10 = r10.e     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L76
            return r10
        L76:
            r0 = r1
            goto L37
        L78:
            throw r0     // Catch: java.lang.Throwable -> L6d
        L79:
            java.lang.Object r8 = r10.e
            z40 r8 = (defpackage.z40) r8
            if (r8 == 0) goto L82
            r6.e(r8)
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma2.b(long, sy, r60):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (z40 z40Var : this.f) {
                if (z40Var != null) {
                    z40Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        mo moVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            mg1 mg1VarN = am1.n();
            int i = moVar.g;
            for (int i2 = 0; i2 < i; i2++) {
                mg1VarN.add(moVar.get(i2));
            }
            mg1 mg1VarF = am1.f(mg1VarN);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + this.g.getAvailablePermits() + ", ");
            sb.append("queue=(size=" + mg1VarF.a() + ")[" + zy.s0(mg1VarF, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            z40[] z40VarArr = this.f;
            int length = z40VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                z40 z40Var = z40VarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(z40Var != null ? z40Var.e.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (z40Var != null) {
                    z40Var.A(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(z40 z40Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(z40Var);
            reentrantLock.unlock();
            this.g.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
