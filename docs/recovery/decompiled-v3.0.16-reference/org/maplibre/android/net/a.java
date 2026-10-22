package org.maplibre.android.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import defpackage.a50;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a extends BroadcastReceiver {
    public static a e;
    public CopyOnWriteArrayList a;
    public Context b;
    public int c;
    public Boolean d;

    public static synchronized a a(Context context) {
        try {
            if (e == null) {
                Context applicationContext = context.getApplicationContext();
                a aVar = new a();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                aVar.a = copyOnWriteArrayList;
                aVar.b = applicationContext;
                e = aVar;
                NativeConnectivityListener nativeConnectivityListener = new NativeConnectivityListener();
                nativeConnectivityListener.initialize();
                copyOnWriteArrayList.add(nativeConnectivityListener);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void c(boolean z) {
        Logger.v("Mbgl-ConnectivityReceiver", z ? "connected - true" : "connected - false");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((NativeConnectivityListener) ((a50) it.next())).nativeOnConnectivityStateChanged(z);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.d != null) {
            return;
        }
        c(b());
    }
}
