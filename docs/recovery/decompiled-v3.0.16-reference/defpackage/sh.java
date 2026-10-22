package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sh implements dd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sh(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.dd0
    public final void dispose() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((fy2) obj3).remove(obj2);
                ((ei) obj).c.k(obj2);
                break;
            case 1:
                ((xe1) obj3).b((or1) obj2);
                ((is1) obj).n(false);
                break;
            default:
                rl2 rl2Var = (rl2) obj3;
                wl2 wl2Var = (wl2) obj;
                if (rl2Var.f.k(obj2) == wl2Var) {
                    Map map = rl2Var.e;
                    Map mapC = wl2Var.c();
                    if (!mapC.isEmpty()) {
                        map.put(obj2, mapC);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
