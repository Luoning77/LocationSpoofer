package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a implements GenericArrayType, Serializable {
    public final Type e;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.e = sb.J(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && sb.Q(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return sb.h0(this.e) + "[]";
    }
}
