package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class na3 {
    public static final ma3 a;
    public static final ArrayList b;
    public static volatile ma3[] c;

    static {
        ma3 ma3Var = new ma3();
        new ThreadLocal();
        a = ma3Var;
        b = new ArrayList();
        c = new ma3[0];
    }

    public static final void a(ma3... ma3VarArr) {
        ma3 ma3Var = a;
        ma3Var.getClass();
        int length = ma3VarArr.length;
        int i = 0;
        while (i < length) {
            ma3 ma3Var2 = ma3VarArr[i];
            i++;
            if (ma3Var2 == null) {
                fo.i("trees contained null");
                return;
            } else if (ma3Var2 == ma3Var) {
                fo.i("Cannot plant Timber into itself.");
                return;
            }
        }
        ArrayList arrayList = b;
        synchronized (arrayList) {
            Collections.addAll(arrayList, Arrays.copyOf(ma3VarArr, ma3VarArr.length));
            Object[] array = arrayList.toArray(new ma3[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            c = (ma3[]) array;
        }
    }
}
