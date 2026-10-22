package defpackage;

import android.os.Trace;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class eh1 implements lu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Collection l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ eh1(ke2 ke2Var, ay1 ay1Var, ay1 ay1Var2, List list, List list2, ay1 ay1Var3, List list3, ay1 ay1Var4, Set set) {
        this.h = ke2Var;
        this.i = ay1Var;
        this.j = ay1Var2;
        this.f = list;
        this.g = list2;
        this.k = ay1Var3;
        this.l = list3;
        this.m = ay1Var4;
        this.n = set;
    }

    /* JADX WARN: Code duplicated, block: B:280:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x018e A[LOOP:4: B:81:0x0150->B:99:0x018e, LOOP_END] */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        boolean z;
        mf3 mf3Var;
        nx2 rc3Var;
        int i;
        long j;
        ke2 ke2Var;
        boolean z2;
        switch (this.e) {
            case 0:
                List list = this.f;
                List list2 = this.g;
                lu0 lu0Var = (lu0) this.h;
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.k;
                HashSet hashSet = (HashSet) this.l;
                HashSet hashSet2 = (HashSet) this.m;
                lu0 lu0Var2 = (lu0) this.i;
                au0 au0Var = (au0) this.n;
                lu0 lu0Var3 = (lu0) this.j;
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                kd1Var.c(list.size(), new l3(14, new zs0(23), list), new u3(list, 5), new p10(new ih1(list, lu0Var), true, 802480018));
                kd1Var.c(list2.size(), new l3(15, new zs0(24), list2), new u3(list2, 6), new p10(new jh1(list2, simpleDateFormat, hashSet, hashSet2, lu0Var2, au0Var, lu0Var3), true, 802480018));
                return mf3.a;
            default:
                mf3 mf3Var2 = mf3.a;
                ke2 ke2Var2 = (ke2) this.h;
                ay1 ay1Var = (ay1) this.i;
                ay1 ay1Var2 = (ay1) this.j;
                List list3 = this.f;
                List list4 = this.g;
                ay1 ay1Var3 = (ay1) this.k;
                List list5 = (List) this.l;
                ay1 ay1Var4 = (ay1) this.m;
                Set set = (Set) this.n;
                long jLongValue = ((Long) obj).longValue();
                MutableStateFlow mutableStateFlow = ke2.z;
                synchronized (ke2Var2.c) {
                    z = ke2Var2.z();
                }
                if (z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((xp) ke2Var2.a.g).h(new ec(3, jLongValue));
                        synchronized (tx2.c) {
                            ay1 ay1Var5 = tx2.j.h;
                            z2 = ay1Var5 != null && ay1Var5.h();
                        }
                        if (z2) {
                            tx2.c();
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    ke2Var2.K();
                    synchronized (ke2Var2.c) {
                        try {
                            gy1 gy1Var = ke2Var2.i;
                            Object[] objArr = gy1Var.e;
                            int i2 = gy1Var.g;
                            for (int i3 = 0; i3 < i2; i3++) {
                                list3.add((t30) objArr[i3]);
                            }
                            ke2Var2.i.g();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ay1Var.b();
                    ay1Var2.b();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            nx2 nx2VarH = tx2.h();
                            if (nx2VarH instanceof dy1) {
                                rc3Var = new qc3((dy1) nx2VarH, null, null, true, false);
                                i = 0;
                            } else {
                                i = 0;
                                rc3Var = new rc3(nx2VarH, null, true, false);
                            }
                            try {
                                nx2 nx2VarJ = rc3Var.j();
                                try {
                                    if (!list5.isEmpty()) {
                                        try {
                                            int size = list5.size();
                                            for (int i4 = i; i4 < size; i4++) {
                                                ay1Var4.a((t30) list5.get(i4));
                                            }
                                            int size2 = list5.size();
                                            for (int i5 = i; i5 < size2; i5++) {
                                                ((t30) list5.get(i5)).d();
                                            }
                                            list5.clear();
                                        } catch (Throwable th3) {
                                            try {
                                                ke2Var2.J(th3, null);
                                                je2.f(ke2Var2, list3, list4, list5, ay1Var3, ay1Var4, ay1Var, ay1Var2);
                                                list5.clear();
                                                nx2.q(nx2VarJ);
                                                rc3Var.c();
                                                Trace.endSection();
                                                return mf3Var2;
                                            } catch (Throwable th4) {
                                                list5.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    if (ay1Var3.h()) {
                                        try {
                                            ay1Var4.j(ay1Var3);
                                            Object[] objArr2 = ay1Var3.b;
                                            j = 128;
                                            long[] jArr = ay1Var3.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                ke2Var = ke2Var2;
                                                int i6 = 0;
                                                while (true) {
                                                    try {
                                                        long j2 = jArr[i6];
                                                        Object[] objArr3 = objArr2;
                                                        mf3Var = mf3Var2;
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                            for (int i8 = 0; i8 < i7; i8++) {
                                                                if ((j2 & 255) < 128) {
                                                                    try {
                                                                        ((t30) objArr3[(i6 << 3) + i8]).f();
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        ke2Var2 = ke2Var;
                                                                        try {
                                                                            ke2Var2.J(th, null);
                                                                            je2.f(ke2Var2, list3, list4, list5, ay1Var3, ay1Var4, ay1Var, ay1Var2);
                                                                            ay1Var3.b();
                                                                            nx2.q(nx2VarJ);
                                                                            rc3Var.c();
                                                                            Trace.endSection();
                                                                            return mf3Var;
                                                                        } catch (Throwable th6) {
                                                                            ay1Var3.b();
                                                                            throw th6;
                                                                        }
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (i7 == 8) {
                                                                if (i6 != length) {
                                                                    i6++;
                                                                    mf3Var2 = mf3Var;
                                                                    objArr2 = objArr3;
                                                                }
                                                            }
                                                        } else if (i6 != length) {
                                                            i6++;
                                                            mf3Var2 = mf3Var;
                                                            objArr2 = objArr3;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        mf3Var = mf3Var2;
                                                    }
                                                }
                                            } else {
                                                mf3Var = mf3Var2;
                                                ke2Var = ke2Var2;
                                            }
                                            ay1Var3.b();
                                            ke2Var2 = ke2Var;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            mf3Var = mf3Var2;
                                        }
                                    } else {
                                        mf3Var = mf3Var2;
                                        j = 128;
                                    }
                                    if (ay1Var4.h()) {
                                        try {
                                            Object[] objArr4 = ay1Var4.b;
                                            long[] jArr2 = ay1Var4.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = 0;
                                                while (true) {
                                                    long j3 = jArr2[i9];
                                                    Object[] objArr5 = objArr4;
                                                    long[] jArr3 = jArr2;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        for (int i11 = 0; i11 < i10; i11++) {
                                                            if ((j3 & 255) < j) {
                                                                ((t30) objArr5[(i9 << 3) + i11]).g();
                                                            }
                                                            j3 >>= 8;
                                                            break;
                                                        }
                                                        if (i10 == 8) {
                                                        }
                                                    }
                                                    if (i9 != length2) {
                                                        i9++;
                                                        objArr4 = objArr5;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                            ay1Var4.b();
                                        } catch (Throwable th9) {
                                            try {
                                                ke2Var2.J(th9, null);
                                                je2.f(ke2Var2, list3, list4, list5, ay1Var3, ay1Var4, ay1Var, ay1Var2);
                                                ay1Var4.b();
                                                nx2.q(nx2VarJ);
                                                rc3Var.c();
                                                Trace.endSection();
                                                return mf3Var;
                                            } catch (Throwable th10) {
                                                ay1Var4.b();
                                                throw th10;
                                            }
                                        }
                                    }
                                    nx2.q(nx2VarJ);
                                    rc3Var.c();
                                    synchronized (ke2Var2.c) {
                                        if (ke2Var2.y() != null) {
                                            j30.a("unexpected to get continuation here");
                                            break;
                                        }
                                    }
                                    tx2.h().m();
                                    ay1Var2.b();
                                    ay1Var.b();
                                    ke2Var2.q = null;
                                } catch (Throwable th11) {
                                    nx2.q(nx2VarJ);
                                    throw th11;
                                }
                            } catch (Throwable th12) {
                                rc3Var.c();
                                throw th12;
                            }
                        } else {
                            mf3Var = mf3Var2;
                            try {
                                int size3 = list3.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    t30 t30Var = (t30) list3.get(i12);
                                    t30 t30VarI = ke2Var2.I(t30Var, ay1Var);
                                    if (t30VarI != null) {
                                        list5.add(t30VarI);
                                    }
                                    ay1Var2.a(t30Var);
                                }
                                list3.clear();
                                if (ay1Var.h() || ke2Var2.i.g != 0) {
                                    synchronized (ke2Var2.c) {
                                        try {
                                            List listD = ke2Var2.D();
                                            int size4 = listD.size();
                                            for (int i13 = 0; i13 < size4; i13++) {
                                                t30 t30Var2 = (t30) listD.get(i13);
                                                if (!ay1Var2.c(t30Var2) && t30Var2.v(set)) {
                                                    list3.add(t30Var2);
                                                }
                                            }
                                            gy1 gy1Var2 = ke2Var2.i;
                                            int i14 = gy1Var2.g;
                                            int i15 = 0;
                                            int i16 = 0;
                                            while (true) {
                                                Object[] objArr6 = gy1Var2.e;
                                                if (i15 < i14) {
                                                    t30 t30Var3 = (t30) objArr6[i15];
                                                    if (!ay1Var2.c(t30Var3) && !list3.contains(t30Var3)) {
                                                        list3.add(t30Var3);
                                                        i16++;
                                                    } else if (i16 > 0) {
                                                        Object[] objArr7 = gy1Var2.e;
                                                        objArr7[i15 - i16] = objArr7[i15];
                                                    }
                                                    i15++;
                                                } else {
                                                    int i17 = i14 - i16;
                                                    Arrays.fill(objArr6, i17, i14, (Object) null);
                                                    gy1Var2.g = i17;
                                                }
                                            }
                                        } catch (Throwable th13) {
                                            throw th13;
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        je2.g(list4, ke2Var2);
                                        while (!list4.isEmpty()) {
                                            List listH = ke2Var2.H(list4, ay1Var);
                                            ay1Var3.getClass();
                                            Iterator it = listH.iterator();
                                            while (it.hasNext()) {
                                                ay1Var3.k(it.next());
                                            }
                                            je2.g(list4, ke2Var2);
                                        }
                                    } catch (Throwable th14) {
                                        ke2Var2.J(th14, null);
                                        je2.f(ke2Var2, list3, list4, list5, ay1Var3, ay1Var4, ay1Var, ay1Var2);
                                    }
                                }
                                mf3Var2 = mf3Var;
                            } catch (Throwable th15) {
                                try {
                                    ke2Var2.J(th15, null);
                                    je2.f(ke2Var2, list3, list4, list5, ay1Var3, ay1Var4, ay1Var, ay1Var2);
                                    list3.clear();
                                } catch (Throwable th16) {
                                    list3.clear();
                                    throw th16;
                                }
                            }
                        }
                        Trace.endSection();
                        return mf3Var;
                    }
                } catch (Throwable th17) {
                    Trace.endSection();
                    throw th17;
                }
        }
    }

    public /* synthetic */ eh1(List list, List list2, lu0 lu0Var, SimpleDateFormat simpleDateFormat, HashSet hashSet, HashSet hashSet2, lu0 lu0Var2, au0 au0Var, lu0 lu0Var3) {
        this.f = list;
        this.g = list2;
        this.h = lu0Var;
        this.k = simpleDateFormat;
        this.l = hashSet;
        this.m = hashSet2;
        this.i = lu0Var2;
        this.n = au0Var;
        this.j = lu0Var3;
    }
}
