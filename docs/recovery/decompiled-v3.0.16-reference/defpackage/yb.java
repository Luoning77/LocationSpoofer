package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yb implements ra0, View.OnAttachStateChangeListener {
    public final db e;
    public final t4 f;
    public d31 g;
    public final ArrayList h = new ArrayList();
    public tb i = tb.e;
    public boolean j = true;
    public final Channel k = ChannelKt.Channel$default(1, null, null, 6, null);
    public gx1 l;
    public long m;
    public final gx1 n;
    public ks2 o;
    public boolean p;
    public final w q;

    public yb(db dbVar, t4 t4Var) {
        this.e = dbVar;
        this.f = t4Var;
        new Handler(Looper.getMainLooper());
        gx1 gx1Var = g41.a;
        gx1Var.getClass();
        this.l = gx1Var;
        this.n = new gx1();
        this.o = new ks2(dbVar.getSemanticsOwner().a(), gx1Var);
        this.q = new w(this, 3);
    }

    @Override // defpackage.ra0
    public final void A(df1 df1Var) {
        i(this.e.getSemanticsOwner().a());
        e();
        this.g = null;
    }

    @Override // defpackage.ra0
    public final void F(df1 df1Var) {
        this.g = (d31) this.f.invoke();
        h(-1, this.e.getSemanticsOwner().a());
        e();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.r60 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.wb
            if (r0 == 0) goto L13
            r0 = r9
            wb r0 = (defpackage.wb) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            wb r0 = new wb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            z70 r4 = defpackage.z70.e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            kotlinx.coroutines.channels.ChannelIterator r1 = r0.e
            defpackage.ee0.J(r9)
        L2b:
            r9 = r1
            goto L43
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r8)
            r8 = 0
            return r8
        L34:
            kotlinx.coroutines.channels.ChannelIterator r1 = r0.e
            defpackage.ee0.J(r9)
            goto L51
        L3a:
            defpackage.ee0.J(r9)
            kotlinx.coroutines.channels.Channel r9 = r8.k
            kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()
        L43:
            r0.e = r9
            r0.h = r3
            java.lang.Object r1 = r9.hasNext(r0)
            if (r1 != r4) goto L4e
            goto L84
        L4e:
            r7 = r1
            r1 = r9
            r9 = r7
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            r1.next()
            boolean r9 = r8.d()
            if (r9 == 0) goto L65
            r8.e()
        L65:
            db r9 = r8.e
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.p
            if (r5 != 0) goto L78
            if (r9 == 0) goto L78
            r8.p = r3
            w r5 = r8.q
            r9.post(r5)
        L78:
            r0.e = r1
            r0.h = r2
            r5 = 100
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r9 != r4) goto L2b
        L84:
            return r4
        L85:
            mf3 r8 = defpackage.mf3.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb.a(r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void b(f41 f41Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        f41 f41Var2 = f41Var;
        int[] iArr3 = f41Var2.b;
        long[] jArr = f41Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        ks2 ks2Var = (ks2) this.n.b(i7);
                        ls2 ls2Var = (ls2) f41Var2.b(i7);
                        js2 js2Var = ls2Var != null ? ls2Var.a : null;
                        if (js2Var == null) {
                            throw az2.e("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = js2Var.f;
                        zx1 zx1Var = js2Var.d.e;
                        if (ks2Var == null) {
                            Object[] objArr = zx1Var.b;
                            long[] jArr2 = zx1Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                rs2 rs2Var = (rs2) objArr[(i10 << 3) + i12];
                                                rs2 rs2Var2 = os2.C;
                                                if (o51.f(rs2Var, rs2Var2)) {
                                                    Object objG = zx1Var.g(rs2Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    g(i8, String.valueOf(list != null ? (dj) zy.o0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = zx1Var.b;
                            long[] jArr3 = zx1Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                rs2 rs2Var3 = (rs2) objArr2[(i13 << 3) + i15];
                                                rs2 rs2Var4 = os2.C;
                                                if (o51.f(rs2Var3, rs2Var4)) {
                                                    Object objG2 = ks2Var.a.e.g(rs2Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    dj djVar = list2 != null ? (dj) zy.o0(list2) : null;
                                                    Object objG3 = zx1Var.g(rs2Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    dj djVar2 = list3 != null ? (dj) zy.o0(list3) : null;
                                                    if (!o51.f(djVar, djVar2)) {
                                                        g(i8, String.valueOf(djVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    f41Var2 = f41Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            f41Var2 = f41Var;
            iArr3 = iArr;
        }
    }

    public final f41 c() {
        if (this.j) {
            this.j = false;
            this.l = am1.r(this.e.getSemanticsOwner(), wa.j);
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    public final boolean d() {
        return this.g != null;
    }

    public final void e() {
        d31 d31Var = this.g;
        if (d31Var == null) {
            return;
        }
        Object obj = d31Var.g;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s50 s50Var = (s50) arrayList.get(i);
            int iOrdinal = s50Var.c.ordinal();
            if (iOrdinal == 0) {
                us1 us1Var = s50Var.d;
                if (us1Var != null) {
                    ViewStructure viewStructure = (ViewStructure) us1Var.f;
                    if (Build.VERSION.SDK_INT >= 29) {
                        rn.e(fa.e(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    b81.d();
                    return;
                }
                AutofillId autofillIdZ = d31Var.z(s50Var.a);
                if (autofillIdZ != null && Build.VERSION.SDK_INT >= 29) {
                    rn.f(fa.e(obj), autofillIdZ);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            rn.h(fa.e(obj), ((View) d31Var.f).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void f(js2 js2Var, ks2 ks2Var) {
        int i = 0;
        xb xbVar = new xb(i, ks2Var, this);
        js2Var.getClass();
        List listJ = js2.j(4, js2Var);
        int size = listJ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listJ.get(i3);
            if (c().a(((js2) obj).f)) {
                xbVar.invoke(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listJ2 = js2.j(4, js2Var);
        int size2 = listJ2.size();
        while (i < size2) {
            js2 js2Var2 = (js2) listJ2.get(i);
            f41 f41VarC = c();
            int i4 = js2Var2.f;
            if (f41VarC.a(i4)) {
                gx1 gx1Var = this.n;
                if (gx1Var.a(i4)) {
                    Object objB = gx1Var.b(i4);
                    if (objB == null) {
                        throw az2.e("node not present in pruned tree before this change");
                    }
                    f(js2Var2, (ks2) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void g(int i, String str) {
        d31 d31Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (d31Var = this.g) != null) {
            AutofillId autofillIdZ = d31Var.z(i);
            if (autofillIdZ == null) {
                throw az2.e("Invalid content capture ID");
            }
            if (i2 >= 29) {
                rn.g(fa.e(d31Var.g), autofillIdZ, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void h(int i, js2 js2Var) {
        lu0 lu0Var;
        int i2;
        pe2 pe2VarA;
        us1 us1Var;
        String strJ;
        lu0 lu0Var2;
        if (d()) {
            zx1 zx1Var = js2Var.d.e;
            Object objG = zx1Var.g(os2.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.i == tb.e && o51.f(bool, Boolean.TRUE)) {
                Object objG2 = zx1Var.g(ds2.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                z0 z0Var = (z0) objG2;
                if (z0Var != null && (lu0Var2 = (lu0) z0Var.b) != null) {
                }
            } else if (this.i == tb.f && o51.f(bool, Boolean.FALSE)) {
                Object objG3 = zx1Var.g(ds2.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                z0 z0Var2 = (z0) objG3;
                if (z0Var2 != null && (lu0Var = (lu0) z0Var2.b) != null) {
                }
            }
            int i3 = js2Var.f;
            d31 d31Var = this.g;
            if (d31Var != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.e.getAutofillId();
                js2 js2VarL = js2Var.l();
                int i4 = js2Var.f;
                if (js2VarL == null || (autofillId = d31Var.z(js2VarL.f)) != null) {
                    us1 us1Var2 = i2 >= 29 ? new us1(rn.d(fa.e(d31Var.g), autofillId, i4), 27) : null;
                    if (us1Var2 == null) {
                        us1Var = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) us1Var2.f;
                        es2 es2Var = js2Var.d;
                        rs2 rs2Var = os2.L;
                        zx1 zx1Var2 = es2Var.e;
                        if (zx1Var2.c(rs2Var)) {
                            us1Var = null;
                        } else {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.m);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objG4 = zx1Var2.g(os2.A);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            String str = (String) objG4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objG5 = zx1Var2.g(os2.n);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (((Boolean) objG5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objG6 = zx1Var2.g(os2.C);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            List list = (List) objG6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(xg1.a(list, "\n", null, 62));
                            }
                            Object objG7 = zx1Var2.g(os2.G);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            dj djVar = (dj) objG7;
                            if (djVar != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(djVar);
                            }
                            Object objG8 = zx1Var2.g(os2.a);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            List list2 = (List) objG8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(xg1.a(list2, "\n", null, 62));
                            }
                            Object objG9 = zx1Var2.g(os2.z);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            vh2 vh2Var = (vh2) objG9;
                            if (vh2Var != null && (strJ = ig0.J(vh2Var.a)) != null) {
                                viewStructure.setClassName(strJ);
                            }
                            x83 x83VarX = ig0.x(es2Var);
                            if (x83VarX != null) {
                                w83 w83Var = x83VarX.a;
                                q93 q93Var = w83Var.b;
                                xb0 xb0Var = w83Var.g;
                                viewStructure.setTextStyle(xb0Var.D() * xb0Var.g() * w93.c(q93Var.a.b), 0, 0, 0);
                            }
                            xz1 xz1VarD = js2Var.d();
                            if (xz1VarD == null) {
                                pe2VarA = pe2.e;
                            } else {
                                xz1 xz1Var = xz1VarD.t1().r ? xz1VarD : null;
                                if (xz1Var != null) {
                                    pe2VarA = js2Var.a(xz1Var);
                                } else {
                                    pe2VarA = pe2.e;
                                }
                            }
                            float f = pe2VarA.a;
                            float f2 = pe2VarA.b;
                            viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (pe2VarA.c - f), (int) (pe2VarA.d - f2));
                            us1Var = us1Var2;
                        }
                    }
                } else {
                    us1Var = null;
                }
            } else {
                us1Var = null;
            }
            if (us1Var != null) {
                this.h.add(new s50(i3, this.m, t50.e, us1Var));
            }
            List listJ = js2.j(4, js2Var);
            int size = listJ.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listJ.get(i6);
                if (c().a(((js2) obj).f)) {
                    h(i5, (js2) obj);
                    i5++;
                }
            }
        }
    }

    public final void i(js2 js2Var) {
        if (d()) {
            this.h.add(new s50(js2Var.f, this.m, t50.f, null));
            List listJ = js2.j(4, js2Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                i((js2) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void j() {
        gx1 gx1Var = this.n;
        gx1Var.c();
        f41 f41VarC = c();
        int[] iArr = f41VarC.b;
        Object[] objArr = f41VarC.c;
        long[] jArr = f41VarC.a;
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
                            int i4 = (i << 3) + i3;
                            gx1Var.h(iArr[i4], new ks2(((ls2) objArr[i4]).a, c()));
                        }
                        j >>= 8;
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
        }
        this.o = new ks2(this.e.getSemanticsOwner().a(), c());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.e.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.q);
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
