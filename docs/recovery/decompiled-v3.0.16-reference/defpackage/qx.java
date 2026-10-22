package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qx {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public qx(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            ve1 ve1Var = (ve1) entry.getValue();
            List arrayList = (List) this.a.get(ve1Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(ve1Var, arrayList);
            }
            arrayList.add((rx) entry.getKey());
        }
    }

    public static void a(List list, df1 df1Var, ve1 ve1Var, cf1 cf1Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                rx rxVar = (rx) list.get(size);
                Method method = rxVar.b;
                try {
                    int i = rxVar.a;
                    if (i == 0) {
                        method.invoke(cf1Var, null);
                    } else if (i == 1) {
                        method.invoke(cf1Var, df1Var);
                    } else if (i == 2) {
                        method.invoke(cf1Var, df1Var, ve1Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
