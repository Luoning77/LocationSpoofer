package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class k91 implements jj1, jv1, vz1, e12, x70, y82, lc2, vn2 {
    public final /* synthetic */ int e;

    public k91(au0 au0Var) {
        this.e = 24;
    }

    public static ArrayList i(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bd2) obj) != bd2.f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((bd2) obj2).e);
        }
        return arrayList2;
    }

    public static byte[] j(List list) {
        xt xtVar = new xt();
        ArrayList arrayListI = i(list);
        int size = arrayListI.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI.get(i);
            i++;
            String str = (String) obj;
            xtVar.h0(str.length());
            xtVar.m0(str);
        }
        return xtVar.U(xtVar.f);
    }

    public static Typeface k(String str, jr0 jr0Var, int i) {
        if (i == 0 && o51.f(jr0Var, jr0.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), jr0Var.e, i == 1);
    }

    public static Typeface l(String str, jr0 jr0Var, int i) {
        if (i == 0 && o51.f(jr0Var, jr0.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iQ = ks.Q(jr0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iQ) : Typeface.create(str, iQ);
    }

    public static qv1 o(int i) {
        Object next;
        wk0 wk0Var = qv1.p;
        wk0Var.getClass();
        d0 d0Var = new d0(wk0Var, 0);
        do {
            if (!d0Var.hasNext()) {
                next = null;
                break;
            }
            next = d0Var.next();
        } while (((qv1) next).e != i);
        qv1 qv1Var = (qv1) next;
        return qv1Var == null ? qv1.m : qv1Var;
    }

    public static boolean q() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // defpackage.vz1
    public boolean a(cv1 cv1Var) {
        return false;
    }

    @Override // defpackage.vz1
    public int b() {
        return 8;
    }

    @Override // defpackage.vz1
    public boolean c(cv1 cv1Var) {
        return am1.D(ke0.n(xp1.O(cv1Var), false));
    }

    @Override // defpackage.vz1
    public void d(hb1 hb1Var, long j, zx0 zx0Var, int i, boolean z) {
        tz1 tz1Var = hb1Var.K;
        xz1 xz1Var = tz1Var.d;
        ah2 ah2Var = xz1.S;
        tz1Var.d.y1(xz1.W, xz1Var.q1(j, true), zx0Var, 1, z);
    }

    @Override // defpackage.vz1
    public boolean e(zx0 zx0Var, hb1 hb1Var) {
        return false;
    }

    @Override // defpackage.lc2
    public void f() {
        switch (this.e) {
            case 20:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.lc2
    public void g(int i, Object obj) {
        String str;
        switch (this.e) {
            case 20:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case Logger.WARN /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case Logger.ERROR /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case mc0.b /* 9 */:
                    default:
                        str = "";
                        break;
                    case mc0.c /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // defpackage.vz1
    public boolean h(hb1 hb1Var) {
        es2 es2VarW = hb1Var.w();
        boolean z = false;
        if (es2VarW != null && es2VarW.h) {
            z = true;
        }
        return !z;
    }

    public Typeface m(xv0 xv0Var, jr0 jr0Var, int i) {
        switch (this.e) {
            case 17:
                return k(xv0Var.d, jr0Var, i);
            default:
                String strConcat = xv0Var.d;
                int i2 = jr0Var.e / 100;
                if (i2 >= 0 && i2 < 2) {
                    strConcat = strConcat.concat("-thin");
                } else if (2 <= i2 && i2 < 4) {
                    strConcat = strConcat.concat("-light");
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        strConcat = strConcat.concat("-medium");
                    } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                        strConcat = strConcat.concat("-black");
                    }
                }
                Typeface typeface = null;
                if (strConcat.length() != 0) {
                    Typeface typefaceL = l(strConcat, jr0Var, i);
                    if (!o51.f(typefaceL, Typeface.create(Typeface.DEFAULT, ks.Q(jr0Var, i))) && !o51.f(typefaceL, l(null, jr0Var, i))) {
                        typeface = typefaceL;
                    }
                }
                return typeface == null ? l(xv0Var.d, jr0Var, i) : typeface;
        }
    }

    public void p(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x021b  */
    /* JADX WARN: Code duplicated, block: B:156:0x024f  */
    /* JADX WARN: Code duplicated, block: B:159:0x025a  */
    /* JADX WARN: Code duplicated, block: B:169:0x027e  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    public d91 s(KeyEvent keyEvent) {
        d91 d91Var;
        d91 d91Var2;
        d91 d91Var3;
        int iN = wc0.N(keyEvent);
        d91 d91Var4 = null;
        if (iN == 9) {
            long jE = hd0.e(keyEvent.getKeyCode());
            if (c91.a(jE, c91.f)) {
                d91Var = d91.U;
            } else if (c91.a(jE, c91.g)) {
                d91Var = d91.V;
            } else if (c91.a(jE, c91.d)) {
                d91Var = d91.M;
            } else if (c91.a(jE, c91.e)) {
                d91Var = d91.N;
            } else {
                d91Var = null;
            }
        } else if (iN == 1) {
            long jE2 = hd0.e(keyEvent.getKeyCode());
            if (c91.a(jE2, c91.f)) {
                d91Var = d91.n;
            } else if (c91.a(jE2, c91.g)) {
                d91Var = d91.o;
            } else if (c91.a(jE2, c91.d)) {
                d91Var = d91.u;
            } else if (c91.a(jE2, c91.e)) {
                d91Var = d91.v;
            } else if (c91.a(jE2, c91.s)) {
                d91Var = d91.D;
            } else {
                d91Var = null;
            }
        } else {
            d91Var = null;
        }
        if (d91Var != null) {
            return d91Var;
        }
        t1 t1Var = sb.T;
        int iN2 = wc0.N(keyEvent);
        long jE3 = hd0.e(keyEvent.getKeyCode());
        boolean zA = c91.a(jE3, c91.s);
        d91 d91Var5 = d91.X;
        d91 d91Var6 = d91.z;
        if (zA) {
            if (iN2 == 0 || iN2 == 8 || iN2 == 12) {
                d91Var2 = d91Var6;
            } else if (iN2 == 2 || iN2 == 10) {
                d91Var2 = d91.B;
            } else {
                d91Var2 = null;
            }
        } else if ((c91.a(jE3, c91.r) || c91.a(jE3, c91.E)) && (iN2 == 0 || iN2 == 8 || iN2 == 2 || iN2 == 10)) {
            d91Var2 = d91Var5;
        } else {
            d91Var2 = null;
        }
        if (d91Var2 != null) {
            return d91Var2;
        }
        int iN3 = wc0.N(keyEvent);
        d91 d91Var7 = d91.S;
        d91 d91Var8 = d91.T;
        if (iN3 == 10) {
            long jE4 = hd0.e(keyEvent.getKeyCode());
            if (c91.a(jE4, c91.f) || c91.a(jE4, c91.H)) {
                d91Var3 = d91.O;
            } else if (c91.a(jE4, c91.g) || c91.a(jE4, c91.I)) {
                d91Var3 = d91.P;
            } else if (c91.a(jE4, c91.d) || c91.a(jE4, c91.F)) {
                d91Var3 = d91.R;
            } else if (c91.a(jE4, c91.e) || c91.a(jE4, c91.G)) {
                d91Var3 = d91.Q;
            } else {
                d91Var3 = null;
            }
        } else if (iN3 == 2) {
            long jE5 = hd0.e(keyEvent.getKeyCode());
            if (c91.a(jE5, c91.f) || c91.a(jE5, c91.H)) {
                d91Var3 = d91.i;
            } else if (c91.a(jE5, c91.g) || c91.a(jE5, c91.I)) {
                d91Var3 = d91.h;
            } else if (c91.a(jE5, c91.d) || c91.a(jE5, c91.F)) {
                d91Var3 = d91.k;
            } else if (c91.a(jE5, c91.e) || c91.a(jE5, c91.G)) {
                d91Var3 = d91.j;
            } else if (c91.a(jE5, c91.k)) {
                d91Var3 = d91Var6;
            } else if (c91.a(jE5, c91.t)) {
                d91Var3 = d91.C;
            } else if (c91.a(jE5, c91.B)) {
                d91Var3 = d91.W;
            } else {
                d91Var3 = null;
            }
        } else if (iN3 == 8) {
            long jE6 = hd0.e(keyEvent.getKeyCode());
            if (c91.a(jE6, c91.v) || c91.a(jE6, c91.J)) {
                d91Var3 = d91Var7;
            } else if (c91.a(jE6, c91.w) || c91.a(jE6, c91.K)) {
                d91Var3 = d91Var8;
            } else {
                d91Var3 = null;
            }
        } else if (iN3 == 1 && c91.a(hd0.e(keyEvent.getKeyCode()), c91.t)) {
            d91Var3 = d91.E;
        } else {
            d91Var3 = null;
        }
        if (d91Var3 != null) {
            return d91Var3;
        }
        Object obj = t1Var.f;
        int iN4 = wc0.N(keyEvent);
        d91 d91Var9 = d91.a0;
        if (iN4 != 10) {
            d91 d91Var10 = d91.w;
            d91 d91Var11 = d91.y;
            d91 d91Var12 = d91.x;
            if (iN4 == 2) {
                long jE7 = hd0.e(keyEvent.getKeyCode());
                if (c91.a(jE7, c91.j) || c91.a(jE7, c91.x) || c91.a(jE7, c91.N)) {
                    d91Var4 = d91Var10;
                } else if (c91.a(jE7, c91.l)) {
                    d91Var4 = d91Var12;
                } else if (c91.a(jE7, c91.m)) {
                    d91Var4 = d91Var11;
                } else if (c91.a(jE7, c91.i)) {
                    d91Var4 = d91.F;
                } else if (c91.a(jE7, c91.n)) {
                    d91Var4 = d91Var9;
                } else if (c91.a(jE7, c91.o)) {
                    d91Var4 = d91.Z;
                }
            } else if (iN4 == 8) {
                long jE8 = hd0.e(keyEvent.getKeyCode());
                if (c91.a(jE8, c91.f) || c91.a(jE8, c91.H)) {
                    d91Var4 = d91.G;
                } else if (c91.a(jE8, c91.g) || c91.a(jE8, c91.I)) {
                    d91Var4 = d91.H;
                } else if (c91.a(jE8, c91.d) || c91.a(jE8, c91.F)) {
                    d91Var4 = d91.I;
                } else if (c91.a(jE8, c91.e) || c91.a(jE8, c91.G)) {
                    d91Var4 = d91.J;
                } else if (c91.a(jE8, c91.C) || c91.a(jE8, c91.L)) {
                    d91Var4 = d91.K;
                } else if (c91.a(jE8, c91.D) || c91.a(jE8, c91.M)) {
                    d91Var4 = d91.L;
                } else if (c91.a(jE8, c91.v) || c91.a(jE8, c91.J)) {
                    d91Var4 = d91Var7;
                } else if (c91.a(jE8, c91.w) || c91.a(jE8, c91.K)) {
                    d91Var4 = d91Var8;
                } else if (c91.a(jE8, c91.x) || c91.a(jE8, c91.N)) {
                    d91Var4 = d91Var12;
                }
            } else if (iN4 == 0) {
                long jE9 = hd0.e(keyEvent.getKeyCode());
                if (c91.a(jE9, c91.f) || c91.a(jE9, c91.H)) {
                    d91Var4 = d91.f;
                } else if (c91.a(jE9, c91.g) || c91.a(jE9, c91.I)) {
                    d91Var4 = d91.g;
                } else if (c91.a(jE9, c91.d) || c91.a(jE9, c91.F)) {
                    d91Var4 = d91.p;
                } else if (c91.a(jE9, c91.e) || c91.a(jE9, c91.G)) {
                    d91Var4 = d91.q;
                } else if (c91.a(jE9, c91.h)) {
                    d91Var4 = d91.r;
                } else if (c91.a(jE9, c91.C) || c91.a(jE9, c91.L)) {
                    d91Var4 = d91.s;
                } else if (c91.a(jE9, c91.D) || c91.a(jE9, c91.M)) {
                    d91Var4 = d91.t;
                } else if (c91.a(jE9, c91.v) || c91.a(jE9, c91.J)) {
                    d91Var4 = d91.l;
                } else if (c91.a(jE9, c91.w) || c91.a(jE9, c91.K)) {
                    d91Var4 = d91.m;
                } else if (c91.a(jE9, c91.r) || c91.a(jE9, c91.E)) {
                    d91Var4 = d91Var5;
                } else if (c91.a(jE9, c91.s)) {
                    d91Var4 = d91Var6;
                } else if (c91.a(jE9, c91.t)) {
                    d91Var4 = d91.A;
                } else if (c91.a(jE9, c91.A)) {
                    d91Var4 = d91Var12;
                } else if (c91.a(jE9, c91.y)) {
                    d91Var4 = d91Var11;
                } else if (c91.a(jE9, c91.z)) {
                    d91Var4 = d91Var10;
                } else if (c91.a(jE9, c91.p)) {
                    d91Var4 = d91.Y;
                }
            }
        } else if (c91.a(hd0.e(keyEvent.getKeyCode()), c91.o)) {
            d91Var4 = d91Var9;
        }
        return d91Var4;
    }

    public synchronized void w(mp1 mp1Var) {
        mp1Var.f = true;
        notifyAll();
    }

    public /* synthetic */ k91(int i) {
        this.e = i;
    }

    private final void t() {
    }

    @Override // defpackage.e12
    public int n(int i) {
        return i;
    }

    @Override // defpackage.e12
    public int r(int i) {
        return i;
    }

    private final void u(int i, Object obj) {
    }

    public void v(ya2 ya2Var, int i, int i2) {
    }

    @Override // defpackage.vn2
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.vn2
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
