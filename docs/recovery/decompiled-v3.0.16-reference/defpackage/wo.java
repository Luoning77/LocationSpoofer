package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wo implements sd3 {
    public final /* synthetic */ int e;

    public /* synthetic */ wo(int i) {
        this.e = i;
    }

    @Override // defpackage.sd3
    public final rd3 create(zw0 zw0Var, zd3 zd3Var) {
        int i = 0;
        switch (this.e) {
            case 0:
                Type type = zd3Var.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new xo(zw0Var, zw0Var.c(new zd3(genericComponentType)), sb.V(genericComponentType));
            case 1:
                if (zd3Var.a == Date.class) {
                    return new a03(2);
                }
                return null;
            case 2:
                if (zd3Var.a == Object.class) {
                    return new v02(zw0Var);
                }
                return null;
            case 3:
                if (zd3Var.a == java.sql.Date.class) {
                    return new a03(0);
                }
                return null;
            case 4:
                if (zd3Var.a == Time.class) {
                    return new a03(1);
                }
                return null;
            case Logger.WARN /* 5 */:
                if (zd3Var.a == Timestamp.class) {
                    return new b03(zw0Var.c(new zd3(Date.class)), i);
                }
                return null;
            default:
                Class superclass = zd3Var.a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new yp1(superclass);
        }
    }
}
