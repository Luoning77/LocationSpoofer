package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yf0 {
    public kw0 a;
    public final ArrayList b = new ArrayList();
    public int c = 1;
    public final s52 d = new s52(0.0f);
    public int e = 1;
    public final String[] f = {"", ""};
    public final int[] g = {-1, -1};
    public final int[] h = {-1, -1};
    public final t20[] i = new t20[2];
    public final /* synthetic */ cg0 j;

    public yf0(cg0 cg0Var) {
        this.j = cg0Var;
    }

    public final void a() {
        if (this.a == null) {
            this.a = xp1.M(this.j).b();
        }
    }

    public final kw0 b(int i) {
        iw0 iw0VarM = xp1.M(this.j);
        while (true) {
            ArrayList arrayList = this.b;
            if (arrayList.size() > i) {
                return (kw0) arrayList.get(i);
            }
            arrayList.add(iw0VarM.b());
        }
    }

    public final void c() {
        iw0 iw0VarM = xp1.M(this.j);
        kw0 kw0Var = this.a;
        if (kw0Var != null) {
            iw0VarM.a(kw0Var);
        }
        this.a = null;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iw0VarM.a((kw0) obj);
        }
        arrayList.clear();
        t20[] t20VarArr = this.i;
        yo.s0(0, t20VarArr.length, null, t20VarArr);
        String[] strArr = this.f;
        yo.s0(0, strArr.length, "", strArr);
        int[] iArr = this.g;
        Arrays.fill(iArr, 0, iArr.length, -1);
        int[] iArr2 = this.h;
        Arrays.fill(iArr2, 0, iArr2.length, -1);
    }
}
