package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xj2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ xj2(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x0165  */
    @Override // defpackage.au0
    public final Object invoke() {
        double d;
        double d2;
        i52 i52Var;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                ey1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                ey1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                ey1Var.setValue(Boolean.TRUE);
                break;
            case 3:
                ey1Var.setValue(Boolean.TRUE);
                break;
            case 4:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case Logger.WARN /* 5 */:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case Logger.ERROR /* 6 */:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ey1Var.setValue("");
                break;
            case 8:
                ey1Var.setValue("");
                break;
            case mc0.b /* 9 */:
                ey1Var.setValue(null);
                break;
            case mc0.c /* 10 */:
                lr2 lr2Var = (lr2) ey1Var.getValue();
                if (lr2Var != null) {
                    g gVar = lr2Var.a;
                    Double dValueOf = Double.valueOf(0.0d);
                    if (!lr2Var.i) {
                        LatLng latLng = gVar.h().target;
                        double dA = latLng != null ? latLng.a() : 35.0d;
                        double dB = latLng != null ? latLng.b() : 105.0d;
                        if (51.0d <= dA && dA <= 72.0d) {
                            d = 0.0d;
                            if (172.0d <= dB) {
                                if (dB <= 180.0d) {
                                    i52Var = new i52(new bs2(51.0d, 172.0d), new bs2(72.0d, 180.0d));
                                } else {
                                    d2 = 72.0d;
                                }
                                bs2 bs2Var = (bs2) i52Var.e;
                                bs2 bs2Var2 = (bs2) i52Var.f;
                                nx0 nx0Var = new nx0(2);
                                LatLng latLng2 = new LatLng(bs2Var.a, bs2Var.b);
                                ArrayList arrayList = nx0Var.a;
                                arrayList.add(latLng2);
                                arrayList.add(new LatLng(bs2Var2.a, bs2Var2.b));
                                LatLngBounds latLngBoundsD = nx0Var.d();
                                int i2 = (int) (24.0f * lr2Var.c.getResources().getDisplayMetrics().density);
                                gVar.d(new mv(latLngBoundsD, dValueOf, dValueOf, i2, i2, i2, i2));
                            }
                            if (51.0d > dA && dA <= d2 && -180.0d <= dB && dB <= -129.0d) {
                                i52Var = new i52(new bs2(51.0d, -180.0d), new bs2(72.0d, -129.0d));
                            } else if (18.0d > dA && dA <= 23.0d && -161.0d <= dB && dB <= -154.0d) {
                                i52Var = new i52(new bs2(18.0d, -161.0d), new bs2(23.0d, -154.0d));
                            } else if (17.5d > dA && dA <= 19.5d && -68.5d <= dB && dB <= -64.0d) {
                                i52Var = new i52(new bs2(17.5d, -68.5d), new bs2(19.5d, -64.0d));
                            } else if (dB < d) {
                                i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                            } else {
                                i52Var = new i52(o51.r0, o51.s0);
                            }
                            bs2 bs2Var3 = (bs2) i52Var.e;
                            bs2 bs2Var4 = (bs2) i52Var.f;
                            nx0 nx0Var2 = new nx0(2);
                            LatLng latLng3 = new LatLng(bs2Var3.a, bs2Var3.b);
                            ArrayList arrayList2 = nx0Var2.a;
                            arrayList2.add(latLng3);
                            arrayList2.add(new LatLng(bs2Var4.a, bs2Var4.b));
                            LatLngBounds latLngBoundsD2 = nx0Var2.d();
                            int i3 = (int) (24.0f * lr2Var.c.getResources().getDisplayMetrics().density);
                            gVar.d(new mv(latLngBoundsD2, dValueOf, dValueOf, i3, i3, i3, i3));
                        } else {
                            d = 0.0d;
                        }
                        d2 = 72.0d;
                        if (51.0d > dA) {
                            if (18.0d > dA) {
                                if (17.5d > dA) {
                                    if (dB < d) {
                                        i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                                    } else {
                                        i52Var = new i52(o51.r0, o51.s0);
                                    }
                                } else if (dB < d) {
                                    i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                                } else {
                                    i52Var = new i52(o51.r0, o51.s0);
                                }
                            } else if (17.5d > dA) {
                                if (dB < d) {
                                    i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                                } else {
                                    i52Var = new i52(o51.r0, o51.s0);
                                }
                            } else if (dB < d) {
                                i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                            } else {
                                i52Var = new i52(o51.r0, o51.s0);
                            }
                        } else if (18.0d > dA) {
                            if (17.5d > dA) {
                                if (dB < d) {
                                    i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                                } else {
                                    i52Var = new i52(o51.r0, o51.s0);
                                }
                            } else if (dB < d) {
                                i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                            } else {
                                i52Var = new i52(o51.r0, o51.s0);
                            }
                        } else if (17.5d > dA) {
                            if (dB < d) {
                                i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                            } else {
                                i52Var = new i52(o51.r0, o51.s0);
                            }
                        } else if (dB < d) {
                            i52Var = new i52(new bs2(24.0d, -125.0d), new bs2(50.0d, -66.0d));
                        } else {
                            i52Var = new i52(o51.r0, o51.s0);
                        }
                        bs2 bs2Var5 = (bs2) i52Var.e;
                        bs2 bs2Var6 = (bs2) i52Var.f;
                        nx0 nx0Var3 = new nx0(2);
                        LatLng latLng4 = new LatLng(bs2Var5.a, bs2Var5.b);
                        ArrayList arrayList3 = nx0Var3.a;
                        arrayList3.add(latLng4);
                        arrayList3.add(new LatLng(bs2Var6.a, bs2Var6.b));
                        LatLngBounds latLngBoundsD3 = nx0Var3.d();
                        int i4 = (int) (24.0f * lr2Var.c.getResources().getDisplayMetrics().density);
                        gVar.d(new mv(latLngBoundsD3, dValueOf, dValueOf, i4, i4, i4, i4));
                    }
                }
                break;
            case 11:
                ey1Var.setValue(Boolean.TRUE);
                break;
            case mc0.d /* 12 */:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case 14:
                ey1Var.setValue(Boolean.TRUE);
                break;
            case a83.e /* 15 */:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case 16:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case 17:
                ey1Var.setValue(Boolean.FALSE);
                break;
            case 18:
                ey1Var.setValue("");
                break;
            case 19:
                ey1Var.setValue(Boolean.TRUE);
                break;
            default:
                ey1Var.setValue(Boolean.FALSE);
                break;
        }
        return mf3Var;
    }
}
