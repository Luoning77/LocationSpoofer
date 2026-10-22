package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xk2 implements wk2 {
    public final Object e = new Object();
    public final LinkedHashMap f = new LinkedHashMap();

    @Override // defpackage.wk2
    public final pf c(String str, String str2) {
        pf pfVar;
        str.getClass();
        str2.getClass();
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.f;
                Object objA = linkedHashMap.get(str);
                if (objA == null) {
                    objA = q1.a(str2);
                    linkedHashMap.put(str, objA);
                }
                pfVar = (pf) objA;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pfVar;
    }
}
