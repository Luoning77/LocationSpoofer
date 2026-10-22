package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zr0 implements s7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hs0 f;

    public /* synthetic */ zr0(hs0 hs0Var, int i) {
        this.e = i;
        this.f = hs0Var;
    }

    @Override // defpackage.s7
    public final void b(Object obj) {
        int i = this.e;
        hs0 hs0Var = this.f;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                ds0 ds0Var = (ds0) hs0Var.A.pollFirst();
                if (ds0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = ds0Var.e;
                    hs0Var.c.e();
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
                break;
            case 1:
                ds0 ds0Var2 = (ds0) hs0Var.A.pollLast();
                if (ds0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = ds0Var2.e;
                    hs0Var.c.e();
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                }
                break;
            default:
                ds0 ds0Var3 = (ds0) hs0Var.A.pollFirst();
                if (ds0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = ds0Var3.e;
                    hs0Var.c.e();
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                }
                break;
        }
    }
}
