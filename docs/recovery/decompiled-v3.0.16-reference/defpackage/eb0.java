package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class eb0 {
    public static final db2 a;

    static {
        a = new db2((30 & 1) == 0, ip2.e, true, 0);
    }

    public static final void a(k63 k63Var, x53 x53Var, f30 f30Var, int i) {
        Context context;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1904307118);
        int i2 = (ov0Var.f(k63Var) ? 4 : 2) | i | (ov0Var.h(x53Var) ? 32 : 16);
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                ov0Var.c0(-1009482584);
                context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-1009433480);
                ov0Var.p(false);
                context = null;
            }
            boolean zH = ov0Var.h(x53Var) | ((i2 & 14) == 4) | ov0Var.h(context);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                objQ = new ji1(x53Var, context, k63Var, 6);
                ov0Var.m0(objQ);
            }
            n60.b(null, null, (lu0) objQ, ov0Var, 0, 3);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i, 13, k63Var, x53Var);
        }
    }

    public static final void b(final int i, final long j, f30 f30Var, final int i2) {
        final int i3;
        int i4;
        ee2 ee2VarT;
        pu0 pu0Var;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (ov0Var.d(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var.e(j) ? 32 : 16;
        }
        if (ov0Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            boolean zF = ((i4 & 14) == 4) | ov0Var.f(context);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                ov0Var.m0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            if (iIntValue == -1) {
                ee2VarT = ov0Var.t();
                if (ee2VarT == null) {
                    return;
                }
                final int i5 = 1;
                pu0Var = new pu0() { // from class: cb0
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        mf3 mf3Var = mf3.a;
                        int i7 = i2;
                        long j2 = j;
                        int i8 = i3;
                        f30 f30Var2 = (f30) obj;
                        ((Integer) obj2).getClass();
                        switch (i6) {
                            case 0:
                                eb0.b(i8, j2, f30Var2, wc0.m0(i7 | 1));
                                break;
                            default:
                                eb0.b(i8, j2, f30Var2, wc0.m0(i7 | 1));
                                break;
                        }
                        return mf3Var;
                    }
                };
            } else {
                f52 f52VarF = ig0.F(iIntValue, ov0Var);
                boolean z = (i4 & 112) == 32;
                Object objQ2 = ov0Var.Q();
                if (z || objQ2 == c30Var) {
                    objQ2 = j == 16 ? null : new rr(5, j);
                    ov0Var.m0(objQ2);
                }
                ws.a(sb.Y(iw2.k(av1.a, m60.e), f52VarF, null, f60.a, (rr) objQ2, 22), ov0Var, 0);
            }
            ee2VarT.d = pu0Var;
        }
        ov0Var.W();
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final int i6 = 0;
            pu0Var = new pu0() { // from class: cb0
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    mf3 mf3Var = mf3.a;
                    int i8 = i2;
                    long j2 = j;
                    int i9 = i;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            eb0.b(i9, j2, f30Var2, wc0.m0(i8 | 1));
                            break;
                        default:
                            eb0.b(i9, j2, f30Var2, wc0.m0(i8 | 1));
                            break;
                    }
                    return mf3Var;
                }
            };
            ee2VarT.d = pu0Var;
        }
    }

    public static final void c(k63 k63Var, y53 y53Var, au0 au0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ov0Var.f(k63Var) : ov0Var.h(k63Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ov0Var.f(y53Var) : ov0Var.h(y53Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        boolean z = false;
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && ov0Var.f(y53Var));
            Object objQ = ov0Var.Q();
            int i3 = 12;
            c30 c30Var = d30.a;
            if (z2 || objQ == c30Var) {
                objQ = new pn1(new t1(new m5(i3, y53Var, au0Var), 15));
                ov0Var.m0(objQ);
            }
            pn1 pn1Var = (pn1) objQ;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && ov0Var.h(k63Var))) {
                z = true;
            }
            Object objQ2 = ov0Var.Q();
            if (z || objQ2 == c30Var) {
                objQ2 = new hd(k63Var, 12);
                ov0Var.m0(objQ2);
            }
            jf.a(pn1Var, (au0) objQ2, a, sb.a0(1315155414, new j2(i3, y53Var, k63Var), ov0Var), ov0Var, 3456, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(k63Var, y53Var, au0Var, i, 6);
        }
    }

    public static final void d(dv1 dv1Var, p10 p10Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            da0.j(dv1Var, i63.a, p10Var, ov0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kg(dv1Var, p10Var, i, i3);
        }
    }
}
