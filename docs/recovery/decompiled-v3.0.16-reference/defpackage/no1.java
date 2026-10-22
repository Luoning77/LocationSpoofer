package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class no1 extends x7 {
    public final y7 a;

    public no1(y7 y7Var) {
        this.a = y7Var;
    }

    public final void a(Object obj) {
        mf3 mf3Var;
        e8 e8Var = this.a.a;
        if (e8Var != null) {
            f8 f8Var = e8Var.a;
            ArrayList arrayList = f8Var.d;
            LinkedHashMap linkedHashMap = f8Var.b;
            String str = e8Var.b;
            Object obj2 = linkedHashMap.get(str);
            u7 u7Var = e8Var.c;
            if (obj2 == null) {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + u7Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
            int iIntValue = ((Number) obj2).intValue();
            arrayList.add(str);
            try {
                f8Var.b(iIntValue, u7Var, obj);
                mf3Var = mf3.a;
            } catch (Exception e) {
                arrayList.remove(str);
                throw e;
            }
        } else {
            mf3Var = null;
        }
        if (mf3Var != null) {
            return;
        }
        fo.n("Launcher has not been initialized");
    }
}
