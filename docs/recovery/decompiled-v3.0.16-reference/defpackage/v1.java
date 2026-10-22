package defpackage;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import com.vincenthzr.locationspoofer.data.cloud.CloudClientContent;
import com.vincenthzr.locationspoofer.data.cloud.CloudDiagnosticDetails;
import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import com.vincenthzr.locationspoofer.data.cloud.RewardDevice;
import com.vincenthzr.locationspoofer.data.cloud.RewardEntry;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class v1 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ v1(int i) {
        this.e = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return mf3Var;
            case 1:
                return mf3Var;
            case 2:
                CloudArchive cloudArchive = (CloudArchive) obj;
                cloudArchive.getClass();
                return cloudArchive.getId();
            case 3:
                i52 i52Var = (i52) obj;
                i52Var.getClass();
                return i52Var.e + "|" + ((Map.Entry) i52Var.f).getKey();
            case 4:
                RewardDevice rewardDevice = (RewardDevice) obj;
                rewardDevice.getClass();
                return rewardDevice.getId();
            case Logger.WARN /* 5 */:
                RewardCoupon rewardCoupon = (RewardCoupon) obj;
                rewardCoupon.getClass();
                return rewardCoupon.getId();
            case Logger.ERROR /* 6 */:
                RewardEntry rewardEntry = (RewardEntry) obj;
                rewardEntry.getClass();
                return rewardEntry.getId();
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return AccountSyncManager.file$lambda$0(((Byte) obj).byteValue());
            case 8:
                return AccountSyncManager.json$lambda$1((y61) obj);
            case mc0.b /* 9 */:
                ((ss2) obj).getClass();
                return mf3Var;
            case mc0.c /* 10 */:
                ag0 ag0Var = (ag0) obj;
                ag0Var.getClass();
                r93.f(ag0Var);
                float f = ag0Var.e;
                k22.l(ag0Var, f * 6.0f, f * 6.0f);
                float f2 = ag0Var.e;
                ke0.F(ag0Var, f2 * 24.0f, f2 * 24.0f, false, 0.0f);
                return mf3Var;
            case 11:
                ag0 ag0Var2 = (ag0) obj;
                ag0Var2.getClass();
                r93.f(ag0Var2);
                float f3 = ag0Var2.e;
                k22.l(ag0Var2, f3 * 6.0f, f3 * 6.0f);
                float f4 = ag0Var2.e;
                ke0.F(ag0Var2, f4 * 24.0f, f4 * 24.0f, false, 0.0f);
                return mf3Var;
            case mc0.d /* 12 */:
                ((Long) obj).getClass();
                return mf3Var;
            case 13:
                return Boolean.valueOf(!(((zi) obj) instanceof p52));
            case 14:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            case a83.e /* 15 */:
                AppInfoItem appInfoItem = (AppInfoItem) obj;
                appInfoItem.getClass();
                return appInfoItem.getPackageName();
            case 16:
                return mf3Var;
            case 17:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 18:
                ((jb1) obj).c();
                return mf3Var;
            case 19:
                return mf3Var;
            case 20:
                return mf3Var;
            case 21:
                l72 l72Var = (l72) obj;
                hh0 hh0Var = AndroidCompositionLocals_androidKt.b;
                l72Var.getClass();
                if (((Context) ji2.P(l72Var, hh0Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return qt.b;
                }
                ot.a.getClass();
                return nt.c;
            case 22:
                qs2.c((ss2) obj, 0);
                return mf3Var;
            case 23:
                ss2 ss2Var = (ss2) obj;
                ss2Var.getClass();
                qs2.f(ss2Var);
                return mf3Var;
            case 24:
                return mf3Var;
            case 25:
                ((tc3) obj).getClass();
                throw new ClassCastException();
            case 26:
                ((tc3) obj).getClass();
                throw new ClassCastException();
            case 27:
                qs2.c((ss2) obj, 1);
                return mf3Var;
            case 28:
                return CloudClientContent.Companion.digest$lambda$8(((Byte) obj).byteValue());
            default:
                return CloudDiagnosticDetails.Companion.captureCauses$lambda$2((StackTraceElement) obj);
        }
    }
}
