package defpackage;

import android.os.RemoteException;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.model.RouteTravelMode;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import com.vincenthzr.locationspoofer.data.model.SimMode;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class l extends bv0 implements lu0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    private final Object f(Object obj) throws Throwable {
        h00 h00Var;
        d91 d91VarS;
        Integer numValueOf;
        KeyEvent keyEvent = ((e91) obj).a;
        j73 j73Var = (j73) this.receiver;
        e93 e93Var = j73Var.f;
        boolean z = j73Var.d;
        boolean z2 = true;
        if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
            h00Var = null;
        } else {
            r90 r90Var = j73Var.i;
            r90Var.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                r90Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                Integer num = r90Var.a;
                if (num != null) {
                    r90Var.a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    Integer numValueOf2 = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        unicodeChar = numValueOf2.intValue();
                    }
                    numValueOf = Integer.valueOf(unicodeChar);
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                h00Var = new h00(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            } else {
                h00Var = null;
            }
        }
        if (h00Var != null) {
            if (z) {
                j73Var.a(am1.F(h00Var));
                e93Var.a = null;
            } else {
                z2 = false;
            }
        } else if (mh0.L(keyEvent) != 2 || (d91VarS = ks.K.s(keyEvent)) == null || (d91VarS.e && !z)) {
            z2 = false;
        } else {
            se2 se2Var = new se2();
            se2Var.e = true;
            ji1 ji1Var = new ji1(d91VarS, j73Var, se2Var, 21);
            f83 f83Var = j73Var.c;
            m73 m73Var = new m73(f83Var, j73Var.g, j73Var.a.d(), e93Var);
            ji1Var.invoke(m73Var);
            boolean zB = f93.b(m73Var.f, f83Var.b);
            dj djVar = m73Var.g;
            if (!zB || !o51.f(djVar, f83Var.a)) {
                j73Var.j.invoke(f83.a(f83Var, djVar, m73Var.f, 4));
            }
            j73Var.h.e = true;
            z2 = se2Var.e;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0b55 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0b57 A[LOOP:13: B:136:0x0b0c->B:146:0x0b57, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x0b5b A[SYNTHETIC] */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        CloudAccount account;
        String id;
        Object value10;
        int i = this.e;
        int i2 = 0;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                s sVar = (s) this.receiver;
                lx1 lx1Var = sVar.H;
                if (zBooleanValue) {
                    sVar.w1();
                } else {
                    q60 q60Var = null;
                    if (sVar.u != null) {
                        Object[] objArr = lx1Var.c;
                        long[] jArr = lx1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j) < 128) {
                                            BuildersKt__Builders_commonKt.launch$default(sVar.a1(), null, null, new q(sVar, (vb2) objArr[(i3 << 3) + i5], q60Var, i2), 3, null);
                                        }
                                        j >>= 8;
                                    }
                                    if (i4 == 8) {
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                        vb2 vb2Var = sVar.J;
                        if (vb2Var != null) {
                            BuildersKt__Builders_commonKt.launch$default(sVar.a1(), null, null, new q(sVar, vb2Var, q60Var, 1), 3, null);
                        }
                    }
                    lx1Var.a();
                    sVar.J = null;
                    sVar.x1();
                }
                return mf3Var;
            case 1:
                Set set = (Set) obj;
                set.getClass();
                a61 a61Var = (a61) this.receiver;
                ReentrantLock reentrantLock = a61Var.e;
                reentrantLock.lock();
                try {
                    List<b12> listJ0 = zy.J0(a61Var.d.values());
                    reentrantLock.unlock();
                    for (b12 b12Var : listJ0) {
                        b12Var.getClass();
                        int[] iArr = b12Var.b;
                        int length2 = iArr.length;
                        Collection collectionL = zj0.e;
                        if (length2 != 0) {
                            if (length2 != 1) {
                                lt2 lt2Var = new lt2();
                                int length3 = iArr.length;
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < length3) {
                                    int i8 = i7 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i6]))) {
                                        lt2Var.add(b12Var.c[i7]);
                                    }
                                    i6++;
                                    i7 = i8;
                                }
                                collectionL = mc0.l(lt2Var);
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                collectionL = b12Var.d;
                            }
                        }
                        if (!collectionL.isEmpty()) {
                            d31 d31Var = b12Var.a;
                            d31Var.getClass();
                            collectionL.getClass();
                            pw1 pw1Var = (pw1) d31Var.g;
                            if (!pw1Var.e.get()) {
                                try {
                                    h01 h01Var = pw1Var.g;
                                    if (h01Var != null) {
                                        h01Var.d((String[]) collectionL.toArray(new String[0]), pw1Var.f);
                                    }
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                                }
                            }
                        }
                    }
                    return mf3Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                SavedLocation savedLocation = (SavedLocation) obj;
                savedLocation.getClass();
                an1.d((ul1) this.receiver, savedLocation);
                return mf3Var;
            case 3:
                String str = (String) obj;
                str.getClass();
                hn1.j((ul1) this.receiver, str);
                return mf3Var;
            case 4:
                hn1.k((ul1) this.receiver, ((Number) obj).intValue());
                return mf3Var;
            case Logger.WARN /* 5 */:
                String str2 = (String) obj;
                str2.getClass();
                hn1.l((ul1) this.receiver, str2);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                SearchMode searchMode = (SearchMode) obj;
                searchMode.getClass();
                hn1.m((ul1) this.receiver, searchMode);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                SearchMode searchMode2 = (SearchMode) obj;
                searchMode2.getClass();
                hn1.m((ul1) this.receiver, searchMode2);
                return mf3Var;
            case 8:
                RouteRunMode routeRunMode = (RouteRunMode) obj;
                routeRunMode.getClass();
                ul1 ul1Var = (ul1) this.receiver;
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, routeRunMode, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1025, 134217727, null)));
                return mf3Var;
            case mc0.b /* 9 */:
                SimMode simMode = (SimMode) obj;
                simMode.getClass();
                ul1 ul1Var2 = (ul1) this.receiver;
                ul1Var2.getClass();
                MutableStateFlow mutableStateFlow2 = ul1Var2.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, simMode, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -2049, 134217727, null)));
                return mf3Var;
            case mc0.c /* 10 */:
                double dDoubleValue = ((Number) obj).doubleValue();
                ul1 ul1Var3 = (ul1) this.receiver;
                ul1Var3.getClass();
                MutableStateFlow mutableStateFlow3 = ul1Var3.x;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, mh0.t(dDoubleValue, 0.1d, 100.0d), false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -4097, 134217727, null)));
                return mf3Var;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ul1 ul1Var4 = (ul1) this.receiver;
                ul1Var4.getClass();
                MutableStateFlow mutableStateFlow4 = ul1Var4.x;
                do {
                    value4 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, zBooleanValue2, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -65537, 134217727, null)));
                return mf3Var;
            case mc0.d /* 12 */:
                RouteTravelMode routeTravelMode = (RouteTravelMode) obj;
                routeTravelMode.getClass();
                ul1 ul1Var5 = (ul1) this.receiver;
                ul1Var5.getClass();
                MutableStateFlow mutableStateFlow5 = ul1Var5.x;
                do {
                    value5 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value5, AppState.copy$default((AppState) value5, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, routeTravelMode, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -131073, 134217727, null)));
                return mf3Var;
            case 13:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ul1 ul1Var6 = (ul1) this.receiver;
                ul1Var6.getClass();
                MutableStateFlow mutableStateFlow6 = ul1Var6.x;
                do {
                    value6 = mutableStateFlow6.getValue();
                } while (!mutableStateFlow6.compareAndSet(value6, AppState.copy$default((AppState) value6, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, zBooleanValue3, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -262145, 134217727, null)));
                return mf3Var;
            case 14:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ul1 ul1Var7 = (ul1) this.receiver;
                ul1Var7.getClass();
                MutableStateFlow mutableStateFlow7 = ul1Var7.x;
                do {
                    value7 = mutableStateFlow7.getValue();
                } while (!mutableStateFlow7.compareAndSet(value7, AppState.copy$default((AppState) value7, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, zBooleanValue4, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -8193, 134217727, null)));
                return mf3Var;
            case a83.e /* 15 */:
                int iIntValue = ((Number) obj).intValue();
                ul1 ul1Var8 = (ul1) this.receiver;
                ul1Var8.getClass();
                MutableStateFlow mutableStateFlow8 = ul1Var8.x;
                do {
                    value8 = mutableStateFlow8.getValue();
                } while (!mutableStateFlow8.compareAndSet(value8, AppState.copy$default((AppState) value8, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, iIntValue, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -16385, 134217727, null)));
                return mf3Var;
            case 16:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                ul1 ul1Var9 = (ul1) this.receiver;
                ul1Var9.getClass();
                MutableStateFlow mutableStateFlow9 = ul1Var9.x;
                do {
                    value9 = mutableStateFlow9.getValue();
                } while (!mutableStateFlow9.compareAndSet(value9, AppState.copy$default((AppState) value9, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, zBooleanValue5, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -32769, 134217727, null)));
                return mf3Var;
            case 17:
                String str3 = (String) obj;
                str3.getClass();
                hn1.j((ul1) this.receiver, str3);
                return mf3Var;
            case 18:
                hn1.k((ul1) this.receiver, ((Number) obj).intValue());
                return mf3Var;
            case 19:
                String str4 = (String) obj;
                str4.getClass();
                hn1.l((ul1) this.receiver, str4);
                return mf3Var;
            case 20:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                ul1 ul1Var10 = (ul1) this.receiver;
                ul1Var10.getClass();
                ul1Var10.c.setRouteLateralDeviation(zBooleanValue6);
                MutableStateFlow mutableStateFlow10 = ul1Var10.x;
                while (true) {
                    Object value11 = mutableStateFlow10.getValue();
                    boolean z = zBooleanValue6;
                    if (mutableStateFlow10.compareAndSet(value11, AppState.copy$default((AppState) value11, null, null, null, false, false, null, false, null, null, false, false, z, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -2049, -1, 134217727, null))) {
                        return mf3Var;
                    }
                    zBooleanValue6 = z;
                }
                break;
            case 21:
                SearchMode searchMode3 = (SearchMode) obj;
                searchMode3.getClass();
                hn1.m((ul1) this.receiver, searchMode3);
                return mf3Var;
            case 22:
                SearchMode searchMode4 = (SearchMode) obj;
                searchMode4.getClass();
                hn1.m((ul1) this.receiver, searchMode4);
                return mf3Var;
            case 23:
                ((RadioSharingManager) this.receiver).setEnabled(((Boolean) obj).booleanValue());
                return mf3Var;
            case 24:
                long j2 = ((c12) obj).a;
                c63 c63Var = (c63) this.receiver;
                c63Var.getClass();
                g63 g63Var = (g63) xq1.C(c63Var, i63.a);
                if (g63Var != null) {
                    BuildersKt__Builders_commonKt.launch$default(c63Var.a1(), null, null, new n(c63Var, j2, g63Var, new b63(c63Var, j2), (q60) null), 3, null);
                }
                return mf3Var;
            case 25:
                ((v53) this.receiver).b.a((lu0) obj);
                return mf3Var;
            case 26:
                return f(obj);
            default:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                xg3 xg3Var = (xg3) this.receiver;
                CloudRepository cloudRepository = xg3Var.b;
                MutableStateFlow mutableStateFlow11 = xg3Var.c;
                if (!((og3) mutableStateFlow11.getValue()).n && ((og3) mutableStateFlow11.getValue()).m != null && cloudRepository.getState().getValue().getValidated() && (account = cloudRepository.getState().getValue().getAccount()) != null && (id = account.getId()) != null) {
                    xg3Var.e();
                    long j3 = xg3Var.h.get();
                    do {
                        value10 = mutableStateFlow11.getValue();
                    } while (!mutableStateFlow11.compareAndSet(value10, og3.a((og3) value10, false, null, null, null, null, 0, 0, 0L, null, false, false, false, null, true, null, 8191)));
                    xg3Var.m = BuildersKt__Builders_commonKt.launch$default(am1.y(xg3Var), Dispatchers.getIO(), null, new ug3(xg3Var, zBooleanValue7, j3, id, null), 2, null);
                }
                return mf3Var;
        }
    }
}
