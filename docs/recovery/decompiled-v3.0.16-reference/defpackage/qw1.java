package defpackage;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qw1 extends g01 {
    public final /* synthetic */ MultiInstanceInvalidationService f;

    public qw1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f = multiInstanceInvalidationService;
        attachInterface(this, h01.b);
    }

    @Override // defpackage.h01
    public final int b(e01 e01Var, String str) {
        e01Var.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        RemoteCallbackList<e01> callbackList$room_runtime = this.f.getCallbackList$room_runtime();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f;
        synchronized (callbackList$room_runtime) {
            try {
                multiInstanceInvalidationService.setMaxClientId$room_runtime(multiInstanceInvalidationService.getMaxClientId$room_runtime() + 1);
                int maxClientId$room_runtime = multiInstanceInvalidationService.getMaxClientId$room_runtime();
                if (multiInstanceInvalidationService.getCallbackList$room_runtime().register(e01Var, Integer.valueOf(maxClientId$room_runtime))) {
                    multiInstanceInvalidationService.getClientNames$room_runtime().put(Integer.valueOf(maxClientId$room_runtime), str);
                    i = maxClientId$room_runtime;
                } else {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime(multiInstanceInvalidationService.getMaxClientId$room_runtime() - 1);
                    multiInstanceInvalidationService.getMaxClientId$room_runtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // defpackage.h01
    public final void c(e01 e01Var, int i) {
        e01Var.getClass();
        RemoteCallbackList<e01> callbackList$room_runtime = this.f.getCallbackList$room_runtime();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f;
        synchronized (callbackList$room_runtime) {
            multiInstanceInvalidationService.getCallbackList$room_runtime().unregister(e01Var);
            multiInstanceInvalidationService.getClientNames$room_runtime().remove(Integer.valueOf(i));
        }
    }

    @Override // defpackage.h01
    public final void d(String[] strArr, int i) {
        strArr.getClass();
        RemoteCallbackList<e01> callbackList$room_runtime = this.f.getCallbackList$room_runtime();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f;
        synchronized (callbackList$room_runtime) {
            try {
                String str = multiInstanceInvalidationService.getClientNames$room_runtime().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime().beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime().getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.getClientNames$room_runtime().get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((e01) multiInstanceInvalidationService.getCallbackList$room_runtime().getBroadcastItem(i2)).a(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.getCallbackList$room_runtime().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime().finishBroadcast();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
