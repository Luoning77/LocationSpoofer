package defpackage;

import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class be1 implements tl2, ql2 {
    public final ul2 e;
    public final ql2 f;
    public final ay1 g;

    public be1(tl2 tl2Var, Map map, ql2 ql2Var) {
        t tVar = new t(tl2Var, 24);
        hh0 hh0Var = vl2.a;
        this.e = new ul2(map, tVar);
        this.f = ql2Var;
        ay1 ay1Var = in2.a;
        this.g = new ay1();
    }

    @Override // defpackage.tl2
    public final sl2 a(String str, au0 au0Var) {
        return this.e.a(str, au0Var);
    }

    @Override // defpackage.tl2
    public final boolean b(Object obj) {
        return this.e.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.tl2
    public final Map c() {
        ay1 ay1Var = this.g;
        Object[] objArr = ay1Var.b;
        long[] jArr = ay1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.e.c();
    }

    @Override // defpackage.tl2
    public final Object d(String str) {
        return this.e.d(str);
    }

    @Override // defpackage.ql2
    public final void e(Object obj, p10 p10Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-858296452);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(this) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            this.f.e(obj, p10Var, ov0Var, i2 & 126);
            boolean zH = ov0Var.h(this) | ov0Var.h(obj);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                objQ = new j(25, this, obj);
                ov0Var.m0(objQ);
            }
            oi0.a(obj, (lu0) objQ, ov0Var);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(this, obj, p10Var, i, 10);
        }
    }

    @Override // defpackage.ql2
    public final void f(Object obj) {
        this.f.f(obj);
    }
}
