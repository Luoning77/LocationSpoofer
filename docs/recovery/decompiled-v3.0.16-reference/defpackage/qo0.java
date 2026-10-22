package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qo0 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu0 f;

    public /* synthetic */ qo0(int i, pu0 pu0Var) {
        this.e = i;
        this.f = pu0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        tl2 tl2Var;
        int i = this.e;
        pu0 pu0Var = this.f;
        switch (i) {
            case 0:
                x92 x92Var = (x92) obj;
                c12 c12Var = (c12) obj2;
                x92Var.getClass();
                x92Var.a();
                pu0Var.invoke(Float.valueOf(Float.intBitsToFloat((int) (c12Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c12Var.a & 4294967295L))));
                return mf3.a;
            default:
                pl2 pl2Var = (pl2) obj;
                List list = (List) pu0Var.invoke(pl2Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (tl2Var = pl2Var.f) != null && !tl2Var.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
        }
    }
}
