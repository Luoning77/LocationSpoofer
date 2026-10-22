package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudPlace {
    private final String address;
    private final CloudPlaceDetails details;
    private final double lat;
    private final double lng;
    private final String source;
    private final String title;

    public CloudPlace(String str, String str2, double d, double d2, String str3, CloudPlaceDetails cloudPlaceDetails) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.address = str2;
        this.lat = d;
        this.lng = d2;
        this.source = str3;
        this.details = cloudPlaceDetails;
    }

    public static /* synthetic */ CloudPlace copy$default(CloudPlace cloudPlace, String str, String str2, double d, double d2, String str3, CloudPlaceDetails cloudPlaceDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudPlace.title;
        }
        if ((i & 2) != 0) {
            str2 = cloudPlace.address;
        }
        if ((i & 4) != 0) {
            d = cloudPlace.lat;
        }
        if ((i & 8) != 0) {
            d2 = cloudPlace.lng;
        }
        if ((i & 16) != 0) {
            str3 = cloudPlace.source;
        }
        if ((i & 32) != 0) {
            cloudPlaceDetails = cloudPlace.details;
        }
        double d3 = d2;
        double d4 = d;
        return cloudPlace.copy(str, str2, d4, d3, str3, cloudPlaceDetails);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.address;
    }

    public final double component3() {
        return this.lat;
    }

    public final double component4() {
        return this.lng;
    }

    public final String component5() {
        return this.source;
    }

    public final CloudPlaceDetails component6() {
        return this.details;
    }

    public final CloudPlace copy(String str, String str2, double d, double d2, String str3, CloudPlaceDetails cloudPlaceDetails) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new CloudPlace(str, str2, d, d2, str3, cloudPlaceDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudPlace)) {
            return false;
        }
        CloudPlace cloudPlace = (CloudPlace) obj;
        return o51.f(this.title, cloudPlace.title) && o51.f(this.address, cloudPlace.address) && Double.compare(this.lat, cloudPlace.lat) == 0 && Double.compare(this.lng, cloudPlace.lng) == 0 && o51.f(this.source, cloudPlace.source) && o51.f(this.details, cloudPlace.details);
    }

    public final String getAddress() {
        return this.address;
    }

    public final CloudPlaceDetails getDetails() {
        return this.details;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD = p91.d(p91.a(this.lng, p91.a(this.lat, p91.d(this.title.hashCode() * 31, 31, this.address), 31), 31), 31, this.source);
        CloudPlaceDetails cloudPlaceDetails = this.details;
        return iD + (cloudPlaceDetails == null ? 0 : cloudPlaceDetails.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.address;
        double d = this.lat;
        double d2 = this.lng;
        String str3 = this.source;
        CloudPlaceDetails cloudPlaceDetails = this.details;
        StringBuilder sbT = p91.t("CloudPlace(title=", str, ", address=", str2, ", lat=");
        sbT.append(d);
        az2.x(sbT, ", lng=", d2, ", source=");
        sbT.append(str3);
        sbT.append(", details=");
        sbT.append(cloudPlaceDetails);
        sbT.append(")");
        return sbT.toString();
    }

    public /* synthetic */ CloudPlace(String str, String str2, double d, double d2, String str3, CloudPlaceDetails cloudPlaceDetails, int i, ca0 ca0Var) {
        this(str, str2, d, d2, str3, (i & 32) != 0 ? null : cloudPlaceDetails);
    }
}
