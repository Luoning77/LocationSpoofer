package com.vincenthzr.locationspoofer.data.cloud;

import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import defpackage.am1;
import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.j41;
import defpackage.jq1;
import defpackage.k41;
import defpackage.mh0;
import defpackage.o51;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.xq1;
import defpackage.yo;
import defpackage.z60;
import defpackage.z70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudGeoRepository {
    private final StateFlow<CloudAccountState> accountState;
    private final CloudRepository cloud;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository$environment$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository", f = "CloudGeoRepository.kt", l = {83}, m = "environment")
    public static final class AnonymousClass1 extends r60 {
        double D$0;
        double D$1;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudGeoRepository.this.environment(null, 0.0d, 0.0d, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository$providers$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository", f = "CloudGeoRepository.kt", l = {23}, m = "providers")
    public static final class C00081 extends r60 {
        int label;
        /* synthetic */ Object result;

        public C00081(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudGeoRepository.this.providers(this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository$reverse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository", f = "CloudGeoRepository.kt", l = {40}, m = "reverse")
    public static final class C00091 extends r60 {
        double D$0;
        double D$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00091(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudGeoRepository.this.reverse(0.0d, 0.0d, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository$route$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository", f = "CloudGeoRepository.kt", l = {63}, m = "route")
    public static final class C00101 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00101(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudGeoRepository.this.route(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository$search$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository", f = "CloudGeoRepository.kt", l = {30}, m = "search")
    public static final class C00111 extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00111(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudGeoRepository.this.search(null, null, this);
        }
    }

    public CloudGeoRepository(CloudRepository cloudRepository) {
        cloudRepository.getClass();
        this.cloud = cloudRepository;
        this.accountState = cloudRepository.getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object environment(String str, double d, double d2, int i, q60 q60Var) throws JSONException, CloudException {
        AnonymousClass1 anonymousClass1;
        int i2;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objAuthenticatedJson$default = anonymousClass2.result;
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            String strJ = az2.j("/v2/environment/", str);
            JSONObject jSONObjectPointBody = pointBody(d, d2);
            anonymousClass2.L$0 = null;
            anonymousClass2.D$0 = d;
            anonymousClass2.D$1 = d2;
            i2 = i;
            anonymousClass2.I$0 = i2;
            anonymousClass2.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, strJ, null, jSONObjectPointBody, null, null, null, anonymousClass2, 58, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i4 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = anonymousClass2.I$0;
            ee0.J(objAuthenticatedJson$default);
        }
        JSONArray jSONArray = ((JSONObject) objAuthenticatedJson$default).getJSONArray("result");
        if (jSONArray.length() > i2) {
            b81.w("invalid_response");
            return 0;
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    private final JSONObject pointBody(double d, double d2) throws JSONException, CloudException {
        validatePoint(d, d2);
        JSONObject jSONObjectPut = new JSONObject().put("lat", d).put("lng", d2);
        jSONObjectPut.getClass();
        return jSONObjectPut;
    }

    public static /* synthetic */ Object route$default(CloudGeoRepository cloudGeoRepository, List list, String str, String str2, q60 q60Var, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "driving";
        }
        return cloudGeoRepository.route(list, str, str2, q60Var);
    }

    private final void validatePoint(double d, double d2) throws CloudException {
        if (Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE || -90.0d > d || d > 90.0d || -180.0d > d2 || d2 > 180.0d) {
            b81.w("invalid_coordinates");
        }
    }

    public final Object cells(double d, double d2, q60 q60Var) {
        return environment("cells", d, d2, 20, q60Var);
    }

    public final StateFlow<CloudAccountState> getAccountState() {
        return this.accountState;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object providers(q60 q60Var) {
        C00081 c00081;
        if (q60Var instanceof C00081) {
            c00081 = (C00081) q60Var;
            int i = c00081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00081.label = i - Integer.MIN_VALUE;
            } else {
                c00081 = new C00081(q60Var);
            }
        } else {
            c00081 = new C00081(q60Var);
        }
        C00081 c00082 = c00081;
        Object objAuthenticatedJson$default = c00082.result;
        int i2 = c00082.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            c00082.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/providers", null, null, null, null, null, c00082, 62, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAuthenticatedJson$default);
        }
        JSONObject jSONObject = (JSONObject) objAuthenticatedJson$default;
        List listG = am1.G("cells", "nominatim", "community_wifi");
        int iM = jq1.M(az.Y(listG, 10));
        if (iM < 16) {
            iM = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
        for (Object obj : listG) {
            linkedHashMap.put(obj, Boolean.valueOf(jSONObject.optBoolean((String) obj, false)));
        }
        return linkedHashMap;
    }

    public final void reportFrameworkPublicationFailure() {
        this.cloud.reportDiagnostic$core_data_globalRelease("framework_publish", new CloudException("configuration_publish_failed", null, null, null, 14, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object reverse(double d, double d2, String str, q60 q60Var) throws JSONException, CloudException {
        C00091 c00091;
        if (q60Var instanceof C00091) {
            c00091 = (C00091) q60Var;
            int i = c00091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00091.label = i - Integer.MIN_VALUE;
            } else {
                c00091 = new C00091(q60Var);
            }
        } else {
            c00091 = new C00091(q60Var);
        }
        C00091 c00092 = c00091;
        Object objAuthenticatedJson$default = c00092.result;
        int i2 = c00092.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            if (!o51.f(str, "nominatim")) {
                b81.w("invalid_engine");
                return null;
            }
            validatePoint(d, d2);
            z60 z60VarE = xq1.E(d, d2);
            CloudRepository cloudRepository = this.cloud;
            JSONObject jSONObjectPut = pointBody(z60VarE.a, z60VarE.b).put("engine", str);
            c00092.L$0 = null;
            c00092.L$1 = null;
            c00092.D$0 = d;
            c00092.D$1 = d2;
            c00092.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/places/reverse", null, jSONObjectPut, null, null, null, c00092, 58, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAuthenticatedJson$default);
        }
        JSONObject jSONObject = ((JSONObject) objAuthenticatedJson$default).getJSONObject("result");
        if (!o51.f(jSONObject.getString("coordinateSystem"), "WGS84")) {
            b81.w("invalid_response");
            return null;
        }
        Double d3 = (!jSONObject.has("lat") || jSONObject.isNull("lat")) ? null : new Double(jSONObject.getDouble("lat"));
        Double d4 = (!jSONObject.has("lng") || jSONObject.isNull("lng")) ? null : new Double(jSONObject.getDouble("lng"));
        if ((d3 == null) != (d4 == null)) {
            b81.w("invalid_response");
            return null;
        }
        if (d3 != null && d4 != null) {
            validatePoint(d3.doubleValue(), d4.doubleValue());
        }
        String string = jSONObject.getString("address");
        String strM = az2.m(string, jSONObject, "country");
        String string2 = jSONObject.getString("province");
        String strM2 = az2.m(string2, jSONObject, "city");
        String string3 = jSONObject.getString("district");
        String strM3 = az2.m(string3, jSONObject, "road");
        String string4 = jSONObject.getString("source");
        string4.getClass();
        return new CloudAddress(string, strM, string2, strM2, string3, strM3, string4, d3, d4, CloudPlaceDetailsKt.parseCloudPlaceDetails(jSONObject));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object route(List<RoutePoint> list, String str, String str2, q60 q60Var) throws JSONException, CloudException {
        C00101 c00101;
        if (q60Var instanceof C00101) {
            c00101 = (C00101) q60Var;
            int i = c00101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00101.label = i - Integer.MIN_VALUE;
            } else {
                c00101 = new C00101(q60Var);
            }
        } else {
            c00101 = new C00101(q60Var);
        }
        C00101 c00102 = c00101;
        Object objAuthenticatedJson$default = c00102.result;
        int i2 = c00102.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            if (!yo.H0(new String[]{"self_hosted", "nominatim"}).contains(str)) {
                b81.w("invalid_engine");
                return null;
            }
            if (!yo.H0(new String[]{"walking", "cycling", "driving"}).contains(str2)) {
                b81.w("invalid_route");
                return null;
            }
            int size = list.size();
            if (2 > size || size >= 13) {
                b81.w("invalid_route");
                return null;
            }
            for (RoutePoint routePoint : list) {
                validatePoint(routePoint.getLat(), routePoint.getLng());
            }
            JSONObject jSONObjectPut = new JSONObject().put("engine", str).put("mode", str2);
            JSONArray jSONArray = new JSONArray();
            for (RoutePoint routePoint2 : list) {
                z60 z60VarE = xq1.E(routePoint2.getLat(), routePoint2.getLng());
                jSONArray.put(pointBody(z60VarE.a, z60VarE.b));
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("points", jSONArray);
            CloudRepository cloudRepository = this.cloud;
            c00102.L$0 = null;
            c00102.L$1 = null;
            c00102.L$2 = null;
            c00102.L$3 = null;
            c00102.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/routes/plan", null, jSONObjectPut2, null, null, null, c00102, 58, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAuthenticatedJson$default);
        }
        JSONObject jSONObject = ((JSONObject) objAuthenticatedJson$default).getJSONObject("result");
        if (!o51.f(jSONObject.getString("coordinateSystem"), "WGS84")) {
            b81.w("invalid_response");
            return r7;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("points");
        int length = jSONArray2.length();
        if (2 > length || length >= 10001) {
            b81.w("invalid_response");
            return r7;
        }
        k41 k41VarF0 = mh0.f0(0, jSONArray2.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (true) {
            j41 j41Var = (j41) it;
            if (!j41Var.g) {
                String string = jSONObject.getString("source");
                string.getClass();
                return new CloudRoute(arrayList, string);
            }
            JSONObject jSONObject2 = jSONArray2.getJSONObject(j41Var.nextInt());
            double d = jSONObject2.getDouble("lat");
            double d2 = jSONObject2.getDouble("lng");
            double dOptDouble = jSONObject2.optDouble("waitSec", 0.0d);
            validatePoint(d, d2);
            if (Math.abs(dOptDouble) > Double.MAX_VALUE || 0.0d > dOptDouble || dOptDouble > 3600.0d) {
                break;
            }
            z60 z60VarS = xq1.S(d, d2);
            arrayList.add(new RoutePoint(z60VarS.a, z60VarS.b, dOptDouble));
        }
        b81.w("invalid_response");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object search(String str, String str2, q60 q60Var) throws JSONException, CloudException {
        C00111 c00111;
        if (q60Var instanceof C00111) {
            c00111 = (C00111) q60Var;
            int i = c00111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00111.label = i - Integer.MIN_VALUE;
            } else {
                c00111 = new C00111(q60Var);
            }
        } else {
            c00111 = new C00111(q60Var);
        }
        Object objSearch = c00111.result;
        int i2 = c00111.label;
        if (i2 == 0) {
            ee0.J(objSearch);
            if (!o51.f(str, "nominatim")) {
                b81.w("invalid_engine");
                return null;
            }
            CloudRepository cloudRepository = this.cloud;
            c00111.L$0 = null;
            c00111.L$1 = null;
            c00111.label = 1;
            objSearch = cloudRepository.search(str, str2, c00111);
            z70 z70Var = z70.e;
            if (objSearch == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objSearch);
        }
        Iterable<CloudPlace> iterable = (Iterable) objSearch;
        ArrayList arrayList = new ArrayList(az.Y(iterable, 10));
        for (CloudPlace cloudPlace : iterable) {
            z60 z60VarS = xq1.S(cloudPlace.getLat(), cloudPlace.getLng());
            arrayList.add(CloudPlace.copy$default(cloudPlace, null, null, z60VarS.a, z60VarS.b, null, null, 51, null));
        }
        return arrayList;
    }
}
