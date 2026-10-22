package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingDraftBuilder;
import com.vincenthzr.locationspoofer.data.sharing.SharingLocation;
import com.vincenthzr.locationspoofer.data.sharing.SharingTicket;
import java.util.LinkedHashSet;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ln1 extends k33 implements pu0 {
    public String e;
    public String f;
    public String g;
    public int h;
    public final /* synthetic */ ul1 i;
    public final /* synthetic */ SharingTicket j;
    public final /* synthetic */ double k;
    public final /* synthetic */ double l;
    public final /* synthetic */ we2 m;
    public final /* synthetic */ LinkedHashSet n;
    public final /* synthetic */ Location o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln1(ul1 ul1Var, SharingTicket sharingTicket, double d, double d2, we2 we2Var, LinkedHashSet linkedHashSet, Location location, long j, q60 q60Var) {
        super(2, q60Var);
        this.i = ul1Var;
        this.j = sharingTicket;
        this.k = d;
        this.l = d2;
        this.m = we2Var;
        this.n = linkedHashSet;
        this.o = location;
        this.p = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new ln1(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ln1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object objD;
        String str;
        Object objC;
        String str2;
        Object objB;
        String str3;
        String str4;
        String str5;
        Object objH;
        String str6;
        String str7;
        String str8;
        int iE;
        int length;
        int length2;
        MutableStateFlow mutableStateFlow;
        Object value;
        AppState appState;
        Location location;
        float accuracy;
        boolean zIsFromMockProvider;
        int i = this.h;
        SharingTicket sharingTicket = this.j;
        ul1 ul1Var = this.i;
        z70 z70Var = z70.e;
        if (i == 0) {
            ee0.J(obj);
            ul0 ul0Var = ul1Var.e;
            boolean z = sharingTicket != null;
            this.h = 1;
            objD = ul0Var.d(z, this);
            if (objD != z70Var) {
            }
            return z70Var;
        }
        if (i == 1) {
            ee0.J(obj);
            objD = obj;
        } else {
            if (i == 2) {
                str = this.e;
                ee0.J(obj);
                objC = obj;
                str2 = (String) objC;
                ul0 ul0Var2 = ul1Var.e;
                this.e = str;
                this.f = str2;
                this.h = 3;
                objB = ul0Var2.b(this);
                if (objB != z70Var) {
                    str3 = str;
                    str4 = str2;
                    str5 = (String) objB;
                    Long l = (Long) this.m.e;
                    this.e = str3;
                    this.f = str4;
                    this.g = str5;
                    this.h = 4;
                    objH = ig0.H(this.i, this.k, this.l, str3, str4, str5, true, l, this);
                    if (objH != z70Var) {
                        str6 = str4;
                        str7 = str5;
                        str8 = str3;
                    }
                }
                return z70Var;
            }
            if (i == 3) {
                String str9 = this.f;
                String str10 = this.e;
                ee0.J(obj);
                str4 = str9;
                str3 = str10;
                objB = obj;
                str5 = (String) objB;
                Long l2 = (Long) this.m.e;
                this.e = str3;
                this.f = str4;
                this.g = str5;
                this.h = 4;
                objH = ig0.H(this.i, this.k, this.l, str3, str4, str5, true, l2, this);
                if (objH != z70Var) {
                    str6 = str4;
                    str7 = str5;
                    str8 = str3;
                }
                return z70Var;
            }
            if (i != 4) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str11 = this.g;
            String str12 = this.f;
            String str13 = this.e;
            ee0.J(obj);
            str7 = str11;
            str6 = str12;
            str8 = str13;
            objH = obj;
        }
        this.n.add(new Long(((Number) objH).longValue()));
        if (sharingTicket != null) {
            RadioSharingDraftBuilder radioSharingDraftBuilder = RadioSharingDraftBuilder.INSTANCE;
            location = this.o;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            if (location.hasAccuracy()) {
                accuracy = location.getAccuracy();
            } else {
                accuracy = Float.NaN;
            }
            float f = accuracy;
            long time = location.getTime();
            long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
            if (Build.VERSION.SDK_INT >= 31) {
                zIsFromMockProvider = vb.e(location);
            } else {
                zIsFromMockProvider = location.isFromMockProvider();
            }
            ul1Var.l.share(sharingTicket, radioSharingDraftBuilder.build(new SharingLocation(latitude, longitude, f, time, elapsedRealtimeNanos, zIsFromMockProvider), this.p, SystemClock.elapsedRealtimeNanos(), str8, str7, str6));
        }
        ul1Var.getClass();
        vl0 vl0Var = vl0.a;
        iE = vl0.e(str8);
        length = new JSONArray(str6).length();
        length2 = new JSONArray(str7).length();
        mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
            appState = (AppState) value;
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, appState.getScannedWifiCount() + iE, appState.getScannedCellCount() + length, appState.getScannedBluetoothCount() + length2, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217699, null)));
        return mf3.a;
        str = (String) objD;
        ul0 ul0Var3 = ul1Var.e;
        this.e = str;
        this.h = 2;
        objC = ul0Var3.c(this);
        if (objC != z70Var) {
            str2 = (String) objC;
            ul0 ul0Var4 = ul1Var.e;
            this.e = str;
            this.f = str2;
            this.h = 3;
            objB = ul0Var4.b(this);
            if (objB != z70Var) {
                str3 = str;
                str4 = str2;
                str5 = (String) objB;
                Long l3 = (Long) this.m.e;
                this.e = str3;
                this.f = str4;
                this.g = str5;
                this.h = 4;
                objH = ig0.H(this.i, this.k, this.l, str3, str4, str5, true, l3, this);
                if (objH != z70Var) {
                    str6 = str4;
                    str7 = str5;
                    str8 = str3;
                    this.n.add(new Long(((Number) objH).longValue()));
                    if (sharingTicket != null) {
                        RadioSharingDraftBuilder radioSharingDraftBuilder2 = RadioSharingDraftBuilder.INSTANCE;
                        location = this.o;
                        double latitude2 = location.getLatitude();
                        double longitude2 = location.getLongitude();
                        if (location.hasAccuracy()) {
                            accuracy = location.getAccuracy();
                        } else {
                            accuracy = Float.NaN;
                        }
                        float f2 = accuracy;
                        long time2 = location.getTime();
                        long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos();
                        if (Build.VERSION.SDK_INT >= 31) {
                            zIsFromMockProvider = vb.e(location);
                        } else {
                            zIsFromMockProvider = location.isFromMockProvider();
                        }
                        ul1Var.l.share(sharingTicket, radioSharingDraftBuilder2.build(new SharingLocation(latitude2, longitude2, f2, time2, elapsedRealtimeNanos2, zIsFromMockProvider), this.p, SystemClock.elapsedRealtimeNanos(), str8, str7, str6));
                    }
                    ul1Var.getClass();
                    vl0 vl0Var2 = vl0.a;
                    iE = vl0.e(str8);
                    length = new JSONArray(str6).length();
                    length2 = new JSONArray(str7).length();
                    mutableStateFlow = ul1Var.x;
                    do {
                        value = mutableStateFlow.getValue();
                        appState = (AppState) value;
                    } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, appState.getScannedWifiCount() + iE, appState.getScannedCellCount() + length, appState.getScannedBluetoothCount() + length2, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217699, null)));
                    return mf3.a;
                }
            }
        }
        return z70Var;
    }
}
