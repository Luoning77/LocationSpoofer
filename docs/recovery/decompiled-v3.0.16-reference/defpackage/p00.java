package defpackage;

import android.view.textclassifier.TextClassifier;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p00 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p00(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = 2;
        switch (this.e) {
            case 0:
                return new p00((l6) this.f, q60Var, 0);
            case 1:
                return new p00((ConfigManager) this.f, q60Var, 1);
            case 2:
                return new p00((lu0) this.f, q60Var, i);
            case 3:
                return new p00((List) this.f, q60Var, 3);
            case 4:
                return new p00((is1) this.f, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new p00((d92) this.f, q60Var, 5);
            case Logger.ERROR /* 6 */:
                p00 p00Var = new p00(i, q60Var);
                p00Var.f = obj;
                return p00Var;
            default:
                return new p00((RadioSharingManager) this.f, q60Var, 7);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 1:
                ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 2:
                ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 3:
                return ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 4:
                ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case Logger.WARN /* 5 */:
                return ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                return ((p00) create((ie2) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                ((p00) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        double d;
        Integer numValueOf;
        int i = this.e;
        int i2 = 1;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ee0.J(obj);
                l6 l6Var = (l6) this.f;
                l6Var.g(new i6(l6Var, null, 0));
                return mf3Var;
            case 1:
                ee0.J(obj);
                ConfigManager configManager = (ConfigManager) this.f;
                configManager.rootManager.getClass();
                if (!wi2.a("set -e\nrm -f /proc/1/root/data/local/tmp/locationspoofer_config.json \\\n    /proc/1/root/data/local/tmp/locationspoofer_config_tmp.json \\\n    /proc/1/root/data/local/tmp/locationspoofer_config.json.input.* \\\n    /proc/1/root/data/local/tmp/.lsp_selinux_probe \\\n    /proc/1/root/data/local/tmp/.lsp_sepolicy_apply.sh \\\n    /proc/1/root/data/system/locationspoofer_config.json \\\n    /proc/1/root/data/system/locationspoofer_config_tmp.json \\\n    /proc/1/root/data/system/locationspoofer_config.json.tmp.* \\\n    /proc/1/root/data/data/com.vincenthzr.locationspoofer/files/locationspoofer_config.json\nfor domain in com.android.phone com.android.bluetooth; do\n    rm -f \"/proc/1/root/data/user_de/0/$domain/files/locationspoofer_config.json\" \\\n        \"/proc/1/root/data/user_de/0/$domain/files/locationspoofer_config.json.tmp\" \\\n        /proc/1/root/data/user_de/0/$domain/files/locationspoofer_config.json.tmp.*\ndone", null).equals("ERROR")) {
                    configManager.transportPrefs.edit().putBoolean("legacy_files_removed", true).apply();
                }
                return mf3Var;
            case 2:
                ee0.J(obj);
                ((lu0) this.f).invoke(Boolean.FALSE);
                return mf3Var;
            case 3:
                ee0.J(obj);
                List list = (List) this.f;
                list.getClass();
                int size = list.size();
                int i3 = 2;
                gv0 gv0Var = gv0.e;
                if (size < 2) {
                    return new dv0(gv0Var);
                }
                List listC0 = zy.C0(list, new gq0(9));
                double d2 = (((y0) zy.t0(listC0)).a - ((y0) zy.n0(listC0)).a) / 1.0E9d;
                if (d2 < 8.0d) {
                    return new dv0(gv0Var);
                }
                double d3 = 50.0d;
                int i4 = (int) (d2 * 50.0d);
                float[] fArrF0 = wc0.f0(listC0, i4, new zs0(i3));
                float[] fArrF1 = wc0.f0(listC0, i4, new zs0(3));
                float[] fArrF2 = wc0.f0(listC0, i4, new zs0(4));
                double[] dArr = new double[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    float f = fArrF0[i5];
                    float f2 = fArrF1[i5];
                    float f3 = (f2 * f2) + (f * f);
                    float f4 = fArrF2[i5];
                    dArr[i5] = Math.sqrt((f4 * f4) + f3);
                }
                double[] dArrV = wc0.V(dArr, 50);
                double[] dArr2 = new double[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    dArr2[i6] = dArr[i6] - dArrV[i6];
                }
                double[] dArrV2 = wc0.V(dArr2, 5);
                double d4 = 0.0d;
                if (dArrV2.length < 168) {
                    d = 50.0d;
                    numValueOf = null;
                } else {
                    double d5 = 0.0d;
                    for (double d6 : dArrV2) {
                        d5 = (d6 * d6) + d5;
                    }
                    if (d5 <= 0.0d) {
                        d = 50.0d;
                    } else {
                        double d7 = Double.NEGATIVE_INFINITY;
                        int i7 = 12;
                        int i8 = 12;
                        while (true) {
                            int length = dArrV2.length - i7;
                            d = d3;
                            double d8 = 0.0d;
                            for (int i9 = 0; i9 < length; i9++) {
                                d8 = (dArrV2[i9] * dArrV2[i9 + i7]) + d8;
                            }
                            double d9 = d8 / d5;
                            if (d9 > d7) {
                                i8 = i7;
                                d7 = d9;
                            }
                            if (i7 != 42) {
                                i7++;
                                d3 = d;
                            } else if (d7 >= 0.2d) {
                                int i10 = i8 / 2;
                                if (i10 >= 12) {
                                    int length2 = dArrV2.length - i10;
                                    double d10 = 0.0d;
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        d10 = (dArrV2[i11] * dArrV2[i11 + i10]) + d10;
                                    }
                                    if (d10 / d5 > d7 * 0.8d) {
                                        numValueOf = Integer.valueOf(i10);
                                    } else {
                                        numValueOf = Integer.valueOf(i8);
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(i8);
                                }
                            }
                        }
                    }
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return new dv0(gv0.f);
                }
                int iIntValue = numValueOf.intValue();
                int i12 = (int) (((double) iIntValue) * 0.6d);
                for (double d11 : dArrV2) {
                    d4 += d11 * d11;
                }
                double dSqrt = Math.sqrt(d4 / ((double) dArrV2.length));
                ArrayList arrayList = new ArrayList();
                int length3 = dArrV2.length - 1;
                for (int i13 = 1; i13 < length3; i13++) {
                    double d12 = dArrV2[i13];
                    if (d12 >= 0.3d * dSqrt && d12 >= dArrV2[i13 - 1] && d12 >= dArrV2[i13 + 1]) {
                        if (arrayList.isEmpty() || i13 - ((Number) zy.t0(arrayList)).intValue() >= i12) {
                            arrayList.add(Integer.valueOf(i13));
                        } else if (dArrV2[i13] > dArrV2[((Number) zy.t0(arrayList)).intValue()]) {
                            arrayList.set(arrayList.size() - 1, Integer.valueOf(i13));
                        }
                    }
                }
                int i14 = iIntValue * 2;
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 2;
                    if (i16 >= arrayList.size()) {
                        int i17 = i2;
                        if (arrayList2.size() < 4) {
                            return new dv0(gv0.g);
                        }
                        ArrayList arrayList3 = new ArrayList(az.Y(arrayList2, 10));
                        int size2 = arrayList2.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj2 = arrayList2.get(i18);
                            i18++;
                            k41 k41Var = (k41) obj2;
                            arrayList3.add(Double.valueOf(((double) ((k41Var.f + i17) - k41Var.e)) / d));
                        }
                        double dE0 = 120.0d / zy.e0(arrayList3);
                        if (Double.isNaN(dE0)) {
                            fo.i("Cannot round NaN value.");
                            return null;
                        }
                        return new ev0(new hv0(wc0.D(arrayList2, fArrF0), wc0.D(arrayList2, fArrF1), wc0.D(arrayList2, fArrF2), dE0 > 2.147483647E9d ? Integer.MAX_VALUE : dE0 < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(dE0), arrayList2.size()));
                    }
                    int iIntValue2 = ((Number) arrayList.get(i15)).intValue();
                    int iIntValue3 = ((Number) arrayList.get(i16)).intValue();
                    int i19 = i2;
                    if (Math.abs((iIntValue3 - iIntValue2) - i14) <= ((double) i14) * 0.25d) {
                        arrayList2.add(mh0.f0(iIntValue2, iIntValue3));
                    }
                    i15 = i16;
                    i2 = i19;
                }
                break;
            case 4:
                ee0.J(obj);
                ((is1) this.f).h();
                return mf3Var;
            case Logger.WARN /* 5 */:
                ee0.J(obj);
                d92 d92Var = (d92) this.f;
                TextClassifier textClassifierB = ad0.b(d92Var.b, d92Var.c);
                d92Var.f = textClassifierB;
                return textClassifierB;
            case Logger.ERROR /* 6 */:
                ee0.J(obj);
                return Boolean.valueOf(((ie2) this.f) == ie2.e);
            default:
                ee0.J(obj);
                ((RadioSharingManager) this.f).refresh();
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p00(int i, q60 q60Var) {
        super(i, q60Var);
        this.e = 6;
    }
}
