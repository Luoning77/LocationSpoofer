package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.vincenthzr.locationspoofer.data.model.AppState;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class t4 extends bv0 implements au0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Object obj, int i) {
        super(0, 0, l6.class, obj, "refresh", "refresh()V");
        this.e = i;
        switch (i) {
            case Logger.WARN /* 5 */:
                super(0, 0, l6.class, obj, "signOut", "signOut()V");
                break;
            case Logger.ERROR /* 6 */:
                super(0, 0, l6.class, obj, "refresh", "refresh()V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0194 A[LOOP:1: B:30:0x0162->B:40:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x024c A[LOOP:5: B:79:0x021c->B:89:0x024c, LOOP_END] */
    @Override // defpackage.au0
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionA;
        Object value;
        Object value2;
        AppState appState;
        Object value3;
        Object value4;
        tz1 tz1Var;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((l6) this.receiver).f();
                return mf3Var;
            case 1:
                ((l6) this.receiver).e();
                return mf3Var;
            case 2:
                ((l6) this.receiver).f();
                return mf3Var;
            case 3:
                l6 l6Var = (l6) this.receiver;
                l6Var.getClass();
                l6Var.g(new h6(l6Var, (q60) null, 0));
                return mf3Var;
            case 4:
                ((l6) this.receiver).f();
                return mf3Var;
            case Logger.WARN /* 5 */:
                l6 l6Var2 = (l6) this.receiver;
                l6Var2.getClass();
                l6Var2.g(new e6(l6Var2, null, 6));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((l6) this.receiver).f();
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                l6 l6Var3 = (l6) this.receiver;
                l6Var3.getClass();
                l6Var3.g(new e6(l6Var3, null, 5));
                return mf3Var;
            case 8:
                l6 l6Var4 = (l6) this.receiver;
                l6Var4.getClass();
                l6Var4.g(new e6(l6Var4, null, 6));
                return mf3Var;
            case mc0.b /* 9 */:
                View view = (View) this.receiver;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    p1.f(view);
                }
                if (i2 < 29 || (contentCaptureSessionA = rn.a(view)) == null) {
                    return null;
                }
                return new d31(12, contentCaptureSessionA, view, false);
            case mc0.c /* 10 */:
                ul1 ul1Var = (ul1) this.receiver;
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                if (!((AppState) mutableStateFlow.getValue()).isSavingCollectionInfo()) {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, Integer.MAX_VALUE, 134217727, null)));
                }
                return mf3Var;
            case 11:
                on1.g((ul1) this.receiver);
                return mf3Var;
            case mc0.d /* 12 */:
                ul1 ul1Var2 = (ul1) this.receiver;
                ul1Var2.getClass();
                MutableStateFlow mutableStateFlow2 = ul1Var2.x;
                if (!((AppState) mutableStateFlow2.getValue()).isContinuousScanning() && !((AppState) mutableStateFlow2.getValue()).isStoppingCollection()) {
                    do {
                        value2 = mutableStateFlow2.getValue();
                        appState = (AppState) value2;
                    } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, zy.j0(appState.getCollectionRoutePoints()), null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1073741825, 134217727, null)));
                }
                return mf3Var;
            case 13:
                ul1 ul1Var3 = (ul1) this.receiver;
                ul1Var3.getClass();
                MutableStateFlow mutableStateFlow3 = ul1Var3.x;
                if (((AppState) mutableStateFlow3.getValue()).getCollectionRoutePoints().size() >= 2) {
                    do {
                        value3 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -536870913, 134217727, null)));
                }
                return mf3Var;
            case 14:
                ul1 ul1Var4 = (ul1) this.receiver;
                ul1Var4.getClass();
                MutableStateFlow mutableStateFlow4 = ul1Var4.x;
                if (!((AppState) mutableStateFlow4.getValue()).isContinuousScanning() && !((AppState) mutableStateFlow4.getValue()).isStoppingCollection()) {
                    do {
                        value4 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, true, true, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -805306369, 134217727, null)));
                }
                return mf3Var;
            case a83.e /* 15 */:
                on1.j((ul1) this.receiver);
                return mf3Var;
            case 16:
                l6 l6Var5 = (l6) this.receiver;
                l6Var5.getClass();
                l6Var5.g(new i6(l6Var5, null, 0));
                return mf3Var;
            case 17:
                ((l6) this.receiver).m.setValue(null);
                return mf3Var;
            case 18:
                ((l6) this.receiver).m.setValue(null);
                return mf3Var;
            case 19:
                return ((y53) this.receiver).V0();
            case 20:
                mp0 mp0Var = (mp0) this.receiver;
                ay1 ay1Var = mp0Var.c;
                ay1 ay1Var2 = mp0Var.d;
                rp0 rp0Var = mp0Var.a;
                dq0 dq0VarG = rp0Var.g();
                zp0 zp0Var = zp0.g;
                char c = 7;
                int i3 = 8;
                if (dq0VarG == null) {
                    Object[] objArr = ay1Var2.b;
                    long[] jArr = ay1Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            long[] jArr2 = jArr;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        ((fp0) objArr[(i4 << 3) + i6]).u0(zp0Var);
                                    }
                                    j >>= 8;
                                }
                                if (i5 == 8) {
                                    if (i4 != length) {
                                        i4++;
                                        jArr = jArr2;
                                    }
                                }
                            } else if (i4 != length) {
                                i4++;
                                jArr = jArr2;
                            }
                        }
                    }
                } else if (dq0VarG.r) {
                    if (ay1Var.c(dq0VarG)) {
                        dq0VarG.s1();
                    }
                    zp0 zp0VarR1 = dq0VarG.r1();
                    if (!dq0VarG.e.r) {
                        p21.c("visitAncestors called on an unattached node");
                    }
                    cv1 cv1Var = dq0VarG.e;
                    hb1 hb1VarO = xp1.O(dq0VarG);
                    int i7 = 0;
                    while (hb1VarO != null) {
                        if ((hb1VarO.K.f.h & 5120) != 0) {
                            while (cv1Var != null) {
                                int i8 = cv1Var.g;
                                char c2 = c;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i7++;
                                    }
                                    if ((cv1Var instanceof fp0) && ay1Var2.c(cv1Var)) {
                                        if (i7 <= 1) {
                                            ((fp0) cv1Var).u0(zp0VarR1);
                                        } else {
                                            ((fp0) cv1Var).u0(zp0.f);
                                        }
                                        ay1Var2.l(cv1Var);
                                    }
                                }
                                cv1Var = cv1Var.i;
                                c = c2;
                            }
                        }
                        char c3 = c;
                        hb1VarO = hb1VarO.u();
                        cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
                        c = c3;
                    }
                    char c4 = c;
                    Object[] objArr2 = ay1Var2.b;
                    long[] jArr3 = ay1Var2.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr3[i9];
                            int i10 = i3;
                            int i11 = i9;
                            if ((((~j2) << c4) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j2 & 255) < 128) {
                                        ((fp0) objArr2[(i11 << 3) + i13]).u0(zp0Var);
                                    }
                                    j2 >>= i10;
                                }
                                if (i12 == i10) {
                                    if (i11 != length2) {
                                        i9 = i11 + 1;
                                        i3 = i10;
                                    }
                                }
                            } else if (i11 != length2) {
                                i9 = i11 + 1;
                                i3 = i10;
                            }
                        }
                    }
                }
                if (rp0Var.g() == null || rp0Var.c.r1() == zp0Var) {
                    rp0Var.d();
                }
                ay1Var.b();
                ay1Var2.b();
                mp0Var.e = false;
                return mf3Var;
            case 21:
                return Boolean.valueOf(dq0.u1(((iq0) this.receiver).z));
            case 22:
                on1.n((ul1) this.receiver);
                return mf3Var;
            case 23:
                on1.m((ul1) this.receiver);
                return mf3Var;
            case 24:
                on1.l((ul1) this.receiver);
                return mf3Var;
            case 25:
                on1.k((ul1) this.receiver);
                return mf3Var;
            case 26:
                ul1 ul1Var5 = (ul1) this.receiver;
                ul1Var5.getClass();
                MutableStateFlow mutableStateFlow5 = ul1Var5.x;
                boolean z = !((AppState) mutableStateFlow5.getValue()).getRestartAppsOnSpoof();
                ul1Var5.c.setRestartAppsOnSpoof(z);
                while (true) {
                    Object value5 = mutableStateFlow5.getValue();
                    boolean z2 = z;
                    if (mutableStateFlow5.compareAndSet(value5, AppState.copy$default((AppState) value5, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, z2, null, 0, null, false, false, false, null, null, -1, -1, 133955583, null))) {
                        return mf3Var;
                    }
                    z = z2;
                }
                break;
            case 27:
                ((is1) this.receiver).h();
                return mf3Var;
            case 28:
                ((is1) this.receiver).h();
                return mf3Var;
            default:
                ((is1) this.receiver).h();
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(is1 is1Var) {
        super(0, 0, is1.class, is1Var, "load", "load()V");
        this.e = 29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }
}
