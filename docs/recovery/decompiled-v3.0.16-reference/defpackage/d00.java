package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d00 extends s {
    public final lx1 P;
    public final lx1 Q;
    public x92 R;
    public Job S;
    public Job T;
    public boolean U;
    public boolean V;
    public long W;
    public boolean X;
    public s11 Y;
    public Job Z;
    public Job a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public boolean e0;

    public d00(au0 au0Var, ix1 ix1Var) {
        super(ix1Var, null, false, true, null, null, au0Var);
        lx1 lx1Var = nj1.a;
        this.P = new lx1();
        this.Q = new lx1();
        this.W = -1L;
        this.d0 = -1L;
    }

    public final void B1(boolean z) {
        if (z) {
            this.Y = null;
            Job job = this.Z;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.Z = null;
            Job job2 = this.a0;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.a0 = null;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1L;
            this.e0 = false;
        } else {
            this.R = null;
            Job job3 = this.S;
            if (job3 != null) {
                Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
            }
            this.S = null;
            Job job4 = this.T;
            if (job4 != null) {
                Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
            }
            this.T = null;
            this.U = false;
            this.V = false;
            this.W = -1L;
            this.X = false;
        }
        s1(z);
    }

    public final void C1(long j, s11 s11Var) {
        if (this.z && !this.e0) {
            t1(s11Var.c, true);
            this.d0 = j;
            if (!this.c0 && !this.b0) {
                this.A.invoke();
            }
        }
        this.Y = null;
        this.e0 = false;
        this.b0 = false;
        Job job = this.Z;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.Z = null;
        this.c0 = false;
    }

    public final void D1(long j, x92 x92Var) {
        if (this.z && !this.X) {
            t1(x92Var.c, false);
            this.W = j;
            if (!this.V && !this.U) {
                this.A.invoke();
            }
        }
        this.R = null;
        this.X = false;
        this.U = false;
        Job job = this.S;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.S = null;
        this.V = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:5:0x0018->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[LOOP:2: B:20:0x0065->B:30:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[EDGE_INSN: B:34:0x0056->B:17:0x0056 BREAK  A[LOOP:0: B:5:0x0018->B:15:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098 A[EDGE_INSN: B:39:0x0098->B:31:0x0098 BREAK  A[LOOP:2: B:20:0x0065->B:30:0x0095], SYNTHETIC] */
    public final void E1() {
        long j;
        long j2;
        long j3;
        lx1 lx1Var = this.P;
        Object[] objArr = lx1Var.c;
        long[] jArr = lx1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr[i];
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j4 & 255) < 128) {
                            Job.DefaultImpls.cancel$default((Job) objArr[(i << 3) + i3], (CancellationException) null, 1, (Object) null);
                        }
                        j4 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        lx1Var.a();
        lx1 lx1Var2 = this.Q;
        Object[] objArr2 = lx1Var2.c;
        long[] jArr2 = lx1Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & j3) == j3) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j5 & j2) < j) {
                            ((c00) objArr2[(i4 << 3) + i6]).getClass();
                            Job.DefaultImpls.cancel$default((Job) null, (CancellationException) null, 1, (Object) null);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        lx1Var2.a();
    }

    @Override // defpackage.s, defpackage.ba2
    public final void K0() {
        super.K0();
        B1(false);
    }

    @Override // defpackage.a21
    public final void T(q01 q01Var, q92 q92Var) {
        ArrayList arrayList = (ArrayList) q01Var.c;
        w1();
        if (this.z && this.D == null) {
            zv0 zv0Var = new zv0(this);
            m1(zv0Var);
            this.D = zv0Var;
        }
        int i = 0;
        if (q92Var != q92.f) {
            if (q92Var != q92.g || this.Y == null || this.c0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                s11 s11Var = (s11) arrayList.get(i);
                if (s11Var.i && s11Var != this.Y) {
                    B1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.Y == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ce0.i((s11) arrayList.get(i2))) {
                    s11 s11Var2 = (s11) arrayList.get(0);
                    s11Var2.i = true;
                    this.Y = s11Var2;
                    if (this.z) {
                        Job job = this.a0;
                        if (job != null && job.isActive()) {
                            ((aj3) xq1.C(this, z30.u)).getClass();
                            if (s11Var2.b - this.d0 < 40) {
                                this.e0 = true;
                                return;
                            }
                            this.b0 = true;
                            Job job2 = this.a0;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                            }
                            this.a0 = null;
                        }
                        this.c0 = false;
                        u1(s11Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.c0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                s11 s11Var3 = (s11) arrayList.get(i3);
                if (!s11Var3.h || s11Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((s11) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            s11 s11Var4 = (s11) arrayList.get(0);
            s11Var4.i = true;
            long j = s11Var4.b;
            s11 s11Var5 = this.Y;
            s11Var5.getClass();
            C1(j, s11Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            s11 s11Var6 = (s11) arrayList.get(i4);
            if (s11Var6.i || !s11Var6.h || s11Var6.d) {
                float fD = ((aj3) xq1.C(this, z30.u)).d();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    s11 s11Var7 = (s11) arrayList.get(i5);
                    long j2 = s11Var7.c;
                    s11 s11Var8 = this.Y;
                    s11Var8.getClass();
                    boolean z = Math.abs(c12.c(c12.d(j2, s11Var8.c))) > fD;
                    if (s11Var7.i || z) {
                        B1(true);
                        return;
                    }
                }
                return;
            }
        }
        s11 s11Var9 = (s11) arrayList.get(0);
        s11Var9.i = true;
        long j3 = s11Var9.b;
        s11 s11Var10 = this.Y;
        s11Var10.getClass();
        C1(j3, s11Var10);
    }

    @Override // defpackage.a21
    public final void U() {
        B1(true);
    }

    @Override // defpackage.s, defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        super.d0(p92Var, q92Var, j);
        if (q92Var != q92.f) {
            if (q92Var != q92.g || this.R == null || this.V) {
                return;
            }
            List list = p92Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                x92 x92Var = (x92) list.get(i);
                if (x92Var.b() && x92Var != this.R) {
                    B1(false);
                    return;
                }
            }
            return;
        }
        if (this.R == null) {
            if (g53.f(p92Var, true, false)) {
                x92 x92Var2 = (x92) p92Var.a.get(0);
                x92Var2.a();
                this.R = x92Var2;
                if (this.z) {
                    Job job = this.T;
                    if (job != null && job.isActive()) {
                        ((aj3) xq1.C(this, z30.u)).getClass();
                        if (x92Var2.b - this.W < 40) {
                            this.X = true;
                            return;
                        }
                        this.U = true;
                        Job job2 = this.T;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        this.T = null;
                    }
                    this.V = false;
                    v1(x92Var2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = p92Var.c;
        List list2 = p92Var.a;
        if (this.V) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!mh0.r((x92) list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((x92) list2.get(i4)).a();
                    }
                    return;
                }
            }
            x92 x92Var3 = (x92) list2.get(0);
            x92Var3.a();
            long j2 = x92Var3.b;
            x92 x92Var4 = this.R;
            x92Var4.getClass();
            D1(j2, x92Var4);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!mh0.q((x92) list2.get(i5))) {
                long jR1 = r1(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    x92 x92Var5 = (x92) list2.get(i6);
                    if (x92Var5.b() || mh0.N(x92Var5, j, jR1)) {
                        B1(false);
                        return;
                    }
                }
                return;
            }
        }
        x92 x92Var6 = (x92) list2.get(0);
        x92Var6.a();
        long j3 = x92Var6.b;
        x92 x92Var7 = this.R;
        x92Var7.getClass();
        D1(j3, x92Var7);
    }

    @Override // defpackage.cv1
    public final void g1() {
        E1();
    }

    @Override // defpackage.s
    public final void x1() {
        E1();
    }

    @Override // defpackage.s
    public final boolean y1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.s
    public final void z1(KeyEvent keyEvent) {
        long jI = mh0.I(keyEvent);
        lx1 lx1Var = this.P;
        boolean z = false;
        if (lx1Var.e(jI) != null) {
            Job job = (Job) lx1Var.e(jI);
            if (job != null) {
                if (job.isActive()) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                } else {
                    z = true;
                }
            }
            lx1Var.g(jI);
        }
        if (z) {
            return;
        }
        this.A.invoke();
    }

    @Override // defpackage.s
    public final void p1(ss2 ss2Var) {
    }
}
