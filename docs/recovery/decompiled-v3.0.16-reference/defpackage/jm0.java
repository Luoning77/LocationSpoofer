package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jm0 implements sd3, Cloneable {
    public static final jm0 g;
    public List e;
    public List f;

    static {
        jm0 jm0Var = new jm0();
        List list = Collections.EMPTY_LIST;
        jm0Var.e = list;
        jm0Var.f = list;
        g = jm0Var;
    }

    public static boolean b(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final void a(boolean z) {
        Iterator it = (z ? this.e : this.f).iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }

    public final Object clone() {
        try {
            return (jm0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.sd3
    public final rd3 create(zw0 zw0Var, zd3 zd3Var) {
        boolean z;
        boolean z2;
        boolean zB = b(zd3Var.a);
        if (zB) {
            z = true;
        } else {
            a(true);
            z = false;
        }
        if (zB) {
            z2 = true;
        } else {
            a(false);
            z2 = false;
        }
        if (z || z2) {
            return new im0(this, z2, z, zw0Var, zd3Var);
        }
        return null;
    }
}
