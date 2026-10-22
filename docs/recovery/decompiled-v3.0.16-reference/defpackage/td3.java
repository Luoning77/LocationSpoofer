package defpackage;

import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class td3 implements sd3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ rd3 g;

    public /* synthetic */ td3(Object obj, rd3 rd3Var, int i) {
        this.e = i;
        this.f = obj;
        this.g = rd3Var;
    }

    @Override // defpackage.sd3
    public final rd3 create(zw0 zw0Var, zd3 zd3Var) {
        int i = this.e;
        rd3 rd3Var = this.g;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (zd3Var.a == ((Class) obj)) {
                    return rd3Var;
                }
                return null;
            case 1:
                Class<?> cls = zd3Var.a;
                if (((Class) obj).isAssignableFrom(cls)) {
                    return new xo(this, cls);
                }
                return null;
            default:
                if (zd3Var.equals((zd3) obj)) {
                    return (BoundingBoxTypeAdapter) rd3Var;
                }
                return null;
        }
    }

    public String toString() {
        int i = this.e;
        rd3 rd3Var = this.g;
        Object obj = this.f;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + rd3Var + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + rd3Var + "]";
            default:
                return super.toString();
        }
    }
}
