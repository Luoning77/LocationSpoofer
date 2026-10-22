package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.sync.LocalSyncData;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class v70 implements pu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ v70(int i) {
        this.e = 5;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b9 A[LOOP:1: B:35:0x0172->B:48:0x01b9, LOOP_END] */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f00 f00Var;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                y70 y70Var = (y70) obj;
                w70 w70Var = (w70) obj2;
                y70Var.getClass();
                w70Var.getClass();
                y70 y70VarMinusKey = y70Var.minusKey(w70Var.getKey());
                sj0 sj0Var = sj0.e;
                if (y70VarMinusKey == sj0Var) {
                    return w70Var;
                }
                j9 j9Var = j9.B;
                s60 s60Var = (s60) y70VarMinusKey.get(j9Var);
                if (s60Var == null) {
                    f00Var = new f00(y70VarMinusKey, w70Var);
                } else {
                    y70 y70VarMinusKey2 = y70VarMinusKey.minusKey(j9Var);
                    if (y70VarMinusKey2 == sj0Var) {
                        return new f00(w70Var, s60Var);
                    }
                    f00Var = new f00(new f00(y70VarMinusKey2, w70Var), s60Var);
                }
                return f00Var;
            case 1:
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (w70) obj2));
            case 2:
                return CoroutineContextKt.foldCopies$lambda$2((y70) obj, (w70) obj2);
            case 3:
                jg0 jg0Var = (jg0) obj;
                lu0 lu0Var = (lu0) obj2;
                jg0Var.getClass();
                lu0Var.getClass();
                lu0Var.invoke(jg0Var);
                return mf3Var;
            case 4:
                return EncryptedCloudSessionStore._init_$lambda$1((KeyStore) obj, (String) obj2);
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                ig0.f(wc0.m0(1), (f30) obj);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return HookStatus.methodHooked$lambda$4((Integer) obj, (Integer) obj2);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                yd1 yd1Var = (yd1) obj2;
                return am1.G(Integer.valueOf(((t52) yd1Var.e.b).g()), Integer.valueOf(((t52) yd1Var.e.c).g()));
            case 8:
                Map mapC = ((be1) obj2).c();
                if (mapC.isEmpty()) {
                    return null;
                }
                return mapC;
            case mc0.b /* 9 */:
                return LocalSyncData.apply$lambda$20((Map) obj, (Map) obj2);
            case mc0.c /* 10 */:
                List list = (List) obj2;
                ((pl2) obj).getClass();
                list.getClass();
                ArrayList arrayList = new ArrayList(az.Y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ml1) it.next()).name());
                }
                return arrayList;
            case 11:
                return Integer.valueOf(((zq1) obj).u0(((Integer) obj2).intValue()));
            case mc0.d /* 12 */:
                return Integer.valueOf(((zq1) obj).s0(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((zq1) obj).w(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((zq1) obj).j0(((Integer) obj2).intValue()));
            case a83.e /* 15 */:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (w70) obj2));
            case 16:
                rl2 rl2Var = (rl2) obj2;
                Map map = rl2Var.e;
                zx1 zx1Var = rl2Var.f;
                Object[] objArr = zx1Var.b;
                Object[] objArr2 = zx1Var.c;
                long[] jArr = zx1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj3 = objArr[i5];
                                    Map mapC2 = ((tl2) objArr2[i5]).c();
                                    if (mapC2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapC2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 17:
                return obj2;
            case 18:
                dj djVar = (dj) obj2;
                return am1.d(djVar.f, an2.a(djVar.e, an2.a, (pl2) obj));
            case 19:
                return Integer.valueOf(((p63) obj2).a);
            case 20:
                j83 j83Var = (j83) obj2;
                return am1.d(Float.valueOf(j83Var.a), Float.valueOf(j83Var.b));
            case 21:
                pl2 pl2Var = (pl2) obj;
                k83 k83Var = (k83) obj2;
                w93 w93Var = new w93(k83Var.a);
                zm2 zm2Var = an2.v;
                return am1.d(an2.a(w93Var, zm2Var, pl2Var), an2.a(new w93(k83Var.b), zm2Var, pl2Var));
            case 22:
                return Integer.valueOf(((jr0) obj2).e);
            case 23:
                ag1 ag1Var = (ag1) obj2;
                return am1.d(ag1Var.a, an2.a(ag1Var.b, an2.i, (pl2) obj));
            case 24:
                return Float.valueOf(((qq) obj2).a);
            case 25:
                pl2 pl2Var2 = (pl2) obj;
                List list2 = (List) obj2;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size = list2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList2.add(an2.a((cj) list2.get(i6), an2.b, pl2Var2));
                }
                return arrayList2;
            case 26:
                f93 f93Var = (f93) obj2;
                return am1.d(Integer.valueOf((int) (f93Var.a >> 32)), Integer.valueOf((int) (f93Var.a & 4294967295L)));
            case 27:
                pl2 pl2Var3 = (pl2) obj;
                xt2 xt2Var = (xt2) obj2;
                return am1.d(an2.a(new hz(xt2Var.a), an2.p, pl2Var3), an2.a(new c12(xt2Var.b), an2.x, pl2Var3), Float.valueOf(xt2Var.c));
            case 28:
                return Integer.valueOf(((m53) obj2).a);
            default:
                return Integer.valueOf(((r63) obj2).a);
        }
    }

    public /* synthetic */ v70(int i, byte b) {
        this.e = i;
    }
}
