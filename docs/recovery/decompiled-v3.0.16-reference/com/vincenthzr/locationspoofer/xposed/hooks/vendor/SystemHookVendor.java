package com.vincenthzr.locationspoofer.xposed.hooks.vendor;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import defpackage.di3;
import defpackage.uj0;
import defpackage.wh2;
import defpackage.zj0;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface SystemHookVendor {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        @Deprecated
        public static Set<String> additionalExemptPackages(SystemHookVendor systemHookVendor) {
            return SystemHookVendor.super.additionalExemptPackages();
        }

        @Deprecated
        public static List<String> classCandidates(SystemHookVendor systemHookVendor, SystemComponent systemComponent) {
            systemComponent.getClass();
            return SystemHookVendor.super.classCandidates(systemComponent);
        }

        @Deprecated
        public static void installExtraHooks(SystemHookVendor systemHookVendor, LocationHooker locationHooker, ClassLoader classLoader) {
            locationHooker.getClass();
            classLoader.getClass();
            SystemHookVendor.super.installExtraHooks(locationHooker, classLoader);
        }
    }

    default Set<String> additionalExemptPackages() {
        return zj0.e;
    }

    default List<String> classCandidates(SystemComponent systemComponent) {
        systemComponent.getClass();
        return uj0.e;
    }

    wh2 getFamily();

    String getId();

    int getPriority();

    default void installExtraHooks(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
    }

    boolean matches(di3 di3Var);
}
