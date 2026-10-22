package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ya0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ya0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [g91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [sx1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sx1] */
    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                lb3 lb3Var = ((xv2) obj).i;
                return new hz(xp1.F(lb3Var.a, lb3Var.b, lh0.b.b(0.0f)));
            default:
                ArrayList arrayList = ((rv0) obj).a;
                zx1 zx1Var = new zx1(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r4 = (g91) arrayList.get(i2);
                    Object obj2 = r4.b;
                    int i3 = r4.a;
                    Object r61Var = obj2 != null ? new r61(Integer.valueOf(i3), r4.b) : Integer.valueOf(i3);
                    int iF = zx1Var.f(r61Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : zx1Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof sx1) {
                            ?? r8 = (sx1) obj3;
                            r8.a(r4);
                            r4 = r8;
                        } else {
                            Object[] objArr = s02.a;
                            ?? sx1Var = new sx1(2);
                            sx1Var.a(obj3);
                            sx1Var.a(r4);
                            r4 = sx1Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        zx1Var.b[i4] = r61Var;
                        zx1Var.c[i4] = r4;
                    } else {
                        zx1Var.c[iF] = r4;
                    }
                }
                return new ax1(zx1Var);
        }
    }
}
