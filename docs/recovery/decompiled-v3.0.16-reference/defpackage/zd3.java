package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zd3 {
    public final Class a;
    public final Type b;
    public final int c;

    public zd3(Type type) {
        Objects.requireNonNull(type);
        Type typeJ = sb.J(type);
        this.b = typeJ;
        this.a = sb.V(typeJ);
        this.c = typeJ.hashCode();
    }

    public static zd3 a(Type... typeArr) {
        TypeVariable[] typeParameters = List.class.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(List.class.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            Class<?> clsV = sb.V(type);
            TypeVariable typeVariable = typeParameters[i];
            for (Type type2 : typeVariable.getBounds()) {
                if (!sb.V(type2).isAssignableFrom(clsV)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + List.class);
                }
            }
        }
        return new zd3(new b(null, List.class, typeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zd3) {
            return sb.Q(this.b, ((zd3) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return sb.h0(this.b);
    }
}
