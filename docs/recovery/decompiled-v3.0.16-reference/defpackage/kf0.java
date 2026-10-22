package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class kf0 extends lb0 implements ba2, a21, u30, yv0 {
    public mf0 A;
    public boolean B;
    public boolean C;
    public ge0 D;
    public je0 E;
    public ie0 F;
    public he0 G;
    public ke0 H;
    public us1 I;
    public px0 K;
    public z11 L;
    public x32 u;
    public lu0 v;
    public boolean w;
    public ix1 x;
    public zv0 y;
    public Channel z;
    public long J = 9205357640488583168L;
    public long M = 0;

    public kf0(lu0 lu0Var, boolean z, ix1 ix1Var, x32 x32Var) {
        this.u = x32Var;
        this.v = lu0Var;
        this.w = z;
        this.x = ix1Var;
    }

    public static void t1(kf0 kf0Var, x92 x92Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ie0 ie0Var = kf0Var.F;
        if (ie0Var == null) {
            ie0Var = new ie0();
            ie0Var.j = null;
            ie0Var.k = Long.MAX_VALUE;
            ie0Var.l = false;
            kf0Var.F = ie0Var;
        }
        ie0Var.j = x92Var;
        ie0Var.k = j;
        px0 px0Var = kf0Var.K;
        x32 x32Var = kf0Var.u;
        if (px0Var == null) {
            kf0Var.K = new px0(x32Var, 2);
        } else {
            px0Var.b = x32Var;
            px0Var.a = j2;
        }
        ie0Var.l = false;
        kf0Var.H = ie0Var;
    }

    public final Channel A1() {
        Channel channel = this.z;
        if (channel != null) {
            return channel;
        }
        fo.i("Events channel not initialized.");
        return null;
    }

    public final us1 B1() {
        us1 us1Var = this.I;
        if (us1Var != null) {
            return us1Var;
        }
        fo.i("Velocity Tracker not initialized.");
        return null;
    }

    public final void C1(long j, x92 x92Var) {
        long jH = xp1.N(this.e).h(0L);
        if (!c12.b(this.J, 9205357640488583168L) && !c12.b(jH, this.J)) {
            this.M = c12.e(this.M, c12.d(jH, this.J));
        }
        this.J = jH;
        k93.a(B1(), x92Var, this.M);
        A1().mo32trySendJP2dKIU(new me0(j, false));
    }

    public final void D1(x92 x92Var, x92 x92Var2, long j) {
        if (this.I == null) {
            this.I = new us1(26, (byte) 0);
        }
        k93.a(B1(), x92Var, 0L);
        long jD = c12.d(x92Var2.c, j);
        this.M = 0L;
        if (((Boolean) this.v.invoke(new ga2(x92Var.i))).booleanValue()) {
            if (!this.B) {
                if (this.z == null) {
                    this.z = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                }
                F1();
            }
            this.J = xp1.N(this).h(0L);
            A1().mo32trySendJP2dKIU(new ne0(jD));
        }
    }

    public abstract boolean E1();

    public final void F1() {
        this.B = true;
        if (this.z == null) {
            this.z = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new jf0(this, null), 3, null);
    }

    public final void G1(lu0 lu0Var, boolean z, ix1 ix1Var, x32 x32Var, boolean z2) {
        this.v = lu0Var;
        boolean z3 = true;
        if (this.w != z) {
            this.w = z;
            if (!z) {
                p1();
                this.L = null;
            }
            z2 = true;
        }
        if (!o51.f(this.x, ix1Var)) {
            p1();
            this.x = ix1Var;
        }
        if (this.u != x32Var) {
            this.u = x32Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.C;
            le0 le0Var = le0.a;
            if (z4) {
                r1();
                if (this.B) {
                    A1().mo32trySendJP2dKIU(le0Var);
                }
                this.I = null;
            }
            z11 z11Var = this.L;
            if (z11Var != null) {
                z11Var.a();
                kf0 kf0Var = z11Var.a;
                if (kf0Var.B) {
                    kf0Var.u1(le0Var);
                }
                z11Var.g = null;
                x8 x8Var = z11Var.k;
                x8Var.b = 0;
                ((kx1) x8Var.c).b = 0;
            }
        }
    }

    @Override // defpackage.ba2
    public final void K0() {
        if (this.C) {
            r1();
            if (this.B) {
                A1().mo32trySendJP2dKIU(le0.a);
            }
            this.I = null;
        }
        this.C = false;
    }

    @Override // defpackage.a21
    public final void T(q01 q01Var, q92 q92Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        u11 u11Var;
        int i = q01Var.b;
        ArrayList arrayList = (ArrayList) q01Var.c;
        if (this.y == null) {
            zv0 zv0Var = new zv0(this);
            m1(zv0Var);
            this.y = zv0Var;
        }
        if (this.w) {
            z11 z11Var = this.L;
            if (z11Var == null) {
                z11Var = new z11(this);
                this.L = z11Var;
            }
            z11 z11Var2 = z11Var;
            kf0 kf0Var = z11Var2.a;
            vd0 vd0Var = z11Var2.f;
            Object obj6 = vd0Var;
            if (vd0Var == null) {
                u11 u11Var2 = z11Var2.b;
                if (u11Var2 == null) {
                    u11Var = u11Var2;
                    u11 u11Var3 = new u11();
                    u11Var3.i = t11.g;
                    u11Var3.j = false;
                    z11Var2.b = u11Var3;
                    u11Var = u11Var3;
                }
                u11Var = u11Var2;
                z11Var2.f = u11Var;
                obj6 = u11Var;
            }
            boolean z = obj6 instanceof u11;
            q92 q92Var2 = q92.e;
            boolean z2 = true;
            q92 q92Var3 = q92.f;
            if (z) {
                u11 u11Var4 = (u11) obj6;
                if (arrayList.isEmpty()) {
                    return;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!ce0.i((s11) arrayList.get(i2))) {
                        return;
                    }
                }
                s11 s11Var = (s11) zy.n0(arrayList);
                int i3 = y11.a[u11Var4.i.ordinal()];
                t11 t11Var = t11.f;
                t11 t11Var2 = t11.e;
                t11 t11Var3 = i3 == 1 ? !kf0Var.E1() ? t11Var2 : t11Var : u11Var4.i;
                u11Var4.i = t11Var3;
                if (q92Var == q92Var2 && t11Var3 == t11Var) {
                    s11Var.i = true;
                    u11Var4.j = true;
                }
                if (q92Var == q92Var3) {
                    if (t11Var3 == t11Var2) {
                        z11.c(z11Var2, s11Var, s11Var.a, 0L, 12);
                        return;
                    }
                    if (u11Var4.j) {
                        z11Var2.f(s11Var, s11Var, new r11(i), 0L);
                        z11Var2.e(s11Var, new r11(i), 0L);
                        long j = s11Var.a;
                        x11 x11Var = z11Var2.c;
                        if (x11Var == null) {
                            x11Var = new x11();
                            x11Var.i = Long.MAX_VALUE;
                            z11Var2.c = x11Var;
                        }
                        x11Var.i = j;
                        z11Var2.f = x11Var;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = obj6 instanceof w11;
            q92 q92Var4 = q92.g;
            if (!z3) {
                if (obj6 instanceof v11) {
                    v11 v11Var = (v11) obj6;
                    if (q92Var != q92Var4) {
                        return;
                    }
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((s11) arrayList.get(i4)).i) {
                            z2 = false;
                            break;
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((s11) arrayList.get(i5)).d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long jQ = ce0.Q((s11) zy.n0(arrayList), kf0Var.u, new r11(i));
                                s11 s11Var2 = v11Var.i;
                                s11Var2.getClass();
                                long jD = c12.d(jQ, ce0.Q(s11Var2, kf0Var.u, new r11(i)));
                                s11 s11Var3 = v11Var.i;
                                if (s11Var3 != null) {
                                    z11.c(z11Var2, s11Var3, v11Var.j, jD, 8);
                                    return;
                                } else {
                                    fo.i("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    z11Var2.a();
                    return;
                }
                if (!(obj6 instanceof x11)) {
                    b81.d();
                    return;
                }
                x11 x11Var2 = (x11) obj6;
                if (q92Var != q92Var3) {
                    return;
                }
                long j2 = x11Var2.i;
                int size4 = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i6);
                    if (wc0.C(((s11) obj).a, j2)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                s11 s11Var4 = (s11) obj;
                if (s11Var4 == null) {
                    return;
                }
                boolean zJ = ce0.j(s11Var4);
                le0 le0Var = le0.a;
                if (!zJ) {
                    if (s11Var4.i) {
                        kf0Var.u1(le0Var);
                        return;
                    } else {
                        if (c12.c(ce0.P(s11Var4, kf0Var.u, new r11(i), true)) == 0.0f) {
                            return;
                        }
                        z11Var2.e(s11Var4, new r11(i), ce0.P(s11Var4, kf0Var.u, new r11(i), false));
                        s11Var4.i = true;
                        return;
                    }
                }
                int size5 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i7);
                    if (((s11) obj2).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                s11 s11Var5 = (s11) obj2;
                if (s11Var5 != null) {
                    x11Var2.i = s11Var5.a;
                    return;
                }
                if (s11Var4.i || !ce0.j(s11Var4)) {
                    kf0Var.u1(le0Var);
                } else {
                    ce0.g(z11Var2.d(), s11Var4, kf0Var.u, new r11(i), z11Var2.j, z11Var2.l);
                    float fA = ((aj3) xq1.C(kf0Var, z30.u)).a();
                    long jH = z11Var2.d().h(g93.c(fA, fA));
                    gb0 gb0Var = (gb0) z11Var2.d().f;
                    ai3 ai3Var = gb0Var.a;
                    o90[] o90VarArr = ai3Var.d;
                    yo.s0(0, o90VarArr.length, null, o90VarArr);
                    ai3Var.e = 0;
                    ai3 ai3Var2 = gb0Var.b;
                    o90[] o90VarArr2 = ai3Var2.d;
                    yo.s0(0, o90VarArr2.length, null, o90VarArr2);
                    ai3Var2.e = 0;
                    gb0Var.c = 0L;
                    kf0Var.u1(new oe0(sf0.b(jH), true));
                }
                z11Var2.a();
                return;
            }
            w11 w11Var = (w11) obj6;
            if (q92Var == q92Var2) {
                return;
            }
            int size6 = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size6) {
                    obj3 = null;
                    break;
                }
                obj3 = arrayList.get(i8);
                if (wc0.C(((s11) obj3).a, w11Var.j)) {
                    break;
                } else {
                    i8++;
                }
            }
            s11 s11Var6 = (s11) obj3;
            if (s11Var6 == null) {
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj5 = null;
                        break;
                    }
                    obj5 = arrayList.get(i9);
                    if (((s11) obj5).d) {
                        break;
                    } else {
                        i9++;
                    }
                }
                s11Var6 = (s11) obj5;
                if (s11Var6 == null) {
                    z11Var2.a();
                    return;
                }
                w11Var.j = s11Var6.a;
            }
            s11 s11Var7 = s11Var6;
            if (q92Var == q92Var3) {
                if (s11Var7.i) {
                    s11 s11Var8 = w11Var.i;
                    if (s11Var8 == null) {
                        fo.i("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = w11Var.j;
                    px0 px0Var = z11Var2.i;
                    if (px0Var == null) {
                        fo.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    z11Var2.b(s11Var8, j3, px0Var);
                } else if (ce0.j(s11Var7)) {
                    int size8 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size8) {
                            obj4 = null;
                            break;
                        }
                        Object obj7 = arrayList.get(i10);
                        if (((s11) obj7).d) {
                            obj4 = obj7;
                            break;
                        }
                        i10++;
                    }
                    s11 s11Var9 = (s11) obj4;
                    if (s11Var9 == null) {
                        z11Var2.a();
                    } else {
                        w11Var.j = s11Var9.a;
                    }
                } else {
                    aj3 aj3Var = (aj3) xq1.C(kf0Var, z30.u);
                    float f = df0.a;
                    float fD = aj3Var.d();
                    px0 px0Var2 = z11Var2.i;
                    if (px0Var2 == null) {
                        fo.i("Touch slop detector not initialized.");
                        return;
                    }
                    long jA = px0Var2.a(fD, ce0.P(s11Var7, kf0Var.u, new r11(i), true), true);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        s11Var7.i = true;
                        s11 s11Var10 = w11Var.i;
                        s11Var10.getClass();
                        z11Var2.f(s11Var10, s11Var7, new r11(i), jA);
                        z11Var2.e(s11Var7, new r11(i), jA);
                        long j4 = s11Var7.a;
                        x11 x11Var3 = z11Var2.c;
                        if (x11Var3 == null) {
                            x11Var3 = new x11();
                            x11Var3.i = Long.MAX_VALUE;
                            z11Var2.c = x11Var3;
                        }
                        x11Var3.i = j4;
                        z11Var2.f = x11Var3;
                    } else {
                        w11Var.k = true;
                    }
                }
            }
            if (q92Var == q92Var4 && w11Var.k) {
                if (!s11Var7.i) {
                    w11Var.k = false;
                    return;
                }
                s11 s11Var11 = w11Var.i;
                if (s11Var11 == null) {
                    fo.i("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j5 = w11Var.j;
                px0 px0Var3 = z11Var2.i;
                if (px0Var3 != null) {
                    z11Var2.b(s11Var11, j5, px0Var3);
                } else {
                    fo.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // defpackage.a21
    public final void U() {
        z11 z11Var = this.L;
        if (z11Var != null) {
            z11Var.a();
            kf0 kf0Var = z11Var.a;
            if (kf0Var.B) {
                kf0Var.u1(le0.a);
            }
            z11Var.g = null;
            x8 x8Var = z11Var.k;
            x8Var.b = 0;
            ((kx1) x8Var.c).b = 0;
        }
    }

    @Override // defpackage.ba2
    public void d0(p92 p92Var, q92 q92Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ge0 ge0Var;
        boolean z = true;
        this.C = true;
        if (this.y == null) {
            zv0 zv0Var = new zv0(this);
            m1(zv0Var);
            this.y = zv0Var;
        }
        if (this.w) {
            ke0 ke0Var = this.H;
            if (ke0Var == null) {
                ge0 ge0Var2 = this.D;
                if (ge0Var2 == null) {
                    obj = ke0Var;
                    ge0Var = ge0Var2;
                    ge0 ge0Var3 = new ge0();
                    ge0Var3.j = fe0.g;
                    ge0Var3.k = false;
                    this.D = ge0Var3;
                    ge0Var = ge0Var3;
                }
                obj = ke0Var;
                ge0Var = ge0Var2;
                this.H = ge0Var;
                obj = ge0Var;
            }
            obj = ke0Var;
            boolean z2 = obj instanceof ge0;
            q92 q92Var2 = q92.e;
            q92 q92Var3 = q92.f;
            if (z2) {
                ge0 ge0Var4 = (ge0) obj;
                if (!p92Var.a.isEmpty() && g53.f(p92Var, false, false)) {
                    x92 x92Var = (x92) zy.n0(p92Var.a);
                    int i = ff0.a[ge0Var4.j.ordinal()];
                    fe0 fe0Var = fe0.f;
                    fe0 fe0Var2 = fe0.e;
                    fe0 fe0Var3 = i == 1 ? !E1() ? fe0Var2 : fe0Var : ge0Var4.j;
                    ge0Var4.j = fe0Var3;
                    if (q92Var == q92Var2 && fe0Var3 == fe0Var) {
                        x92Var.a();
                        ge0Var4.k = true;
                    }
                    if (q92Var == q92Var3) {
                        if (fe0Var3 == fe0Var2) {
                            t1(this, x92Var, x92Var.a, 0L, 12);
                            return;
                        }
                        if (ge0Var4.k) {
                            D1(x92Var, x92Var, 0L);
                            C1(0L, x92Var);
                            long j2 = x92Var.a;
                            je0 je0Var = this.E;
                            if (je0Var == null) {
                                je0Var = new je0();
                                je0Var.j = Long.MAX_VALUE;
                                this.E = je0Var;
                            }
                            je0Var.j = j2;
                            this.H = je0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = obj instanceof ie0;
            q92 q92Var4 = q92.g;
            if (!z3) {
                if (obj instanceof he0) {
                    he0 he0Var = (he0) obj;
                    if (q92Var != q92Var4) {
                        return;
                    }
                    List list = p92Var.a;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((x92) list.get(i2)).b()) {
                            z = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((x92) list.get(i3)).d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long j3 = ((x92) zy.n0(list)).c;
                                x92 x92Var2 = he0Var.j;
                                x92Var2.getClass();
                                long jD = c12.d(j3, x92Var2.c);
                                x92 x92Var3 = he0Var.j;
                                if (x92Var3 != null) {
                                    t1(this, x92Var3, he0Var.k, jD, 8);
                                    return;
                                } else {
                                    fo.i("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    r1();
                    return;
                }
                if (!(obj instanceof je0)) {
                    b81.d();
                    return;
                }
                je0 je0Var2 = (je0) obj;
                if (q92Var != q92Var3) {
                    return;
                }
                long j4 = je0Var2.j;
                List list2 = p92Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i4);
                    if (wc0.C(((x92) obj2).a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                x92 x92Var4 = (x92) obj2;
                if (x92Var4 == null) {
                    return;
                }
                boolean zR = mh0.r(x92Var4);
                le0 le0Var = le0.a;
                if (!zR) {
                    if (x92Var4.b()) {
                        A1().mo32trySendJP2dKIU(le0Var);
                        return;
                    } else {
                        if (c12.c(mh0.T(x92Var4, true)) == 0.0f) {
                            return;
                        }
                        C1(mh0.T(x92Var4, false), x92Var4);
                        x92Var4.a();
                        return;
                    }
                }
                List list3 = p92Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list3.get(i5);
                    if (((x92) obj3).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                x92 x92Var5 = (x92) obj3;
                if (x92Var5 != null) {
                    je0Var2.j = x92Var5.a;
                    return;
                }
                if (x92Var4.b() || !mh0.r(x92Var4)) {
                    A1().mo32trySendJP2dKIU(le0Var);
                } else {
                    k93.a(B1(), x92Var4, 0L);
                    float fA = ((aj3) xq1.C(this, z30.u)).a();
                    long jH = B1().h(g93.c(fA, fA));
                    gb0 gb0Var = (gb0) B1().f;
                    ai3 ai3Var = gb0Var.a;
                    o90[] o90VarArr = ai3Var.d;
                    yo.s0(0, o90VarArr.length, null, o90VarArr);
                    ai3Var.e = 0;
                    ai3 ai3Var2 = gb0Var.b;
                    o90[] o90VarArr2 = ai3Var2.d;
                    yo.s0(0, o90VarArr2.length, null, o90VarArr2);
                    ai3Var2.e = 0;
                    gb0Var.c = 0L;
                    A1().mo32trySendJP2dKIU(new oe0(sf0.b(jH), false));
                    this.C = false;
                }
                r1();
                return;
            }
            ie0 ie0Var = (ie0) obj;
            if (q92Var == q92Var2) {
                return;
            }
            List list4 = p92Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj4 = null;
                    break;
                }
                obj4 = list4.get(i6);
                int i7 = size5;
                if (wc0.C(((x92) obj4).a, ie0Var.k)) {
                    break;
                }
                i6++;
                size5 = i7;
            }
            x92 x92Var6 = (x92) obj4;
            if (x92Var6 == null) {
                int size6 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list4.get(i8);
                    if (((x92) obj6).d) {
                        break;
                    } else {
                        i8++;
                    }
                }
                x92Var6 = (x92) obj6;
                if (x92Var6 == null) {
                    r1();
                    return;
                }
                ie0Var.k = x92Var6.a;
            }
            if (q92Var == q92Var3) {
                if (x92Var6.b()) {
                    x92 x92Var7 = ie0Var.j;
                    if (x92Var7 == null) {
                        fo.i("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = ie0Var.k;
                    px0 px0Var = this.K;
                    if (px0Var == null) {
                        fo.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    s1(x92Var7, j5, px0Var);
                } else if (mh0.r(x92Var6)) {
                    int size7 = list4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj5 = null;
                            break;
                        }
                        Object obj7 = list4.get(i9);
                        if (((x92) obj7).d) {
                            obj5 = obj7;
                            break;
                        }
                        i9++;
                    }
                    x92 x92Var8 = (x92) obj5;
                    if (x92Var8 == null) {
                        r1();
                    } else {
                        ie0Var.k = x92Var8.a;
                    }
                } else {
                    float fL = df0.l((aj3) xq1.C(this, z30.u), x92Var6.i);
                    px0 px0Var2 = this.K;
                    if (px0Var2 == null) {
                        fo.i("Touch slop detector not initialized.");
                        return;
                    }
                    long jA = px0Var2.a(fL, mh0.T(x92Var6, true), true);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        boolean zW = w(x92Var6);
                        tc3 tc3VarC = q73.c(this, zv0.t);
                        zv0 zv0Var2 = tc3VarC instanceof zv0 ? (zv0) tc3VarC : null;
                        yv0 yv0Var = zv0Var2 != null ? zv0Var2.s : null;
                        boolean z4 = yv0Var != null && yv0Var.w(x92Var6);
                        if (zW || !z4) {
                            x92Var6.a();
                            x92 x92Var9 = ie0Var.j;
                            x92Var9.getClass();
                            D1(x92Var9, x92Var6, jA);
                            C1(jA, x92Var6);
                            long j6 = x92Var6.a;
                            je0 je0Var3 = this.E;
                            if (je0Var3 == null) {
                                je0Var3 = new je0();
                                je0Var3.j = Long.MAX_VALUE;
                                this.E = je0Var3;
                            }
                            je0Var3.j = j6;
                            this.H = je0Var3;
                        } else {
                            ie0Var.l = true;
                        }
                    } else {
                        ie0Var.l = true;
                    }
                }
            }
            if (q92Var == q92Var4 && ie0Var.l) {
                if (!x92Var6.b()) {
                    ie0Var.l = false;
                    return;
                }
                x92 x92Var10 = ie0Var.j;
                if (x92Var10 == null) {
                    fo.i("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = ie0Var.k;
                px0 px0Var3 = this.K;
                if (px0Var3 != null) {
                    s1(x92Var10, j7, px0Var3);
                } else {
                    fo.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.B = false;
        p1();
        this.M = 0L;
        zv0 zv0Var = this.y;
        if (zv0Var != null) {
            n1(zv0Var);
        }
        this.y = null;
    }

    @Override // defpackage.yv0
    public final boolean h0(s11 s11Var) {
        return ce0.i(s11Var) && this.w;
    }

    public final void p1() {
        mf0 mf0Var = this.A;
        if (mf0Var != null) {
            ix1 ix1Var = this.x;
            if (ix1Var != null) {
                ix1Var.b(new lf0(mf0Var));
            }
            this.A = null;
        }
    }

    public abstract Object q1(jf0 jf0Var, jf0 jf0Var2);

    public final void r1() {
        ge0 ge0Var = this.D;
        fe0 fe0Var = fe0.g;
        if (ge0Var == null) {
            ge0Var = new ge0();
            ge0Var.j = fe0Var;
            ge0Var.k = false;
            this.D = ge0Var;
        }
        ge0Var.j = fe0Var;
        ge0Var.k = false;
        this.H = ge0Var;
    }

    public final void s1(x92 x92Var, long j, px0 px0Var) {
        he0 he0Var = this.G;
        if (he0Var == null) {
            he0Var = new he0();
            he0Var.j = null;
            he0Var.k = Long.MAX_VALUE;
            this.G = he0Var;
        }
        he0Var.j = x92Var;
        he0Var.k = j;
        px0Var.a = 0L;
        this.H = he0Var;
    }

    public final void u1(pe0 pe0Var) {
        if ((pe0Var instanceof ne0) && !this.B) {
            this.B = true;
            F1();
        }
        A1().mo32trySendJP2dKIU(pe0Var);
    }

    public abstract void v1(long j);

    @Override // defpackage.yv0
    public final boolean w(x92 x92Var) {
        if (mh0.p(x92Var)) {
            return this.w;
        }
        if (!mh0.r(x92Var)) {
            if (this.K == null) {
                this.K = new px0(this.u, 2);
            }
            float fD = ((aj3) xq1.C(this, z30.u)).d();
            long jT = mh0.T(x92Var, false);
            px0 px0Var = this.K;
            if (px0Var == null) {
                fo.i("Touch slop detector not initialized.");
                return false;
            }
            if (!c12.b(px0Var.a(fD, jT, false), 9205357640488583168L)) {
                long jE = c12.e(px0Var.a, jT);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jE & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE >> 32))))) * 180.0f)) / 3.141592653589793d;
                x32 x32Var = (x32) px0Var.b;
                int i = x32Var == null ? -1 : pb3.a[x32Var.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void w1(oe0 oe0Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(r60 r60Var) {
        gf0 gf0Var;
        if (r60Var instanceof gf0) {
            gf0Var = (gf0) r60Var;
            int i = gf0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gf0Var.g = i - Integer.MIN_VALUE;
            } else {
                gf0Var = new gf0(this, r60Var);
            }
        } else {
            gf0Var = new gf0(this, r60Var);
        }
        Object obj = gf0Var.e;
        int i2 = gf0Var.g;
        if (i2 == 0) {
            ee0.J(obj);
            mf0 mf0Var = this.A;
            if (mf0Var != null) {
                ix1 ix1Var = this.x;
                if (ix1Var != null) {
                    lf0 lf0Var = new lf0(mf0Var);
                    gf0Var.g = 1;
                    Object objA = ix1Var.a(lf0Var, gf0Var);
                    z70 z70Var = z70.e;
                    if (objA == z70Var) {
                        return z70Var;
                    }
                }
            }
            w1(new oe0(0L, false));
            return mf3.a;
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        this.A = null;
        w1(new oe0(0L, false));
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(ne0 ne0Var, r60 r60Var) {
        hf0 hf0Var;
        ix1 ix1Var;
        mf0 mf0Var;
        ne0 ne0Var2;
        mf0 mf0Var2;
        if (r60Var instanceof hf0) {
            hf0Var = (hf0) r60Var;
            int i = hf0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf0Var.i = i - Integer.MIN_VALUE;
            } else {
                hf0Var = new hf0(this, r60Var);
            }
        } else {
            hf0Var = new hf0(this, r60Var);
        }
        Object obj = hf0Var.g;
        int i2 = hf0Var.i;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            mf0 mf0Var3 = this.A;
            if (mf0Var3 != null && (ix1Var = this.x) != null) {
                lf0 lf0Var = new lf0(mf0Var3);
                hf0Var.e = ne0Var;
                hf0Var.i = 1;
                if (ix1Var.a(lf0Var, hf0Var) != z70Var) {
                }
                return z70Var;
            }
            this.A = mf0Var;
            v1(ne0Var.a);
            return mf3.a;
        }
        if (i2 == 1) {
            ne0Var = hf0Var.e;
            ee0.J(obj);
        } else {
            if (i2 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mf0Var2 = hf0Var.f;
            ne0Var2 = hf0Var.e;
            ee0.J(obj);
        }
        mf0Var = mf0Var2;
        ne0Var = ne0Var2;
        this.A = mf0Var;
        v1(ne0Var.a);
        return mf3.a;
        mf0Var = new mf0();
        ix1 ix1Var2 = this.x;
        if (ix1Var2 != null) {
            hf0Var.e = ne0Var;
            hf0Var.f = mf0Var;
            hf0Var.i = 2;
            if (ix1Var2.a(mf0Var, hf0Var) != z70Var) {
                ne0Var2 = ne0Var;
                mf0Var2 = mf0Var;
                mf0Var = mf0Var2;
                ne0Var = ne0Var2;
            }
            return z70Var;
        }
        this.A = mf0Var;
        v1(ne0Var.a);
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(oe0 oe0Var, r60 r60Var) {
        if0 if0Var;
        if (r60Var instanceof if0) {
            if0Var = (if0) r60Var;
            int i = if0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                if0Var.h = i - Integer.MIN_VALUE;
            } else {
                if0Var = new if0(this, r60Var);
            }
        } else {
            if0Var = new if0(this, r60Var);
        }
        Object obj = if0Var.f;
        int i2 = if0Var.h;
        if (i2 == 0) {
            ee0.J(obj);
            mf0 mf0Var = this.A;
            if (mf0Var != null) {
                ix1 ix1Var = this.x;
                if (ix1Var != null) {
                    nf0 nf0Var = new nf0(mf0Var);
                    if0Var.e = oe0Var;
                    if0Var.h = 1;
                    Object objA = ix1Var.a(nf0Var, if0Var);
                    z70 z70Var = z70.e;
                    if (objA == z70Var) {
                        return z70Var;
                    }
                }
            }
            w1(oe0Var);
            return mf3.a;
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oe0Var = if0Var.e;
        ee0.J(obj);
        this.A = null;
        w1(oe0Var);
        return mf3.a;
    }
}
