package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fx0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fx0(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.e = 1;
        this.f = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                HandlerDispatcherKt.postFrameCallback$lambda$5((CancellableContinuation) obj, j);
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new lk((Context) obj, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ fx0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
