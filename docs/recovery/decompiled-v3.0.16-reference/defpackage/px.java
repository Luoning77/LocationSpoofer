package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class px {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public px(String str) {
        this.a = str;
    }

    public static void a(px pxVar, String str, h71 h71Var) {
        if (!pxVar.c.add(str)) {
            StringBuilder sbQ = az2.q("Element with name '", str, "' is already registered in ");
            sbQ.append(pxVar.a);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        pxVar.b.add(str);
        pxVar.d.add(h71Var);
        pxVar.e.add(uj0.e);
        pxVar.f.add(false);
    }
}
