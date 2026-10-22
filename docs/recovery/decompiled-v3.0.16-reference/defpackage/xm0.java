package defpackage;

import android.content.Context;
import android.net.Uri;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xm0 implements lu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ ey1 h;

    public /* synthetic */ xm0(ul1 ul1Var, ey1 ey1Var, Context context) {
        this.f = ul1Var;
        this.h = ey1Var;
        this.g = context;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.h;
        Context context = this.g;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ig0.o(this.f, uri, (ImportExportSelection) ey1Var.getValue(), new l90(context, 1));
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    k90 k90Var = new k90(context, ey1Var, 1);
                    ul1 ul1Var = this.f;
                    ul1Var.getClass();
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new o70(ul1Var, uri2, k90Var, (q60) null, 2), 2, null);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ xm0(ul1 ul1Var, Context context, ey1 ey1Var) {
        this.f = ul1Var;
        this.g = context;
        this.h = ey1Var;
    }
}
