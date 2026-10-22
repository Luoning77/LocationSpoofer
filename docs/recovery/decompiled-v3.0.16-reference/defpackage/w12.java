package defpackage;

import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class w12 extends bv0 implements au0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w12(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    @Override // defpackage.au0
    public final Object invoke() throws Exception {
        int i = this.e;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((x12) this.receiver).e();
                return mf3Var;
            case 1:
                ((x12) this.receiver).e();
                return mf3Var;
            case 2:
                ((l6) this.receiver).b.dismissSignOutNotice();
                return mf3Var;
            case 3:
                ((l6) this.receiver).b.dismissRegistrationNotice();
                return mf3Var;
            case 4:
                ((l6) this.receiver).e();
                return mf3Var;
            case Logger.WARN /* 5 */:
                l6 l6Var = (l6) this.receiver;
                l6Var.getClass();
                l6Var.g(new e6(l6Var, q60Var, 6));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                l6 l6Var2 = (l6) this.receiver;
                l6Var2.getClass();
                l6Var2.g(new e6(l6Var2, q60Var, 4));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                l6 l6Var3 = (l6) this.receiver;
                l6Var3.getClass();
                l6Var3.g(new h6(l6Var3, q60Var, 1));
                return mf3Var;
            case 8:
                ii2.access$onClosed((ii2) this.receiver);
                return mf3Var;
            case mc0.b /* 9 */:
                on1.n((ul1) this.receiver);
                return mf3Var;
            case mc0.c /* 10 */:
                on1.m((ul1) this.receiver);
                return mf3Var;
            case 11:
                on1.l((ul1) this.receiver);
                return mf3Var;
            case mc0.d /* 12 */:
                on1.k((ul1) this.receiver);
                return mf3Var;
            case 13:
                ((RadioSharingManager) this.receiver).refresh();
                return mf3Var;
            case 14:
                ((AccountSyncManager) this.receiver).refresh();
                return mf3Var;
            default:
                return Long.valueOf(((AtomicLong) this.receiver).get());
        }
    }
}
