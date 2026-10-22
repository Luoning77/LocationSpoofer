package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import defpackage.e01;
import defpackage.g01;
import defpackage.qw1;
import defpackage.rw1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;
    private final Map<Integer, String> clientNames = new LinkedHashMap();
    private final RemoteCallbackList<e01> callbackList = new rw1(this);
    private final g01 binder = new qw1(this);

    public final RemoteCallbackList<e01> getCallbackList$room_runtime() {
        return this.callbackList;
    }

    public final Map<Integer, String> getClientNames$room_runtime() {
        return this.clientNames;
    }

    public final int getMaxClientId$room_runtime() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        return this.binder;
    }

    public final void setMaxClientId$room_runtime(int i) {
        this.maxClientId = i;
    }
}
