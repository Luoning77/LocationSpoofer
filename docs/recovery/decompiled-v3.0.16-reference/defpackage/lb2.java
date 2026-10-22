package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lb2 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ mb2 f;

    public lb2(mb2 mb2Var, List list) {
        this.f = mb2Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            s21.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
