package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ns2 extends aa1 implements pu0 {
    public static final ns2 g;
    public static final ns2 h;
    public static final ns2 i;
    public static final ns2 j;
    public static final ns2 k;
    public static final ns2 l;
    public static final ns2 m;
    public static final ns2 n;
    public static final ns2 o;
    public static final ns2 p;
    public final /* synthetic */ int f;

    static {
        int i2 = 2;
        g = new ns2(i2, 0);
        h = new ns2(i2, 1);
        i = new ns2(i2, 2);
        j = new ns2(i2, 3);
        k = new ns2(i2, 4);
        l = new ns2(i2, 5);
        m = new ns2(i2, 6);
        n = new ns2(i2, 7);
        o = new ns2(i2, 8);
        p = new ns2(i2, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns2(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        String str;
        xu0 xu0Var;
        switch (this.f) {
            case 0:
                vh2 vh2Var = (vh2) obj;
                int i2 = ((vh2) obj2).a;
                return vh2Var;
            case 1:
                return (au2) obj;
            case 2:
                return (String) obj;
            case 3:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 4:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case Logger.WARN /* 5 */:
                return (String) obj;
            case Logger.ERROR /* 6 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                z0 z0Var = (z0) obj;
                z0 z0Var2 = (z0) obj2;
                if (z0Var == null || (str = z0Var.a) == null) {
                    str = z0Var2.a;
                }
                if (z0Var == null || (xu0Var = z0Var.b) == null) {
                    xu0Var = z0Var2.b;
                }
                return new z0(str, xu0Var);
            case 8:
                return obj == null ? obj2 : obj;
            default:
                js2 js2Var = (js2) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                es2 es2Var = ((js2) obj).d;
                rs2 rs2Var = os2.u;
                Object objG = es2Var.e.g(rs2Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = js2Var.d.e.g(rs2Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
