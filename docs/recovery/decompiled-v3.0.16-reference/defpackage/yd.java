package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.cloud.CloudPlace;
import com.vincenthzr.locationspoofer.data.cloud.CloudPlaceDetails;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yd extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public Object f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(CloudGeoSource cloudGeoSource, MapEngine mapEngine, String str, lu0 lu0Var, Context context, q60 q60Var) {
        super(2, q60Var);
        this.e = 9;
        this.h = cloudGeoSource;
        this.i = mapEngine;
        this.j = str;
        this.f = lu0Var;
        this.k = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x0209  */
    /* JADX WARN: Code duplicated, block: B:128:0x0216  */
    /* JADX WARN: Code duplicated, block: B:132:0x0223  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    private final Object f(Object obj) {
        int i;
        lu0 lu0Var = (lu0) this.f;
        int i2 = this.g;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                String strEngine = ((CloudGeoSource) this.h).engine(((MapEngine) this.i).name(), true);
                gn gnVar = j9.O;
                if (gnVar == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                CloudGeoRepository cloudGeoRepository = (CloudGeoRepository) ((kn2) ((mn2) gnVar.a).h).a(xe2.a(CloudGeoRepository.class), null);
                String str = (String) this.j;
                this.g = 1;
                obj = cloudGeoRepository.search(strEngine, str, this);
                z70 z70Var = z70.e;
                if (obj == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            Iterable<CloudPlace> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(az.Y(iterable, 10));
            for (CloudPlace cloudPlace : iterable) {
                CloudPlaceDetails details = cloudPlace.getDetails();
                String attribution = details != null ? details.getAttribution() : null;
                if (attribution == null) {
                    attribution = "";
                }
                arrayList.add(new sn(cloudPlace.getTitle(), cloudPlace.getAddress(), cloudPlace.getLat(), cloudPlace.getLng(), l13.k0(attribution) ? cloudPlace.getSource() : cloudPlace.getSource() + "\n" + attribution));
            }
            JobKt.ensureActive(getContext());
            lu0Var.invoke(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            JobKt.ensureActive(getContext());
            Context context = (Context) this.k;
            context.getClass();
            CloudException cloudException = e2 instanceof CloudException ? (CloudException) e2 : null;
            String code = cloudException != null ? cloudException.getCode() : null;
            if (code != null) {
                switch (code) {
                    case "device_already_bound":
                        i = 2131624186;
                        break;
                    case "route_too_complex":
                        i = 2131624192;
                        break;
                    case "quota_exceeded":
                        i = 2131624191;
                        break;
                    case "subscription_required":
                        i = 2131624327;
                        break;
                    case "software_device_limit":
                        i = 2131625020;
                        break;
                    case "rate_limited":
                        i = 2131624191;
                        break;
                    case "invalid_session":
                        i = 2131624186;
                        break;
                    case "provider_operation_unsupported":
                        i = 2131624188;
                        break;
                    case "place_not_found":
                        i = 2131624194;
                        break;
                    case "software_membership_required":
                        i = 2131625027;
                        break;
                    case "login_required":
                        i = 2131624186;
                        break;
                    case "invalid_route":
                        i = 2131624192;
                        break;
                    case "device_migration_required":
                        i = 2131624186;
                        break;
                    case "network_error":
                        i = 2131624187;
                        break;
                    case "wifi_database_unavailable":
                        i = 2131624336;
                        break;
                    case "provider_unavailable":
                        i = 2131624197;
                        break;
                    case "device_login_required":
                        i = 2131624419;
                        break;
                    case "service_quota_exceeded":
                        i = 2131624191;
                        break;
                    case "route_too_long":
                        i = 2131624192;
                        break;
                    case "wifi_query_limit":
                        i = 2131624322;
                        break;
                    case "route_not_found":
                        i = 2131624193;
                        break;
                    case "map_result_too_coarse":
                        i = 2131624196;
                        break;
                    case "outside_map_coverage":
                        i = 2131624189;
                        break;
                    default:
                        i = 2131624184;
                        break;
                }
            } else {
                i = 2131624184;
            }
            String string = context.getString(i);
            string.getClass();
            Toast.makeText(context, string, 1).show();
            lu0Var.invoke(uj0.e);
        }
        return mf3.a;
    }

    public static final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((au0) it.next()).invoke();
            } catch (Throwable unused) {
            }
        }
        list.clear();
    }

    public static final void h(ProducerScope producerScope, ve2 ve2Var, d31 d31Var, ArrayList arrayList, boolean z) {
        Object next;
        Location lastKnownLocation;
        ve2 ve2Var2 = ve2Var;
        if (CoroutineScopeKt.isActive(producerScope)) {
            long j = ve2Var2.e + 1;
            ve2Var2.e = j;
            g(arrayList);
            ArrayList arrayListR = d31Var.r();
            int i = 0;
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayListR.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListR.get(i2);
                    i2++;
                    try {
                        lastKnownLocation = ((LocationManager) d31Var.g).getLastKnownLocation((String) obj);
                    } catch (IllegalArgumentException unused) {
                        lastKnownLocation = null;
                    }
                    if (lastKnownLocation != null) {
                        arrayList2.add(lastKnownLocation);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    if (d31.w((Location) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long elapsedRealtimeNanos = ((Location) next).getElapsedRealtimeNanos();
                        do {
                            Object next2 = it.next();
                            long elapsedRealtimeNanos2 = ((Location) next2).getElapsedRealtimeNanos();
                            if (elapsedRealtimeNanos < elapsedRealtimeNanos2) {
                                next = next2;
                                elapsedRealtimeNanos = elapsedRealtimeNanos2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Location location = (Location) next;
                if (location != null && d31.w(location)) {
                    producerScope.mo32trySendJP2dKIU(location);
                    return;
                }
            }
            int size3 = arrayListR.size();
            SecurityException securityException = null;
            while (i < size3) {
                int i4 = i + 1;
                String str = (String) arrayListR.get(i);
                try {
                    try {
                        arrayList.add(d31Var.C(str, new g80(j, ve2Var2, d31Var, str, producerScope)));
                    } catch (IllegalArgumentException unused2) {
                    } catch (SecurityException e) {
                        e = e;
                        securityException = e;
                    }
                } catch (IllegalArgumentException unused3) {
                } catch (SecurityException e2) {
                    e = e2;
                }
                ve2Var2 = ve2Var;
                i = i4;
            }
            if (arrayList.isEmpty() && securityException != null) {
                throw securityException;
            }
        }
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                yd ydVar = new yd((af) this.i, (lu0) this.f, (zd) this.j, (ge1) obj2, q60Var, 0);
                ydVar.h = obj;
                return ydVar;
            case 1:
                return new yd((ConfigManager) this.j, (lu0) obj2, q60Var);
            case 2:
                return new yd((me1) this.h, (ey1) this.i, (l83) this.f, (x73) this.j, (c11) obj2, q60Var, 2);
            case 3:
                return new yd((gt) this.h, (f83) this.i, (me1) this.f, (y83) this.j, (e12) obj2, q60Var, 3);
            case 4:
                yd ydVar2 = new yd((d31) obj2, q60Var, 4);
                ydVar2.h = obj;
                return ydVar2;
            case Logger.WARN /* 5 */:
                yd ydVar3 = new yd((ke2) this.f, (je2) this.j, (sg) obj2, q60Var, 5);
                ydVar3.h = obj;
                return ydVar3;
            case Logger.ERROR /* 6 */:
                return new yd((d31) this.h, (we2) this.i, (we2) this.f, (oi2) this.j, (ni2) obj2, q60Var, 6);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return new yd((Context) this.i, (CloudRepository) this.f, (ey1) this.j, (ey1) obj2, q60Var, 7);
            case 8:
                yd ydVar4 = new yd((au0) obj2, q60Var, 8);
                ydVar4.j = obj;
                return ydVar4;
            case mc0.b /* 9 */:
                return new yd((CloudGeoSource) this.h, (MapEngine) this.i, (String) this.j, (lu0) this.f, (Context) obj2, q60Var);
            case mc0.c /* 10 */:
                yd ydVar5 = new yd((ca2) this.i, (ds1) this.f, (vu1) this.j, (tb2) obj2, q60Var, 10);
                ydVar5.h = obj;
                return ydVar5;
            default:
                yd ydVar6 = new yd((ub3) this.f, (wo2) this.j, (we2) obj2, q60Var, 11);
                ydVar6.h = obj;
                return ydVar6;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case 1:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 4:
                return ((yd) create((ProducerScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.WARN /* 5 */:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 8:
                ((yd) create((FlowCollector) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return z70Var;
            case mc0.b /* 9 */:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case mc0.c /* 10 */:
                return ((yd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((yd) create((uo2) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0407 A[Catch: all -> 0x0329, TryCatch #1 {all -> 0x0329, blocks: (B:114:0x0324, B:149:0x03f4, B:150:0x03fa, B:152:0x03ff, B:153:0x0400, B:155:0x0407, B:157:0x0415, B:159:0x041b, B:162:0x0421, B:164:0x0425, B:165:0x0429, B:166:0x042c, B:167:0x042f, B:186:0x047e, B:187:0x047f, B:151:0x03fb), top: B:318:0x0316, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0415 A[Catch: all -> 0x0329, TryCatch #1 {all -> 0x0329, blocks: (B:114:0x0324, B:149:0x03f4, B:150:0x03fa, B:152:0x03ff, B:153:0x0400, B:155:0x0407, B:157:0x0415, B:159:0x041b, B:162:0x0421, B:164:0x0425, B:165:0x0429, B:166:0x042c, B:167:0x042f, B:186:0x047e, B:187:0x047f, B:151:0x03fb), top: B:318:0x0316, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x041b A[Catch: all -> 0x0329, TryCatch #1 {all -> 0x0329, blocks: (B:114:0x0324, B:149:0x03f4, B:150:0x03fa, B:152:0x03ff, B:153:0x0400, B:155:0x0407, B:157:0x0415, B:159:0x041b, B:162:0x0421, B:164:0x0425, B:165:0x0429, B:166:0x042c, B:167:0x042f, B:186:0x047e, B:187:0x047f, B:151:0x03fb), top: B:318:0x0316, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x041e  */
    /* JADX WARN: Code duplicated, block: B:169:0x044b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0551  */
    /* JADX WARN: Code duplicated, block: B:333:0x03fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x01df  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e0 A[Catch: all -> 0x017f, PHI: r3 r5 r6 r8
      0x01e0: PHI (r3v57 java.lang.Object) = (r3v56 java.lang.Object), (r3v61 java.lang.Object) binds: [B:56:0x01dd, B:47:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r5v29 kotlinx.coroutines.channels.Channel) = (r5v28 kotlinx.coroutines.channels.Channel), (r5v33 kotlinx.coroutines.channels.Channel) binds: [B:56:0x01dd, B:47:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r6v10 ??) = (r6v15 ??), (r6v16 ??) binds: [B:56:0x01dd, B:47:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r8v24 kotlinx.coroutines.flow.FlowCollector) = (r8v23 kotlinx.coroutines.flow.FlowCollector), (r8v28 kotlinx.coroutines.flow.FlowCollector) binds: [B:56:0x01dd, B:47:0x0198] A[DONT_GENERATE, DONT_INLINE], TryCatch #13 {all -> 0x017f, blocks: (B:47:0x0198, B:58:0x01e0, B:55:0x01cf, B:60:0x01ea, B:41:0x017b), top: B:339:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ea A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #13 {all -> 0x017f, blocks: (B:47:0x0198, B:58:0x01e0, B:55:0x01cf, B:60:0x01ea, B:41:0x017b), top: B:339:0x0165 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [g8] */
    /* JADX WARN: Type inference failed for: r2v39, types: [g8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [g8] */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, us1] */
    /* JADX WARN: Type inference failed for: r6v12, types: [us1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [us1] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007f -> B:16:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01e8 -> B:55:0x01cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(ConfigManager configManager, lu0 lu0Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 1;
        this.j = configManager;
        this.k = lu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Object obj, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Object obj, Object obj2, Object obj3, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = obj;
        this.j = obj2;
        this.k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Object obj, Object obj2, Object obj3, Object obj4, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
        this.f = obj2;
        this.j = obj3;
        this.k = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.f = obj3;
        this.j = obj4;
        this.k = obj5;
    }
}
