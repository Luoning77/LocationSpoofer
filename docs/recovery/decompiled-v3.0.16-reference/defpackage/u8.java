package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u8 extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public void a(int i) {
        kv kvVar = (kv) this.b.get();
        if (kvVar != null) {
            if (i == 0) {
                boolean z = !kvVar.b && (hasMessages(3) || hasMessages(2));
                removeMessages(3);
                removeMessages(2);
                if (z) {
                    return;
                }
            }
            Message message = new Message();
            message.what = i;
            sendMessage(message);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                kv kvVar = (kv) this.b.get();
                if (kvVar != null) {
                    int i2 = message.what;
                    if (i2 == 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList = kvVar.d;
                        if (kvVar.b) {
                            kvVar.b = false;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                Iterator it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    ((kv) it.next()).c(kvVar.c);
                                }
                            }
                            break;
                        }
                    } else if (i2 == 1) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = kvVar.f;
                        if (!copyOnWriteArrayList2.isEmpty() && !kvVar.b) {
                            Iterator it2 = copyOnWriteArrayList2.iterator();
                            while (it2.hasNext()) {
                                ((hp1) it2.next()).a();
                            }
                            break;
                        }
                    } else if (i2 == 2) {
                        CopyOnWriteArrayList copyOnWriteArrayList3 = kvVar.e;
                        if (!copyOnWriteArrayList3.isEmpty() && !kvVar.b) {
                            Iterator it3 = copyOnWriteArrayList3.iterator();
                            while (it3.hasNext()) {
                                ((kv) it3.next()).a.a(2);
                            }
                            break;
                        }
                    } else if (i2 == 3) {
                        CopyOnWriteArrayList copyOnWriteArrayList4 = kvVar.g;
                        if (!kvVar.b) {
                            kvVar.b = true;
                            if (!copyOnWriteArrayList4.isEmpty()) {
                                Iterator it4 = copyOnWriteArrayList4.iterator();
                                while (it4.hasNext()) {
                                    ((gp1) it4.next()).b();
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
