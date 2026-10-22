package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ks2 {
    public final es2 a;
    public final hx1 b;

    public ks2(js2 js2Var, f41 f41Var) {
        this.a = js2Var.d;
        List listJ = js2.j(4, js2Var);
        this.b = new hx1(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            js2 js2Var2 = (js2) listJ.get(i);
            if (f41Var.a(js2Var2.f)) {
                this.b.a(js2Var2.f);
            }
        }
    }
}
