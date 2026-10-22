package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.ca0;
import defpackage.l13;
import defpackage.o51;
import defpackage.yo;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HotReloadHost {
    public static final Companion Companion = new Companion(null);
    private final ClassLoader classLoader;
    private final String packageName;

    public HotReloadHost(String str, ClassLoader classLoader) {
        str.getClass();
        classLoader.getClass();
        this.packageName = str;
        this.classLoader = classLoader;
    }

    public static /* synthetic */ HotReloadHost copy$default(HotReloadHost hotReloadHost, String str, ClassLoader classLoader, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotReloadHost.packageName;
        }
        if ((i & 2) != 0) {
            classLoader = hotReloadHost.classLoader;
        }
        return hotReloadHost.copy(str, classLoader);
    }

    public final String component1() {
        return this.packageName;
    }

    public final ClassLoader component2() {
        return this.classLoader;
    }

    public final HotReloadHost copy(String str, ClassLoader classLoader) {
        str.getClass();
        classLoader.getClass();
        return new HotReloadHost(str, classLoader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotReloadHost)) {
            return false;
        }
        HotReloadHost hotReloadHost = (HotReloadHost) obj;
        return o51.f(this.packageName, hotReloadHost.packageName) && o51.f(this.classLoader, hotReloadHost.classLoader);
    }

    public final ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.classLoader.hashCode() + (this.packageName.hashCode() * 31);
    }

    public final Object[] save() {
        return new Object[]{this.packageName, this.classLoader};
    }

    public String toString() {
        return "HotReloadHost(packageName=" + this.packageName + ", classLoader=" + this.classLoader + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final HotReloadHost restore(Object obj) {
            Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
            if (objArr == null) {
                return null;
            }
            Object objX0 = yo.x0(objArr, 0);
            String str = objX0 instanceof String ? (String) objX0 : null;
            if (str == null) {
                return null;
            }
            Object objX1 = yo.x0(objArr, 1);
            ClassLoader classLoader = objX1 instanceof ClassLoader ? (ClassLoader) objX1 : null;
            if (classLoader == null || l13.k0(str)) {
                return null;
            }
            return new HotReloadHost(str, classLoader);
        }

        private Companion() {
        }
    }
}
