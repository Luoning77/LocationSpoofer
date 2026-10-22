package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class f8 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a8 a8Var = (a8) this.e.get(str);
        if ((a8Var != null ? a8Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                a8Var.a.b(a8Var.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new r7(intent, i2));
        return true;
    }

    public abstract void b(int i, u7 u7Var, Object obj);

    public final e8 c(String str, u7 u7Var, s7 s7Var) {
        str.getClass();
        d(str);
        this.e.put(str, new a8(u7Var, s7Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            s7Var.b(obj);
        }
        Bundle bundle = this.g;
        r7 r7Var = (r7) sb.U(str, bundle);
        if (r7Var != null) {
            bundle.remove(str);
            s7Var.b(u7Var.c(r7Var.f, r7Var.e));
        }
        return new e8(this, str, u7Var);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new k50(new wv0(0, c8.g, new ym2(15)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        b81.y("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbQ = az2.q("Dropping pending result for request ", str, ": ");
            sbQ.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbQ.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((r7) sb.U(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b8 b8Var = (b8) linkedHashMap2.get(str);
        if (b8Var != null) {
            ArrayList arrayList = b8Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b8Var.a.b((bf1) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
