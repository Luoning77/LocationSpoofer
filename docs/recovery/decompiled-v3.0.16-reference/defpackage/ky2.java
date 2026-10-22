package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ky2 {
    public final lu0 a;
    public boolean c;
    public g8 h;
    public jy2 i;
    public final AtomicReference b = new AtomicReference(null);
    public final iy2 d = new iy2(this, 0);
    public final ge2 e = new ge2(this, 13);
    public final gy1 f = new gy1(new jy2[16]);
    public final Object g = new Object();
    public long j = -1;

    public ky2(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final void a() {
        synchronized (this.g) {
            gy1 gy1Var = this.f;
            Object[] objArr = gy1Var.e;
            int i = gy1Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                jy2 jy2Var = (jy2) objArr[i2];
                jy2Var.e.a();
                jy2Var.f.a();
                jy2Var.l.a();
                jy2Var.m.clear();
            }
        }
    }

    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        j30.b("Unexpected notification");
                        fo.d();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                gy1 gy1Var = this.f;
                Object[] objArr = gy1Var.e;
                int i = gy1Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((jy2) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj, lu0 lu0Var, au0 au0Var) {
        gy1 gy1Var;
        Object obj2;
        jy2 jy2Var;
        boolean z;
        jy2 jy2Var2;
        long j;
        long j2;
        jy2 jy2Var3;
        nx2 qc3Var;
        long j3;
        ox1 ox1Var;
        int i;
        long j4;
        ox1 ox1Var2;
        long jB = a83.b();
        synchronized (this.g) {
            gy1Var = this.f;
            Object[] objArr = gy1Var.e;
            int i2 = gy1Var.g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((jy2) obj2).a == lu0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            jy2Var = (jy2) obj2;
            z = true;
            if (jy2Var == null) {
                lu0Var.getClass();
                da0.o(1, lu0Var);
                jy2Var = new jy2(lu0Var);
                gy1Var.b(jy2Var);
            }
            jy2Var2 = this.i;
            j = this.j;
        }
        Object obj3 = gy1Var;
        if (j != -1 && j != jB) {
            obj3 = gy1Var;
            hb2.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jB + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
        }
        try {
            obj3 = gy1Var;
            synchronized (this.g) {
                try {
                    this.i = jy2Var;
                    this.j = jB;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            ge2 ge2Var = this.e;
            Object obj4 = jy2Var.b;
            ox1 ox1Var3 = jy2Var.c;
            int i4 = jy2Var.d;
            jy2Var.b = obj;
            jy2Var.c = (ox1) jy2Var.f.g(obj);
            if (jy2Var.d == -1) {
                jy2Var.d = Long.hashCode(tx2.h().g());
            }
            nv0 nv0Var = jy2Var.i;
            gy1 gy1VarA = by2.a();
            try {
                gy1VarA.b(nv0Var);
                if (ge2Var == null) {
                    au0Var.invoke();
                    jy2Var3 = jy2Var;
                } else {
                    nx2 nx2Var = (nx2) tx2.b.h();
                    if (nx2Var instanceof qc3) {
                        jy2Var3 = jy2Var;
                        if (((qc3) nx2Var).t == a83.b()) {
                            lu0 lu0Var2 = ((qc3) nx2Var).r;
                            lu0 lu0Var3 = ((qc3) nx2Var).s;
                            try {
                                ((qc3) nx2Var).r = tx2.i(ge2Var, lu0Var2, true);
                                ((qc3) nx2Var).s = lu0Var3;
                                au0Var.invoke();
                                ((qc3) nx2Var).r = lu0Var2;
                                ((qc3) nx2Var).s = lu0Var3;
                            } catch (Throwable th2) {
                                ((qc3) nx2Var).r = lu0Var2;
                                ((qc3) nx2Var).s = lu0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        jy2Var3 = jy2Var;
                    }
                    if (nx2Var == null || (nx2Var instanceof dy1)) {
                        qc3Var = new qc3(nx2Var instanceof dy1 ? (dy1) nx2Var : null, ge2Var, null, true, false);
                    } else {
                        qc3Var = nx2Var.u(ge2Var);
                    }
                    try {
                        nx2 nx2VarJ = qc3Var.j();
                        try {
                            au0Var.invoke();
                            nx2.q(nx2VarJ);
                            qc3Var.c();
                        } catch (Throwable th3) {
                            try {
                                nx2.q(nx2VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    qc3Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    gy1VarA.k(gy1VarA.g - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                gy1VarA.k(gy1VarA.g - 1);
                jy2 jy2Var4 = jy2Var3;
                Object obj5 = jy2Var4.b;
                obj5.getClass();
                int i5 = jy2Var4.d;
                ox1 ox1Var4 = jy2Var4.c;
                if (ox1Var4 != null) {
                    try {
                        long[] jArr = ox1Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                ox1 ox1Var5 = ox1Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            ox1Var2 = ox1Var5;
                                            Object obj6 = ox1Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = ox1Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    jy2Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    ox1Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = jy2Var2;
                                                    this.j = j2;
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            ox1Var2 = ox1Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        ox1Var5 = ox1Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    ox1Var = ox1Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    ox1Var = ox1Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                ox1Var4 = ox1Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = jy2Var2;
                            this.j = j2;
                        }
                        throw th;
                    }
                } else {
                    j3 = j;
                }
                jy2Var4.b = obj4;
                jy2Var4.c = ox1Var3;
                jy2Var4.d = i4;
                synchronized (this.g) {
                    this.i = jy2Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                gy1VarA.k(gy1VarA.g - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void d() {
        iy2 iy2Var = this.d;
        tx2.b(tx2.a);
        synchronized (tx2.c) {
            tx2.h = zy.w0(tx2.h, iy2Var);
        }
        this.h = new g8(iy2Var);
    }
}
