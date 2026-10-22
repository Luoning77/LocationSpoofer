package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import defpackage.uj0;
import defpackage.vj0;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudPlaceDetails {
    private final Map<String, String> addressParts;
    private final String addressType;
    private final String attribution;
    private final String attributionUrl;
    private final List<Double> boundingBox;
    private final String category;
    private final Map<String, String> extraTags;
    private final Map<String, String> names;
    private final Long osmId;
    private final String osmType;
    private final Integer placeRank;
    private final String type;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CloudPlaceDetails(String str, Long l, String str2, String str3, String str4, Integer num, Map map, Map map2, Map map3, List list, String str5, String str6, int i, ca0 ca0Var) {
        str = (i & 1) != 0 ? null : str;
        l = (i & 2) != 0 ? null : l;
        String str7 = (i & 4) != 0 ? "" : str2;
        String str8 = (i & 8) != 0 ? "" : str3;
        String str9 = (i & 16) != 0 ? "" : str4;
        Integer num2 = (i & 32) == 0 ? num : null;
        int i2 = i & 64;
        Map map4 = vj0.e;
        this(str, l, str7, str8, str9, num2, i2 != 0 ? map4 : map, (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? map4 : map2, (i & 256) == 0 ? map3 : map4, (i & 512) != 0 ? uj0.e : list, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? "" : str5, (i & 2048) != 0 ? "" : str6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloudPlaceDetails copy$default(CloudPlaceDetails cloudPlaceDetails, String str, Long l, String str2, String str3, String str4, Integer num, Map map, Map map2, Map map3, List list, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudPlaceDetails.osmType;
        }
        if ((i & 2) != 0) {
            l = cloudPlaceDetails.osmId;
        }
        if ((i & 4) != 0) {
            str2 = cloudPlaceDetails.category;
        }
        if ((i & 8) != 0) {
            str3 = cloudPlaceDetails.type;
        }
        if ((i & 16) != 0) {
            str4 = cloudPlaceDetails.addressType;
        }
        if ((i & 32) != 0) {
            num = cloudPlaceDetails.placeRank;
        }
        if ((i & 64) != 0) {
            map = cloudPlaceDetails.addressParts;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            map2 = cloudPlaceDetails.names;
        }
        if ((i & 256) != 0) {
            map3 = cloudPlaceDetails.extraTags;
        }
        if ((i & 512) != 0) {
            list = cloudPlaceDetails.boundingBox;
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            str5 = cloudPlaceDetails.attribution;
        }
        if ((i & 2048) != 0) {
            str6 = cloudPlaceDetails.attributionUrl;
        }
        String str7 = str5;
        String str8 = str6;
        Map map4 = map3;
        List list2 = list;
        Map map5 = map;
        Map map6 = map2;
        String str9 = str4;
        Integer num2 = num;
        return cloudPlaceDetails.copy(str, l, str2, str3, str9, num2, map5, map6, map4, list2, str7, str8);
    }

    public final String component1() {
        return this.osmType;
    }

    public final List<Double> component10() {
        return this.boundingBox;
    }

    public final String component11() {
        return this.attribution;
    }

    public final String component12() {
        return this.attributionUrl;
    }

    public final Long component2() {
        return this.osmId;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.addressType;
    }

    public final Integer component6() {
        return this.placeRank;
    }

    public final Map<String, String> component7() {
        return this.addressParts;
    }

    public final Map<String, String> component8() {
        return this.names;
    }

    public final Map<String, String> component9() {
        return this.extraTags;
    }

    public final CloudPlaceDetails copy(String str, Long l, String str2, String str3, String str4, Integer num, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, List<Double> list, String str5, String str6) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        list.getClass();
        str5.getClass();
        str6.getClass();
        return new CloudPlaceDetails(str, l, str2, str3, str4, num, map, map2, map3, list, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudPlaceDetails)) {
            return false;
        }
        CloudPlaceDetails cloudPlaceDetails = (CloudPlaceDetails) obj;
        return o51.f(this.osmType, cloudPlaceDetails.osmType) && o51.f(this.osmId, cloudPlaceDetails.osmId) && o51.f(this.category, cloudPlaceDetails.category) && o51.f(this.type, cloudPlaceDetails.type) && o51.f(this.addressType, cloudPlaceDetails.addressType) && o51.f(this.placeRank, cloudPlaceDetails.placeRank) && o51.f(this.addressParts, cloudPlaceDetails.addressParts) && o51.f(this.names, cloudPlaceDetails.names) && o51.f(this.extraTags, cloudPlaceDetails.extraTags) && o51.f(this.boundingBox, cloudPlaceDetails.boundingBox) && o51.f(this.attribution, cloudPlaceDetails.attribution) && o51.f(this.attributionUrl, cloudPlaceDetails.attributionUrl);
    }

    public final Map<String, String> getAddressParts() {
        return this.addressParts;
    }

    public final String getAddressType() {
        return this.addressType;
    }

    public final String getAttribution() {
        return this.attribution;
    }

    public final String getAttributionUrl() {
        return this.attributionUrl;
    }

    public final List<Double> getBoundingBox() {
        return this.boundingBox;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> getExtraTags() {
        return this.extraTags;
    }

    public final Map<String, String> getNames() {
        return this.names;
    }

    public final Long getOsmId() {
        return this.osmId;
    }

    public final String getOsmType() {
        return this.osmType;
    }

    public final Integer getPlaceRank() {
        return this.placeRank;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.osmType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.osmId;
        int iD = p91.d(p91.d(p91.d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.category), 31, this.type), 31, this.addressType);
        Integer num = this.placeRank;
        return this.attributionUrl.hashCode() + p91.d(p91.g(this.boundingBox, (this.extraTags.hashCode() + ((this.names.hashCode() + ((this.addressParts.hashCode() + ((iD + (num != null ? num.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31), 31, this.attribution);
    }

    public String toString() {
        String str = this.osmType;
        Long l = this.osmId;
        String str2 = this.category;
        String str3 = this.type;
        String str4 = this.addressType;
        Integer num = this.placeRank;
        Map<String, String> map = this.addressParts;
        Map<String, String> map2 = this.names;
        Map<String, String> map3 = this.extraTags;
        List<Double> list = this.boundingBox;
        String str5 = this.attribution;
        String str6 = this.attributionUrl;
        StringBuilder sb = new StringBuilder("CloudPlaceDetails(osmType=");
        sb.append(str);
        sb.append(", osmId=");
        sb.append(l);
        sb.append(", category=");
        p91.y(sb, str2, ", type=", str3, ", addressType=");
        sb.append(str4);
        sb.append(", placeRank=");
        sb.append(num);
        sb.append(", addressParts=");
        sb.append(map);
        sb.append(", names=");
        sb.append(map2);
        sb.append(", extraTags=");
        sb.append(map3);
        sb.append(", boundingBox=");
        sb.append(list);
        sb.append(", attribution=");
        sb.append(str5);
        sb.append(", attributionUrl=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public CloudPlaceDetails(String str, Long l, String str2, String str3, String str4, Integer num, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, List<Double> list, String str5, String str6) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        list.getClass();
        str5.getClass();
        str6.getClass();
        this.osmType = str;
        this.osmId = l;
        this.category = str2;
        this.type = str3;
        this.addressType = str4;
        this.placeRank = num;
        this.addressParts = map;
        this.names = map2;
        this.extraTags = map3;
        this.boundingBox = list;
        this.attribution = str5;
        this.attributionUrl = str6;
    }

    public CloudPlaceDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
