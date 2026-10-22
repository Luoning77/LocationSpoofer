package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c implements WildcardType, Serializable {
    public final Type e;
    public final Type f;

    public c(Type[] typeArr, Type[] typeArr2) {
        da0.p(typeArr2.length <= 1);
        da0.p(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            sb.K(typeArr[0]);
            this.f = null;
            this.e = sb.J(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        sb.K(typeArr2[0]);
        da0.p(typeArr[0] == Object.class);
        this.f = sb.J(typeArr2[0]);
        this.e = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && sb.Q(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f;
        return type != null ? new Type[]{type} : sb.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.e};
    }

    public final int hashCode() {
        Type type = this.f;
        return (this.e.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f;
        if (type != null) {
            return "? super " + sb.h0(type);
        }
        Type type2 = this.e;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + sb.h0(type2);
    }
}
