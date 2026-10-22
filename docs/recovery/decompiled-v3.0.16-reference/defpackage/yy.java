package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yy implements sd3 {
    public final /* synthetic */ int e;
    public final d31 f;

    public /* synthetic */ yy(d31 d31Var, int i) {
        this.e = i;
        this.f = d31Var;
    }

    public static rd3 a(d31 d31Var, zw0 zw0Var, zd3 zd3Var, u61 u61Var) {
        rd3 rd3VarCreate;
        Object objN = d31Var.s(new zd3(u61Var.value())).n();
        boolean zNullSafe = u61Var.nullSafe();
        if (objN instanceof rd3) {
            rd3VarCreate = (rd3) objN;
        } else {
            if (!(objN instanceof sd3)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objN.getClass().getName() + " as a @JsonAdapter for " + sb.h0(zd3Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            rd3VarCreate = ((sd3) objN).create(zw0Var, zd3Var);
        }
        return (rd3VarCreate == null || !zNullSafe) ? rd3VarCreate : rd3VarCreate.nullSafe();
    }

    @Override // defpackage.sd3
    public final rd3 create(zw0 zw0Var, zd3 zd3Var) {
        Type[] actualTypeArguments;
        int i = this.e;
        Type type = Object.class;
        d31 d31Var = this.f;
        switch (i) {
            case 0:
                Type type2 = zd3Var.b;
                Class cls = zd3Var.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                da0.p(Collection.class.isAssignableFrom(cls));
                Type typeC0 = sb.c0(type2, cls, sb.T(type2, cls, Collection.class), new HashMap());
                type = typeC0 instanceof ParameterizedType ? ((ParameterizedType) typeC0).getActualTypeArguments()[0] : Object.class;
                return new xo(zw0Var, type, zw0Var.c(new zd3(type)), d31Var.s(zd3Var));
            case 1:
                u61 u61Var = (u61) zd3Var.a.getAnnotation(u61.class);
                if (u61Var == null) {
                    return null;
                }
                return a(d31Var, zw0Var, zd3Var, u61Var);
            default:
                Type type3 = zd3Var.b;
                Class cls2 = zd3Var.a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    da0.p(Map.class.isAssignableFrom(cls2));
                    Type typeC1 = sb.c0(type3, cls2, sb.T(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = typeC1 instanceof ParameterizedType ? ((ParameterizedType) typeC1).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                rd3 rd3VarC = (type4 == Boolean.TYPE || type4 == Boolean.class) ? wd3.c : zw0Var.c(new zd3(type4));
                rd3 rd3VarC2 = zw0Var.c(new zd3(actualTypeArguments[1]));
                q02 q02VarS = d31Var.s(zd3Var);
                Type[] typeArr = actualTypeArguments;
                return new yp1(this, zw0Var, typeArr[0], rd3VarC, typeArr[1], rd3VarC2, q02VarS);
        }
    }
}
