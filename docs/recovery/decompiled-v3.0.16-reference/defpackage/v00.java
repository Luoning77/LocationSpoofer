package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class v00 implements pm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pm2
    public final Bundle a() {
        ArrayList arrayList;
        dq[] dqVarArr;
        i52[] i52VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ComponentActivity._init_$lambda$4((ComponentActivity) obj);
            case 1:
                Map mapC = ((ul2) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapC.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                return ((FragmentActivity) obj).lambda$init$0();
            case 3:
                hs0 hs0Var = (hs0) obj;
                Bundle bundle2 = new Bundle();
                Iterator it = hs0Var.b().iterator();
                while (it.hasNext()) {
                    ((bz2) it.next()).getClass();
                }
                hs0Var.e();
                hs0Var.h(true);
                hs0Var.B = true;
                hs0Var.H.getClass();
                mn2 mn2Var = hs0Var.c;
                mn2Var.getClass();
                HashMap map = (HashMap) mn2Var.f;
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        b81.u();
                        return null;
                    }
                }
                HashMap map2 = (HashMap) hs0Var.c.g;
                if (map2.isEmpty()) {
                    if (!gs0.l(2)) {
                        return bundle2;
                    }
                    Log.v("FragmentManager", "saveAllState: no fragments!");
                    return bundle2;
                }
                mn2 mn2Var2 = hs0Var.c;
                synchronized (((ArrayList) mn2Var2.e)) {
                    try {
                        if (((ArrayList) mn2Var2.e).isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(((ArrayList) mn2Var2.e).size());
                            Iterator it3 = ((ArrayList) mn2Var2.e).iterator();
                            if (it3.hasNext()) {
                                if (it3.next() == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int size = hs0Var.d.size();
                if (size > 0) {
                    dqVarArr = new dq[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        dqVarArr[i2] = new dq((cq) hs0Var.d.get(i2));
                        if (gs0.l(2)) {
                            StringBuilder sbR = p91.r(i2, "saveAllState: adding back stack #", ": ");
                            sbR.append(hs0Var.d.get(i2));
                            Log.v("FragmentManager", sbR.toString());
                        }
                    }
                } else {
                    dqVarArr = null;
                }
                is0 is0Var = new is0();
                is0Var.i = null;
                ArrayList arrayList3 = new ArrayList();
                is0Var.j = arrayList3;
                ArrayList arrayList4 = new ArrayList();
                is0Var.k = arrayList4;
                is0Var.e = arrayList2;
                is0Var.f = arrayList;
                is0Var.g = dqVarArr;
                is0Var.h = hs0Var.j.get();
                arrayList3.addAll(hs0Var.k.keySet());
                arrayList4.addAll(hs0Var.k.values());
                is0Var.l = new ArrayList(hs0Var.A);
                bundle2.putParcelable("state", is0Var);
                for (String str2 : hs0Var.l.keySet()) {
                    bundle2.putBundle(az2.j("result_", str2), (Bundle) hs0Var.l.get(str2));
                }
                for (String str3 : map2.keySet()) {
                    bundle2.putBundle(az2.j("fragment_", str3), (Bundle) map2.get(str3));
                }
                return bundle2;
            default:
                xp xpVar = (xp) obj;
                for (Map.Entry entry2 : jq1.R((LinkedHashMap) xpVar.d).entrySet()) {
                    xpVar.q(((MutableStateFlow) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : jq1.R((LinkedHashMap) xpVar.b).entrySet()) {
                    xpVar.q(((pm2) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) xpVar.a;
                if (linkedHashMap.isEmpty()) {
                    i52VarArr = new i52[0];
                } else {
                    ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList5.add(new i52((String) entry4.getKey(), entry4.getValue()));
                    }
                    i52VarArr = (i52[]) arrayList5.toArray(new i52[0]);
                }
                return ks.J((i52[]) Arrays.copyOf(i52VarArr, i52VarArr.length));
        }
    }
}
