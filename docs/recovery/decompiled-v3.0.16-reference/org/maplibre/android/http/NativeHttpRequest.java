package org.maplibre.android.http;

import android.content.res.AssetManager;
import defpackage.dh0;
import defpackage.dv;
import defpackage.fp1;
import defpackage.k91;
import defpackage.ld0;
import defpackage.mh1;
import defpackage.nx0;
import defpackage.vz0;
import defpackage.wz0;
import defpackage.xp;
import defpackage.xz0;
import defpackage.yf2;
import defpackage.yz0;
import defpackage.zz0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class NativeHttpRequest {
    private final vz0 httpRequest;
    private final ReentrantLock lock;
    private long nativePtr;

    private NativeHttpRequest(long j, String str, String str2, String str3, String str4, boolean z) {
        ((k91) MapLibre.getModuleProvider()).getClass();
        xz0 xz0Var = new xz0();
        this.httpRequest = xz0Var;
        this.lock = new ReentrantLock();
        this.nativePtr = j;
        if (str.startsWith("local://")) {
            executeLocalRequest(str);
            return;
        }
        wz0 wz0Var = new wz0();
        wz0Var.a = this;
        zz0 zz0VarA = null;
        try {
            try {
                yz0 yz0Var = new yz0();
                yz0Var.f(null, str);
                zz0VarA = yz0Var.a();
            } catch (IllegalArgumentException unused) {
            }
            if (zz0VarA == null) {
                dh0.w(6, "[HTTP] Unable to parse resourceUrl ".concat(str));
                return;
            }
            String str5 = zz0VarA.d;
            Locale locale = fp1.a;
            String lowerCase = str5.toLowerCase(locale);
            List list = zz0VarA.f;
            int size = list != null ? list.size() / 2 : 0;
            if (lowerCase.equals("mapbox.com") || lowerCase.endsWith(".mapbox.com") || lowerCase.equals("mapbox.cn") || lowerCase.endsWith(".mapbox.cn")) {
                str = size == 0 ? str.concat("?") : str.concat("&");
                if (z) {
                    str = str.concat("offline=true");
                }
            }
            xp xpVar = new xp(4);
            xpVar.r(str);
            String lowerCase2 = str.toLowerCase(locale);
            LinkedHashMap linkedHashMap = (LinkedHashMap) xpVar.e;
            if (lowerCase2 == null) {
                linkedHashMap.remove(Object.class);
            } else {
                if (linkedHashMap.isEmpty()) {
                    xpVar.e = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) xpVar.e;
                Object objCast = Object.class.cast(lowerCase2);
                objCast.getClass();
                linkedHashMap2.put(Object.class, objCast);
            }
            String str6 = xz0.b;
            str6.getClass();
            nx0 nx0Var = (nx0) xpVar.c;
            nx0Var.getClass();
            ld0.m("User-Agent");
            ld0.n(str6, "User-Agent");
            nx0Var.a("User-Agent", str6);
            if (str2.length() > 0) {
                nx0 nx0Var2 = (nx0) xpVar.c;
                nx0Var2.getClass();
                ld0.m("Range");
                ld0.n(str2, "Range");
                nx0Var2.a("Range", str2);
            }
            if (str3.length() > 0) {
                nx0 nx0Var3 = (nx0) xpVar.c;
                nx0Var3.getClass();
                ld0.m("If-None-Match");
                ld0.n(str3, "If-None-Match");
                nx0Var3.a("If-None-Match", str3);
            } else if (str4.length() > 0) {
                nx0 nx0Var4 = (nx0) xpVar.c;
                nx0Var4.getClass();
                ld0.m("If-Modified-Since");
                ld0.n(str4, "If-Modified-Since");
                nx0Var4.a("If-Modified-Since", str4);
            }
            yf2 yf2VarF = xpVar.f();
            if (xz0.d == null) {
                synchronized (xz0.class) {
                    try {
                        if (xz0.d == null) {
                            xz0.d = xz0.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            dv dvVarNewCall = xz0.d.newCall(yf2VarF);
            xz0Var.a = dvVarNewCall;
            dvVarNewCall.enqueue(wz0Var);
        } catch (Exception e) {
            wz0Var.a(xz0Var.a, e);
        }
    }

    private void executeLocalRequest(String str) {
        AssetManager assets = MapLibre.getApplicationContext().getAssets();
        wz0 wz0Var = new wz0();
        wz0Var.a = this;
        new mh1(assets, wz0Var).execute(str);
    }

    private native void nativeOnFailure(int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public void cancel() {
        xz0 xz0Var = (xz0) this.httpRequest;
        dv dvVar = xz0Var.a;
        if (dvVar != null) {
            dh0.w(3, "[HTTP] This request was cancelled (" + dvVar.request().a + "). This is expected for tiles that were being prefetched but are no longer needed for the map to render.");
            xz0Var.a.cancel();
        }
        this.lock.lock();
        this.nativePtr = 0L;
        this.lock.unlock();
    }

    public void handleFailure(int i, String str) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnFailure(i, str);
        }
        this.lock.unlock();
    }

    public void onResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnResponse(i, str, str2, str3, str4, str5, str6, bArr);
        }
        this.lock.unlock();
    }
}
