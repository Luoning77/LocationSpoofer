package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fs0 implements es0 {
    public final /* synthetic */ gs0 a;

    public fs0(gs0 gs0Var) {
        this.a = gs0Var;
    }

    @Override // defpackage.es0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zN;
        gs0 gs0Var = this.a;
        ArrayList arrayList3 = gs0Var.m;
        if (gs0.l(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + gs0Var.a);
        }
        if (gs0Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zN = false;
        } else {
            ArrayList arrayList4 = gs0Var.d;
            cq cqVar = (cq) arrayList4.get(arrayList4.size() - 1);
            gs0Var.g = cqVar;
            ArrayList arrayList5 = cqVar.a;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                ((ms0) obj).getClass();
            }
            zN = gs0Var.n(arrayList, arrayList2);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(gs0.k((cq) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 != null) {
                    b81.u();
                    return false;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw az2.g(it);
                }
            }
        }
        return zN;
    }
}
