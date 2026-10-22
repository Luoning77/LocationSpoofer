package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ri0 extends gh0 {
    public final /* synthetic */ si0 i;

    public ri0(si0 si0Var) {
        this.i = si0Var;
    }

    @Override // defpackage.gh0
    public final void I(Throwable th) {
        this.i.a.f(th);
    }

    @Override // defpackage.gh0
    public final void J(mn2 mn2Var) {
        si0 si0Var = this.i;
        si0Var.c = mn2Var;
        mn2 mn2Var2 = si0Var.c;
        wi0 wi0Var = si0Var.a;
        c30 c30Var = wi0Var.g;
        ma0 ma0Var = wi0Var.i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? cj0.a() : mh0.H();
        gn gnVar = new gn();
        gnVar.a = c30Var;
        gnVar.b = mn2Var2;
        gnVar.c = ma0Var;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                gnVar.z(str, 0, str.length(), 1, true, new n50(str, 2));
            }
        }
        si0Var.b = gnVar;
        wi0 wi0Var2 = si0Var.a;
        ArrayList arrayList = new ArrayList();
        wi0Var2.a.writeLock().lock();
        try {
            wi0Var2.c = 1;
            arrayList.addAll(wi0Var2.b);
            wi0Var2.b.clear();
            wi0Var2.a.writeLock().unlock();
            wi0Var2.d.post(new ui0(arrayList, wi0Var2.c, null));
        } catch (Throwable th) {
            wi0Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
