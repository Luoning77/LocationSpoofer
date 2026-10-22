package defpackage;

import java.util.ArrayList;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nx0 {
    public final ArrayList a;

    public nx0(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList(32);
                break;
            default:
                this.a = new ArrayList(20);
                break;
        }
    }

    public void a(String str, String str2) {
        str2.getClass();
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(l13.D0(str2).toString());
    }

    public void b(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        this.a.add(new u62(f, f2, 0.0f, z, z2, f3, f4));
    }

    public ox0 c() {
        return new ox0((String[]) this.a.toArray(new String[0]));
    }

    public LatLngBounds d() {
        ArrayList arrayList = this.a;
        if (arrayList.size() < 2) {
            throw new iv(p91.m(arrayList.size(), "Cannot create a LatLngBounds from ", " items"));
        }
        LatLngBounds.Companion.getClass();
        int size = arrayList.size();
        double dMin = 90.0d;
        double dMin2 = Double.MAX_VALUE;
        int i = 0;
        double dMax = -90.0d;
        double dMax2 = -1.7976931348623157E308d;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LatLng latLng = (LatLng) obj;
            double dA = latLng.a();
            ArrayList arrayList2 = arrayList;
            double dB = latLng.b();
            dMin = Math.min(dMin, dA);
            dMin2 = Math.min(dMin2, dB);
            dMax = Math.max(dMax, dA);
            dMax2 = Math.max(dMax2, dB);
            size = size;
            arrayList = arrayList2;
        }
        return new LatLngBounds(dMax, dMax2, dMin, dMin2);
    }

    public void e() {
        this.a.add(m62.c);
    }

    public void f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new n62(f, f2, f3, f4, f5, f6));
    }

    public void g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new v62(f, f2, f3, f4, f5, f6));
    }

    public void h(float f) {
        this.a.add(new o62(f));
    }

    public void i(float f) {
        this.a.add(new w62(f));
    }

    public void j(LatLng latLng) {
        latLng.getClass();
        this.a.add(latLng);
    }

    public void k(float f, float f2) {
        this.a.add(new p62(f, f2));
    }

    public void l(float f, float f2) {
        this.a.add(new x62(f, f2));
    }

    public void m(float f, float f2) {
        this.a.add(new q62(f, f2));
    }

    public void n(float f, float f2, float f3, float f4) {
        this.a.add(new s62(f, f2, f3, f4));
    }

    public void o(float f, float f2, float f3, float f4) {
        this.a.add(new a72(f, f2, f3, f4));
    }

    public void p(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void q(String str, String str2) {
        str2.getClass();
        ld0.m(str);
        ld0.n(str2, str);
        p(str);
        a(str, str2);
    }

    public void r(float f) {
        this.a.add(new d72(f));
    }

    public void s(float f) {
        this.a.add(new c72(f));
    }
}
