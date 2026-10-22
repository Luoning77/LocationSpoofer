package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o50 implements q02 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Type f;

    public /* synthetic */ o50(Type type, int i) {
        this.e = i;
        this.f = type;
    }

    @Override // defpackage.q02
    public final Object n() {
        int i = this.e;
        Type type = this.f;
        switch (i) {
            case 0:
                if (!(type instanceof ParameterizedType)) {
                    fo.g(type, "Invalid EnumSet type: ");
                    return null;
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                fo.g(type, "Invalid EnumSet type: ");
                return null;
            default:
                if (!(type instanceof ParameterizedType)) {
                    fo.g(type, "Invalid EnumMap type: ");
                    return null;
                }
                Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type3 instanceof Class) {
                    return new EnumMap((Class) type3);
                }
                fo.g(type, "Invalid EnumMap type: ");
                return null;
        }
    }
}
