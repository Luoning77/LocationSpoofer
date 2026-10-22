package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class m90 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ ul1 g;

    public /* synthetic */ m90(Context context, ul1 ul1Var) {
        this.e = 1;
        this.f = context;
        this.g = ul1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        ul1 ul1Var = this.g;
        mf3 mf3Var = mf3.a;
        Context context = this.f;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ig0.o(ul1Var, uri, new ImportExportSelection(true, false, false, false, false), new l90(context, 0));
                }
                break;
            case 1:
                ((r7) obj).getClass();
                if (Settings.canDrawOverlays(context)) {
                    on1.e(ul1Var, true);
                }
                break;
            case 2:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    i5 i5Var = new i5(context, 2);
                    ul1 ul1Var2 = this.g;
                    ul1Var2.getClass();
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var2), Dispatchers.getIO(), null, new o70(ul1Var2, uri2, new jl1(1, (Object) i5Var, (Object) ul1Var2, false), (q60) null, 2), 2, null);
                }
                break;
            default:
                CompleteLocation completeLocation = (CompleteLocation) obj;
                completeLocation.getClass();
                long id = completeLocation.getLocation().getId();
                l90 l90Var = new l90(context, 2);
                ul1 ul1Var3 = this.g;
                ul1Var3.getClass();
                BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var3), null, null, new zm1(ul1Var3, l90Var, id, null), 3, null);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ m90(ul1 ul1Var, Context context, int i) {
        this.e = i;
        this.g = ul1Var;
        this.f = context;
    }
}
