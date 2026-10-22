package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class k90 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ k90(Context context, ey1 ey1Var, int i) {
        this.e = i;
        this.f = context;
        this.g = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        Context context = this.f;
        switch (i) {
            case 0:
                ((Map) obj).getClass();
                mg1 mg1VarX = k22.x();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = mg1VarX.listIterator(0);
                while (true) {
                    xx0 xx0Var = (xx0) listIterator;
                    if (!xx0Var.hasNext()) {
                        ey1Var.setValue(arrayList);
                        break;
                    } else {
                        Object next = xx0Var.next();
                        if (zm3.k(context, (String) next) != 0) {
                            arrayList.add(next);
                        }
                    }
                }
                break;
            default:
                LocationSpooferDataPackage locationSpooferDataPackage = (LocationSpooferDataPackage) obj;
                if (locationSpooferDataPackage != null) {
                    ey1Var.setValue(locationSpooferDataPackage);
                } else {
                    Toast.makeText(context, context.getString(2131624555), 0).show();
                }
                break;
        }
        return mf3Var;
    }
}
