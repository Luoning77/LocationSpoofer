package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class si1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ lr2 g;
    public final /* synthetic */ Context h;

    public /* synthetic */ si1(int i, ul1 ul1Var, lr2 lr2Var, Context context) {
        this.e = i;
        this.f = ul1Var;
        this.g = lr2Var;
        this.h = context;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        String strL;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Context context = this.h;
        lr2 lr2Var = this.g;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                CompleteLocation completeLocation = (CompleteLocation) obj;
                completeLocation.getClass();
                double lat = completeLocation.getLocation().getLat();
                double lng = completeLocation.getLocation().getLng();
                rm1.i(ul1Var, completeLocation.getLocation().getId());
                if (lr2Var != null) {
                    lr2Var.d(lat, lng, Float.valueOf(17.5f));
                }
                if (!l13.k0(completeLocation.getLocation().getRemark())) {
                    strL = completeLocation.getLocation().getRemark();
                } else if (l13.k0(completeLocation.getLocation().getPlaceName())) {
                    Locale locale = Locale.US;
                    strL = az2.l("(", String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(lat)}, 1)), ", ", String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(lng)}, 1)), ")");
                } else {
                    strL = completeLocation.getLocation().getPlaceName();
                }
                Toast.makeText(context, context.getString(2131624817, strL), 0).show();
                break;
            default:
                SavedLocation savedLocation = (SavedLocation) obj;
                savedLocation.getClass();
                an1.c(ul1Var, savedLocation);
                if (lr2Var != null) {
                    lr2Var.d(savedLocation.getLat(), savedLocation.getLng(), Float.valueOf(17.5f));
                }
                Toast.makeText(context, context.getString(2131624588, savedLocation.getName()), 0).show();
                break;
        }
        return mf3Var;
    }
}
