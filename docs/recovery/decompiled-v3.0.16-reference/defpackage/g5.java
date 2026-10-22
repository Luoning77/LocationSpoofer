package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class g5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ g5(ul1 ul1Var, List list, Context context, au0 au0Var, ey1 ey1Var) {
        this.e = 2;
        this.f = ul1Var;
        this.h = list;
        this.i = context;
        this.j = au0Var;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.g;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                l6 l6Var = (l6) obj5;
                String str = (String) ((ey1) obj).getValue();
                String str2 = (String) ((ey1) obj4).getValue();
                String str3 = (String) ((ey1) obj3).getValue();
                if (!((Boolean) ((ey1) obj2).getValue()).booleanValue()) {
                    str3 = null;
                }
                String str4 = str3;
                str.getClass();
                str2.getClass();
                l6Var.g(new k6(l6Var, str, str2, str4, false, null));
                return mf3Var;
            case 1:
                return EncryptedCloudSessionStore.sign$lambda$33((ue2) obj5, (we2) obj, (we2) obj4, (EncryptedCloudSessionStore) obj3, (String) obj2);
            default:
                ul1 ul1Var = (ul1) obj5;
                List list = (List) obj4;
                Context context = (Context) obj3;
                au0 au0Var = (au0) obj2;
                ey1 ey1Var = (ey1) obj;
                if (!l13.k0((String) ey1Var.getValue())) {
                    String str5 = (String) ey1Var.getValue();
                    ul1Var.getClass();
                    str5.getClass();
                    list.getClass();
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new m(ul1Var, str5, list, null, 17), 2, null);
                    Toast.makeText(context, context.getString(2131624942), 0).show();
                    au0Var.invoke();
                }
                return mf3Var;
        }
    }

    public /* synthetic */ g5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }
}
