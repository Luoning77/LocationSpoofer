package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kc extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc(int i, ArrayList arrayList) {
        super(1);
        this.f = i;
        this.g = arrayList;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        ArrayList arrayList = this.g;
        switch (i) {
            case 0:
                g82 g82Var = (g82) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g82.B(g82Var, (h82) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                g82 g82Var2 = (g82) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        g82.B(g82Var2, (h82) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                g82 g82Var3 = (g82) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    g82.z(g82Var3, (h82) arrayList.get(i4), 0, 0);
                }
                break;
            default:
                g82 g82Var4 = (g82) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    g82.C(g82Var4, (h82) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return mf3Var;
    }
}
