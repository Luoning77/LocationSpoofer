package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az;
import defpackage.b81;
import defpackage.j41;
import defpackage.k41;
import defpackage.k50;
import defpackage.l13;
import defpackage.mh0;
import defpackage.uj0;
import defpackage.us2;
import defpackage.vj0;
import defpackage.xs2;
import defpackage.yo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudPlaceDetailsKt {
    public static final CloudPlaceDetails parseCloudPlaceDetails(JSONObject jSONObject) throws CloudException {
        List arrayList;
        jSONObject.getClass();
        if (!jSONObject.has("details") || jSONObject.isNull("details")) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("details");
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("boundingBox");
            if (jSONArrayOptJSONArray != null) {
                if (!yo.H0(new Integer[]{0, 4}).contains(Integer.valueOf(jSONArrayOptJSONArray.length()))) {
                    throw new CloudException("invalid_response", null, null, null, 14, null);
                }
                k41 k41VarF0 = mh0.f0(0, jSONArrayOptJSONArray.length());
                arrayList = new ArrayList(az.Y(k41VarF0, 10));
                Iterator it = k41VarF0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(jSONArrayOptJSONArray.getDouble(((j41) it).nextInt())));
                }
            } else {
                if (jSONObject2.has("boundingBox")) {
                    throw new CloudException("invalid_response", null, null, null, 14, null);
                }
                arrayList = uj0.e;
            }
            if (!arrayList.isEmpty()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!(Math.abs(((Number) it2.next()).doubleValue()) <= Double.MAX_VALUE)) {
                            throw new CloudException("invalid_response", null, null, null, 14, null);
                        }
                    }
                }
                double dDoubleValue = ((Number) arrayList.get(0)).doubleValue();
                if (-90.0d <= dDoubleValue && dDoubleValue <= 90.0d) {
                    double dDoubleValue2 = ((Number) arrayList.get(0)).doubleValue();
                    double dDoubleValue3 = ((Number) arrayList.get(1)).doubleValue();
                    if (dDoubleValue2 <= dDoubleValue3 && dDoubleValue3 <= 90.0d) {
                        double dDoubleValue4 = ((Number) arrayList.get(2)).doubleValue();
                        if (-180.0d <= dDoubleValue4 && dDoubleValue4 <= 180.0d) {
                            double dDoubleValue5 = ((Number) arrayList.get(2)).doubleValue();
                            double dDoubleValue6 = ((Number) arrayList.get(3)).doubleValue();
                            if (dDoubleValue5 <= dDoubleValue6 && dDoubleValue6 <= 180.0d) {
                            }
                        }
                    }
                }
                throw new CloudException("invalid_response", null, null, null, 14, null);
            }
            Long lValueOf = (!jSONObject2.has("osmId") || jSONObject2.isNull("osmId")) ? null : Long.valueOf(jSONObject2.getLong("osmId"));
            Integer numValueOf = (!jSONObject2.has("placeRank") || jSONObject2.isNull("placeRank")) ? null : Integer.valueOf(jSONObject2.getInt("placeRank"));
            if ((lValueOf != null && lValueOf.longValue() <= 0) || (numValueOf != null && !new k41(0, 30, 1).c(numValueOf.intValue()))) {
                throw new CloudException("invalid_response", null, null, null, 14, null);
            }
            String cloudPlaceDetails$text = parseCloudPlaceDetails$text(jSONObject2, "osmType");
            return new CloudPlaceDetails(l13.k0(cloudPlaceDetails$text) ? null : cloudPlaceDetails$text, lValueOf, parseCloudPlaceDetails$text(jSONObject2, "category"), parseCloudPlaceDetails$text(jSONObject2, "type"), parseCloudPlaceDetails$text(jSONObject2, "addressType"), numValueOf, parseCloudPlaceDetails$fields(jSONObject2, "addressParts"), parseCloudPlaceDetails$fields(jSONObject2, "names"), parseCloudPlaceDetails$fields(jSONObject2, "extraTags"), arrayList, parseCloudPlaceDetails$text(jSONObject2, "attribution"), parseCloudPlaceDetails$text(jSONObject2, "attributionUrl"));
        } catch (CloudException e) {
            throw e;
        } catch (Exception unused) {
            b81.w("invalid_response");
            return null;
        }
    }

    private static final Map<String, String> parseCloudPlaceDetails$fields(JSONObject jSONObject, String str) throws JSONException, CloudException {
        if (!jSONObject.has(str)) {
            return vj0.e;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2.length() > 128) {
            b81.w("invalid_response");
            return null;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        itKeys.getClass();
        us2 us2VarN = xs2.N(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (k50) us2VarN) {
            String str2 = (String) obj;
            Object obj2 = jSONObject2.get(str2);
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            if (str3 != null) {
                if (str2.length() > 256 || str3.length() > 8192) {
                    str3 = null;
                }
                if (str3 != null) {
                    linkedHashMap.put(obj, str3);
                }
            }
            b81.w("invalid_response");
            return null;
        }
        return linkedHashMap;
    }

    private static final String parseCloudPlaceDetails$text(JSONObject jSONObject, String str) throws JSONException, CloudException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return "";
        }
        Object obj = jSONObject.get(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            if (str2.length() > 8192) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        b81.w("invalid_response");
        return null;
    }
}
